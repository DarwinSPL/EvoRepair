/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl.serializer;

import com.google.inject.Inject;
import de.evorepair.feature.mapping.repair.dsl.services.EvoMappingRepairDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EvoMappingRepairDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EvoMappingRepairDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EvoTerminal_LeftParenthesisKeyword_13_0_a;
	protected AbstractElementAlias match_EvoTerminal_LeftParenthesisKeyword_13_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EvoMappingRepairDslGrammarAccess) access;
		match_EvoTerminal_LeftParenthesisKeyword_13_0_a = new TokenAlias(true, true, grammarAccess.getEvoTerminalAccess().getLeftParenthesisKeyword_13_0());
		match_EvoTerminal_LeftParenthesisKeyword_13_0_p = new TokenAlias(true, false, grammarAccess.getEvoTerminalAccess().getLeftParenthesisKeyword_13_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EvoTerminal_LeftParenthesisKeyword_13_0_a.equals(syntax))
				emit_EvoTerminal_LeftParenthesisKeyword_13_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EvoTerminal_LeftParenthesisKeyword_13_0_p.equals(syntax))
				emit_EvoTerminal_LeftParenthesisKeyword_13_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'AC' '(' variable=[EvoMappingVariable|QualifiedName]
	 *     (rule start) (ambiguity) 'childrenOf' '(' variable=EvoVariableTerm
	 *     (rule start) (ambiguity) 'exists' '(' boundedVariables+=EvoFeatureVariable
	 *     (rule start) (ambiguity) 'featureType' '(' variables+=EvoVariableTerm
	 *     (rule start) (ambiguity) 'forAll' '(' boundedVariables+=EvoFeatureVariable
	 *     (rule start) (ambiguity) 'groupType' '(' variables+=EvoGroupTerm
	 *     (rule start) (ambiguity) 'not' '(' operand=EvoExpression
	 *     (rule start) (ambiguity) 'parentOf' '(' variable=EvoVariableTerm
	 *     (rule start) (ambiguity) 'satisfiable' '(' variables+=EvoApplicationConstraintTerm
	 *     (rule start) (ambiguity) 'satisfiable' '(' variables+=EvoSetVariable
	 *     (rule start) (ambiguity) 'sibilingsOf' '(' variable=EvoVariableTerm
	 *     (rule start) (ambiguity) 'size' '(' operand=EvoExpression
	 *     (rule start) (ambiguity) '{' variables+=EvoSetVariable
	 *     (rule start) (ambiguity) '|' operand=EvoExpression
	 *     (rule start) (ambiguity) variable=[EvoVariable|QualifiedName]
	 *     (rule start) (ambiguity) {EvoAnd.operand1=}
	 *     (rule start) (ambiguity) {EvoBiconditional.operand1=}
	 *     (rule start) (ambiguity) {EvoEqual.operand1=}
	 *     (rule start) (ambiguity) {EvoImplication.operand1=}
	 *     (rule start) (ambiguity) {EvoOr.operand1=}
	 *     (rule start) (ambiguity) {EvoSetCartesianProduct.operand1=}
	 *     (rule start) (ambiguity) {EvoSetDifference.operand1=}
	 *     (rule start) (ambiguity) {EvoSetElementOf.operand1=}
	 *     (rule start) (ambiguity) {EvoSetInclusion.operand1=}
	 *     (rule start) (ambiguity) {EvoSetIntersection.operand1=}
	 *     (rule start) (ambiguity) {EvoSetSymmetricDifference.operand1=}
	 *     (rule start) (ambiguity) {EvoSetUnion.operand1=}
	 *     (rule start) (ambiguity) {EvoUnequal.operand1=}
	 *     (rule start) (ambiguity) {EvoXOr.operand1=}
	 */
	protected void emit_EvoTerminal_LeftParenthesisKeyword_13_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {EvoAnd.operand1=}
	 *     (rule start) (ambiguity) {EvoBiconditional.operand1=}
	 *     (rule start) (ambiguity) {EvoEqual.operand1=}
	 *     (rule start) (ambiguity) {EvoImplication.operand1=}
	 *     (rule start) (ambiguity) {EvoOr.operand1=}
	 *     (rule start) (ambiguity) {EvoSetCartesianProduct.operand1=}
	 *     (rule start) (ambiguity) {EvoSetDifference.operand1=}
	 *     (rule start) (ambiguity) {EvoSetElementOf.operand1=}
	 *     (rule start) (ambiguity) {EvoSetInclusion.operand1=}
	 *     (rule start) (ambiguity) {EvoSetIntersection.operand1=}
	 *     (rule start) (ambiguity) {EvoSetSymmetricDifference.operand1=}
	 *     (rule start) (ambiguity) {EvoSetUnion.operand1=}
	 *     (rule start) (ambiguity) {EvoUnequal.operand1=}
	 *     (rule start) (ambiguity) {EvoXOr.operand1=}
	 */
	protected void emit_EvoTerminal_LeftParenthesisKeyword_13_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}