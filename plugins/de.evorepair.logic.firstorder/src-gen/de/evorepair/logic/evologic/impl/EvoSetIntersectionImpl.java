/**
 */
package de.evorepair.logic.evologic.impl;

import de.evorepair.logic.evologic.EvoBinaryExpression;
import de.evorepair.logic.evologic.EvoLogicPackage;
import de.evorepair.logic.evologic.EvoSetIntersection;

import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Set Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link de.evorepair.logic.evologic.impl.EvoSetIntersectionImpl#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoSetIntersectionImpl extends EvoAbstractSetTermImpl implements EvoSetIntersection {
	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected HyExpression operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected HyExpression operand2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoSetIntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoLogicPackage.Literals.EVO_SET_INTERSECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyExpression getOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand1(HyExpression newOperand1, NotificationChain msgs) {
		HyExpression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(HyExpression newOperand1) {
		if (newOperand1 != operand1) {
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1, newOperand1, newOperand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyExpression getOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand2(HyExpression newOperand2, NotificationChain msgs) {
		HyExpression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(HyExpression newOperand2) {
		if (newOperand2 != operand2) {
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2, newOperand2, newOperand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1:
				return basicSetOperand1(null, msgs);
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2:
				return basicSetOperand2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1:
				return getOperand1();
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2:
				return getOperand2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1:
				setOperand1((HyExpression)newValue);
				return;
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2:
				setOperand2((HyExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1:
				setOperand1((HyExpression)null);
				return;
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2:
				setOperand2((HyExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1:
				return operand1 != null;
			case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2:
				return operand2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HyBinaryExpression.class) {
			switch (derivedFeatureID) {
				case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1: return HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND1;
				case EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2: return HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND2;
				default: return -1;
			}
		}
		if (baseClass == EvoBinaryExpression.class) {
			switch (derivedFeatureID) {
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HyBinaryExpression.class) {
			switch (baseFeatureID) {
				case HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND1: return EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND1;
				case HyExpressionPackage.HY_BINARY_EXPRESSION__OPERAND2: return EvoLogicPackage.EVO_SET_INTERSECTION__OPERAND2;
				default: return -1;
			}
		}
		if (baseClass == EvoBinaryExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EvoSetIntersectionImpl
