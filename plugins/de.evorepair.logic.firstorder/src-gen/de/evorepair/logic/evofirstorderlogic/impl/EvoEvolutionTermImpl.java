/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evovariable.impl.EvoVariableImpl;

import de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Evolution Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoEvolutionTermImpl#isAfterEvolution <em>After Evolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvoEvolutionTermImpl extends EvoVariableImpl implements EvoEvolutionTerm {
	/**
	 * The default value of the '{@link #isAfterEvolution() <em>After Evolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAfterEvolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AFTER_EVOLUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAfterEvolution() <em>After Evolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAfterEvolution()
	 * @generated
	 * @ordered
	 */
	protected boolean afterEvolution = AFTER_EVOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoEvolutionTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoFirstOrderLogicPackage.Literals.EVO_EVOLUTION_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAfterEvolution() {
		return afterEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterEvolution(boolean newAfterEvolution) {
		boolean oldAfterEvolution = afterEvolution;
		afterEvolution = newAfterEvolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_EVOLUTION_TERM__AFTER_EVOLUTION, oldAfterEvolution, afterEvolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvoFirstOrderLogicPackage.EVO_EVOLUTION_TERM__AFTER_EVOLUTION:
				return isAfterEvolution();
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
			case EvoFirstOrderLogicPackage.EVO_EVOLUTION_TERM__AFTER_EVOLUTION:
				setAfterEvolution((Boolean)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_EVOLUTION_TERM__AFTER_EVOLUTION:
				setAfterEvolution(AFTER_EVOLUTION_EDEFAULT);
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
			case EvoFirstOrderLogicPackage.EVO_EVOLUTION_TERM__AFTER_EVOLUTION:
				return afterEvolution != AFTER_EVOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (afterEvolution: ");
		result.append(afterEvolution);
		result.append(')');
		return result.toString();
	}

} //EvoEvolutionTermImpl
