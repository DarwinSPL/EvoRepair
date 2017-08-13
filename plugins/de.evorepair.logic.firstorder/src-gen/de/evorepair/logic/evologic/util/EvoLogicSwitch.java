/**
 */
package de.evorepair.logic.evologic.util;

import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariable;

import de.evorepair.logic.evologic.*;

import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyUnaryExpression;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evologic.EvoLogicPackage
 * @generated
 */
public class EvoLogicSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvoLogicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoLogicSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = EvoLogicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case EvoLogicPackage.EVO_BINARY_EXPRESSION:
			{
				EvoBinaryExpression evoBinaryExpression = (EvoBinaryExpression)theEObject;
				T result = caseEvoBinaryExpression(evoBinaryExpression);
				if (result == null) result = caseHyBinaryExpression(evoBinaryExpression);
				if (result == null) result = caseHyExpression(evoBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_XOR:
			{
				EvoXOr evoXOr = (EvoXOr)theEObject;
				T result = caseEvoXOr(evoXOr);
				if (result == null) result = caseEvoBinaryExpression(evoXOr);
				if (result == null) result = caseHyBinaryExpression(evoXOr);
				if (result == null) result = caseHyExpression(evoXOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_NOT:
			{
				EvoNot evoNot = (EvoNot)theEObject;
				T result = caseEvoNot(evoNot);
				if (result == null) result = caseHyUnaryExpression(evoNot);
				if (result == null) result = caseHyExpression(evoNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_BICONDITIONAL:
			{
				EvoBiconditional evoBiconditional = (EvoBiconditional)theEObject;
				T result = caseEvoBiconditional(evoBiconditional);
				if (result == null) result = caseEvoBinaryExpression(evoBiconditional);
				if (result == null) result = caseHyBinaryExpression(evoBiconditional);
				if (result == null) result = caseHyExpression(evoBiconditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_FORMULA_VARIABLE:
			{
				EvoFormulaVariable evoFormulaVariable = (EvoFormulaVariable)theEObject;
				T result = caseEvoFormulaVariable(evoFormulaVariable);
				if (result == null) result = caseHyExpression(evoFormulaVariable);
				if (result == null) result = caseEvoVariable(evoFormulaVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_FORMULA_SET_VARIABLE:
			{
				EvoFormulaSetVariable evoFormulaSetVariable = (EvoFormulaSetVariable)theEObject;
				T result = caseEvoFormulaSetVariable(evoFormulaSetVariable);
				if (result == null) result = caseEvoSetVariable(evoFormulaSetVariable);
				if (result == null) result = caseEvoVariable(evoFormulaSetVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_ABSTRACT_SET_TERM:
			{
				EvoAbstractSetTerm evoAbstractSetTerm = (EvoAbstractSetTerm)theEObject;
				T result = caseEvoAbstractSetTerm(evoAbstractSetTerm);
				if (result == null) result = caseHyExpression(evoAbstractSetTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_INCLUSION:
			{
				EvoSetInclusion evoSetInclusion = (EvoSetInclusion)theEObject;
				T result = caseEvoSetInclusion(evoSetInclusion);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetInclusion);
				if (result == null) result = caseEvoBinaryExpression(evoSetInclusion);
				if (result == null) result = caseHyBinaryExpression(evoSetInclusion);
				if (result == null) result = caseHyExpression(evoSetInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_INTERSECTION:
			{
				EvoSetIntersection evoSetIntersection = (EvoSetIntersection)theEObject;
				T result = caseEvoSetIntersection(evoSetIntersection);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetIntersection);
				if (result == null) result = caseEvoBinaryExpression(evoSetIntersection);
				if (result == null) result = caseHyBinaryExpression(evoSetIntersection);
				if (result == null) result = caseHyExpression(evoSetIntersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_UNION:
			{
				EvoSetUnion evoSetUnion = (EvoSetUnion)theEObject;
				T result = caseEvoSetUnion(evoSetUnion);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetUnion);
				if (result == null) result = caseEvoBinaryExpression(evoSetUnion);
				if (result == null) result = caseHyBinaryExpression(evoSetUnion);
				if (result == null) result = caseHyExpression(evoSetUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_DIFFERENCE:
			{
				EvoSetDifference evoSetDifference = (EvoSetDifference)theEObject;
				T result = caseEvoSetDifference(evoSetDifference);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetDifference);
				if (result == null) result = caseEvoBinaryExpression(evoSetDifference);
				if (result == null) result = caseHyBinaryExpression(evoSetDifference);
				if (result == null) result = caseHyExpression(evoSetDifference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_SYMMETRIC_DIFFERENCE:
			{
				EvoSetSymmetricDifference evoSetSymmetricDifference = (EvoSetSymmetricDifference)theEObject;
				T result = caseEvoSetSymmetricDifference(evoSetSymmetricDifference);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetSymmetricDifference);
				if (result == null) result = caseEvoBinaryExpression(evoSetSymmetricDifference);
				if (result == null) result = caseHyBinaryExpression(evoSetSymmetricDifference);
				if (result == null) result = caseHyExpression(evoSetSymmetricDifference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_CARTESIAN_PRODUCT:
			{
				EvoSetCartesianProduct evoSetCartesianProduct = (EvoSetCartesianProduct)theEObject;
				T result = caseEvoSetCartesianProduct(evoSetCartesianProduct);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetCartesianProduct);
				if (result == null) result = caseEvoBinaryExpression(evoSetCartesianProduct);
				if (result == null) result = caseHyBinaryExpression(evoSetCartesianProduct);
				if (result == null) result = caseHyExpression(evoSetCartesianProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_CARDINALITY:
			{
				EvoSetCardinality evoSetCardinality = (EvoSetCardinality)theEObject;
				T result = caseEvoSetCardinality(evoSetCardinality);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetCardinality);
				if (result == null) result = caseHyUnaryExpression(evoSetCardinality);
				if (result == null) result = caseHyExpression(evoSetCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_ELEMENT_OF:
			{
				EvoElementOf evoElementOf = (EvoElementOf)theEObject;
				T result = caseEvoElementOf(evoElementOf);
				if (result == null) result = caseEvoAbstractSetTerm(evoElementOf);
				if (result == null) result = caseEvoBinaryExpression(evoElementOf);
				if (result == null) result = caseHyBinaryExpression(evoElementOf);
				if (result == null) result = caseHyExpression(evoElementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_NOT_ELEMENT_OF:
			{
				EvoSetNotElementOf evoSetNotElementOf = (EvoSetNotElementOf)theEObject;
				T result = caseEvoSetNotElementOf(evoSetNotElementOf);
				if (result == null) result = caseEvoAbstractSetTerm(evoSetNotElementOf);
				if (result == null) result = caseEvoBinaryExpression(evoSetNotElementOf);
				if (result == null) result = caseHyBinaryExpression(evoSetNotElementOf);
				if (result == null) result = caseHyExpression(evoSetNotElementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_ABSTRACT_QUANTIFIER_TERM:
			{
				EvoAbstractQuantifierTerm evoAbstractQuantifierTerm = (EvoAbstractQuantifierTerm)theEObject;
				T result = caseEvoAbstractQuantifierTerm(evoAbstractQuantifierTerm);
				if (result == null) result = caseHyUnaryExpression(evoAbstractQuantifierTerm);
				if (result == null) result = caseHyExpression(evoAbstractQuantifierTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_FOR_ALL:
			{
				EvoForAll evoForAll = (EvoForAll)theEObject;
				T result = caseEvoForAll(evoForAll);
				if (result == null) result = caseEvoAbstractQuantifierTerm(evoForAll);
				if (result == null) result = caseHyUnaryExpression(evoForAll);
				if (result == null) result = caseHyExpression(evoForAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_EXIST:
			{
				EvoExist evoExist = (EvoExist)theEObject;
				T result = caseEvoExist(evoExist);
				if (result == null) result = caseEvoAbstractQuantifierTerm(evoExist);
				if (result == null) result = caseHyUnaryExpression(evoExist);
				if (result == null) result = caseHyExpression(evoExist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_UNIQUE_EXISTS:
			{
				EvoUniqueExists evoUniqueExists = (EvoUniqueExists)theEObject;
				T result = caseEvoUniqueExists(evoUniqueExists);
				if (result == null) result = caseEvoAbstractQuantifierTerm(evoUniqueExists);
				if (result == null) result = caseHyUnaryExpression(evoUniqueExists);
				if (result == null) result = caseHyExpression(evoUniqueExists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_FORMULA:
			{
				EvoFormula evoFormula = (EvoFormula)theEObject;
				T result = caseEvoFormula(evoFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_VARIABLE_TERM:
			{
				EvoVariableTerm evoVariableTerm = (EvoVariableTerm)theEObject;
				T result = caseEvoVariableTerm(evoVariableTerm);
				if (result == null) result = caseHyExpression(evoVariableTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_APPLICATION_CONSTRAINT_TERM:
			{
				EvoApplicationConstraintTerm evoApplicationConstraintTerm = (EvoApplicationConstraintTerm)theEObject;
				T result = caseEvoApplicationConstraintTerm(evoApplicationConstraintTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SIZE:
			{
				EvoSize evoSize = (EvoSize)theEObject;
				T result = caseEvoSize(evoSize);
				if (result == null) result = caseHyExpression(evoSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_GROUP_TYPE:
			{
				EvoGroupType evoGroupType = (EvoGroupType)theEObject;
				T result = caseEvoGroupType(evoGroupType);
				if (result == null) result = caseHyExpression(evoGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_FEATURE_TYPE:
			{
				EvoFeatureType evoFeatureType = (EvoFeatureType)theEObject;
				T result = caseEvoFeatureType(evoFeatureType);
				if (result == null) result = caseHyExpression(evoFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SATISFIABLE:
			{
				EvoSatisfiable evoSatisfiable = (EvoSatisfiable)theEObject;
				T result = caseEvoSatisfiable(evoSatisfiable);
				if (result == null) result = caseHyExpression(evoSatisfiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SET_TERM:
			{
				EvoSetTerm evoSetTerm = (EvoSetTerm)theEObject;
				T result = caseEvoSetTerm(evoSetTerm);
				if (result == null) result = caseHyExpression(evoSetTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_CHILDREN_OF:
			{
				EvoChildrenOf evoChildrenOf = (EvoChildrenOf)theEObject;
				T result = caseEvoChildrenOf(evoChildrenOf);
				if (result == null) result = caseHyExpression(evoChildrenOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_SIBLINGS_OF:
			{
				EvoSiblingsOf evoSiblingsOf = (EvoSiblingsOf)theEObject;
				T result = caseEvoSiblingsOf(evoSiblingsOf);
				if (result == null) result = caseEvoSetTerm(evoSiblingsOf);
				if (result == null) result = caseHyExpression(evoSiblingsOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_PARENT_OF:
			{
				EvoParentOf evoParentOf = (EvoParentOf)theEObject;
				T result = caseEvoParentOf(evoParentOf);
				if (result == null) result = caseEvoSetTerm(evoParentOf);
				if (result == null) result = caseHyExpression(evoParentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_ALL_MAPPINGS:
			{
				EvoAllMappings evoAllMappings = (EvoAllMappings)theEObject;
				T result = caseEvoAllMappings(evoAllMappings);
				if (result == null) result = caseHyExpression(evoAllMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvoLogicPackage.EVO_ALL_CONFIGURATIONS:
			{
				EvoAllConfigurations evoAllConfigurations = (EvoAllConfigurations)theEObject;
				T result = caseEvoAllConfigurations(evoAllConfigurations);
				if (result == null) result = caseHyExpression(evoAllConfigurations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoBinaryExpression(EvoBinaryExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo XOr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo XOr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoXOr(EvoXOr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoNot(EvoNot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Biconditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Biconditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoBiconditional(EvoBiconditional object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Formula Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Formula Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoFormulaVariable(EvoFormulaVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Formula Set Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Formula Set Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoFormulaSetVariable(EvoFormulaSetVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Abstract Set Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Abstract Set Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoAbstractSetTerm(EvoAbstractSetTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetInclusion(EvoSetInclusion object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Intersection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetIntersection(EvoSetIntersection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetUnion(EvoSetUnion object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Difference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Difference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetDifference(EvoSetDifference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Symmetric Difference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Symmetric Difference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetSymmetricDifference(EvoSetSymmetricDifference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Cartesian Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Cartesian Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetCartesianProduct(EvoSetCartesianProduct object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetCardinality(EvoSetCardinality object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Element Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoElementOf(EvoElementOf object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Not Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Not Element Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetNotElementOf(EvoSetNotElementOf object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Abstract Quantifier Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Abstract Quantifier Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoAbstractQuantifierTerm(EvoAbstractQuantifierTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo For All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo For All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoForAll(EvoForAll object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Exist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Exist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoExist(EvoExist object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Unique Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Unique Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoUniqueExists(EvoUniqueExists object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoFormula(EvoFormula object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Variable Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Variable Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoVariableTerm(EvoVariableTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Application Constraint Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Application Constraint Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoApplicationConstraintTerm(EvoApplicationConstraintTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSize(EvoSize object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoGroupType(EvoGroupType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoFeatureType(EvoFeatureType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Satisfiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Satisfiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSatisfiable(EvoSatisfiable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetTerm(EvoSetTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Children Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Children Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoChildrenOf(EvoChildrenOf object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Siblings Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Siblings Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSiblingsOf(EvoSiblingsOf object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Parent Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Parent Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoParentOf(EvoParentOf object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo All Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo All Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoAllMappings(EvoAllMappings object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo All Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo All Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoAllConfigurations(EvoAllConfigurations object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hy Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyExpression(HyExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hy Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hy Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyBinaryExpression(HyBinaryExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hy Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hy Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyUnaryExpression(HyUnaryExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoVariable(EvoVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evo Set Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evo Set Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvoSetVariable(EvoSetVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //EvoLogicSwitch
