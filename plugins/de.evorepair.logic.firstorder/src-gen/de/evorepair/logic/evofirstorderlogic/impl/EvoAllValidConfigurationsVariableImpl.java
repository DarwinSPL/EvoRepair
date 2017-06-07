/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo All Valid Configurations Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllValidConfigurationsVariableImpl#getFeatureVariable <em>Feature Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoAllValidConfigurationsVariableImpl extends MinimalEObjectImpl.Container implements EvoAllValidConfigurationsVariable
{
	/**
	 * The cached value of the '{@link #getFeatureVariable() <em>Feature Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureVariable()
	 * @generated
	 * @ordered
	 */
	protected EvoFormulaVariable featureVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoAllValidConfigurationsVariableImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormulaVariable getFeatureVariable()
	{
		if (featureVariable != null && featureVariable.eIsProxy())
		{
			InternalEObject oldFeatureVariable = (InternalEObject)featureVariable;
			featureVariable = (EvoFormulaVariable)eResolveProxy(oldFeatureVariable);
			if (featureVariable != oldFeatureVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE, oldFeatureVariable, featureVariable));
			}
		}
		return featureVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormulaVariable basicGetFeatureVariable()
	{
		return featureVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureVariable(EvoFormulaVariable newFeatureVariable)
	{
		EvoFormulaVariable oldFeatureVariable = featureVariable;
		featureVariable = newFeatureVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE, oldFeatureVariable, featureVariable));
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
			case EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE:
				if (resolve) return getFeatureVariable();
				return basicGetFeatureVariable();
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
			case EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE:
				setFeatureVariable((EvoFormulaVariable)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE:
				setFeatureVariable((EvoFormulaVariable)null);
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
			case EvoFirstOrderLogicPackage.EVO_ALL_VALID_CONFIGURATIONS_VARIABLE__FEATURE_VARIABLE:
				return featureVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //EvoAllValidConfigurationsVariableImpl
