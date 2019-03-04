/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.Horizontalscaling;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Horizontalscaling</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalscalingTest extends ReconfigurationactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HorizontalscalingTest.class);
	}

	/**
	 * Constructs a new Horizontalscaling test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalscalingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Horizontalscaling test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Horizontalscaling getFixture() {
		return (Horizontalscaling)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createHorizontalscaling());
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

} //HorizontalscalingTest
