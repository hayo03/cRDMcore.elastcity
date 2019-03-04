/**
 */
package cloudelasticity.crmd.tests;

import cloudelasticity.crmd.Compositereconfiguration;
import cloudelasticity.crmd.crmdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compositereconfiguration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositereconfigurationTest extends ReconfigurationactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositereconfigurationTest.class);
	}

	/**
	 * Constructs a new Compositereconfiguration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositereconfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Compositereconfiguration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Compositereconfiguration getFixture() {
		return (Compositereconfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(crmdFactory.eINSTANCE.createCompositereconfiguration());
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

} //CompositereconfigurationTest
