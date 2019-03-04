/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.OrechestrationTool;
import cloudelasticity.crmd.crmdFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orechestration Tool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrechestrationToolTest extends TestCase {

	/**
	 * The fixture for this Orechestration Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrechestrationTool fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrechestrationToolTest.class);
	}

	/**
	 * Constructs a new Orechestration Tool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrechestrationToolTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Orechestration Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrechestrationTool fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Orechestration Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrechestrationTool getFixture() {
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
		setFixture(crmdFactory.eINSTANCE.createOrechestrationTool());
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

} //OrechestrationToolTest
