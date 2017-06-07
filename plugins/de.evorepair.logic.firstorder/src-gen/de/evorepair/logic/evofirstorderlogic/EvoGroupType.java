/**
 */
package de.evorepair.logic.evofirstorderlogic;

import eu.hyvar.feature.HyGroupTypeEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoGroupType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoGroupType()
 * @model
 * @generated
 */
public interface EvoGroupType extends EvoEvolutionTerm, EvoAbstractTerm
{
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
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoGroupType_Type()
	 * @model
	 * @generated
	 */
	HyGroupTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoGroupType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyGroupTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(HyGroupTypeEnum value);

} // EvoGroupType
