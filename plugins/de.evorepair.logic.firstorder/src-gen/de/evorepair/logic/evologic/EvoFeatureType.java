/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.HyFeatureTypeEnum;

import eu.hyvar.feature.expression.HyExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoFeatureType#getType <em>Type</em>}</li>
 *   <li>{@link de.evorepair.logic.evologic.EvoFeatureType#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoFeatureType()
 * @model
 * @generated
 */
public interface EvoFeatureType extends HyExpression
{
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
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoFeatureType_Type()
	 * @model
	 * @generated
	 */
	HyFeatureTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoFeatureType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyFeatureTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(HyFeatureTypeEnum value);

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
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoFeatureType_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvoVariableTerm> getVariables();

} // EvoFeatureType
