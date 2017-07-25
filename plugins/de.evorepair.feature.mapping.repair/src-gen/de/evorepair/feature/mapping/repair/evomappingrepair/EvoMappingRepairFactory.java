/**
 */
package de.evorepair.feature.mapping.repair.evomappingrepair;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairPackage
 * @generated
 */
public interface EvoMappingRepairFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvoMappingRepairFactory eINSTANCE = de.evorepair.feature.mapping.repair.evomappingrepair.impl.EvoMappingRepairFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	EvoMappingRepairExpression createEvoMappingRepairExpression();

	/**
	 * Returns a new object of class '<em>Evo Mapping Keep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Mapping Keep</em>'.
	 * @generated
	 */
	EvoMappingKeep createEvoMappingKeep();

	/**
	 * Returns a new object of class '<em>Evo Mapping Replace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Mapping Replace</em>'.
	 * @generated
	 */
	EvoMappingReplace createEvoMappingReplace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvoMappingRepairPackage getEvoMappingRepairPackage();

} //EvoMappingRepairFactory
