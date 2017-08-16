package de.evorepair.analysis.operator;

import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.provider.EvoResourceProvider;
import eu.hyvar.feature.expression.HyExpression;


public abstract class EvoGuidanceRepairOperator {
	protected EvoResourceProvider resourceProvider;
	
	protected EObject model;
	protected EObject modelCopy;
	
	public abstract EObject perform(EObject model, HyExpression expression, EvoResourceProvider resourceProvider);

}
