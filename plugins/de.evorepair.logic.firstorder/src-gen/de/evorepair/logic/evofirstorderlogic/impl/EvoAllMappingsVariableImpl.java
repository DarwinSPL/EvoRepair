/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoMappingVariable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo All Mappings Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl#getAssociatedMappings <em>Associated Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoAllMappingsVariableImpl extends MinimalEObjectImpl.Container implements EvoAllMappingsVariable
{
	/**
	 * The cached value of the '{@link #getAssociatedMappings() <em>Associated Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoMappingVariable> associatedMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoAllMappingsVariableImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_ALL_MAPPINGS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvoMappingVariable> getAssociatedMappings()
	{
		if (associatedMappings == null)
		{
			associatedMappings = new EObjectResolvingEList<EvoMappingVariable>(EvoMappingVariable.class, this, EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS);
		}
		return associatedMappings;
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS:
				return getAssociatedMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS:
				getAssociatedMappings().clear();
				getAssociatedMappings().addAll((Collection<? extends EvoMappingVariable>)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS:
				getAssociatedMappings().clear();
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__ASSOCIATED_MAPPINGS:
				return associatedMappings != null && !associatedMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvoAllMappingsVariableImpl
