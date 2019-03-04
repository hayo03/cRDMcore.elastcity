/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Group#getCloudresource <em>Cloudresource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Group#getResourcerequirment <em>Resourcerequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Group#getResourceconstraint <em>Resourceconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Group#getCsm <em>Csm</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends cRDMEntity {
	/**
	 * Returns the value of the '<em><b>Cloudresource</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Cloudresource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloudresource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudresource</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getGroup_Cloudresource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cloudresource> getCloudresource();

	/**
	 * Returns the value of the '<em><b>Resourcerequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourcerequirment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcerequirment</em>' reference.
	 * @see #setResourcerequirment(Resourcerequirment)
	 * @see cloudelasticity.crmd.crmdPackage#getGroup_Resourcerequirment()
	 * @model
	 * @generated
	 */
	Resourcerequirment getResourcerequirment();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Group#getResourcerequirment <em>Resourcerequirment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourcerequirment</em>' reference.
	 * @see #getResourcerequirment()
	 * @generated
	 */
	void setResourcerequirment(Resourcerequirment value);

	/**
	 * Returns the value of the '<em><b>Resourceconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourceconstraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceconstraint</em>' reference.
	 * @see #setResourceconstraint(Resourceconstraint)
	 * @see cloudelasticity.crmd.crmdPackage#getGroup_Resourceconstraint()
	 * @model
	 * @generated
	 */
	Resourceconstraint getResourceconstraint();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Group#getResourceconstraint <em>Resourceconstraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourceconstraint</em>' reference.
	 * @see #getResourceconstraint()
	 * @generated
	 */
	void setResourceconstraint(Resourceconstraint value);

	/**
	 * Returns the value of the '<em><b>Csm</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.C_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getGroup_Csm()
	 * @model
	 * @generated
	 */
	EList<C_SM> getCsm();

} // Group
