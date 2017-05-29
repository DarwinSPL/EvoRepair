/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.logic.serializer;

import com.google.inject.Inject;
import de.evorepair.logic.evoLogicLanguage.CommandDocument;
import de.evorepair.logic.evoLogicLanguage.EvoAnd;
import de.evorepair.logic.evoLogicLanguage.EvoArbitratyFeatureVariable;
import de.evorepair.logic.evoLogicLanguage.EvoFormula;
import de.evorepair.logic.evoLogicLanguage.EvoLogicLanguagePackage;
import de.evorepair.logic.evoLogicLanguage.EvoOr;
import de.evorepair.logic.evoLogicLanguage.EvoVariableTerm;
import de.evorepair.logic.evoLogicLanguage.EvoXOr;
import de.evorepair.logic.evoLogicLanguage.Import;
import de.evorepair.logic.services.EvoLogicLanguageGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EvoLogicLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EvoLogicLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EvoLogicLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EvoLogicLanguagePackage.COMMAND_DOCUMENT:
				sequence_CommandDocument(context, (CommandDocument) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_AND:
				sequence_EvoAnd(context, (EvoAnd) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_ARBITRATY_FEATURE_VARIABLE:
				sequence_EvoArbitratyFeatureVariable(context, (EvoArbitratyFeatureVariable) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_FORMULA:
				sequence_EvoFormula(context, (EvoFormula) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_OR:
				sequence_EvoOr(context, (EvoOr) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_VARIABLE_TERM:
				sequence_EvoVariableTerm(context, (EvoVariableTerm) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.EVO_XOR:
				sequence_EvoXOr(context, (EvoXOr) semanticObject); 
				return; 
			case EvoLogicLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CommandDocument returns CommandDocument
	 *
	 * Constraint:
	 *     (imports+=Import formula=EvoFormula)
	 */
	protected void sequence_CommandDocument(ISerializationContext context, CommandDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EvoAbstractTerm returns EvoAnd
	 *     EvoOr returns EvoAnd
	 *     EvoOr.EvoOr_1_0 returns EvoAnd
	 *     EvoXOr returns EvoAnd
	 *     EvoXOr.EvoXOr_1_0 returns EvoAnd
	 *     EvoAnd returns EvoAnd
	 *     EvoAnd.EvoAnd_1_0 returns EvoAnd
	 *     EvoAbstractOneParameterTerm returns EvoAnd
	 *
	 * Constraint:
	 *     (leftElement=EvoAnd_EvoAnd_1_0 rightElement=EvoAbstractOneParameterTerm)
	 */
	protected void sequence_EvoAnd(ISerializationContext context, EvoAnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_AND__LEFT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_AND__LEFT_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_AND__RIGHT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_AND__RIGHT_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoAndAccess().getEvoAndLeftElementAction_1_0(), semanticObject.getLeftElement());
		feeder.accept(grammarAccess.getEvoAndAccess().getRightElementEvoAbstractOneParameterTermParserRuleCall_1_2_0(), semanticObject.getRightElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvoVariable returns EvoArbitratyFeatureVariable
	 *     EvoArbitratyFeatureVariable returns EvoArbitratyFeatureVariable
	 *
	 * Constraint:
	 *     feature=[HyFeature|ID]
	 */
	protected void sequence_EvoArbitratyFeatureVariable(ISerializationContext context, EvoArbitratyFeatureVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_ARBITRATY_FEATURE_VARIABLE__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_ARBITRATY_FEATURE_VARIABLE__FEATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EvoLogicLanguagePackage.Literals.EVO_ARBITRATY_FEATURE_VARIABLE__FEATURE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvoFormula returns EvoFormula
	 *
	 * Constraint:
	 *     ((variables+=EvoVariable variables+=EvoVariable*)? term=EvoAbstractTerm)
	 */
	protected void sequence_EvoFormula(ISerializationContext context, EvoFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EvoAbstractTerm returns EvoOr
	 *     EvoOr returns EvoOr
	 *     EvoOr.EvoOr_1_0 returns EvoOr
	 *     EvoXOr returns EvoOr
	 *     EvoXOr.EvoXOr_1_0 returns EvoOr
	 *     EvoAnd returns EvoOr
	 *     EvoAnd.EvoAnd_1_0 returns EvoOr
	 *     EvoAbstractOneParameterTerm returns EvoOr
	 *
	 * Constraint:
	 *     (leftElement=EvoOr_EvoOr_1_0 rightElement=EvoAnd)
	 */
	protected void sequence_EvoOr(ISerializationContext context, EvoOr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_OR__LEFT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_OR__LEFT_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_OR__RIGHT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_OR__RIGHT_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoOrAccess().getEvoOrLeftElementAction_1_0(), semanticObject.getLeftElement());
		feeder.accept(grammarAccess.getEvoOrAccess().getRightElementEvoAndParserRuleCall_1_2_0(), semanticObject.getRightElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvoVariableTerm returns EvoVariableTerm
	 *     EvoAbstractTerm returns EvoVariableTerm
	 *     EvoOr returns EvoVariableTerm
	 *     EvoOr.EvoOr_1_0 returns EvoVariableTerm
	 *     EvoXOr returns EvoVariableTerm
	 *     EvoXOr.EvoXOr_1_0 returns EvoVariableTerm
	 *     EvoAnd returns EvoVariableTerm
	 *     EvoAnd.EvoAnd_1_0 returns EvoVariableTerm
	 *     EvoAbstractOneParameterTerm returns EvoVariableTerm
	 *
	 * Constraint:
	 *     variable=[EvoVariable|ID]
	 */
	protected void sequence_EvoVariableTerm(ISerializationContext context, EvoVariableTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_VARIABLE_TERM__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_VARIABLE_TERM__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableIDTerminalRuleCall_3_0_1(), semanticObject.eGet(EvoLogicLanguagePackage.Literals.EVO_VARIABLE_TERM__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvoXOr returns EvoXOr
	 *     EvoXOr.EvoXOr_1_0 returns EvoXOr
	 *
	 * Constraint:
	 *     (leftElement=EvoXOr_EvoXOr_1_0 rightElement=EvoAnd)
	 */
	protected void sequence_EvoXOr(ISerializationContext context, EvoXOr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_XOR__LEFT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_XOR__LEFT_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.EVO_XOR__RIGHT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.EVO_XOR__RIGHT_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoXOrAccess().getEvoXOrLeftElementAction_1_0(), semanticObject.getLeftElement());
		feeder.accept(grammarAccess.getEvoXOrAccess().getRightElementEvoAndParserRuleCall_1_2_0(), semanticObject.getRightElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoLogicLanguagePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoLogicLanguagePackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
}
