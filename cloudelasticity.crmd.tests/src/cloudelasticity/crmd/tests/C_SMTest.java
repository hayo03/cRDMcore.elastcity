/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.crmdFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class C_SMTest extends TestCase {

	/**
	 * The fixture for this CSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C_SM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(C_SMTest.class);
	}

	/**
	 * Constructs a new CSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_SMTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this CSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(C_SM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this CSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C_SM getFixture() {
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
		setFixture(crmdFactory.eINSTANCE.createC_SM());
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

} //C_SMTest
