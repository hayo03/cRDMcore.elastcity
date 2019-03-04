/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.C_SM#getStartdate <em>Startdate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getEnddate <em>Enddate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getTransition <em>Transition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getState <em>State</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getCsmrequirment <em>Csmrequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getCevent <em>Cevent</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getCreconfigurationaction <em>Creconfigurationaction</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getCSM_tsa <em>CSM tsa</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getTtcransition <em>Ttcransition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_SM#getTcstate <em>Tcstate</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getC_SM()
 * @model
 * @generated
 */
public interface C_SM extends EObject {
	/**
	 * Returns the value of the '<em><b>Startdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startdate</em>' attribute.
	 * @see #setStartdate(String)
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Startdate()
	 * @model
	 * @generated
	 */
	String getStartdate();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_SM#getStartdate <em>Startdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startdate</em>' attribute.
	 * @see #getStartdate()
	 * @generated
	 */
	void setStartdate(String value);

	/**
	 * Returns the value of the '<em><b>Enddate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enddate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enddate</em>' attribute.
	 * @see #setEnddate(String)
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Enddate()
	 * @model
	 * @generated
	 */
	String getEnddate();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_SM#getEnddate <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enddate</em>' attribute.
	 * @see #getEnddate()
	 * @generated
	 */
	void setEnddate(String value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_SM#getId <em>Id</em>}' attribute.
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
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_SM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Csmrequirment</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Resourcerequirment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csmrequirment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csmrequirment</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Csmrequirment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resourcerequirment> getCsmrequirment();

	/**
	 * Returns the value of the '<em><b>Cevent</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cevent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cevent</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Cevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getCevent();

	/**
	 * Returns the value of the '<em><b>Creconfigurationaction</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Reconfigurationaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creconfigurationaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creconfigurationaction</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Creconfigurationaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reconfigurationaction> getCreconfigurationaction();

	/**
	 * Returns the value of the '<em><b>CSM tsa</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.TSA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSM tsa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSM tsa</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_CSM_tsa()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSA> getCSM_tsa();

	/**
	 * Returns the value of the '<em><b>Ttcransition</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Ttransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttcransition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttcransition</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Ttcransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ttransition> getTtcransition();

	/**
	 * Returns the value of the '<em><b>Tcstate</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Tstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcstate</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_SM_Tcstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tstate> getTcstate();

} // C_SM
