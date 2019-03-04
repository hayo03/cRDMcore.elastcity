/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compositeresource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Compositeresource#getC_link <em>Clink</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Compositeresource#getCloudresource <em>Cloudresource</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getCompositeresource()
 * @model
 * @generated
 */
public interface Compositeresource extends Cloudresource {
	/**
	 * Returns the value of the '<em><b>Clink</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.C_Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clink</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getCompositeresource_C_link()
	 * @model containment="true"
	 * @generated
	 */
	EList<C_Link> getC_link();

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
	 * @see cloudelasticity.crmd.crmdPackage#getCompositeresource_Cloudresource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cloudresource> getCloudresource();

} // Compositeresource
