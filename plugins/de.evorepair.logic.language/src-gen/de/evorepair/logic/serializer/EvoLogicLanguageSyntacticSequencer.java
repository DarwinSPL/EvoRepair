/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.logic.serializer;

import com.google.inject.Inject;
import de.evorepair.logic.services.EvoLogicLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EvoLogicLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EvoLogicLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_EvoAnd_AmpersandAmpersandKeyword_1_1_1_or_AndKeyword_1_1_0;
	protected AbstractElementAlias match_EvoOr_OrKeyword_1_1_0_or_VerticalLineVerticalLineKeyword_1_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EvoLogicLanguageGrammarAccess) access;
		match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getEvoAbstractOneParameterTermAccess().getLeftParenthesisKeyword_1_0());
		match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getEvoAbstractOneParameterTermAccess().getLeftParenthesisKeyword_1_0());
		match_EvoAnd_AmpersandAmpersandKeyword_1_1_1_or_AndKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getEvoAndAccess().getAndKeyword_1_1_0()));
		match_EvoOr_OrKeyword_1_1_0_or_VerticalLineVerticalLineKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEvoOrAccess().getOrKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1_1()));
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
			if (match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EvoAnd_AmpersandAmpersandKeyword_1_1_1_or_AndKeyword_1_1_0.equals(syntax))
				emit_EvoAnd_AmpersandAmpersandKeyword_1_1_1_or_AndKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EvoOr_OrKeyword_1_1_0_or_VerticalLineVerticalLineKeyword_1_1_1.equals(syntax))
				emit_EvoOr_OrKeyword_1_1_0_or_VerticalLineVerticalLineKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'EvoVariableTerm' '{' 'variable' variable=[EvoVariable|ID]
	 *     (rule start) (ambiguity) {EvoAnd.leftElement=}
	 *     (rule start) (ambiguity) {EvoOr.leftElement=}
	 */
	protected void emit_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {EvoAnd.leftElement=}
	 *     (rule start) (ambiguity) {EvoOr.leftElement=}
	 */
	protected void emit_EvoAbstractOneParameterTerm_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '&&' | 'and'
	 *
	 * This ambiguous syntax occurs at:
	 *     {EvoAnd.leftElement=} (ambiguity) rightElement=EvoAbstractOneParameterTerm
	 */
	protected void emit_EvoAnd_AmpersandAmpersandKeyword_1_1_1_or_AndKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'or' | '||'
	 *
	 * This ambiguous syntax occurs at:
	 *     {EvoOr.leftElement=} (ambiguity) rightElement=EvoAnd
	 */
	protected void emit_EvoOr_OrKeyword_1_1_0_or_VerticalLineVerticalLineKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
