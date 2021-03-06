/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Port;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.PortImpl#getPortnumber <em>Portnumber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port
{
  /**
   * The default value of the '{@link #getPortnumber() <em>Portnumber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnumber()
   * @generated
   * @ordered
   */
  protected static final int PORTNUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPortnumber() <em>Portnumber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnumber()
   * @generated
   * @ordered
   */
  protected int portnumber = PORTNUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return UnityPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPortnumber()
  {
    return portnumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortnumber(int newPortnumber)
  {
    int oldPortnumber = portnumber;
    portnumber = newPortnumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.PORT__PORTNUMBER, oldPortnumber, portnumber));
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
      case UnityPackage.PORT__PORTNUMBER:
        return getPortnumber();
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
      case UnityPackage.PORT__PORTNUMBER:
        setPortnumber((Integer)newValue);
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
      case UnityPackage.PORT__PORTNUMBER:
        setPortnumber(PORTNUMBER_EDEFAULT);
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
      case UnityPackage.PORT__PORTNUMBER:
        return portnumber != PORTNUMBER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (portnumber: ");
    result.append(portnumber);
    result.append(')');
    return result.toString();
  }

} //PortImpl
