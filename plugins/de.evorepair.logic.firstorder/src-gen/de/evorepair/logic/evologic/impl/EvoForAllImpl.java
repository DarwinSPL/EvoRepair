/**
 */
package de.evorepair.logic.evologic.impl;

import de.evorepair.logic.evologic.EvoForAll;
import de.evorepair.logic.evologic.EvoLogicPackage;
import de.evorepair.logic.evologic.EvoVariableTerm;

import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyExpressionPackage;
import eu.hyvar.feature.expression.HyUnaryExpression;

import eu.hyvar.feature.expression.impl.HyExpressionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo For All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.impl.EvoForAllImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.evorepair.logic.evologic.impl.EvoForAllImpl#getBoundedVariables <em>Bounded Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoForAllImpl extends HyExpressionImpl implements EvoForAll {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected HyExpression operand;

	/**
	 * The cached value of the '{@link #getBoundedVariables() <em>Bounded Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoVariableTerm> boundedVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoForAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoLogicPackage.Literals.EVO_FOR_ALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyExpression getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(HyExpression newOperand, NotificationChain msgs) {
		HyExpression oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_FOR_ALL__OPERAND, oldOperand, newOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(HyExpression newOperand) {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_FOR_ALL__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoLogicPackage.EVO_FOR_ALL__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoLogicPackage.EVO_FOR_ALL__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvoVariableTerm> getBoundedVariables() {
		if (boundedVariables == null) {
			boundedVariables = new EObjectContainmentEList<EvoVariableTerm>(EvoVariableTerm.class, this, EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES);
		}
		return boundedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvoLogicPackage.EVO_FOR_ALL__OPERAND:
				return basicSetOperand(null, msgs);
			case EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				return ((InternalEList<?>)getBoundedVariables()).basicRemove(otherEnd, msgs);
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
			case EvoLogicPackage.EVO_FOR_ALL__OPERAND:
				return getOperand();
			case EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvoLogicPackage.EVO_FOR_ALL__OPERAND:
				setOperand((HyExpression)newValue);
				return;
			case EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
				getBoundedVariables().clear();
				getBoundedVariables().addAll((Collection<? extends EvoVariableTerm>)newValue);
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
			case EvoLogicPackage.EVO_FOR_ALL__OPERAND:
				setOperand((HyExpression)null);
				return;
			case EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvoLogicPackage.EVO_FOR_ALL__OPERAND:
				return operand != null;
			case EvoLogicPackage.EVO_FOR_ALL__BOUNDED_VARIABLES:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HyUnaryExpression.class) {
			switch (derivedFeatureID) {
				case EvoLogicPackage.EVO_FOR_ALL__OPERAND: return HyExpressionPackage.HY_UNARY_EXPRESSION__OPERAND;
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
		if (baseClass == HyUnaryExpression.class) {
			switch (baseFeatureID) {
				case HyExpressionPackage.HY_UNARY_EXPRESSION__OPERAND: return EvoLogicPackage.EVO_FOR_ALL__OPERAND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EvoForAllImpl
