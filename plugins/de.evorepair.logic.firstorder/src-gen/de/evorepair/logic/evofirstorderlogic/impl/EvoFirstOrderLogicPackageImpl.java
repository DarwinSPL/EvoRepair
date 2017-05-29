/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evooperation.EvoOperationPackage;

import de.evorepair.evolution.evovariable.EvoVariablePackage;

import de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAllFeaturesVariable;
import de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoAnd;
import de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable;
import de.evorepair.logic.evofirstorderlogic.EvoBiconditional;
import de.evorepair.logic.evofirstorderlogic.EvoEmpty;
import de.evorepair.logic.evofirstorderlogic.EvoEqual;
import de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm;
import de.evorepair.logic.evofirstorderlogic.EvoExist;
import de.evorepair.logic.evofirstorderlogic.EvoFeatureModelConstraintVariable;
import de.evorepair.logic.evofirstorderlogic.EvoFeatureType;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicFactory;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoForAll;
import de.evorepair.logic.evofirstorderlogic.EvoFormula;
import de.evorepair.logic.evofirstorderlogic.EvoFormulaSetVariable;
import de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable;
import de.evorepair.logic.evofirstorderlogic.EvoGroupType;
import de.evorepair.logic.evofirstorderlogic.EvoImplication;
import de.evorepair.logic.evofirstorderlogic.EvoInvolvedFeatureVariable;
import de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoMappingVariable;
import de.evorepair.logic.evofirstorderlogic.EvoNot;
import de.evorepair.logic.evofirstorderlogic.EvoOr;
import de.evorepair.logic.evofirstorderlogic.EvoPredefinedVariable;
import de.evorepair.logic.evofirstorderlogic.EvoRequirementVariable;
import de.evorepair.logic.evofirstorderlogic.EvoSatisfiable;
import de.evorepair.logic.evofirstorderlogic.EvoSetCardinality;
import de.evorepair.logic.evofirstorderlogic.EvoSetCartesianProduct;
import de.evorepair.logic.evofirstorderlogic.EvoSetDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetElementOf;
import de.evorepair.logic.evofirstorderlogic.EvoSetInclusion;
import de.evorepair.logic.evofirstorderlogic.EvoSetIntersection;
import de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf;
import de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetUnion;
import de.evorepair.logic.evofirstorderlogic.EvoSiblings;
import de.evorepair.logic.evofirstorderlogic.EvoUnequal;
import de.evorepair.logic.evofirstorderlogic.EvoUniqueExists;
import de.evorepair.logic.evofirstorderlogic.EvoVariableTerm;
import de.evorepair.logic.evofirstorderlogic.EvoXOr;

import eu.hyvar.feature.HyFeaturePackage;

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
public class EvoFirstOrderLogicPackageImpl extends EPackageImpl implements EvoFirstOrderLogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAbstractTwoParameterTermEClass = null;

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
	private EClass evoAbstractOneParameterTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAbstractTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoUnequalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoImplicationEClass = null;

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
	private EClass evoFormulaVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoFormulaSetVariableEClass = null;

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
	private EClass evoSetElementOfEClass = null;

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
	private EClass evoUniqueExistsEClass = null;

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
	private EClass evoApplicationConstraintVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoFeatureModelConstraintVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoPredefinedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAllFeaturesVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAllValidConfigurationsVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoAllMappingsVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoMappingAssociatedAssetsVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoMappingVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoInvolvedFeatureVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoRequirementVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoEmptyEClass = null;

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
	private EClass evoEvolutionTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSiblingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evoSatisfiableEClass = null;

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
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvoFirstOrderLogicPackageImpl() {
		super(eNS_URI, EvoFirstOrderLogicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvoFirstOrderLogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvoFirstOrderLogicPackage init() {
		if (isInited) return (EvoFirstOrderLogicPackage)EPackage.Registry.INSTANCE.getEPackage(EvoFirstOrderLogicPackage.eNS_URI);

		// Obtain or create and register package
		EvoFirstOrderLogicPackageImpl theEvoFirstOrderLogicPackage = (EvoFirstOrderLogicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvoFirstOrderLogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvoFirstOrderLogicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EvoOperationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvoFirstOrderLogicPackage.createPackageContents();

		// Initialize created meta-data
		theEvoFirstOrderLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvoFirstOrderLogicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvoFirstOrderLogicPackage.eNS_URI, theEvoFirstOrderLogicPackage);
		return theEvoFirstOrderLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAnd() {
		return evoAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoOr() {
		return evoOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAbstractTwoParameterTerm() {
		return evoAbstractTwoParameterTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAbstractTwoParameterTerm_LeftElement() {
		return (EReference)evoAbstractTwoParameterTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAbstractTwoParameterTerm_RightElement() {
		return (EReference)evoAbstractTwoParameterTermEClass.getEStructuralFeatures().get(1);
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
	public EClass getEvoAbstractOneParameterTerm() {
		return evoAbstractOneParameterTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAbstractOneParameterTerm_Element() {
		return (EReference)evoAbstractOneParameterTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAbstractTerm() {
		return evoAbstractTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoEqual() {
		return evoEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoUnequal() {
		return evoUnequalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoImplication() {
		return evoImplicationEClass;
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
	public EClass getEvoFormulaVariable() {
		return evoFormulaVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoFormulaSetVariable() {
		return evoFormulaSetVariableEClass;
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
	public EClass getEvoSetElementOf() {
		return evoSetElementOfEClass;
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
	public EReference getEvoAbstractQuantifierTerm_BoundedVariable() {
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
	public EClass getEvoUniqueExists() {
		return evoUniqueExistsEClass;
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
	public EReference getEvoFormula_Variables() {
		return (EReference)evoFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoFormula_TestTrigger() {
		return (EReference)evoFormulaEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEvoVariableTerm_Id() {
		return (EAttribute)evoVariableTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoApplicationConstraintVariable() {
		return evoApplicationConstraintVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoApplicationConstraintVariable_Mapping() {
		return (EReference)evoApplicationConstraintVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoFeatureModelConstraintVariable() {
		return evoFeatureModelConstraintVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoPredefinedVariable() {
		return evoPredefinedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAllFeaturesVariable() {
		return evoAllFeaturesVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAllValidConfigurationsVariable() {
		return evoAllValidConfigurationsVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAllValidConfigurationsVariable_FeatureVariable() {
		return (EReference)evoAllValidConfigurationsVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoAllMappingsVariable() {
		return evoAllMappingsVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoAllMappingsVariable_AssociatedMappings() {
		return (EReference)evoAllMappingsVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoMappingAssociatedAssetsVariable() {
		return evoMappingAssociatedAssetsVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoMappingAssociatedAssetsVariable_AssociatedMapping() {
		return (EReference)evoMappingAssociatedAssetsVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoMappingVariable() {
		return evoMappingVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoMappingVariable_Mapping() {
		return (EAttribute)evoMappingVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvoMappingVariable_ContainingFeature() {
		return (EReference)evoMappingVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoInvolvedFeatureVariable() {
		return evoInvolvedFeatureVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoRequirementVariable() {
		return evoRequirementVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoEmpty() {
		return evoEmptyEClass;
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
	public EClass getEvoEvolutionTerm() {
		return evoEvolutionTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoEvolutionTerm_AfterEvolution() {
		return (EAttribute)evoEvolutionTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvoSiblings() {
		return evoSiblingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvoSiblings_Type() {
		return (EAttribute)evoSiblingsEClass.getEStructuralFeatures().get(0);
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
	public EvoFirstOrderLogicFactory getEvoFirstOrderLogicFactory() {
		return (EvoFirstOrderLogicFactory)getEFactoryInstance();
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
		evoAndEClass = createEClass(EVO_AND);

		evoOrEClass = createEClass(EVO_OR);

		evoAbstractTwoParameterTermEClass = createEClass(EVO_ABSTRACT_TWO_PARAMETER_TERM);
		createEReference(evoAbstractTwoParameterTermEClass, EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT);
		createEReference(evoAbstractTwoParameterTermEClass, EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT);

		evoXOrEClass = createEClass(EVO_XOR);

		evoNotEClass = createEClass(EVO_NOT);

		evoAbstractOneParameterTermEClass = createEClass(EVO_ABSTRACT_ONE_PARAMETER_TERM);
		createEReference(evoAbstractOneParameterTermEClass, EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT);

		evoAbstractTermEClass = createEClass(EVO_ABSTRACT_TERM);

		evoEqualEClass = createEClass(EVO_EQUAL);

		evoUnequalEClass = createEClass(EVO_UNEQUAL);

		evoImplicationEClass = createEClass(EVO_IMPLICATION);

		evoBiconditionalEClass = createEClass(EVO_BICONDITIONAL);

		evoFormulaVariableEClass = createEClass(EVO_FORMULA_VARIABLE);

		evoFormulaSetVariableEClass = createEClass(EVO_FORMULA_SET_VARIABLE);

		evoAbstractSetTermEClass = createEClass(EVO_ABSTRACT_SET_TERM);

		evoSetInclusionEClass = createEClass(EVO_SET_INCLUSION);

		evoSetIntersectionEClass = createEClass(EVO_SET_INTERSECTION);

		evoSetUnionEClass = createEClass(EVO_SET_UNION);

		evoSetDifferenceEClass = createEClass(EVO_SET_DIFFERENCE);

		evoSetSymmetricDifferenceEClass = createEClass(EVO_SET_SYMMETRIC_DIFFERENCE);

		evoSetCartesianProductEClass = createEClass(EVO_SET_CARTESIAN_PRODUCT);

		evoSetCardinalityEClass = createEClass(EVO_SET_CARDINALITY);

		evoSetElementOfEClass = createEClass(EVO_SET_ELEMENT_OF);

		evoSetNotElementOfEClass = createEClass(EVO_SET_NOT_ELEMENT_OF);

		evoAbstractQuantifierTermEClass = createEClass(EVO_ABSTRACT_QUANTIFIER_TERM);
		createEReference(evoAbstractQuantifierTermEClass, EVO_ABSTRACT_QUANTIFIER_TERM__BOUNDED_VARIABLE);

		evoForAllEClass = createEClass(EVO_FOR_ALL);

		evoExistEClass = createEClass(EVO_EXIST);

		evoUniqueExistsEClass = createEClass(EVO_UNIQUE_EXISTS);

		evoFormulaEClass = createEClass(EVO_FORMULA);
		createEReference(evoFormulaEClass, EVO_FORMULA__TERM);
		createEReference(evoFormulaEClass, EVO_FORMULA__VARIABLES);
		createEReference(evoFormulaEClass, EVO_FORMULA__TEST_TRIGGER);

		evoVariableTermEClass = createEClass(EVO_VARIABLE_TERM);
		createEReference(evoVariableTermEClass, EVO_VARIABLE_TERM__VARIABLE);
		createEAttribute(evoVariableTermEClass, EVO_VARIABLE_TERM__ID);

		evoApplicationConstraintVariableEClass = createEClass(EVO_APPLICATION_CONSTRAINT_VARIABLE);
		createEReference(evoApplicationConstraintVariableEClass, EVO_APPLICATION_CONSTRAINT_VARIABLE__MAPPING);

		evoFeatureModelConstraintVariableEClass = createEClass(EVO_FEATURE_MODEL_CONSTRAINT_VARIABLE);

		evoPredefinedVariableEClass = createEClass(EVO_PREDEFINED_VARIABLE);

		evoAllFeaturesVariableEClass = createEClass(EVO_ALL_FEATURES_VARIABLE);

		evoAllValidConfigurationsVariableEClass = createEClass(EVO_ALL_VALID_CONFIGURATIONS_VARIABLE);
		createEReference(evoAllValidConfigurationsVariableEClass, EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE);

		evoAllMappingsVariableEClass = createEClass(EVO_ALL_MAPPINGS_VARIABLE);
		createEReference(evoAllMappingsVariableEClass, EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS);

		evoMappingAssociatedAssetsVariableEClass = createEClass(EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE);
		createEReference(evoMappingAssociatedAssetsVariableEClass, EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING);

		evoMappingVariableEClass = createEClass(EVO_MAPPING_VARIABLE);
		createEAttribute(evoMappingVariableEClass, EVO_MAPPING_VARIABLE__MAPPING);
		createEReference(evoMappingVariableEClass, EVO_MAPPING_VARIABLE__CONTAINING_FEATURE);

		evoInvolvedFeatureVariableEClass = createEClass(EVO_INVOLVED_FEATURE_VARIABLE);

		evoRequirementVariableEClass = createEClass(EVO_REQUIREMENT_VARIABLE);

		evoEmptyEClass = createEClass(EVO_EMPTY);

		evoGroupTypeEClass = createEClass(EVO_GROUP_TYPE);
		createEAttribute(evoGroupTypeEClass, EVO_GROUP_TYPE__TYPE);

		evoFeatureTypeEClass = createEClass(EVO_FEATURE_TYPE);
		createEAttribute(evoFeatureTypeEClass, EVO_FEATURE_TYPE__TYPE);

		evoEvolutionTermEClass = createEClass(EVO_EVOLUTION_TERM);
		createEAttribute(evoEvolutionTermEClass, EVO_EVOLUTION_TERM__AFTER_EVOLUTION);

		evoSiblingsEClass = createEClass(EVO_SIBLINGS);
		createEAttribute(evoSiblingsEClass, EVO_SIBLINGS__TYPE);

		evoSatisfiableEClass = createEClass(EVO_SATISFIABLE);
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
		EvoVariablePackage theEvoVariablePackage = (EvoVariablePackage)EPackage.Registry.INSTANCE.getEPackage(EvoVariablePackage.eNS_URI);
		EvoOperationPackage theEvoOperationPackage = (EvoOperationPackage)EPackage.Registry.INSTANCE.getEPackage(EvoOperationPackage.eNS_URI);
		HyFeaturePackage theHyFeaturePackage = (HyFeaturePackage)EPackage.Registry.INSTANCE.getEPackage(HyFeaturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evoAndEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoOrEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoAbstractTwoParameterTermEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoXOrEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoNotEClass.getESuperTypes().add(this.getEvoAbstractOneParameterTerm());
		evoAbstractOneParameterTermEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoEqualEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoUnequalEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoImplicationEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoBiconditionalEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoFormulaVariableEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoFormulaVariableEClass.getESuperTypes().add(theEvoVariablePackage.getEvoVariable());
		evoFormulaSetVariableEClass.getESuperTypes().add(theEvoVariablePackage.getEvoSetVariable());
		evoAbstractSetTermEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoSetInclusionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetInclusionEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetIntersectionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetIntersectionEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetUnionEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetUnionEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetDifferenceEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetDifferenceEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetSymmetricDifferenceEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetSymmetricDifferenceEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetCartesianProductEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetCartesianProductEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetCardinalityEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetCardinalityEClass.getESuperTypes().add(this.getEvoAbstractOneParameterTerm());
		evoSetElementOfEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetElementOfEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoSetNotElementOfEClass.getESuperTypes().add(this.getEvoAbstractSetTerm());
		evoSetNotElementOfEClass.getESuperTypes().add(this.getEvoAbstractTwoParameterTerm());
		evoAbstractQuantifierTermEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoAbstractQuantifierTermEClass.getESuperTypes().add(this.getEvoAbstractOneParameterTerm());
		evoForAllEClass.getESuperTypes().add(this.getEvoAbstractQuantifierTerm());
		evoExistEClass.getESuperTypes().add(this.getEvoAbstractQuantifierTerm());
		evoUniqueExistsEClass.getESuperTypes().add(this.getEvoAbstractQuantifierTerm());
		evoVariableTermEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoApplicationConstraintVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoFeatureModelConstraintVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoPredefinedVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoAllFeaturesVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoMappingAssociatedAssetsVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoMappingVariableEClass.getESuperTypes().add(this.getEvoPredefinedVariable());
		evoInvolvedFeatureVariableEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoRequirementVariableEClass.getESuperTypes().add(this.getEvoPredefinedVariable());
		evoEmptyEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoGroupTypeEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoGroupTypeEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoFeatureTypeEClass.getESuperTypes().add(this.getEvoEvolutionTerm());
		evoFeatureTypeEClass.getESuperTypes().add(this.getEvoAbstractTerm());
		evoEvolutionTermEClass.getESuperTypes().add(theEvoVariablePackage.getEvoVariable());
		evoSiblingsEClass.getESuperTypes().add(this.getEvoPredefinedVariable());
		evoSatisfiableEClass.getESuperTypes().add(this.getEvoAbstractOneParameterTerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(evoAndEClass, EvoAnd.class, "EvoAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoOrEClass, EvoOr.class, "EvoOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractTwoParameterTermEClass, EvoAbstractTwoParameterTerm.class, "EvoAbstractTwoParameterTerm", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAbstractTwoParameterTerm_LeftElement(), this.getEvoAbstractTerm(), null, "leftElement", null, 1, 1, EvoAbstractTwoParameterTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoAbstractTwoParameterTerm_RightElement(), this.getEvoAbstractTerm(), null, "rightElement", null, 1, 1, EvoAbstractTwoParameterTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoXOrEClass, EvoXOr.class, "EvoXOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoNotEClass, EvoNot.class, "EvoNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractOneParameterTermEClass, EvoAbstractOneParameterTerm.class, "EvoAbstractOneParameterTerm", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAbstractOneParameterTerm_Element(), this.getEvoAbstractTerm(), null, "element", null, 1, 1, EvoAbstractOneParameterTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoAbstractTermEClass, EvoAbstractTerm.class, "EvoAbstractTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoEqualEClass, EvoEqual.class, "EvoEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoUnequalEClass, EvoUnequal.class, "EvoUnequal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoImplicationEClass, EvoImplication.class, "EvoImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoBiconditionalEClass, EvoBiconditional.class, "EvoBiconditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoFormulaVariableEClass, EvoFormulaVariable.class, "EvoFormulaVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoFormulaSetVariableEClass, EvoFormulaSetVariable.class, "EvoFormulaSetVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractSetTermEClass, EvoAbstractSetTerm.class, "EvoAbstractSetTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetInclusionEClass, EvoSetInclusion.class, "EvoSetInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetIntersectionEClass, EvoSetIntersection.class, "EvoSetIntersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetUnionEClass, EvoSetUnion.class, "EvoSetUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetDifferenceEClass, EvoSetDifference.class, "EvoSetDifference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetSymmetricDifferenceEClass, EvoSetSymmetricDifference.class, "EvoSetSymmetricDifference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetCartesianProductEClass, EvoSetCartesianProduct.class, "EvoSetCartesianProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetCardinalityEClass, EvoSetCardinality.class, "EvoSetCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetElementOfEClass, EvoSetElementOf.class, "EvoSetElementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoSetNotElementOfEClass, EvoSetNotElementOf.class, "EvoSetNotElementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAbstractQuantifierTermEClass, EvoAbstractQuantifierTerm.class, "EvoAbstractQuantifierTerm", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAbstractQuantifierTerm_BoundedVariable(), this.getEvoEvolutionTerm(), null, "boundedVariable", null, 1, 1, EvoAbstractQuantifierTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoForAllEClass, EvoForAll.class, "EvoForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoExistEClass, EvoExist.class, "EvoExist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoUniqueExistsEClass, EvoUniqueExists.class, "EvoUniqueExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoFormulaEClass, EvoFormula.class, "EvoFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoFormula_Term(), this.getEvoAbstractTerm(), null, "term", null, 1, 1, EvoFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoFormula_Variables(), this.getEvoEvolutionTerm(), null, "variables", null, 0, -1, EvoFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoFormula_TestTrigger(), theEvoOperationPackage.getEvoOperation(), null, "testTrigger", null, 0, 1, EvoFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoVariableTermEClass, EvoVariableTerm.class, "EvoVariableTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoVariableTerm_Variable(), theEvoVariablePackage.getEvoVariable(), null, "variable", null, 1, 1, EvoVariableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvoVariableTerm_Id(), ecorePackage.getEString(), "id", null, 0, 1, EvoVariableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoApplicationConstraintVariableEClass, EvoApplicationConstraintVariable.class, "EvoApplicationConstraintVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoApplicationConstraintVariable_Mapping(), this.getEvoMappingVariable(), null, "mapping", null, 0, 1, EvoApplicationConstraintVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoFeatureModelConstraintVariableEClass, EvoFeatureModelConstraintVariable.class, "EvoFeatureModelConstraintVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoPredefinedVariableEClass, EvoPredefinedVariable.class, "EvoPredefinedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAllFeaturesVariableEClass, EvoAllFeaturesVariable.class, "EvoAllFeaturesVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoAllValidConfigurationsVariableEClass, EvoAllValidConfigurationsVariable.class, "EvoAllValidConfigurationsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAllValidConfigurationsVariable_FeatureVariable(), this.getEvoFormulaVariable(), null, "featureVariable", null, 0, 1, EvoAllValidConfigurationsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoAllMappingsVariableEClass, EvoAllMappingsVariable.class, "EvoAllMappingsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoAllMappingsVariable_AssociatedMappings(), this.getEvoMappingVariable(), null, "associatedMappings", null, 0, -1, EvoAllMappingsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoMappingAssociatedAssetsVariableEClass, EvoMappingAssociatedAssetsVariable.class, "EvoMappingAssociatedAssetsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvoMappingAssociatedAssetsVariable_AssociatedMapping(), this.getEvoMappingVariable(), null, "associatedMapping", null, 0, 1, EvoMappingAssociatedAssetsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoMappingVariableEClass, EvoMappingVariable.class, "EvoMappingVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoMappingVariable_Mapping(), ecorePackage.getEString(), "mapping", null, 1, 1, EvoMappingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvoMappingVariable_ContainingFeature(), this.getEvoFormulaVariable(), null, "containingFeature", null, 0, 1, EvoMappingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoInvolvedFeatureVariableEClass, EvoInvolvedFeatureVariable.class, "EvoInvolvedFeatureVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoRequirementVariableEClass, EvoRequirementVariable.class, "EvoRequirementVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoEmptyEClass, EvoEmpty.class, "EvoEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evoGroupTypeEClass, EvoGroupType.class, "EvoGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoGroupType_Type(), theHyFeaturePackage.getHyGroupTypeEnum(), "type", null, 0, 1, EvoGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoFeatureTypeEClass, EvoFeatureType.class, "EvoFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoFeatureType_Type(), theHyFeaturePackage.getHyFeatureTypeEnum(), "type", null, 0, 1, EvoFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoEvolutionTermEClass, EvoEvolutionTerm.class, "EvoEvolutionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoEvolutionTerm_AfterEvolution(), ecorePackage.getEBoolean(), "afterEvolution", null, 0, 1, EvoEvolutionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSiblingsEClass, EvoSiblings.class, "EvoSiblings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvoSiblings_Type(), theHyFeaturePackage.getHyFeatureTypeEnum(), "type", null, 0, 1, EvoSiblings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evoSatisfiableEClass, EvoSatisfiable.class, "EvoSatisfiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "feature_0", "../../eu.hyvar.feature/model/Feature.ecore#/",
			 "mapping_0", "../../eu.hyvar.feature.mapping/model/Mapping.ecore#/"
		   });
	}

} //EvoFirstOrderLogicPackageImpl
