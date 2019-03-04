/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Adjustmenttype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getAdjustmenttype()
 * @model
 * @generated
 */
public enum Adjustmenttype implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "choose adjustment type"),

	/**
	 * The '<em><b>Exactcapacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTCAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTCAPACITY(1, "Exactcapacity", "Exact-capacity"),

	/**
	 * The '<em><b>Percentchangeincapacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTCHANGEINCAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTCHANGEINCAPACITY(2, "Percentchangeincapacity", "Percent-change-in-capacity"),

	/**
	 * The '<em><b>Changeincapacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGEINCAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGEINCAPACITY(3, "Changeincapacity", "change-in-capacity");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="choose adjustment type"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Exactcapacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exactcapacity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTCAPACITY
	 * @model name="Exactcapacity" literal="Exact-capacity"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTCAPACITY_VALUE = 1;

	/**
	 * The '<em><b>Percentchangeincapacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentchangeincapacity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTCHANGEINCAPACITY
	 * @model name="Percentchangeincapacity" literal="Percent-change-in-capacity"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTCHANGEINCAPACITY_VALUE = 2;

	/**
	 * The '<em><b>Changeincapacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changeincapacity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGEINCAPACITY
	 * @model name="Changeincapacity" literal="change-in-capacity"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGEINCAPACITY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Adjustmenttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Adjustmenttype[] VALUES_ARRAY =
		new Adjustmenttype[] {
			DEFAULT,
			EXACTCAPACITY,
			PERCENTCHANGEINCAPACITY,
			CHANGEINCAPACITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Adjustmenttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Adjustmenttype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adjustmenttype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Adjustmenttype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Adjustmenttype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustmenttype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Adjustmenttype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Adjustmenttype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustmenttype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Adjustmenttype get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case EXACTCAPACITY_VALUE: return EXACTCAPACITY;
			case PERCENTCHANGEINCAPACITY_VALUE: return PERCENTCHANGEINCAPACITY;
			case CHANGEINCAPACITY_VALUE: return CHANGEINCAPACITY;
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
	private Adjustmenttype(int value, String name, String literal) {
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
	
} //Adjustmenttype
