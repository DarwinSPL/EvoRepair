/**
 */
package de.evorepair.logic.evologic.util;

import de.evorepair.logic.evologic.*;

import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyUnaryExpression;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evologic.EvoLogicPackage
 * @generated
 */
public class EvoLogicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvoLogicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoLogicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EvoLogicPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected EvoLogicSwitch<Adapter> modelSwitch =
		new EvoLogicSwitch<Adapter>() {
			@Override
			public Adapter caseEvoBinaryExpression(EvoBinaryExpression object) {
				return createEvoBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseEvoXOr(EvoXOr object) {
				return createEvoXOrAdapter();
			}
			@Override
			public Adapter caseEvoNot(EvoNot object) {
				return createEvoNotAdapter();
			}
			@Override
			public Adapter caseEvoBiconditional(EvoBiconditional object) {
				return createEvoBiconditionalAdapter();
			}
			@Override
			public Adapter caseEvoAbstractSetTerm(EvoAbstractSetTerm object) {
				return createEvoAbstractSetTermAdapter();
			}
			@Override
			public Adapter caseEvoSetInclusion(EvoSetInclusion object) {
				return createEvoSetInclusionAdapter();
			}
			@Override
			public Adapter caseEvoSetIntersection(EvoSetIntersection object) {
				return createEvoSetIntersectionAdapter();
			}
			@Override
			public Adapter caseEvoSetUnion(EvoSetUnion object) {
				return createEvoSetUnionAdapter();
			}
			@Override
			public Adapter caseEvoSetDifference(EvoSetDifference object) {
				return createEvoSetDifferenceAdapter();
			}
			@Override
			public Adapter caseEvoSetSymmetricDifference(EvoSetSymmetricDifference object) {
				return createEvoSetSymmetricDifferenceAdapter();
			}
			@Override
			public Adapter caseEvoSetCartesianProduct(EvoSetCartesianProduct object) {
				return createEvoSetCartesianProductAdapter();
			}
			@Override
			public Adapter caseEvoSetCardinality(EvoSetCardinality object) {
				return createEvoSetCardinalityAdapter();
			}
			@Override
			public Adapter caseEvoElementOf(EvoElementOf object) {
				return createEvoElementOfAdapter();
			}
			@Override
			public Adapter caseEvoSetNotElementOf(EvoSetNotElementOf object) {
				return createEvoSetNotElementOfAdapter();
			}
			@Override
			public Adapter caseEvoAbstractQuantifierTerm(EvoAbstractQuantifierTerm object) {
				return createEvoAbstractQuantifierTermAdapter();
			}
			@Override
			public Adapter caseEvoForAll(EvoForAll object) {
				return createEvoForAllAdapter();
			}
			@Override
			public Adapter caseEvoExist(EvoExist object) {
				return createEvoExistAdapter();
			}
			@Override
			public Adapter caseEvoFormula(EvoFormula object) {
				return createEvoFormulaAdapter();
			}
			@Override
			public Adapter caseEvoVariableTerm(EvoVariableTerm object) {
				return createEvoVariableTermAdapter();
			}
			@Override
			public Adapter caseEvoApplicationConstraintTerm(EvoApplicationConstraintTerm object) {
				return createEvoApplicationConstraintTermAdapter();
			}
			@Override
			public Adapter caseEvoSize(EvoSize object) {
				return createEvoSizeAdapter();
			}
			@Override
			public Adapter caseEvoGroupType(EvoGroupType object) {
				return createEvoGroupTypeAdapter();
			}
			@Override
			public Adapter caseEvoFeatureType(EvoFeatureType object) {
				return createEvoFeatureTypeAdapter();
			}
			@Override
			public Adapter caseEvoSatisfiable(EvoSatisfiable object) {
				return createEvoSatisfiableAdapter();
			}
			@Override
			public Adapter caseEvoSetTerm(EvoSetTerm object) {
				return createEvoSetTermAdapter();
			}
			@Override
			public Adapter caseEvoChildrenOf(EvoChildrenOf object) {
				return createEvoChildrenOfAdapter();
			}
			@Override
			public Adapter caseEvoSiblingsOf(EvoSiblingsOf object) {
				return createEvoSiblingsOfAdapter();
			}
			@Override
			public Adapter caseEvoParentOf(EvoParentOf object) {
				return createEvoParentOfAdapter();
			}
			@Override
			public Adapter caseEvoAllMappings(EvoAllMappings object) {
				return createEvoAllMappingsAdapter();
			}
			@Override
			public Adapter caseEvoAllConfigurations(EvoAllConfigurations object) {
				return createEvoAllConfigurationsAdapter();
			}
			@Override
			public Adapter caseHyExpression(HyExpression object) {
				return createHyExpressionAdapter();
			}
			@Override
			public Adapter caseHyBinaryExpression(HyBinaryExpression object) {
				return createHyBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseHyUnaryExpression(HyUnaryExpression object) {
				return createHyUnaryExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoBinaryExpression <em>Evo Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoBinaryExpression
	 * @generated
	 */
	public Adapter createEvoBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoXOr <em>Evo XOr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoXOr
	 * @generated
	 */
	public Adapter createEvoXOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoNot <em>Evo Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoNot
	 * @generated
	 */
	public Adapter createEvoNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoBiconditional <em>Evo Biconditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoBiconditional
	 * @generated
	 */
	public Adapter createEvoBiconditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoAbstractSetTerm <em>Evo Abstract Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoAbstractSetTerm
	 * @generated
	 */
	public Adapter createEvoAbstractSetTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetInclusion <em>Evo Set Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetInclusion
	 * @generated
	 */
	public Adapter createEvoSetInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetIntersection <em>Evo Set Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetIntersection
	 * @generated
	 */
	public Adapter createEvoSetIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetUnion <em>Evo Set Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetUnion
	 * @generated
	 */
	public Adapter createEvoSetUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetDifference <em>Evo Set Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetDifference
	 * @generated
	 */
	public Adapter createEvoSetDifferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetSymmetricDifference <em>Evo Set Symmetric Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetSymmetricDifference
	 * @generated
	 */
	public Adapter createEvoSetSymmetricDifferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetCartesianProduct <em>Evo Set Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetCartesianProduct
	 * @generated
	 */
	public Adapter createEvoSetCartesianProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetCardinality <em>Evo Set Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetCardinality
	 * @generated
	 */
	public Adapter createEvoSetCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoElementOf <em>Evo Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoElementOf
	 * @generated
	 */
	public Adapter createEvoElementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetNotElementOf <em>Evo Set Not Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetNotElementOf
	 * @generated
	 */
	public Adapter createEvoSetNotElementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoAbstractQuantifierTerm
	 * @generated
	 */
	public Adapter createEvoAbstractQuantifierTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoForAll <em>Evo For All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoForAll
	 * @generated
	 */
	public Adapter createEvoForAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoExist <em>Evo Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoExist
	 * @generated
	 */
	public Adapter createEvoExistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoFormula <em>Evo Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoFormula
	 * @generated
	 */
	public Adapter createEvoFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoVariableTerm <em>Evo Variable Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoVariableTerm
	 * @generated
	 */
	public Adapter createEvoVariableTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoApplicationConstraintTerm <em>Evo Application Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoApplicationConstraintTerm
	 * @generated
	 */
	public Adapter createEvoApplicationConstraintTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSize <em>Evo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSize
	 * @generated
	 */
	public Adapter createEvoSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoGroupType <em>Evo Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoGroupType
	 * @generated
	 */
	public Adapter createEvoGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoFeatureType <em>Evo Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoFeatureType
	 * @generated
	 */
	public Adapter createEvoFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSatisfiable <em>Evo Satisfiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSatisfiable
	 * @generated
	 */
	public Adapter createEvoSatisfiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSetTerm <em>Evo Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSetTerm
	 * @generated
	 */
	public Adapter createEvoSetTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoChildrenOf <em>Evo Children Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoChildrenOf
	 * @generated
	 */
	public Adapter createEvoChildrenOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoSiblingsOf <em>Evo Siblings Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoSiblingsOf
	 * @generated
	 */
	public Adapter createEvoSiblingsOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoParentOf <em>Evo Parent Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoParentOf
	 * @generated
	 */
	public Adapter createEvoParentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoAllMappings <em>Evo All Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoAllMappings
	 * @generated
	 */
	public Adapter createEvoAllMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.logic.evologic.EvoAllConfigurations <em>Evo All Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.logic.evologic.EvoAllConfigurations
	 * @generated
	 */
	public Adapter createEvoAllConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyExpression <em>Hy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyExpression
	 * @generated
	 */
	public Adapter createHyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyBinaryExpression <em>Hy Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyBinaryExpression
	 * @generated
	 */
	public Adapter createHyBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyUnaryExpression <em>Hy Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyUnaryExpression
	 * @generated
	 */
	public Adapter createHyUnaryExpressionAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EvoLogicAdapterFactory
