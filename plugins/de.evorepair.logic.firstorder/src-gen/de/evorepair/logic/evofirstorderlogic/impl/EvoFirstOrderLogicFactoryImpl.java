/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.*;

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
public class EvoFirstOrderLogicFactoryImpl extends EFactoryImpl implements EvoFirstOrderLogicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvoFirstOrderLogicFactory init()
	{
		try
		{
			EvoFirstOrderLogicFactory theEvoFirstOrderLogicFactory = (EvoFirstOrderLogicFactory)EPackage.Registry.INSTANCE.getEFactory(EvoFirstOrderLogicPackage.eNS_URI);
			if (theEvoFirstOrderLogicFactory != null)
			{
				return theEvoFirstOrderLogicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvoFirstOrderLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFirstOrderLogicFactoryImpl()
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
			case EvoFirstOrderLogicPackage.EVO_AND: return createEvoAnd();
			case EvoFirstOrderLogicPackage.EVO_OR: return createEvoOr();
			case EvoFirstOrderLogicPackage.EVO_XOR: return createEvoXOr();
			case EvoFirstOrderLogicPackage.EVO_NOT: return createEvoNot();
			case EvoFirstOrderLogicPackage.EVO_EQUAL: return createEvoEqual();
			case EvoFirstOrderLogicPackage.EVO_UNEQUAL: return createEvoUnequal();
			case EvoFirstOrderLogicPackage.EVO_IMPLICATION: return createEvoImplication();
			case EvoFirstOrderLogicPackage.EVO_BICONDITIONAL: return createEvoBiconditional();
			case EvoFirstOrderLogicPackage.EVO_SET_INCLUSION: return createEvoSetInclusion();
			case EvoFirstOrderLogicPackage.EVO_SET_INTERSECTION: return createEvoSetIntersection();
			case EvoFirstOrderLogicPackage.EVO_SET_UNION: return createEvoSetUnion();
			case EvoFirstOrderLogicPackage.EVO_SET_DIFFERENCE: return createEvoSetDifference();
			case EvoFirstOrderLogicPackage.EVO_SET_SYMMETRIC_DIFFERENCE: return createEvoSetSymmetricDifference();
			case EvoFirstOrderLogicPackage.EVO_SET_CARTESIAN_PRODUCT: return createEvoSetCartesianProduct();
			case EvoFirstOrderLogicPackage.EVO_SET_CARDINALITY: return createEvoSetCardinality();
			case EvoFirstOrderLogicPackage.EVO_SET_ELEMENT_OF: return createEvoSetElementOf();
			case EvoFirstOrderLogicPackage.EVO_SET_NOT_ELEMENT_OF: return createEvoSetNotElementOf();
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL: return createEvoForAll();
			case EvoFirstOrderLogicPackage.EVO_EXIST: return createEvoExist();
			case EvoFirstOrderLogicPackage.EVO_UNIQUE_EXISTS: return createEvoUniqueExists();
			case EvoFirstOrderLogicPackage.EVO_FORMULA: return createEvoFormula();
			case EvoFirstOrderLogicPackage.EVO_VARIABLE_TERM: return createEvoVariableTerm();
			case EvoFirstOrderLogicPackage.EVO_APPLICATION_CONSTRAINT_TERM: return createEvoApplicationConstraintTerm();
			case EvoFirstOrderLogicPackage.EVO_SIZE: return createEvoSize();
			case EvoFirstOrderLogicPackage.EVO_GROUP_TYPE: return createEvoGroupType();
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE: return createEvoFeatureType();
			case EvoFirstOrderLogicPackage.EVO_SATISFIABLE: return createEvoSatisfiable();
			case EvoFirstOrderLogicPackage.EVO_SET_TERM: return createEvoSetTerm();
			case EvoFirstOrderLogicPackage.EVO_CHILDREN_OF: return createEvoChildrenOf();
			case EvoFirstOrderLogicPackage.EVO_SIBLINGS_OF: return createEvoSiblingsOf();
			case EvoFirstOrderLogicPackage.EVO_PARENT_OF: return createEvoParentOf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAnd createEvoAnd()
	{
		EvoAndImpl evoAnd = new EvoAndImpl();
		return evoAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoOr createEvoOr()
	{
		EvoOrImpl evoOr = new EvoOrImpl();
		return evoOr;
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
	public EvoEqual createEvoEqual()
	{
		EvoEqualImpl evoEqual = new EvoEqualImpl();
		return evoEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoUnequal createEvoUnequal()
	{
		EvoUnequalImpl evoUnequal = new EvoUnequalImpl();
		return evoUnequal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoImplication createEvoImplication()
	{
		EvoImplicationImpl evoImplication = new EvoImplicationImpl();
		return evoImplication;
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
	public EvoSetElementOf createEvoSetElementOf()
	{
		EvoSetElementOfImpl evoSetElementOf = new EvoSetElementOfImpl();
		return evoSetElementOf;
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
	public EvoFirstOrderLogicPackage getEvoFirstOrderLogicPackage()
	{
		return (EvoFirstOrderLogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvoFirstOrderLogicPackage getPackage()
	{
		return EvoFirstOrderLogicPackage.eINSTANCE;
	}

} //EvoFirstOrderLogicFactoryImpl
