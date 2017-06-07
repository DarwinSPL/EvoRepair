/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Abstract Quantifier Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm#getBoundedVariable <em>Bounded Variable</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractQuantifierTerm()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvoAbstractQuantifierTerm extends EvoAbstractTerm, EvoAbstractOneParameterTerm
{
	/**
	 * Returns the value of the '<em><b>Bounded Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Variable</em>' reference.
	 * @see #setBoundedVariable(EvoEvolutionTerm)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractQuantifierTerm_BoundedVariable()
	 * @model required="true"
	 * @generated
	 */
	EvoEvolutionTerm getBoundedVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm#getBoundedVariable <em>Bounded Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded Variable</em>' reference.
	 * @see #getBoundedVariable()
	 * @generated
	 */
	void setBoundedVariable(EvoEvolutionTerm value);

} // EvoAbstractQuantifierTerm
