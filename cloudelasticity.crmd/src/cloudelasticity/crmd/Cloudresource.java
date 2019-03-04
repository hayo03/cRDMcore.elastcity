/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloudresource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Cloudresource#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Cloudresource#getC_sm <em>Csm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Cloudresource#getC_rconstraint <em>Crconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Cloudresource#getC_rrequirment <em>Crrequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Cloudresource#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getCloudresource()
 * @model
 * @generated
 */
public interface Cloudresource extends cRDMEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.C_Resourcetype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.C_Resourcetype
	 * @see #setType(C_Resourcetype)
	 * @see cloudelasticity.crmd.crmdPackage#getCloudresource_Type()
	 * @model
	 * @generated
	 */
	C_Resourcetype getType();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Cloudresource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.C_Resourcetype
	 * @see #getType()
	 * @generated
	 */
	void setType(C_Resourcetype value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getCloudresource_C_sm()
	 * @model
	 * @generated
	 */
	EList<C_SM> getC_sm();

	/**
	 * Returns the value of the '<em><b>Crconstraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crconstraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crconstraint</em>' reference.
	 * @see #setC_rconstraint(Resourceconstraint)
	 * @see cloudelasticity.crmd.crmdPackage#getCloudresource_C_rconstraint()
	 * @model
	 * @generated
	 */
	Resourceconstraint getC_rconstraint();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Cloudresource#getC_rconstraint <em>Crconstraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crconstraint</em>' reference.
	 * @see #getC_rconstraint()
	 * @generated
	 */
	void setC_rconstraint(Resourceconstraint value);

	/**
	 * Returns the value of the '<em><b>Crrequirment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crrequirment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crrequirment</em>' reference.
	 * @see #setC_rrequirment(Resourcerequirment)
	 * @see cloudelasticity.crmd.crmdPackage#getCloudresource_C_rrequirment()
	 * @model
	 * @generated
	 */
	Resourcerequirment getC_rrequirment();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Cloudresource#getC_rrequirment <em>Crrequirment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crrequirment</em>' reference.
	 * @see #getC_rrequirment()
	 * @generated
	 */
	void setC_rrequirment(Resourcerequirment value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getCloudresource_Member()
	 * @model
	 * @generated
	 */
	EList<Group> getMember();

} // Cloudresource
