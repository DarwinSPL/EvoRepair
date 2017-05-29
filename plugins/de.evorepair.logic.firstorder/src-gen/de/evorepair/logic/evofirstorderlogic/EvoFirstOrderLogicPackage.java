/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evovariable.EvoVariablePackage;

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
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import configuration='../../eu.hyvar.feature.configuration/model/Configuration.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore' evooperation_0='../../de.evorepair.evolution.operation/model/EvoOperation.ecore#/' evovariable_0='../../de.evorepair.evolution.variable/model/EvoVariable.ecore#/' feature_0='../../eu.hyvar.feature/model/Feature.ecore#/' mapping_0='../../eu.hyvar.feature.mapping/model/Mapping.ecore#/'"
 * @generated
 */
public interface EvoFirstOrderLogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evofirstorderlogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://darwinspl.de/evorepair/logic/0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evofirstorderlogic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvoFirstOrderLogicPackage eINSTANCE = de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractTermImpl <em>Evo Abstract Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractTermImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_TERM = 6;

	/**
	 * The number of structural features of the '<em>Evo Abstract Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TERM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Evo Abstract Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm <em>Evo Abstract Two Parameter Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractTwoParameterTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_TWO_PARAMETER_TERM = 2;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Abstract Two Parameter Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Abstract Two Parameter Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAndImpl <em>Evo And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAndImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAnd()
	 * @generated
	 */
	int EVO_AND = 0;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_AND__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_AND__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_AND_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_AND_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl <em>Evo Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoOr()
	 * @generated
	 */
	int EVO_OR = 1;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_OR__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_OR__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_OR_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_OR_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoXOrImpl <em>Evo XOr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoXOrImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoXOr()
	 * @generated
	 */
	int EVO_XOR = 3;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_XOR_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm <em>Evo Abstract One Parameter Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractOneParameterTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_ONE_PARAMETER_TERM = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Abstract One Parameter Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_ONE_PARAMETER_TERM_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Abstract One Parameter Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_ONE_PARAMETER_TERM_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoNotImpl <em>Evo Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoNotImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoNot()
	 * @generated
	 */
	int EVO_NOT = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT__ELEMENT = EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT_FEATURE_COUNT = EVO_ABSTRACT_ONE_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_NOT_OPERATION_COUNT = EVO_ABSTRACT_ONE_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEqualImpl <em>Evo Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEqualImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEqual()
	 * @generated
	 */
	int EVO_EQUAL = 7;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EQUAL__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EQUAL__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EQUAL_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EQUAL_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoUnequalImpl <em>Evo Unequal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoUnequalImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoUnequal()
	 * @generated
	 */
	int EVO_UNEQUAL = 8;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNEQUAL__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNEQUAL__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Unequal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNEQUAL_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Unequal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNEQUAL_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoImplicationImpl <em>Evo Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoImplicationImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoImplication()
	 * @generated
	 */
	int EVO_IMPLICATION = 9;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_IMPLICATION__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_IMPLICATION__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_IMPLICATION_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_IMPLICATION_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoBiconditionalImpl <em>Evo Biconditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoBiconditionalImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoBiconditional()
	 * @generated
	 */
	int EVO_BICONDITIONAL = 10;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL__LEFT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL__RIGHT_ELEMENT = EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL_FEATURE_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Biconditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_BICONDITIONAL_OPERATION_COUNT = EVO_ABSTRACT_TWO_PARAMETER_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl <em>Evo Formula Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormulaVariable()
	 * @generated
	 */
	int EVO_FORMULA_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE__NAME = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE__INDEX = EVO_ABSTRACT_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE__VARIABLE_TYPE = EVO_ABSTRACT_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evo Formula Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evo Formula Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_VARIABLE_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaSetVariableImpl <em>Evo Formula Set Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaSetVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormulaSetVariable()
	 * @generated
	 */
	int EVO_FORMULA_SET_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE__NAME = EvoVariablePackage.EVO_SET_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE__INDEX = EvoVariablePackage.EVO_SET_VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_SET_VARIABLE__VARIABLE_TYPE = EvoVariablePackage.EVO_SET_VARIABLE__VARIABLE_TYPE;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractSetTermImpl <em>Evo Abstract Set Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractSetTermImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractSetTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_SET_TERM = 13;

	/**
	 * The number of structural features of the '<em>Evo Abstract Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_SET_TERM_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Abstract Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_SET_TERM_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetInclusionImpl <em>Evo Set Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetInclusionImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetInclusion()
	 * @generated
	 */
	int EVO_SET_INCLUSION = 14;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INCLUSION__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetIntersectionImpl <em>Evo Set Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetIntersectionImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetIntersection()
	 * @generated
	 */
	int EVO_SET_INTERSECTION = 15;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_INTERSECTION__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetUnionImpl <em>Evo Set Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetUnionImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetUnion()
	 * @generated
	 */
	int EVO_SET_UNION = 16;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_UNION__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetDifferenceImpl <em>Evo Set Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetDifferenceImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetDifference()
	 * @generated
	 */
	int EVO_SET_DIFFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_DIFFERENCE__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetSymmetricDifferenceImpl <em>Evo Set Symmetric Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetSymmetricDifferenceImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetSymmetricDifference()
	 * @generated
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_SYMMETRIC_DIFFERENCE__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetCartesianProductImpl <em>Evo Set Cartesian Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetCartesianProductImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetCartesianProduct()
	 * @generated
	 */
	int EVO_SET_CARTESIAN_PRODUCT = 19;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARTESIAN_PRODUCT__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetCardinalityImpl <em>Evo Set Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetCardinalityImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetCardinality()
	 * @generated
	 */
	int EVO_SET_CARDINALITY = 20;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_CARDINALITY__ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetElementOfImpl <em>Evo Set Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetElementOfImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetElementOf()
	 * @generated
	 */
	int EVO_SET_ELEMENT_OF = 21;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_ELEMENT_OF__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_ELEMENT_OF__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Set Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_ELEMENT_OF_FEATURE_COUNT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Set Element Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_ELEMENT_OF_OPERATION_COUNT = EVO_ABSTRACT_SET_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetNotElementOfImpl <em>Evo Set Not Element Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetNotElementOfImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetNotElementOf()
	 * @generated
	 */
	int EVO_SET_NOT_ELEMENT_OF = 22;

	/**
	 * The feature id for the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF__LEFT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SET_NOT_ELEMENT_OF__RIGHT_ELEMENT = EVO_ABSTRACT_SET_TERM_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractQuantifierTerm()
	 * @generated
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM = 23;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM__ELEMENT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounded Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE = EVO_ABSTRACT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Abstract Quantifier Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Abstract Quantifier Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ABSTRACT_QUANTIFIER_TERM_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl <em>Evo For All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoForAll()
	 * @generated
	 */
	int EVO_FOR_ALL = 24;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL__ELEMENT = EVO_ABSTRACT_QUANTIFIER_TERM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounded Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FOR_ALL__BOUNDED_VARIABLE = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoExistImpl <em>Evo Exist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoExistImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoExist()
	 * @generated
	 */
	int EVO_EXIST = 25;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST__ELEMENT = EVO_ABSTRACT_QUANTIFIER_TERM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounded Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EXIST__BOUNDED_VARIABLE = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoUniqueExistsImpl <em>Evo Unique Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoUniqueExistsImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoUniqueExists()
	 * @generated
	 */
	int EVO_UNIQUE_EXISTS = 26;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS__ELEMENT = EVO_ABSTRACT_QUANTIFIER_TERM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounded Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_UNIQUE_EXISTS__BOUNDED_VARIABLE = EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE;

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
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl <em>Evo Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormula()
	 * @generated
	 */
	int EVO_FORMULA = 27;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA__TERM = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Test Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA__TEST_TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Evo Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Evo Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoVariableTermImpl <em>Evo Variable Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoVariableTermImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoVariableTerm()
	 * @generated
	 */
	int EVO_VARIABLE_TERM = 28;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM__VARIABLE = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM__ID = EVO_ABSTRACT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Variable Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Variable Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_VARIABLE_TERM_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEvolutionTermImpl <em>Evo Evolution Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEvolutionTermImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEvolutionTerm()
	 * @generated
	 */
	int EVO_EVOLUTION_TERM = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM__NAME = EvoVariablePackage.EVO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM__INDEX = EvoVariablePackage.EVO_VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM__VARIABLE_TYPE = EvoVariablePackage.EVO_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM__AFTER_EVOLUTION = EvoVariablePackage.EVO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Evolution Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM_FEATURE_COUNT = EvoVariablePackage.EVO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Evolution Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EVOLUTION_TERM_OPERATION_COUNT = EvoVariablePackage.EVO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoApplicationConstraintVariableImpl <em>Evo Application Constraint Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoApplicationConstraintVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoApplicationConstraintVariable()
	 * @generated
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE__MAPPING = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Application Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Application Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_APPLICATION_CONSTRAINT_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureModelConstraintVariableImpl <em>Evo Feature Model Constraint Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureModelConstraintVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFeatureModelConstraintVariable()
	 * @generated
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The number of structural features of the '<em>Evo Feature Model Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Feature Model Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoPredefinedVariableImpl <em>Evo Predefined Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoPredefinedVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoPredefinedVariable()
	 * @generated
	 */
	int EVO_PREDEFINED_VARIABLE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The number of structural features of the '<em>Evo Predefined Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Predefined Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_PREDEFINED_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllFeaturesVariableImpl <em>Evo All Features Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllFeaturesVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllFeaturesVariable()
	 * @generated
	 */
	int EVO_ALL_FEATURES_VARIABLE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The number of structural features of the '<em>Evo All Features Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo All Features Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_FEATURES_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllValidConfigurationsVariableImpl <em>Evo All Valid Configurations Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllValidConfigurationsVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllValidConfigurationsVariable()
	 * @generated
	 */
	int EVO_ALL_VALID_CONFIGURATIONS_VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Feature Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Evo All Valid Configurations Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_VALID_CONFIGURATIONS_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evo All Valid Configurations Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_VALID_CONFIGURATIONS_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl <em>Evo All Mappings Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllMappingsVariable()
	 * @generated
	 */
	int EVO_ALL_MAPPINGS_VARIABLE = 34;

	/**
	 * The feature id for the '<em><b>Associated Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Evo All Mappings Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_MAPPINGS_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evo All Mappings Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_ALL_MAPPINGS_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingAssociatedAssetsVariableImpl <em>Evo Mapping Associated Assets Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoMappingAssociatedAssetsVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoMappingAssociatedAssetsVariable()
	 * @generated
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Associated Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Mapping Associated Assets Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Mapping Associated Assets Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl <em>Evo Mapping Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoMappingVariable()
	 * @generated
	 */
	int EVO_MAPPING_VARIABLE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__NAME = EVO_PREDEFINED_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__INDEX = EVO_PREDEFINED_VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__VARIABLE_TYPE = EVO_PREDEFINED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__AFTER_EVOLUTION = EVO_PREDEFINED_VARIABLE__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__MAPPING = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE__CONTAINING_FEATURE = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Mapping Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE_FEATURE_COUNT = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Mapping Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_VARIABLE_OPERATION_COUNT = EVO_PREDEFINED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoInvolvedFeatureVariableImpl <em>Evo Involved Feature Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoInvolvedFeatureVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoInvolvedFeatureVariable()
	 * @generated
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The number of structural features of the '<em>Evo Involved Feature Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Involved Feature Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_INVOLVED_FEATURE_VARIABLE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoRequirementVariableImpl <em>Evo Requirement Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoRequirementVariableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoRequirementVariable()
	 * @generated
	 */
	int EVO_REQUIREMENT_VARIABLE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE__NAME = EVO_PREDEFINED_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE__INDEX = EVO_PREDEFINED_VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE__VARIABLE_TYPE = EVO_PREDEFINED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE__AFTER_EVOLUTION = EVO_PREDEFINED_VARIABLE__AFTER_EVOLUTION;

	/**
	 * The number of structural features of the '<em>Evo Requirement Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE_FEATURE_COUNT = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Requirement Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_REQUIREMENT_VARIABLE_OPERATION_COUNT = EVO_PREDEFINED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEmptyImpl <em>Evo Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEmptyImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEmpty()
	 * @generated
	 */
	int EVO_EMPTY = 39;

	/**
	 * The number of structural features of the '<em>Evo Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EMPTY_FEATURE_COUNT = EVO_ABSTRACT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_EMPTY_OPERATION_COUNT = EVO_ABSTRACT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoGroupTypeImpl <em>Evo Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoGroupTypeImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoGroupType()
	 * @generated
	 */
	int EVO_GROUP_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE__TYPE = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_GROUP_TYPE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl <em>Evo Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFeatureType()
	 * @generated
	 */
	int EVO_FEATURE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__NAME = EVO_EVOLUTION_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__INDEX = EVO_EVOLUTION_TERM__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__VARIABLE_TYPE = EVO_EVOLUTION_TERM__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__AFTER_EVOLUTION = EVO_EVOLUTION_TERM__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE__TYPE = EVO_EVOLUTION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE_FEATURE_COUNT = EVO_EVOLUTION_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_FEATURE_TYPE_OPERATION_COUNT = EVO_EVOLUTION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSiblingsImpl <em>Evo Siblings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSiblingsImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSiblings()
	 * @generated
	 */
	int EVO_SIBLINGS = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS__NAME = EVO_PREDEFINED_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS__INDEX = EVO_PREDEFINED_VARIABLE__INDEX;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS__VARIABLE_TYPE = EVO_PREDEFINED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS__AFTER_EVOLUTION = EVO_PREDEFINED_VARIABLE__AFTER_EVOLUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS__TYPE = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Siblings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_FEATURE_COUNT = EVO_PREDEFINED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Siblings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SIBLINGS_OPERATION_COUNT = EVO_PREDEFINED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSatisfiableImpl <em>Evo Satisfiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSatisfiableImpl
	 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSatisfiable()
	 * @generated
	 */
	int EVO_SATISFIABLE = 44;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE__ELEMENT = EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT;

	/**
	 * The number of structural features of the '<em>Evo Satisfiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE_FEATURE_COUNT = EVO_ABSTRACT_ONE_PARAMETER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evo Satisfiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_SATISFIABLE_OPERATION_COUNT = EVO_ABSTRACT_ONE_PARAMETER_TERM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAnd <em>Evo And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo And</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAnd
	 * @generated
	 */
	EClass getEvoAnd();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoOr <em>Evo Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Or</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoOr
	 * @generated
	 */
	EClass getEvoOr();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm <em>Evo Abstract Two Parameter Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Two Parameter Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm
	 * @generated
	 */
	EClass getEvoAbstractTwoParameterTerm();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getLeftElement <em>Left Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Element</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getLeftElement()
	 * @see #getEvoAbstractTwoParameterTerm()
	 * @generated
	 */
	EReference getEvoAbstractTwoParameterTerm_LeftElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getRightElement <em>Right Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Element</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getRightElement()
	 * @see #getEvoAbstractTwoParameterTerm()
	 * @generated
	 */
	EReference getEvoAbstractTwoParameterTerm_RightElement();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoXOr <em>Evo XOr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo XOr</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoXOr
	 * @generated
	 */
	EClass getEvoXOr();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoNot <em>Evo Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Not</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoNot
	 * @generated
	 */
	EClass getEvoNot();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm <em>Evo Abstract One Parameter Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract One Parameter Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm
	 * @generated
	 */
	EClass getEvoAbstractOneParameterTerm();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm#getElement()
	 * @see #getEvoAbstractOneParameterTerm()
	 * @generated
	 */
	EReference getEvoAbstractOneParameterTerm_Element();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm <em>Evo Abstract Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm
	 * @generated
	 */
	EClass getEvoAbstractTerm();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoEqual <em>Evo Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Equal</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoEqual
	 * @generated
	 */
	EClass getEvoEqual();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoUnequal <em>Evo Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Unequal</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoUnequal
	 * @generated
	 */
	EClass getEvoUnequal();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoImplication <em>Evo Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Implication</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoImplication
	 * @generated
	 */
	EClass getEvoImplication();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoBiconditional <em>Evo Biconditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Biconditional</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoBiconditional
	 * @generated
	 */
	EClass getEvoBiconditional();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable <em>Evo Formula Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable
	 * @generated
	 */
	EClass getEvoFormulaVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormulaSetVariable <em>Evo Formula Set Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula Set Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormulaSetVariable
	 * @generated
	 */
	EClass getEvoFormulaSetVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm <em>Evo Abstract Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Set Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm
	 * @generated
	 */
	EClass getEvoAbstractSetTerm();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetInclusion <em>Evo Set Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Inclusion</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetInclusion
	 * @generated
	 */
	EClass getEvoSetInclusion();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetIntersection <em>Evo Set Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Intersection</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetIntersection
	 * @generated
	 */
	EClass getEvoSetIntersection();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetUnion <em>Evo Set Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Union</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetUnion
	 * @generated
	 */
	EClass getEvoSetUnion();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetDifference <em>Evo Set Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Difference</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetDifference
	 * @generated
	 */
	EClass getEvoSetDifference();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference <em>Evo Set Symmetric Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Symmetric Difference</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference
	 * @generated
	 */
	EClass getEvoSetSymmetricDifference();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetCartesianProduct <em>Evo Set Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Cartesian Product</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetCartesianProduct
	 * @generated
	 */
	EClass getEvoSetCartesianProduct();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetCardinality <em>Evo Set Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Cardinality</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetCardinality
	 * @generated
	 */
	EClass getEvoSetCardinality();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetElementOf <em>Evo Set Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Element Of</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetElementOf
	 * @generated
	 */
	EClass getEvoSetElementOf();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf <em>Evo Set Not Element Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Set Not Element Of</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf
	 * @generated
	 */
	EClass getEvoSetNotElementOf();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Abstract Quantifier Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm
	 * @generated
	 */
	EClass getEvoAbstractQuantifierTerm();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm#getBoundedVariable <em>Bounded Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounded Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm#getBoundedVariable()
	 * @see #getEvoAbstractQuantifierTerm()
	 * @generated
	 */
	EReference getEvoAbstractQuantifierTerm_BoundedVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoForAll <em>Evo For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo For All</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoForAll
	 * @generated
	 */
	EClass getEvoForAll();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoExist <em>Evo Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Exist</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoExist
	 * @generated
	 */
	EClass getEvoExist();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoUniqueExists <em>Evo Unique Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Unique Exists</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoUniqueExists
	 * @generated
	 */
	EClass getEvoUniqueExists();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula <em>Evo Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Formula</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormula
	 * @generated
	 */
	EClass getEvoFormula();

	/**
	 * Returns the meta object for the containment reference '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormula#getTerm()
	 * @see #getEvoFormula()
	 * @generated
	 */
	EReference getEvoFormula_Term();

	/**
	 * Returns the meta object for the containment reference list '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormula#getVariables()
	 * @see #getEvoFormula()
	 * @generated
	 */
	EReference getEvoFormula_Variables();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTestTrigger <em>Test Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Trigger</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFormula#getTestTrigger()
	 * @see #getEvoFormula()
	 * @generated
	 */
	EReference getEvoFormula_TestTrigger();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm <em>Evo Variable Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Variable Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoVariableTerm
	 * @generated
	 */
	EClass getEvoVariableTerm();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getVariable()
	 * @see #getEvoVariableTerm()
	 * @generated
	 */
	EReference getEvoVariableTerm_Variable();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getId()
	 * @see #getEvoVariableTerm()
	 * @generated
	 */
	EAttribute getEvoVariableTerm_Id();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable <em>Evo Application Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Application Constraint Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable
	 * @generated
	 */
	EClass getEvoApplicationConstraintVariable();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable#getMapping()
	 * @see #getEvoApplicationConstraintVariable()
	 * @generated
	 */
	EReference getEvoApplicationConstraintVariable_Mapping();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureModelConstraintVariable <em>Evo Feature Model Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Feature Model Constraint Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFeatureModelConstraintVariable
	 * @generated
	 */
	EClass getEvoFeatureModelConstraintVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoPredefinedVariable <em>Evo Predefined Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Predefined Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoPredefinedVariable
	 * @generated
	 */
	EClass getEvoPredefinedVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAllFeaturesVariable <em>Evo All Features Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo All Features Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAllFeaturesVariable
	 * @generated
	 */
	EClass getEvoAllFeaturesVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable <em>Evo All Valid Configurations Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo All Valid Configurations Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable
	 * @generated
	 */
	EClass getEvoAllValidConfigurationsVariable();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable#getFeatureVariable <em>Feature Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable#getFeatureVariable()
	 * @see #getEvoAllValidConfigurationsVariable()
	 * @generated
	 */
	EReference getEvoAllValidConfigurationsVariable_FeatureVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable <em>Evo All Mappings Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo All Mappings Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable
	 * @generated
	 */
	EClass getEvoAllMappingsVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable#getAssociatedMappings <em>Associated Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Mappings</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable#getAssociatedMappings()
	 * @see #getEvoAllMappingsVariable()
	 * @generated
	 */
	EReference getEvoAllMappingsVariable_AssociatedMappings();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable <em>Evo Mapping Associated Assets Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Mapping Associated Assets Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable
	 * @generated
	 */
	EClass getEvoMappingAssociatedAssetsVariable();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable#getAssociatedMapping <em>Associated Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Mapping</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable#getAssociatedMapping()
	 * @see #getEvoMappingAssociatedAssetsVariable()
	 * @generated
	 */
	EReference getEvoMappingAssociatedAssetsVariable_AssociatedMapping();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable <em>Evo Mapping Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Mapping Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoMappingVariable
	 * @generated
	 */
	EClass getEvoMappingVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getMapping()
	 * @see #getEvoMappingVariable()
	 * @generated
	 */
	EAttribute getEvoMappingVariable_Mapping();

	/**
	 * Returns the meta object for the reference '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getContainingFeature <em>Containing Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Feature</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getContainingFeature()
	 * @see #getEvoMappingVariable()
	 * @generated
	 */
	EReference getEvoMappingVariable_ContainingFeature();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoInvolvedFeatureVariable <em>Evo Involved Feature Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Involved Feature Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoInvolvedFeatureVariable
	 * @generated
	 */
	EClass getEvoInvolvedFeatureVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoRequirementVariable <em>Evo Requirement Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Requirement Variable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoRequirementVariable
	 * @generated
	 */
	EClass getEvoRequirementVariable();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoEmpty <em>Evo Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Empty</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoEmpty
	 * @generated
	 */
	EClass getEvoEmpty();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoGroupType <em>Evo Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Group Type</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoGroupType
	 * @generated
	 */
	EClass getEvoGroupType();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoGroupType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoGroupType#getType()
	 * @see #getEvoGroupType()
	 * @generated
	 */
	EAttribute getEvoGroupType_Type();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType <em>Evo Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Feature Type</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFeatureType
	 * @generated
	 */
	EClass getEvoFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFeatureType#getType()
	 * @see #getEvoFeatureType()
	 * @generated
	 */
	EAttribute getEvoFeatureType_Type();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm <em>Evo Evolution Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Evolution Term</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm
	 * @generated
	 */
	EClass getEvoEvolutionTerm();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm#isAfterEvolution <em>After Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Evolution</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm#isAfterEvolution()
	 * @see #getEvoEvolutionTerm()
	 * @generated
	 */
	EAttribute getEvoEvolutionTerm_AfterEvolution();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSiblings <em>Evo Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Siblings</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSiblings
	 * @generated
	 */
	EClass getEvoSiblings();

	/**
	 * Returns the meta object for the attribute '{@link de.evorepair.logic.evofirstorderlogic.EvoSiblings#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSiblings#getType()
	 * @see #getEvoSiblings()
	 * @generated
	 */
	EAttribute getEvoSiblings_Type();

	/**
	 * Returns the meta object for class '{@link de.evorepair.logic.evofirstorderlogic.EvoSatisfiable <em>Evo Satisfiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Satisfiable</em>'.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoSatisfiable
	 * @generated
	 */
	EClass getEvoSatisfiable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvoFirstOrderLogicFactory getEvoFirstOrderLogicFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAndImpl <em>Evo And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAndImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAnd()
		 * @generated
		 */
		EClass EVO_AND = eINSTANCE.getEvoAnd();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl <em>Evo Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoOr()
		 * @generated
		 */
		EClass EVO_OR = eINSTANCE.getEvoOr();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm <em>Evo Abstract Two Parameter Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractTwoParameterTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_TWO_PARAMETER_TERM = eINSTANCE.getEvoAbstractTwoParameterTerm();

		/**
		 * The meta object literal for the '<em><b>Left Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT = eINSTANCE.getEvoAbstractTwoParameterTerm_LeftElement();

		/**
		 * The meta object literal for the '<em><b>Right Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT = eINSTANCE.getEvoAbstractTwoParameterTerm_RightElement();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoXOrImpl <em>Evo XOr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoXOrImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoXOr()
		 * @generated
		 */
		EClass EVO_XOR = eINSTANCE.getEvoXOr();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoNotImpl <em>Evo Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoNotImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoNot()
		 * @generated
		 */
		EClass EVO_NOT = eINSTANCE.getEvoNot();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm <em>Evo Abstract One Parameter Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractOneParameterTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_ONE_PARAMETER_TERM = eINSTANCE.getEvoAbstractOneParameterTerm();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT = eINSTANCE.getEvoAbstractOneParameterTerm_Element();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractTermImpl <em>Evo Abstract Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractTermImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_TERM = eINSTANCE.getEvoAbstractTerm();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEqualImpl <em>Evo Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEqualImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEqual()
		 * @generated
		 */
		EClass EVO_EQUAL = eINSTANCE.getEvoEqual();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoUnequalImpl <em>Evo Unequal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoUnequalImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoUnequal()
		 * @generated
		 */
		EClass EVO_UNEQUAL = eINSTANCE.getEvoUnequal();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoImplicationImpl <em>Evo Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoImplicationImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoImplication()
		 * @generated
		 */
		EClass EVO_IMPLICATION = eINSTANCE.getEvoImplication();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoBiconditionalImpl <em>Evo Biconditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoBiconditionalImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoBiconditional()
		 * @generated
		 */
		EClass EVO_BICONDITIONAL = eINSTANCE.getEvoBiconditional();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl <em>Evo Formula Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormulaVariable()
		 * @generated
		 */
		EClass EVO_FORMULA_VARIABLE = eINSTANCE.getEvoFormulaVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaSetVariableImpl <em>Evo Formula Set Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaSetVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormulaSetVariable()
		 * @generated
		 */
		EClass EVO_FORMULA_SET_VARIABLE = eINSTANCE.getEvoFormulaSetVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractSetTermImpl <em>Evo Abstract Set Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAbstractSetTermImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractSetTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_SET_TERM = eINSTANCE.getEvoAbstractSetTerm();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetInclusionImpl <em>Evo Set Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetInclusionImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetInclusion()
		 * @generated
		 */
		EClass EVO_SET_INCLUSION = eINSTANCE.getEvoSetInclusion();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetIntersectionImpl <em>Evo Set Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetIntersectionImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetIntersection()
		 * @generated
		 */
		EClass EVO_SET_INTERSECTION = eINSTANCE.getEvoSetIntersection();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetUnionImpl <em>Evo Set Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetUnionImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetUnion()
		 * @generated
		 */
		EClass EVO_SET_UNION = eINSTANCE.getEvoSetUnion();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetDifferenceImpl <em>Evo Set Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetDifferenceImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetDifference()
		 * @generated
		 */
		EClass EVO_SET_DIFFERENCE = eINSTANCE.getEvoSetDifference();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetSymmetricDifferenceImpl <em>Evo Set Symmetric Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetSymmetricDifferenceImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetSymmetricDifference()
		 * @generated
		 */
		EClass EVO_SET_SYMMETRIC_DIFFERENCE = eINSTANCE.getEvoSetSymmetricDifference();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetCartesianProductImpl <em>Evo Set Cartesian Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetCartesianProductImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetCartesianProduct()
		 * @generated
		 */
		EClass EVO_SET_CARTESIAN_PRODUCT = eINSTANCE.getEvoSetCartesianProduct();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetCardinalityImpl <em>Evo Set Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetCardinalityImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetCardinality()
		 * @generated
		 */
		EClass EVO_SET_CARDINALITY = eINSTANCE.getEvoSetCardinality();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetElementOfImpl <em>Evo Set Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetElementOfImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetElementOf()
		 * @generated
		 */
		EClass EVO_SET_ELEMENT_OF = eINSTANCE.getEvoSetElementOf();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSetNotElementOfImpl <em>Evo Set Not Element Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSetNotElementOfImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSetNotElementOf()
		 * @generated
		 */
		EClass EVO_SET_NOT_ELEMENT_OF = eINSTANCE.getEvoSetNotElementOf();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm <em>Evo Abstract Quantifier Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAbstractQuantifierTerm()
		 * @generated
		 */
		EClass EVO_ABSTRACT_QUANTIFIER_TERM = eINSTANCE.getEvoAbstractQuantifierTerm();

		/**
		 * The meta object literal for the '<em><b>Bounded Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE = eINSTANCE.getEvoAbstractQuantifierTerm_BoundedVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl <em>Evo For All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoForAll()
		 * @generated
		 */
		EClass EVO_FOR_ALL = eINSTANCE.getEvoForAll();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoExistImpl <em>Evo Exist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoExistImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoExist()
		 * @generated
		 */
		EClass EVO_EXIST = eINSTANCE.getEvoExist();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoUniqueExistsImpl <em>Evo Unique Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoUniqueExistsImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoUniqueExists()
		 * @generated
		 */
		EClass EVO_UNIQUE_EXISTS = eINSTANCE.getEvoUniqueExists();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl <em>Evo Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFormula()
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
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_FORMULA__VARIABLES = eINSTANCE.getEvoFormula_Variables();

		/**
		 * The meta object literal for the '<em><b>Test Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_FORMULA__TEST_TRIGGER = eINSTANCE.getEvoFormula_TestTrigger();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoVariableTermImpl <em>Evo Variable Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoVariableTermImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoVariableTerm()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_VARIABLE_TERM__ID = eINSTANCE.getEvoVariableTerm_Id();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoApplicationConstraintVariableImpl <em>Evo Application Constraint Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoApplicationConstraintVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoApplicationConstraintVariable()
		 * @generated
		 */
		EClass EVO_APPLICATION_CONSTRAINT_VARIABLE = eINSTANCE.getEvoApplicationConstraintVariable();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_APPLICATION_CONSTRAINT_VARIABLE__MAPPING = eINSTANCE.getEvoApplicationConstraintVariable_Mapping();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureModelConstraintVariableImpl <em>Evo Feature Model Constraint Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureModelConstraintVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFeatureModelConstraintVariable()
		 * @generated
		 */
		EClass EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE = eINSTANCE.getEvoFeatureModelConstraintVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoPredefinedVariableImpl <em>Evo Predefined Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoPredefinedVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoPredefinedVariable()
		 * @generated
		 */
		EClass EVO_PREDEFINED_VARIABLE = eINSTANCE.getEvoPredefinedVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllFeaturesVariableImpl <em>Evo All Features Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllFeaturesVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllFeaturesVariable()
		 * @generated
		 */
		EClass EVO_ALL_FEATURES_VARIABLE = eINSTANCE.getEvoAllFeaturesVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllValidConfigurationsVariableImpl <em>Evo All Valid Configurations Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllValidConfigurationsVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllValidConfigurationsVariable()
		 * @generated
		 */
		EClass EVO_ALL_VALID_CONFIGURATIONS_VARIABLE = eINSTANCE.getEvoAllValidConfigurationsVariable();

		/**
		 * The meta object literal for the '<em><b>Feature Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE = eINSTANCE.getEvoAllValidConfigurationsVariable_FeatureVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl <em>Evo All Mappings Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoAllMappingsVariable()
		 * @generated
		 */
		EClass EVO_ALL_MAPPINGS_VARIABLE = eINSTANCE.getEvoAllMappingsVariable();

		/**
		 * The meta object literal for the '<em><b>Associated Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS = eINSTANCE.getEvoAllMappingsVariable_AssociatedMappings();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingAssociatedAssetsVariableImpl <em>Evo Mapping Associated Assets Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoMappingAssociatedAssetsVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoMappingAssociatedAssetsVariable()
		 * @generated
		 */
		EClass EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE = eINSTANCE.getEvoMappingAssociatedAssetsVariable();

		/**
		 * The meta object literal for the '<em><b>Associated Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING = eINSTANCE.getEvoMappingAssociatedAssetsVariable_AssociatedMapping();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl <em>Evo Mapping Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoMappingVariable()
		 * @generated
		 */
		EClass EVO_MAPPING_VARIABLE = eINSTANCE.getEvoMappingVariable();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_MAPPING_VARIABLE__MAPPING = eINSTANCE.getEvoMappingVariable_Mapping();

		/**
		 * The meta object literal for the '<em><b>Containing Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVO_MAPPING_VARIABLE__CONTAINING_FEATURE = eINSTANCE.getEvoMappingVariable_ContainingFeature();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoInvolvedFeatureVariableImpl <em>Evo Involved Feature Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoInvolvedFeatureVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoInvolvedFeatureVariable()
		 * @generated
		 */
		EClass EVO_INVOLVED_FEATURE_VARIABLE = eINSTANCE.getEvoInvolvedFeatureVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoRequirementVariableImpl <em>Evo Requirement Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoRequirementVariableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoRequirementVariable()
		 * @generated
		 */
		EClass EVO_REQUIREMENT_VARIABLE = eINSTANCE.getEvoRequirementVariable();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEmptyImpl <em>Evo Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEmptyImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEmpty()
		 * @generated
		 */
		EClass EVO_EMPTY = eINSTANCE.getEvoEmpty();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoGroupTypeImpl <em>Evo Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoGroupTypeImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoGroupType()
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
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl <em>Evo Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoFeatureType()
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
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEvolutionTermImpl <em>Evo Evolution Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoEvolutionTermImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoEvolutionTerm()
		 * @generated
		 */
		EClass EVO_EVOLUTION_TERM = eINSTANCE.getEvoEvolutionTerm();

		/**
		 * The meta object literal for the '<em><b>After Evolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_EVOLUTION_TERM__AFTER_EVOLUTION = eINSTANCE.getEvoEvolutionTerm_AfterEvolution();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSiblingsImpl <em>Evo Siblings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSiblingsImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSiblings()
		 * @generated
		 */
		EClass EVO_SIBLINGS = eINSTANCE.getEvoSiblings();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVO_SIBLINGS__TYPE = eINSTANCE.getEvoSiblings_Type();

		/**
		 * The meta object literal for the '{@link de.evorepair.logic.evofirstorderlogic.impl.EvoSatisfiableImpl <em>Evo Satisfiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoSatisfiableImpl
		 * @see de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicPackageImpl#getEvoSatisfiable()
		 * @generated
		 */
		EClass EVO_SATISFIABLE = eINSTANCE.getEvoSatisfiable();

	}

} //EvoFirstOrderLogicPackage
