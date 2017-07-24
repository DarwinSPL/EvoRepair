/**
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.impl;

import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.EvoMappingKeep;
import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.EvoMappingReplace;
import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairDslFactory;
import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairDslPackage;
import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairGrammarEntry;

import eu.hyvar.context.HyContextInformationPackage;

import eu.hyvar.dataValues.HyDataValuesPackage;

import eu.hyvar.evolution.HyEvolutionPackage;

import eu.hyvar.feature.HyFeaturePackage;

import eu.hyvar.feature.expression.HyExpressionPackage;

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
public class MappingRepairDslPackageImpl extends EPackageImpl implements MappingRepairDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingRepairGrammarEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evoMappingKeepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evoMappingReplaceEClass = null;

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
   * @see de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MappingRepairDslPackageImpl()
  {
    super(eNS_URI, MappingRepairDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MappingRepairDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MappingRepairDslPackage init()
  {
    if (isInited) return (MappingRepairDslPackage)EPackage.Registry.INSTANCE.getEPackage(MappingRepairDslPackage.eNS_URI);

    // Obtain or create and register package
    MappingRepairDslPackageImpl theMappingRepairDslPackage = (MappingRepairDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingRepairDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingRepairDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    HyExpressionPackage.eINSTANCE.eClass();
    HyFeaturePackage.eINSTANCE.eClass();
    HyDataValuesPackage.eINSTANCE.eClass();
    HyContextInformationPackage.eINSTANCE.eClass();
    HyEvolutionPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMappingRepairDslPackage.createPackageContents();

    // Initialize created meta-data
    theMappingRepairDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMappingRepairDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MappingRepairDslPackage.eNS_URI, theMappingRepairDslPackage);
    return theMappingRepairDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingRepairGrammarEntry()
  {
    return mappingRepairGrammarEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingRepairGrammarEntry_Action()
  {
    return (EReference)mappingRepairGrammarEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvoMappingKeep()
  {
    return evoMappingKeepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvoMappingKeep_Operand()
  {
    return (EReference)evoMappingKeepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvoMappingReplace()
  {
    return evoMappingReplaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvoMappingReplace_Operand1()
  {
    return (EReference)evoMappingReplaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvoMappingReplace_Operand2()
  {
    return (EReference)evoMappingReplaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingRepairDslFactory getMappingRepairDslFactory()
  {
    return (MappingRepairDslFactory)getEFactoryInstance();
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
    mappingRepairGrammarEntryEClass = createEClass(MAPPING_REPAIR_GRAMMAR_ENTRY);
    createEReference(mappingRepairGrammarEntryEClass, MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION);

    evoMappingKeepEClass = createEClass(EVO_MAPPING_KEEP);
    createEReference(evoMappingKeepEClass, EVO_MAPPING_KEEP__OPERAND);

    evoMappingReplaceEClass = createEClass(EVO_MAPPING_REPLACE);
    createEReference(evoMappingReplaceEClass, EVO_MAPPING_REPLACE__OPERAND1);
    createEReference(evoMappingReplaceEClass, EVO_MAPPING_REPLACE__OPERAND2);
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
    HyExpressionPackage theHyExpressionPackage = (HyExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(HyExpressionPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    evoMappingKeepEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
    evoMappingReplaceEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(mappingRepairGrammarEntryEClass, MappingRepairGrammarEntry.class, "MappingRepairGrammarEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingRepairGrammarEntry_Action(), theHyExpressionPackage.getHyExpression(), null, "action", null, 0, 1, MappingRepairGrammarEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evoMappingKeepEClass, EvoMappingKeep.class, "EvoMappingKeep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvoMappingKeep_Operand(), theHyExpressionPackage.getHyExpression(), null, "operand", null, 0, 1, EvoMappingKeep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evoMappingReplaceEClass, EvoMappingReplace.class, "EvoMappingReplace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvoMappingReplace_Operand1(), theHyExpressionPackage.getHyExpression(), null, "operand1", null, 0, 1, EvoMappingReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvoMappingReplace_Operand2(), theHyExpressionPackage.getHyExpression(), null, "operand2", null, 0, 1, EvoMappingReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MappingRepairDslPackageImpl
