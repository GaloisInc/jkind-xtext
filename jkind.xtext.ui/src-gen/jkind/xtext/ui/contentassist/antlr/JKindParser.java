/*
* generated by Xtext
*/
package jkind.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import jkind.xtext.services.JKindGrammarAccess;

public class JKindParser extends AbstractContentAssistParser {
	
	@Inject
	private JKindGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected jkind.xtext.ui.contentassist.antlr.internal.InternalJKindParser createParser() {
		jkind.xtext.ui.contentassist.antlr.internal.InternalJKindParser result = new jkind.xtext.ui.contentassist.antlr.internal.InternalJKindParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFileAccess().getAlternatives(), "rule__File__Alternatives");
					put(grammarAccess.getTypeDefAccess().getAlternatives(), "rule__TypeDef__Alternatives");
					put(grammarAccess.getAtomicTypeAccess().getAlternatives(), "rule__AtomicType__Alternatives");
					put(grammarAccess.getNodeAccess().getAlternatives_12(), "rule__Node__Alternatives_12");
					put(grammarAccess.getEquationAccess().getAlternatives(), "rule__Equation__Alternatives");
					put(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__OrExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getRelationalExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__RelationalExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__PlusExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__TimesExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getPrefixExprAccess().getAlternatives(), "rule__PrefixExpr__Alternatives");
					put(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0(), "rule__PrefixExpr__OpAlternatives_0_1_0");
					put(grammarAccess.getAccessExprAccess().getAlternatives_1(), "rule__AccessExpr__Alternatives_1");
					put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
					put(grammarAccess.getAtomicExprAccess().getOpAlternatives_5_1_0(), "rule__AtomicExpr__OpAlternatives_5_1_0");
					put(grammarAccess.getIdRefAccess().getAlternatives(), "rule__IdRef__Alternatives");
					put(grammarAccess.getBOOLAccess().getAlternatives(), "rule__BOOL__Alternatives");
					put(grammarAccess.getTypeDefAccess().getGroup_0(), "rule__TypeDef__Group_0__0");
					put(grammarAccess.getTypeDefAccess().getGroup_1(), "rule__TypeDef__Group_1__0");
					put(grammarAccess.getTypeDefAccess().getGroup_1_9(), "rule__TypeDef__Group_1_9__0");
					put(grammarAccess.getTypeDefAccess().getGroup_2(), "rule__TypeDef__Group_2__0");
					put(grammarAccess.getTypeDefAccess().getGroup_2_7(), "rule__TypeDef__Group_2_7__0");
					put(grammarAccess.getEnumValueAccess().getGroup(), "rule__EnumValue__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup_1(), "rule__ArrayType__Group_1__0");
					put(grammarAccess.getAtomicTypeAccess().getGroup_0(), "rule__AtomicType__Group_0__0");
					put(grammarAccess.getAtomicTypeAccess().getGroup_1(), "rule__AtomicType__Group_1__0");
					put(grammarAccess.getAtomicTypeAccess().getGroup_2(), "rule__AtomicType__Group_2__0");
					put(grammarAccess.getAtomicTypeAccess().getGroup_3(), "rule__AtomicType__Group_3__0");
					put(grammarAccess.getAtomicTypeAccess().getGroup_4(), "rule__AtomicType__Group_4__0");
					put(grammarAccess.getBoundAccess().getGroup(), "rule__Bound__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getConstantAccess().getGroup_2(), "rule__Constant__Group_2__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_3(), "rule__Node__Group_3__0");
					put(grammarAccess.getNodeAccess().getGroup_3_1(), "rule__Node__Group_3_1__0");
					put(grammarAccess.getNodeAccess().getGroup_7(), "rule__Node__Group_7__0");
					put(grammarAccess.getNodeAccess().getGroup_7_1(), "rule__Node__Group_7_1__0");
					put(grammarAccess.getNodeAccess().getGroup_10(), "rule__Node__Group_10__0");
					put(grammarAccess.getNodeAccess().getGroup_10_1(), "rule__Node__Group_10_1__0");
					put(grammarAccess.getVariableGroupAccess().getGroup(), "rule__VariableGroup__Group__0");
					put(grammarAccess.getVariableGroupAccess().getGroup_1(), "rule__VariableGroup__Group_1__0");
					put(grammarAccess.getEquationAccess().getGroup_0(), "rule__Equation__Group_0__0");
					put(grammarAccess.getEquationAccess().getGroup_0_1(), "rule__Equation__Group_0_1__0");
					put(grammarAccess.getEquationAccess().getGroup_1(), "rule__Equation__Group_1__0");
					put(grammarAccess.getEquationAccess().getGroup_1_1(), "rule__Equation__Group_1_1__0");
					put(grammarAccess.getEquationAccess().getGroup_1_1_1(), "rule__Equation__Group_1_1_1__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getIvcAccess().getGroup(), "rule__Ivc__Group__0");
					put(grammarAccess.getIvcAccess().getGroup_2(), "rule__Ivc__Group_2__0");
					put(grammarAccess.getIvcAccess().getGroup_2_1(), "rule__Ivc__Group_2_1__0");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getRealizabilityInputsAccess().getGroup(), "rule__RealizabilityInputs__Group__0");
					put(grammarAccess.getRealizabilityInputsAccess().getGroup_2(), "rule__RealizabilityInputs__Group_2__0");
					put(grammarAccess.getRealizabilityInputsAccess().getGroup_2_1(), "rule__RealizabilityInputs__Group_2_1__0");
					put(grammarAccess.getAssertionAccess().getGroup(), "rule__Assertion__Group__0");
					put(grammarAccess.getArrowExprAccess().getGroup(), "rule__ArrowExpr__Group__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1(), "rule__ArrowExpr__Group_1__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1_0(), "rule__ArrowExpr__Group_1_0__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1_0_0(), "rule__ArrowExpr__Group_1_0_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup(), "rule__ImpliesExpr__Group__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1(), "rule__ImpliesExpr__Group_1__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0(), "rule__ImpliesExpr__Group_1_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0_0(), "rule__ImpliesExpr__Group_1_0_0__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0(), "rule__OrExpr__Group_1_0__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0_0(), "rule__OrExpr__Group_1_0_0__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0(), "rule__AndExpr__Group_1_0__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0_0(), "rule__AndExpr__Group_1_0_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup(), "rule__RelationalExpr__Group__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1(), "rule__RelationalExpr__Group_1__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0(), "rule__RelationalExpr__Group_1_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0_0(), "rule__RelationalExpr__Group_1_0_0__0");
					put(grammarAccess.getPlusExprAccess().getGroup(), "rule__PlusExpr__Group__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1(), "rule__PlusExpr__Group_1__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0(), "rule__PlusExpr__Group_1_0__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0_0(), "rule__PlusExpr__Group_1_0_0__0");
					put(grammarAccess.getTimesExprAccess().getGroup(), "rule__TimesExpr__Group__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1(), "rule__TimesExpr__Group_1__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1_0(), "rule__TimesExpr__Group_1_0__0");
					put(grammarAccess.getTimesExprAccess().getGroup_1_0_0(), "rule__TimesExpr__Group_1_0_0__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_0(), "rule__PrefixExpr__Group_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup(), "rule__AccessExpr__Group__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0(), "rule__AccessExpr__Group_1_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0_0(), "rule__AccessExpr__Group_1_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0_0_0(), "rule__AccessExpr__Group_1_0_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1(), "rule__AccessExpr__Group_1_1__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1_0(), "rule__AccessExpr__Group_1_1_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1_0_0(), "rule__AccessExpr__Group_1_1_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2(), "rule__AccessExpr__Group_1_2__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_0(), "rule__AccessExpr__Group_1_2_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_0_0(), "rule__AccessExpr__Group_1_2_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2(), "rule__AccessExpr__Group_1_2_2__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2_0(), "rule__AccessExpr__Group_1_2_2_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2_0_0(), "rule__AccessExpr__Group_1_2_2_0_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_0(), "rule__AtomicExpr__Group_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_2(), "rule__AtomicExpr__Group_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_3(), "rule__AtomicExpr__Group_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_4(), "rule__AtomicExpr__Group_4__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_5(), "rule__AtomicExpr__Group_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7(), "rule__AtomicExpr__Group_7__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7_6(), "rule__AtomicExpr__Group_7_6__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8(), "rule__AtomicExpr__Group_8__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8_3(), "rule__AtomicExpr__Group_8_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_9(), "rule__AtomicExpr__Group_9__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_9_6(), "rule__AtomicExpr__Group_9_6__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10(), "rule__AtomicExpr__Group_10__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10_2(), "rule__AtomicExpr__Group_10_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10_2_1(), "rule__AtomicExpr__Group_10_2_1__0");
					put(grammarAccess.getNodeCallExprAccess().getGroup(), "rule__NodeCallExpr__Group__0");
					put(grammarAccess.getNodeCallExprAccess().getGroup_2(), "rule__NodeCallExpr__Group_2__0");
					put(grammarAccess.getNodeCallExprAccess().getGroup_2_1(), "rule__NodeCallExpr__Group_2_1__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getFileAccess().getTypedefsAssignment_0(), "rule__File__TypedefsAssignment_0");
					put(grammarAccess.getFileAccess().getConstantsAssignment_1(), "rule__File__ConstantsAssignment_1");
					put(grammarAccess.getFileAccess().getNodesAssignment_2(), "rule__File__NodesAssignment_2");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_0_2(), "rule__TypeDef__NameAssignment_0_2");
					put(grammarAccess.getTypeDefAccess().getTypeAssignment_0_4(), "rule__TypeDef__TypeAssignment_0_4");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_1_2(), "rule__TypeDef__NameAssignment_1_2");
					put(grammarAccess.getTypeDefAccess().getFieldsAssignment_1_6(), "rule__TypeDef__FieldsAssignment_1_6");
					put(grammarAccess.getTypeDefAccess().getTypesAssignment_1_8(), "rule__TypeDef__TypesAssignment_1_8");
					put(grammarAccess.getTypeDefAccess().getFieldsAssignment_1_9_1(), "rule__TypeDef__FieldsAssignment_1_9_1");
					put(grammarAccess.getTypeDefAccess().getTypesAssignment_1_9_3(), "rule__TypeDef__TypesAssignment_1_9_3");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_2_2(), "rule__TypeDef__NameAssignment_2_2");
					put(grammarAccess.getTypeDefAccess().getValuesAssignment_2_6(), "rule__TypeDef__ValuesAssignment_2_6");
					put(grammarAccess.getTypeDefAccess().getValuesAssignment_2_7_1(), "rule__TypeDef__ValuesAssignment_2_7_1");
					put(grammarAccess.getEnumValueAccess().getNameAssignment_1(), "rule__EnumValue__NameAssignment_1");
					put(grammarAccess.getArrayTypeAccess().getSizeAssignment_1_2(), "rule__ArrayType__SizeAssignment_1_2");
					put(grammarAccess.getAtomicTypeAccess().getLowAssignment_3_3(), "rule__AtomicType__LowAssignment_3_3");
					put(grammarAccess.getAtomicTypeAccess().getHighAssignment_3_5(), "rule__AtomicType__HighAssignment_3_5");
					put(grammarAccess.getAtomicTypeAccess().getDefAssignment_4_1(), "rule__AtomicType__DefAssignment_4_1");
					put(grammarAccess.getFieldAccess().getNameAssignment(), "rule__Field__NameAssignment");
					put(grammarAccess.getConstantAccess().getNameAssignment_1(), "rule__Constant__NameAssignment_1");
					put(grammarAccess.getConstantAccess().getTypeAssignment_2_1(), "rule__Constant__TypeAssignment_2_1");
					put(grammarAccess.getConstantAccess().getExprAssignment_4(), "rule__Constant__ExprAssignment_4");
					put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
					put(grammarAccess.getNodeAccess().getInputsAssignment_3_0(), "rule__Node__InputsAssignment_3_0");
					put(grammarAccess.getNodeAccess().getInputsAssignment_3_1_1(), "rule__Node__InputsAssignment_3_1_1");
					put(grammarAccess.getNodeAccess().getOutputsAssignment_7_0(), "rule__Node__OutputsAssignment_7_0");
					put(grammarAccess.getNodeAccess().getOutputsAssignment_7_1_1(), "rule__Node__OutputsAssignment_7_1_1");
					put(grammarAccess.getNodeAccess().getLocalsAssignment_10_1_0(), "rule__Node__LocalsAssignment_10_1_0");
					put(grammarAccess.getNodeAccess().getEquationsAssignment_12_0(), "rule__Node__EquationsAssignment_12_0");
					put(grammarAccess.getNodeAccess().getAssertionsAssignment_12_1(), "rule__Node__AssertionsAssignment_12_1");
					put(grammarAccess.getNodeAccess().getPropertiesAssignment_12_2(), "rule__Node__PropertiesAssignment_12_2");
					put(grammarAccess.getNodeAccess().getMainAssignment_12_3(), "rule__Node__MainAssignment_12_3");
					put(grammarAccess.getNodeAccess().getIvcAssignment_12_4(), "rule__Node__IvcAssignment_12_4");
					put(grammarAccess.getNodeAccess().getRealizabilityInputsAssignment_12_5(), "rule__Node__RealizabilityInputsAssignment_12_5");
					put(grammarAccess.getVariableGroupAccess().getVariablesAssignment_0(), "rule__VariableGroup__VariablesAssignment_0");
					put(grammarAccess.getVariableGroupAccess().getVariablesAssignment_1_1(), "rule__VariableGroup__VariablesAssignment_1_1");
					put(grammarAccess.getVariableGroupAccess().getTypeAssignment_3(), "rule__VariableGroup__TypeAssignment_3");
					put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
					put(grammarAccess.getEquationAccess().getLhsAssignment_0_0(), "rule__Equation__LhsAssignment_0_0");
					put(grammarAccess.getEquationAccess().getLhsAssignment_0_1_1(), "rule__Equation__LhsAssignment_0_1_1");
					put(grammarAccess.getEquationAccess().getRhsAssignment_0_3(), "rule__Equation__RhsAssignment_0_3");
					put(grammarAccess.getEquationAccess().getLhsAssignment_1_1_0(), "rule__Equation__LhsAssignment_1_1_0");
					put(grammarAccess.getEquationAccess().getLhsAssignment_1_1_1_1(), "rule__Equation__LhsAssignment_1_1_1_1");
					put(grammarAccess.getEquationAccess().getRhsAssignment_1_4(), "rule__Equation__RhsAssignment_1_4");
					put(grammarAccess.getPropertyAccess().getRefAssignment_1(), "rule__Property__RefAssignment_1");
					put(grammarAccess.getIvcAccess().getIdsAssignment_2_0(), "rule__Ivc__IdsAssignment_2_0");
					put(grammarAccess.getIvcAccess().getIdsAssignment_2_1_1(), "rule__Ivc__IdsAssignment_2_1_1");
					put(grammarAccess.getRealizabilityInputsAccess().getIdsAssignment_2_0(), "rule__RealizabilityInputs__IdsAssignment_2_0");
					put(grammarAccess.getRealizabilityInputsAccess().getIdsAssignment_2_1_1(), "rule__RealizabilityInputs__IdsAssignment_2_1_1");
					put(grammarAccess.getAssertionAccess().getExprAssignment_1(), "rule__Assertion__ExprAssignment_1");
					put(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_0_1(), "rule__ArrowExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getArrowExprAccess().getRightAssignment_1_1(), "rule__ArrowExpr__RightAssignment_1_1");
					put(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_0_1(), "rule__ImpliesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1(), "rule__ImpliesExpr__RightAssignment_1_1");
					put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1(), "rule__OrExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getOrExprAccess().getRightAssignment_1_1(), "rule__OrExpr__RightAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1(), "rule__AndExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getAndExprAccess().getRightAssignment_1_1(), "rule__AndExpr__RightAssignment_1_1");
					put(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1(), "rule__RelationalExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1(), "rule__RelationalExpr__RightAssignment_1_1");
					put(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_0_1(), "rule__PlusExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getPlusExprAccess().getRightAssignment_1_1(), "rule__PlusExpr__RightAssignment_1_1");
					put(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_0_1(), "rule__TimesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getTimesExprAccess().getRightAssignment_1_1(), "rule__TimesExpr__RightAssignment_1_1");
					put(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1(), "rule__PrefixExpr__OpAssignment_0_1");
					put(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2(), "rule__PrefixExpr__ExprAssignment_0_2");
					put(grammarAccess.getAccessExprAccess().getFieldAssignment_1_0_1(), "rule__AccessExpr__FieldAssignment_1_0_1");
					put(grammarAccess.getAccessExprAccess().getFieldAssignment_1_1_0_0_2(), "rule__AccessExpr__FieldAssignment_1_1_0_0_2");
					put(grammarAccess.getAccessExprAccess().getValueAssignment_1_1_1(), "rule__AccessExpr__ValueAssignment_1_1_1");
					put(grammarAccess.getAccessExprAccess().getIndexAssignment_1_2_1(), "rule__AccessExpr__IndexAssignment_1_2_1");
					put(grammarAccess.getAccessExprAccess().getValueAssignment_1_2_2_1(), "rule__AccessExpr__ValueAssignment_1_2_2_1");
					put(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1(), "rule__AtomicExpr__IdAssignment_0_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_1_1(), "rule__AtomicExpr__ValAssignment_1_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_2_1(), "rule__AtomicExpr__ValAssignment_2_1");
					put(grammarAccess.getAtomicExprAccess().getValAssignment_3_1(), "rule__AtomicExpr__ValAssignment_3_1");
					put(grammarAccess.getAtomicExprAccess().getCondAssignment_4_2(), "rule__AtomicExpr__CondAssignment_4_2");
					put(grammarAccess.getAtomicExprAccess().getThenAssignment_4_4(), "rule__AtomicExpr__ThenAssignment_4_4");
					put(grammarAccess.getAtomicExprAccess().getElseAssignment_4_6(), "rule__AtomicExpr__ElseAssignment_4_6");
					put(grammarAccess.getAtomicExprAccess().getOpAssignment_5_1(), "rule__AtomicExpr__OpAssignment_5_1");
					put(grammarAccess.getAtomicExprAccess().getExprAssignment_5_3(), "rule__AtomicExpr__ExprAssignment_5_3");
					put(grammarAccess.getAtomicExprAccess().getClockAssignment_7_3(), "rule__AtomicExpr__ClockAssignment_7_3");
					put(grammarAccess.getAtomicExprAccess().getCallAssignment_7_5(), "rule__AtomicExpr__CallAssignment_7_5");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_7_6_1(), "rule__AtomicExpr__ArgsAssignment_7_6_1");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_8_2(), "rule__AtomicExpr__ExprsAssignment_8_2");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_8_3_1(), "rule__AtomicExpr__ExprsAssignment_8_3_1");
					put(grammarAccess.getAtomicExprAccess().getTypeAssignment_9_1(), "rule__AtomicExpr__TypeAssignment_9_1");
					put(grammarAccess.getAtomicExprAccess().getFieldsAssignment_9_3(), "rule__AtomicExpr__FieldsAssignment_9_3");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_9_5(), "rule__AtomicExpr__ExprsAssignment_9_5");
					put(grammarAccess.getAtomicExprAccess().getFieldsAssignment_9_6_1(), "rule__AtomicExpr__FieldsAssignment_9_6_1");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_9_6_3(), "rule__AtomicExpr__ExprsAssignment_9_6_3");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_10_2_1_1(), "rule__AtomicExpr__ExprsAssignment_10_2_1_1");
					put(grammarAccess.getNodeCallExprAccess().getNodeAssignment_0(), "rule__NodeCallExpr__NodeAssignment_0");
					put(grammarAccess.getNodeCallExprAccess().getArgsAssignment_2_0(), "rule__NodeCallExpr__ArgsAssignment_2_0");
					put(grammarAccess.getNodeCallExprAccess().getArgsAssignment_2_1_1(), "rule__NodeCallExpr__ArgsAssignment_2_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			jkind.xtext.ui.contentassist.antlr.internal.InternalJKindParser typedParser = (jkind.xtext.ui.contentassist.antlr.internal.InternalJKindParser) parser;
			typedParser.entryRuleFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT" };
	}
	
	public JKindGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JKindGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
