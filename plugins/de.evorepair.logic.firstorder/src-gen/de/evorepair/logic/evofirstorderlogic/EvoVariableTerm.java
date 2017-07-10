/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Variable Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoVariableTerm()
 * @model
 * @generated
 */
public interface EvoVariableTerm extends EvoAbstractTerm
{
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(EvoVariable)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoVariableTerm_Variable()
	 * @model required="true"
	 * @generated
	 */
	EvoVariable getVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(EvoVariable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.evorepair.evolution.evovariable.EvoVariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.evorepair.evolution.evovariable.EvoVariableType
	 * @see #setType(EvoVariableType)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoVariableTerm_Type()
	 * @model
	 * @generated
	 */
	EvoVariableType getType();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoVariableTerm#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.evorepair.evolution.evovariable.EvoVariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(EvoVariableType value);

} // EvoVariableTerm
