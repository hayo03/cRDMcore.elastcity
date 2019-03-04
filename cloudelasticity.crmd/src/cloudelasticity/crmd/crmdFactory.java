/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage
 * @generated
 */
public interface crmdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	crmdFactory eINSTANCE = cloudelasticity.crmd.impl.crmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourcerequirment</em>'.
	 * @generated
	 */
	Resourcerequirment createResourcerequirment();

	/**
	 * Returns a new object of class '<em>cRDM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cRDM</em>'.
	 * @generated
	 */
	cRDM createcRDM();

	/**
	 * Returns a new object of class '<em>CLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLink</em>'.
	 * @generated
	 */
	C_Link createC_Link();

	/**
	 * Returns a new object of class '<em>Atomicresource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomicresource</em>'.
	 * @generated
	 */
	Atomicresource createAtomicresource();

	/**
	 * Returns a new object of class '<em>cRDM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cRDM Entity</em>'.
	 * @generated
	 */
	cRDMEntity createcRDMEntity();

	/**
	 * Returns a new object of class '<em>Compositeresource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compositeresource</em>'.
	 * @generated
	 */
	Compositeresource createCompositeresource();

	/**
	 * Returns a new object of class '<em>CSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM</em>'.
	 * @generated
	 */
	C_SM createC_SM();

	/**
	 * Returns a new object of class '<em>Cloudresource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudresource</em>'.
	 * @generated
	 */
	Cloudresource createCloudresource();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Resourceconstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourceconstraint</em>'.
	 * @generated
	 */
	Resourceconstraint createResourceconstraint();

	/**
	 * Returns a new object of class '<em>Cloud Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Resourcerequirment</em>'.
	 * @generated
	 */
	CloudResourcerequirment createCloudResourcerequirment();

	/**
	 * Returns a new object of class '<em>State Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Resourcerequirment</em>'.
	 * @generated
	 */
	StateResourcerequirment createStateResourcerequirment();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Reconfigurationaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigurationaction</em>'.
	 * @generated
	 */
	Reconfigurationaction createReconfigurationaction();

	/**
	 * Returns a new object of class '<em>Normal State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal State</em>'.
	 * @generated
	 */
	NormalState createNormalState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Mainmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainmap</em>'.
	 * @generated
	 */
	Mainmap createMainmap();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Basic Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Action</em>'.
	 * @generated
	 */
	BasicAction createBasicAction();

	/**
	 * Returns a new object of class '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration</em>'.
	 * @generated
	 */
	Migration createMigration();

	/**
	 * Returns a new object of class '<em>Horizontalscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalscaling</em>'.
	 * @generated
	 */
	Horizontalscaling createHorizontalscaling();

	/**
	 * Returns a new object of class '<em>Verticalscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verticalscaling</em>'.
	 * @generated
	 */
	Verticalscaling createVerticalscaling();

	/**
	 * Returns a new object of class '<em>Compositereconfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compositereconfiguration</em>'.
	 * @generated
	 */
	Compositereconfiguration createCompositereconfiguration();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>AWS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AWS</em>'.
	 * @generated
	 */
	AWS createAWS();

	/**
	 * Returns a new object of class '<em>Openstack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack</em>'.
	 * @generated
	 */
	Openstack createOpenstack();

	/**
	 * Returns a new object of class '<em>Google Cloud Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Google Cloud Platform</em>'.
	 * @generated
	 */
	GoogleCloudPlatform createGoogleCloudPlatform();

	/**
	 * Returns a new object of class '<em>Orechestration Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orechestration Tool</em>'.
	 * @generated
	 */
	OrechestrationTool createOrechestrationTool();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>TSA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSA</em>'.
	 * @generated
	 */
	TSA createTSA();

	/**
	 * Returns a new object of class '<em>Ttransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttransition</em>'.
	 * @generated
	 */
	Ttransition createTtransition();

	/**
	 * Returns a new object of class '<em>Tstate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tstate</em>'.
	 * @generated
	 */
	Tstate createTstate();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Normaltransilien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normaltransilien</em>'.
	 * @generated
	 */
	Normaltransilien createNormaltransilien();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	crmdPackage getcrmdPackage();

} //crmdFactory
