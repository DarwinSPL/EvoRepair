/**
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.impl;

import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairDslPackage;
import de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.MappingRepairGrammarEntry;

import eu.hyvar.feature.expression.HyExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Repair Grammar Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.feature.mapping.repair.dsl.mappingRepairDsl.impl.MappingRepairGrammarEntryImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRepairGrammarEntryImpl extends MinimalEObjectImpl.Container implements MappingRepairGrammarEntry
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected HyExpression action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingRepairGrammarEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingRepairDslPackage.Literals.MAPPING_REPAIR_GRAMMAR_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyExpression getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(HyExpression newAction, NotificationChain msgs)
  {
    HyExpression oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(HyExpression newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION:
        return basicSetAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION:
        return getAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION:
        setAction((HyExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION:
        setAction((HyExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingRepairDslPackage.MAPPING_REPAIR_GRAMMAR_ENTRY__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingRepairGrammarEntryImpl