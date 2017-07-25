/**
 */
package de.evorepair.feature.mapping.repair.evomappingrepair;

import eu.hyvar.feature.expression.HyExpressionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairFactory
 * @model kind="package"
 * @generated
 */
public interface EvoMappingRepairPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evomappingrepair";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://darwinspl.de/evorepair/mapping/repair/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evomappingrepair";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvoMappingRepairPackage eINSTANCE = de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairExpressionImpl
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingRepairExpression()
	 * @generated
	 */
	int EVO_MAPPING_REPAIR_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT = HyExpressionPackage.HY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPAIR_EXPRESSION_OPERATION_COUNT = HyExpressionPackage.HY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingKeepImpl <em>Evo Mapping Keep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingKeepImpl
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingKeep()
	 * @generated
	 */
	int EVO_MAPPING_KEEP = 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_KEEP__OPERAND = EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evo Mapping Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_KEEP_FEATURE_COUNT = EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evo Mapping Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_KEEP_OPERATION_COUNT = EVO_MAPPING_REPAIR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingReplaceImpl <em>Evo Mapping Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingReplaceImpl
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingReplace()
	 * @generated
	 */
	int EVO_MAPPING_REPLACE = 2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPLACE__OPERAND1 = EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPLACE__OPERAND2 = EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evo Mapping Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPLACE_FEATURE_COUNT = EVO_MAPPING_REPAIR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evo Mapping Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVO_MAPPING_REPLACE_OPERATION_COUNT = EVO_MAPPING_REPAIR_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairExpression
	 * @generated
	 */
	EClass getEvoMappingRepairExpression();

	/**
	 * Returns the meta object for class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingKeep <em>Evo Mapping Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Mapping Keep</em>'.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingKeep
	 * @generated
	 */
	EClass getEvoMappingKeep();

	/**
	 * Returns the meta object for class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace <em>Evo Mapping Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evo Mapping Replace</em>'.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace
	 * @generated
	 */
	EClass getEvoMappingReplace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvoMappingRepairFactory getEvoMappingRepairFactory();

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
		 * The meta object literal for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairExpressionImpl
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingRepairExpression()
		 * @generated
		 */
		EClass EVO_MAPPING_REPAIR_EXPRESSION = eINSTANCE.getEvoMappingRepairExpression();

		/**
		 * The meta object literal for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingKeepImpl <em>Evo Mapping Keep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingKeepImpl
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingKeep()
		 * @generated
		 */
		EClass EVO_MAPPING_KEEP = eINSTANCE.getEvoMappingKeep();

		/**
		 * The meta object literal for the '{@link de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingReplaceImpl <em>Evo Mapping Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingReplaceImpl
		 * @see de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairPackageImpl#getEvoMappingReplace()
		 * @generated
		 */
		EClass EVO_MAPPING_REPLACE = eINSTANCE.getEvoMappingReplace();

	}

} //EvoMappingRepairPackage
