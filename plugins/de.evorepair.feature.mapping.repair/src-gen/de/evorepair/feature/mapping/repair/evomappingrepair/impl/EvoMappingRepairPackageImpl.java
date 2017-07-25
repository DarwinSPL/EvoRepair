/**
 */
package de.evorepair.feature.mapping.repair.evomappingrepair.impl;

import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingKeep;
import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairExpression;
import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairFactory;
import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairPackage;
import de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace;

import eu.hyvar.context.HyContextInformationPackage;

import eu.hyvar.dataValues.HyDataValuesPackage;

import eu.hyvar.evolution.HyEvolutionPackage;

import eu.hyvar.feature.HyFeaturePackage;

import eu.hyvar.feature.expression.HyExpressionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoMappingRepairPackageImpl extends EPackageImpl implements EvoMappingRepairPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoMappingRepairExpressionEClass = null;

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
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvoMappingRepairPackageImpl()
	{
		super(eNS_URI, EvoMappingRepairFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvoMappingRepairPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvoMappingRepairPackage init()
	{
		if (isInited) return (EvoMappingRepairPackage)EPackage.Registry.INSTANCE.getEPackage(EvoMappingRepairPackage.eNS_URI);

		// Obtain or create and register package
		EvoMappingRepairPackageImpl theEvoMappingRepairPackage = (EvoMappingRepairPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvoMappingRepairPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvoMappingRepairPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HyContextInformationPackage.eINSTANCE.eClass();
		HyDataValuesPackage.eINSTANCE.eClass();
		HyEvolutionPackage.eINSTANCE.eClass();
		HyExpressionPackage.eINSTANCE.eClass();
		HyFeaturePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvoMappingRepairPackage.createPackageContents();

		// Initialize created meta-data
		theEvoMappingRepairPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvoMappingRepairPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvoMappingRepairPackage.eNS_URI, theEvoMappingRepairPackage);
		return theEvoMappingRepairPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoMappingRepairExpression()
	{
		return evoMappingRepairExpressionEClass;
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
	public EClass getEvoMappingReplace()
	{
		return evoMappingReplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingRepairFactory getEvoMappingRepairFactory()
	{
		return (EvoMappingRepairFactory)getEFactoryInstance();
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
		evoMappingRepairExpressionEClass = createEClass(EVO_MAPPING_REPAIR_EXPRESSION);

		evoMappingKeepEClass = createEClass(EVO_MAPPING_KEEP);

		evoMappingReplaceEClass = createEClass(EVO_MAPPING_REPLACE);
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
		evoMappingRepairExpressionEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoMappingKeepEClass.getESuperTypes().add(this.getEvoMappingRepairExpression());
		evoMappingKeepEClass.getESuperTypes().add(theHyExpressionPackage.getHyUnaryExpression());
		evoMappingReplaceEClass.getESuperTypes().add(this.getEvoMappingRepairExpression());
		evoMappingReplaceEClass.getESuperTypes().add(theHyExpressionPackage.getHyBinaryExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(evoMappingRepairExpressionEClass, EvoMappingRepairExpression.class, "EvoMappingRepairExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoMappingKeepEClass, EvoMappingKeep.class, "EvoMappingKeep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoMappingReplaceEClass, EvoMappingReplace.class, "EvoMappingReplace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EvoMappingRepairPackageImpl
