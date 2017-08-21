/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.HyGroupTypeEnum;

import eu.hyvar.feature.expression.HyExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoGroupType#getType <em>Type</em>}</li>
 *   <li>{@link de.evorepair.logic.evologic.EvoGroupType#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoGroupType()
 * @model
 * @generated
 */
public interface EvoGroupType extends HyExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.hyvar.feature.HyGroupTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyGroupTypeEnum
	 * @see #setType(HyGroupTypeEnum)
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoGroupType_Type()
	 * @model
	 * @generated
	 */
	HyGroupTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoGroupType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyGroupTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(HyGroupTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.evorepair.logic.evologic.EvoVariableTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoGroupType_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvoVariableTerm> getVariables();

} // EvoGroupType
