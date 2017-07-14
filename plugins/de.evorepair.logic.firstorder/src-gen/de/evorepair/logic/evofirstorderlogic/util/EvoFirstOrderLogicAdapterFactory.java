/**
 */
package de.evorepair.logic.evofirstorderlogic.util;

import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariable;

import de.evorepair.logic.evofirstorderlogic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage
 * @generated
 */
public class EvoFirstOrderLogicAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvoFirstOrderLogicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFirstOrderLogicAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = EvoFirstOrderLogicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoFirstOrderLogicSwitch<Adapter> modelSwitch =
		new EvoFirstOrderLogicSwitch<Adapter>()
		{
			@Override
			public Adapter caseEvoAnd(EvoAnd object)
			{
				return createEvoAndAdapter();
			}
			@Override
			public Adapter caseEvoOr(EvoOr object)
			{
				return createEvoOrAdapter();
			}
			@Override
			public Adapter caseEvoAbstractTwoParameterTerm(EvoAbstractTwoParameterTerm object)
			{
				return createEvoAbstractTwoParameterTermAdapter();
			}
			@Override
			public Adapter caseEvoXOr(EvoXOr object)
			{
				return createEvoXOrAdapter();
			}
			@Override
			public Adapter caseEvoNot(EvoNot object)
			{
				return createEvoNotAdapter();
			}
			@Override
			public Adapter caseEvoAbstractOneParameterTerm(EvoAbstractOneParameterTerm object)
			{
				return createEvoAbstractOneParameterTermAdapter();
			}
			@Override
			public Adapter caseEvoAbstractTerm(EvoAbstractTerm object)
			{
				return createEvoAbstractTermAdapter();
			}
			@Override
			public Adapter caseEvoEqual(EvoEqual object)
			{
				return createEvoEqualAdapter();
			}
			@Override
			public Adapter caseEvoUnequal(EvoUnequal object)
			{
				return createEvoUnequalAdapter();
			}
			@Override
			public Adapter caseEvoImplication(EvoImplication object)
			{
				return createEvoImplicationAdapter();
			}
			@Override
			public Adapter caseEvoBiconditional(EvoBiconditional object)
			{
				return createEvoBiconditionalAdapter();
			}
			@Override
			public Adapter caseEvoFormulaVariable(EvoFormulaVariable object)
			{
				return createEvoFormulaVariableAdapter();
			}
			@Override
			public Adapter caseEvoFormulaSetVariable(EvoFormulaSetVariable object)
			{
				return createEvoFormulaSetVariableAdapter();
			}
			@Override
			public Adapter caseEvoAbstractSetTerm(EvoAbstractSetTerm object)
			{
				return createEvoAbstractSetTermAdapter();
			}
			@Override
			public Adapter caseEvoSetInclusion(EvoSetInclusion object)
			{
				return createEvoSetInclusionAdapter();
			}
			@Override
			public Adapter caseEvoSetIntersection(EvoSetIntersection object)
			{
				return createEvoSetIntersectionAdapter();
			}
			@Override
			public Adapter caseEvoSetUnion(EvoSetUnion object)
			{
				return createEvoSetUnionAdapter();
			}
			@Override
			public Adapter caseEvoSetDifference(EvoSetDifference object)
			{
				return createEvoSetDifferenceAdapter();
			}
			@Override
			public Adapter caseEvoSetSymmetricDifference(EvoSetSymmetricDifference object)
			{
				return createEvoSetSymmetricDifferenceAdapter();
			}
			@Override
			public Adapter caseEvoSetCartesianProduct(EvoSetCartesianProduct object)
			{
				return createEvoSetCartesianProductAdapter();
			}
			@Override
			public Adapter caseEvoSetCardinality(EvoSetCardinality object)
			{
				return createEvoSetCardinalityAdapter();
			}
			@Override
			public Adapter caseEvoSetElementOf(EvoSetElementOf object)
			{
				return createEvoSetElementOfAdapter();
			}
			@Override
			public Adapter caseEvoSetNotElementOf(EvoSetNotElementOf object)
			{
				return createEvoSetNotElementOfAdapter();
			}
			@Override
			public Adapter caseEvoAbstractQuantifierTerm(EvoAbstractQuantifierTerm object)
			{
				return createEvoAbstractQuantifierTermAdapter();
			}
			@Override
			public Adapter caseEvoForAll(EvoForAll object)
			{
				return createEvoForAllAdapter();
			}
			@Override
			public Adapter caseEvoExist(EvoExist object)
			{
				return createEvoExistAdapter();
			}
			@Override
			public Adapter caseEvoUniqueExists(EvoUniqueExists object)
			{
				return createEvoUniqueExistsAdapter();
			}
			@Override
			public Adapter caseEvoFormula(EvoFormula object)
			{
				return createEvoFormulaAdapter();
			}
			@Override
			public Adapter caseEvoVariableTerm(EvoVariableTerm object)
			{
				return createEvoVariableTermAdapter();
			}
			@Override
			public Adapter caseEvoApplicationConstraintTerm(EvoApplicationConstraintTerm object)
			{
				return createEvoApplicationConstraintTermAdapter();
			}
			@Override
			public Adapter caseEvoSize(EvoSize object)
			{
				return createEvoSizeAdapter();
			}
			@Override
			public Adapter caseEvoGroupType(EvoGroupType object)
			{
				return createEvoGroupTypeAdapter();
			}
			@Override
			public Adapter caseEvoFeatureType(EvoFeatureType object)
			{
				return createEvoFeatureTypeAdapter();
			}
			@Override
			public Adapter caseEvoSatisfiable(EvoSatisfiable object)
			{
				return createEvoSatisfiableAdapter();
			}
			@Override
			public Adapter caseEvoSetTerm(EvoSetTerm object)
			{
				return createEvoSetTermAdapter();
			}
			@Override
			public Adapter caseEvoChildrenOf(EvoChildrenOf object)
			{
				return createEvoChildrenOfAdapter();
			}
			@Override
			public Adapter caseEvoSiblingsOf(EvoSiblingsOf object)
			{
				return createEvoSiblingsOfAdapter();
			}
			@Override
			public Adapter caseEvoParentOf(EvoParentOf object)
			{
				return createEvoParentOfAdapter();
			}
			@Override
			public Adapter caseEvoVariable(EvoVariable object)
			{
				return createEvoVariableAdapter();
			}
			@Override
			public Adapter caseEvoSetVariable(EvoSetVariable object)
			{
				return createEvoSetVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAnd <em>Evo And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAnd
	 * @generated
	 */
	public Adapter createEvoAndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoOr <em>Evo Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoOr
	 * @generated
	 */
	public Adapter createEvoOrAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm <em>Evo Abstract Two Parameter Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm
	 * @generated
	 */
	public Adapter createEvoAbstractTwoParameterTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoXOr <em>Evo XOr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoXOr
	 * @generated
	 */
	public Adapter createEvoXOrAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoNot <em>Evo Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoNot
	 * @generated
	 */
	public Adapter createEvoNotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm <em>Evo Abstract One Parameter Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm
	 * @generated
	 */
	public Adapter createEvoAbstractOneParameterTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm <em>Evo Abstract Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm
	 * @generated
	 */
	public Adapter createEvoAbstractTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoEqual <em>Evo Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoEqual
	 * @generated
	 */
	public Adapter createEvoEqualAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoUnequal <em>Evo Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoUnequal
	 * @generated
	 */
	public Adapter createEvoUnequalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoImplication <em>Evo Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoImplication
	 * @generated
	 */
	public Adapter createEvoImplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoBiconditional <em>Evo Biconditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoBiconditional
	 * @generated
	 */
	public Adapter createEvoBiconditionalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable <em>Evo Formula Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable
	 * @generated
	 */
	public Adapter createEvoFormulaVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormulaSetVariable <em>Evo Formula Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormulaSetVariable
	 * @generated
	 */
	public Adapter createEvoFormulaSetVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm <em>Evo Abstract Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm
	 * @generated
	 */
	public Adapter createEvoAbstractSetTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetInclusion <em>Evo Set Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetInclusion
	 * @generated
	 */
	public Adapter createEvoSetInclusionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetIntersection <em>Evo Set Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetIntersection
	 * @generated
	 */
	public Adapter createEvoSetIntersectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetUnion <em>Evo Set Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetUnion
	 * @generated
	 */
	public Adapter createEvoSetUnionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetDifference <em>Evo Set Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetDifference
	 * @generated
	 */
	public Adapter createEvoSetDifferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference <em>Evo Set Symmetric Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference
	 * @generated
	 */
	public Adapter createEvoSetSymmetricDifferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetCartesianProduct <em>Evo Set Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetCartesianProduct
	 * @generated
	 */
	public Adapter createEvoSetCartesianProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetCardinality <em>Evo Set Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetCardinality
	 * @generated
	 */
	public Adapter createEvoSetCardinalityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetElementOf <em>Evo Set Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetElementOf
	 * @generated
	 */
	public Adapter createEvoSetElementOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf <em>Evo Set Not Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf
	 * @generated
	 */
	public Adapter createEvoSetNotElementOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm
	 * @generated
	 */
	public Adapter createEvoAbstractQuantifierTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoForAll <em>Evo For All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoForAll
	 * @generated
	 */
	public Adapter createEvoForAllAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoExist <em>Evo Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoExist
	 * @generated
	 */
	public Adapter createEvoExistAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoUniqueExists <em>Evo Unique Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoUniqueExists
	 * @generated
	 */
	public Adapter createEvoUniqueExistsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula <em>Evo Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormula
	 * @generated
	 */
	public Adapter createEvoFormulaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm <em>Evo Variable Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoVariableTerm
	 * @generated
	 */
	public Adapter createEvoVariableTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintTerm <em>Evo Application Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintTerm
	 * @generated
	 */
	public Adapter createEvoApplicationConstraintTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSize <em>Evo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSize
	 * @generated
	 */
	public Adapter createEvoSizeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoGroupType <em>Evo Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoGroupType
	 * @generated
	 */
	public Adapter createEvoGroupTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType <em>Evo Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFeatureType
	 * @generated
	 */
	public Adapter createEvoFeatureTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSatisfiable <em>Evo Satisfiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSatisfiable
	 * @generated
	 */
	public Adapter createEvoSatisfiableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetTerm <em>Evo Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetTerm
	 * @generated
	 */
	public Adapter createEvoSetTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoChildrenOf <em>Evo Children Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoChildrenOf
	 * @generated
	 */
	public Adapter createEvoChildrenOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoSiblingsOf <em>Evo Siblings Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSiblingsOf
	 * @generated
	 */
	public Adapter createEvoSiblingsOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evofirstorderlogic.EvoParentOf <em>Evo Parent Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoParentOf
	 * @generated
	 */
	public Adapter createEvoParentOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.evolution.evovariable.EvoVariable <em>Evo Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.evolution.evovariable.EvoVariable
	 * @generated
	 */
	public Adapter createEvoVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.evolution.evovariable.EvoSetVariable <em>Evo Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.evolution.evovariable.EvoSetVariable
	 * @generated
	 */
	public Adapter createEvoSetVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //EvoFirstOrderLogicAdapterFactory
