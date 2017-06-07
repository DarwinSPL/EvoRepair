/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoMappingVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Mapping Associated Assets Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingAssociatedAssetsVariableImpl#getAssociatedMapping <em>Associated Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoMappingAssociatedAssetsVariableImpl extends EvoEvolutionTermImpl implements EvoMappingAssociatedAssetsVariable
{
	/**
	 * The cached value of the '{@link #getAssociatedMapping() <em>Associated Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMapping()
	 * @generated
	 * @ordered
	 */
	protected EvoMappingVariable associatedMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoMappingAssociatedAssetsVariableImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingVariable getAssociatedMapping()
	{
		if (associatedMapping != null && associatedMapping.eIsProxy())
		{
			InternalEObject oldAssociatedMapping = (InternalEObject)associatedMapping;
			associatedMapping = (EvoMappingVariable)eResolveProxy(oldAssociatedMapping);
			if (associatedMapping != oldAssociatedMapping)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING, oldAssociatedMapping, associatedMapping));
			}
		}
		return associatedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingVariable basicGetAssociatedMapping()
	{
		return associatedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedMapping(EvoMappingVariable newAssociatedMapping)
	{
		EvoMappingVariable oldAssociatedMapping = associatedMapping;
		associatedMapping = newAssociatedMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING, oldAssociatedMapping, associatedMapping));
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING:
				if (resolve) return getAssociatedMapping();
				return basicGetAssociatedMapping();
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING:
				setAssociatedMapping((EvoMappingVariable)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING:
				setAssociatedMapping((EvoMappingVariable)null);
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_ASSOCIATED_ASSETS_VARIABLE__ASSOCIATED_MAPPING:
				return associatedMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //EvoMappingAssociatedAssetsVariableImpl
