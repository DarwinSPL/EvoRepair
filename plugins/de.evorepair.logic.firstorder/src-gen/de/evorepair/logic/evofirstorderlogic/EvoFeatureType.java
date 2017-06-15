/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evovariable.EvoFeatureVariable;

import eu.hyvar.feature.HyFeatureTypeEnum;

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
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType#getType <em>Type</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFeatureType()
 * @model
 * @generated
 */
public interface EvoFeatureType extends EvoAbstractTerm
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
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFeatureType_Type()
	 * @model
	 * @generated
	 */
	HyFeatureTypeEnum getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoFeatureType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.hyvar.feature.HyFeatureTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(HyFeatureTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link de.evorepair.evolution.evovariable.EvoFeatureVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFeatureType_Variables()
	 * @model required="true"
	 * @generated
	 */
	EList<EvoFeatureVariable> getVariables();

} // EvoFeatureType
