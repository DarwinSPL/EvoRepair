/**
 */
package de.evorepair.logic.evofirstorderlogic.impl;

import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariablePackage;
import de.evorepair.evolution.evovariable.EvoVariableType;

import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoFormulaVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Formula Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.impl.EvoFormulaVariableImpl#getVariableType <em>Variable Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EvoFormulaVariableImpl extends EvoAbstractTermImpl implements EvoFormulaVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected static final EvoVariableType VARIABLE_TYPE_EDEFAULT = EvoVariableType.EVO_IDENTIFIER;

	/**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected EvoVariableType variableType = VARIABLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoFormulaVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoFirstOrderLogicPackage.Literals.EVO_FORMULA_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoVariableType getVariableType() {
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableType(EvoVariableType newVariableType) {
		EvoVariableType oldVariableType = variableType;
		variableType = newVariableType == null ? VARIABLE_TYPE_EDEFAULT : newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME:
				return getName();
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX:
				return getIndex();
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE:
				return getVariableType();
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX:
				setIndex((Integer)newValue);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE:
				setVariableType((EvoVariableType)newValue);
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE:
				setVariableType(VARIABLE_TYPE_EDEFAULT);
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
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX:
				return index != INDEX_EDEFAULT;
			case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE:
				return variableType != VARIABLE_TYPE_EDEFAULT;
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
		if (baseClass == EvoVariable.class) {
			switch (derivedFeatureID) {
				case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME: return EvoVariablePackage.EVO_VARIABLE__NAME;
				case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX: return EvoVariablePackage.EVO_VARIABLE__INDEX;
				case EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE: return EvoVariablePackage.EVO_VARIABLE__VARIABLE_TYPE;
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
		if (baseClass == EvoVariable.class) {
			switch (baseFeatureID) {
				case EvoVariablePackage.EVO_VARIABLE__NAME: return EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__NAME;
				case EvoVariablePackage.EVO_VARIABLE__INDEX: return EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__INDEX;
				case EvoVariablePackage.EVO_VARIABLE__VARIABLE_TYPE: return EvoFirstOrderLogicPackage.EVO_FORMULA_VARIABLE__VARIABLE_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", index: ");
		result.append(index);
		result.append(", variableType: ");
		result.append(variableType);
		result.append(')');
		return result.toString();
	}

} //EvoFormulaVariableImpl
