/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdFactory
 * @model kind="package"
 * @generated
 */
public interface crmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/crmd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	crmdPackage eINSTANCE = cloudelasticity.crmd.impl.crmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.ResourcerequirmentImpl <em>Resourcerequirment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.ResourcerequirmentImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getResourcerequirment()
	 * @generated
	 */
	int RESOURCEREQUIRMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEREQUIRMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEREQUIRMENT__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEREQUIRMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEREQUIRMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEREQUIRMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.cRDMImpl <em>cRDM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.cRDMImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getcRDM()
	 * @generated
	 */
	int CRDM = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Crdmentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__CRDMENTITY = 1;

	/**
	 * The feature id for the '<em><b>Gc sm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__GC_SM = 2;

	/**
	 * The feature id for the '<em><b>Resourceconstraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__RESOURCECONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Resourcerequirment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__RESOURCEREQUIRMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__NAME = 6;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM__PROVIDER = 7;

	/**
	 * The number of structural features of the '<em>cRDM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>cRDM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.cRDMEntityImpl <em>cRDM Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.cRDMEntityImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getcRDMEntity()
	 * @generated
	 */
	int CRDM_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_ENTITY__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_ENTITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>cRDM Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>cRDM Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRDM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.C_LinkImpl <em>CLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.C_LinkImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_Link()
	 * @generated
	 */
	int CLINK = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__ATTRIBUTE = CRDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__ID = CRDM_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__NAME = CRDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__SOURCE = CRDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__TARGET = CRDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK__TYPE = CRDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK_FEATURE_COUNT = CRDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINK_OPERATION_COUNT = CRDM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.CloudresourceImpl <em>Cloudresource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.CloudresourceImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCloudresource()
	 * @generated
	 */
	int CLOUDRESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__ATTRIBUTE = CRDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__ID = CRDM_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__NAME = CRDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__TYPE = CRDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__CSM = CRDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__CRCONSTRAINT = CRDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crrequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__CRREQUIRMENT = CRDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE__MEMBER = CRDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cloudresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE_FEATURE_COUNT = CRDM_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cloudresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDRESOURCE_OPERATION_COUNT = CRDM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.AtomicresourceImpl <em>Atomicresource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.AtomicresourceImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAtomicresource()
	 * @generated
	 */
	int ATOMICRESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__ATTRIBUTE = CLOUDRESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__ID = CLOUDRESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__NAME = CLOUDRESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__TYPE = CLOUDRESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Csm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__CSM = CLOUDRESOURCE__CSM;

	/**
	 * The feature id for the '<em><b>Crconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__CRCONSTRAINT = CLOUDRESOURCE__CRCONSTRAINT;

	/**
	 * The feature id for the '<em><b>Crrequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__CRREQUIRMENT = CLOUDRESOURCE__CRREQUIRMENT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE__MEMBER = CLOUDRESOURCE__MEMBER;

	/**
	 * The number of structural features of the '<em>Atomicresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE_FEATURE_COUNT = CLOUDRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomicresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMICRESOURCE_OPERATION_COUNT = CLOUDRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.CompositeresourceImpl <em>Compositeresource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.CompositeresourceImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCompositeresource()
	 * @generated
	 */
	int COMPOSITERESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__ATTRIBUTE = CLOUDRESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__ID = CLOUDRESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__NAME = CLOUDRESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__TYPE = CLOUDRESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Csm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__CSM = CLOUDRESOURCE__CSM;

	/**
	 * The feature id for the '<em><b>Crconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__CRCONSTRAINT = CLOUDRESOURCE__CRCONSTRAINT;

	/**
	 * The feature id for the '<em><b>Crrequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__CRREQUIRMENT = CLOUDRESOURCE__CRREQUIRMENT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__MEMBER = CLOUDRESOURCE__MEMBER;

	/**
	 * The feature id for the '<em><b>Clink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__CLINK = CLOUDRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudresource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE__CLOUDRESOURCE = CLOUDRESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compositeresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE_FEATURE_COUNT = CLOUDRESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compositeresource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERESOURCE_OPERATION_COUNT = CLOUDRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.C_SMImpl <em>CSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.C_SMImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_SM()
	 * @generated
	 */
	int CSM = 6;

	/**
	 * The feature id for the '<em><b>Startdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__STARTDATE = 0;

	/**
	 * The feature id for the '<em><b>Enddate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__ENDDATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__STATE = 5;

	/**
	 * The feature id for the '<em><b>Csmrequirment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__CSMREQUIRMENT = 6;

	/**
	 * The feature id for the '<em><b>Cevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__CEVENT = 7;

	/**
	 * The feature id for the '<em><b>Creconfigurationaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__CRECONFIGURATIONACTION = 8;

	/**
	 * The feature id for the '<em><b>CSM tsa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__CSM_TSA = 9;

	/**
	 * The feature id for the '<em><b>Ttcransition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__TTCRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Tcstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__TCSTATE = 11;

	/**
	 * The number of structural features of the '<em>CSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>CSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.PropertyImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.AttributeImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.ResourceconstraintImpl <em>Resourceconstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.ResourceconstraintImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getResourceconstraint()
	 * @generated
	 */
	int RESOURCECONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCECONSTRAINT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCECONSTRAINT__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCECONSTRAINT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Resourceconstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCECONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resourceconstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCECONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.CloudResourcerequirmentImpl <em>Cloud Resourcerequirment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.CloudResourcerequirmentImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCloudResourcerequirment()
	 * @generated
	 */
	int CLOUD_RESOURCEREQUIRMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCEREQUIRMENT__NAME = RESOURCEREQUIRMENT__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCEREQUIRMENT__PROPERTY = RESOURCEREQUIRMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCEREQUIRMENT__ID = RESOURCEREQUIRMENT__ID;

	/**
	 * The number of structural features of the '<em>Cloud Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCEREQUIRMENT_FEATURE_COUNT = RESOURCEREQUIRMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCEREQUIRMENT_OPERATION_COUNT = RESOURCEREQUIRMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.StateResourcerequirmentImpl <em>State Resourcerequirment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.StateResourcerequirmentImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getStateResourcerequirment()
	 * @generated
	 */
	int STATE_RESOURCEREQUIRMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCEREQUIRMENT__NAME = RESOURCEREQUIRMENT__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCEREQUIRMENT__PROPERTY = RESOURCEREQUIRMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCEREQUIRMENT__ID = RESOURCEREQUIRMENT__ID;

	/**
	 * The number of structural features of the '<em>State Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCEREQUIRMENT_FEATURE_COUNT = RESOURCEREQUIRMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Resourcerequirment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCEREQUIRMENT_OPERATION_COUNT = RESOURCEREQUIRMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.StateImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getState()
	 * @generated
	 */
	int STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = 1;

	/**
	 * The feature id for the '<em><b>Isfinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ISFINAL = 2;

	/**
	 * The feature id for the '<em><b>Isnormal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ISNORMAL = 3;

	/**
	 * The feature id for the '<em><b>Characterize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHARACTERIZE = 4;

	/**
	 * The feature id for the '<em><b>Tsa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TSA = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.TransitionImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 1;

	/**
	 * The feature id for the '<em><b>Reconfigurationaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECONFIGURATIONACTION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Transitionevent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITIONEVENT = 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.EventImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PREDICATE = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Reference value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REFERENCE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = 5;

	/**
	 * The feature id for the '<em><b>Weakday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__WEAKDAY = 6;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__METRIC = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPERATOR = 9;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UNIT = 10;

	/**
	 * The feature id for the '<em><b>Timewindow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMEWINDOW = 11;

	/**
	 * The feature id for the '<em><b>Targetresource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGETRESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Typeevent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPEEVENT = 13;

	/**
	 * The feature id for the '<em><b>Metrickind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__METRICKIND = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LABEL = 15;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl <em>Reconfigurationaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.ReconfigurationactionImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getReconfigurationaction()
	 * @generated
	 */
	int RECONFIGURATIONACTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__COOLDOWN = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__MIGRATENAME = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__HOST = 6;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__RESOURCE_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ADJUST = 8;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ATTRIBUTE_TARGET = 9;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__SCALINGNAME = 10;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ADJUSTMENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__BANAME = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__LABEL = 13;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ACTION = 14;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ANAME = 15;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__ATTRIBUTEVALUE = 16;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION__EXECUTION = 17;

	/**
	 * The number of structural features of the '<em>Reconfigurationaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Reconfigurationaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATIONACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.NormalStateImpl <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.NormalStateImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getNormalState()
	 * @generated
	 */
	int NORMAL_STATE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Isfinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__ISFINAL = STATE__ISFINAL;

	/**
	 * The feature id for the '<em><b>Isnormal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__ISNORMAL = STATE__ISNORMAL;

	/**
	 * The feature id for the '<em><b>Characterize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__CHARACTERIZE = STATE__CHARACTERIZE;

	/**
	 * The feature id for the '<em><b>Tsa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__TSA = STATE__TSA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__TYPE = STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.InitialStateImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Isfinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ISFINAL = STATE__ISFINAL;

	/**
	 * The feature id for the '<em><b>Isnormal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ISNORMAL = STATE__ISNORMAL;

	/**
	 * The feature id for the '<em><b>Characterize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__CHARACTERIZE = STATE__CHARACTERIZE;

	/**
	 * The feature id for the '<em><b>Tsa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__TSA = STATE__TSA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__TYPE = STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.FinalStateImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Isfinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ISFINAL = STATE__ISFINAL;

	/**
	 * The feature id for the '<em><b>Isnormal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ISNORMAL = STATE__ISNORMAL;

	/**
	 * The feature id for the '<em><b>Characterize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CHARACTERIZE = STATE__CHARACTERIZE;

	/**
	 * The feature id for the '<em><b>Tsa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__TSA = STATE__TSA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__TYPE = STATE__TYPE;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.MainmapImpl <em>Mainmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.MainmapImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMainmap()
	 * @generated
	 */
	int MAINMAP = 20;

	/**
	 * The feature id for the '<em><b>Crdm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP__CRDM = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP__CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP__PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Orechestrationtool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP__ORECHESTRATIONTOOL = 3;

	/**
	 * The number of structural features of the '<em>Mainmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mainmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.ConnectorImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Targetorchestrationtool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGETORCHESTRATIONTOOL = 2;

	/**
	 * The feature id for the '<em><b>Sourcec RDM</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCEC_RDM = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.BasicActionImpl <em>Basic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.BasicActionImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getBasicAction()
	 * @generated
	 */
	int BASIC_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ID = RECONFIGURATIONACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__NAME = RECONFIGURATIONACTION__NAME;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__COOLDOWN = RECONFIGURATIONACTION__COOLDOWN;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__PROVIDER = RECONFIGURATIONACTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__TYPE = RECONFIGURATIONACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__MIGRATENAME = RECONFIGURATIONACTION__MIGRATENAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__HOST = RECONFIGURATIONACTION__HOST;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__RESOURCE_TARGET = RECONFIGURATIONACTION__RESOURCE_TARGET;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ADJUST = RECONFIGURATIONACTION__ADJUST;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ATTRIBUTE_TARGET = RECONFIGURATIONACTION__ATTRIBUTE_TARGET;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__SCALINGNAME = RECONFIGURATIONACTION__SCALINGNAME;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ADJUSTMENT_TYPE = RECONFIGURATIONACTION__ADJUSTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__BANAME = RECONFIGURATIONACTION__BANAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__LABEL = RECONFIGURATIONACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ACTION = RECONFIGURATIONACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ANAME = RECONFIGURATIONACTION__ANAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__ATTRIBUTEVALUE = RECONFIGURATIONACTION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION__EXECUTION = RECONFIGURATIONACTION__EXECUTION;

	/**
	 * The number of structural features of the '<em>Basic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION_FEATURE_COUNT = RECONFIGURATIONACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ACTION_OPERATION_COUNT = RECONFIGURATIONACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.MigrationImpl <em>Migration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.MigrationImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMigration()
	 * @generated
	 */
	int MIGRATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ID = RECONFIGURATIONACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__NAME = RECONFIGURATIONACTION__NAME;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__COOLDOWN = RECONFIGURATIONACTION__COOLDOWN;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__PROVIDER = RECONFIGURATIONACTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__TYPE = RECONFIGURATIONACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__MIGRATENAME = RECONFIGURATIONACTION__MIGRATENAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__HOST = RECONFIGURATIONACTION__HOST;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__RESOURCE_TARGET = RECONFIGURATIONACTION__RESOURCE_TARGET;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ADJUST = RECONFIGURATIONACTION__ADJUST;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ATTRIBUTE_TARGET = RECONFIGURATIONACTION__ATTRIBUTE_TARGET;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__SCALINGNAME = RECONFIGURATIONACTION__SCALINGNAME;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ADJUSTMENT_TYPE = RECONFIGURATIONACTION__ADJUSTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__BANAME = RECONFIGURATIONACTION__BANAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__LABEL = RECONFIGURATIONACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ACTION = RECONFIGURATIONACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ANAME = RECONFIGURATIONACTION__ANAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ATTRIBUTEVALUE = RECONFIGURATIONACTION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__EXECUTION = RECONFIGURATIONACTION__EXECUTION;

	/**
	 * The number of structural features of the '<em>Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_FEATURE_COUNT = RECONFIGURATIONACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_OPERATION_COUNT = RECONFIGURATIONACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.HorizontalscalingImpl <em>Horizontalscaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.HorizontalscalingImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getHorizontalscaling()
	 * @generated
	 */
	int HORIZONTALSCALING = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ID = RECONFIGURATIONACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__NAME = RECONFIGURATIONACTION__NAME;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__COOLDOWN = RECONFIGURATIONACTION__COOLDOWN;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__PROVIDER = RECONFIGURATIONACTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__TYPE = RECONFIGURATIONACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__MIGRATENAME = RECONFIGURATIONACTION__MIGRATENAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__HOST = RECONFIGURATIONACTION__HOST;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__RESOURCE_TARGET = RECONFIGURATIONACTION__RESOURCE_TARGET;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ADJUST = RECONFIGURATIONACTION__ADJUST;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ATTRIBUTE_TARGET = RECONFIGURATIONACTION__ATTRIBUTE_TARGET;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__SCALINGNAME = RECONFIGURATIONACTION__SCALINGNAME;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ADJUSTMENT_TYPE = RECONFIGURATIONACTION__ADJUSTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__BANAME = RECONFIGURATIONACTION__BANAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__LABEL = RECONFIGURATIONACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ACTION = RECONFIGURATIONACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ANAME = RECONFIGURATIONACTION__ANAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__ATTRIBUTEVALUE = RECONFIGURATIONACTION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING__EXECUTION = RECONFIGURATIONACTION__EXECUTION;

	/**
	 * The number of structural features of the '<em>Horizontalscaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING_FEATURE_COUNT = RECONFIGURATIONACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontalscaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALSCALING_OPERATION_COUNT = RECONFIGURATIONACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.VerticalscalingImpl <em>Verticalscaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.VerticalscalingImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getVerticalscaling()
	 * @generated
	 */
	int VERTICALSCALING = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ID = RECONFIGURATIONACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__NAME = RECONFIGURATIONACTION__NAME;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__COOLDOWN = RECONFIGURATIONACTION__COOLDOWN;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__PROVIDER = RECONFIGURATIONACTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__TYPE = RECONFIGURATIONACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__MIGRATENAME = RECONFIGURATIONACTION__MIGRATENAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__HOST = RECONFIGURATIONACTION__HOST;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__RESOURCE_TARGET = RECONFIGURATIONACTION__RESOURCE_TARGET;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ADJUST = RECONFIGURATIONACTION__ADJUST;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ATTRIBUTE_TARGET = RECONFIGURATIONACTION__ATTRIBUTE_TARGET;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__SCALINGNAME = RECONFIGURATIONACTION__SCALINGNAME;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ADJUSTMENT_TYPE = RECONFIGURATIONACTION__ADJUSTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__BANAME = RECONFIGURATIONACTION__BANAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__LABEL = RECONFIGURATIONACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ACTION = RECONFIGURATIONACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ANAME = RECONFIGURATIONACTION__ANAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__ATTRIBUTEVALUE = RECONFIGURATIONACTION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING__EXECUTION = RECONFIGURATIONACTION__EXECUTION;

	/**
	 * The number of structural features of the '<em>Verticalscaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING_FEATURE_COUNT = RECONFIGURATIONACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verticalscaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICALSCALING_OPERATION_COUNT = RECONFIGURATIONACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.CompositereconfigurationImpl <em>Compositereconfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.CompositereconfigurationImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCompositereconfiguration()
	 * @generated
	 */
	int COMPOSITERECONFIGURATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ID = RECONFIGURATIONACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__NAME = RECONFIGURATIONACTION__NAME;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__COOLDOWN = RECONFIGURATIONACTION__COOLDOWN;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__PROVIDER = RECONFIGURATIONACTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__TYPE = RECONFIGURATIONACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Migratename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__MIGRATENAME = RECONFIGURATIONACTION__MIGRATENAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__HOST = RECONFIGURATIONACTION__HOST;

	/**
	 * The feature id for the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__RESOURCE_TARGET = RECONFIGURATIONACTION__RESOURCE_TARGET;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ADJUST = RECONFIGURATIONACTION__ADJUST;

	/**
	 * The feature id for the '<em><b>Attribute target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ATTRIBUTE_TARGET = RECONFIGURATIONACTION__ATTRIBUTE_TARGET;

	/**
	 * The feature id for the '<em><b>Scalingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__SCALINGNAME = RECONFIGURATIONACTION__SCALINGNAME;

	/**
	 * The feature id for the '<em><b>Adjustment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ADJUSTMENT_TYPE = RECONFIGURATIONACTION__ADJUSTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Baname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__BANAME = RECONFIGURATIONACTION__BANAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__LABEL = RECONFIGURATIONACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ACTION = RECONFIGURATIONACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ANAME = RECONFIGURATIONACTION__ANAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ATTRIBUTEVALUE = RECONFIGURATIONACTION__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__EXECUTION = RECONFIGURATIONACTION__EXECUTION;

	/**
	 * The feature id for the '<em><b>Crname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__CRNAME = RECONFIGURATIONACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfigurationaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__RECONFIGURATIONACTION = RECONFIGURATIONACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION__ACTIONS = RECONFIGURATIONACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compositereconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION_FEATURE_COUNT = RECONFIGURATIONACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compositereconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITERECONFIGURATION_OPERATION_COUNT = RECONFIGURATIONACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.ProviderImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ACCESSKEY = 1;

	/**
	 * The feature id for the '<em><b>Secretkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SECRETKEY = 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.AWSImpl <em>AWS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.AWSImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAWS()
	 * @generated
	 */
	int AWS = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS__ACCESSKEY = PROVIDER__ACCESSKEY;

	/**
	 * The feature id for the '<em><b>Secretkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS__SECRETKEY = PROVIDER__SECRETKEY;

	/**
	 * The number of structural features of the '<em>AWS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AWS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.OpenstackImpl <em>Openstack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.OpenstackImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOpenstack()
	 * @generated
	 */
	int OPENSTACK = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK__ACCESSKEY = PROVIDER__ACCESSKEY;

	/**
	 * The feature id for the '<em><b>Secretkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK__SECRETKEY = PROVIDER__SECRETKEY;

	/**
	 * The number of structural features of the '<em>Openstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Openstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.GoogleCloudPlatformImpl <em>Google Cloud Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.GoogleCloudPlatformImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getGoogleCloudPlatform()
	 * @generated
	 */
	int GOOGLE_CLOUD_PLATFORM = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CLOUD_PLATFORM__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CLOUD_PLATFORM__ACCESSKEY = PROVIDER__ACCESSKEY;

	/**
	 * The feature id for the '<em><b>Secretkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CLOUD_PLATFORM__SECRETKEY = PROVIDER__SECRETKEY;

	/**
	 * The number of structural features of the '<em>Google Cloud Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CLOUD_PLATFORM_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Google Cloud Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CLOUD_PLATFORM_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.OrechestrationToolImpl <em>Orechestration Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.OrechestrationToolImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOrechestrationTool()
	 * @generated
	 */
	int ORECHESTRATION_TOOL = 31;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORECHESTRATION_TOOL__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Targetresource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORECHESTRATION_TOOL__TARGETRESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Orechestration Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORECHESTRATION_TOOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orechestration Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORECHESTRATION_TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.GroupImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ATTRIBUTE = CRDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = CRDM_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = CRDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Cloudresource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CLOUDRESOURCE = CRDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resourcerequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOURCEREQUIRMENT = CRDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resourceconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOURCECONSTRAINT = CRDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CSM = CRDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CRDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = CRDM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.TSAImpl <em>TSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.TSAImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTSA()
	 * @generated
	 */
	int TSA = 33;

	/**
	 * The feature id for the '<em><b>Tstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSA__TSTATE = 0;

	/**
	 * The feature id for the '<em><b>Ttransition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSA__TTRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSA__NAME = 2;

	/**
	 * The number of structural features of the '<em>TSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.TtransitionImpl <em>Ttransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.TtransitionImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTtransition()
	 * @generated
	 */
	int TTRANSITION = 34;

	/**
	 * The feature id for the '<em><b>Tsource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSITION__TSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Ttarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSITION__TTARGET = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSITION__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Ttransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ttransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.TstateImpl <em>Tstate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.TstateImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTstate()
	 * @generated
	 */
	int TSTATE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTATE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTATE__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Tstate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tstate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.DependencyImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 36;

	/**
	 * The feature id for the '<em><b>Tsource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TSOURCE = TTRANSITION__TSOURCE;

	/**
	 * The feature id for the '<em><b>Ttarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TTARGET = TTRANSITION__TTARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LABEL = TTRANSITION__LABEL;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = TTRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = TTRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.impl.NormaltransilienImpl <em>Normaltransilien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.impl.NormaltransilienImpl
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getNormaltransilien()
	 * @generated
	 */
	int NORMALTRANSILIEN = 37;

	/**
	 * The feature id for the '<em><b>Tsource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALTRANSILIEN__TSOURCE = TTRANSITION__TSOURCE;

	/**
	 * The feature id for the '<em><b>Ttarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALTRANSILIEN__TTARGET = TTRANSITION__TTARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALTRANSILIEN__LABEL = TTRANSITION__LABEL;

	/**
	 * The number of structural features of the '<em>Normaltransilien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALTRANSILIEN_FEATURE_COUNT = TTRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normaltransilien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALTRANSILIEN_OPERATION_COUNT = TTRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Operatortype <em>Operatortype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Operatortype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOperatortype()
	 * @generated
	 */
	int OPERATORTYPE = 38;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Predicatetype <em>Predicatetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Predicatetype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getPredicatetype()
	 * @generated
	 */
	int PREDICATETYPE = 39;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Datatype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 40;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Unittype <em>Unittype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Unittype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getUnittype()
	 * @generated
	 */
	int UNITTYPE = 41;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Attributename <em>Attributename</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Attributename
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAttributename()
	 * @generated
	 */
	int ATTRIBUTENAME = 42;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.C_Resourcetype <em>CResourcetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.C_Resourcetype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_Resourcetype()
	 * @generated
	 */
	int CRESOURCETYPE = 43;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Linktype <em>Linktype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Linktype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getLinktype()
	 * @generated
	 */
	int LINKTYPE = 44;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Propertyname <em>Propertyname</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Propertyname
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getPropertyname()
	 * @generated
	 */
	int PROPERTYNAME = 45;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Functiontype <em>Functiontype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Functiontype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getFunctiontype()
	 * @generated
	 */
	int FUNCTIONTYPE = 46;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.orchestrationtools <em>orchestrationtools</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.orchestrationtools
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getorchestrationtools()
	 * @generated
	 */
	int ORCHESTRATIONTOOLS = 47;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Reconfigurationactiontype <em>Reconfigurationactiontype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Reconfigurationactiontype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getReconfigurationactiontype()
	 * @generated
	 */
	int RECONFIGURATIONACTIONTYPE = 48;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Basicactionname <em>Basicactionname</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Basicactionname
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getBasicactionname()
	 * @generated
	 */
	int BASICACTIONNAME = 49;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Migrationtype <em>Migrationtype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Migrationtype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMigrationtype()
	 * @generated
	 */
	int MIGRATIONTYPE = 50;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Adjustmenttype <em>Adjustmenttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Adjustmenttype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAdjustmenttype()
	 * @generated
	 */
	int ADJUSTMENTTYPE = 51;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Scalingnames <em>Scalingnames</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Scalingnames
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getScalingnames()
	 * @generated
	 */
	int SCALINGNAMES = 52;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Executiontype <em>Executiontype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Executiontype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getExecutiontype()
	 * @generated
	 */
	int EXECUTIONTYPE = 53;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.weakdays <em>weakdays</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.weakdays
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getweakdays()
	 * @generated
	 */
	int WEAKDAYS = 54;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.Eventstype <em>Eventstype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.Eventstype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getEventstype()
	 * @generated
	 */
	int EVENTSTYPE = 55;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.metrickinds <em>metrickinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.metrickinds
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getmetrickinds()
	 * @generated
	 */
	int METRICKINDS = 56;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.targetresourcetypes <em>targetresourcetypes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#gettargetresourcetypes()
	 * @generated
	 */
	int TARGETRESOURCETYPES = 57;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.tsstatetype <em>tsstatetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.tsstatetype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#gettsstatetype()
	 * @generated
	 */
	int TSSTATETYPE = 58;

	/**
	 * The meta object id for the '{@link cloudelasticity.crmd.statetype <em>statetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudelasticity.crmd.statetype
	 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getstatetype()
	 * @generated
	 */
	int STATETYPE = 59;


	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Resourcerequirment <em>Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resourcerequirment</em>'.
	 * @see cloudelasticity.crmd.Resourcerequirment
	 * @generated
	 */
	EClass getResourcerequirment();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Resourcerequirment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Resourcerequirment#getName()
	 * @see #getResourcerequirment()
	 * @generated
	 */
	EAttribute getResourcerequirment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Resourcerequirment#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see cloudelasticity.crmd.Resourcerequirment#getProperty()
	 * @see #getResourcerequirment()
	 * @generated
	 */
	EReference getResourcerequirment_Property();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Resourcerequirment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Resourcerequirment#getId()
	 * @see #getResourcerequirment()
	 * @generated
	 */
	EAttribute getResourcerequirment_Id();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.cRDM <em>cRDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cRDM</em>'.
	 * @see cloudelasticity.crmd.cRDM
	 * @generated
	 */
	EClass getcRDM();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.cRDM#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see cloudelasticity.crmd.cRDM#getVersion()
	 * @see #getcRDM()
	 * @generated
	 */
	EAttribute getcRDM_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.cRDM#getCrdmentity <em>Crdmentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crdmentity</em>'.
	 * @see cloudelasticity.crmd.cRDM#getCrdmentity()
	 * @see #getcRDM()
	 * @generated
	 */
	EReference getcRDM_Crdmentity();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.cRDM#getGc_sm <em>Gc sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gc sm</em>'.
	 * @see cloudelasticity.crmd.cRDM#getGc_sm()
	 * @see #getcRDM()
	 * @generated
	 */
	EReference getcRDM_Gc_sm();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.cRDM#getResourceconstraint <em>Resourceconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceconstraint</em>'.
	 * @see cloudelasticity.crmd.cRDM#getResourceconstraint()
	 * @see #getcRDM()
	 * @generated
	 */
	EReference getcRDM_Resourceconstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.cRDM#getResourcerequirment <em>Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourcerequirment</em>'.
	 * @see cloudelasticity.crmd.cRDM#getResourcerequirment()
	 * @see #getcRDM()
	 * @generated
	 */
	EReference getcRDM_Resourcerequirment();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.cRDM#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.cRDM#getId()
	 * @see #getcRDM()
	 * @generated
	 */
	EAttribute getcRDM_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.cRDM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.cRDM#getName()
	 * @see #getcRDM()
	 * @generated
	 */
	EAttribute getcRDM_Name();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.cRDM#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provider</em>'.
	 * @see cloudelasticity.crmd.cRDM#getProvider()
	 * @see #getcRDM()
	 * @generated
	 */
	EReference getcRDM_Provider();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.C_Link <em>CLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLink</em>'.
	 * @see cloudelasticity.crmd.C_Link
	 * @generated
	 */
	EClass getC_Link();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.C_Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see cloudelasticity.crmd.C_Link#getSource()
	 * @see #getC_Link()
	 * @generated
	 */
	EReference getC_Link_Source();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.C_Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see cloudelasticity.crmd.C_Link#getTarget()
	 * @see #getC_Link()
	 * @generated
	 */
	EReference getC_Link_Target();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.C_Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.C_Link#getType()
	 * @see #getC_Link()
	 * @generated
	 */
	EAttribute getC_Link_Type();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Atomicresource <em>Atomicresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomicresource</em>'.
	 * @see cloudelasticity.crmd.Atomicresource
	 * @generated
	 */
	EClass getAtomicresource();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.cRDMEntity <em>cRDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cRDM Entity</em>'.
	 * @see cloudelasticity.crmd.cRDMEntity
	 * @generated
	 */
	EClass getcRDMEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.cRDMEntity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see cloudelasticity.crmd.cRDMEntity#getAttribute()
	 * @see #getcRDMEntity()
	 * @generated
	 */
	EReference getcRDMEntity_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.cRDMEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.cRDMEntity#getId()
	 * @see #getcRDMEntity()
	 * @generated
	 */
	EAttribute getcRDMEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.cRDMEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.cRDMEntity#getName()
	 * @see #getcRDMEntity()
	 * @generated
	 */
	EAttribute getcRDMEntity_Name();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Compositeresource <em>Compositeresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compositeresource</em>'.
	 * @see cloudelasticity.crmd.Compositeresource
	 * @generated
	 */
	EClass getCompositeresource();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Compositeresource#getC_link <em>Clink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clink</em>'.
	 * @see cloudelasticity.crmd.Compositeresource#getC_link()
	 * @see #getCompositeresource()
	 * @generated
	 */
	EReference getCompositeresource_C_link();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Compositeresource#getCloudresource <em>Cloudresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloudresource</em>'.
	 * @see cloudelasticity.crmd.Compositeresource#getCloudresource()
	 * @see #getCompositeresource()
	 * @generated
	 */
	EReference getCompositeresource_Cloudresource();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.C_SM <em>CSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM</em>'.
	 * @see cloudelasticity.crmd.C_SM
	 * @generated
	 */
	EClass getC_SM();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.C_SM#getStartdate <em>Startdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startdate</em>'.
	 * @see cloudelasticity.crmd.C_SM#getStartdate()
	 * @see #getC_SM()
	 * @generated
	 */
	EAttribute getC_SM_Startdate();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.C_SM#getEnddate <em>Enddate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enddate</em>'.
	 * @see cloudelasticity.crmd.C_SM#getEnddate()
	 * @see #getC_SM()
	 * @generated
	 */
	EAttribute getC_SM_Enddate();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.C_SM#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.C_SM#getId()
	 * @see #getC_SM()
	 * @generated
	 */
	EAttribute getC_SM_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.C_SM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.C_SM#getName()
	 * @see #getC_SM()
	 * @generated
	 */
	EAttribute getC_SM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see cloudelasticity.crmd.C_SM#getTransition()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see cloudelasticity.crmd.C_SM#getState()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_State();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getCsmrequirment <em>Csmrequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csmrequirment</em>'.
	 * @see cloudelasticity.crmd.C_SM#getCsmrequirment()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Csmrequirment();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getCevent <em>Cevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cevent</em>'.
	 * @see cloudelasticity.crmd.C_SM#getCevent()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Cevent();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getCreconfigurationaction <em>Creconfigurationaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creconfigurationaction</em>'.
	 * @see cloudelasticity.crmd.C_SM#getCreconfigurationaction()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Creconfigurationaction();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getCSM_tsa <em>CSM tsa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CSM tsa</em>'.
	 * @see cloudelasticity.crmd.C_SM#getCSM_tsa()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_CSM_tsa();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getTtcransition <em>Ttcransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ttcransition</em>'.
	 * @see cloudelasticity.crmd.C_SM#getTtcransition()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Ttcransition();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.C_SM#getTcstate <em>Tcstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tcstate</em>'.
	 * @see cloudelasticity.crmd.C_SM#getTcstate()
	 * @see #getC_SM()
	 * @generated
	 */
	EReference getC_SM_Tcstate();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Cloudresource <em>Cloudresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudresource</em>'.
	 * @see cloudelasticity.crmd.Cloudresource
	 * @generated
	 */
	EClass getCloudresource();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Cloudresource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Cloudresource#getType()
	 * @see #getCloudresource()
	 * @generated
	 */
	EAttribute getCloudresource_Type();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Cloudresource#getC_sm <em>Csm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Csm</em>'.
	 * @see cloudelasticity.crmd.Cloudresource#getC_sm()
	 * @see #getCloudresource()
	 * @generated
	 */
	EReference getCloudresource_C_sm();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Cloudresource#getC_rconstraint <em>Crconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crconstraint</em>'.
	 * @see cloudelasticity.crmd.Cloudresource#getC_rconstraint()
	 * @see #getCloudresource()
	 * @generated
	 */
	EReference getCloudresource_C_rconstraint();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Cloudresource#getC_rrequirment <em>Crrequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crrequirment</em>'.
	 * @see cloudelasticity.crmd.Cloudresource#getC_rrequirment()
	 * @see #getCloudresource()
	 * @generated
	 */
	EReference getCloudresource_C_rrequirment();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Cloudresource#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see cloudelasticity.crmd.Cloudresource#getMember()
	 * @see #getCloudresource()
	 * @generated
	 */
	EReference getCloudresource_Member();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see cloudelasticity.crmd.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see cloudelasticity.crmd.Property#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Property();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see cloudelasticity.crmd.Property#getOperator()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Operator();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see cloudelasticity.crmd.Property#getUnit()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Property#getId()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see cloudelasticity.crmd.Property#isRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see cloudelasticity.crmd.Property#getDefault()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Default();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cloudelasticity.crmd.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see cloudelasticity.crmd.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see cloudelasticity.crmd.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see cloudelasticity.crmd.Attribute#getConstraint()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see cloudelasticity.crmd.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cloudelasticity.crmd.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Resourceconstraint <em>Resourceconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resourceconstraint</em>'.
	 * @see cloudelasticity.crmd.Resourceconstraint
	 * @generated
	 */
	EClass getResourceconstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Resourceconstraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see cloudelasticity.crmd.Resourceconstraint#getProperty()
	 * @see #getResourceconstraint()
	 * @generated
	 */
	EReference getResourceconstraint_Property();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Resourceconstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Resourceconstraint#getId()
	 * @see #getResourceconstraint()
	 * @generated
	 */
	EAttribute getResourceconstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Resourceconstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Resourceconstraint#getName()
	 * @see #getResourceconstraint()
	 * @generated
	 */
	EAttribute getResourceconstraint_Name();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.CloudResourcerequirment <em>Cloud Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resourcerequirment</em>'.
	 * @see cloudelasticity.crmd.CloudResourcerequirment
	 * @generated
	 */
	EClass getCloudResourcerequirment();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.StateResourcerequirment <em>State Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Resourcerequirment</em>'.
	 * @see cloudelasticity.crmd.StateResourcerequirment
	 * @generated
	 */
	EClass getStateResourcerequirment();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see cloudelasticity.crmd.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.State#getId()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.State#isIsfinal <em>Isfinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isfinal</em>'.
	 * @see cloudelasticity.crmd.State#isIsfinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Isfinal();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.State#isIsnormal <em>Isnormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isnormal</em>'.
	 * @see cloudelasticity.crmd.State#isIsnormal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Isnormal();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.State#getCharacterize <em>Characterize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characterize</em>'.
	 * @see cloudelasticity.crmd.State#getCharacterize()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Characterize();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.State#getTsa <em>Tsa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tsa</em>'.
	 * @see cloudelasticity.crmd.State#getTsa()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Tsa();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Type();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see cloudelasticity.crmd.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Transition#getReconfigurationaction <em>Reconfigurationaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reconfigurationaction</em>'.
	 * @see cloudelasticity.crmd.Transition#getReconfigurationaction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Reconfigurationaction();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cloudelasticity.crmd.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Label();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see cloudelasticity.crmd.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see cloudelasticity.crmd.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Transition#getTransitionevent <em>Transitionevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitionevent</em>'.
	 * @see cloudelasticity.crmd.Transition#getTransitionevent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transitionevent();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see cloudelasticity.crmd.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Event#getId()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see cloudelasticity.crmd.Event#getPredicate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see cloudelasticity.crmd.Event#getExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Expression();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getReference_value <em>Reference value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference value</em>'.
	 * @see cloudelasticity.crmd.Event#getReference_value()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Reference_value();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see cloudelasticity.crmd.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getWeakday <em>Weakday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weakday</em>'.
	 * @see cloudelasticity.crmd.Event#getWeakday()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Weakday();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see cloudelasticity.crmd.Event#getFunction()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Function();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see cloudelasticity.crmd.Event#getMetric()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Metric();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see cloudelasticity.crmd.Event#getOperator()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Operator();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see cloudelasticity.crmd.Event#getUnit()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Unit();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getTimewindow <em>Timewindow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timewindow</em>'.
	 * @see cloudelasticity.crmd.Event#getTimewindow()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timewindow();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getTargetresource <em>Targetresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetresource</em>'.
	 * @see cloudelasticity.crmd.Event#getTargetresource()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Targetresource();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getTypeevent <em>Typeevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeevent</em>'.
	 * @see cloudelasticity.crmd.Event#getTypeevent()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Typeevent();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getMetrickind <em>Metrickind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrickind</em>'.
	 * @see cloudelasticity.crmd.Event#getMetrickind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Metrickind();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Event#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cloudelasticity.crmd.Event#getLabel()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Label();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Reconfigurationaction <em>Reconfigurationaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurationaction</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction
	 * @generated
	 */
	EClass getReconfigurationaction();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getId()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Id();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getName()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getCooldown <em>Cooldown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getCooldown()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Cooldown();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getProvider()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Provider();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getType()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Type();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getMigratename <em>Migratename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migratename</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getMigratename()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Migratename();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getHost()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Host();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getResource_target <em>Resource target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource target</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getResource_target()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Resource_target();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAdjust <em>Adjust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjust</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAdjust()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Adjust();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAttribute_target <em>Attribute target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute target</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAttribute_target()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Attribute_target();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getScalingname <em>Scalingname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalingname</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getScalingname()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Scalingname();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAdjustment_type <em>Adjustment type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjustment type</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAdjustment_type()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Adjustment_type();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getBaname <em>Baname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baname</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getBaname()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Baname();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getLabel()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Label();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAction()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Action();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAname <em>Aname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aname</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAname()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Aname();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributevalue</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getAttributevalue()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Attributevalue();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Reconfigurationaction#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationaction#getExecution()
	 * @see #getReconfigurationaction()
	 * @generated
	 */
	EAttribute getReconfigurationaction_Execution();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see cloudelasticity.crmd.NormalState
	 * @generated
	 */
	EClass getNormalState();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see cloudelasticity.crmd.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see cloudelasticity.crmd.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Mainmap <em>Mainmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainmap</em>'.
	 * @see cloudelasticity.crmd.Mainmap
	 * @generated
	 */
	EClass getMainmap();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Mainmap#getCrdm <em>Crdm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crdm</em>'.
	 * @see cloudelasticity.crmd.Mainmap#getCrdm()
	 * @see #getMainmap()
	 * @generated
	 */
	EReference getMainmap_Crdm();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Mainmap#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see cloudelasticity.crmd.Mainmap#getConnector()
	 * @see #getMainmap()
	 * @generated
	 */
	EReference getMainmap_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Mainmap#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider</em>'.
	 * @see cloudelasticity.crmd.Mainmap#getProvider()
	 * @see #getMainmap()
	 * @generated
	 */
	EReference getMainmap_Provider();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Mainmap#getOrechestrationtool <em>Orechestrationtool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orechestrationtool</em>'.
	 * @see cloudelasticity.crmd.Mainmap#getOrechestrationtool()
	 * @see #getMainmap()
	 * @generated
	 */
	EReference getMainmap_Orechestrationtool();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cloudelasticity.crmd.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Connector#getTargetorchestrationtool <em>Targetorchestrationtool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targetorchestrationtool</em>'.
	 * @see cloudelasticity.crmd.Connector#getTargetorchestrationtool()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Targetorchestrationtool();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Connector#getSourcecRDM <em>Sourcec RDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sourcec RDM</em>'.
	 * @see cloudelasticity.crmd.Connector#getSourcecRDM()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourcecRDM();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.BasicAction <em>Basic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Action</em>'.
	 * @see cloudelasticity.crmd.BasicAction
	 * @generated
	 */
	EClass getBasicAction();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration</em>'.
	 * @see cloudelasticity.crmd.Migration
	 * @generated
	 */
	EClass getMigration();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Horizontalscaling <em>Horizontalscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontalscaling</em>'.
	 * @see cloudelasticity.crmd.Horizontalscaling
	 * @generated
	 */
	EClass getHorizontalscaling();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Verticalscaling <em>Verticalscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verticalscaling</em>'.
	 * @see cloudelasticity.crmd.Verticalscaling
	 * @generated
	 */
	EClass getVerticalscaling();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Compositereconfiguration <em>Compositereconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compositereconfiguration</em>'.
	 * @see cloudelasticity.crmd.Compositereconfiguration
	 * @generated
	 */
	EClass getCompositereconfiguration();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Compositereconfiguration#getCrname <em>Crname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crname</em>'.
	 * @see cloudelasticity.crmd.Compositereconfiguration#getCrname()
	 * @see #getCompositereconfiguration()
	 * @generated
	 */
	EAttribute getCompositereconfiguration_Crname();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Compositereconfiguration#getReconfigurationaction <em>Reconfigurationaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reconfigurationaction</em>'.
	 * @see cloudelasticity.crmd.Compositereconfiguration#getReconfigurationaction()
	 * @see #getCompositereconfiguration()
	 * @generated
	 */
	EReference getCompositereconfiguration_Reconfigurationaction();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Compositereconfiguration#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see cloudelasticity.crmd.Compositereconfiguration#getActions()
	 * @see #getCompositereconfiguration()
	 * @generated
	 */
	EAttribute getCompositereconfiguration_Actions();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see cloudelasticity.crmd.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Provider#getAccesskey <em>Accesskey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accesskey</em>'.
	 * @see cloudelasticity.crmd.Provider#getAccesskey()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Accesskey();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Provider#getSecretkey <em>Secretkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secretkey</em>'.
	 * @see cloudelasticity.crmd.Provider#getSecretkey()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Secretkey();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.AWS <em>AWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS</em>'.
	 * @see cloudelasticity.crmd.AWS
	 * @generated
	 */
	EClass getAWS();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Openstack <em>Openstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack</em>'.
	 * @see cloudelasticity.crmd.Openstack
	 * @generated
	 */
	EClass getOpenstack();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.GoogleCloudPlatform <em>Google Cloud Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Google Cloud Platform</em>'.
	 * @see cloudelasticity.crmd.GoogleCloudPlatform
	 * @generated
	 */
	EClass getGoogleCloudPlatform();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.OrechestrationTool <em>Orechestration Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orechestration Tool</em>'.
	 * @see cloudelasticity.crmd.OrechestrationTool
	 * @generated
	 */
	EClass getOrechestrationTool();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.OrechestrationTool#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see cloudelasticity.crmd.OrechestrationTool#getTool()
	 * @see #getOrechestrationTool()
	 * @generated
	 */
	EAttribute getOrechestrationTool_Tool();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.OrechestrationTool#getTargetresource <em>Targetresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetresource</em>'.
	 * @see cloudelasticity.crmd.OrechestrationTool#getTargetresource()
	 * @see #getOrechestrationTool()
	 * @generated
	 */
	EAttribute getOrechestrationTool_Targetresource();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see cloudelasticity.crmd.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.Group#getCloudresource <em>Cloudresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloudresource</em>'.
	 * @see cloudelasticity.crmd.Group#getCloudresource()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Cloudresource();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Group#getResourcerequirment <em>Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resourcerequirment</em>'.
	 * @see cloudelasticity.crmd.Group#getResourcerequirment()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Resourcerequirment();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Group#getResourceconstraint <em>Resourceconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resourceconstraint</em>'.
	 * @see cloudelasticity.crmd.Group#getResourceconstraint()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Resourceconstraint();

	/**
	 * Returns the meta object for the reference list '{@link cloudelasticity.crmd.Group#getCsm <em>Csm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Csm</em>'.
	 * @see cloudelasticity.crmd.Group#getCsm()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Csm();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.TSA <em>TSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSA</em>'.
	 * @see cloudelasticity.crmd.TSA
	 * @generated
	 */
	EClass getTSA();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.TSA#getTstate <em>Tstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tstate</em>'.
	 * @see cloudelasticity.crmd.TSA#getTstate()
	 * @see #getTSA()
	 * @generated
	 */
	EReference getTSA_Tstate();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudelasticity.crmd.TSA#getTtransition <em>Ttransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ttransition</em>'.
	 * @see cloudelasticity.crmd.TSA#getTtransition()
	 * @see #getTSA()
	 * @generated
	 */
	EReference getTSA_Ttransition();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.TSA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.TSA#getName()
	 * @see #getTSA()
	 * @generated
	 */
	EAttribute getTSA_Name();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Ttransition <em>Ttransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttransition</em>'.
	 * @see cloudelasticity.crmd.Ttransition
	 * @generated
	 */
	EClass getTtransition();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Ttransition#getTsource <em>Tsource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tsource</em>'.
	 * @see cloudelasticity.crmd.Ttransition#getTsource()
	 * @see #getTtransition()
	 * @generated
	 */
	EReference getTtransition_Tsource();

	/**
	 * Returns the meta object for the reference '{@link cloudelasticity.crmd.Ttransition#getTtarget <em>Ttarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ttarget</em>'.
	 * @see cloudelasticity.crmd.Ttransition#getTtarget()
	 * @see #getTtransition()
	 * @generated
	 */
	EReference getTtransition_Ttarget();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Ttransition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cloudelasticity.crmd.Ttransition#getLabel()
	 * @see #getTtransition()
	 * @generated
	 */
	EAttribute getTtransition_Label();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Tstate <em>Tstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tstate</em>'.
	 * @see cloudelasticity.crmd.Tstate
	 * @generated
	 */
	EClass getTstate();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Tstate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudelasticity.crmd.Tstate#getName()
	 * @see #getTstate()
	 * @generated
	 */
	EAttribute getTstate_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Tstate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudelasticity.crmd.Tstate#getType()
	 * @see #getTstate()
	 * @generated
	 */
	EAttribute getTstate_Type();

	/**
	 * Returns the meta object for the attribute '{@link cloudelasticity.crmd.Tstate#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cloudelasticity.crmd.Tstate#getLabel()
	 * @see #getTstate()
	 * @generated
	 */
	EAttribute getTstate_Label();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see cloudelasticity.crmd.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link cloudelasticity.crmd.Normaltransilien <em>Normaltransilien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normaltransilien</em>'.
	 * @see cloudelasticity.crmd.Normaltransilien
	 * @generated
	 */
	EClass getNormaltransilien();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Operatortype <em>Operatortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operatortype</em>'.
	 * @see cloudelasticity.crmd.Operatortype
	 * @generated
	 */
	EEnum getOperatortype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Predicatetype <em>Predicatetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predicatetype</em>'.
	 * @see cloudelasticity.crmd.Predicatetype
	 * @generated
	 */
	EEnum getPredicatetype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see cloudelasticity.crmd.Datatype
	 * @generated
	 */
	EEnum getDatatype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Unittype <em>Unittype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unittype</em>'.
	 * @see cloudelasticity.crmd.Unittype
	 * @generated
	 */
	EEnum getUnittype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Attributename <em>Attributename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attributename</em>'.
	 * @see cloudelasticity.crmd.Attributename
	 * @generated
	 */
	EEnum getAttributename();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.C_Resourcetype <em>CResourcetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CResourcetype</em>'.
	 * @see cloudelasticity.crmd.C_Resourcetype
	 * @generated
	 */
	EEnum getC_Resourcetype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Linktype <em>Linktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linktype</em>'.
	 * @see cloudelasticity.crmd.Linktype
	 * @generated
	 */
	EEnum getLinktype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Propertyname <em>Propertyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Propertyname</em>'.
	 * @see cloudelasticity.crmd.Propertyname
	 * @generated
	 */
	EEnum getPropertyname();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Functiontype <em>Functiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Functiontype</em>'.
	 * @see cloudelasticity.crmd.Functiontype
	 * @generated
	 */
	EEnum getFunctiontype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.orchestrationtools <em>orchestrationtools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>orchestrationtools</em>'.
	 * @see cloudelasticity.crmd.orchestrationtools
	 * @generated
	 */
	EEnum getorchestrationtools();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Reconfigurationactiontype <em>Reconfigurationactiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reconfigurationactiontype</em>'.
	 * @see cloudelasticity.crmd.Reconfigurationactiontype
	 * @generated
	 */
	EEnum getReconfigurationactiontype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Basicactionname <em>Basicactionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basicactionname</em>'.
	 * @see cloudelasticity.crmd.Basicactionname
	 * @generated
	 */
	EEnum getBasicactionname();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Migrationtype <em>Migrationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Migrationtype</em>'.
	 * @see cloudelasticity.crmd.Migrationtype
	 * @generated
	 */
	EEnum getMigrationtype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Adjustmenttype <em>Adjustmenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjustmenttype</em>'.
	 * @see cloudelasticity.crmd.Adjustmenttype
	 * @generated
	 */
	EEnum getAdjustmenttype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Scalingnames <em>Scalingnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scalingnames</em>'.
	 * @see cloudelasticity.crmd.Scalingnames
	 * @generated
	 */
	EEnum getScalingnames();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Executiontype <em>Executiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Executiontype</em>'.
	 * @see cloudelasticity.crmd.Executiontype
	 * @generated
	 */
	EEnum getExecutiontype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.weakdays <em>weakdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>weakdays</em>'.
	 * @see cloudelasticity.crmd.weakdays
	 * @generated
	 */
	EEnum getweakdays();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.Eventstype <em>Eventstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eventstype</em>'.
	 * @see cloudelasticity.crmd.Eventstype
	 * @generated
	 */
	EEnum getEventstype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.metrickinds <em>metrickinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>metrickinds</em>'.
	 * @see cloudelasticity.crmd.metrickinds
	 * @generated
	 */
	EEnum getmetrickinds();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.targetresourcetypes <em>targetresourcetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>targetresourcetypes</em>'.
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @generated
	 */
	EEnum gettargetresourcetypes();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.tsstatetype <em>tsstatetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>tsstatetype</em>'.
	 * @see cloudelasticity.crmd.tsstatetype
	 * @generated
	 */
	EEnum gettsstatetype();

	/**
	 * Returns the meta object for enum '{@link cloudelasticity.crmd.statetype <em>statetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>statetype</em>'.
	 * @see cloudelasticity.crmd.statetype
	 * @generated
	 */
	EEnum getstatetype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	crmdFactory getcrmdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.ResourcerequirmentImpl <em>Resourcerequirment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.ResourcerequirmentImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getResourcerequirment()
		 * @generated
		 */
		EClass RESOURCEREQUIRMENT = eINSTANCE.getResourcerequirment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCEREQUIRMENT__NAME = eINSTANCE.getResourcerequirment_Name();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCEREQUIRMENT__PROPERTY = eINSTANCE.getResourcerequirment_Property();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCEREQUIRMENT__ID = eINSTANCE.getResourcerequirment_Id();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.cRDMImpl <em>cRDM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.cRDMImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getcRDM()
		 * @generated
		 */
		EClass CRDM = eINSTANCE.getcRDM();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRDM__VERSION = eINSTANCE.getcRDM_Version();

		/**
		 * The meta object literal for the '<em><b>Crdmentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM__CRDMENTITY = eINSTANCE.getcRDM_Crdmentity();

		/**
		 * The meta object literal for the '<em><b>Gc sm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM__GC_SM = eINSTANCE.getcRDM_Gc_sm();

		/**
		 * The meta object literal for the '<em><b>Resourceconstraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM__RESOURCECONSTRAINT = eINSTANCE.getcRDM_Resourceconstraint();

		/**
		 * The meta object literal for the '<em><b>Resourcerequirment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM__RESOURCEREQUIRMENT = eINSTANCE.getcRDM_Resourcerequirment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRDM__ID = eINSTANCE.getcRDM_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRDM__NAME = eINSTANCE.getcRDM_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM__PROVIDER = eINSTANCE.getcRDM_Provider();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.C_LinkImpl <em>CLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.C_LinkImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_Link()
		 * @generated
		 */
		EClass CLINK = eINSTANCE.getC_Link();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINK__SOURCE = eINSTANCE.getC_Link_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINK__TARGET = eINSTANCE.getC_Link_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINK__TYPE = eINSTANCE.getC_Link_Type();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.AtomicresourceImpl <em>Atomicresource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.AtomicresourceImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAtomicresource()
		 * @generated
		 */
		EClass ATOMICRESOURCE = eINSTANCE.getAtomicresource();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.cRDMEntityImpl <em>cRDM Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.cRDMEntityImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getcRDMEntity()
		 * @generated
		 */
		EClass CRDM_ENTITY = eINSTANCE.getcRDMEntity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRDM_ENTITY__ATTRIBUTE = eINSTANCE.getcRDMEntity_Attribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRDM_ENTITY__ID = eINSTANCE.getcRDMEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRDM_ENTITY__NAME = eINSTANCE.getcRDMEntity_Name();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.CompositeresourceImpl <em>Compositeresource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.CompositeresourceImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCompositeresource()
		 * @generated
		 */
		EClass COMPOSITERESOURCE = eINSTANCE.getCompositeresource();

		/**
		 * The meta object literal for the '<em><b>Clink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITERESOURCE__CLINK = eINSTANCE.getCompositeresource_C_link();

		/**
		 * The meta object literal for the '<em><b>Cloudresource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITERESOURCE__CLOUDRESOURCE = eINSTANCE.getCompositeresource_Cloudresource();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.C_SMImpl <em>CSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.C_SMImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_SM()
		 * @generated
		 */
		EClass CSM = eINSTANCE.getC_SM();

		/**
		 * The meta object literal for the '<em><b>Startdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM__STARTDATE = eINSTANCE.getC_SM_Startdate();

		/**
		 * The meta object literal for the '<em><b>Enddate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM__ENDDATE = eINSTANCE.getC_SM_Enddate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM__ID = eINSTANCE.getC_SM_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM__NAME = eINSTANCE.getC_SM_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__TRANSITION = eINSTANCE.getC_SM_Transition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__STATE = eINSTANCE.getC_SM_State();

		/**
		 * The meta object literal for the '<em><b>Csmrequirment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__CSMREQUIRMENT = eINSTANCE.getC_SM_Csmrequirment();

		/**
		 * The meta object literal for the '<em><b>Cevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__CEVENT = eINSTANCE.getC_SM_Cevent();

		/**
		 * The meta object literal for the '<em><b>Creconfigurationaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__CRECONFIGURATIONACTION = eINSTANCE.getC_SM_Creconfigurationaction();

		/**
		 * The meta object literal for the '<em><b>CSM tsa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__CSM_TSA = eINSTANCE.getC_SM_CSM_tsa();

		/**
		 * The meta object literal for the '<em><b>Ttcransition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__TTCRANSITION = eINSTANCE.getC_SM_Ttcransition();

		/**
		 * The meta object literal for the '<em><b>Tcstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__TCSTATE = eINSTANCE.getC_SM_Tcstate();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.CloudresourceImpl <em>Cloudresource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.CloudresourceImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCloudresource()
		 * @generated
		 */
		EClass CLOUDRESOURCE = eINSTANCE.getCloudresource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDRESOURCE__TYPE = eINSTANCE.getCloudresource_Type();

		/**
		 * The meta object literal for the '<em><b>Csm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDRESOURCE__CSM = eINSTANCE.getCloudresource_C_sm();

		/**
		 * The meta object literal for the '<em><b>Crconstraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDRESOURCE__CRCONSTRAINT = eINSTANCE.getCloudresource_C_rconstraint();

		/**
		 * The meta object literal for the '<em><b>Crrequirment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDRESOURCE__CRREQUIRMENT = eINSTANCE.getCloudresource_C_rrequirment();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDRESOURCE__MEMBER = eINSTANCE.getCloudresource_Member();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.PropertyImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY = eINSTANCE.getProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__OPERATOR = eINSTANCE.getProperty_Operator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UNIT = eINSTANCE.getProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ID = eINSTANCE.getProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REQUIRED = eINSTANCE.getProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT = eINSTANCE.getProperty_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.AttributeImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONSTRAINT = eINSTANCE.getAttribute_Constraint();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.ResourceconstraintImpl <em>Resourceconstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.ResourceconstraintImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getResourceconstraint()
		 * @generated
		 */
		EClass RESOURCECONSTRAINT = eINSTANCE.getResourceconstraint();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCECONSTRAINT__PROPERTY = eINSTANCE.getResourceconstraint_Property();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCECONSTRAINT__ID = eINSTANCE.getResourceconstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCECONSTRAINT__NAME = eINSTANCE.getResourceconstraint_Name();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.CloudResourcerequirmentImpl <em>Cloud Resourcerequirment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.CloudResourcerequirmentImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCloudResourcerequirment()
		 * @generated
		 */
		EClass CLOUD_RESOURCEREQUIRMENT = eINSTANCE.getCloudResourcerequirment();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.StateResourcerequirmentImpl <em>State Resourcerequirment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.StateResourcerequirmentImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getStateResourcerequirment()
		 * @generated
		 */
		EClass STATE_RESOURCEREQUIRMENT = eINSTANCE.getStateResourcerequirment();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.StateImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '<em><b>Isfinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ISFINAL = eINSTANCE.getState_Isfinal();

		/**
		 * The meta object literal for the '<em><b>Isnormal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ISNORMAL = eINSTANCE.getState_Isnormal();

		/**
		 * The meta object literal for the '<em><b>Characterize</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CHARACTERIZE = eINSTANCE.getState_Characterize();

		/**
		 * The meta object literal for the '<em><b>Tsa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TSA = eINSTANCE.getState_Tsa();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.TransitionImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>Reconfigurationaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RECONFIGURATIONACTION = eINSTANCE.getTransition_Reconfigurationaction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Transitionevent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITIONEVENT = eINSTANCE.getTransition_Transitionevent();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.EventImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ID = eINSTANCE.getEvent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__PREDICATE = eINSTANCE.getEvent_Predicate();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EXPRESSION = eINSTANCE.getEvent_Expression();

		/**
		 * The meta object literal for the '<em><b>Reference value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__REFERENCE_VALUE = eINSTANCE.getEvent_Reference_value();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '<em><b>Weakday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__WEAKDAY = eINSTANCE.getEvent_Weakday();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__FUNCTION = eINSTANCE.getEvent_Function();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__METRIC = eINSTANCE.getEvent_Metric();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__OPERATOR = eINSTANCE.getEvent_Operator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__UNIT = eINSTANCE.getEvent_Unit();

		/**
		 * The meta object literal for the '<em><b>Timewindow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMEWINDOW = eINSTANCE.getEvent_Timewindow();

		/**
		 * The meta object literal for the '<em><b>Targetresource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TARGETRESOURCE = eINSTANCE.getEvent_Targetresource();

		/**
		 * The meta object literal for the '<em><b>Typeevent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPEEVENT = eINSTANCE.getEvent_Typeevent();

		/**
		 * The meta object literal for the '<em><b>Metrickind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__METRICKIND = eINSTANCE.getEvent_Metrickind();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__LABEL = eINSTANCE.getEvent_Label();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl <em>Reconfigurationaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.ReconfigurationactionImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getReconfigurationaction()
		 * @generated
		 */
		EClass RECONFIGURATIONACTION = eINSTANCE.getReconfigurationaction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ID = eINSTANCE.getReconfigurationaction_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__NAME = eINSTANCE.getReconfigurationaction_Name();

		/**
		 * The meta object literal for the '<em><b>Cooldown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__COOLDOWN = eINSTANCE.getReconfigurationaction_Cooldown();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__PROVIDER = eINSTANCE.getReconfigurationaction_Provider();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__TYPE = eINSTANCE.getReconfigurationaction_Type();

		/**
		 * The meta object literal for the '<em><b>Migratename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__MIGRATENAME = eINSTANCE.getReconfigurationaction_Migratename();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__HOST = eINSTANCE.getReconfigurationaction_Host();

		/**
		 * The meta object literal for the '<em><b>Resource target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__RESOURCE_TARGET = eINSTANCE.getReconfigurationaction_Resource_target();

		/**
		 * The meta object literal for the '<em><b>Adjust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ADJUST = eINSTANCE.getReconfigurationaction_Adjust();

		/**
		 * The meta object literal for the '<em><b>Attribute target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ATTRIBUTE_TARGET = eINSTANCE.getReconfigurationaction_Attribute_target();

		/**
		 * The meta object literal for the '<em><b>Scalingname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__SCALINGNAME = eINSTANCE.getReconfigurationaction_Scalingname();

		/**
		 * The meta object literal for the '<em><b>Adjustment type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ADJUSTMENT_TYPE = eINSTANCE.getReconfigurationaction_Adjustment_type();

		/**
		 * The meta object literal for the '<em><b>Baname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__BANAME = eINSTANCE.getReconfigurationaction_Baname();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__LABEL = eINSTANCE.getReconfigurationaction_Label();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ACTION = eINSTANCE.getReconfigurationaction_Action();

		/**
		 * The meta object literal for the '<em><b>Aname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ANAME = eINSTANCE.getReconfigurationaction_Aname();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__ATTRIBUTEVALUE = eINSTANCE.getReconfigurationaction_Attributevalue();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATIONACTION__EXECUTION = eINSTANCE.getReconfigurationaction_Execution();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.NormalStateImpl <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.NormalStateImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getNormalState()
		 * @generated
		 */
		EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.InitialStateImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.FinalStateImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.MainmapImpl <em>Mainmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.MainmapImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMainmap()
		 * @generated
		 */
		EClass MAINMAP = eINSTANCE.getMainmap();

		/**
		 * The meta object literal for the '<em><b>Crdm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINMAP__CRDM = eINSTANCE.getMainmap_Crdm();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINMAP__CONNECTOR = eINSTANCE.getMainmap_Connector();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINMAP__PROVIDER = eINSTANCE.getMainmap_Provider();

		/**
		 * The meta object literal for the '<em><b>Orechestrationtool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINMAP__ORECHESTRATIONTOOL = eINSTANCE.getMainmap_Orechestrationtool();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.ConnectorImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Targetorchestrationtool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGETORCHESTRATIONTOOL = eINSTANCE.getConnector_Targetorchestrationtool();

		/**
		 * The meta object literal for the '<em><b>Sourcec RDM</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCEC_RDM = eINSTANCE.getConnector_SourcecRDM();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.BasicActionImpl <em>Basic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.BasicActionImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getBasicAction()
		 * @generated
		 */
		EClass BASIC_ACTION = eINSTANCE.getBasicAction();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.MigrationImpl <em>Migration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.MigrationImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMigration()
		 * @generated
		 */
		EClass MIGRATION = eINSTANCE.getMigration();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.HorizontalscalingImpl <em>Horizontalscaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.HorizontalscalingImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getHorizontalscaling()
		 * @generated
		 */
		EClass HORIZONTALSCALING = eINSTANCE.getHorizontalscaling();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.VerticalscalingImpl <em>Verticalscaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.VerticalscalingImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getVerticalscaling()
		 * @generated
		 */
		EClass VERTICALSCALING = eINSTANCE.getVerticalscaling();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.CompositereconfigurationImpl <em>Compositereconfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.CompositereconfigurationImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getCompositereconfiguration()
		 * @generated
		 */
		EClass COMPOSITERECONFIGURATION = eINSTANCE.getCompositereconfiguration();

		/**
		 * The meta object literal for the '<em><b>Crname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITERECONFIGURATION__CRNAME = eINSTANCE.getCompositereconfiguration_Crname();

		/**
		 * The meta object literal for the '<em><b>Reconfigurationaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITERECONFIGURATION__RECONFIGURATIONACTION = eINSTANCE.getCompositereconfiguration_Reconfigurationaction();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITERECONFIGURATION__ACTIONS = eINSTANCE.getCompositereconfiguration_Actions();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.ProviderImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Accesskey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ACCESSKEY = eINSTANCE.getProvider_Accesskey();

		/**
		 * The meta object literal for the '<em><b>Secretkey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__SECRETKEY = eINSTANCE.getProvider_Secretkey();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.AWSImpl <em>AWS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.AWSImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAWS()
		 * @generated
		 */
		EClass AWS = eINSTANCE.getAWS();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.OpenstackImpl <em>Openstack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.OpenstackImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOpenstack()
		 * @generated
		 */
		EClass OPENSTACK = eINSTANCE.getOpenstack();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.GoogleCloudPlatformImpl <em>Google Cloud Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.GoogleCloudPlatformImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getGoogleCloudPlatform()
		 * @generated
		 */
		EClass GOOGLE_CLOUD_PLATFORM = eINSTANCE.getGoogleCloudPlatform();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.OrechestrationToolImpl <em>Orechestration Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.OrechestrationToolImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOrechestrationTool()
		 * @generated
		 */
		EClass ORECHESTRATION_TOOL = eINSTANCE.getOrechestrationTool();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORECHESTRATION_TOOL__TOOL = eINSTANCE.getOrechestrationTool_Tool();

		/**
		 * The meta object literal for the '<em><b>Targetresource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORECHESTRATION_TOOL__TARGETRESOURCE = eINSTANCE.getOrechestrationTool_Targetresource();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.GroupImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Cloudresource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CLOUDRESOURCE = eINSTANCE.getGroup_Cloudresource();

		/**
		 * The meta object literal for the '<em><b>Resourcerequirment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__RESOURCEREQUIRMENT = eINSTANCE.getGroup_Resourcerequirment();

		/**
		 * The meta object literal for the '<em><b>Resourceconstraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__RESOURCECONSTRAINT = eINSTANCE.getGroup_Resourceconstraint();

		/**
		 * The meta object literal for the '<em><b>Csm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CSM = eINSTANCE.getGroup_Csm();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.TSAImpl <em>TSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.TSAImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTSA()
		 * @generated
		 */
		EClass TSA = eINSTANCE.getTSA();

		/**
		 * The meta object literal for the '<em><b>Tstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSA__TSTATE = eINSTANCE.getTSA_Tstate();

		/**
		 * The meta object literal for the '<em><b>Ttransition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSA__TTRANSITION = eINSTANCE.getTSA_Ttransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSA__NAME = eINSTANCE.getTSA_Name();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.TtransitionImpl <em>Ttransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.TtransitionImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTtransition()
		 * @generated
		 */
		EClass TTRANSITION = eINSTANCE.getTtransition();

		/**
		 * The meta object literal for the '<em><b>Tsource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRANSITION__TSOURCE = eINSTANCE.getTtransition_Tsource();

		/**
		 * The meta object literal for the '<em><b>Ttarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRANSITION__TTARGET = eINSTANCE.getTtransition_Ttarget();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTRANSITION__LABEL = eINSTANCE.getTtransition_Label();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.TstateImpl <em>Tstate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.TstateImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getTstate()
		 * @generated
		 */
		EClass TSTATE = eINSTANCE.getTstate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTATE__NAME = eINSTANCE.getTstate_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTATE__TYPE = eINSTANCE.getTstate_Type();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTATE__LABEL = eINSTANCE.getTstate_Label();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.DependencyImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.impl.NormaltransilienImpl <em>Normaltransilien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.impl.NormaltransilienImpl
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getNormaltransilien()
		 * @generated
		 */
		EClass NORMALTRANSILIEN = eINSTANCE.getNormaltransilien();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Operatortype <em>Operatortype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Operatortype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getOperatortype()
		 * @generated
		 */
		EEnum OPERATORTYPE = eINSTANCE.getOperatortype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Predicatetype <em>Predicatetype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Predicatetype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getPredicatetype()
		 * @generated
		 */
		EEnum PREDICATETYPE = eINSTANCE.getPredicatetype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Datatype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Unittype <em>Unittype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Unittype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getUnittype()
		 * @generated
		 */
		EEnum UNITTYPE = eINSTANCE.getUnittype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Attributename <em>Attributename</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Attributename
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAttributename()
		 * @generated
		 */
		EEnum ATTRIBUTENAME = eINSTANCE.getAttributename();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.C_Resourcetype <em>CResourcetype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.C_Resourcetype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getC_Resourcetype()
		 * @generated
		 */
		EEnum CRESOURCETYPE = eINSTANCE.getC_Resourcetype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Linktype <em>Linktype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Linktype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getLinktype()
		 * @generated
		 */
		EEnum LINKTYPE = eINSTANCE.getLinktype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Propertyname <em>Propertyname</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Propertyname
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getPropertyname()
		 * @generated
		 */
		EEnum PROPERTYNAME = eINSTANCE.getPropertyname();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Functiontype <em>Functiontype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Functiontype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getFunctiontype()
		 * @generated
		 */
		EEnum FUNCTIONTYPE = eINSTANCE.getFunctiontype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.orchestrationtools <em>orchestrationtools</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.orchestrationtools
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getorchestrationtools()
		 * @generated
		 */
		EEnum ORCHESTRATIONTOOLS = eINSTANCE.getorchestrationtools();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Reconfigurationactiontype <em>Reconfigurationactiontype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Reconfigurationactiontype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getReconfigurationactiontype()
		 * @generated
		 */
		EEnum RECONFIGURATIONACTIONTYPE = eINSTANCE.getReconfigurationactiontype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Basicactionname <em>Basicactionname</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Basicactionname
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getBasicactionname()
		 * @generated
		 */
		EEnum BASICACTIONNAME = eINSTANCE.getBasicactionname();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Migrationtype <em>Migrationtype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Migrationtype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getMigrationtype()
		 * @generated
		 */
		EEnum MIGRATIONTYPE = eINSTANCE.getMigrationtype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Adjustmenttype <em>Adjustmenttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Adjustmenttype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getAdjustmenttype()
		 * @generated
		 */
		EEnum ADJUSTMENTTYPE = eINSTANCE.getAdjustmenttype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Scalingnames <em>Scalingnames</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Scalingnames
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getScalingnames()
		 * @generated
		 */
		EEnum SCALINGNAMES = eINSTANCE.getScalingnames();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Executiontype <em>Executiontype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Executiontype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getExecutiontype()
		 * @generated
		 */
		EEnum EXECUTIONTYPE = eINSTANCE.getExecutiontype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.weakdays <em>weakdays</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.weakdays
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getweakdays()
		 * @generated
		 */
		EEnum WEAKDAYS = eINSTANCE.getweakdays();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.Eventstype <em>Eventstype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.Eventstype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getEventstype()
		 * @generated
		 */
		EEnum EVENTSTYPE = eINSTANCE.getEventstype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.metrickinds <em>metrickinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.metrickinds
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getmetrickinds()
		 * @generated
		 */
		EEnum METRICKINDS = eINSTANCE.getmetrickinds();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.targetresourcetypes <em>targetresourcetypes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.targetresourcetypes
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#gettargetresourcetypes()
		 * @generated
		 */
		EEnum TARGETRESOURCETYPES = eINSTANCE.gettargetresourcetypes();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.tsstatetype <em>tsstatetype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.tsstatetype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#gettsstatetype()
		 * @generated
		 */
		EEnum TSSTATETYPE = eINSTANCE.gettsstatetype();

		/**
		 * The meta object literal for the '{@link cloudelasticity.crmd.statetype <em>statetype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudelasticity.crmd.statetype
		 * @see cloudelasticity.crmd.impl.crmdPackageImpl#getstatetype()
		 * @generated
		 */
		EEnum STATETYPE = eINSTANCE.getstatetype();

	}

} //crmdPackage
