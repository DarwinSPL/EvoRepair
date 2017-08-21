/**
 */
package de.evorepair.logic.evologic.impl;

import de.evorepair.evolution.evooperation.EvoOperationPackage;

import de.evorepair.evolution.evovariable.EvoVariablePackage;

import de.evorepair.logic.evologic.EvoAbstractQuantifierTerm;
import de.evorepair.logic.evologic.EvoAbstractSetTerm;
import de.evorepair.logic.evologic.EvoAllConfigurations;
import de.evorepair.logic.evologic.EvoAllMappings;
import de.evorepair.logic.evologic.EvoApplicationConstraintTerm;
import de.evorepair.logic.evologic.EvoBiconditional;
import de.evorepair.logic.evologic.EvoBinaryExpression;
import de.evorepair.logic.evologic.EvoChildrenOf;
import de.evorepair.logic.evologic.EvoElementOf;
import de.evorepair.logic.evologic.EvoExist;
import de.evorepair.logic.evologic.EvoFeatureType;
import de.evorepair.logic.evologic.EvoForAll;
import de.evorepair.logic.evologic.EvoFormula;
import de.evorepair.logic.evologic.EvoGroupType;
import de.evorepair.logic.evologic.EvoLogicFactory;
import de.evorepair.logic.evologic.EvoLogicPackage;
import de.evorepair.logic.evologic.EvoNot;
import de.evorepair.logic.evologic.EvoParentOf;
import de.evorepair.logic.evologic.EvoSatisfiable;
import de.evorepair.logic.evologic.EvoSetCardinality;
import de.evorepair.logic.evologic.EvoSetCartesianProduct;
import de.evorepair.logic.evologic.EvoSetDifference;
import de.evorepair.logic.evologic.EvoSetInclusion;
import de.evorepair.logic.evologic.EvoSetIntersection;
import de.evorepair.logic.evologic.EvoSetNotElementOf;
import de.evorepair.logic.evologic.EvoSetSymmetricDifference;
import de.evorepair.logic.evologic.EvoSetTerm;
import de.evorepair.logic.evologic.EvoSetUnion;
import de.evorepair.logic.evologic.EvoSiblingsOf;
import de.evorepair.logic.evologic.EvoSize;
import de.evorepair.logic.evologic.EvoVariableTerm;
import de.evorepair.logic.evologic.EvoXOr;

import eu.hyvar.context.HyContextInformationPackage;

import eu.hyvar.dataValues.HyDataValuesPackage;

import eu.hyvar.evolution.HyEvolutionPackage;

import eu.hyvar.feature.HyFeaturePackage;

import eu.hyvar.feature.configuration.HyConfigurationPackage;

import eu.hyvar.feature.expression.HyExpressionPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class EvoLogicPackageImpl extends EPackageImpl implements EvoLogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoXOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoBiconditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAbstractSetTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetIntersectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetDifferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetSymmetricDifferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetCartesianProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoElementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetNotElementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAbstractQuantifierTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoForAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoExistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoVariableTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoApplicationConstraintTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSatisfiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSetTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoChildrenOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSiblingsOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoParentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAllMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAllConfigurationsEClass = null;

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
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvoLogicPackageImpl() {
		super(eNS_URI, EvoLogicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvoLogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvoLogicPackage init() {
		if (isInited) return (EvoLogicPackage)EPackage.Registry.INSTANCE.getEPackage(EvoLogicPackage.eNS_URI);

		// Obtain or create and register package
		EvoLogicPackageImpl theEvoLogicPackage = (EvoLogicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvoLogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvoLogicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HyConfigurationPackage.eINSTANCE.eClass();
		HyContextInformationPackage.eINSTANCE.eClass();
		HyDataValuesPackage.eINSTANCE.eClass();
		HyEvolutionPackage.eINSTANCE.eClass();
		EvoOperationPackage.eINSTANCE.eClass();
		EvoVariablePackage.eINSTANCE.eClass();
		HyExpressionPackage.eINSTANCE.eClass();
		HyFeaturePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvoLogicPackage.createPackageContents();

		// Initialize created meta-data
		theEvoLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvoLogicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvoLogicPackage.eNS_URI, theEvoLogicPackage);
		return theEvoLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoBinaryExpression() {
		return evoBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoXOr() {
		return evoXOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoNot() {
		return evoNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoBiconditional() {
		return evoBiconditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAbstractSetTerm() {
		return evoAbstractSetTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetInclusion() {
		return evoSetInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetIntersection() {
		return evoSetIntersectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetUnion() {
		return evoSetUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetDifference() {
		return evoSetDifferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetSymmetricDifference() {
		return evoSetSymmetricDifferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetCartesianProduct() {
		return evoSetCartesianProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetCardinality() {
		return evoSetCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoElementOf() {
		return evoElementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetNotElementOf() {
		return evoSetNotElementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAbstractQuantifierTerm() {
		return evoAbstractQuantifierTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAbstractQuantifierTerm_BoundedVariables() {
		return (EReference)evoAbstractQuantifierTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoForAll() {
		return evoForAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoExist() {
		return evoExistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoFormula() {
		return evoFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoFormula_Term() {
		return (EReference)evoFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoVariableTerm() {
		return evoVariableTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoVariableTerm_Variable() {
		return (EReference)evoVariableTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoVariableTerm_Type() {
		return (EAttribute)evoVariableTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoApplicationConstraintTerm() {
		return evoApplicationConstraintTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoApplicationConstraintTerm_Variable() {
		return (EReference)evoApplicationConstraintTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSize() {
		return evoSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoSize_Size() {
		return (EAttribute)evoSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoGroupType() {
		return evoGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoGroupType_Type() {
		return (EAttribute)evoGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoGroupType_Variables() {
		return (EReference)evoGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoFeatureType() {
		return evoFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoFeatureType_Type() {
		return (EAttribute)evoFeatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoFeatureType_Variables() {
		return (EReference)evoFeatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSatisfiable() {
		return evoSatisfiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoSatisfiable_Variables() {
		return (EReference)evoSatisfiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSetTerm() {
		return evoSetTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoSetTerm_Variables() {
		return (EReference)evoSetTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoChildrenOf() {
		return evoChildrenOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoChildrenOf_Variable() {
		return (EReference)evoChildrenOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSiblingsOf() {
		return evoSiblingsOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoSiblingsOf_Variable() {
		return (EReference)evoSiblingsOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoParentOf() {
		return evoParentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoParentOf_Variable() {
		return (EReference)evoParentOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAllMappings() {
		return evoAllMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAllConfigurations() {
		return evoAllConfigurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoLogicFactory getEvoLogicFactory() {
		return (EvoLogicFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evoBinaryExpressionEClass = createEClass(EVO_BINARY_EXPRESSION);

		evoXOrEClass = createEClass(EVO_XOR);

		evoNotEClass = createEClass(EVO_NOT);

		evoBiconditionalEClass = createEClass(EVO_BICONDITIONAL);

		evoAbstractSetTermEClass = createEClass(EVO_ABSTRACT_SET_TERM);

		evoSetInclusionEClass = createEClass(EVO_SET_INCLUSION);

		evoSetIntersectionEClass = createEClass(EVO_SET_INTERSECTION);

		evoSetUnionEClass = createEClass(EVO_SET_UNION);

		evoSetDifferenceEClass = createEClass(EVO_SET_DIFFERENCE);

		evoSetSymmetricDifferenceEClass = createEClass(EVO_SET_SYMMETRIC_DIFFERENCE);

		evoSetCartesianProductEClass = createEClass(EVO_SET_CARTESIAN_PRODUCT);

		evoSetCardinalityEClass = createEClass(EVO_SET_CARDINALITY);

		evoElementOfEClass = createEClass(EVO_ELEMENT_OF);

		evoSetNotElementOfEClass = createEClass(EVO_SET_NOT_ELEMENT_OF);

		evoAbstractQuantifierTermEClass = createEClass(EVO_ABSTRACT_QUANTIFIER_TERM);
		createEReference(evoAbstractQuantifierTermEClass, EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLES);

		evoForAllEClass = createEClass(EVO_FOR_ALL);

		evoExistEClass = createEClass(EVO_EXIST);

		evoFormulaEClass = createEClass(EVO_FORMULA);
		createEReference(evoFormulaEClass, EVO_FORMULA__TERM);

		evoVariableTermEClass = createEClass(EVO_VARIABLE_TERM);
		createEReference(evoVariableTermEClass, EVO_VARIABLE_TERM__VARIABLE);
		createEAttribute(evoVariableTermEClass, EVO_VARIABLE_TERM__TYPE);

		evoApplicationConstraintTermEClass = createEClass(EVO_APPLICATION_CONSTRAINT_TERM);
		createEReference(evoApplicationConstraintTermEClass, EVO_APPLICATION_CONSTRAINT_TERM__VARIABLE);

		evoSizeEClass = createEClass(EVO_SIZE);
		createEAttribute(evoSizeEClass, EVO_SIZE__SIZE);

		evoGroupTypeEClass = createEClass(EVO_GROUP_TYPE);
		createEAttribute(evoGroupTypeEClass, EVO_GROUP_TYPE__TYPE);
		createEReference(evoGroupTypeEClass, EVO_GROUP_TYPE__VARIABLES);

		evoFeatureTypeEClass = createEClass(EVO_FEATURE_TYPE);
		createEAttribute(evoFeatureTypeEClass, EVO_FEATURE_TYPE__TYPE);
		createEReference(evoFeatureTypeEClass, EVO_FEATURE_TYPE__VARIABLES);

		evoSatisfiableEClass = createEClass(EVO_SATISFIABLE);
		createEReference(evoSatisfiableEClass, EVO_SATISFIABLE__VARIABLES);

		evoSetTermEClass = createEClass(EVO_SET_TERM);
		createEReference(evoSetTermEClass, EVO_SET_TERM__VARIABLES);

		evoChildrenOfEClass = createEClass(EVO_CHILDREN_OF);
		createEReference(evoChildrenOfEClass, EVO_CHILDREN_OF__VARIABLE);

		evoSiblingsOfEClass = createEClass(EVO_SIBLINGS_OF);
		createEReference(evoSiblingsOfEClass, EVO_SIBLINGS_OF__VARIABLE);

		evoParentOfEClass = createEClass(EVO_PARENT_OF);
		createEReference(evoParentOfEClass, EVO_PARENT_OF__VARIABLE);

		evoAllMappingsEClass = createEClass(EVO_ALL_MAPPINGS);

		evoAllConfigurationsEClass = createEClass(EVO_ALL_CONFIGURATIONS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HyExpressionPackage theHyExpressionPackage = (HyExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(HyExpressionPackage.eNS_URI);
		EvoVariablePackage theEvoVariablePackage = (EvoVariablePackage)EPackage.Registry.INSTANCE.getEPackage(EvoVariablePackage.eNS_URI);
		HyFeaturePackage theHyFeaturePackage = (HyFeaturePackage)EPackage.Registry.INSTANCE.getEPackage(HyFeaturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evoBinaryExpressionEClass.getESuperTypes().add(theHyExpressionPackage.getHyBinaryExpression());
		evoXOrEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoNotEClass.getESuperTypes().add(theHyExpressionPackage.getHyUnaryExpression());
		evoBiconditionalEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoAbstractSetTermEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoSetInclusionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetInclusionEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetIntersectionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetIntersectionEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetUnionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetUnionEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetDifferenceEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetDifferenceEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetSymmetricDifferenceEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetSymmetricDifferenceEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetCartesianProductEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetCartesianProductEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetCardinalityEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetCardinalityEClass.getESuperTypes().add(theHyExpressionPackage.getHyUnaryExpression());
		evoElementOfEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoElementOfEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoSetNotElementOfEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetNotElementOfEClass.getESuperTypes().add(this.getEvoBinaryExpression());
		evoAbstractQuantifierTermEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoAbstractQuantifierTermEClass.getESuperTypes().add(theHyExpressionPackage.getHyUnaryExpression());
		evoForAllEClass.getESuperTypes().add(this.getEvoAbstractQuantifierTerm());
		evoExistEClass.getESuperTypes().add(this.getEvoAbstractQuantifierTerm());
		evoVariableTermEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoSizeEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoGroupTypeEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoFeatureTypeEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoSatisfiableEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoSetTermEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoChildrenOfEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoSiblingsOfEClass.getESuperTypes().add(this.getEvoSetTerm());
		evoParentOfEClass.getESuperTypes().add(this.getEvoSetTerm());
		evoAllMappingsEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());
		evoAllConfigurationsEClass.getESuperTypes().add(theHyExpressionPackage.getHyExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(evoBinaryExpressionEClass, EvoBinaryExpression.class, "EvoBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoXOrEClass, EvoXOr.class, "EvoXOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoNotEClass, EvoNot.class, "EvoNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoBiconditionalEClass, EvoBiconditional.class, "EvoBiconditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractSetTermEClass, EvoAbstractSetTerm.class, "EvoAbstractSetTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetInclusionEClass, EvoSetInclusion.class, "EvoSetInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetIntersectionEClass, EvoSetIntersection.class, "EvoSetIntersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetUnionEClass, EvoSetUnion.class, "EvoSetUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetDifferenceEClass, EvoSetDifference.class, "EvoSetDifference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetSymmetricDifferenceEClass, EvoSetSymmetricDifference.class, "EvoSetSymmetricDifference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetCartesianProductEClass, EvoSetCartesianProduct.class, "EvoSetCartesianProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetCardinalityEClass, EvoSetCardinality.class, "EvoSetCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoElementOfEClass, EvoElementOf.class, "EvoElementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetNotElementOfEClass, EvoSetNotElementOf.class, "EvoSetNotElementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractQuantifierTermEClass, EvoAbstractQuantifierTerm.class, "EvoAbstractQuantifierTerm", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAbstractQuantifierTerm_BoundedVariables(), this.getEvoVariableTerm(), null, "boundedVariables", null, 1, -1, EvoAbstractQuantifierTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoForAllEClass, EvoForAll.class, "EvoForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoExistEClass, EvoExist.class, "EvoExist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoFormulaEClass, EvoFormula.class, "EvoFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoFormula_Term(), theHyExpressionPackage.getHyExpression(), null, "term", null, 1, 1, EvoFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoVariableTermEClass, EvoVariableTerm.class, "EvoVariableTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoVariableTerm_Variable(), theEvoVariablePackage.getEvoVariable(), null, "variable", null, 1, 1, EvoVariableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvoVariableTerm_Type(), theEvoVariablePackage.getEvoVariableType(), "type", null, 0, 1, EvoVariableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoApplicationConstraintTermEClass, EvoApplicationConstraintTerm.class, "EvoApplicationConstraintTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoApplicationConstraintTerm_Variable(), theEvoVariablePackage.getEvoMappingVariable(), null, "variable", null, 0, 1, EvoApplicationConstraintTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSizeEClass, EvoSize.class, "EvoSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoSize_Size(), ecorePackage.getEInt(), "size", null, 1, 1, EvoSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoGroupTypeEClass, EvoGroupType.class, "EvoGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoGroupType_Type(), theHyFeaturePackage.getHyGroupTypeEnum(), "type", null, 0, 1, EvoGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoGroupType_Variables(), this.getEvoVariableTerm(), null, "variables", null, 1, -1, EvoGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoFeatureTypeEClass, EvoFeatureType.class, "EvoFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoFeatureType_Type(), theHyFeaturePackage.getHyFeatureTypeEnum(), "type", null, 0, 1, EvoFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoFeatureType_Variables(), this.getEvoVariableTerm(), null, "variables", null, 1, -1, EvoFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSatisfiableEClass, EvoSatisfiable.class, "EvoSatisfiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoSatisfiable_Variables(), theHyExpressionPackage.getHyExpression(), null, "variables", null, 1, -1, EvoSatisfiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSetTermEClass, EvoSetTerm.class, "EvoSetTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoSetTerm_Variables(), theHyExpressionPackage.getHyExpression(), null, "variables", null, 0, -1, EvoSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoChildrenOfEClass, EvoChildrenOf.class, "EvoChildrenOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoChildrenOf_Variable(), this.getEvoVariableTerm(), null, "variable", null, 1, 1, EvoChildrenOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSiblingsOfEClass, EvoSiblingsOf.class, "EvoSiblingsOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoSiblingsOf_Variable(), this.getEvoVariableTerm(), null, "variable", null, 1, 1, EvoSiblingsOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoParentOfEClass, EvoParentOf.class, "EvoParentOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoParentOf_Variable(), this.getEvoVariableTerm(), null, "variable", null, 1, 1, EvoParentOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoAllMappingsEClass, EvoAllMappings.class, "EvoAllMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAllConfigurationsEClass, EvoAllConfigurations.class, "EvoAllConfigurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "configuration", "../../eu.hyvar.feature.configuration/model/Configuration.ecore#/",
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "evooperation_0", "../../de.evorepair.evolution.operation/model/EvoOperation.ecore#/",
			 "evovariable_0", "../../de.evorepair.evolution.variable/model/EvoVariable.ecore#/",
			 "expression_0", "../../eu.hyvar.feature.expression/model/Expression.ecore#/",
			 "feature_0", "../../eu.hyvar.feature/model/Feature.ecore#/",
			 "mapping_0", "../../eu.hyvar.feature.mapping/model/Mapping.ecore#/"
		   });
	}

} //EvoLogicPackageImpl
