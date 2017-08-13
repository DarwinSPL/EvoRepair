/**
 */
package de.evorepair.logic.evologic.impl;

import de.evorepair.logic.evologic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoLogicFactoryImpl extends EFactoryImpl implements EvoLogicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvoLogicFactory init()
	{
		try
		{
			EvoLogicFactory theEvoLogicFactory = (EvoLogicFactory)EPackage.Registry.INSTANCE.getEFactory(EvoLogicPackage.eNS_URI);
			if (theEvoLogicFactory != null)
			{
				return theEvoLogicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvoLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoLogicFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EvoLogicPackage.EVO_BINARY_EXPRESSION: return createEvoBinaryExpression();
			case EvoLogicPackage.EVO_XOR: return createEvoXOr();
			case EvoLogicPackage.EVO_NOT: return createEvoNot();
			case EvoLogicPackage.EVO_BICONDITIONAL: return createEvoBiconditional();
			case EvoLogicPackage.EVO_SET_INCLUSION: return createEvoSetInclusion();
			case EvoLogicPackage.EVO_SET_INTERSECTION: return createEvoSetIntersection();
			case EvoLogicPackage.EVO_SET_UNION: return createEvoSetUnion();
			case EvoLogicPackage.EVO_SET_DIFFERENCE: return createEvoSetDifference();
			case EvoLogicPackage.EVO_SET_SYMMETRIC_DIFFERENCE: return createEvoSetSymmetricDifference();
			case EvoLogicPackage.EVO_SET_CARTESIAN_PRODUCT: return createEvoSetCartesianProduct();
			case EvoLogicPackage.EVO_SET_CARDINALITY: return createEvoSetCardinality();
			case EvoLogicPackage.EVO_ELEMENT_OF: return createEvoElementOf();
			case EvoLogicPackage.EVO_SET_NOT_ELEMENT_OF: return createEvoSetNotElementOf();
			case EvoLogicPackage.EVO_FOR_ALL: return createEvoForAll();
			case EvoLogicPackage.EVO_EXIST: return createEvoExist();
			case EvoLogicPackage.EVO_UNIQUE_EXISTS: return createEvoUniqueExists();
			case EvoLogicPackage.EVO_FORMULA: return createEvoFormula();
			case EvoLogicPackage.EVO_VARIABLE_TERM: return createEvoVariableTerm();
			case EvoLogicPackage.EVO_APPLICATION_CONSTRAINT_TERM: return createEvoApplicationConstraintTerm();
			case EvoLogicPackage.EVO_SIZE: return createEvoSize();
			case EvoLogicPackage.EVO_GROUP_TYPE: return createEvoGroupType();
			case EvoLogicPackage.EVO_FEATURE_TYPE: return createEvoFeatureType();
			case EvoLogicPackage.EVO_SATISFIABLE: return createEvoSatisfiable();
			case EvoLogicPackage.EVO_SET_TERM: return createEvoSetTerm();
			case EvoLogicPackage.EVO_CHILDREN_OF: return createEvoChildrenOf();
			case EvoLogicPackage.EVO_SIBLINGS_OF: return createEvoSiblingsOf();
			case EvoLogicPackage.EVO_PARENT_OF: return createEvoParentOf();
			case EvoLogicPackage.EVO_ALL_MAPPINGS: return createEvoAllMappings();
			case EvoLogicPackage.EVO_ALL_CONFIGURATIONS: return createEvoAllConfigurations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoBinaryExpression createEvoBinaryExpression()
	{
		EvoBinaryExpressionImpl evoBinaryExpression = new EvoBinaryExpressionImpl();
		return evoBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoXOr createEvoXOr()
	{
		EvoXOrImpl evoXOr = new EvoXOrImpl();
		return evoXOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoNot createEvoNot()
	{
		EvoNotImpl evoNot = new EvoNotImpl();
		return evoNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoBiconditional createEvoBiconditional()
	{
		EvoBiconditionalImpl evoBiconditional = new EvoBiconditionalImpl();
		return evoBiconditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetInclusion createEvoSetInclusion()
	{
		EvoSetInclusionImpl evoSetInclusion = new EvoSetInclusionImpl();
		return evoSetInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetIntersection createEvoSetIntersection()
	{
		EvoSetIntersectionImpl evoSetIntersection = new EvoSetIntersectionImpl();
		return evoSetIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetUnion createEvoSetUnion()
	{
		EvoSetUnionImpl evoSetUnion = new EvoSetUnionImpl();
		return evoSetUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetDifference createEvoSetDifference()
	{
		EvoSetDifferenceImpl evoSetDifference = new EvoSetDifferenceImpl();
		return evoSetDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetSymmetricDifference createEvoSetSymmetricDifference()
	{
		EvoSetSymmetricDifferenceImpl evoSetSymmetricDifference = new EvoSetSymmetricDifferenceImpl();
		return evoSetSymmetricDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetCartesianProduct createEvoSetCartesianProduct()
	{
		EvoSetCartesianProductImpl evoSetCartesianProduct = new EvoSetCartesianProductImpl();
		return evoSetCartesianProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetCardinality createEvoSetCardinality()
	{
		EvoSetCardinalityImpl evoSetCardinality = new EvoSetCardinalityImpl();
		return evoSetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoElementOf createEvoElementOf()
	{
		EvoElementOfImpl evoElementOf = new EvoElementOfImpl();
		return evoElementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetNotElementOf createEvoSetNotElementOf()
	{
		EvoSetNotElementOfImpl evoSetNotElementOf = new EvoSetNotElementOfImpl();
		return evoSetNotElementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoForAll createEvoForAll()
	{
		EvoForAllImpl evoForAll = new EvoForAllImpl();
		return evoForAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoExist createEvoExist()
	{
		EvoExistImpl evoExist = new EvoExistImpl();
		return evoExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoUniqueExists createEvoUniqueExists()
	{
		EvoUniqueExistsImpl evoUniqueExists = new EvoUniqueExistsImpl();
		return evoUniqueExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormula createEvoFormula()
	{
		EvoFormulaImpl evoFormula = new EvoFormulaImpl();
		return evoFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoVariableTerm createEvoVariableTerm()
	{
		EvoVariableTermImpl evoVariableTerm = new EvoVariableTermImpl();
		return evoVariableTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoApplicationConstraintTerm createEvoApplicationConstraintTerm()
	{
		EvoApplicationConstraintTermImpl evoApplicationConstraintTerm = new EvoApplicationConstraintTermImpl();
		return evoApplicationConstraintTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSize createEvoSize()
	{
		EvoSizeImpl evoSize = new EvoSizeImpl();
		return evoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoGroupType createEvoGroupType()
	{
		EvoGroupTypeImpl evoGroupType = new EvoGroupTypeImpl();
		return evoGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFeatureType createEvoFeatureType()
	{
		EvoFeatureTypeImpl evoFeatureType = new EvoFeatureTypeImpl();
		return evoFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSatisfiable createEvoSatisfiable()
	{
		EvoSatisfiableImpl evoSatisfiable = new EvoSatisfiableImpl();
		return evoSatisfiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetTerm createEvoSetTerm()
	{
		EvoSetTermImpl evoSetTerm = new EvoSetTermImpl();
		return evoSetTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoChildrenOf createEvoChildrenOf()
	{
		EvoChildrenOfImpl evoChildrenOf = new EvoChildrenOfImpl();
		return evoChildrenOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSiblingsOf createEvoSiblingsOf()
	{
		EvoSiblingsOfImpl evoSiblingsOf = new EvoSiblingsOfImpl();
		return evoSiblingsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoParentOf createEvoParentOf()
	{
		EvoParentOfImpl evoParentOf = new EvoParentOfImpl();
		return evoParentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAllMappings createEvoAllMappings()
	{
		EvoAllMappingsImpl evoAllMappings = new EvoAllMappingsImpl();
		return evoAllMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAllConfigurations createEvoAllConfigurations()
	{
		EvoAllConfigurationsImpl evoAllConfigurations = new EvoAllConfigurationsImpl();
		return evoAllConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoLogicPackage getEvoLogicPackage()
	{
		return (EvoLogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvoLogicPackage getPackage()
	{
		return EvoLogicPackage.eINSTANCE;
	}

} //EvoLogicFactoryImpl
