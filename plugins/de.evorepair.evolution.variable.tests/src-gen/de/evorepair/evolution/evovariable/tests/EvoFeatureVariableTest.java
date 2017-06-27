/**
 */
package de.evorepair.evolution.evovariable.tests;

import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoVariableFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evo Feature Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoFeatureVariableTest extends EvoVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvoFeatureVariableTest.class);
	}

	/**
	 * Constructs a new Evo Feature Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFeatureVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evo Feature Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvoFeatureVariable getFixture() {
		return (EvoFeatureVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EvoVariableFactory.eINSTANCE.createEvoFeatureVariable());
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

} //EvoFeatureVariableTest
