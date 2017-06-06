/**
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation.evoOperationDsl.impl;

import de.evorepair.evolution.evooperation.EvoOperationPackage;

import de.evorepair.operation.evoOperationDsl.EvoOperationDslFactory;
import de.evorepair.operation.evoOperationDsl.EvoOperationDslPackage;
import de.evorepair.operation.evoOperationDsl.GrammarEntry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoOperationDslPackageImpl extends EPackageImpl implements EvoOperationDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarEntryEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.evorepair.operation.evoOperationDsl.EvoOperationDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EvoOperationDslPackageImpl()
  {
    super(eNS_URI, EvoOperationDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EvoOperationDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EvoOperationDslPackage init()
  {
    if (isInited) return (EvoOperationDslPackage)EPackage.Registry.INSTANCE.getEPackage(EvoOperationDslPackage.eNS_URI);

    // Obtain or create and register package
    EvoOperationDslPackageImpl theEvoOperationDslPackage = (EvoOperationDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvoOperationDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvoOperationDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EvoOperationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEvoOperationDslPackage.createPackageContents();

    // Initialize created meta-data
    theEvoOperationDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEvoOperationDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EvoOperationDslPackage.eNS_URI, theEvoOperationDslPackage);
    return theEvoOperationDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammarEntry()
  {
    return grammarEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammarEntry_Container()
  {
    return (EReference)grammarEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoOperationDslFactory getEvoOperationDslFactory()
  {
    return (EvoOperationDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    grammarEntryEClass = createEClass(GRAMMAR_ENTRY);
    createEReference(grammarEntryEClass, GRAMMAR_ENTRY__CONTAINER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EvoOperationPackage theEvoOperationPackage = (EvoOperationPackage)EPackage.Registry.INSTANCE.getEPackage(EvoOperationPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(grammarEntryEClass, GrammarEntry.class, "GrammarEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammarEntry_Container(), theEvoOperationPackage.getEvoOperationContainer(), null, "container", null, 0, 1, GrammarEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EvoOperationDslPackageImpl