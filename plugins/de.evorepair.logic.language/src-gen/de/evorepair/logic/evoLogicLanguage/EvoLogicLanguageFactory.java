/**
 * generated by Xtext 2.11.0
 */
package de.evorepair.logic.evoLogicLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.logic.evoLogicLanguage.EvoLogicLanguagePackage
 * @generated
 */
public interface EvoLogicLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvoLogicLanguageFactory eINSTANCE = de.evorepair.logic.evoLogicLanguage.impl.EvoLogicLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Command Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Document</em>'.
   * @generated
   */
  CommandDocument createCommandDocument();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Evo Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo Formula</em>'.
   * @generated
   */
  EvoFormula createEvoFormula();

  /**
   * Returns a new object of class '<em>Evo Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo Variable</em>'.
   * @generated
   */
  EvoVariable createEvoVariable();

  /**
   * Returns a new object of class '<em>Evo Variable Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo Variable Term</em>'.
   * @generated
   */
  EvoVariableTerm createEvoVariableTerm();

  /**
   * Returns a new object of class '<em>Evo Arbitraty Feature Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo Arbitraty Feature Variable</em>'.
   * @generated
   */
  EvoArbitratyFeatureVariable createEvoArbitratyFeatureVariable();

  /**
   * Returns a new object of class '<em>Evo Abstract Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo Abstract Term</em>'.
   * @generated
   */
  EvoAbstractTerm createEvoAbstractTerm();

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
   * Returns a new object of class '<em>Evo And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evo And</em>'.
   * @generated
   */
  EvoAnd createEvoAnd();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvoLogicLanguagePackage getEvoLogicLanguagePackage();

} //EvoLogicLanguageFactory
