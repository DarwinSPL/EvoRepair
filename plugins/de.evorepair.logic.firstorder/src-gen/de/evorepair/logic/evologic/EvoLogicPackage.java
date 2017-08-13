/**
 */
package de.evorepair.logic.evologic;

import de.evorepair.evolution.evovariable.EvoVariablePackage;

import eu.hyvar.feature.expression.HyExpressionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evologic.EvoLogicFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import configuration='../../eu.hyvar.feature.configuration/model/Configuration.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore' evooperation_0='../../de.evorepair.evolution.operation/model/EvoOperation.ecore#/' evovariable_0='../../de.evorepair.evolution.variable/model/EvoVariable.ecore#/' expression_0='../../eu.hyvar.feature.expression/model/Expression.ecore#/' feature_0='../../eu.hyvar.feature/model/Feature.ecore#/' mapping_0='../../eu.hyvar.feature.mapping/model/Mapping.ecore#/'"
 * @generated
 */
public interface EvoLogicPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evologic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://darwinspl.de/evorepair/logic/0.4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evologic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvoLogicPackage eINSTANCE = de.evorepair.logic.evologic.impl.EvoLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoBinaryExpressionImpl <em>Evo Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoBinaryExpressionImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoBinaryExpression()
	 * @generated
	 */
	int EVO_BINARY_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BINARY_EXPRESSION__OPERAND1 = HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BINARY_EXPRESSION__OPERAND2 = HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The number of structural features of the '<em>Evo Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BINARY_EXPRESSION_FEATURE_COUNT = HyExpressionPackage.HY_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BINARY_EXPRESSION_OPERATION_COUNT = HyExpressionPackage.HY_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoXOrImpl <em>Evo XOr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoXOrImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoXOr()
	 * @generated
	 */
	int EVO_XOR = 1;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR__OPERAND1 = EVO_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR__OPERAND2 = EVO_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The number of structural features of the '<em>Evo XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR_FEATURE_COUNT = EVO_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR_OPERATION_COUNT = EVO_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoNotImpl <em>Evo Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoNotImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoNot()
	 * @generated
	 */
	int EVO_NOT = 2;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT__OPERAND = HyExpressionPackage.HY_UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Evo Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT_FEATURE_COUNT = HyExpressionPackage.HY_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT_OPERATION_COUNT = HyExpressionPackage.HY_UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoBiconditionalImpl <em>Evo Biconditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoBiconditionalImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoBiconditional()
	 * @generated
	 */
	int EVO_BICONDITIONAL = 3;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL__OPERAND1 = EVO_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL__OPERAND2 = EVO_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The number of structural features of the '<em>Evo Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL_FEATURE_COUNT = EVO_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL_OPERATION_COUNT = EVO_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaVariableImpl <em>Evo Formula Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoFormulaVariableImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormulaVariable()
	 * @generated
	 */
	int EVO_FORMULA_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE__NAME = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Formula Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Formula Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaSetVariableImpl <em>Evo Formula Set Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoFormulaSetVariableImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormulaSetVariable()
	 * @generated
	 */
	int EVO_FORMULA_SET_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE__NAME = EvoVariablePackage.EVO_SET_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE__ELEMENTS = EvoVariablePackage.EVO_SET_VARIABLE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Evo Formula Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE_FEATURE_COUNT = EvoVariablePackage.EVO_SET_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Formula Set Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE_OPERATION_COUNT = EvoVariablePackage.EVO_SET_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoAbstractSetTermImpl <em>Evo Abstract Set Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoAbstractSetTermImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAbstractSetTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_SET_TERM = 6;

	/**
	 * The number of structural features of the '<em>Evo Abstract Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_SET_TERM_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Abstract Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_SET_TERM_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetInclusionImpl <em>Evo Set Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetInclusionImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetInclusion()
	 * @generated
	 */
	int EVO_SET_INCLUSION = 7;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl <em>Evo Set Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetIntersection()
	 * @generated
	 */
	int EVO_SET_INTERSECTION = 8;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetUnionImpl <em>Evo Set Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetUnionImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetUnion()
	 * @generated
	 */
	int EVO_SET_UNION = 9;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetDifferenceImpl <em>Evo Set Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetDifferenceImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetDifference()
	 * @generated
	 */
	int EVO_SET_DIFFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetSymmetricDifferenceImpl <em>Evo Set Symmetric Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetSymmetricDifferenceImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetSymmetricDifference()
	 * @generated
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Symmetric Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Symmetric Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetCartesianProductImpl <em>Evo Set Cartesian Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetCartesianProductImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetCartesianProduct()
	 * @generated
	 */
	int EVO_SET_CARTESIAN_PRODUCT = 12;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Cartesian Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Cartesian Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetCardinalityImpl <em>Evo Set Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetCardinalityImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetCardinality()
	 * @generated
	 */
	int EVO_SET_CARDINALITY = 13;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARDINALITY__OPERAND = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Set Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARDINALITY_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Set Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARDINALITY_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoElementOfImpl <em>Evo Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoElementOfImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoElementOf()
	 * @generated
	 */
	int EVO_ELEMENT_OF = 14;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ELEMENT_OF__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ELEMENT_OF__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ELEMENT_OF_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ELEMENT_OF_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetNotElementOfImpl <em>Evo Set Not Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetNotElementOfImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetNotElementOf()
	 * @generated
	 */
	int EVO_SET_NOT_ELEMENT_OF = 15;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF__OPERAND1 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF__OPERAND2 = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Not Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Not Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.EvoAbstractQuantifierTerm
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAbstractQuantifierTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM = 16;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM__OPERAND = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounded Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Abstract Quantifier Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Abstract Quantifier Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoForAllImpl <em>Evo For All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoForAllImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoForAll()
	 * @generated
	 */
	int EVO_FOR_ALL = 17;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL__OPERAND = EVO_ABSTRACT_QUANTIFIER_TERM__OPERAND;

	/**
	 * The feature id for the '<em><b>Bounded Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL__BOUNDED_VARIABLES = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES;

	/**
	 * The number of structural features of the '<em>Evo For All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL_FEATURE_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo For All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL_OPERATION_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoExistImpl <em>Evo Exist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoExistImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoExist()
	 * @generated
	 */
	int EVO_EXIST = 18;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST__OPERAND = EVO_ABSTRACT_QUANTIFIER_TERM__OPERAND;

	/**
	 * The feature id for the '<em><b>Bounded Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST__BOUNDED_VARIABLES = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES;

	/**
	 * The number of structural features of the '<em>Evo Exist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST_FEATURE_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Exist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST_OPERATION_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoUniqueExistsImpl <em>Evo Unique Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoUniqueExistsImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoUniqueExists()
	 * @generated
	 */
	int EVO_UNIQUE_EXISTS = 19;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS__OPERAND = EVO_ABSTRACT_QUANTIFIER_TERM__OPERAND;

	/**
	 * The feature id for the '<em><b>Bounded Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS__BOUNDED_VARIABLES = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES;

	/**
	 * The number of structural features of the '<em>Evo Unique Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS_FEATURE_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Unique Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS_OPERATION_COUNT = EVO_ABSTRACT_QUANTIFIER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaImpl <em>Evo Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoFormulaImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormula()
	 * @generated
	 */
	int EVO_FORMULA = 20;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA__TERM = 0;

	/**
	 * The number of structural features of the '<em>Evo Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evo Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoVariableTermImpl <em>Evo Variable Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoVariableTermImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoVariableTerm()
	 * @generated
	 */
	int EVO_VARIABLE_TERM = 21;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM__VARIABLE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM__TYPE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Variable Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Variable Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoApplicationConstraintTermImpl <em>Evo Application Constraint Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoApplicationConstraintTermImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoApplicationConstraintTerm()
	 * @generated
	 */
	int EVO_APPLICATION_CONSTRAINT_TERM = 22;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_TERM__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Evo Application Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evo Application Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSizeImpl <em>Evo Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSizeImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSize()
	 * @generated
	 */
	int EVO_SIZE = 23;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIZE__SIZE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIZE_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIZE_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoGroupTypeImpl <em>Evo Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoGroupTypeImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoGroupType()
	 * @generated
	 */
	int EVO_GROUP_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__TYPE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__VARIABLES = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoFeatureTypeImpl <em>Evo Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoFeatureTypeImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFeatureType()
	 * @generated
	 */
	int EVO_FEATURE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__TYPE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__VARIABLES = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSatisfiableImpl <em>Evo Satisfiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSatisfiableImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSatisfiable()
	 * @generated
	 */
	int EVO_SATISFIABLE = 26;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE__VARIABLES = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Satisfiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Satisfiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSetTermImpl <em>Evo Set Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSetTermImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetTerm()
	 * @generated
	 */
	int EVO_SET_TERM = 27;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_TERM__VARIABLES = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_TERM_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_TERM_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoChildrenOfImpl <em>Evo Children Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoChildrenOfImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoChildrenOf()
	 * @generated
	 */
	int EVO_CHILDREN_OF = 28;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_CHILDREN_OF__VARIABLE = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Children Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_CHILDREN_OF_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Children Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_CHILDREN_OF_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoSiblingsOfImpl <em>Evo Siblings Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoSiblingsOfImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSiblingsOf()
	 * @generated
	 */
	int EVO_SIBLINGS_OF = 29;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_OF__VARIABLES = EVO_SET_TERM__VARIABLES;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_OF__VARIABLE = EVO_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Siblings Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_OF_FEATURE_COUNT = EVO_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Siblings Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_OF_OPERATION_COUNT = EVO_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoParentOfImpl <em>Evo Parent Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoParentOfImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoParentOf()
	 * @generated
	 */
	int EVO_PARENT_OF = 30;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PARENT_OF__VARIABLES = EVO_SET_TERM__VARIABLES;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PARENT_OF__VARIABLE = EVO_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Parent Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PARENT_OF_FEATURE_COUNT = EVO_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Parent Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PARENT_OF_OPERATION_COUNT = EVO_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoAllMappingsImpl <em>Evo All Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoAllMappingsImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAllMappings()
	 * @generated
	 */
	int EVO_ALL_MAPPINGS = 31;

	/**
	 * The number of structural features of the '<em>Evo All Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_MAPPINGS_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo All Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_MAPPINGS_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evologic.impl.EvoAllConfigurationsImpl <em>Evo All Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evologic.impl.EvoAllConfigurationsImpl
	 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAllConfigurations()
	 * @generated
	 */
	int EVO_ALL_CONFIGURATIONS = 32;

	/**
	 * The number of structural features of the '<em>Evo All Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_CONFIGURATIONS_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo All Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_CONFIGURATIONS_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoBinaryExpression <em>Evo Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Binary Expression</em>'.
	 * @see de.evorepair.logic.evologic.EvoBinaryExpression
	 * @generated
	 */
	EClass getEvoBinaryExpression();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoXOr <em>Evo XOr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo XOr</em>'.
	 * @see de.evorepair.logic.evologic.EvoXOr
	 * @generated
	 */
	EClass getEvoXOr();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoNot <em>Evo Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Not</em>'.
	 * @see de.evorepair.logic.evologic.EvoNot
	 * @generated
	 */
	EClass getEvoNot();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoBiconditional <em>Evo Biconditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Biconditional</em>'.
	 * @see de.evorepair.logic.evologic.EvoBiconditional
	 * @generated
	 */
	EClass getEvoBiconditional();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoFormulaVariable <em>Evo Formula Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoFormulaVariable
	 * @generated
	 */
	EClass getEvoFormulaVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoFormulaSetVariable <em>Evo Formula Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula Set Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoFormulaSetVariable
	 * @generated
	 */
	EClass getEvoFormulaSetVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoAbstractSetTerm <em>Evo Abstract Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Set Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoAbstractSetTerm
	 * @generated
	 */
	EClass getEvoAbstractSetTerm();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetInclusion <em>Evo Set Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Inclusion</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetInclusion
	 * @generated
	 */
	EClass getEvoSetInclusion();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetIntersection <em>Evo Set Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Intersection</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetIntersection
	 * @generated
	 */
	EClass getEvoSetIntersection();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetUnion <em>Evo Set Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Union</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetUnion
	 * @generated
	 */
	EClass getEvoSetUnion();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetDifference <em>Evo Set Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Difference</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetDifference
	 * @generated
	 */
	EClass getEvoSetDifference();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetSymmetricDifference <em>Evo Set Symmetric Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Symmetric Difference</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetSymmetricDifference
	 * @generated
	 */
	EClass getEvoSetSymmetricDifference();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetCartesianProduct <em>Evo Set Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Cartesian Product</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetCartesianProduct
	 * @generated
	 */
	EClass getEvoSetCartesianProduct();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetCardinality <em>Evo Set Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Cardinality</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetCardinality
	 * @generated
	 */
	EClass getEvoSetCardinality();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoElementOf <em>Evo Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Element Of</em>'.
	 * @see de.evorepair.logic.evologic.EvoElementOf
	 * @generated
	 */
	EClass getEvoElementOf();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetNotElementOf <em>Evo Set Not Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Not Element Of</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetNotElementOf
	 * @generated
	 */
	EClass getEvoSetNotElementOf();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Quantifier Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoAbstractQuantifierTerm
	 * @generated
	 */
	EClass getEvoAbstractQuantifierTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm#getBoundedVariables <em>Bounded Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded Variables</em>'.
	 * @see de.evorepair.logic.evologic.EvoAbstractQuantifierTerm#getBoundedVariables()
	 * @see #getEvoAbstractQuantifierTerm()
	 * @generated
	 */
	EReference getEvoAbstractQuantifierTerm_BoundedVariables();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoForAll <em>Evo For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo For All</em>'.
	 * @see de.evorepair.logic.evologic.EvoForAll
	 * @generated
	 */
	EClass getEvoForAll();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoExist <em>Evo Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Exist</em>'.
	 * @see de.evorepair.logic.evologic.EvoExist
	 * @generated
	 */
	EClass getEvoExist();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoUniqueExists <em>Evo Unique Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Unique Exists</em>'.
	 * @see de.evorepair.logic.evologic.EvoUniqueExists
	 * @generated
	 */
	EClass getEvoUniqueExists();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoFormula <em>Evo Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula</em>'.
	 * @see de.evorepair.logic.evologic.EvoFormula
	 * @generated
	 */
	EClass getEvoFormula();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evologic.EvoFormula#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoFormula#getTerm()
	 * @see #getEvoFormula()
	 * @generated
	 */
	EReference getEvoFormula_Term();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoVariableTerm <em>Evo Variable Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Variable Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoVariableTerm
	 * @generated
	 */
	EClass getEvoVariableTerm();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evologic.EvoVariableTerm#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoVariableTerm#getVariable()
	 * @see #getEvoVariableTerm()
	 * @generated
	 */
	EReference getEvoVariableTerm_Variable();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evologic.EvoVariableTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evologic.EvoVariableTerm#getType()
	 * @see #getEvoVariableTerm()
	 * @generated
	 */
	EAttribute getEvoVariableTerm_Type();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoApplicationConstraintTerm <em>Evo Application Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Application Constraint Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoApplicationConstraintTerm
	 * @generated
	 */
	EClass getEvoApplicationConstraintTerm();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evologic.EvoApplicationConstraintTerm#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoApplicationConstraintTerm#getVariable()
	 * @see #getEvoApplicationConstraintTerm()
	 * @generated
	 */
	EReference getEvoApplicationConstraintTerm_Variable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSize <em>Evo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Size</em>'.
	 * @see de.evorepair.logic.evologic.EvoSize
	 * @generated
	 */
	EClass getEvoSize();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evologic.EvoSize#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.evorepair.logic.evologic.EvoSize#getSize()
	 * @see #getEvoSize()
	 * @generated
	 */
	EAttribute getEvoSize_Size();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoGroupType <em>Evo Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Group Type</em>'.
	 * @see de.evorepair.logic.evologic.EvoGroupType
	 * @generated
	 */
	EClass getEvoGroupType();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evologic.EvoGroupType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evologic.EvoGroupType#getType()
	 * @see #getEvoGroupType()
	 * @generated
	 */
	EAttribute getEvoGroupType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evologic.EvoGroupType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.evorepair.logic.evologic.EvoGroupType#getVariables()
	 * @see #getEvoGroupType()
	 * @generated
	 */
	EReference getEvoGroupType_Variables();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoFeatureType <em>Evo Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Feature Type</em>'.
	 * @see de.evorepair.logic.evologic.EvoFeatureType
	 * @generated
	 */
	EClass getEvoFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evologic.EvoFeatureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evologic.EvoFeatureType#getType()
	 * @see #getEvoFeatureType()
	 * @generated
	 */
	EAttribute getEvoFeatureType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evologic.EvoFeatureType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.evorepair.logic.evologic.EvoFeatureType#getVariables()
	 * @see #getEvoFeatureType()
	 * @generated
	 */
	EReference getEvoFeatureType_Variables();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSatisfiable <em>Evo Satisfiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Satisfiable</em>'.
	 * @see de.evorepair.logic.evologic.EvoSatisfiable
	 * @generated
	 */
	EClass getEvoSatisfiable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evologic.EvoSatisfiable#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.evorepair.logic.evologic.EvoSatisfiable#getVariables()
	 * @see #getEvoSatisfiable()
	 * @generated
	 */
	EReference getEvoSatisfiable_Variables();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSetTerm <em>Evo Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Term</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetTerm
	 * @generated
	 */
	EClass getEvoSetTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evologic.EvoSetTerm#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.evorepair.logic.evologic.EvoSetTerm#getVariables()
	 * @see #getEvoSetTerm()
	 * @generated
	 */
	EReference getEvoSetTerm_Variables();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoChildrenOf <em>Evo Children Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Children Of</em>'.
	 * @see de.evorepair.logic.evologic.EvoChildrenOf
	 * @generated
	 */
	EClass getEvoChildrenOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evologic.EvoChildrenOf#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoChildrenOf#getVariable()
	 * @see #getEvoChildrenOf()
	 * @generated
	 */
	EReference getEvoChildrenOf_Variable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoSiblingsOf <em>Evo Siblings Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Siblings Of</em>'.
	 * @see de.evorepair.logic.evologic.EvoSiblingsOf
	 * @generated
	 */
	EClass getEvoSiblingsOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evologic.EvoSiblingsOf#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoSiblingsOf#getVariable()
	 * @see #getEvoSiblingsOf()
	 * @generated
	 */
	EReference getEvoSiblingsOf_Variable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoParentOf <em>Evo Parent Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Parent Of</em>'.
	 * @see de.evorepair.logic.evologic.EvoParentOf
	 * @generated
	 */
	EClass getEvoParentOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evologic.EvoParentOf#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evologic.EvoParentOf#getVariable()
	 * @see #getEvoParentOf()
	 * @generated
	 */
	EReference getEvoParentOf_Variable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoAllMappings <em>Evo All Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo All Mappings</em>'.
	 * @see de.evorepair.logic.evologic.EvoAllMappings
	 * @generated
	 */
	EClass getEvoAllMappings();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evologic.EvoAllConfigurations <em>Evo All Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo All Configurations</em>'.
	 * @see de.evorepair.logic.evologic.EvoAllConfigurations
	 * @generated
	 */
	EClass getEvoAllConfigurations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvoLogicFactory getEvoLogicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoBinaryExpressionImpl <em>Evo Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoBinaryExpressionImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoBinaryExpression()
		 * @generated
		 */
		EClass EVO_BINARY_EXPRESSION = eINSTANCE.getEvoBinaryExpression();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoXOrImpl <em>Evo XOr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoXOrImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoXOr()
		 * @generated
		 */
		EClass EVO_XOR = eINSTANCE.getEvoXOr();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoNotImpl <em>Evo Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoNotImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoNot()
		 * @generated
		 */
		EClass EVO_NOT = eINSTANCE.getEvoNot();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoBiconditionalImpl <em>Evo Biconditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoBiconditionalImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoBiconditional()
		 * @generated
		 */
		EClass EVO_BICONDITIONAL = eINSTANCE.getEvoBiconditional();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaVariableImpl <em>Evo Formula Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoFormulaVariableImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormulaVariable()
		 * @generated
		 */
		EClass EVO_FORMULA_VARIABLE = eINSTANCE.getEvoFormulaVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaSetVariableImpl <em>Evo Formula Set Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoFormulaSetVariableImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormulaSetVariable()
		 * @generated
		 */
		EClass EVO_FORMULA_SET_VARIABLE = eINSTANCE.getEvoFormulaSetVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoAbstractSetTermImpl <em>Evo Abstract Set Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoAbstractSetTermImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAbstractSetTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_SET_TERM = eINSTANCE.getEvoAbstractSetTerm();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetInclusionImpl <em>Evo Set Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetInclusionImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetInclusion()
		 * @generated
		 */
		EClass EVO_SET_INCLUSION = eINSTANCE.getEvoSetInclusion();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl <em>Evo Set Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetIntersection()
		 * @generated
		 */
		EClass EVO_SET_INTERSECTION = eINSTANCE.getEvoSetIntersection();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetUnionImpl <em>Evo Set Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetUnionImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetUnion()
		 * @generated
		 */
		EClass EVO_SET_UNION = eINSTANCE.getEvoSetUnion();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetDifferenceImpl <em>Evo Set Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetDifferenceImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetDifference()
		 * @generated
		 */
		EClass EVO_SET_DIFFERENCE = eINSTANCE.getEvoSetDifference();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetSymmetricDifferenceImpl <em>Evo Set Symmetric Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetSymmetricDifferenceImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetSymmetricDifference()
		 * @generated
		 */
		EClass EVO_SET_SYMMETRIC_DIFFERENCE = eINSTANCE.getEvoSetSymmetricDifference();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetCartesianProductImpl <em>Evo Set Cartesian Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetCartesianProductImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetCartesianProduct()
		 * @generated
		 */
		EClass EVO_SET_CARTESIAN_PRODUCT = eINSTANCE.getEvoSetCartesianProduct();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetCardinalityImpl <em>Evo Set Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetCardinalityImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetCardinality()
		 * @generated
		 */
		EClass EVO_SET_CARDINALITY = eINSTANCE.getEvoSetCardinality();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoElementOfImpl <em>Evo Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoElementOfImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoElementOf()
		 * @generated
		 */
		EClass EVO_ELEMENT_OF = eINSTANCE.getEvoElementOf();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetNotElementOfImpl <em>Evo Set Not Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetNotElementOfImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetNotElementOf()
		 * @generated
		 */
		EClass EVO_SET_NOT_ELEMENT_OF = eINSTANCE.getEvoSetNotElementOf();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.EvoAbstractQuantifierTerm
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAbstractQuantifierTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_QUANTIFIER_TERM = eINSTANCE.getEvoAbstractQuantifierTerm();

		/**
		 * The meta object literal for the '<em><b>Bounded Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES = eINSTANCE.getEvoAbstractQuantifierTerm_BoundedVariables();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoForAllImpl <em>Evo For All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoForAllImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoForAll()
		 * @generated
		 */
		EClass EVO_FOR_ALL = eINSTANCE.getEvoForAll();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoExistImpl <em>Evo Exist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoExistImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoExist()
		 * @generated
		 */
		EClass EVO_EXIST = eINSTANCE.getEvoExist();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoUniqueExistsImpl <em>Evo Unique Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoUniqueExistsImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoUniqueExists()
		 * @generated
		 */
		EClass EVO_UNIQUE_EXISTS = eINSTANCE.getEvoUniqueExists();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoFormulaImpl <em>Evo Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoFormulaImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFormula()
		 * @generated
		 */
		EClass EVO_FORMULA = eINSTANCE.getEvoFormula();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_FORMULA__TERM = eINSTANCE.getEvoFormula_Term();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoVariableTermImpl <em>Evo Variable Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoVariableTermImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoVariableTerm()
		 * @generated
		 */
		EClass EVO_VARIABLE_TERM = eINSTANCE.getEvoVariableTerm();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_VARIABLE_TERM__VARIABLE = eINSTANCE.getEvoVariableTerm_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_VARIABLE_TERM__TYPE = eINSTANCE.getEvoVariableTerm_Type();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoApplicationConstraintTermImpl <em>Evo Application Constraint Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoApplicationConstraintTermImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoApplicationConstraintTerm()
		 * @generated
		 */
		EClass EVO_APPLICATION_CONSTRAINT_TERM = eINSTANCE.getEvoApplicationConstraintTerm();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_APPLICATION_CONSTRAINT_TERM__VARIABLE = eINSTANCE.getEvoApplicationConstraintTerm_Variable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSizeImpl <em>Evo Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSizeImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSize()
		 * @generated
		 */
		EClass EVO_SIZE = eINSTANCE.getEvoSize();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_SIZE__SIZE = eINSTANCE.getEvoSize_Size();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoGroupTypeImpl <em>Evo Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoGroupTypeImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoGroupType()
		 * @generated
		 */
		EClass EVO_GROUP_TYPE = eINSTANCE.getEvoGroupType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_GROUP_TYPE__TYPE = eINSTANCE.getEvoGroupType_Type();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_GROUP_TYPE__VARIABLES = eINSTANCE.getEvoGroupType_Variables();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoFeatureTypeImpl <em>Evo Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoFeatureTypeImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoFeatureType()
		 * @generated
		 */
		EClass EVO_FEATURE_TYPE = eINSTANCE.getEvoFeatureType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_FEATURE_TYPE__TYPE = eINSTANCE.getEvoFeatureType_Type();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_FEATURE_TYPE__VARIABLES = eINSTANCE.getEvoFeatureType_Variables();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSatisfiableImpl <em>Evo Satisfiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSatisfiableImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSatisfiable()
		 * @generated
		 */
		EClass EVO_SATISFIABLE = eINSTANCE.getEvoSatisfiable();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_SATISFIABLE__VARIABLES = eINSTANCE.getEvoSatisfiable_Variables();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSetTermImpl <em>Evo Set Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSetTermImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSetTerm()
		 * @generated
		 */
		EClass EVO_SET_TERM = eINSTANCE.getEvoSetTerm();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_SET_TERM__VARIABLES = eINSTANCE.getEvoSetTerm_Variables();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoChildrenOfImpl <em>Evo Children Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoChildrenOfImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoChildrenOf()
		 * @generated
		 */
		EClass EVO_CHILDREN_OF = eINSTANCE.getEvoChildrenOf();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_CHILDREN_OF__VARIABLE = eINSTANCE.getEvoChildrenOf_Variable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoSiblingsOfImpl <em>Evo Siblings Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoSiblingsOfImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoSiblingsOf()
		 * @generated
		 */
		EClass EVO_SIBLINGS_OF = eINSTANCE.getEvoSiblingsOf();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_SIBLINGS_OF__VARIABLE = eINSTANCE.getEvoSiblingsOf_Variable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoParentOfImpl <em>Evo Parent Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoParentOfImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoParentOf()
		 * @generated
		 */
		EClass EVO_PARENT_OF = eINSTANCE.getEvoParentOf();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_PARENT_OF__VARIABLE = eINSTANCE.getEvoParentOf_Variable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoAllMappingsImpl <em>Evo All Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoAllMappingsImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAllMappings()
		 * @generated
		 */
		EClass EVO_ALL_MAPPINGS = eINSTANCE.getEvoAllMappings();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evologic.impl.EvoAllConfigurationsImpl <em>Evo All Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evologic.impl.EvoAllConfigurationsImpl
		 * @see de.evorepair.logic.evologic.impl.EvoLogicPackageImpl#getEvoAllConfigurations()
		 * @generated
		 */
		EClass EVO_ALL_CONFIGURATIONS = eINSTANCE.getEvoAllConfigurations();

	}

} //EvoLogicPackage
