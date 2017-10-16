package de.evorepair.analysis.operator;

import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.provider.EvoResourceProvider;
import eu.hyvar.feature.expression.HyExpression;

/**
 * Abstract representation for a repair operation. Use this class to implement your repair operator for a custom resource.
 * To do this, just overwrite the function perform.
 * 
 * @author Gil Engel
 *
 */
public abstract class EvoGuidanceRepairOperator {
	protected EvoResourceProvider resourceProvider;
	
	protected EObject model;
	protected EObject linkedModel;
	
	/**
	 * Performs a repair operation for the given model. In case the repair operation was successfull, the function will return the repaired model
	 * @param model the model that is about to be repaired. This is often a copy of the original model
	 * @param linkedModel the original model needed for references
	 * @param expression represents the repair operation that will be performed
	 * @param resourceProvider provider for additional resources
	 * @return the function will return the changed model with the applied repair operation.
	 */
	public abstract EObject perform(EObject model, EObject linkedModel, HyExpression expression, EvoResourceProvider resourceProvider);

}
