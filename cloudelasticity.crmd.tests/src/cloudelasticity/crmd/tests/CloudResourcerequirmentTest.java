/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.CloudResourcerequirment;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloud Resourcerequirment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudResourcerequirmentTest extends ResourcerequirmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloudResourcerequirmentTest.class);
	}

	/**
	 * Constructs a new Cloud Resourcerequirment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResourcerequirmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cloud Resourcerequirment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CloudResourcerequirment getFixture() {
		return (CloudResourcerequirment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createCloudResourcerequirment());
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

} //CloudResourcerequirmentTest
