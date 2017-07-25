/**
 */
package de.evorepair.feature.mapping.repair.evomappingrepair.impl;

import de.evorepair.feature.mapping.repair.evomappingrepair.*;

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
public class EvoMappingRepairFactoryImpl extends EFactoryImpl implements EvoMappingRepairFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvoMappingRepairFactory init()
	{
		try
		{
			EvoMappingRepairFactory theEvoMappingRepairFactory = (EvoMappingRepairFactory)EPackage.Registry.INSTANCE.getEFactory(EvoMappingRepairPackage.eNS_URI);
			if (theEvoMappingRepairFactory != null)
			{
				return theEvoMappingRepairFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvoMappingRepairFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingRepairFactoryImpl()
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
			case EvoMappingRepairPackage.EVO_MAPPING_REPAIR_EXPRESSION: return createEvoMappingRepairExpression();
			case EvoMappingRepairPackage.EVO_MAPPING_KEEP: return createEvoMappingKeep();
			case EvoMappingRepairPackage.EVO_MAPPING_REPLACE: return createEvoMappingReplace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingRepairExpression createEvoMappingRepairExpression()
	{
		EvoMappingRepairExpressionImpl evoMappingRepairExpression = new EvoMappingRepairExpressionImpl();
		return evoMappingRepairExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingKeep createEvoMappingKeep()
	{
		EvoMappingKeepImpl evoMappingKeep = new EvoMappingKeepImpl();
		return evoMappingKeep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingReplace createEvoMappingReplace()
	{
		EvoMappingReplaceImpl evoMappingReplace = new EvoMappingReplaceImpl();
		return evoMappingReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingRepairPackage getEvoMappingRepairPackage()
	{
		return (EvoMappingRepairPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvoMappingRepairPackage getPackage()
	{
		return EvoMappingRepairPackage.eINSTANCE;
	}

} //EvoMappingRepairFactoryImpl
