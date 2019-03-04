/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operatortype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getOperatortype()
 * @model
 * @generated
 */
public enum Operatortype implements Enumerator {
	/**
	 * The '<em><b>Greator Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATOR_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATOR_THAN(6, "GreatorThan", ">"),

	/**
	 * The '<em><b>Greater Thanor Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THANOR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THANOR_EQUAL(5, "GreaterThanorEqual", ">="),

	/**
	 * The '<em><b>Less Thanor Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THANOR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THANOR_EQUAL(3, "LessThanorEqual", "<="),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(4, "LessThan", "<"),

	/**
	 * The '<em><b>Belong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELONG_VALUE
	 * @generated
	 * @ordered
	 */
	BELONG(2, "Belong", "\u2208"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(1, "Equal", "=");

	/**
	 * The '<em><b>Greator Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greator Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATOR_THAN
	 * @model name="GreatorThan" literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int GREATOR_THAN_VALUE = 6;

	/**
	 * The '<em><b>Greater Thanor Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Thanor Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THANOR_EQUAL
	 * @model name="GreaterThanorEqual" literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THANOR_EQUAL_VALUE = 5;

	/**
	 * The '<em><b>Less Thanor Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Thanor Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THANOR_EQUAL
	 * @model name="LessThanorEqual" literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THANOR_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan" literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 4;

	/**
	 * The '<em><b>Belong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Belong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BELONG
	 * @model name="Belong" literal="\u2208"
	 * @generated
	 * @ordered
	 */
	public static final int BELONG_VALUE = 2;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="Equal" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Operatortype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operatortype[] VALUES_ARRAY =
		new Operatortype[] {
			GREATOR_THAN,
			GREATER_THANOR_EQUAL,
			LESS_THANOR_EQUAL,
			LESS_THAN,
			BELONG,
			EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Operatortype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operatortype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operatortype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operatortype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operatortype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operatortype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operatortype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operatortype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operatortype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operatortype get(int value) {
		switch (value) {
			case GREATOR_THAN_VALUE: return GREATOR_THAN;
			case GREATER_THANOR_EQUAL_VALUE: return GREATER_THANOR_EQUAL;
			case LESS_THANOR_EQUAL_VALUE: return LESS_THANOR_EQUAL;
			case LESS_THAN_VALUE: return LESS_THAN;
			case BELONG_VALUE: return BELONG;
			case EQUAL_VALUE: return EQUAL;
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
	private Operatortype(int value, String name, String literal) {
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
	
} //Operatortype
