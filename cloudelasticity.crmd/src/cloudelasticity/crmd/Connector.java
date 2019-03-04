/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Connector#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Connector#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Connector#getTargetorchestrationtool <em>Targetorchestrationtool</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Connector#getSourcecRDM <em>Sourcec RDM</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudelasticity.crmd.crmdPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"XaaS"</code>.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.targetresourcetypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @see #setType(targetresourcetypes)
	 * @see cloudelasticity.crmd.crmdPackage#getConnector_Type()
	 * @model default="XaaS"
	 * @generated
	 */
	targetresourcetypes getType();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @see #getType()
	 * @generated
	 */
	void setType(targetresourcetypes value);

	/**
	 * Returns the value of the '<em><b>Targetorchestrationtool</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.OrechestrationTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetorchestrationtool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetorchestrationtool</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getConnector_Targetorchestrationtool()
	 * @model required="true"
	 * @generated
	 */
	EList<OrechestrationTool> getTargetorchestrationtool();

	/**
	 * Returns the value of the '<em><b>Sourcec RDM</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.cRDM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcec RDM</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcec RDM</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getConnector_SourcecRDM()
	 * @model required="true"
	 * @generated
	 */
	EList<cRDM> getSourcecRDM();

} // Connector
