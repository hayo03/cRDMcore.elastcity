/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reconfigurationactiontype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationactiontype()
 * @model
 * @generated
 */
public enum Reconfigurationactiontype implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "define desired action"),

	/**
	 * The '<em><b>Basicaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASICACTION_VALUE
	 * @generated
	 * @ordered
	 */
	BASICACTION(1, "Basicaction", "Basicaction"),

	/**
	 * The '<em><b>Migration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MIGRATION(2, "Migration", "Migration"),

	/**
	 * The '<em><b>Horizontalscaling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSCALING_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTALSCALING(3, "Horizontalscaling", "Horizontalscaling"),

	/**
	 * The '<em><b>Verticalscaling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICALSCALING_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICALSCALING(4, "Verticalscaling", "Verticalscaling"),

	/**
	 * The '<em><b>Applicationreconfiguration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONRECONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATIONRECONFIGURATION(5, "Applicationreconfiguration", "Applicationreconfiguration"),

	/**
	 * The '<em><b>Compositereconfiguration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITERECONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITERECONFIGURATION(6, "Compositereconfiguration", "Compositereconfiguration");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="define desired action"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Basicaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basicaction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASICACTION
	 * @model name="Basicaction"
	 * @generated
	 * @ordered
	 */
	public static final int BASICACTION_VALUE = 1;

	/**
	 * The '<em><b>Migration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Migration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIGRATION
	 * @model name="Migration"
	 * @generated
	 * @ordered
	 */
	public static final int MIGRATION_VALUE = 2;

	/**
	 * The '<em><b>Horizontalscaling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontalscaling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSCALING
	 * @model name="Horizontalscaling"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTALSCALING_VALUE = 3;

	/**
	 * The '<em><b>Verticalscaling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verticalscaling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICALSCALING
	 * @model name="Verticalscaling"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICALSCALING_VALUE = 4;

	/**
	 * The '<em><b>Applicationreconfiguration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Applicationreconfiguration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONRECONFIGURATION
	 * @model name="Applicationreconfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATIONRECONFIGURATION_VALUE = 5;

	/**
	 * The '<em><b>Compositereconfiguration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compositereconfiguration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITERECONFIGURATION
	 * @model name="Compositereconfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITERECONFIGURATION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reconfigurationactiontype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Reconfigurationactiontype[] VALUES_ARRAY =
		new Reconfigurationactiontype[] {
			DEFAULT,
			BASICACTION,
			MIGRATION,
			HORIZONTALSCALING,
			VERTICALSCALING,
			APPLICATIONRECONFIGURATION,
			COMPOSITERECONFIGURATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Reconfigurationactiontype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Reconfigurationactiontype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reconfigurationactiontype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reconfigurationactiontype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Reconfigurationactiontype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconfigurationactiontype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reconfigurationactiontype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Reconfigurationactiontype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconfigurationactiontype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reconfigurationactiontype get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case BASICACTION_VALUE: return BASICACTION;
			case MIGRATION_VALUE: return MIGRATION;
			case HORIZONTALSCALING_VALUE: return HORIZONTALSCALING;
			case VERTICALSCALING_VALUE: return VERTICALSCALING;
			case APPLICATIONRECONFIGURATION_VALUE: return APPLICATIONRECONFIGURATION;
			case COMPOSITERECONFIGURATION_VALUE: return COMPOSITERECONFIGURATION;
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
	private Reconfigurationactiontype(int value, String name, String literal) {
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
	
} //Reconfigurationactiontype
