/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>targetresourcetypes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#gettargetresourcetypes()
 * @model
 * @generated
 */
public enum targetresourcetypes implements Enumerator {
	/**
	 * The '<em><b>Xaa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	XAA_S(0, "XaaS", "XaaS"),

	/**
	 * The '<em><b>Iaa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	IAA_S(1, "IaaS", "IaaS"),

	/**
	 * The '<em><b>Paa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	PAA_S(2, "PaaS", "PaaS"),

	/**
	 * The '<em><b>Saa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	SAA_S(3, "SaaS", "SaaS");

	/**
	 * The '<em><b>Xaa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xaa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XAA_S
	 * @model name="XaaS"
	 * @generated
	 * @ordered
	 */
	public static final int XAA_S_VALUE = 0;

	/**
	 * The '<em><b>Iaa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iaa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IAA_S
	 * @model name="IaaS"
	 * @generated
	 * @ordered
	 */
	public static final int IAA_S_VALUE = 1;

	/**
	 * The '<em><b>Paa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAA_S
	 * @model name="PaaS"
	 * @generated
	 * @ordered
	 */
	public static final int PAA_S_VALUE = 2;

	/**
	 * The '<em><b>Saa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Saa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAA_S
	 * @model name="SaaS"
	 * @generated
	 * @ordered
	 */
	public static final int SAA_S_VALUE = 3;

	/**
	 * An array of all the '<em><b>targetresourcetypes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final targetresourcetypes[] VALUES_ARRAY =
		new targetresourcetypes[] {
			XAA_S,
			IAA_S,
			PAA_S,
			SAA_S,
		};

	/**
	 * A public read-only list of all the '<em><b>targetresourcetypes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<targetresourcetypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>targetresourcetypes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static targetresourcetypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			targetresourcetypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>targetresourcetypes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static targetresourcetypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			targetresourcetypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>targetresourcetypes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static targetresourcetypes get(int value) {
		switch (value) {
			case XAA_S_VALUE: return XAA_S;
			case IAA_S_VALUE: return IAA_S;
			case PAA_S_VALUE: return PAA_S;
			case SAA_S_VALUE: return SAA_S;
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
	private targetresourcetypes(int value, String name, String literal) {
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
	
} //targetresourcetypes
