package de.evorepair.analysis.operator;

import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.evolution.variable.EvoFeatureVariable;
import de.evorepair.evolution.variable.EvoVariable;
import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace;
import de.evorepair.logic.EvoVariableExpression;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.expression.HyAdditionExpression;
import eu.hyvar.feature.expression.HyAndExpression;
import eu.hyvar.feature.expression.HyAttributeReferenceExpression;
import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyBooleanValueExpression;
import eu.hyvar.feature.expression.HyConditionalFeatureReferenceExpression;
import eu.hyvar.feature.expression.HyContextInformationReferenceExpression;
import eu.hyvar.feature.expression.HyDivisionExpression;
import eu.hyvar.feature.expression.HyEqualExpression;
import eu.hyvar.feature.expression.HyEquivalenceExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyExpressionFactory;
import eu.hyvar.feature.expression.HyFeatureReferenceExpression;
import eu.hyvar.feature.expression.HyGreaterExpression;
import eu.hyvar.feature.expression.HyGreaterOrEqualExpression;
import eu.hyvar.feature.expression.HyIfPossibleExpression;
import eu.hyvar.feature.expression.HyImpliesExpression;
import eu.hyvar.feature.expression.HyLessExpression;
import eu.hyvar.feature.expression.HyLessOrEqualExpression;
import eu.hyvar.feature.expression.HyMaximumExpression;
import eu.hyvar.feature.expression.HyMinimumExpression;
import eu.hyvar.feature.expression.HyModuloExpression;
import eu.hyvar.feature.expression.HyMultiplicationExpression;
import eu.hyvar.feature.expression.HyNegationExpression;
import eu.hyvar.feature.expression.HyNestedExpression;
import eu.hyvar.feature.expression.HyNotEqualExpression;
import eu.hyvar.feature.expression.HyNotExpression;
import eu.hyvar.feature.expression.HyOrExpression;
import eu.hyvar.feature.expression.HySetExpression;
import eu.hyvar.feature.expression.HySubtractionExpression;
import eu.hyvar.feature.expression.HyUnaryExpression;
import eu.hyvar.feature.expression.HyValueExpression;
import eu.hyvar.feature.mapping.HyMapping;
import eu.hyvar.feature.mapping.HyMappingModel;

public class EvoGuidanceMappingActionOperator extends EvoGuidanceRepairOperator{

	private boolean featureMatch(HyFeature feature1, HyFeature feature2) {
		return feature1.equals(feature2) || feature1.getId().equals(feature2.getId());
	}
	
	private boolean expressionsMatch(HyExpression expression1, HyExpression expression2) {
		if(expression1 instanceof HyAndExpression && expression2  instanceof HyAndExpression) {
			return true;
		}else if(expression1 instanceof HyOrExpression && expression2  instanceof HyOrExpression) {
			return true;
		}else if(expression1 instanceof HyNotExpression && expression2  instanceof HyNotExpression) {
			return true;
		}else if(expression1 instanceof HyEquivalenceExpression && expression2  instanceof HyEquivalenceExpression) {
			return true;
		}else if(expression1 instanceof HyImpliesExpression && expression2  instanceof HyImpliesExpression) {
			return true;
		}else if(expression1 instanceof HyNestedExpression && expression2  instanceof HyNestedExpression) {
			return true;
		}else if(expression1 instanceof HyFeatureReferenceExpression && expression2  instanceof HyFeatureReferenceExpression) {
			return featureMatch(((HyFeatureReferenceExpression)expression1).getFeature(), ((HyFeatureReferenceExpression)expression2).getFeature());
		}else if(expression1 instanceof HyFeatureReferenceExpression && expression2 instanceof EvoVariableExpression) {
			EvoVariable variable = ((EvoVariableExpression)expression2).getVariable();
			
			if(variable instanceof EvoFeatureVariable) {
				return featureMatch(((HyFeatureReferenceExpression)expression1).getFeature(), ((EvoFeatureVariable)variable).getFeature());
			}
			
			return false;
		}else if(expression1 instanceof EvoVariableExpression && expression2 instanceof EvoVariableExpression) {
			EvoVariable variable1 = ((EvoVariableExpression)expression1).getVariable();
			EvoVariable variable2 = ((EvoVariableExpression)expression2).getVariable();
			
			if(variable1 instanceof EvoFeatureVariable && variable2 instanceof EvoFeatureVariable) {
				return featureMatch(((EvoFeatureVariable)variable1).getFeature(), ((EvoFeatureVariable)variable2).getFeature());				
			}
			
			return false;
		}else if(expression1 instanceof HyBooleanValueExpression && expression2  instanceof HyBooleanValueExpression) {
			return true;
		}else if(expression1 instanceof HyConditionalFeatureReferenceExpression && expression2  instanceof HyConditionalFeatureReferenceExpression) {
			return true;
		}else if(expression1 instanceof HyValueExpression && expression2  instanceof HyValueExpression) {
			return true;
		}else if(expression1 instanceof HyAttributeReferenceExpression && expression2  instanceof HyAttributeReferenceExpression) {
			return true;
		}else if(expression1 instanceof HyGreaterExpression && expression2  instanceof HyGreaterExpression) {
			return true;
		}else if(expression1 instanceof HyLessExpression && expression2  instanceof HyLessExpression) {
			return true;
		}else if(expression1 instanceof HyGreaterOrEqualExpression && expression2  instanceof HyGreaterOrEqualExpression) {
			return true;
		}else if(expression1 instanceof HyLessOrEqualExpression && expression2  instanceof HyLessOrEqualExpression) {
			return true;
		}else if(expression1 instanceof HyEqualExpression && expression2  instanceof HyEqualExpression) {
			return true;
		}else if(expression1 instanceof HyNotEqualExpression && expression2  instanceof HyNotEqualExpression) {
			return true;
		}else if(expression1 instanceof HyAdditionExpression && expression2  instanceof HyAdditionExpression) {
			return true;
		}else if(expression1 instanceof HySubtractionExpression && expression2  instanceof HySubtractionExpression) {
			return true;
		}else if(expression1 instanceof HyMultiplicationExpression && expression2  instanceof HyMultiplicationExpression) {
			return true;
		}else if(expression1 instanceof HyDivisionExpression && expression2  instanceof HyDivisionExpression) {
			return true;
		}else if(expression1 instanceof HyModuloExpression && expression2  instanceof HyModuloExpression) {
			return true;
		}else if(expression1 instanceof HyNegationExpression && expression2  instanceof HyNegationExpression) {
			return true;
		}else if(expression1 instanceof HyContextInformationReferenceExpression && expression2  instanceof HyContextInformationReferenceExpression) {
			return true;
		}else if(expression1 instanceof HyMaximumExpression && expression2  instanceof HyMaximumExpression) {
			return true;
		}else if(expression1 instanceof HyMinimumExpression && expression2  instanceof HyMinimumExpression) {
			return true;
		}else if(expression1 instanceof HyIfPossibleExpression && expression2  instanceof HyIfPossibleExpression) {
			return true;
		}else if(expression1 instanceof HySetExpression && expression2  instanceof HySetExpression) {
			return true;
		}
		
		return false;
	}
	
	private HyExpression replaceVariableReferenceExpressionWithFeatureReferenceExpression(HyExpression replacementExpression) {
		// replace the expression containing the reference to the variable with a actual feature reference like it is used in HyExpressions per default
		if(replacementExpression instanceof EvoVariableExpression) {
			EvoVariable variable = ((EvoVariableExpression)replacementExpression).getVariable();
			
			if(variable instanceof EvoFeatureVariable) {
				HyFeatureReferenceExpression correctReplacementExpression = HyExpressionFactory.eINSTANCE.createHyFeatureReferenceExpression();
				correctReplacementExpression.setFeature(((EvoFeatureVariable)variable).getFeature());
				
				return correctReplacementExpression;
			}
		}	
		
		return replacementExpression;
	}
	
	private void replaceExpression(HyExpression expression, HyExpression searchExpression, HyExpression replacementExpression) {
		replacementExpression = replaceVariableReferenceExpressionWithFeatureReferenceExpression(replacementExpression);
		
		if(expression.eContainer() instanceof HyMapping) {
			((HyMapping)expression.eContainer()).setExpression(replacementExpression);
		}else if(expression.eContainer() instanceof HyUnaryExpression) {
			((HyUnaryExpression)expression.eContainer()).setOperand(replacementExpression);
		}else if(expression.eContainer() instanceof HyBinaryExpression) {
			
			
			HyBinaryExpression container = (HyBinaryExpression)expression.eContainer();
			
			if(expressionsMatch(container.getOperand1(), searchExpression))
				container.setOperand1(replacementExpression);
			else
				container.setOperand2(replacementExpression);
		}
	}
	
	private boolean expressionIsContainedInExpression(HyExpression expression, HyExpression searchExpression, HyExpression replacementExpression) {
		// subtree is not specified and therefore per definition contained within expression
		if(searchExpression == null)
			return true;
		
		// expression is null so the new expression cannot be contained within a null object
		if(expression == null)
			return false;
		
		if(expressionsAreIdentical(expression, searchExpression)) {
			// replace the expression and return true
			replaceExpression(expression, searchExpression, replacementExpression);
			
			return true;
		}
		
		if(expression instanceof HyBinaryExpression) {
			HyBinaryExpression binaryExpression = (HyBinaryExpression)expression;
			
			return expressionIsContainedInExpression(binaryExpression.getOperand1(), searchExpression, replacementExpression) ||
				   expressionIsContainedInExpression(binaryExpression.getOperand2(), searchExpression, replacementExpression);
		}else if(expression instanceof HyUnaryExpression) {
			HyUnaryExpression unaryExpression = (HyUnaryExpression)expression;
		
			return expressionIsContainedInExpression(unaryExpression.getOperand(), searchExpression, replacementExpression);
		}else if(expression instanceof HyFeatureReferenceExpression) {
			if(searchExpression instanceof HyFeatureReferenceExpression) {
				return featureMatch(((HyFeatureReferenceExpression)expression).getFeature(), ((HyFeatureReferenceExpression)searchExpression).getFeature());
			}else
				return false;
		}else if(expression instanceof EvoVariableExpression) {
			return false;
		}else {
			System.err.println("No valid expression object");
			return false;
		}
	}
	private boolean expressionsAreIdentical(HyExpression expression, HyExpression searchExpression){
		boolean match = expressionsMatch(expression, searchExpression);		
		
		if(expression instanceof HyBinaryExpression) {
			HyBinaryExpression binaryExpression = (HyBinaryExpression)expression;
			
			if(searchExpression instanceof HyBinaryExpression) {
				return  match && 
						expressionsAreIdentical(binaryExpression.getOperand1(), ((HyBinaryExpression)searchExpression).getOperand1()) &&
						expressionsAreIdentical(binaryExpression.getOperand2(), ((HyBinaryExpression)searchExpression).getOperand2());				
			}else {
				return match && 
						expressionsAreIdentical(binaryExpression.getOperand1(), ((HyUnaryExpression)searchExpression).getOperand()) &&
						expressionsAreIdentical(binaryExpression.getOperand2(), ((HyUnaryExpression)searchExpression).getOperand());		
			}			
		}else if(expression instanceof HyUnaryExpression){
			HyUnaryExpression unaryExpression = (HyUnaryExpression)expression;
			
			
			if(searchExpression instanceof HyBinaryExpression) {
				return match && 
						(expressionsAreIdentical(unaryExpression.getOperand(), ((HyBinaryExpression)searchExpression).getOperand1()) ||
						 expressionsAreIdentical(unaryExpression.getOperand(), ((HyBinaryExpression)searchExpression).getOperand2()));				
			}else if(searchExpression instanceof HyUnaryExpression) {
				return match && 
						(expressionsAreIdentical(unaryExpression.getOperand(), ((HyUnaryExpression)searchExpression).getOperand()));
			}else {
				return match;
			}
		}else if(expression instanceof HyFeatureReferenceExpression) {
			if(searchExpression instanceof HyBinaryExpression) {
				return match && 
						(expressionsAreIdentical(expression, ((HyBinaryExpression)searchExpression).getOperand1()) ||
						 expressionsAreIdentical(expression, ((HyBinaryExpression)searchExpression).getOperand2()));				
			}else if(searchExpression instanceof HyUnaryExpression) {
				return match && 
						(expressionsAreIdentical(expression, ((HyUnaryExpression)searchExpression).getOperand()));
			}else if(searchExpression instanceof EvoVariableExpression) {
				EvoVariable variable = ((EvoVariableExpression)searchExpression).getVariable();
				
				if(variable instanceof EvoFeatureVariable) {
					return featureMatch(((EvoFeatureVariable)variable).getFeature(), ((HyFeatureReferenceExpression)expression).getFeature());
				}else
					return match;
			}else {
				return match;
			}

		}else {
			System.err.println("No valid expression object");
			return false;
		}
	}
	
	@Override
	public EObject perform(EObject model, EObject linkedModel, HyExpression expression, EvoResourceProvider resourceProvider) {
		this.model = model;
		this.linkedModel = linkedModel;
		
		this.resourceProvider = resourceProvider;
		
		// do nothing in case the parameter have the wrong type
		if(!(model instanceof HyMappingModel) || !(expression instanceof EvoMappingReplace))
			return model;
		
		EvoMappingReplace replaceExpression = (EvoMappingReplace)expression;
		
		//EcoreIOUtil.copyResourceTo(model.eResource(), newFile)
		for(HyMapping mapping : ((HyMappingModel)model).getMappings()) {
			expressionIsContainedInExpression(mapping.getExpression(), replaceExpression.getOperand1(), replaceExpression.getOperand2());
		}
		
		return model;
	}
}
