/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class crmdFactoryImpl extends EFactoryImpl implements crmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static crmdFactory init() {
		try {
			crmdFactory thecrmdFactory = (crmdFactory)EPackage.Registry.INSTANCE.getEFactory(crmdPackage.eNS_URI);
			if (thecrmdFactory != null) {
				return thecrmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new crmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crmdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case crmdPackage.RESOURCEREQUIRMENT: return createResourcerequirment();
			case crmdPackage.CRDM: return createcRDM();
			case crmdPackage.CLINK: return createC_Link();
			case crmdPackage.ATOMICRESOURCE: return createAtomicresource();
			case crmdPackage.CRDM_ENTITY: return createcRDMEntity();
			case crmdPackage.COMPOSITERESOURCE: return createCompositeresource();
			case crmdPackage.CSM: return createC_SM();
			case crmdPackage.CLOUDRESOURCE: return createCloudresource();
			case crmdPackage.PROPERTY: return createProperty();
			case crmdPackage.ATTRIBUTE: return createAttribute();
			case crmdPackage.RESOURCECONSTRAINT: return createResourceconstraint();
			case crmdPackage.CLOUD_RESOURCEREQUIRMENT: return createCloudResourcerequirment();
			case crmdPackage.STATE_RESOURCEREQUIRMENT: return createStateResourcerequirment();
			case crmdPackage.STATE: return createState();
			case crmdPackage.TRANSITION: return createTransition();
			case crmdPackage.EVENT: return createEvent();
			case crmdPackage.RECONFIGURATIONACTION: return createReconfigurationaction();
			case crmdPackage.NORMAL_STATE: return createNormalState();
			case crmdPackage.INITIAL_STATE: return createInitialState();
			case crmdPackage.FINAL_STATE: return createFinalState();
			case crmdPackage.MAINMAP: return createMainmap();
			case crmdPackage.CONNECTOR: return createConnector();
			case crmdPackage.BASIC_ACTION: return createBasicAction();
			case crmdPackage.MIGRATION: return createMigration();
			case crmdPackage.HORIZONTALSCALING: return createHorizontalscaling();
			case crmdPackage.VERTICALSCALING: return createVerticalscaling();
			case crmdPackage.COMPOSITERECONFIGURATION: return createCompositereconfiguration();
			case crmdPackage.PROVIDER: return createProvider();
			case crmdPackage.AWS: return createAWS();
			case crmdPackage.OPENSTACK: return createOpenstack();
			case crmdPackage.GOOGLE_CLOUD_PLATFORM: return createGoogleCloudPlatform();
			case crmdPackage.ORECHESTRATION_TOOL: return createOrechestrationTool();
			case crmdPackage.GROUP: return createGroup();
			case crmdPackage.TSA: return createTSA();
			case crmdPackage.TTRANSITION: return createTtransition();
			case crmdPackage.TSTATE: return createTstate();
			case crmdPackage.DEPENDENCY: return createDependency();
			case crmdPackage.NORMALTRANSILIEN: return createNormaltransilien();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case crmdPackage.OPERATORTYPE:
				return createOperatortypeFromString(eDataType, initialValue);
			case crmdPackage.PREDICATETYPE:
				return createPredicatetypeFromString(eDataType, initialValue);
			case crmdPackage.DATATYPE:
				return createDatatypeFromString(eDataType, initialValue);
			case crmdPackage.UNITTYPE:
				return createUnittypeFromString(eDataType, initialValue);
			case crmdPackage.ATTRIBUTENAME:
				return createAttributenameFromString(eDataType, initialValue);
			case crmdPackage.CRESOURCETYPE:
				return createC_ResourcetypeFromString(eDataType, initialValue);
			case crmdPackage.LINKTYPE:
				return createLinktypeFromString(eDataType, initialValue);
			case crmdPackage.PROPERTYNAME:
				return createPropertynameFromString(eDataType, initialValue);
			case crmdPackage.FUNCTIONTYPE:
				return createFunctiontypeFromString(eDataType, initialValue);
			case crmdPackage.ORCHESTRATIONTOOLS:
				return createorchestrationtoolsFromString(eDataType, initialValue);
			case crmdPackage.RECONFIGURATIONACTIONTYPE:
				return createReconfigurationactiontypeFromString(eDataType, initialValue);
			case crmdPackage.BASICACTIONNAME:
				return createBasicactionnameFromString(eDataType, initialValue);
			case crmdPackage.MIGRATIONTYPE:
				return createMigrationtypeFromString(eDataType, initialValue);
			case crmdPackage.ADJUSTMENTTYPE:
				return createAdjustmenttypeFromString(eDataType, initialValue);
			case crmdPackage.SCALINGNAMES:
				return createScalingnamesFromString(eDataType, initialValue);
			case crmdPackage.EXECUTIONTYPE:
				return createExecutiontypeFromString(eDataType, initialValue);
			case crmdPackage.WEAKDAYS:
				return createweakdaysFromString(eDataType, initialValue);
			case crmdPackage.EVENTSTYPE:
				return createEventstypeFromString(eDataType, initialValue);
			case crmdPackage.METRICKINDS:
				return createmetrickindsFromString(eDataType, initialValue);
			case crmdPackage.TARGETRESOURCETYPES:
				return createtargetresourcetypesFromString(eDataType, initialValue);
			case crmdPackage.TSSTATETYPE:
				return createtsstatetypeFromString(eDataType, initialValue);
			case crmdPackage.STATETYPE:
				return createstatetypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case crmdPackage.OPERATORTYPE:
				return convertOperatortypeToString(eDataType, instanceValue);
			case crmdPackage.PREDICATETYPE:
				return convertPredicatetypeToString(eDataType, instanceValue);
			case crmdPackage.DATATYPE:
				return convertDatatypeToString(eDataType, instanceValue);
			case crmdPackage.UNITTYPE:
				return convertUnittypeToString(eDataType, instanceValue);
			case crmdPackage.ATTRIBUTENAME:
				return convertAttributenameToString(eDataType, instanceValue);
			case crmdPackage.CRESOURCETYPE:
				return convertC_ResourcetypeToString(eDataType, instanceValue);
			case crmdPackage.LINKTYPE:
				return convertLinktypeToString(eDataType, instanceValue);
			case crmdPackage.PROPERTYNAME:
				return convertPropertynameToString(eDataType, instanceValue);
			case crmdPackage.FUNCTIONTYPE:
				return convertFunctiontypeToString(eDataType, instanceValue);
			case crmdPackage.ORCHESTRATIONTOOLS:
				return convertorchestrationtoolsToString(eDataType, instanceValue);
			case crmdPackage.RECONFIGURATIONACTIONTYPE:
				return convertReconfigurationactiontypeToString(eDataType, instanceValue);
			case crmdPackage.BASICACTIONNAME:
				return convertBasicactionnameToString(eDataType, instanceValue);
			case crmdPackage.MIGRATIONTYPE:
				return convertMigrationtypeToString(eDataType, instanceValue);
			case crmdPackage.ADJUSTMENTTYPE:
				return convertAdjustmenttypeToString(eDataType, instanceValue);
			case crmdPackage.SCALINGNAMES:
				return convertScalingnamesToString(eDataType, instanceValue);
			case crmdPackage.EXECUTIONTYPE:
				return convertExecutiontypeToString(eDataType, instanceValue);
			case crmdPackage.WEAKDAYS:
				return convertweakdaysToString(eDataType, instanceValue);
			case crmdPackage.EVENTSTYPE:
				return convertEventstypeToString(eDataType, instanceValue);
			case crmdPackage.METRICKINDS:
				return convertmetrickindsToString(eDataType, instanceValue);
			case crmdPackage.TARGETRESOURCETYPES:
				return converttargetresourcetypesToString(eDataType, instanceValue);
			case crmdPackage.TSSTATETYPE:
				return converttsstatetypeToString(eDataType, instanceValue);
			case crmdPackage.STATETYPE:
				return convertstatetypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerequirment createResourcerequirment() {
		ResourcerequirmentImpl resourcerequirment = new ResourcerequirmentImpl();
		return resourcerequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cRDM createcRDM() {
		cRDMImpl cRDM = new cRDMImpl();
		return cRDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_Link createC_Link() {
		C_LinkImpl c_Link = new C_LinkImpl();
		return c_Link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atomicresource createAtomicresource() {
		AtomicresourceImpl atomicresource = new AtomicresourceImpl();
		return atomicresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cRDMEntity createcRDMEntity() {
		cRDMEntityImpl cRDMEntity = new cRDMEntityImpl();
		return cRDMEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compositeresource createCompositeresource() {
		CompositeresourceImpl compositeresource = new CompositeresourceImpl();
		return compositeresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_SM createC_SM() {
		C_SMImpl c_SM = new C_SMImpl();
		return c_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudresource createCloudresource() {
		CloudresourceImpl cloudresource = new CloudresourceImpl();
		return cloudresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceconstraint createResourceconstraint() {
		ResourceconstraintImpl resourceconstraint = new ResourceconstraintImpl();
		return resourceconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResourcerequirment createCloudResourcerequirment() {
		CloudResourcerequirmentImpl cloudResourcerequirment = new CloudResourcerequirmentImpl();
		return cloudResourcerequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateResourcerequirment createStateResourcerequirment() {
		StateResourcerequirmentImpl stateResourcerequirment = new StateResourcerequirmentImpl();
		return stateResourcerequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconfigurationaction createReconfigurationaction() {
		ReconfigurationactionImpl reconfigurationaction = new ReconfigurationactionImpl();
		return reconfigurationaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalState createNormalState() {
		NormalStateImpl normalState = new NormalStateImpl();
		return normalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mainmap createMainmap() {
		MainmapImpl mainmap = new MainmapImpl();
		return mainmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAction createBasicAction() {
		BasicActionImpl basicAction = new BasicActionImpl();
		return basicAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migration createMigration() {
		MigrationImpl migration = new MigrationImpl();
		return migration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalscaling createHorizontalscaling() {
		HorizontalscalingImpl horizontalscaling = new HorizontalscalingImpl();
		return horizontalscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verticalscaling createVerticalscaling() {
		VerticalscalingImpl verticalscaling = new VerticalscalingImpl();
		return verticalscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compositereconfiguration createCompositereconfiguration() {
		CompositereconfigurationImpl compositereconfiguration = new CompositereconfigurationImpl();
		return compositereconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWS createAWS() {
		AWSImpl aws = new AWSImpl();
		return aws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openstack createOpenstack() {
		OpenstackImpl openstack = new OpenstackImpl();
		return openstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoogleCloudPlatform createGoogleCloudPlatform() {
		GoogleCloudPlatformImpl googleCloudPlatform = new GoogleCloudPlatformImpl();
		return googleCloudPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrechestrationTool createOrechestrationTool() {
		OrechestrationToolImpl orechestrationTool = new OrechestrationToolImpl();
		return orechestrationTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSA createTSA() {
		TSAImpl tsa = new TSAImpl();
		return tsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ttransition createTtransition() {
		TtransitionImpl ttransition = new TtransitionImpl();
		return ttransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tstate createTstate() {
		TstateImpl tstate = new TstateImpl();
		return tstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Normaltransilien createNormaltransilien() {
		NormaltransilienImpl normaltransilien = new NormaltransilienImpl();
		return normaltransilien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operatortype createOperatortypeFromString(EDataType eDataType, String initialValue) {
		Operatortype result = Operatortype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatortypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicatetype createPredicatetypeFromString(EDataType eDataType, String initialValue) {
		Predicatetype result = Predicatetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredicatetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeFromString(EDataType eDataType, String initialValue) {
		Datatype result = Datatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unittype createUnittypeFromString(EDataType eDataType, String initialValue) {
		Unittype result = Unittype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnittypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributename createAttributenameFromString(EDataType eDataType, String initialValue) {
		Attributename result = Attributename.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributenameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_Resourcetype createC_ResourcetypeFromString(EDataType eDataType, String initialValue) {
		C_Resourcetype result = C_Resourcetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertC_ResourcetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linktype createLinktypeFromString(EDataType eDataType, String initialValue) {
		Linktype result = Linktype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinktypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propertyname createPropertynameFromString(EDataType eDataType, String initialValue) {
		Propertyname result = Propertyname.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertynameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functiontype createFunctiontypeFromString(EDataType eDataType, String initialValue) {
		Functiontype result = Functiontype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctiontypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orchestrationtools createorchestrationtoolsFromString(EDataType eDataType, String initialValue) {
		orchestrationtools result = orchestrationtools.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertorchestrationtoolsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconfigurationactiontype createReconfigurationactiontypeFromString(EDataType eDataType, String initialValue) {
		Reconfigurationactiontype result = Reconfigurationactiontype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconfigurationactiontypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basicactionname createBasicactionnameFromString(EDataType eDataType, String initialValue) {
		Basicactionname result = Basicactionname.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicactionnameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migrationtype createMigrationtypeFromString(EDataType eDataType, String initialValue) {
		Migrationtype result = Migrationtype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMigrationtypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjustmenttype createAdjustmenttypeFromString(EDataType eDataType, String initialValue) {
		Adjustmenttype result = Adjustmenttype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmenttypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalingnames createScalingnamesFromString(EDataType eDataType, String initialValue) {
		Scalingnames result = Scalingnames.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalingnamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executiontype createExecutiontypeFromString(EDataType eDataType, String initialValue) {
		Executiontype result = Executiontype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutiontypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public weakdays createweakdaysFromString(EDataType eDataType, String initialValue) {
		weakdays result = weakdays.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertweakdaysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eventstype createEventstypeFromString(EDataType eDataType, String initialValue) {
		Eventstype result = Eventstype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventstypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metrickinds createmetrickindsFromString(EDataType eDataType, String initialValue) {
		metrickinds result = metrickinds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmetrickindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public targetresourcetypes createtargetresourcetypesFromString(EDataType eDataType, String initialValue) {
		targetresourcetypes result = targetresourcetypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttargetresourcetypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tsstatetype createtsstatetypeFromString(EDataType eDataType, String initialValue) {
		tsstatetype result = tsstatetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttsstatetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statetype createstatetypeFromString(EDataType eDataType, String initialValue) {
		statetype result = statetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstatetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crmdPackage getcrmdPackage() {
		return (crmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static crmdPackage getPackage() {
		return crmdPackage.eINSTANCE;
	}

} //crmdFactoryImpl
