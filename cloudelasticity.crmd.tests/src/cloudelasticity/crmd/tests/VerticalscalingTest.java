/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.Verticalscaling;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Verticalscaling</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerticalscalingTest extends ReconfigurationactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerticalscalingTest.class);
	}

	/**
	 * Constructs a new Verticalscaling test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalscalingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Verticalscaling test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Verticalscaling getFixture() {
		return (Verticalscaling)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createVerticalscaling());
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

} //VerticalscalingTest
