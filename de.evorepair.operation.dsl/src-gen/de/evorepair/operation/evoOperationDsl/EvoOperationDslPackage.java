/**
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation.evoOperationDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.evorepair.operation.evoOperationDsl.EvoOperationDslFactory
 * @model kind="package"
 * @generated
 */
public interface EvoOperationDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "evoOperationDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.evorepair.de/evolution/operation/EvoOperationDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "evoOperationDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvoOperationDslPackage eINSTANCE = de.evorepair.operation.evoOperationDsl.impl.EvoOperationDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.evorepair.operation.evoOperationDsl.impl.GrammarEntryImpl <em>Grammar Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.evorepair.operation.evoOperationDsl.impl.GrammarEntryImpl
   * @see de.evorepair.operation.evoOperationDsl.impl.EvoOperationDslPackageImpl#getGrammarEntry()
   * @generated
   */
  int GRAMMAR_ENTRY = 0;

  /**
   * The feature id for the '<em><b>Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ENTRY__CONTAINER = 0;

  /**
   * The number of structural features of the '<em>Grammar Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ENTRY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.evorepair.operation.evoOperationDsl.GrammarEntry <em>Grammar Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Entry</em>'.
   * @see de.evorepair.operation.evoOperationDsl.GrammarEntry
   * @generated
   */
  EClass getGrammarEntry();

  /**
   * Returns the meta object for the containment reference '{@link de.evorepair.operation.evoOperationDsl.GrammarEntry#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Container</em>'.
   * @see de.evorepair.operation.evoOperationDsl.GrammarEntry#getContainer()
   * @see #getGrammarEntry()
   * @generated
   */
  EReference getGrammarEntry_Container();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EvoOperationDslFactory getEvoOperationDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.evorepair.operation.evoOperationDsl.impl.GrammarEntryImpl <em>Grammar Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.evorepair.operation.evoOperationDsl.impl.GrammarEntryImpl
     * @see de.evorepair.operation.evoOperationDsl.impl.EvoOperationDslPackageImpl#getGrammarEntry()
     * @generated
     */
    EClass GRAMMAR_ENTRY = eINSTANCE.getGrammarEntry();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ENTRY__CONTAINER = eINSTANCE.getGrammarEntry_Container();

  }

} //EvoOperationDslPackage