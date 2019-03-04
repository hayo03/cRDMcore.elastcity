/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Adjustmenttype;
import cloudelasticity.crmd.Atomicresource;
import cloudelasticity.crmd.Attribute;
import cloudelasticity.crmd.Attributename;
import cloudelasticity.crmd.BasicAction;
import cloudelasticity.crmd.Basicactionname;
import cloudelasticity.crmd.C_Link;
import cloudelasticity.crmd.C_Resourcetype;
import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.CloudResourcerequirment;
import cloudelasticity.crmd.Cloudresource;
import cloudelasticity.crmd.Compositereconfiguration;
import cloudelasticity.crmd.Compositeresource;
import cloudelasticity.crmd.Connector;
import cloudelasticity.crmd.Datatype;
import cloudelasticity.crmd.Dependency;
import cloudelasticity.crmd.Event;
import cloudelasticity.crmd.Eventstype;
import cloudelasticity.crmd.Executiontype;
import cloudelasticity.crmd.FinalState;
import cloudelasticity.crmd.Functiontype;
import cloudelasticity.crmd.GoogleCloudPlatform;
import cloudelasticity.crmd.Group;
import cloudelasticity.crmd.Horizontalscaling;
import cloudelasticity.crmd.InitialState;
import cloudelasticity.crmd.Linktype;
import cloudelasticity.crmd.Mainmap;
import cloudelasticity.crmd.Migration;
import cloudelasticity.crmd.Migrationtype;
import cloudelasticity.crmd.NormalState;
import cloudelasticity.crmd.Normaltransilien;
import cloudelasticity.crmd.Openstack;
import cloudelasticity.crmd.Operatortype;
import cloudelasticity.crmd.OrechestrationTool;
import cloudelasticity.crmd.Predicatetype;
import cloudelasticity.crmd.Property;
import cloudelasticity.crmd.Propertyname;
import cloudelasticity.crmd.Provider;
import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.Reconfigurationactiontype;
import cloudelasticity.crmd.Resourceconstraint;
import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.Scalingnames;
import cloudelasticity.crmd.State;
import cloudelasticity.crmd.StateResourcerequirment;
import cloudelasticity.crmd.Transition;
import cloudelasticity.crmd.Tstate;
import cloudelasticity.crmd.Ttransition;
import cloudelasticity.crmd.Unittype;
import cloudelasticity.crmd.Verticalscaling;
import cloudelasticity.crmd.cRDM;
import cloudelasticity.crmd.cRDMEntity;
import cloudelasticity.crmd.crmdFactory;
import cloudelasticity.crmd.crmdPackage;
import cloudelasticity.crmd.metrickinds;
import cloudelasticity.crmd.orchestrationtools;
import cloudelasticity.crmd.statetype;
import cloudelasticity.crmd.targetresourcetypes;
import cloudelasticity.crmd.tsstatetype;
import cloudelasticity.crmd.weakdays;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class crmdPackageImpl extends EPackageImpl implements crmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcerequirmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cRDMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c_LinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicresourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cRDMEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeresourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudresourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceconstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudResourcerequirmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateResourcerequirmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalscalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalscalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositereconfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass googleCloudPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orechestrationToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tstateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normaltransilienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatortypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predicatetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unittypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributenameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum c_ResourcetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linktypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertynameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functiontypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orchestrationtoolsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconfigurationactiontypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicactionnameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum migrationtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjustmenttypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scalingnamesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executiontypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weakdaysEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventstypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metrickindsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetresourcetypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tsstatetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statetypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudelasticity.crmd.crmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private crmdPackageImpl() {
		super(eNS_URI, crmdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link crmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static crmdPackage init() {
		if (isInited) return (crmdPackage)EPackage.Registry.INSTANCE.getEPackage(crmdPackage.eNS_URI);

		// Obtain or create and register package
		crmdPackageImpl thecrmdPackage = (crmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof crmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new crmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecrmdPackage.createPackageContents();

		// Initialize created meta-data
		thecrmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecrmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(crmdPackage.eNS_URI, thecrmdPackage);
		return thecrmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcerequirment() {
		return resourcerequirmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerequirment_Name() {
		return (EAttribute)resourcerequirmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcerequirment_Property() {
		return (EReference)resourcerequirmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerequirment_Id() {
		return (EAttribute)resourcerequirmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcRDM() {
		return cRDMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcRDM_Version() {
		return (EAttribute)cRDMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDM_Crdmentity() {
		return (EReference)cRDMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDM_Gc_sm() {
		return (EReference)cRDMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDM_Resourceconstraint() {
		return (EReference)cRDMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDM_Resourcerequirment() {
		return (EReference)cRDMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcRDM_Id() {
		return (EAttribute)cRDMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcRDM_Name() {
		return (EAttribute)cRDMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDM_Provider() {
		return (EReference)cRDMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC_Link() {
		return c_LinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_Link_Source() {
		return (EReference)c_LinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_Link_Target() {
		return (EReference)c_LinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_Link_Type() {
		return (EAttribute)c_LinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicresource() {
		return atomicresourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcRDMEntity() {
		return cRDMEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcRDMEntity_Attribute() {
		return (EReference)cRDMEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcRDMEntity_Id() {
		return (EAttribute)cRDMEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcRDMEntity_Name() {
		return (EAttribute)cRDMEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeresource() {
		return compositeresourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeresource_C_link() {
		return (EReference)compositeresourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeresource_Cloudresource() {
		return (EReference)compositeresourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC_SM() {
		return c_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_SM_Startdate() {
		return (EAttribute)c_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_SM_Enddate() {
		return (EAttribute)c_SMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_SM_Id() {
		return (EAttribute)c_SMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_SM_Name() {
		return (EAttribute)c_SMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Transition() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_State() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Csmrequirment() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Cevent() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Creconfigurationaction() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_CSM_tsa() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Ttcransition() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC_SM_Tcstate() {
		return (EReference)c_SMEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudresource() {
		return cloudresourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudresource_Type() {
		return (EAttribute)cloudresourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudresource_C_sm() {
		return (EReference)cloudresourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudresource_C_rconstraint() {
		return (EReference)cloudresourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudresource_C_rrequirment() {
		return (EReference)cloudresourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudresource_Member() {
		return (EReference)cloudresourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Property() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Operator() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Unit() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Id() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Required() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Id() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Required() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Constraint() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Default() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Description() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceconstraint() {
		return resourceconstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceconstraint_Property() {
		return (EReference)resourceconstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceconstraint_Id() {
		return (EAttribute)resourceconstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceconstraint_Name() {
		return (EAttribute)resourceconstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudResourcerequirment() {
		return cloudResourcerequirmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateResourcerequirment() {
		return stateResourcerequirmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Id() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Isfinal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Isnormal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Characterize() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Tsa() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Type() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Id() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Reconfigurationaction() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Label() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Transitionevent() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Id() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Predicate() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Expression() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Reference_value() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Date() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Weakday() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Function() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Metric() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Operator() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Unit() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Timewindow() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Targetresource() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Typeevent() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Metrickind() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Label() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationaction() {
		return reconfigurationactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Id() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Name() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Cooldown() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Provider() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Type() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Migratename() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Host() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Resource_target() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Adjust() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Attribute_target() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Scalingname() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Adjustment_type() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Baname() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Label() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Action() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Aname() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Attributevalue() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationaction_Execution() {
		return (EAttribute)reconfigurationactionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalState() {
		return normalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainmap() {
		return mainmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainmap_Crdm() {
		return (EReference)mainmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainmap_Connector() {
		return (EReference)mainmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainmap_Provider() {
		return (EReference)mainmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainmap_Orechestrationtool() {
		return (EReference)mainmapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Type() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Targetorchestrationtool() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourcecRDM() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicAction() {
		return basicActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigration() {
		return migrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalscaling() {
		return horizontalscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalscaling() {
		return verticalscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositereconfiguration() {
		return compositereconfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositereconfiguration_Crname() {
		return (EAttribute)compositereconfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositereconfiguration_Reconfigurationaction() {
		return (EReference)compositereconfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositereconfiguration_Actions() {
		return (EAttribute)compositereconfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Name() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Accesskey() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Secretkey() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWS() {
		return awsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstack() {
		return openstackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoogleCloudPlatform() {
		return googleCloudPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrechestrationTool() {
		return orechestrationToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrechestrationTool_Tool() {
		return (EAttribute)orechestrationToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrechestrationTool_Targetresource() {
		return (EAttribute)orechestrationToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Cloudresource() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Resourcerequirment() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Resourceconstraint() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Csm() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSA() {
		return tsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSA_Tstate() {
		return (EReference)tsaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSA_Ttransition() {
		return (EReference)tsaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSA_Name() {
		return (EAttribute)tsaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTtransition() {
		return ttransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTtransition_Tsource() {
		return (EReference)ttransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTtransition_Ttarget() {
		return (EReference)ttransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtransition_Label() {
		return (EAttribute)ttransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTstate() {
		return tstateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTstate_Name() {
		return (EAttribute)tstateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTstate_Type() {
		return (EAttribute)tstateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTstate_Label() {
		return (EAttribute)tstateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormaltransilien() {
		return normaltransilienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatortype() {
		return operatortypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPredicatetype() {
		return predicatetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatype() {
		return datatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnittype() {
		return unittypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributename() {
		return attributenameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getC_Resourcetype() {
		return c_ResourcetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinktype() {
		return linktypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyname() {
		return propertynameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctiontype() {
		return functiontypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getorchestrationtools() {
		return orchestrationtoolsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReconfigurationactiontype() {
		return reconfigurationactiontypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicactionname() {
		return basicactionnameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMigrationtype() {
		return migrationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjustmenttype() {
		return adjustmenttypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScalingnames() {
		return scalingnamesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutiontype() {
		return executiontypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getweakdays() {
		return weakdaysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventstype() {
		return eventstypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmetrickinds() {
		return metrickindsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettargetresourcetypes() {
		return targetresourcetypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettsstatetype() {
		return tsstatetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstatetype() {
		return statetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crmdFactory getcrmdFactory() {
		return (crmdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourcerequirmentEClass = createEClass(RESOURCEREQUIRMENT);
		createEAttribute(resourcerequirmentEClass, RESOURCEREQUIRMENT__NAME);
		createEReference(resourcerequirmentEClass, RESOURCEREQUIRMENT__PROPERTY);
		createEAttribute(resourcerequirmentEClass, RESOURCEREQUIRMENT__ID);

		cRDMEClass = createEClass(CRDM);
		createEAttribute(cRDMEClass, CRDM__VERSION);
		createEReference(cRDMEClass, CRDM__CRDMENTITY);
		createEReference(cRDMEClass, CRDM__GC_SM);
		createEReference(cRDMEClass, CRDM__RESOURCECONSTRAINT);
		createEReference(cRDMEClass, CRDM__RESOURCEREQUIRMENT);
		createEAttribute(cRDMEClass, CRDM__ID);
		createEAttribute(cRDMEClass, CRDM__NAME);
		createEReference(cRDMEClass, CRDM__PROVIDER);

		c_LinkEClass = createEClass(CLINK);
		createEReference(c_LinkEClass, CLINK__SOURCE);
		createEReference(c_LinkEClass, CLINK__TARGET);
		createEAttribute(c_LinkEClass, CLINK__TYPE);

		atomicresourceEClass = createEClass(ATOMICRESOURCE);

		cRDMEntityEClass = createEClass(CRDM_ENTITY);
		createEReference(cRDMEntityEClass, CRDM_ENTITY__ATTRIBUTE);
		createEAttribute(cRDMEntityEClass, CRDM_ENTITY__ID);
		createEAttribute(cRDMEntityEClass, CRDM_ENTITY__NAME);

		compositeresourceEClass = createEClass(COMPOSITERESOURCE);
		createEReference(compositeresourceEClass, COMPOSITERESOURCE__CLINK);
		createEReference(compositeresourceEClass, COMPOSITERESOURCE__CLOUDRESOURCE);

		c_SMEClass = createEClass(CSM);
		createEAttribute(c_SMEClass, CSM__STARTDATE);
		createEAttribute(c_SMEClass, CSM__ENDDATE);
		createEAttribute(c_SMEClass, CSM__ID);
		createEAttribute(c_SMEClass, CSM__NAME);
		createEReference(c_SMEClass, CSM__TRANSITION);
		createEReference(c_SMEClass, CSM__STATE);
		createEReference(c_SMEClass, CSM__CSMREQUIRMENT);
		createEReference(c_SMEClass, CSM__CEVENT);
		createEReference(c_SMEClass, CSM__CRECONFIGURATIONACTION);
		createEReference(c_SMEClass, CSM__CSM_TSA);
		createEReference(c_SMEClass, CSM__TTCRANSITION);
		createEReference(c_SMEClass, CSM__TCSTATE);

		cloudresourceEClass = createEClass(CLOUDRESOURCE);
		createEAttribute(cloudresourceEClass, CLOUDRESOURCE__TYPE);
		createEReference(cloudresourceEClass, CLOUDRESOURCE__CSM);
		createEReference(cloudresourceEClass, CLOUDRESOURCE__CRCONSTRAINT);
		createEReference(cloudresourceEClass, CLOUDRESOURCE__CRREQUIRMENT);
		createEReference(cloudresourceEClass, CLOUDRESOURCE__MEMBER);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__OPERATOR);
		createEAttribute(propertyEClass, PROPERTY__UNIT);
		createEAttribute(propertyEClass, PROPERTY__ID);
		createEAttribute(propertyEClass, PROPERTY__REQUIRED);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__ID);
		createEAttribute(attributeEClass, ATTRIBUTE__REQUIRED);
		createEAttribute(attributeEClass, ATTRIBUTE__CONSTRAINT);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__DESCRIPTION);

		resourceconstraintEClass = createEClass(RESOURCECONSTRAINT);
		createEReference(resourceconstraintEClass, RESOURCECONSTRAINT__PROPERTY);
		createEAttribute(resourceconstraintEClass, RESOURCECONSTRAINT__ID);
		createEAttribute(resourceconstraintEClass, RESOURCECONSTRAINT__NAME);

		cloudResourcerequirmentEClass = createEClass(CLOUD_RESOURCEREQUIRMENT);

		stateResourcerequirmentEClass = createEClass(STATE_RESOURCEREQUIRMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__ID);
		createEAttribute(stateEClass, STATE__ISFINAL);
		createEAttribute(stateEClass, STATE__ISNORMAL);
		createEReference(stateEClass, STATE__CHARACTERIZE);
		createEReference(stateEClass, STATE__TSA);
		createEAttribute(stateEClass, STATE__TYPE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEAttribute(transitionEClass, TRANSITION__ID);
		createEReference(transitionEClass, TRANSITION__RECONFIGURATIONACTION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__TRANSITIONEVENT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__ID);
		createEAttribute(eventEClass, EVENT__NAME);
		createEAttribute(eventEClass, EVENT__PREDICATE);
		createEAttribute(eventEClass, EVENT__EXPRESSION);
		createEAttribute(eventEClass, EVENT__REFERENCE_VALUE);
		createEAttribute(eventEClass, EVENT__DATE);
		createEAttribute(eventEClass, EVENT__WEAKDAY);
		createEAttribute(eventEClass, EVENT__FUNCTION);
		createEAttribute(eventEClass, EVENT__METRIC);
		createEAttribute(eventEClass, EVENT__OPERATOR);
		createEAttribute(eventEClass, EVENT__UNIT);
		createEAttribute(eventEClass, EVENT__TIMEWINDOW);
		createEAttribute(eventEClass, EVENT__TARGETRESOURCE);
		createEAttribute(eventEClass, EVENT__TYPEEVENT);
		createEAttribute(eventEClass, EVENT__METRICKIND);
		createEAttribute(eventEClass, EVENT__LABEL);

		reconfigurationactionEClass = createEClass(RECONFIGURATIONACTION);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ID);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__NAME);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__COOLDOWN);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__PROVIDER);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__TYPE);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__MIGRATENAME);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__HOST);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__RESOURCE_TARGET);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ADJUST);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ATTRIBUTE_TARGET);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__SCALINGNAME);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ADJUSTMENT_TYPE);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__BANAME);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__LABEL);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ACTION);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ANAME);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__ATTRIBUTEVALUE);
		createEAttribute(reconfigurationactionEClass, RECONFIGURATIONACTION__EXECUTION);

		normalStateEClass = createEClass(NORMAL_STATE);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		mainmapEClass = createEClass(MAINMAP);
		createEReference(mainmapEClass, MAINMAP__CRDM);
		createEReference(mainmapEClass, MAINMAP__CONNECTOR);
		createEReference(mainmapEClass, MAINMAP__PROVIDER);
		createEReference(mainmapEClass, MAINMAP__ORECHESTRATIONTOOL);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__TARGETORCHESTRATIONTOOL);
		createEReference(connectorEClass, CONNECTOR__SOURCEC_RDM);

		basicActionEClass = createEClass(BASIC_ACTION);

		migrationEClass = createEClass(MIGRATION);

		horizontalscalingEClass = createEClass(HORIZONTALSCALING);

		verticalscalingEClass = createEClass(VERTICALSCALING);

		compositereconfigurationEClass = createEClass(COMPOSITERECONFIGURATION);
		createEAttribute(compositereconfigurationEClass, COMPOSITERECONFIGURATION__CRNAME);
		createEReference(compositereconfigurationEClass, COMPOSITERECONFIGURATION__RECONFIGURATIONACTION);
		createEAttribute(compositereconfigurationEClass, COMPOSITERECONFIGURATION__ACTIONS);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__NAME);
		createEAttribute(providerEClass, PROVIDER__ACCESSKEY);
		createEAttribute(providerEClass, PROVIDER__SECRETKEY);

		awsEClass = createEClass(AWS);

		openstackEClass = createEClass(OPENSTACK);

		googleCloudPlatformEClass = createEClass(GOOGLE_CLOUD_PLATFORM);

		orechestrationToolEClass = createEClass(ORECHESTRATION_TOOL);
		createEAttribute(orechestrationToolEClass, ORECHESTRATION_TOOL__TOOL);
		createEAttribute(orechestrationToolEClass, ORECHESTRATION_TOOL__TARGETRESOURCE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__CLOUDRESOURCE);
		createEReference(groupEClass, GROUP__RESOURCEREQUIRMENT);
		createEReference(groupEClass, GROUP__RESOURCECONSTRAINT);
		createEReference(groupEClass, GROUP__CSM);

		tsaEClass = createEClass(TSA);
		createEReference(tsaEClass, TSA__TSTATE);
		createEReference(tsaEClass, TSA__TTRANSITION);
		createEAttribute(tsaEClass, TSA__NAME);

		ttransitionEClass = createEClass(TTRANSITION);
		createEReference(ttransitionEClass, TTRANSITION__TSOURCE);
		createEReference(ttransitionEClass, TTRANSITION__TTARGET);
		createEAttribute(ttransitionEClass, TTRANSITION__LABEL);

		tstateEClass = createEClass(TSTATE);
		createEAttribute(tstateEClass, TSTATE__NAME);
		createEAttribute(tstateEClass, TSTATE__TYPE);
		createEAttribute(tstateEClass, TSTATE__LABEL);

		dependencyEClass = createEClass(DEPENDENCY);

		normaltransilienEClass = createEClass(NORMALTRANSILIEN);

		// Create enums
		operatortypeEEnum = createEEnum(OPERATORTYPE);
		predicatetypeEEnum = createEEnum(PREDICATETYPE);
		datatypeEEnum = createEEnum(DATATYPE);
		unittypeEEnum = createEEnum(UNITTYPE);
		attributenameEEnum = createEEnum(ATTRIBUTENAME);
		c_ResourcetypeEEnum = createEEnum(CRESOURCETYPE);
		linktypeEEnum = createEEnum(LINKTYPE);
		propertynameEEnum = createEEnum(PROPERTYNAME);
		functiontypeEEnum = createEEnum(FUNCTIONTYPE);
		orchestrationtoolsEEnum = createEEnum(ORCHESTRATIONTOOLS);
		reconfigurationactiontypeEEnum = createEEnum(RECONFIGURATIONACTIONTYPE);
		basicactionnameEEnum = createEEnum(BASICACTIONNAME);
		migrationtypeEEnum = createEEnum(MIGRATIONTYPE);
		adjustmenttypeEEnum = createEEnum(ADJUSTMENTTYPE);
		scalingnamesEEnum = createEEnum(SCALINGNAMES);
		executiontypeEEnum = createEEnum(EXECUTIONTYPE);
		weakdaysEEnum = createEEnum(WEAKDAYS);
		eventstypeEEnum = createEEnum(EVENTSTYPE);
		metrickindsEEnum = createEEnum(METRICKINDS);
		targetresourcetypesEEnum = createEEnum(TARGETRESOURCETYPES);
		tsstatetypeEEnum = createEEnum(TSSTATETYPE);
		statetypeEEnum = createEEnum(STATETYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		c_LinkEClass.getESuperTypes().add(this.getcRDMEntity());
		atomicresourceEClass.getESuperTypes().add(this.getCloudresource());
		compositeresourceEClass.getESuperTypes().add(this.getCloudresource());
		cloudresourceEClass.getESuperTypes().add(this.getcRDMEntity());
		cloudResourcerequirmentEClass.getESuperTypes().add(this.getResourcerequirment());
		stateResourcerequirmentEClass.getESuperTypes().add(this.getResourcerequirment());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());
		basicActionEClass.getESuperTypes().add(this.getReconfigurationaction());
		migrationEClass.getESuperTypes().add(this.getReconfigurationaction());
		horizontalscalingEClass.getESuperTypes().add(this.getReconfigurationaction());
		verticalscalingEClass.getESuperTypes().add(this.getReconfigurationaction());
		compositereconfigurationEClass.getESuperTypes().add(this.getReconfigurationaction());
		awsEClass.getESuperTypes().add(this.getProvider());
		openstackEClass.getESuperTypes().add(this.getProvider());
		googleCloudPlatformEClass.getESuperTypes().add(this.getProvider());
		groupEClass.getESuperTypes().add(this.getcRDMEntity());
		dependencyEClass.getESuperTypes().add(this.getTtransition());
		normaltransilienEClass.getESuperTypes().add(this.getTtransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourcerequirmentEClass, Resourcerequirment.class, "Resourcerequirment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcerequirment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resourcerequirment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcerequirment_Property(), this.getProperty(), null, "property", null, 1, -1, Resourcerequirment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcerequirment_Id(), ecorePackage.getEString(), "id", null, 0, 1, Resourcerequirment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cRDMEClass, cRDM.class, "cRDM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcRDM_Version(), ecorePackage.getEString(), "version", null, 0, 1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcRDM_Crdmentity(), this.getcRDMEntity(), null, "crdmentity", null, 0, -1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcRDM_Gc_sm(), this.getC_SM(), null, "gc_sm", null, 0, -1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcRDM_Resourceconstraint(), this.getResourceconstraint(), null, "resourceconstraint", null, 0, -1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcRDM_Resourcerequirment(), this.getResourcerequirment(), null, "resourcerequirment", null, 0, -1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcRDM_Id(), ecorePackage.getEString(), "id", null, 0, 1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcRDM_Name(), ecorePackage.getEString(), "name", null, 0, 1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcRDM_Provider(), this.getProvider(), null, "provider", null, 0, -1, cRDM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c_LinkEClass, C_Link.class, "C_Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getC_Link_Source(), this.getCloudresource(), null, "source", null, 1, 1, C_Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_Link_Target(), this.getCloudresource(), null, "target", null, 0, -1, C_Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_Link_Type(), this.getLinktype(), "type", null, 0, 1, C_Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicresourceEClass, Atomicresource.class, "Atomicresource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cRDMEntityEClass, cRDMEntity.class, "cRDMEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcRDMEntity_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, cRDMEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcRDMEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, cRDMEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcRDMEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, cRDMEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeresourceEClass, Compositeresource.class, "Compositeresource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeresource_C_link(), this.getC_Link(), null, "c_link", null, 0, -1, Compositeresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeresource_Cloudresource(), this.getCloudresource(), null, "cloudresource", null, 0, -1, Compositeresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c_SMEClass, C_SM.class, "C_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_SM_Startdate(), ecorePackage.getEString(), "startdate", null, 0, 1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_SM_Enddate(), ecorePackage.getEString(), "enddate", null, 0, 1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_SM_Id(), ecorePackage.getEString(), "id", null, 0, 1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_SM_Name(), ecorePackage.getEString(), "name", null, 0, 1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Transition(), this.getTransition(), null, "transition", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_State(), this.getState(), null, "state", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Csmrequirment(), this.getResourcerequirment(), null, "csmrequirment", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Cevent(), this.getEvent(), null, "cevent", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Creconfigurationaction(), this.getReconfigurationaction(), null, "creconfigurationaction", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_CSM_tsa(), this.getTSA(), null, "CSM_tsa", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Ttcransition(), this.getTtransition(), null, "ttcransition", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_SM_Tcstate(), this.getTstate(), null, "tcstate", null, 0, -1, C_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudresourceEClass, Cloudresource.class, "Cloudresource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudresource_Type(), this.getC_Resourcetype(), "type", null, 0, 1, Cloudresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudresource_C_sm(), this.getC_SM(), null, "c_sm", null, 0, -1, Cloudresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudresource_C_rconstraint(), this.getResourceconstraint(), null, "c_rconstraint", null, 0, 1, Cloudresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudresource_C_rrequirment(), this.getResourcerequirment(), null, "c_rrequirment", null, 0, 1, Cloudresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudresource_Member(), this.getGroup(), null, "member", null, 0, -1, Cloudresource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), this.getDatatype(), "type", "define data type", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Operator(), this.getOperatortype(), "operator", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Unit(), this.getUnittype(), "unit", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Id(), ecorePackage.getEString(), "id", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Required(), ecorePackage.getEBoolean(), "required", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Default(), ecorePackage.getEString(), "default", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Id(), ecorePackage.getEString(), "id", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Required(), ecorePackage.getEBoolean(), "required", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Default(), ecorePackage.getEString(), "default", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getDatatype(), "type", "define data type", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceconstraintEClass, Resourceconstraint.class, "Resourceconstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceconstraint_Property(), this.getProperty(), null, "property", null, 1, -1, Resourceconstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceconstraint_Id(), ecorePackage.getEString(), "id", null, 0, 1, Resourceconstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceconstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resourceconstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudResourcerequirmentEClass, CloudResourcerequirment.class, "CloudResourcerequirment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateResourcerequirmentEClass, StateResourcerequirment.class, "StateResourcerequirment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEString(), "id", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Isfinal(), ecorePackage.getEBoolean(), "isfinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Isnormal(), ecorePackage.getEBoolean(), "isnormal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Characterize(), this.getResourcerequirment(), null, "characterize", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Tsa(), this.getTSA(), null, "tsa", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Type(), this.getstatetype(), "type", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Id(), ecorePackage.getEString(), "id", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Reconfigurationaction(), this.getReconfigurationaction(), null, "reconfigurationaction", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Transitionevent(), this.getEvent(), null, "transitionevent", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Id(), ecorePackage.getEString(), "id", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Predicate(), this.getPredicatetype(), "predicate", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Reference_value(), ecorePackage.getEString(), "reference_value", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Weakday(), this.getweakdays(), "weakday", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Function(), this.getFunctiontype(), "Function", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Metric(), this.getPropertyname(), "metric", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Operator(), this.getOperatortype(), "Operator", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Unit(), this.getUnittype(), "unit", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Timewindow(), ecorePackage.getEString(), "timewindow", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Targetresource(), ecorePackage.getEString(), "targetresource", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Typeevent(), this.getEventstype(), "typeevent", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Metrickind(), this.getmetrickinds(), "metrickind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Label(), ecorePackage.getEString(), "label", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationactionEClass, Reconfigurationaction.class, "Reconfigurationaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationaction_Id(), ecorePackage.getEString(), "id", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Cooldown(), theXMLTypePackage.getInt(), "Cooldown", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Provider(), ecorePackage.getEString(), "Provider", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Type(), this.getMigrationtype(), "type", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Migratename(), ecorePackage.getEString(), "migratename", "migrate", 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Host(), ecorePackage.getEString(), "host", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Resource_target(), ecorePackage.getEString(), "resource_target", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Adjust(), ecorePackage.getEInt(), "Adjust", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Attribute_target(), this.getAttributename(), "Attribute_target", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Scalingname(), this.getScalingnames(), "scalingname", "scalein", 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Adjustment_type(), this.getAdjustmenttype(), "adjustment_type", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Baname(), this.getBasicactionname(), "baname", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Label(), ecorePackage.getEString(), "label", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Action(), this.getReconfigurationactiontype(), "action", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Aname(), ecorePackage.getEString(), "aname", "update", 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Attributevalue(), ecorePackage.getEString(), "attributevalue", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationaction_Execution(), this.getExecutiontype(), "execution", null, 0, 1, Reconfigurationaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainmapEClass, Mainmap.class, "Mainmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainmap_Crdm(), this.getcRDM(), null, "crdm", null, 0, -1, Mainmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainmap_Connector(), this.getConnector(), null, "connector", null, 0, -1, Mainmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainmap_Provider(), this.getProvider(), null, "provider", null, 0, -1, Mainmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainmap_Orechestrationtool(), this.getOrechestrationTool(), null, "orechestrationtool", null, 0, -1, Mainmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Type(), this.gettargetresourcetypes(), "type", "XaaS", 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Targetorchestrationtool(), this.getOrechestrationTool(), null, "targetorchestrationtool", null, 1, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SourcecRDM(), this.getcRDM(), null, "sourcecRDM", null, 1, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicActionEClass, BasicAction.class, "BasicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(migrationEClass, Migration.class, "Migration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalscalingEClass, Horizontalscaling.class, "Horizontalscaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verticalscalingEClass, Verticalscaling.class, "Verticalscaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositereconfigurationEClass, Compositereconfiguration.class, "Compositereconfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositereconfiguration_Crname(), ecorePackage.getEString(), "crname", "", 0, 1, Compositereconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositereconfiguration_Reconfigurationaction(), this.getReconfigurationaction(), null, "reconfigurationaction", null, 0, -1, Compositereconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositereconfiguration_Actions(), ecorePackage.getEString(), "actions", null, 0, 1, Compositereconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_Accesskey(), ecorePackage.getEString(), "accesskey", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_Secretkey(), ecorePackage.getEString(), "secretkey", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsEClass, cloudelasticity.crmd.AWS.class, "AWS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openstackEClass, Openstack.class, "Openstack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(googleCloudPlatformEClass, GoogleCloudPlatform.class, "GoogleCloudPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orechestrationToolEClass, OrechestrationTool.class, "OrechestrationTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrechestrationTool_Tool(), this.getorchestrationtools(), "tool", null, 0, 1, OrechestrationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrechestrationTool_Targetresource(), this.gettargetresourcetypes(), "targetresource", null, 0, 1, OrechestrationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Cloudresource(), this.getCloudresource(), null, "cloudresource", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Resourcerequirment(), this.getResourcerequirment(), null, "resourcerequirment", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Resourceconstraint(), this.getResourceconstraint(), null, "resourceconstraint", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Csm(), this.getC_SM(), null, "csm", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsaEClass, cloudelasticity.crmd.TSA.class, "TSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSA_Tstate(), this.getTstate(), null, "tstate", null, 0, -1, cloudelasticity.crmd.TSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSA_Ttransition(), this.getTtransition(), null, "ttransition", null, 0, -1, cloudelasticity.crmd.TSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSA_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, cloudelasticity.crmd.TSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttransitionEClass, Ttransition.class, "Ttransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtransition_Tsource(), this.getTstate(), null, "tsource", null, 1, 1, Ttransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTtransition_Ttarget(), this.getTstate(), null, "ttarget", null, 1, 1, Ttransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtransition_Label(), ecorePackage.getEString(), "label", null, 0, 1, Ttransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tstateEClass, Tstate.class, "Tstate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTstate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTstate_Type(), this.gettsstatetype(), "type", null, 0, 1, Tstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTstate_Label(), ecorePackage.getEString(), "label", null, 0, 1, Tstate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normaltransilienEClass, Normaltransilien.class, "Normaltransilien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatortypeEEnum, Operatortype.class, "Operatortype");
		addEEnumLiteral(operatortypeEEnum, Operatortype.GREATOR_THAN);
		addEEnumLiteral(operatortypeEEnum, Operatortype.GREATER_THANOR_EQUAL);
		addEEnumLiteral(operatortypeEEnum, Operatortype.LESS_THANOR_EQUAL);
		addEEnumLiteral(operatortypeEEnum, Operatortype.LESS_THAN);
		addEEnumLiteral(operatortypeEEnum, Operatortype.BELONG);
		addEEnumLiteral(operatortypeEEnum, Operatortype.EQUAL);

		initEEnum(predicatetypeEEnum, Predicatetype.class, "Predicatetype");
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.DEFAULT);
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.TS_EVENT);
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.TP_EVENT);
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.QEVENT);
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.UEVENT);
		addEEnumLiteral(predicatetypeEEnum, Predicatetype.MEVENT);

		initEEnum(datatypeEEnum, Datatype.class, "Datatype");
		addEEnumLiteral(datatypeEEnum, Datatype.DEFAULT);

		initEEnum(unittypeEEnum, Unittype.class, "Unittype");
		addEEnumLiteral(unittypeEEnum, Unittype.DEFAULT);
		addEEnumLiteral(unittypeEEnum, Unittype.PERCENTAGE);
		addEEnumLiteral(unittypeEEnum, Unittype.EUROS);
		addEEnumLiteral(unittypeEEnum, Unittype.SECONDS);
		addEEnumLiteral(unittypeEEnum, Unittype.HOURS);
		addEEnumLiteral(unittypeEEnum, Unittype.MINUTES);

		initEEnum(attributenameEEnum, Attributename.class, "Attributename");
		addEEnumLiteral(attributenameEEnum, Attributename.DEFAULT);
		addEEnumLiteral(attributenameEEnum, Attributename.OPERATING_SYSTEM);
		addEEnumLiteral(attributenameEEnum, Attributename.PROVIDER);
		addEEnumLiteral(attributenameEEnum, Attributename.SHARING);
		addEEnumLiteral(attributenameEEnum, Attributename.SPEED);
		addEEnumLiteral(attributenameEEnum, Attributename.LOCATION);
		addEEnumLiteral(attributenameEEnum, Attributename.CPU);
		addEEnumLiteral(attributenameEEnum, Attributename.MEMORY);
		addEEnumLiteral(attributenameEEnum, Attributename.INSTANCES);
		addEEnumLiteral(attributenameEEnum, Attributename.ARCHITECTURE);
		addEEnumLiteral(attributenameEEnum, Attributename.STORAGE);

		initEEnum(c_ResourcetypeEEnum, C_Resourcetype.class, "C_Resourcetype");
		addEEnumLiteral(c_ResourcetypeEEnum, C_Resourcetype.DEFAULT);
		addEEnumLiteral(c_ResourcetypeEEnum, C_Resourcetype.APPLICATION);
		addEEnumLiteral(c_ResourcetypeEEnum, C_Resourcetype.DATABASE);
		addEEnumLiteral(c_ResourcetypeEEnum, C_Resourcetype.CONTAINER);

		initEEnum(linktypeEEnum, Linktype.class, "Linktype");
		addEEnumLiteral(linktypeEEnum, Linktype.DEFAULT);
		addEEnumLiteral(linktypeEEnum, Linktype.DEPENDENCY);
		addEEnumLiteral(linktypeEEnum, Linktype.STORAGE);
		addEEnumLiteral(linktypeEEnum, Linktype.COMMUNICATION);
		addEEnumLiteral(linktypeEEnum, Linktype.CONTAINMENT);
		addEEnumLiteral(linktypeEEnum, Linktype.HOSTING);
		addEEnumLiteral(linktypeEEnum, Linktype.INSTANTIATION);

		initEEnum(propertynameEEnum, Propertyname.class, "Propertyname");
		addEEnumLiteral(propertynameEEnum, Propertyname.DEFAULT);
		addEEnumLiteral(propertynameEEnum, Propertyname.BANDWIDTHUSAGE);
		addEEnumLiteral(propertynameEEnum, Propertyname.STORAGERESILIENCE);
		addEEnumLiteral(propertynameEEnum, Propertyname.PUBLIC_NETWORK_INCOMING_MBPS);
		addEEnumLiteral(propertynameEEnum, Propertyname.COST);
		addEEnumLiteral(propertynameEEnum, Propertyname.THROUGHPUT);
		addEEnumLiteral(propertynameEEnum, Propertyname.AVAILABILITY);
		addEEnumLiteral(propertynameEEnum, Propertyname.CP_UUSAGE);
		addEEnumLiteral(propertynameEEnum, Propertyname.ACCURACY);
		addEEnumLiteral(propertynameEEnum, Propertyname.RESPONSE_TIME);
		addEEnumLiteral(propertynameEEnum, Propertyname.RA_MUSAGE);
		addEEnumLiteral(propertynameEEnum, Propertyname.LATENCY);

		initEEnum(functiontypeEEnum, Functiontype.class, "Functiontype");
		addEEnumLiteral(functiontypeEEnum, Functiontype.DEFAULT);
		addEEnumLiteral(functiontypeEEnum, Functiontype.MAXIMUM);
		addEEnumLiteral(functiontypeEEnum, Functiontype.AVERAGE);
		addEEnumLiteral(functiontypeEEnum, Functiontype.MINIMUM);

		initEEnum(orchestrationtoolsEEnum, orchestrationtools.class, "orchestrationtools");
		addEEnumLiteral(orchestrationtoolsEEnum, orchestrationtools.DOCKER);
		addEEnumLiteral(orchestrationtoolsEEnum, orchestrationtools.TERRAFORM);
		addEEnumLiteral(orchestrationtoolsEEnum, orchestrationtools.KUBERNETES);
		addEEnumLiteral(orchestrationtoolsEEnum, orchestrationtools.ANSIBLE);

		initEEnum(reconfigurationactiontypeEEnum, Reconfigurationactiontype.class, "Reconfigurationactiontype");
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.DEFAULT);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.BASICACTION);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.MIGRATION);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.HORIZONTALSCALING);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.VERTICALSCALING);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.APPLICATIONRECONFIGURATION);
		addEEnumLiteral(reconfigurationactiontypeEEnum, Reconfigurationactiontype.COMPOSITERECONFIGURATION);

		initEEnum(basicactionnameEEnum, Basicactionname.class, "Basicactionname");
		addEEnumLiteral(basicactionnameEEnum, Basicactionname.START);
		addEEnumLiteral(basicactionnameEEnum, Basicactionname.STOP);
		addEEnumLiteral(basicactionnameEEnum, Basicactionname.RESTART);
		addEEnumLiteral(basicactionnameEEnum, Basicactionname.DELETE);

		initEEnum(migrationtypeEEnum, Migrationtype.class, "Migrationtype");
		addEEnumLiteral(migrationtypeEEnum, Migrationtype.COLD);
		addEEnumLiteral(migrationtypeEEnum, Migrationtype.HOT);

		initEEnum(adjustmenttypeEEnum, Adjustmenttype.class, "Adjustmenttype");
		addEEnumLiteral(adjustmenttypeEEnum, Adjustmenttype.DEFAULT);
		addEEnumLiteral(adjustmenttypeEEnum, Adjustmenttype.EXACTCAPACITY);
		addEEnumLiteral(adjustmenttypeEEnum, Adjustmenttype.PERCENTCHANGEINCAPACITY);
		addEEnumLiteral(adjustmenttypeEEnum, Adjustmenttype.CHANGEINCAPACITY);

		initEEnum(scalingnamesEEnum, Scalingnames.class, "Scalingnames");
		addEEnumLiteral(scalingnamesEEnum, Scalingnames.SCALEIN);
		addEEnumLiteral(scalingnamesEEnum, Scalingnames.SCALEOUT);
		addEEnumLiteral(scalingnamesEEnum, Scalingnames.SCALEUP);
		addEEnumLiteral(scalingnamesEEnum, Scalingnames.SCALEDOWN);

		initEEnum(executiontypeEEnum, Executiontype.class, "Executiontype");
		addEEnumLiteral(executiontypeEEnum, Executiontype.SEQUENTIAL);
		addEEnumLiteral(executiontypeEEnum, Executiontype.PARALLEL);

		initEEnum(weakdaysEEnum, weakdays.class, "weakdays");
		addEEnumLiteral(weakdaysEEnum, weakdays.MONDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.TUESDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.WEDNESDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.THURSDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.FRIDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.SATURDAY);
		addEEnumLiteral(weakdaysEEnum, weakdays.SUNDAY);

		initEEnum(eventstypeEEnum, Eventstype.class, "Eventstype");
		addEEnumLiteral(eventstypeEEnum, Eventstype.TEMPORAL_EVENT);
		addEEnumLiteral(eventstypeEEnum, Eventstype.MARKET_RELATED_EVENT);
		addEEnumLiteral(eventstypeEEnum, Eventstype.USER_EVENT);
		addEEnumLiteral(eventstypeEEnum, Eventstype.RESOURCE_USAGE_EVENT);
		addEEnumLiteral(eventstypeEEnum, Eventstype.COMPOSITEEVENT);

		initEEnum(metrickindsEEnum, metrickinds.class, "metrickinds");
		addEEnumLiteral(metrickindsEEnum, metrickinds.MEASURABLE);
		addEEnumLiteral(metrickindsEEnum, metrickinds.ABSTRACT);

		initEEnum(targetresourcetypesEEnum, targetresourcetypes.class, "targetresourcetypes");
		addEEnumLiteral(targetresourcetypesEEnum, targetresourcetypes.XAA_S);
		addEEnumLiteral(targetresourcetypesEEnum, targetresourcetypes.IAA_S);
		addEEnumLiteral(targetresourcetypesEEnum, targetresourcetypes.PAA_S);
		addEEnumLiteral(targetresourcetypesEEnum, targetresourcetypes.SAA_S);

		initEEnum(tsstatetypeEEnum, tsstatetype.class, "tsstatetype");
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.INITIAL);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.ACTIVE);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.COMPLETED);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.CANCELLED);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.FAILED);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.COMPENSATED);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.INTERMEDIATE);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.FINAL);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.ACCEPTEDTERMINATION);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.VALIDTERMINATION);
		addEEnumLiteral(tsstatetypeEEnum, tsstatetype.NON_VALIDTERMINATION);

		initEEnum(statetypeEEnum, statetype.class, "statetype");
		addEEnumLiteral(statetypeEEnum, statetype.INITIAL);
		addEEnumLiteral(statetypeEEnum, statetype.INTERMEDIATE);
		addEEnumLiteral(statetypeEEnum, statetype.FINAL);

		// Create resource
		createResource(eNS_URI);
	}

} //crmdPackageImpl
