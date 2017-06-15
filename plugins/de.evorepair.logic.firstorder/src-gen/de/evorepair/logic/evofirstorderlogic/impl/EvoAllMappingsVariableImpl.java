/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo All Mappings Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoAllMappingsVariableImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoAllMappingsVariableImpl extends EvoAbstractTermImpl implements EvoAllMappingsVariable
{
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoAbstractTerm> variables;

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
	public EList<EvoAbstractTerm> getVariables()
	{
		if (variables == null)
		{
			variables = new EObjectContainmentEList<EvoAbstractTerm>(EvoAbstractTerm.class, this, EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES);
		}
		return variables;
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES:
				return getVariables();
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends EvoAbstractTerm>)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES:
				getVariables().clear();
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
			case EvoFirstOrderLogicPackage.EVO_ALL_MAPPINGS_VARIABLE__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvoAllMappingsVariableImpl
