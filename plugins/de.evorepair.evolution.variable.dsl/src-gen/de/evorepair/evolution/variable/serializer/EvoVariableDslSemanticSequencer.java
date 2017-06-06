/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.evolution.variable.serializer;

import com.google.inject.Inject;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariablePackage;
import de.evorepair.evolution.variable.evoVariableDsl.EvoVariableDslPackage;
import de.evorepair.evolution.variable.evoVariableDsl.Model;
import de.evorepair.evolution.variable.services.EvoVariableDslGrammarAccess;
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
public class EvoVariableDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EvoVariableDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EvoVariableDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EvoVariableDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		else if (epackage == EvoVariablePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EvoVariablePackage.EVO_FEATURE_VARIABLE:
				sequence_EvoFeatureVariable(context, (EvoFeatureVariable) semanticObject); 
				return; 
			case EvoVariablePackage.EVO_VARIABLE:
				sequence_EvoVariable(context, (EvoVariable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EvoFeatureVariable returns EvoFeatureVariable
	 *
	 * Constraint:
	 *     (name=ID index=INT featureType=EvoFeatureVariableType)
	 */
	protected void sequence_EvoFeatureVariable(ISerializationContext context, EvoFeatureVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__INDEX));
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_FEATURE_VARIABLE__FEATURE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_FEATURE_VARIABLE__FEATURE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvoFeatureVariableAccess().getIndexINTTerminalRuleCall_2_1_0(), semanticObject.getIndex());
		feeder.accept(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_3_2_1_0(), semanticObject.getFeatureType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvoVariable returns EvoVariable
	 *
	 * Constraint:
	 *     (name=ID index=INT variableType=EvoVariableType)
	 */
	protected void sequence_EvoVariable(ISerializationContext context, EvoVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__INDEX));
			if (transientValues.isValueTransient(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__VARIABLE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvoVariablePackage.Literals.EVO_VARIABLE__VARIABLE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0(), semanticObject.getIndex());
		feeder.accept(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0(), semanticObject.getVariableType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     variables+=EvoVariable+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}