/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evovariable.EvoVariable;

import de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoForAll;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo For All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoForAllImpl#getBoundedVariables <em>Bounded Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoForAllImpl extends EvoAbstractTermImpl implements EvoForAll
{
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EvoAbstractTerm element;

	/**
	 * The cached value of the '{@link #getBoundedVariables() <em>Bounded Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoVariable> boundedVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoForAllImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_FOR_ALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAbstractTerm getElement()
	{
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(EvoAbstractTerm newElement, NotificationChain msgs)
	{
		EvoAbstractTerm oldElement = element;
		element = newElement;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EvoAbstractTerm newElement)
	{
		if (newElement != element)
		{
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvoVariable> getBoundedVariables()
	{
		if (boundedVariables == null)
		{
			boundedVariables = new EObjectResolvingEList<EvoVariable>(EvoVariable.class, this, EvoFirstOrderLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES);
		}
		return boundedVariables;
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
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT:
				return basicSetElement(null, msgs);
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
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT:
				return getElement();
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				return getBoundedVariables();
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
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT:
				setElement((EvoAbstractTerm)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				getBoundedVariables().clear();
				getBoundedVariables().addAll((Collection<? extends EvoVariable>)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT:
				setElement((EvoAbstractTerm)null);
				return;
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				getBoundedVariables().clear();
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
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT:
				return element != null;
			case EvoFirstOrderLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				return boundedVariables != null && !boundedVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == EvoAbstractOneParameterTerm.class)
		{
			switch (derivedFeatureID)
			{
				case EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT: return EvoFirstOrderLogicPackage.EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == EvoAbstractOneParameterTerm.class)
		{
			switch (baseFeatureID)
			{
				case EvoFirstOrderLogicPackage.EVO_ABSTRACT_ONE_PARAMETER_TERM__ELEMENT: return EvoFirstOrderLogicPackage.EVO_FOR_ALL__ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EvoForAllImpl
