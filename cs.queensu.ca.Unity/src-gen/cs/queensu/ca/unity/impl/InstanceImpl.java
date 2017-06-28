/**
 * generated by Xtext 2.12.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.UnityObject;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.InstanceImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends PropertyImpl implements Instance
{
  /**
   * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceType()
   * @generated
   * @ordered
   */
  protected UnityObject instanceType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnityPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnityObject getInstanceType()
  {
    if (instanceType != null && instanceType.eIsProxy())
    {
      InternalEObject oldInstanceType = (InternalEObject)instanceType;
      instanceType = (UnityObject)eResolveProxy(oldInstanceType);
      if (instanceType != oldInstanceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnityPackage.INSTANCE__INSTANCE_TYPE, oldInstanceType, instanceType));
      }
    }
    return instanceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnityObject basicGetInstanceType()
  {
    return instanceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstanceType(UnityObject newInstanceType)
  {
    UnityObject oldInstanceType = instanceType;
    instanceType = newInstanceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.INSTANCE__INSTANCE_TYPE, oldInstanceType, instanceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnityPackage.INSTANCE__INSTANCE_TYPE:
        if (resolve) return getInstanceType();
        return basicGetInstanceType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnityPackage.INSTANCE__INSTANCE_TYPE:
        setInstanceType((UnityObject)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.INSTANCE__INSTANCE_TYPE:
        setInstanceType((UnityObject)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.INSTANCE__INSTANCE_TYPE:
        return instanceType != null;
    }
    return super.eIsSet(featureID);
  }

} //InstanceImpl
