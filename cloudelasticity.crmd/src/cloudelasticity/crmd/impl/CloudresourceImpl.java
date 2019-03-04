/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.C_Resourcetype;
import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.Cloudresource;
import cloudelasticity.crmd.Group;
import cloudelasticity.crmd.Resourceconstraint;
import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloudresource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.CloudresourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CloudresourceImpl#getC_sm <em>Csm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CloudresourceImpl#getC_rconstraint <em>Crconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CloudresourceImpl#getC_rrequirment <em>Crrequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CloudresourceImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudresourceImpl extends cRDMEntityImpl implements Cloudresource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final C_Resourcetype TYPE_EDEFAULT = C_Resourcetype.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected C_Resourcetype type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getC_sm() <em>Csm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<C_SM> c_sm;

	/**
	 * The cached value of the '{@link #getC_rconstraint() <em>Crconstraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_rconstraint()
	 * @generated
	 * @ordered
	 */
	protected Resourceconstraint c_rconstraint;

	/**
	 * The cached value of the '{@link #getC_rrequirment() <em>Crrequirment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_rrequirment()
	 * @generated
	 * @ordered
	 */
	protected Resourcerequirment c_rrequirment;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudresourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.CLOUDRESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_Resourcetype getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(C_Resourcetype newType) {
		C_Resourcetype oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CLOUDRESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_SM> getC_sm() {
		if (c_sm == null) {
			c_sm = new EObjectResolvingEList<C_SM>(C_SM.class, this, crmdPackage.CLOUDRESOURCE__CSM);
		}
		return c_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceconstraint getC_rconstraint() {
		if (c_rconstraint != null && c_rconstraint.eIsProxy()) {
			InternalEObject oldC_rconstraint = (InternalEObject)c_rconstraint;
			c_rconstraint = (Resourceconstraint)eResolveProxy(oldC_rconstraint);
			if (c_rconstraint != oldC_rconstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.CLOUDRESOURCE__CRCONSTRAINT, oldC_rconstraint, c_rconstraint));
			}
		}
		return c_rconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceconstraint basicGetC_rconstraint() {
		return c_rconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_rconstraint(Resourceconstraint newC_rconstraint) {
		Resourceconstraint oldC_rconstraint = c_rconstraint;
		c_rconstraint = newC_rconstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CLOUDRESOURCE__CRCONSTRAINT, oldC_rconstraint, c_rconstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerequirment getC_rrequirment() {
		if (c_rrequirment != null && c_rrequirment.eIsProxy()) {
			InternalEObject oldC_rrequirment = (InternalEObject)c_rrequirment;
			c_rrequirment = (Resourcerequirment)eResolveProxy(oldC_rrequirment);
			if (c_rrequirment != oldC_rrequirment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.CLOUDRESOURCE__CRREQUIRMENT, oldC_rrequirment, c_rrequirment));
			}
		}
		return c_rrequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerequirment basicGetC_rrequirment() {
		return c_rrequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_rrequirment(Resourcerequirment newC_rrequirment) {
		Resourcerequirment oldC_rrequirment = c_rrequirment;
		c_rrequirment = newC_rrequirment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CLOUDRESOURCE__CRREQUIRMENT, oldC_rrequirment, c_rrequirment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<Group>(Group.class, this, crmdPackage.CLOUDRESOURCE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.CLOUDRESOURCE__TYPE:
				return getType();
			case crmdPackage.CLOUDRESOURCE__CSM:
				return getC_sm();
			case crmdPackage.CLOUDRESOURCE__CRCONSTRAINT:
				if (resolve) return getC_rconstraint();
				return basicGetC_rconstraint();
			case crmdPackage.CLOUDRESOURCE__CRREQUIRMENT:
				if (resolve) return getC_rrequirment();
				return basicGetC_rrequirment();
			case crmdPackage.CLOUDRESOURCE__MEMBER:
				return getMember();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case crmdPackage.CLOUDRESOURCE__TYPE:
				setType((C_Resourcetype)newValue);
				return;
			case crmdPackage.CLOUDRESOURCE__CSM:
				getC_sm().clear();
				getC_sm().addAll((Collection<? extends C_SM>)newValue);
				return;
			case crmdPackage.CLOUDRESOURCE__CRCONSTRAINT:
				setC_rconstraint((Resourceconstraint)newValue);
				return;
			case crmdPackage.CLOUDRESOURCE__CRREQUIRMENT:
				setC_rrequirment((Resourcerequirment)newValue);
				return;
			case crmdPackage.CLOUDRESOURCE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Group>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case crmdPackage.CLOUDRESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case crmdPackage.CLOUDRESOURCE__CSM:
				getC_sm().clear();
				return;
			case crmdPackage.CLOUDRESOURCE__CRCONSTRAINT:
				setC_rconstraint((Resourceconstraint)null);
				return;
			case crmdPackage.CLOUDRESOURCE__CRREQUIRMENT:
				setC_rrequirment((Resourcerequirment)null);
				return;
			case crmdPackage.CLOUDRESOURCE__MEMBER:
				getMember().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case crmdPackage.CLOUDRESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case crmdPackage.CLOUDRESOURCE__CSM:
				return c_sm != null && !c_sm.isEmpty();
			case crmdPackage.CLOUDRESOURCE__CRCONSTRAINT:
				return c_rconstraint != null;
			case crmdPackage.CLOUDRESOURCE__CRREQUIRMENT:
				return c_rrequirment != null;
			case crmdPackage.CLOUDRESOURCE__MEMBER:
				return member != null && !member.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CloudresourceImpl
