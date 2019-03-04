/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scalingnames</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getScalingnames()
 * @model
 * @generated
 */
public enum Scalingnames implements Enumerator {
	/**
	 * The '<em><b>Scalein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALEIN_VALUE
	 * @generated
	 * @ordered
	 */
	SCALEIN(0, "Scalein", "scalein"),

	/**
	 * The '<em><b>Scaleout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	SCALEOUT(1, "Scaleout", "scaleout"),

	/**
	 * The '<em><b>Scaleup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALEUP_VALUE
	 * @generated
	 * @ordered
	 */
	SCALEUP(2, "Scaleup", "scaleup"),

	/**
	 * The '<em><b>Scaledown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALEDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SCALEDOWN(3, "Scaledown", "scaledown");

	/**
	 * The '<em><b>Scalein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scalein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALEIN
	 * @model name="Scalein" literal="scalein"
	 * @generated
	 * @ordered
	 */
	public static final int SCALEIN_VALUE = 0;

	/**
	 * The '<em><b>Scaleout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scaleout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALEOUT
	 * @model name="Scaleout" literal="scaleout"
	 * @generated
	 * @ordered
	 */
	public static final int SCALEOUT_VALUE = 1;

	/**
	 * The '<em><b>Scaleup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scaleup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALEUP
	 * @model name="Scaleup" literal="scaleup"
	 * @generated
	 * @ordered
	 */
	public static final int SCALEUP_VALUE = 2;

	/**
	 * The '<em><b>Scaledown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scaledown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALEDOWN
	 * @model name="Scaledown" literal="scaledown"
	 * @generated
	 * @ordered
	 */
	public static final int SCALEDOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Scalingnames</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scalingnames[] VALUES_ARRAY =
		new Scalingnames[] {
			SCALEIN,
			SCALEOUT,
			SCALEUP,
			SCALEDOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Scalingnames</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scalingnames> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scalingnames</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scalingnames get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scalingnames result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scalingnames</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scalingnames getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scalingnames result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scalingnames</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scalingnames get(int value) {
		switch (value) {
			case SCALEIN_VALUE: return SCALEIN;
			case SCALEOUT_VALUE: return SCALEOUT;
			case SCALEUP_VALUE: return SCALEUP;
			case SCALEDOWN_VALUE: return SCALEDOWN;
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
	private Scalingnames(int value, String name, String literal) {
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
	
} //Scalingnames
