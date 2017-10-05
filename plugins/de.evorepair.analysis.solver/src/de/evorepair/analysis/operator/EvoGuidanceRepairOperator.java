package de.evorepair.analysis.operator;

import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import eu.hyvar.feature.expression.HyExpression;


public abstract class EvoGuidanceRepairOperator {
	protected EvoResourceProvider resourceProvider;
	
	protected EObject model;
	protected EObject linkedModel;
	
	public abstract EObject perform(EObject model, EObject linkedModel, HyExpression expression, EvoResourceProvider resourceProvider);

}
