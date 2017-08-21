/**
 * generated by Xtext 2.12.0
 */
package de.evorepair.evolution.variable.evoVariableDsl.impl;

import de.evorepair.evolution.variable.evoVariableDsl.*;

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
public class EvoVariableDslFactoryImpl extends EFactoryImpl implements EvoVariableDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EvoVariableDslFactory init()
  {
    try
    {
      EvoVariableDslFactory theEvoVariableDslFactory = (EvoVariableDslFactory)EPackage.Registry.INSTANCE.getEFactory(EvoVariableDslPackage.eNS_URI);
      if (theEvoVariableDslFactory != null)
      {
        return theEvoVariableDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EvoVariableDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoVariableDslFactoryImpl()
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
      case EvoVariableDslPackage.EVO_VARIABLE_MODEL: return createEvoVariableModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoVariableModel createEvoVariableModel()
  {
    EvoVariableModelImpl evoVariableModel = new EvoVariableModelImpl();
    return evoVariableModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoVariableDslPackage getEvoVariableDslPackage()
  {
    return (EvoVariableDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EvoVariableDslPackage getPackage()
  {
    return EvoVariableDslPackage.eINSTANCE;
  }

} //EvoVariableDslFactoryImpl
