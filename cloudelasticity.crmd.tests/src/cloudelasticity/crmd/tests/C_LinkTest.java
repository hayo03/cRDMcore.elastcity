/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.C_Link;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CLink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class C_LinkTest extends cRDMEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(C_LinkTest.class);
	}

	/**
	 * Constructs a new CLink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_LinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CLink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected C_Link getFixture() {
		return (C_Link)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createC_Link());
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

} //C_LinkTest
