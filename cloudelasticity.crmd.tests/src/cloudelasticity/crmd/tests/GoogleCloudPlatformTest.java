/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.GoogleCloudPlatform;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Google Cloud Platform</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoogleCloudPlatformTest extends ProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoogleCloudPlatformTest.class);
	}

	/**
	 * Constructs a new Google Cloud Platform test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoogleCloudPlatformTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Google Cloud Platform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoogleCloudPlatform getFixture() {
		return (GoogleCloudPlatform)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createGoogleCloudPlatform());
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

} //GoogleCloudPlatformTest
