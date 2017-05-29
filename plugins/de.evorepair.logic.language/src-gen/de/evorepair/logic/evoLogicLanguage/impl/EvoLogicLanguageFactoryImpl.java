/**
 * generated by Xtext 2.11.0
 */
package de.evorepair.logic.evoLogicLanguage.impl;

import de.evorepair.logic.evoLogicLanguage.*;

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
public class EvoLogicLanguageFactoryImpl extends EFactoryImpl implements EvoLogicLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EvoLogicLanguageFactory init()
  {
    try
    {
      EvoLogicLanguageFactory theEvoLogicLanguageFactory = (EvoLogicLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(EvoLogicLanguagePackage.eNS_URI);
      if (theEvoLogicLanguageFactory != null)
      {
        return theEvoLogicLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EvoLogicLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoLogicLanguageFactoryImpl()
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
      case EvoLogicLanguagePackage.COMMAND_DOCUMENT: return createCommandDocument();
      case EvoLogicLanguagePackage.IMPORT: return createImport();
      case EvoLogicLanguagePackage.EVO_FORMULA: return createEvoFormula();
      case EvoLogicLanguagePackage.EVO_VARIABLE: return createEvoVariable();
      case EvoLogicLanguagePackage.EVO_VARIABLE_TERM: return createEvoVariableTerm();
      case EvoLogicLanguagePackage.EVO_ARBITRATY_FEATURE_VARIABLE: return createEvoArbitratyFeatureVariable();
      case EvoLogicLanguagePackage.EVO_ABSTRACT_TERM: return createEvoAbstractTerm();
      case EvoLogicLanguagePackage.EVO_OR: return createEvoOr();
      case EvoLogicLanguagePackage.EVO_XOR: return createEvoXOr();
      case EvoLogicLanguagePackage.EVO_AND: return createEvoAnd();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandDocument createCommandDocument()
  {
    CommandDocumentImpl commandDocument = new CommandDocumentImpl();
    return commandDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public EvoVariable createEvoVariable()
  {
    EvoVariableImpl evoVariable = new EvoVariableImpl();
    return evoVariable;
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
  public EvoArbitratyFeatureVariable createEvoArbitratyFeatureVariable()
  {
    EvoArbitratyFeatureVariableImpl evoArbitratyFeatureVariable = new EvoArbitratyFeatureVariableImpl();
    return evoArbitratyFeatureVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvoAbstractTerm createEvoAbstractTerm()
  {
    EvoAbstractTermImpl evoAbstractTerm = new EvoAbstractTermImpl();
    return evoAbstractTerm;
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
  public EvoLogicLanguagePackage getEvoLogicLanguagePackage()
  {
    return (EvoLogicLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EvoLogicLanguagePackage getPackage()
  {
    return EvoLogicLanguagePackage.eINSTANCE;
  }

} //EvoLogicLanguageFactoryImpl
