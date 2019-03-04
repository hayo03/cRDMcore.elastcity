/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Mainmap#getCrdm <em>Crdm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Mainmap#getConnector <em>Connector</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Mainmap#getProvider <em>Provider</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Mainmap#getOrechestrationtool <em>Orechestrationtool</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getMainmap()
 * @model
 * @generated
 */
public interface Mainmap extends EObject {
	/**
	 * Returns the value of the '<em><b>Crdm</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.cRDM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crdm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crdm</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getMainmap_Crdm()
	 * @model containment="true"
	 * @generated
	 */
	EList<cRDM> getCrdm();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getMainmap_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getMainmap_Provider()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getProvider();

	/**
	 * Returns the value of the '<em><b>Orechestrationtool</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.OrechestrationTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orechestrationtool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orechestrationtool</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getMainmap_Orechestrationtool()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrechestrationTool> getOrechestrationtool();

} // Mainmap
