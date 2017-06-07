/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable;
import de.evorepair.logic.evofirstorderlogic.EvoMappingVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Mapping Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoMappingVariableImpl#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoMappingVariableImpl extends EvoPredefinedVariableImpl implements EvoMappingVariable
{
	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected String mapping = MAPPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainingFeature() <em>Containing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFeature()
	 * @generated
	 * @ordered
	 */
	protected EvoFormulaVariable containingFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoMappingVariableImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_MAPPING_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapping()
	{
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(String newMapping)
	{
		String oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormulaVariable getContainingFeature()
	{
		if (containingFeature != null && containingFeature.eIsProxy())
		{
			InternalEObject oldContainingFeature = (InternalEObject)containingFeature;
			containingFeature = (EvoFormulaVariable)eResolveProxy(oldContainingFeature);
			if (containingFeature != oldContainingFeature)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
			}
		}
		return containingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormulaVariable basicGetContainingFeature()
	{
		return containingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingFeature(EvoFormulaVariable newContainingFeature)
	{
		EvoFormulaVariable oldContainingFeature = containingFeature;
		containingFeature = newContainingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__MAPPING:
				return getMapping();
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE:
				if (resolve) return getContainingFeature();
				return basicGetContainingFeature();
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__MAPPING:
				setMapping((String)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE:
				setContainingFeature((EvoFormulaVariable)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__MAPPING:
				setMapping(MAPPING_EDEFAULT);
				return;
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE:
				setContainingFeature((EvoFormulaVariable)null);
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
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__MAPPING:
				return MAPPING_EDEFAULT == null ? mapping != null : !MAPPING_EDEFAULT.equals(mapping);
			case EvoFirstOrderLogicPackage.EVO_MAPPING_VARIABLE__CONTAINING_FEATURE:
				return containingFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mapping: ");
		result.append(mapping);
		result.append(')');
		return result.toString();
	}

} //EvoMappingVariableImpl
