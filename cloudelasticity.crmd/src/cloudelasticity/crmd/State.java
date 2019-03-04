/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.State#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#isIsfinal <em>Isfinal</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#isIsnormal <em>Isnormal</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#getCharacterize <em>Characterize</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#getTsa <em>Tsa</em>}</li>
 *   <li>{@link cloudelasticity.crmd.State#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see cloudelasticity.crmd.crmdPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getState_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Isfinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isfinal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isfinal</em>' attribute.
	 * @see #setIsfinal(boolean)
	 * @see cloudelasticity.crmd.crmdPackage#getState_Isfinal()
	 * @model
	 * @generated
	 */
	boolean isIsfinal();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.State#isIsfinal <em>Isfinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isfinal</em>' attribute.
	 * @see #isIsfinal()
	 * @generated
	 */
	void setIsfinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Isnormal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isnormal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isnormal</em>' attribute.
	 * @see #setIsnormal(boolean)
	 * @see cloudelasticity.crmd.crmdPackage#getState_Isnormal()
	 * @model
	 * @generated
	 */
	boolean isIsnormal();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.State#isIsnormal <em>Isnormal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isnormal</em>' attribute.
	 * @see #isIsnormal()
	 * @generated
	 */
	void setIsnormal(boolean value);

	/**
	 * Returns the value of the '<em><b>Characterize</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Resourcerequirment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characterize</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characterize</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getState_Characterize()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resourcerequirment> getCharacterize();

	/**
	 * Returns the value of the '<em><b>Tsa</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.TSA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tsa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tsa</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getState_Tsa()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSA> getTsa();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.statetype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.statetype
	 * @see #setType(statetype)
	 * @see cloudelasticity.crmd.crmdPackage#getState_Type()
	 * @model
	 * @generated
	 */
	statetype getType();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.statetype
	 * @see #getType()
	 * @generated
	 */
	void setType(statetype value);

} // State
