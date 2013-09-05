/*
 * generated by Xtext
 */
package jkind.xtext.validation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jkind.xtext.jkind.File;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.NodeCallExpr;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

public class NodesAcyclicValidator extends AbstractJKindJavaValidator {
	@Check
	public void checkNodesAcyclic(File file) {
		Map<Node, Set<Node>> dependencies = getNodeDependencies(file);

		for (Node node : file.getNodes()) {
			checkNodeAcyclic(node, new ArrayDeque<Node>(), dependencies);
		}
	}

	private Map<Node, Set<Node>> getNodeDependencies(File file) {
		Map<Node, Set<Node>> dependencies = new HashMap<>();
		for (Node node : file.getNodes()) {
			Set<Node> set = new HashSet<>();
			for (NodeCallExpr call : EcoreUtil2.getAllContentsOfType(node, NodeCallExpr.class)) {
				set.add(call.getNode());
			}
			dependencies.put(node, set);
		}
		return dependencies;
	}

	private Set<Node> done = new HashSet<>();

	private void checkNodeAcyclic(Node node, Deque<Node> callStack,
			Map<Node, Set<Node>> dependencies) {
		if (done.contains(node)) {
			return;
		}

		if (callStack.contains(node)) {
			errorNodeCycle(callStack, node);
		} else {
			callStack.addLast(node);
			for (Node next : dependencies.get(node)) {
				checkNodeAcyclic(next, callStack, dependencies);
			}
			callStack.removeLast();
			done.add(node);
		}
	}

	private void errorNodeCycle(Deque<Node> callStack, Node last) {
		StringBuilder text = new StringBuilder();
		text.append("Cycle in node calls ");
		boolean cycleStarted = false;
		for (Node node : callStack) {
			if (node.equals(last)) {
				cycleStarted = true;
			}
			if (cycleStarted) {
				text.append(node.getName());
				text.append(" -> ");
			}
		}
		text.append(last.getName());
		String message = text.toString();

		cycleStarted = false;
		for (Node node : callStack) {
			if (node.equals(last)) {
				cycleStarted = true;
			}
			if (cycleStarted) {
				error(message, node, JkindPackage.Literals.NODE__NAME);
			}
		}
	}
}
