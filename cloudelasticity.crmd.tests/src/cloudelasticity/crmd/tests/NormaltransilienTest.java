/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.Normaltransilien;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normaltransilien</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormaltransilienTest extends TtransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormaltransilienTest.class);
	}

	/**
	 * Constructs a new Normaltransilien test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormaltransilienTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normaltransilien test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Normaltransilien getFixture() {
		return (Normaltransilien)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createNormaltransilien());
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

} //NormaltransilienTest
