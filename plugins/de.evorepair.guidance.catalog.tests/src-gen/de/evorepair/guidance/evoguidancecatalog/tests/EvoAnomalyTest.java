/**
 */
package de.evorepair.guidance.evoguidancecatalog.tests;

import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoguidanceCatalogFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evo Anomaly</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoAnomalyTest extends TestCase {

	/**
	 * The fixture for this Evo Anomaly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoAnomaly fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvoAnomalyTest.class);
	}

	/**
	 * Constructs a new Evo Anomaly test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoAnomalyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Evo Anomaly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EvoAnomaly fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Evo Anomaly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoAnomaly getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EvoguidanceCatalogFactory.eINSTANCE.createEvoAnomaly());
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

} //EvoAnomalyTest
