/**
 */
package graph.impl;

import eDFDFlowTracking.ResponsibilityType;

import graph.GraphAsset;
import graph.GraphPackage;
import graph.NodeResponsibility;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getID <em>ID</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getOutgoingassets <em>Outgoingassets</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getIncomingassets <em>Incomingassets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeResponsibilityImpl extends MinimalEObjectImpl.Container implements NodeResponsibility {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibilityType> operation;

	/**
	 * The cached value of the '{@link #getOutgoingassets() <em>Outgoingassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingassets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphAsset> outgoingassets;

	/**
	 * The cached value of the '{@link #getIncomingassets() <em>Incomingassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingassets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphAsset> incomingassets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE_RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE_RESPONSIBILITY__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE_RESPONSIBILITY__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibilityType> getOperation() {
		if (operation == null) {
			operation = new EDataTypeUniqueEList<ResponsibilityType>(ResponsibilityType.class, this,
					GraphPackage.NODE_RESPONSIBILITY__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphAsset> getOutgoingassets() {
		if (outgoingassets == null) {
			outgoingassets = new EObjectResolvingEList<GraphAsset>(GraphAsset.class, this,
					GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS);
		}
		return outgoingassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphAsset> getIncomingassets() {
		if (incomingassets == null) {
			incomingassets = new EObjectResolvingEList<GraphAsset>(GraphAsset.class, this,
					GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS);
		}
		return incomingassets;
	}

	/**
	 * The cached invocation delegate for the '{@link #findMostRestrictiveLabel() <em>Find Most Restrictive Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #findMostRestrictiveLabel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_MOST_RESTRICTIVE_LABEL__EINVOCATION_DELEGATE = ((EOperation.Internal) GraphPackage.Literals.NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger findMostRestrictiveLabel() {
		try {
			return (BigInteger) FIND_MOST_RESTRICTIVE_LABEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #findLeastRestrictiveLabel() <em>Find Least Restrictive Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #findLeastRestrictiveLabel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_LEAST_RESTRICTIVE_LABEL__EINVOCATION_DELEGATE = ((EOperation.Internal) GraphPackage.Literals.NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger findLeastRestrictiveLabel() {
		try {
			return (BigInteger) FIND_LEAST_RESTRICTIVE_LABEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.NODE_RESPONSIBILITY__ID:
			return getID();
		case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
			return getNumber();
		case GraphPackage.NODE_RESPONSIBILITY__OPERATION:
			return getOperation();
		case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
			return getOutgoingassets();
		case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
			return getIncomingassets();
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
		case GraphPackage.NODE_RESPONSIBILITY__ID:
			setID((String) newValue);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
			setNumber((Integer) newValue);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends ResponsibilityType>) newValue);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
			getOutgoingassets().clear();
			getOutgoingassets().addAll((Collection<? extends GraphAsset>) newValue);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
			getIncomingassets().clear();
			getIncomingassets().addAll((Collection<? extends GraphAsset>) newValue);
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
		case GraphPackage.NODE_RESPONSIBILITY__ID:
			setID(ID_EDEFAULT);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case GraphPackage.NODE_RESPONSIBILITY__OPERATION:
			getOperation().clear();
			return;
		case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
			getOutgoingassets().clear();
			return;
		case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
			getIncomingassets().clear();
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
		case GraphPackage.NODE_RESPONSIBILITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
			return number != NUMBER_EDEFAULT;
		case GraphPackage.NODE_RESPONSIBILITY__OPERATION:
			return operation != null && !operation.isEmpty();
		case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
			return outgoingassets != null && !outgoingassets.isEmpty();
		case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
			return incomingassets != null && !incomingassets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GraphPackage.NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL:
			return findMostRestrictiveLabel();
		case GraphPackage.NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL:
			return findLeastRestrictiveLabel();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", number: ");
		result.append(number);
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //NodeResponsibilityImpl
