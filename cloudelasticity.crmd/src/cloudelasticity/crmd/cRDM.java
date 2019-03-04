/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cRDM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.cRDM#getVersion <em>Version</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getCrdmentity <em>Crdmentity</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getGc_sm <em>Gc sm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getResourceconstraint <em>Resourceconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getResourcerequirment <em>Resourcerequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.cRDM#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getcRDM()
 * @model
 * @generated
 */
public interface cRDM extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.cRDM#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Crdmentity</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.cRDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crdmentity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crdmentity</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Crdmentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<cRDMEntity> getCrdmentity();

	/**
	 * Returns the value of the '<em><b>Gc sm</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.C_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gc sm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gc sm</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Gc_sm()
	 * @model containment="true"
	 * @generated
	 */
	EList<C_SM> getGc_sm();

	/**
	 * Returns the value of the '<em><b>Resourceconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Resourceconstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourceconstraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceconstraint</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Resourceconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resourceconstraint> getResourceconstraint();

	/**
	 * Returns the value of the '<em><b>Resourcerequirment</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Resourcerequirment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourcerequirment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcerequirment</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Resourcerequirment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resourcerequirment> getResourcerequirment();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.cRDM#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.cRDM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getcRDM_Provider()
	 * @model
	 * @generated
	 */
	EList<Provider> getProvider();

} // cRDM
