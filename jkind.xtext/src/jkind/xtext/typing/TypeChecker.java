package jkind.xtext.typing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.Assertion;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.BoolType;
import jkind.xtext.jkind.CastExpr;
import jkind.xtext.jkind.CondactExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Equation;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.IntType;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.ProjectionExpr;
import jkind.xtext.jkind.Property;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RealType;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.SubrangeType;
import jkind.xtext.jkind.Typedef;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.util.JkindSwitch;
import jkind.xtext.util.Util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public class TypeChecker extends JkindSwitch<JType> {
	final private ValidationMessageAcceptor messageAcceptor;

	public TypeChecker(ValidationMessageAcceptor messageAcceptor) {
		this.messageAcceptor = messageAcceptor;
	}

	private static final JBuiltinType ERROR = JBuiltinType.ERROR;
	private static final JBuiltinType REAL = JBuiltinType.REAL;
	private static final JBuiltinType INT = JBuiltinType.INT;
	private static final JBuiltinType BOOL = JBuiltinType.BOOL;

	public void check(Constant c) {
		if (c.getType() != null) {
			expectAssignableType(doSwitch(c.getType()), c.getExpr());
		} else {
			doSwitch(c.getExpr());
		}
	}

	public void check(Property property) {
		expectAssignableType(BOOL, doSwitch(property.getRef()), property);
	}

	public void check(Assertion assertion) {
		expectAssignableType(BOOL, assertion.getExpr());
	}

	public void check(Equation equation) {
		if (equation.getLhs().size() == 1) {
			Variable var = equation.getLhs().get(0);
			JType expected = doSwitch(var);
			expectAssignableType(expected, equation.getRhs());
		} else {
			checkNodeCallAssignment(equation);
		}
	}

	private void checkNodeCallAssignment(Equation equation) {
		if (equation.getRhs() instanceof NodeCallExpr || equation.getRhs() instanceof CondactExpr) {
			List<JType> expected = doSwitchList(equation.getLhs());

			List<JType> actual = visitTopLevelCall(equation.getRhs());
			if (actual == null) {
				return;
			}

			if (expected.size() != actual.size()) {
				error("Expected " + expected.size() + " values, but found " + actual.size(),
						equation.getRhs());
				return;
			}

			for (int i = 0; i < expected.size(); i++) {
				expectAssignableType(expected.get(i), actual.get(i), equation.getLhs().get(i));
			}
		} else {
			error("Expected node call for multiple variable assignment", equation.getRhs());
		}
	}

	private List<JType> visitTopLevelCall(Expr call) {
		if (call instanceof NodeCallExpr) {
			return visitNodeCallExpr((NodeCallExpr) call);
		} else if (call instanceof CondactExpr) {
			return visitCondactExpr((CondactExpr) call);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public JType caseBinaryExpr(BinaryExpr e) {
		JType left = doSwitch(e.getLeft());
		JType right = doSwitch(e.getRight());
		if (left == ERROR || right == ERROR) {
			return ERROR;
		}

		switch (e.getOp()) {
		case "+":
		case "-":
		case "*":
			if (left == REAL && right == REAL) {
				return REAL;
			}
			if (isIntBased(left) && isIntBased(right)) {
				return INT;
			}
			break;

		case "/":
			if (left == REAL && right == REAL) {
				return REAL;
			}
			break;

		case "div":
		case "mod":
			if (isIntBased(left) && isIntBased(right)) {
				return INT;
			}
			break;

		case "=":
		case "<>":
			if (joinTypes(left, right) != null) {
				return BOOL;
			}
			break;

		case ">":
		case "<":
		case ">=":
		case "<=":
			if (left == REAL && right == REAL) {
				return BOOL;
			}
			if (isIntBased(left) && isIntBased(right)) {
				return BOOL;
			}
			break;

		case "or":
		case "and":
		case "xor":
		case "=>":
			if (left == BOOL && right == BOOL) {
				return BOOL;
			}
			break;

		case "->":
			JType join = joinTypes(left, right);
			if (join != null) {
				return join;
			}
			break;
		}

		error("Operator '" + e.getOp() + "' not defined on types " + left + ", " + right, e);
		return ERROR;
	}

	@Override
	public JType caseUnaryExpr(UnaryExpr e) {
		JType type = doSwitch(e.getExpr());
		if (type == ERROR) {
			return ERROR;
		}

		switch (e.getOp()) {
		case "pre":
			return type;

		case "not":
			if (type == BOOL) {
				return BOOL;
			}
			break;

		case "-":
			if (type == REAL) {
				return REAL;
			}
			if (type == INT) {
				return INT;
			}
			if (type instanceof JSubrangeType) {
				JSubrangeType subrange = (JSubrangeType) type;
				return new JSubrangeType(subrange.high.negate(), subrange.low.negate());
			}
			break;
		}

		error("Operator '" + e.getOp() + "' not defined on type " + type, e);
		return ERROR;
	}

	@Override
	public JType caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public JType caseConstant(Constant e) {
		if (e.getType() != null) {
			return doSwitch(e.getType());
		} else {
			return doSwitch(e.getExpr());
		}
	}

	@Override
	public JType caseBoolType(BoolType e) {
		return BOOL;
	}

	@Override
	public JType caseIntType(IntType e) {
		return INT;
	}

	@Override
	public JType caseRealType(RealType e) {
		return REAL;
	}

	@Override
	public JType caseSubrangeType(SubrangeType e) {
		return new JSubrangeType(e.getLow(), e.getHigh());
	}

	private final Deque<Typedef> stack = new ArrayDeque<>();

	@Override
	public JType caseUserType(UserType e) {
		if (stack.contains(e.getDef())) {
			return ERROR;
		}
		stack.push(e.getDef());
		JType type = doSwitch(e.getDef());
		stack.pop();
		return type;
	}

	@Override
	public JType caseRecordType(RecordType e) {
		if (e.getName() == null) {
			// Suppress additional error messages for unlinked record types
			return ERROR;
		}

		Map<String, JType> fields = new HashMap<>();
		for (int i = 0; i < e.getFields().size(); i++) {
			Field field = e.getFields().get(i);
			JType type = doSwitch(e.getTypes().get(i));
			fields.put(field.getName(), type);
		}
		return new JRecordType(e.getName(), fields);
	}

	@Override
	public JType caseAbbreviationType(AbbreviationType e) {
		return doSwitch(e.getType());
	}

	@Override
	public JType caseVariable(Variable e) {
		return doSwitch(Util.getType(e));
	}

	@Override
	public JType caseIntExpr(IntExpr e) {
		return new JSubrangeType(e.getVal(), e.getVal());
	}

	@Override
	public JType caseRealExpr(RealExpr e) {
		return REAL;
	}

	@Override
	public JType caseBoolExpr(BoolExpr e) {
		return BOOL;
	}

	@Override
	public JType caseIfThenElseExpr(IfThenElseExpr e) {
		expectAssignableType(BOOL, e.getCond());

		JType t1 = doSwitch(e.getThen());
		JType t2 = doSwitch(e.getElse());
		if (t1 == ERROR || t2 == ERROR) {
			return ERROR;
		}

		JType join = joinTypes(t1, t2);
		if (join != null) {
			return join;
		}

		error("Branches have inconsistent types " + t1 + ", " + t2, e);
		return ERROR;
	}
	
	@Override
	public JType caseCastExpr(CastExpr e) {
		switch (e.getOp()) {
		case "real":
			expectAssignableType(INT, e.getExpr());
			return REAL;
		case "floor":
			expectAssignableType(REAL, e.getExpr());
			return INT;
		default:
			throw new IllegalArgumentException();
		}
	}

	@Override
	public JType caseNodeCallExpr(NodeCallExpr e) {
		List<JType> types = visitNodeCallExpr(e);
		if (types == null) {
			return ERROR;
		} else if (types.size() == 1) {
			return types.get(0);
		} else {
			// Prevent cascading errors
			if (e.getNode().getName() != null) {
				error("A node call within an expression must return a single value", e);
			}
			return ERROR;
		}
	}

	private List<JType> visitNodeCallExpr(NodeCallExpr e) {
		if (e.getNode().getName() == null) {
			return null;
		}

		List<Expr> args = e.getArgs();
		List<Variable> formals = Util.getVariables(e.getNode().getInputs());
		if (args.size() != formals.size()) {
			error("Expected " + formals.size() + " arguments, but found " + args.size(), e);
		} else {
			for (int i = 0; i < args.size(); i++) {
				expectAssignableType(doSwitch(formals.get(i)), args.get(i));
			}
		}

		return doSwitchList(Util.getVariables(e.getNode().getOutputs()));
	}

	@Override
	public JType caseCondactExpr(CondactExpr e) {
		List<JType> types = visitCondactExpr(e);
		if (types == null) {
			return ERROR;
		} else if (types.size() == 1) {
			return types.get(0);
		} else {
			return ERROR;
		}
	}

	private List<JType> visitCondactExpr(CondactExpr e) {
		expectAssignableType(BOOL, e.getClock());

		List<JType> expected = visitNodeCallExpr(e.getCall());
		if (expected == null) {
			return null;
		}

		List<JType> actual = doSwitchList(e.getArgs());

		if (actual.size() != expected.size()) {
			error("Expected " + expected.size() + " default values, but found " + actual.size(), e);
		} else {
			for (int i = 0; i < expected.size(); i++) {
				expectAssignableType(expected.get(i), actual.get(i), e.getArgs().get(i));
			}
		}

		return expected;
	}

	@Override
	public JType caseProjectionExpr(ProjectionExpr e) {
		JType type = doSwitch(e.getExpr());
		if (type == ERROR) {
			return ERROR;
		}

		if (type instanceof JRecordType) {
			JRecordType record = (JRecordType) type;
			JType fieldType = record.fields.get(e.getField().getName());
			if (fieldType != null) {
				return fieldType;
			}

			error("Field " + e.getField().getName() + " not defined in type " + type, e,
					JkindPackage.Literals.PROJECTION_EXPR__FIELD);
			return ERROR;
		} else {
			error("Expected record type, but found " + type, e.getExpr());
			return ERROR;
		}
	}

	@Override
	public JType caseRecordExpr(RecordExpr e) {
		// For partial user input, these lists may have different size in which
		// case we can't correctly type check the fields;
		if (e.getFields().size() != e.getExprs().size()) {
			return doSwitch(e.getType());
		}

		Map<String, Expr> fields = new HashMap<>();
		for (int i = 0; i < e.getFields().size(); i++) {
			Field field = e.getFields().get(i);
			Expr expr = e.getExprs().get(i);
			fields.put(field.getName(), expr);
		}

		JType result = doSwitch(e.getType());
		if (!(result instanceof JRecordType)) {
			return ERROR;
		}
		JRecordType expectedRecord = (JRecordType) result;

		for (Entry<String, JType> entry : expectedRecord.fields.entrySet()) {
			String expectedField = entry.getKey();
			JType expectedType = entry.getValue();
			if (!fields.containsKey(expectedField)) {
				error("Missing field " + expectedField, e, JkindPackage.Literals.RECORD_EXPR__TYPE);
			} else {
				Expr actualExpr = fields.get(expectedField);
				expectAssignableType(expectedType, actualExpr);
			}
		}

		return result;
	}

	private void expectAssignableType(JType expected, EObject source) {
		expectAssignableType(expected, doSwitch(source), source);
	}

	private void expectAssignableType(JType expected, JType actual, EObject source) {
		if (expected == ERROR || actual == ERROR || expected == null || actual == null) {
			return;
		}

		if (expected.equals(actual)) {
			return;
		}

		if (expected == INT && actual instanceof JSubrangeType) {
			return;
		}

		if (expected instanceof JSubrangeType && actual instanceof JSubrangeType) {
			JSubrangeType exRange = (JSubrangeType) expected;
			JSubrangeType acRange = (JSubrangeType) actual;
			if (acRange.low.compareTo(exRange.low) < 0 || acRange.high.compareTo(exRange.high) > 0) {
				error("Expected type " + exRange.toSubrangeString() + ", but found type "
						+ acRange.toSubrangeString(), source);
			}
			return;
		}

		error("Expected type " + getExpected(expected) + ", but found type " + actual, source);
	}

	private String getExpected(JType expected) {
		if (expected instanceof JSubrangeType) {
			return ((JSubrangeType) expected).toSubrangeString();
		} else {
			return expected.toString();
		}
	}

	private JType joinTypes(JType t1, JType t2) {
		if (t1 instanceof JSubrangeType && t2 instanceof JSubrangeType) {
			JSubrangeType s1 = (JSubrangeType) t1;
			JSubrangeType s2 = (JSubrangeType) t2;
			return new JSubrangeType(s1.low.min(s2.low), s1.high.max(s2.high));
		} else if (isIntBased(t1) && isIntBased(t2)) {
			return INT;
		} else if (t1.equals(t2)) {
			return t1;
		} else {
			return null;
		}
	}

	private boolean isIntBased(JType type) {
		return type == INT || type instanceof JSubrangeType;
	}

	private List<JType> doSwitchList(List<? extends EObject> list) {
		List<JType> result = new ArrayList<>();
		for (EObject e : list) {
			result.add(doSwitch(e));
		}
		return result;
	}

	private void error(String message, EObject e) {
		messageAcceptor.acceptError(message, e, null, 0, null);
	}

	private void error(String message, EObject e, EStructuralFeature feature) {
		messageAcceptor.acceptError(message, e, feature, 0, null);
	}
}