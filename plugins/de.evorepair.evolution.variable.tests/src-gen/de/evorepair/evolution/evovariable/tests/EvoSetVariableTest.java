/**
 */
package de.evorepair.evolution.evovariable.tests;

import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariableFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evo Set Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoSetVariableTest extends EvoVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvoSetVariableTest.class);
	}

	/**
	 * Constructs a new Evo Set Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evo Set Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvoSetVariable getFixture() {
		return (EvoSetVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EvoVariableFactory.eINSTANCE.createEvoSetVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EvoSetVariableTest
