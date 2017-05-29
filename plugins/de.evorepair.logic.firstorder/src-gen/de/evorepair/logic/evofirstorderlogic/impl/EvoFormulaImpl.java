/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evooperation.EvoOperation;

import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoFormula;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaImpl#getTestTrigger <em>Test Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoFormulaImpl extends MinimalEObjectImpl.Container implements EvoFormula {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EvoAbstractTerm term;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EvoEvolutionTerm> variables;

	/**
	 * The cached value of the '{@link #getTestTrigger() <em>Test Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTrigger()
	 * @generated
	 * @ordered
	 */
	protected EvoOperation testTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoFirstOrderLogicPackage.Literals.EVO_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAbstractTerm getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(EvoAbstractTerm newTerm, NotificationChain msgs) {
		EvoAbstractTerm oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(EvoAbstractTerm newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_FORMULA__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvoFirstOrderLogicPackage.EVO_FORMULA__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvoEvolutionTerm> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<EvoEvolutionTerm>(EvoEvolutionTerm.class, this, EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoOperation getTestTrigger() {
		if (testTrigger != null && testTrigger.eIsProxy()) {
			InternalEObject oldTestTrigger = (InternalEObject)testTrigger;
			testTrigger = (EvoOperation)eResolveProxy(oldTestTrigger);
			if (testTrigger != oldTestTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER, oldTestTrigger, testTrigger));
			}
		}
		return testTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoOperation basicGetTestTrigger() {
		return testTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestTrigger(EvoOperation newTestTrigger) {
		EvoOperation oldTestTrigger = testTrigger;
		testTrigger = newTestTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER, oldTestTrigger, testTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
				return basicSetTerm(null, msgs);
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
				return getTerm();
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
				return getVariables();
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER:
				if (resolve) return getTestTrigger();
				return basicGetTestTrigger();
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
				setTerm((EvoAbstractTerm)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends EvoEvolutionTerm>)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER:
				setTestTrigger((EvoOperation)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
				setTerm((EvoAbstractTerm)null);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
				getVariables().clear();
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER:
				setTestTrigger((EvoOperation)null);
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
				return term != null;
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
				return variables != null && !variables.isEmpty();
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TEST_TRIGGER:
				return testTrigger != null;
		}
		return super.eIsSet(featureID);
	}

} //EvoFormulaImpl
