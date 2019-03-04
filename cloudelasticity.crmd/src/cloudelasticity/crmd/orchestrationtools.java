/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>orchestrationtools</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getorchestrationtools()
 * @model
 * @generated
 */
public enum orchestrationtools implements Enumerator {
	/**
	 * The '<em><b>Docker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER(0, "Docker", "Docker"),

	/**
	 * The '<em><b>Terraform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRAFORM_VALUE
	 * @generated
	 * @ordered
	 */
	TERRAFORM(1, "Terraform", "Terraform"),

	/**
	 * The '<em><b>Kubernetes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES_VALUE
	 * @generated
	 * @ordered
	 */
	KUBERNETES(2, "kubernetes", "Kubernetes"),

	/**
	 * The '<em><b>Ansible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	ANSIBLE(3, "Ansible", "Ansible");

	/**
	 * The '<em><b>Docker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Docker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCKER
	 * @model name="Docker"
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_VALUE = 0;

	/**
	 * The '<em><b>Terraform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terraform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERRAFORM
	 * @model name="Terraform"
	 * @generated
	 * @ordered
	 */
	public static final int TERRAFORM_VALUE = 1;

	/**
	 * The '<em><b>Kubernetes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kubernetes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES
	 * @model name="kubernetes" literal="Kubernetes"
	 * @generated
	 * @ordered
	 */
	public static final int KUBERNETES_VALUE = 2;

	/**
	 * The '<em><b>Ansible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ansible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANSIBLE
	 * @model name="Ansible"
	 * @generated
	 * @ordered
	 */
	public static final int ANSIBLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>orchestrationtools</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final orchestrationtools[] VALUES_ARRAY =
		new orchestrationtools[] {
			DOCKER,
			TERRAFORM,
			KUBERNETES,
			ANSIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>orchestrationtools</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<orchestrationtools> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>orchestrationtools</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static orchestrationtools get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			orchestrationtools result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>orchestrationtools</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static orchestrationtools getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			orchestrationtools result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>orchestrationtools</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static orchestrationtools get(int value) {
		switch (value) {
			case DOCKER_VALUE: return DOCKER;
			case TERRAFORM_VALUE: return TERRAFORM;
			case KUBERNETES_VALUE: return KUBERNETES;
			case ANSIBLE_VALUE: return ANSIBLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private orchestrationtools(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //orchestrationtools
