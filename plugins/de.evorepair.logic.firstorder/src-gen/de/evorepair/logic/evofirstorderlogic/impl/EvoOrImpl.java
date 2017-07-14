/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoOr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl#getLeftElement <em>Left Element</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoOrImpl#getRightElement <em>Right Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoOrImpl extends EvoAbstractTermImpl implements EvoOr
{
	/**
	 * The cached value of the '{@link #getLeftElement() <em>Left Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftElement()
	 * @generated
	 * @ordered
	 */
	protected EvoAbstractTerm leftElement;

	/**
	 * The cached value of the '{@link #getRightElement() <em>Right Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightElement()
	 * @generated
	 * @ordered
	 */
	protected EvoAbstractTerm rightElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoOrImpl()
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
		return EvoFirstOrderLogicPackage.Literals.EVO_OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAbstractTerm getLeftElement()
	{
		return leftElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftElement(EvoAbstractTerm newLeftElement, NotificationChain msgs)
	{
		EvoAbstractTerm oldLeftElement = leftElement;
		leftElement = newLeftElement;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT, oldLeftElement, newLeftElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftElement(EvoAbstractTerm newLeftElement)
	{
		if (newLeftElement != leftElement)
		{
			NotificationChain msgs = null;
			if (leftElement != null)
				msgs = ((InternalEObject)leftElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT, null, msgs);
			if (newLeftElement != null)
				msgs = ((InternalEObject)newLeftElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT, null, msgs);
			msgs = basicSetLeftElement(newLeftElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT, newLeftElement, newLeftElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAbstractTerm getRightElement()
	{
		return rightElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightElement(EvoAbstractTerm newRightElement, NotificationChain msgs)
	{
		EvoAbstractTerm oldRightElement = rightElement;
		rightElement = newRightElement;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT, oldRightElement, newRightElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightElement(EvoAbstractTerm newRightElement)
	{
		if (newRightElement != rightElement)
		{
			NotificationChain msgs = null;
			if (rightElement != null)
				msgs = ((InternalEObject)rightElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT, null, msgs);
			if (newRightElement != null)
				msgs = ((InternalEObject)newRightElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT, null, msgs);
			msgs = basicSetRightElement(newRightElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT, newRightElement, newRightElement));
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
			case EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT:
				return basicSetLeftElement(null, msgs);
			case EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT:
				return basicSetRightElement(null, msgs);
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
			case EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT:
				return getLeftElement();
			case EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT:
				return getRightElement();
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
			case EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT:
				setLeftElement((EvoAbstractTerm)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT:
				setRightElement((EvoAbstractTerm)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT:
				setLeftElement((EvoAbstractTerm)null);
				return;
			case EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT:
				setRightElement((EvoAbstractTerm)null);
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
			case EvoFirstOrderLogicPackage.EVO_OR__LEFT_ELEMENT:
				return leftElement != null;
			case EvoFirstOrderLogicPackage.EVO_OR__RIGHT_ELEMENT:
				return rightElement != null;
		}
		return super.eIsSet(featureID);
	}

} //EvoOrImpl
