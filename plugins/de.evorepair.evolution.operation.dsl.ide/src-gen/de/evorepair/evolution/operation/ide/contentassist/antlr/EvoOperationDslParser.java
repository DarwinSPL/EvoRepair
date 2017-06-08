/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.evolution.operation.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.evorepair.evolution.operation.ide.contentassist.antlr.internal.InternalEvoOperationDslParser;
import de.evorepair.evolution.operation.services.EvoOperationDslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EvoOperationDslParser extends AbstractContentAssistParser {

	@Inject
	private EvoOperationDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEvoOperationDslParser createParser() {
		InternalEvoOperationDslParser result = new InternalEvoOperationDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEvoVariableAccess().getAlternatives(), "rule__EvoVariable__Alternatives");
					put(grammarAccess.getEvoVariableTypeAccess().getAlternatives(), "rule__EvoVariableType__Alternatives");
					put(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives(), "rule__EvoFeatureVariableType__Alternatives");
					put(grammarAccess.getEvoOperationContainerAccess().getGroup(), "rule__EvoOperationContainer__Group__0");
					put(grammarAccess.getEvoOperationAccess().getGroup(), "rule__EvoOperation__Group__0");
					put(grammarAccess.getEvoGenericVariableAccess().getGroup(), "rule__EvoGenericVariable__Group__0");
					put(grammarAccess.getEvoFeatureVariableAccess().getGroup(), "rule__EvoFeatureVariable__Group__0");
					put(grammarAccess.getEvoFeatureVariableAccess().getGroup_2(), "rule__EvoFeatureVariable__Group_2__0");
					put(grammarAccess.getEvoGroupVariableAccess().getGroup(), "rule__EvoGroupVariable__Group__0");
					put(grammarAccess.getEvoSetVariableAccess().getGroup(), "rule__EvoSetVariable__Group__0");
					put(grammarAccess.getEvoSetVariableAccess().getGroup_2(), "rule__EvoSetVariable__Group_2__0");
					put(grammarAccess.getEvoSetVariableAccess().getGroup_2_2(), "rule__EvoSetVariable__Group_2_2__0");
					put(grammarAccess.getEvoMappingVariableAccess().getGroup(), "rule__EvoMappingVariable__Group__0");
					put(grammarAccess.getGrammarEntryAccess().getContainerAssignment(), "rule__GrammarEntry__ContainerAssignment");
					put(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0(), "rule__EvoOperationContainer__OperationsAssignment_0");
					put(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1(), "rule__EvoOperationContainer__OperationsAssignment_1");
					put(grammarAccess.getEvoOperationAccess().getNameAssignment_1(), "rule__EvoOperation__NameAssignment_1");
					put(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6(), "rule__EvoOperation__VariablesAssignment_6");
					put(grammarAccess.getEvoOperationAccess().getVariablesAssignment_7(), "rule__EvoOperation__VariablesAssignment_7");
					put(grammarAccess.getEvoOperationAccess().getDateAssignment_11(), "rule__EvoOperation__DateAssignment_11");
					put(grammarAccess.getModelAccess().getVariablesAssignment(), "rule__Model__VariablesAssignment");
					put(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1(), "rule__EvoGenericVariable__NameAssignment_1");
					put(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2(), "rule__EvoGenericVariable__VariableTypeAssignment_2");
					put(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1(), "rule__EvoFeatureVariable__NameAssignment_1");
					put(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1(), "rule__EvoFeatureVariable__FeatureTypeAssignment_2_1");
					put(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1(), "rule__EvoGroupVariable__NameAssignment_1");
					put(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1(), "rule__EvoSetVariable__NameAssignment_1");
					put(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1(), "rule__EvoSetVariable__ElementsAssignment_2_1");
					put(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1(), "rule__EvoSetVariable__ElementsAssignment_2_2_1");
					put(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1(), "rule__EvoMappingVariable__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EvoOperationDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EvoOperationDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
