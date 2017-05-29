/**
 */
package de.evorepair.logic.evofirstorderlogic;

import eu.hyvar.feature.HyFeatureTypeEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Siblings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoSiblings#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoSiblings()
 * @model
 * @generated
 */
public interface EvoSiblings extends EvoPredefinedVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.hyvar.feature.HyFeatureTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyFeatureTypeEnum
	 * @see #setType(HyFeatureTypeEnum)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoSiblings_Type()
	 * @model
	 * @generated
	 */
	HyFeatureTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoSiblings#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyFeatureTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(HyFeatureTypeEnum value);

} // EvoSiblings
