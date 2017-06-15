/**
 */
package de.evorepair.logic.evofirstorderlogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage
 * @generated
 */
public interface EvoFirstOrderLogicFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvoFirstOrderLogicFactory eINSTANCE = de.evorepair.logic.evofirstorderlogic.impl.EvoFirstOrderLogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Evo And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo And</em>'.
	 * @generated
	 */
	EvoAnd createEvoAnd();

	/**
	 * Returns a new object of class '<em>Evo Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Or</em>'.
	 * @generated
	 */
	EvoOr createEvoOr();

	/**
	 * Returns a new object of class '<em>Evo XOr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo XOr</em>'.
	 * @generated
	 */
	EvoXOr createEvoXOr();

	/**
	 * Returns a new object of class '<em>Evo Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Not</em>'.
	 * @generated
	 */
	EvoNot createEvoNot();

	/**
	 * Returns a new object of class '<em>Evo Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Equal</em>'.
	 * @generated
	 */
	EvoEqual createEvoEqual();

	/**
	 * Returns a new object of class '<em>Evo Unequal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Unequal</em>'.
	 * @generated
	 */
	EvoUnequal createEvoUnequal();

	/**
	 * Returns a new object of class '<em>Evo Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Implication</em>'.
	 * @generated
	 */
	EvoImplication createEvoImplication();

	/**
	 * Returns a new object of class '<em>Evo Biconditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Biconditional</em>'.
	 * @generated
	 */
	EvoBiconditional createEvoBiconditional();

	/**
	 * Returns a new object of class '<em>Evo Set Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Inclusion</em>'.
	 * @generated
	 */
	EvoSetInclusion createEvoSetInclusion();

	/**
	 * Returns a new object of class '<em>Evo Set Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Intersection</em>'.
	 * @generated
	 */
	EvoSetIntersection createEvoSetIntersection();

	/**
	 * Returns a new object of class '<em>Evo Set Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Union</em>'.
	 * @generated
	 */
	EvoSetUnion createEvoSetUnion();

	/**
	 * Returns a new object of class '<em>Evo Set Difference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Difference</em>'.
	 * @generated
	 */
	EvoSetDifference createEvoSetDifference();

	/**
	 * Returns a new object of class '<em>Evo Set Symmetric Difference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Symmetric Difference</em>'.
	 * @generated
	 */
	EvoSetSymmetricDifference createEvoSetSymmetricDifference();

	/**
	 * Returns a new object of class '<em>Evo Set Cartesian Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Cartesian Product</em>'.
	 * @generated
	 */
	EvoSetCartesianProduct createEvoSetCartesianProduct();

	/**
	 * Returns a new object of class '<em>Evo Set Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Cardinality</em>'.
	 * @generated
	 */
	EvoSetCardinality createEvoSetCardinality();

	/**
	 * Returns a new object of class '<em>Evo Set Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Element Of</em>'.
	 * @generated
	 */
	EvoSetElementOf createEvoSetElementOf();

	/**
	 * Returns a new object of class '<em>Evo Set Not Element Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Not Element Of</em>'.
	 * @generated
	 */
	EvoSetNotElementOf createEvoSetNotElementOf();

	/**
	 * Returns a new object of class '<em>Evo For All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo For All</em>'.
	 * @generated
	 */
	EvoForAll createEvoForAll();

	/**
	 * Returns a new object of class '<em>Evo Exist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Exist</em>'.
	 * @generated
	 */
	EvoExist createEvoExist();

	/**
	 * Returns a new object of class '<em>Evo Unique Exists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Unique Exists</em>'.
	 * @generated
	 */
	EvoUniqueExists createEvoUniqueExists();

	/**
	 * Returns a new object of class '<em>Evo Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Formula</em>'.
	 * @generated
	 */
	EvoFormula createEvoFormula();

	/**
	 * Returns a new object of class '<em>Evo Variable Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Variable Term</em>'.
	 * @generated
	 */
	EvoVariableTerm createEvoVariableTerm();

	/**
	 * Returns a new object of class '<em>Evo Application Constraint Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Application Constraint Term</em>'.
	 * @generated
	 */
	EvoApplicationConstraintTerm createEvoApplicationConstraintTerm();

	/**
	 * Returns a new object of class '<em>Evo Application Constraint Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Application Constraint Variable</em>'.
	 * @generated
	 */
	EvoApplicationConstraintVariable createEvoApplicationConstraintVariable();

	/**
	 * Returns a new object of class '<em>Evo Feature Model Constraint Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Feature Model Constraint Variable</em>'.
	 * @generated
	 */
	EvoFeatureModelConstraintVariable createEvoFeatureModelConstraintVariable();

	/**
	 * Returns a new object of class '<em>Evo Predefined Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Predefined Variable</em>'.
	 * @generated
	 */
	EvoPredefinedVariable createEvoPredefinedVariable();

	/**
	 * Returns a new object of class '<em>Evo All Features Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo All Features Variable</em>'.
	 * @generated
	 */
	EvoAllFeaturesVariable createEvoAllFeaturesVariable();

	/**
	 * Returns a new object of class '<em>Evo All Mappings Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo All Mappings Variable</em>'.
	 * @generated
	 */
	EvoAllMappingsVariable createEvoAllMappingsVariable();

	/**
	 * Returns a new object of class '<em>Evo Mapping Associated Assets Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Mapping Associated Assets Variable</em>'.
	 * @generated
	 */
	EvoMappingAssociatedAssetsVariable createEvoMappingAssociatedAssetsVariable();

	/**
	 * Returns a new object of class '<em>Evo Mapping Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Mapping Variable</em>'.
	 * @generated
	 */
	EvoMappingVariable createEvoMappingVariable();

	/**
	 * Returns a new object of class '<em>Evo Involved Feature Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Involved Feature Variable</em>'.
	 * @generated
	 */
	EvoInvolvedFeatureVariable createEvoInvolvedFeatureVariable();

	/**
	 * Returns a new object of class '<em>Evo Requirement Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Requirement Variable</em>'.
	 * @generated
	 */
	EvoRequirementVariable createEvoRequirementVariable();

	/**
	 * Returns a new object of class '<em>Evo Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Size</em>'.
	 * @generated
	 */
	EvoSize createEvoSize();

	/**
	 * Returns a new object of class '<em>Evo Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Group Type</em>'.
	 * @generated
	 */
	EvoGroupType createEvoGroupType();

	/**
	 * Returns a new object of class '<em>Evo Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Feature Type</em>'.
	 * @generated
	 */
	EvoFeatureType createEvoFeatureType();

	/**
	 * Returns a new object of class '<em>Evo Evolution Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Evolution Term</em>'.
	 * @generated
	 */
	EvoEvolutionTerm createEvoEvolutionTerm();

	/**
	 * Returns a new object of class '<em>Evo Siblings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Siblings</em>'.
	 * @generated
	 */
	EvoSiblings createEvoSiblings();

	/**
	 * Returns a new object of class '<em>Evo Satisfiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Satisfiable</em>'.
	 * @generated
	 */
	EvoSatisfiable createEvoSatisfiable();

	/**
	 * Returns a new object of class '<em>Evo Set Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evo Set Term</em>'.
	 * @generated
	 */
	EvoSetTerm createEvoSetTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvoFirstOrderLogicPackage getEvoFirstOrderLogicPackage();

} //EvoFirstOrderLogicFactory
