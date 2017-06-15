/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evovariable.EvoFeatureVariable;

import de.evorepair.logic.evofirstorderlogic.EvoFeatureType;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;

import eu.hyvar.feature.HyFeatureTypeEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFeatureTypeImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoFeatureTypeImpl extends EvoAbstractTermImpl implements EvoFeatureType
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final HyFeatureTypeEnum TYPE_EDEFAULT = HyFeatureTypeEnum.OPTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HyFeatureTypeEnum type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoFeatureVariable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoFeatureTypeImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyFeatureTypeEnum getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HyFeatureTypeEnum newType)
	{
		HyFeatureTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvoFeatureVariable> getVariables()
	{
		if (variables == null)
		{
			variables = new EObjectResolvingEList<EvoFeatureVariable>(EvoFeatureVariable.class, this, EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__VARIABLES);
		}
		return variables;
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
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__TYPE:
				return getType();
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__VARIABLES:
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
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__TYPE:
				setType((HyFeatureTypeEnum)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends EvoFeatureVariable>)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__VARIABLES:
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
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case EvoFirstOrderLogicPackage.EVO_FEATURE_TYPE__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EvoFeatureTypeImpl
