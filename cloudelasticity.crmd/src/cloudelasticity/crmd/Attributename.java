/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attributename</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getAttributename()
 * @model
 * @generated
 */
public enum Attributename implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "define attribute name"),

	/**
	 * The '<em><b>Operating System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATING_SYSTEM(8, "OperatingSystem", "Operating System"),

	/**
	 * The '<em><b>Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDER(7, "Provider", "Provider"),

	/**
	 * The '<em><b>Sharing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARING_VALUE
	 * @generated
	 * @ordered
	 */
	SHARING(4, "Sharing", "Sharing"),

	/**
	 * The '<em><b>Speed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED(3, "Speed", "Speed"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(5, "Location", "Location"),

	/**
	 * The '<em><b>CPU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_VALUE
	 * @generated
	 * @ordered
	 */
	CPU(1, "CPU", "CPU"),

	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(2, "Memory", "Memory"),

	/**
	 * The '<em><b>Instances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCES(6, "Instances", "Instances"),

	/**
	 * The '<em><b>Architecture</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECTURE(10, "Architecture", "Architecture"),

	/**
	 * The '<em><b>Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(9, "Storage", "Storage");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="define attribute name"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Operating System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operating System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM
	 * @model name="OperatingSystem" literal="Operating System"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SYSTEM_VALUE = 8;

	/**
	 * The '<em><b>Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDER
	 * @model name="Provider"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDER_VALUE = 7;

	/**
	 * The '<em><b>Sharing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sharing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHARING
	 * @model name="Sharing"
	 * @generated
	 * @ordered
	 */
	public static final int SHARING_VALUE = 4;

	/**
	 * The '<em><b>Speed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Speed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEED
	 * @model name="Speed"
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_VALUE = 3;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 5;

	/**
	 * The '<em><b>CPU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPU_VALUE = 1;

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model name="Memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 2;

	/**
	 * The '<em><b>Instances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instances</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANCES
	 * @model name="Instances"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCES_VALUE = 6;

	/**
	 * The '<em><b>Architecture</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Architecture</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE
	 * @model name="Architecture"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECTURE_VALUE = 10;

	/**
	 * The '<em><b>Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model name="Storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Attributename</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Attributename[] VALUES_ARRAY =
		new Attributename[] {
			DEFAULT,
			OPERATING_SYSTEM,
			PROVIDER,
			SHARING,
			SPEED,
			LOCATION,
			CPU,
			MEMORY,
			INSTANCES,
			ARCHITECTURE,
			STORAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Attributename</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Attributename> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attributename</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attributename get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Attributename result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attributename</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attributename getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Attributename result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attributename</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attributename get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case OPERATING_SYSTEM_VALUE: return OPERATING_SYSTEM;
			case PROVIDER_VALUE: return PROVIDER;
			case SHARING_VALUE: return SHARING;
			case SPEED_VALUE: return SPEED;
			case LOCATION_VALUE: return LOCATION;
			case CPU_VALUE: return CPU;
			case MEMORY_VALUE: return MEMORY;
			case INSTANCES_VALUE: return INSTANCES;
			case ARCHITECTURE_VALUE: return ARCHITECTURE;
			case STORAGE_VALUE: return STORAGE;
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
	private Attributename(int value, String name, String literal) {
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
	
} //Attributename
