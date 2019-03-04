/**
 */
package cloudelasticity.crmd.util;

import cloudelasticity.crmd.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage
 * @generated
 */
public class crmdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static crmdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crmdSwitch() {
		if (modelPackage == null) {
			modelPackage = crmdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case crmdPackage.RESOURCEREQUIRMENT: {
				Resourcerequirment resourcerequirment = (Resourcerequirment)theEObject;
				T result = caseResourcerequirment(resourcerequirment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CRDM: {
				cRDM cRDM = (cRDM)theEObject;
				T result = casecRDM(cRDM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CLINK: {
				C_Link c_Link = (C_Link)theEObject;
				T result = caseC_Link(c_Link);
				if (result == null) result = casecRDMEntity(c_Link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.ATOMICRESOURCE: {
				Atomicresource atomicresource = (Atomicresource)theEObject;
				T result = caseAtomicresource(atomicresource);
				if (result == null) result = caseCloudresource(atomicresource);
				if (result == null) result = casecRDMEntity(atomicresource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CRDM_ENTITY: {
				cRDMEntity cRDMEntity = (cRDMEntity)theEObject;
				T result = casecRDMEntity(cRDMEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.COMPOSITERESOURCE: {
				Compositeresource compositeresource = (Compositeresource)theEObject;
				T result = caseCompositeresource(compositeresource);
				if (result == null) result = caseCloudresource(compositeresource);
				if (result == null) result = casecRDMEntity(compositeresource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CSM: {
				C_SM c_SM = (C_SM)theEObject;
				T result = caseC_SM(c_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CLOUDRESOURCE: {
				Cloudresource cloudresource = (Cloudresource)theEObject;
				T result = caseCloudresource(cloudresource);
				if (result == null) result = casecRDMEntity(cloudresource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.RESOURCECONSTRAINT: {
				Resourceconstraint resourceconstraint = (Resourceconstraint)theEObject;
				T result = caseResourceconstraint(resourceconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CLOUD_RESOURCEREQUIRMENT: {
				CloudResourcerequirment cloudResourcerequirment = (CloudResourcerequirment)theEObject;
				T result = caseCloudResourcerequirment(cloudResourcerequirment);
				if (result == null) result = caseResourcerequirment(cloudResourcerequirment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.STATE_RESOURCEREQUIRMENT: {
				StateResourcerequirment stateResourcerequirment = (StateResourcerequirment)theEObject;
				T result = caseStateResourcerequirment(stateResourcerequirment);
				if (result == null) result = caseResourcerequirment(stateResourcerequirment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.RECONFIGURATIONACTION: {
				Reconfigurationaction reconfigurationaction = (Reconfigurationaction)theEObject;
				T result = caseReconfigurationaction(reconfigurationaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.NORMAL_STATE: {
				NormalState normalState = (NormalState)theEObject;
				T result = caseNormalState(normalState);
				if (result == null) result = caseState(normalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseState(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseState(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.MAINMAP: {
				Mainmap mainmap = (Mainmap)theEObject;
				T result = caseMainmap(mainmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.BASIC_ACTION: {
				BasicAction basicAction = (BasicAction)theEObject;
				T result = caseBasicAction(basicAction);
				if (result == null) result = caseReconfigurationaction(basicAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.MIGRATION: {
				Migration migration = (Migration)theEObject;
				T result = caseMigration(migration);
				if (result == null) result = caseReconfigurationaction(migration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.HORIZONTALSCALING: {
				Horizontalscaling horizontalscaling = (Horizontalscaling)theEObject;
				T result = caseHorizontalscaling(horizontalscaling);
				if (result == null) result = caseReconfigurationaction(horizontalscaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.VERTICALSCALING: {
				Verticalscaling verticalscaling = (Verticalscaling)theEObject;
				T result = caseVerticalscaling(verticalscaling);
				if (result == null) result = caseReconfigurationaction(verticalscaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.COMPOSITERECONFIGURATION: {
				Compositereconfiguration compositereconfiguration = (Compositereconfiguration)theEObject;
				T result = caseCompositereconfiguration(compositereconfiguration);
				if (result == null) result = caseReconfigurationaction(compositereconfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.AWS: {
				AWS aws = (AWS)theEObject;
				T result = caseAWS(aws);
				if (result == null) result = caseProvider(aws);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.OPENSTACK: {
				Openstack openstack = (Openstack)theEObject;
				T result = caseOpenstack(openstack);
				if (result == null) result = caseProvider(openstack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.GOOGLE_CLOUD_PLATFORM: {
				GoogleCloudPlatform googleCloudPlatform = (GoogleCloudPlatform)theEObject;
				T result = caseGoogleCloudPlatform(googleCloudPlatform);
				if (result == null) result = caseProvider(googleCloudPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.ORECHESTRATION_TOOL: {
				OrechestrationTool orechestrationTool = (OrechestrationTool)theEObject;
				T result = caseOrechestrationTool(orechestrationTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = casecRDMEntity(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.TSA: {
				TSA tsa = (TSA)theEObject;
				T result = caseTSA(tsa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.TTRANSITION: {
				Ttransition ttransition = (Ttransition)theEObject;
				T result = caseTtransition(ttransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.TSTATE: {
				Tstate tstate = (Tstate)theEObject;
				T result = caseTstate(tstate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseTtransition(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case crmdPackage.NORMALTRANSILIEN: {
				Normaltransilien normaltransilien = (Normaltransilien)theEObject;
				T result = caseNormaltransilien(normaltransilien);
				if (result == null) result = caseTtransition(normaltransilien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourcerequirment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcerequirment(Resourcerequirment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cRDM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cRDM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecRDM(cRDM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC_Link(C_Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomicresource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomicresource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicresource(Atomicresource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cRDM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cRDM Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecRDMEntity(cRDMEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compositeresource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compositeresource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeresource(Compositeresource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC_SM(C_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudresource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudresource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudresource(Cloudresource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourceconstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourceconstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceconstraint(Resourceconstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Resourcerequirment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudResourcerequirment(CloudResourcerequirment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Resourcerequirment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Resourcerequirment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateResourcerequirment(StateResourcerequirment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurationaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurationaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationaction(Reconfigurationaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalState(NormalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainmap(Mainmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicAction(BasicAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigration(Migration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontalscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontalscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalscaling(Horizontalscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verticalscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verticalscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalscaling(Verticalscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compositereconfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compositereconfiguration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositereconfiguration(Compositereconfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWS(AWS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstack(Openstack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Google Cloud Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Google Cloud Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoogleCloudPlatform(GoogleCloudPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orechestration Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orechestration Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrechestrationTool(OrechestrationTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSA(TSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttransition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttransition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtransition(Ttransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tstate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tstate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTstate(Tstate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normaltransilien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normaltransilien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormaltransilien(Normaltransilien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //crmdSwitch
