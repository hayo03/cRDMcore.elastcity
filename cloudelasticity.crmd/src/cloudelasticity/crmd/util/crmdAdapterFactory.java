/**
 */
package cloudelasticity.crmd.util;

import cloudelasticity.crmd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage
 * @generated
 */
public class crmdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static crmdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crmdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = crmdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected crmdSwitch<Adapter> modelSwitch =
		new crmdSwitch<Adapter>() {
			@Override
			public Adapter caseResourcerequirment(Resourcerequirment object) {
				return createResourcerequirmentAdapter();
			}
			@Override
			public Adapter casecRDM(cRDM object) {
				return createcRDMAdapter();
			}
			@Override
			public Adapter caseC_Link(C_Link object) {
				return createC_LinkAdapter();
			}
			@Override
			public Adapter caseAtomicresource(Atomicresource object) {
				return createAtomicresourceAdapter();
			}
			@Override
			public Adapter casecRDMEntity(cRDMEntity object) {
				return createcRDMEntityAdapter();
			}
			@Override
			public Adapter caseCompositeresource(Compositeresource object) {
				return createCompositeresourceAdapter();
			}
			@Override
			public Adapter caseC_SM(C_SM object) {
				return createC_SMAdapter();
			}
			@Override
			public Adapter caseCloudresource(Cloudresource object) {
				return createCloudresourceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseResourceconstraint(Resourceconstraint object) {
				return createResourceconstraintAdapter();
			}
			@Override
			public Adapter caseCloudResourcerequirment(CloudResourcerequirment object) {
				return createCloudResourcerequirmentAdapter();
			}
			@Override
			public Adapter caseStateResourcerequirment(StateResourcerequirment object) {
				return createStateResourcerequirmentAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseReconfigurationaction(Reconfigurationaction object) {
				return createReconfigurationactionAdapter();
			}
			@Override
			public Adapter caseNormalState(NormalState object) {
				return createNormalStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseMainmap(Mainmap object) {
				return createMainmapAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseBasicAction(BasicAction object) {
				return createBasicActionAdapter();
			}
			@Override
			public Adapter caseMigration(Migration object) {
				return createMigrationAdapter();
			}
			@Override
			public Adapter caseHorizontalscaling(Horizontalscaling object) {
				return createHorizontalscalingAdapter();
			}
			@Override
			public Adapter caseVerticalscaling(Verticalscaling object) {
				return createVerticalscalingAdapter();
			}
			@Override
			public Adapter caseCompositereconfiguration(Compositereconfiguration object) {
				return createCompositereconfigurationAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseAWS(AWS object) {
				return createAWSAdapter();
			}
			@Override
			public Adapter caseOpenstack(Openstack object) {
				return createOpenstackAdapter();
			}
			@Override
			public Adapter caseGoogleCloudPlatform(GoogleCloudPlatform object) {
				return createGoogleCloudPlatformAdapter();
			}
			@Override
			public Adapter caseOrechestrationTool(OrechestrationTool object) {
				return createOrechestrationToolAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseTSA(TSA object) {
				return createTSAAdapter();
			}
			@Override
			public Adapter caseTtransition(Ttransition object) {
				return createTtransitionAdapter();
			}
			@Override
			public Adapter caseTstate(Tstate object) {
				return createTstateAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseNormaltransilien(Normaltransilien object) {
				return createNormaltransilienAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Resourcerequirment <em>Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Resourcerequirment
	 * @generated
	 */
	public Adapter createResourcerequirmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.cRDM <em>cRDM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.cRDM
	 * @generated
	 */
	public Adapter createcRDMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.C_Link <em>CLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.C_Link
	 * @generated
	 */
	public Adapter createC_LinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Atomicresource <em>Atomicresource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Atomicresource
	 * @generated
	 */
	public Adapter createAtomicresourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.cRDMEntity <em>cRDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.cRDMEntity
	 * @generated
	 */
	public Adapter createcRDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Compositeresource <em>Compositeresource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Compositeresource
	 * @generated
	 */
	public Adapter createCompositeresourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.C_SM <em>CSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.C_SM
	 * @generated
	 */
	public Adapter createC_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Cloudresource <em>Cloudresource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Cloudresource
	 * @generated
	 */
	public Adapter createCloudresourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Resourceconstraint <em>Resourceconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Resourceconstraint
	 * @generated
	 */
	public Adapter createResourceconstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.CloudResourcerequirment <em>Cloud Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.CloudResourcerequirment
	 * @generated
	 */
	public Adapter createCloudResourcerequirmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.StateResourcerequirment <em>State Resourcerequirment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.StateResourcerequirment
	 * @generated
	 */
	public Adapter createStateResourcerequirmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Reconfigurationaction <em>Reconfigurationaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Reconfigurationaction
	 * @generated
	 */
	public Adapter createReconfigurationactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.NormalState
	 * @generated
	 */
	public Adapter createNormalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Mainmap <em>Mainmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Mainmap
	 * @generated
	 */
	public Adapter createMainmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.BasicAction <em>Basic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.BasicAction
	 * @generated
	 */
	public Adapter createBasicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Migration
	 * @generated
	 */
	public Adapter createMigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Horizontalscaling <em>Horizontalscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Horizontalscaling
	 * @generated
	 */
	public Adapter createHorizontalscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Verticalscaling <em>Verticalscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Verticalscaling
	 * @generated
	 */
	public Adapter createVerticalscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Compositereconfiguration <em>Compositereconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Compositereconfiguration
	 * @generated
	 */
	public Adapter createCompositereconfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.AWS <em>AWS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.AWS
	 * @generated
	 */
	public Adapter createAWSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Openstack <em>Openstack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Openstack
	 * @generated
	 */
	public Adapter createOpenstackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.GoogleCloudPlatform <em>Google Cloud Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.GoogleCloudPlatform
	 * @generated
	 */
	public Adapter createGoogleCloudPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.OrechestrationTool <em>Orechestration Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.OrechestrationTool
	 * @generated
	 */
	public Adapter createOrechestrationToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.TSA <em>TSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.TSA
	 * @generated
	 */
	public Adapter createTSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Ttransition <em>Ttransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Ttransition
	 * @generated
	 */
	public Adapter createTtransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Tstate <em>Tstate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Tstate
	 * @generated
	 */
	public Adapter createTstateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudelasticity.crmd.Normaltransilien <em>Normaltransilien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudelasticity.crmd.Normaltransilien
	 * @generated
	 */
	public Adapter createNormaltransilienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //crmdAdapterFactory
