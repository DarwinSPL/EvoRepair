/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.evorepair.feature.mapping.ide.contentassist.antlr.internal.InternalDwMappingDslParser;
import de.evorepair.feature.mapping.services.DwMappingDslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DwMappingDslParser extends AbstractContentAssistParser {

	@Inject
	private DwMappingDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDwMappingDslParser createParser() {
		InternalDwMappingDslParser result = new InternalDwMappingDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getHyMappingAccess().getAlternatives_3_1(), "rule__HyMapping__Alternatives_3_1");
					put(grammarAccess.getEvoMappingTerminalAccess().getAlternatives(), "rule__EvoMappingTerminal__Alternatives");
					put(grammarAccess.getEvoMappingVersionRestrictionAccess().getAlternatives(), "rule__EvoMappingVersionRestriction__Alternatives");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getAlternatives(), "rule__EvoMappingVersionRangeRestriction__Alternatives");
					put(grammarAccess.getEvoMappingBooleanValueExpressionAccess().getAlternatives_1(), "rule__EvoMappingBooleanValueExpression__Alternatives_1");
					put(grammarAccess.getEvoUnequalSizeAccess().getAlternatives(), "rule__EvoUnequalSize__Alternatives");
					put(grammarAccess.getEvoImplicationSizeAccess().getAlternatives(), "rule__EvoImplicationSize__Alternatives");
					put(grammarAccess.getEvoBiconditionalSizeAccess().getAlternatives(), "rule__EvoBiconditionalSize__Alternatives");
					put(grammarAccess.getEvoSetInclusionSizeAccess().getAlternatives(), "rule__EvoSetInclusionSize__Alternatives");
					put(grammarAccess.getEvoSetCardinalityAccess().getAlternatives_1(), "rule__EvoSetCardinality__Alternatives_1");
					put(grammarAccess.getEvoElementOfAccess().getOperand2Alternatives_1_2_0(), "rule__EvoElementOf__Operand2Alternatives_1_2_0");
					put(grammarAccess.getEvoNotAccess().getAlternatives(), "rule__EvoNot__Alternatives");
					put(grammarAccess.getEvoSatisfiableAccess().getVariablesAlternatives_3_0(), "rule__EvoSatisfiable__VariablesAlternatives_3_0");
					put(grammarAccess.getEvoSatisfiableAccess().getVariablesAlternatives_4_1_0(), "rule__EvoSatisfiable__VariablesAlternatives_4_1_0");
					put(grammarAccess.getEvoTerminalAccess().getAlternatives(), "rule__EvoTerminal__Alternatives");
					put(grammarAccess.getEvoSetVariableAccess().getAlternatives(), "rule__EvoSetVariable__Alternatives");
					put(grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getAlternatives(), "rule__EvoMappingRelativeVersionRestrictionOperator__Alternatives");
					put(grammarAccess.getEvoVariableTypeAccess().getAlternatives(), "rule__EvoVariableType__Alternatives");
					put(grammarAccess.getHyFeatureTypeEnumAccess().getAlternatives(), "rule__HyFeatureTypeEnum__Alternatives");
					put(grammarAccess.getHyGroupTypeEnumAccess().getAlternatives(), "rule__HyGroupTypeEnum__Alternatives");
					put(grammarAccess.getHyMappingModelAccess().getGroup(), "rule__HyMappingModel__Group__0");
					put(grammarAccess.getDEDeltaInvokationAccess().getGroup(), "rule__DEDeltaInvokation__Group__0");
					put(grammarAccess.getHyMappingAccess().getGroup(), "rule__HyMapping__Group__0");
					put(grammarAccess.getHyMappingAccess().getGroup_3(), "rule__HyMapping__Group_3__0");
					put(grammarAccess.getHyMappingAccess().getGroup_3_1_0(), "rule__HyMapping__Group_3_1_0__0");
					put(grammarAccess.getHyMappingAccess().getGroup_3_1_1(), "rule__HyMapping__Group_3_1_1__0");
					put(grammarAccess.getHyMappingAccess().getGroup_3_1_2(), "rule__HyMapping__Group_3_1_2__0");
					put(grammarAccess.getEvoMappingOrAccess().getGroup(), "rule__EvoMappingOr__Group__0");
					put(grammarAccess.getEvoMappingOrAccess().getGroup_1(), "rule__EvoMappingOr__Group_1__0");
					put(grammarAccess.getEvoMappingAndAccess().getGroup(), "rule__EvoMappingAnd__Group__0");
					put(grammarAccess.getEvoMappingAndAccess().getGroup_1(), "rule__EvoMappingAnd__Group_1__0");
					put(grammarAccess.getEvoMappingEqualAccess().getGroup(), "rule__EvoMappingEqual__Group__0");
					put(grammarAccess.getEvoMappingEqualAccess().getGroup_1(), "rule__EvoMappingEqual__Group_1__0");
					put(grammarAccess.getEvoMappingUnequalAccess().getGroup(), "rule__EvoMappingUnequal__Group__0");
					put(grammarAccess.getEvoMappingUnequalAccess().getGroup_1(), "rule__EvoMappingUnequal__Group_1__0");
					put(grammarAccess.getEvoMappingImplicationAccess().getGroup(), "rule__EvoMappingImplication__Group__0");
					put(grammarAccess.getEvoMappingImplicationAccess().getGroup_1(), "rule__EvoMappingImplication__Group_1__0");
					put(grammarAccess.getEvoMappingEquivalenceAccess().getGroup(), "rule__EvoMappingEquivalence__Group__0");
					put(grammarAccess.getEvoMappingEquivalenceAccess().getGroup_1(), "rule__EvoMappingEquivalence__Group_1__0");
					put(grammarAccess.getEvoMappingLessExpressionAccess().getGroup(), "rule__EvoMappingLessExpression__Group__0");
					put(grammarAccess.getEvoMappingLessExpressionAccess().getGroup_1(), "rule__EvoMappingLessExpression__Group_1__0");
					put(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getGroup(), "rule__EvoMappingIfPossibleExpression__Group__0");
					put(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getGroup_1(), "rule__EvoMappingIfPossibleExpression__Group_1__0");
					put(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getGroup_1_2(), "rule__EvoMappingIfPossibleExpression__Group_1_2__0");
					put(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getGroup(), "rule__EvoMappingLessOrEqualExpression__Group__0");
					put(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getGroup_1(), "rule__EvoMappingLessOrEqualExpression__Group_1__0");
					put(grammarAccess.getEvoMappingGreaterExpressionAccess().getGroup(), "rule__EvoMappingGreaterExpression__Group__0");
					put(grammarAccess.getEvoMappingGreaterExpressionAccess().getGroup_1(), "rule__EvoMappingGreaterExpression__Group_1__0");
					put(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getGroup(), "rule__EvoMappingGreaterOrEqualExpression__Group__0");
					put(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getGroup_1(), "rule__EvoMappingGreaterOrEqualExpression__Group_1__0");
					put(grammarAccess.getEvoMappingSubtractionExpressionAccess().getGroup(), "rule__EvoMappingSubtractionExpression__Group__0");
					put(grammarAccess.getEvoMappingSubtractionExpressionAccess().getGroup_1(), "rule__EvoMappingSubtractionExpression__Group_1__0");
					put(grammarAccess.getEvoMappingAdditionExpressionAccess().getGroup(), "rule__EvoMappingAdditionExpression__Group__0");
					put(grammarAccess.getEvoMappingAdditionExpressionAccess().getGroup_1(), "rule__EvoMappingAdditionExpression__Group_1__0");
					put(grammarAccess.getEvoMappingModuloExpressionAccess().getGroup(), "rule__EvoMappingModuloExpression__Group__0");
					put(grammarAccess.getEvoMappingModuloExpressionAccess().getGroup_1(), "rule__EvoMappingModuloExpression__Group_1__0");
					put(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getGroup(), "rule__EvoMappingMultiplicationExpression__Group__0");
					put(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getGroup_1(), "rule__EvoMappingMultiplicationExpression__Group_1__0");
					put(grammarAccess.getEvoMappingDivisionExpressionAccess().getGroup(), "rule__EvoMappingDivisionExpression__Group__0");
					put(grammarAccess.getEvoMappingDivisionExpressionAccess().getGroup_1(), "rule__EvoMappingDivisionExpression__Group_1__0");
					put(grammarAccess.getEvoMappingNegationAccess().getGroup(), "rule__EvoMappingNegation__Group__0");
					put(grammarAccess.getEvoMappingNestedExpressionAccess().getGroup(), "rule__EvoMappingNestedExpression__Group__0");
					put(grammarAccess.getEvoMappingNotAccess().getGroup(), "rule__EvoMappingNot__Group__0");
					put(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getGroup(), "rule__EvoMappingConditionalFeatureReferenceExpression__Group__0");
					put(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getGroup(), "rule__EvoMappingRelativeVersionRestriction__Group__0");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getGroup_0(), "rule__EvoMappingVersionRangeRestriction__Group_0__0");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getGroup_1(), "rule__EvoMappingVersionRangeRestriction__Group_1__0");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getGroup_2(), "rule__EvoMappingVersionRangeRestriction__Group_2__0");
					put(grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getGroup(), "rule__EvoMappingContextInformationReferenceExpression__Group__0");
					put(grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getGroup(), "rule__EvoMappingAttributeReferenceExpression__Group__0");
					put(grammarAccess.getEvoMappingBooleanValueExpressionAccess().getGroup(), "rule__EvoMappingBooleanValueExpression__Group__0");
					put(grammarAccess.getEvoMappingMimumumExpressionAccess().getGroup(), "rule__EvoMappingMimumumExpression__Group__0");
					put(grammarAccess.getEvoMappingMaximumExpressionAccess().getGroup(), "rule__EvoMappingMaximumExpression__Group__0");
					put(grammarAccess.getEvoFormulaAccess().getGroup(), "rule__EvoFormula__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getEvoXOrAccess().getGroup(), "rule__EvoXOr__Group__0");
					put(grammarAccess.getEvoXOrAccess().getGroup_1(), "rule__EvoXOr__Group_1__0");
					put(grammarAccess.getEvoOrAccess().getGroup(), "rule__EvoOr__Group__0");
					put(grammarAccess.getEvoOrAccess().getGroup_1(), "rule__EvoOr__Group_1__0");
					put(grammarAccess.getEvoAndAccess().getGroup(), "rule__EvoAnd__Group__0");
					put(grammarAccess.getEvoAndAccess().getGroup_1(), "rule__EvoAnd__Group_1__0");
					put(grammarAccess.getEvoEqualAccess().getGroup(), "rule__EvoEqual__Group__0");
					put(grammarAccess.getEvoEqualAccess().getGroup_1(), "rule__EvoEqual__Group_1__0");
					put(grammarAccess.getEvoUnequalAccess().getGroup(), "rule__EvoUnequal__Group__0");
					put(grammarAccess.getEvoUnequalAccess().getGroup_1(), "rule__EvoUnequal__Group_1__0");
					put(grammarAccess.getEvoImplicationAccess().getGroup(), "rule__EvoImplication__Group__0");
					put(grammarAccess.getEvoImplicationAccess().getGroup_1(), "rule__EvoImplication__Group_1__0");
					put(grammarAccess.getEvoBiconditionalAccess().getGroup(), "rule__EvoBiconditional__Group__0");
					put(grammarAccess.getEvoBiconditionalAccess().getGroup_1(), "rule__EvoBiconditional__Group_1__0");
					put(grammarAccess.getEvoSetInclusionAccess().getGroup(), "rule__EvoSetInclusion__Group__0");
					put(grammarAccess.getEvoSetInclusionAccess().getGroup_1(), "rule__EvoSetInclusion__Group_1__0");
					put(grammarAccess.getEvoSetIntersectionAccess().getGroup(), "rule__EvoSetIntersection__Group__0");
					put(grammarAccess.getEvoSetIntersectionAccess().getGroup_1(), "rule__EvoSetIntersection__Group_1__0");
					put(grammarAccess.getEvoSetUnionAccess().getGroup(), "rule__EvoSetUnion__Group__0");
					put(grammarAccess.getEvoSetUnionAccess().getGroup_1(), "rule__EvoSetUnion__Group_1__0");
					put(grammarAccess.getEvoSetDifferenceAccess().getGroup(), "rule__EvoSetDifference__Group__0");
					put(grammarAccess.getEvoSetDifferenceAccess().getGroup_1(), "rule__EvoSetDifference__Group_1__0");
					put(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup(), "rule__EvoSetSymmetricDifference__Group__0");
					put(grammarAccess.getEvoSetSymmetricDifferenceAccess().getGroup_1(), "rule__EvoSetSymmetricDifference__Group_1__0");
					put(grammarAccess.getEvoSetCartesianProductAccess().getGroup(), "rule__EvoSetCartesianProduct__Group__0");
					put(grammarAccess.getEvoSetCartesianProductAccess().getGroup_1(), "rule__EvoSetCartesianProduct__Group_1__0");
					put(grammarAccess.getEvoSetCardinalityAccess().getGroup(), "rule__EvoSetCardinality__Group__0");
					put(grammarAccess.getEvoSetCardinalityAccess().getGroup_1_0(), "rule__EvoSetCardinality__Group_1_0__0");
					put(grammarAccess.getEvoSetCardinalityAccess().getGroup_1_1(), "rule__EvoSetCardinality__Group_1_1__0");
					put(grammarAccess.getEvoElementOfAccess().getGroup(), "rule__EvoElementOf__Group__0");
					put(grammarAccess.getEvoElementOfAccess().getGroup_1(), "rule__EvoElementOf__Group_1__0");
					put(grammarAccess.getEvoForAllAccess().getGroup(), "rule__EvoForAll__Group__0");
					put(grammarAccess.getEvoForAllAccess().getGroup_3(), "rule__EvoForAll__Group_3__0");
					put(grammarAccess.getEvoExistsAccess().getGroup(), "rule__EvoExists__Group__0");
					put(grammarAccess.getEvoNotAccess().getGroup_0(), "rule__EvoNot__Group_0__0");
					put(grammarAccess.getEvoNotAccess().getGroup_1(), "rule__EvoNot__Group_1__0");
					put(grammarAccess.getEvoSatisfiableAccess().getGroup(), "rule__EvoSatisfiable__Group__0");
					put(grammarAccess.getEvoSatisfiableAccess().getGroup_4(), "rule__EvoSatisfiable__Group_4__0");
					put(grammarAccess.getEvoTerminalAccess().getGroup_13(), "rule__EvoTerminal__Group_13__0");
					put(grammarAccess.getEvoAllMappingTerminalAccess().getGroup(), "rule__EvoAllMappingTerminal__Group__0");
					put(grammarAccess.getEvoAllConfigurationTerminalAccess().getGroup(), "rule__EvoAllConfigurationTerminal__Group__0");
					put(grammarAccess.getEvoSizeAccess().getGroup(), "rule__EvoSize__Group__0");
					put(grammarAccess.getEvoVariableTermAccess().getGroup(), "rule__EvoVariableTerm__Group__0");
					put(grammarAccess.getEvoApplicationConstraintTermAccess().getGroup(), "rule__EvoApplicationConstraintTerm__Group__0");
					put(grammarAccess.getEvoFeatureTypeAccess().getGroup(), "rule__EvoFeatureType__Group__0");
					put(grammarAccess.getEvoFeatureTypeAccess().getGroup_2(), "rule__EvoFeatureType__Group_2__0");
					put(grammarAccess.getEvoFeatureTypeAccess().getGroup_2_2(), "rule__EvoFeatureType__Group_2_2__0");
					put(grammarAccess.getEvoGroupTypeAccess().getGroup(), "rule__EvoGroupType__Group__0");
					put(grammarAccess.getEvoGroupTypeAccess().getGroup_2(), "rule__EvoGroupType__Group_2__0");
					put(grammarAccess.getEvoGroupTypeAccess().getGroup_2_2(), "rule__EvoGroupType__Group_2_2__0");
					put(grammarAccess.getEvoGroupTermAccess().getGroup(), "rule__EvoGroupTerm__Group__0");
					put(grammarAccess.getEvoSetTermAccess().getGroup(), "rule__EvoSetTerm__Group__0");
					put(grammarAccess.getEvoSetTermAccess().getGroup_2(), "rule__EvoSetTerm__Group_2__0");
					put(grammarAccess.getEvoParentOfAccess().getGroup(), "rule__EvoParentOf__Group__0");
					put(grammarAccess.getEvoSiblingsOfAccess().getGroup(), "rule__EvoSiblingsOf__Group__0");
					put(grammarAccess.getEvoChildrenOfAccess().getGroup(), "rule__EvoChildrenOf__Group__0");
					put(grammarAccess.getHyMappingModelAccess().getMappingsAssignment_0(), "rule__HyMappingModel__MappingsAssignment_0");
					put(grammarAccess.getHyMappingModelAccess().getMappingsAssignment_1(), "rule__HyMappingModel__MappingsAssignment_1");
					put(grammarAccess.getDEDeltaInvokationAccess().getDeltaAssignment_1(), "rule__DEDeltaInvokation__DeltaAssignment_1");
					put(grammarAccess.getHyMappingAccess().getExpressionAssignment_0(), "rule__HyMapping__ExpressionAssignment_0");
					put(grammarAccess.getHyMappingAccess().getDeltaInvokationsAssignment_2(), "rule__HyMapping__DeltaInvokationsAssignment_2");
					put(grammarAccess.getHyMappingAccess().getValidSinceAssignment_3_1_0_0(), "rule__HyMapping__ValidSinceAssignment_3_1_0_0");
					put(grammarAccess.getHyMappingAccess().getValidUntilAssignment_3_1_0_2(), "rule__HyMapping__ValidUntilAssignment_3_1_0_2");
					put(grammarAccess.getHyMappingAccess().getValidSinceAssignment_3_1_1_0(), "rule__HyMapping__ValidSinceAssignment_3_1_1_0");
					put(grammarAccess.getHyMappingAccess().getValidUntilAssignment_3_1_2_2(), "rule__HyMapping__ValidUntilAssignment_3_1_2_2");
					put(grammarAccess.getGrammarEntryAccess().getExpressionAssignment(), "rule__GrammarEntry__ExpressionAssignment");
					put(grammarAccess.getEvoMappingOrAccess().getOperand2Assignment_1_2(), "rule__EvoMappingOr__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingAndAccess().getOperand2Assignment_1_2(), "rule__EvoMappingAnd__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingEqualAccess().getOperand2Assignment_1_2(), "rule__EvoMappingEqual__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingUnequalAccess().getOperand2Assignment_1_2(), "rule__EvoMappingUnequal__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingImplicationAccess().getOperand2Assignment_1_2(), "rule__EvoMappingImplication__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingEquivalenceAccess().getOperand2Assignment_1_2(), "rule__EvoMappingEquivalence__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingLessExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingLessExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getOperandsAssignment_1_2_1(), "rule__EvoMappingIfPossibleExpression__OperandsAssignment_1_2_1");
					put(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingLessOrEqualExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingGreaterExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingGreaterExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingGreaterOrEqualExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingSubtractionExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingSubtractionExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingAdditionExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingAdditionExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingModuloExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingModuloExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingMultiplicationExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingDivisionExpressionAccess().getOperand2Assignment_1_2(), "rule__EvoMappingDivisionExpression__Operand2Assignment_1_2");
					put(grammarAccess.getEvoMappingNegationAccess().getOperandAssignment_1(), "rule__EvoMappingNegation__OperandAssignment_1");
					put(grammarAccess.getEvoMappingNestedExpressionAccess().getOperandAssignment_1(), "rule__EvoMappingNestedExpression__OperandAssignment_1");
					put(grammarAccess.getEvoMappingNotAccess().getOperandAssignment_1(), "rule__EvoMappingNot__OperandAssignment_1");
					put(grammarAccess.getEvoMappingFeatureReferenceExpressionAccess().getFeatureAssignment(), "rule__EvoMappingFeatureReferenceExpression__FeatureAssignment");
					put(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getFeatureAssignment_1(), "rule__EvoMappingConditionalFeatureReferenceExpression__FeatureAssignment_1");
					put(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getVersionRestrictionAssignment_2(), "rule__EvoMappingConditionalFeatureReferenceExpression__VersionRestrictionAssignment_2");
					put(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getOperatorAssignment_1(), "rule__EvoMappingRelativeVersionRestriction__OperatorAssignment_1");
					put(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getVersionAssignment_2(), "rule__EvoMappingRelativeVersionRestriction__VersionAssignment_2");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerIncludedAssignment_0_1(), "rule__EvoMappingVersionRangeRestriction__LowerIncludedAssignment_0_1");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerVersionAssignment_1_1(), "rule__EvoMappingVersionRangeRestriction__LowerVersionAssignment_1_1");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperIncludedAssignment_1_3(), "rule__EvoMappingVersionRangeRestriction__UpperIncludedAssignment_1_3");
					put(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperVersionAssignment_2_1(), "rule__EvoMappingVersionRangeRestriction__UpperVersionAssignment_2_1");
					put(grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextInformationAssignment_1(), "rule__EvoMappingContextInformationReferenceExpression__ContextInformationAssignment_1");
					put(grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFeatureAssignment_0(), "rule__EvoMappingAttributeReferenceExpression__FeatureAssignment_0");
					put(grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getAttributeAssignment_2(), "rule__EvoMappingAttributeReferenceExpression__AttributeAssignment_2");
					put(grammarAccess.getEvoMappingValueExpressionAccess().getValueAssignment(), "rule__EvoMappingValueExpression__ValueAssignment");
					put(grammarAccess.getEvoMappingBooleanValueExpressionAccess().getValueAssignment_1_0(), "rule__EvoMappingBooleanValueExpression__ValueAssignment_1_0");
					put(grammarAccess.getEvoMappingNumberValueAccess().getValueAssignment(), "rule__EvoMappingNumberValue__ValueAssignment");
					put(grammarAccess.getEvoMappingMimumumExpressionAccess().getOperandAssignment_1(), "rule__EvoMappingMimumumExpression__OperandAssignment_1");
					put(grammarAccess.getEvoMappingMaximumExpressionAccess().getOperandAssignment_1(), "rule__EvoMappingMaximumExpression__OperandAssignment_1");
					put(grammarAccess.getEvoFormulaAccess().getTermAssignment_4(), "rule__EvoFormula__TermAssignment_4");
					put(grammarAccess.getEvoXOrAccess().getOperand2Assignment_1_2(), "rule__EvoXOr__Operand2Assignment_1_2");
					put(grammarAccess.getEvoOrAccess().getOperand2Assignment_1_2(), "rule__EvoOr__Operand2Assignment_1_2");
					put(grammarAccess.getEvoAndAccess().getOperand2Assignment_1_2(), "rule__EvoAnd__Operand2Assignment_1_2");
					put(grammarAccess.getEvoEqualAccess().getOperand2Assignment_1_2(), "rule__EvoEqual__Operand2Assignment_1_2");
					put(grammarAccess.getEvoUnequalAccess().getOperand2Assignment_1_2(), "rule__EvoUnequal__Operand2Assignment_1_2");
					put(grammarAccess.getEvoImplicationAccess().getOperand2Assignment_1_2(), "rule__EvoImplication__Operand2Assignment_1_2");
					put(grammarAccess.getEvoBiconditionalAccess().getOperand2Assignment_1_2(), "rule__EvoBiconditional__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetInclusionAccess().getOperand2Assignment_1_2(), "rule__EvoSetInclusion__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetIntersectionAccess().getOperand2Assignment_1_2(), "rule__EvoSetIntersection__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetUnionAccess().getOperand2Assignment_1_2(), "rule__EvoSetUnion__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetDifferenceAccess().getOperand2Assignment_1_2(), "rule__EvoSetDifference__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2Assignment_1_2(), "rule__EvoSetSymmetricDifference__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetCartesianProductAccess().getOperand2Assignment_1_2(), "rule__EvoSetCartesianProduct__Operand2Assignment_1_2");
					put(grammarAccess.getEvoSetCardinalityAccess().getOperandAssignment_1_0_1(), "rule__EvoSetCardinality__OperandAssignment_1_0_1");
					put(grammarAccess.getEvoSetCardinalityAccess().getOperandAssignment_1_1_2(), "rule__EvoSetCardinality__OperandAssignment_1_1_2");
					put(grammarAccess.getEvoElementOfAccess().getOperand2Assignment_1_2(), "rule__EvoElementOf__Operand2Assignment_1_2");
					put(grammarAccess.getEvoForAllAccess().getBoundedVariablesAssignment_2(), "rule__EvoForAll__BoundedVariablesAssignment_2");
					put(grammarAccess.getEvoForAllAccess().getBoundedVariablesAssignment_3_1(), "rule__EvoForAll__BoundedVariablesAssignment_3_1");
					put(grammarAccess.getEvoForAllAccess().getOperandAssignment_5(), "rule__EvoForAll__OperandAssignment_5");
					put(grammarAccess.getEvoExistsAccess().getBoundedVariablesAssignment_2(), "rule__EvoExists__BoundedVariablesAssignment_2");
					put(grammarAccess.getEvoExistsAccess().getOperandAssignment_4(), "rule__EvoExists__OperandAssignment_4");
					put(grammarAccess.getEvoNotAccess().getOperandAssignment_0_2(), "rule__EvoNot__OperandAssignment_0_2");
					put(grammarAccess.getEvoNotAccess().getOperandAssignment_1_1(), "rule__EvoNot__OperandAssignment_1_1");
					put(grammarAccess.getEvoSatisfiableAccess().getVariablesAssignment_3(), "rule__EvoSatisfiable__VariablesAssignment_3");
					put(grammarAccess.getEvoSatisfiableAccess().getVariablesAssignment_4_1(), "rule__EvoSatisfiable__VariablesAssignment_4_1");
					put(grammarAccess.getEvoSizeAccess().getSizeAssignment_1(), "rule__EvoSize__SizeAssignment_1");
					put(grammarAccess.getEvoVariableTermAccess().getVariableAssignment_0(), "rule__EvoVariableTerm__VariableAssignment_0");
					put(grammarAccess.getEvoVariableTermAccess().getTypeAssignment_1(), "rule__EvoVariableTerm__TypeAssignment_1");
					put(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableAssignment_2(), "rule__EvoApplicationConstraintTerm__VariableAssignment_2");
					put(grammarAccess.getEvoFeatureTypeAccess().getVariablesAssignment_2_1(), "rule__EvoFeatureType__VariablesAssignment_2_1");
					put(grammarAccess.getEvoFeatureTypeAccess().getVariablesAssignment_2_2_1(), "rule__EvoFeatureType__VariablesAssignment_2_2_1");
					put(grammarAccess.getEvoFeatureTypeAccess().getTypeAssignment_4(), "rule__EvoFeatureType__TypeAssignment_4");
					put(grammarAccess.getEvoGroupTypeAccess().getVariablesAssignment_2_1(), "rule__EvoGroupType__VariablesAssignment_2_1");
					put(grammarAccess.getEvoGroupTypeAccess().getVariablesAssignment_2_2_1(), "rule__EvoGroupType__VariablesAssignment_2_2_1");
					put(grammarAccess.getEvoGroupTypeAccess().getTypeAssignment_4(), "rule__EvoGroupType__TypeAssignment_4");
					put(grammarAccess.getEvoGroupTermAccess().getVariableAssignment_0(), "rule__EvoGroupTerm__VariableAssignment_0");
					put(grammarAccess.getEvoGroupTermAccess().getTypeAssignment_1(), "rule__EvoGroupTerm__TypeAssignment_1");
					put(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_1(), "rule__EvoSetTerm__VariablesAssignment_1");
					put(grammarAccess.getEvoSetTermAccess().getVariablesAssignment_2_1(), "rule__EvoSetTerm__VariablesAssignment_2_1");
					put(grammarAccess.getEvoParentOfAccess().getVariableAssignment_2(), "rule__EvoParentOf__VariableAssignment_2");
					put(grammarAccess.getEvoSiblingsOfAccess().getVariableAssignment_2(), "rule__EvoSiblingsOf__VariableAssignment_2");
					put(grammarAccess.getEvoChildrenOfAccess().getVariableAssignment_2(), "rule__EvoChildrenOf__VariableAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DwMappingDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DwMappingDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
