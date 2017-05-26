/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.AreaName;
import cs.queensu.ca.unity.Channel;
import cs.queensu.ca.unity.Port;
import cs.queensu.ca.unity.QName;
import cs.queensu.ca.unity.UnityPackage;
import cs.queensu.ca.unity.interfaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getType <em>Type</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getPort <em>Port</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getAreaname <em>Areaname</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getQname <em>Qname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends MinimalEObjectImpl.Container implements Channel
{
  /**
   * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected String interfaceName = INTERFACE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected interfaceType type;

  /**
   * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected static final int CARDINALITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected int cardinality = CARDINALITY_EDEFAULT;

  /**
   * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected static final String IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected String ip = IP_EDEFAULT;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * The cached value of the '{@link #getAreaname() <em>Areaname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreaname()
   * @generated
   * @ordered
   */
  protected AreaName areaname;

  /**
   * The cached value of the '{@link #getQname() <em>Qname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQname()
   * @generated
   * @ordered
   */
  protected QName qname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChannelImpl()
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
    return UnityPackage.Literals.CHANNEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceName()
  {
    return interfaceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceName(String newInterfaceName)
  {
    String oldInterfaceName = interfaceName;
    interfaceName = newInterfaceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__INTERFACE_NAME, oldInterfaceName, interfaceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interfaceType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(interfaceType newType, NotificationChain msgs)
  {
    interfaceType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(interfaceType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinality(int newCardinality)
  {
    int oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__CARDINALITY, oldCardinality, cardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp(String newIp)
  {
    String oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__IP, oldIp, ip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(Port newPort, NotificationChain msgs)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(Port newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AreaName getAreaname()
  {
    return areaname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAreaname(AreaName newAreaname, NotificationChain msgs)
  {
    AreaName oldAreaname = areaname;
    areaname = newAreaname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__AREANAME, oldAreaname, newAreaname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAreaname(AreaName newAreaname)
  {
    if (newAreaname != areaname)
    {
      NotificationChain msgs = null;
      if (areaname != null)
        msgs = ((InternalEObject)areaname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__AREANAME, null, msgs);
      if (newAreaname != null)
        msgs = ((InternalEObject)newAreaname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__AREANAME, null, msgs);
      msgs = basicSetAreaname(newAreaname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__AREANAME, newAreaname, newAreaname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName getQname()
  {
    return qname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQname(QName newQname, NotificationChain msgs)
  {
    QName oldQname = qname;
    qname = newQname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__QNAME, oldQname, newQname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQname(QName newQname)
  {
    if (newQname != qname)
    {
      NotificationChain msgs = null;
      if (qname != null)
        msgs = ((InternalEObject)qname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__QNAME, null, msgs);
      if (newQname != null)
        msgs = ((InternalEObject)newQname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__QNAME, null, msgs);
      msgs = basicSetQname(newQname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__QNAME, newQname, newQname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UnityPackage.CHANNEL__TYPE:
        return basicSetType(null, msgs);
      case UnityPackage.CHANNEL__PORT:
        return basicSetPort(null, msgs);
      case UnityPackage.CHANNEL__AREANAME:
        return basicSetAreaname(null, msgs);
      case UnityPackage.CHANNEL__QNAME:
        return basicSetQname(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UnityPackage.CHANNEL__INTERFACE_NAME:
        return getInterfaceName();
      case UnityPackage.CHANNEL__TYPE:
        return getType();
      case UnityPackage.CHANNEL__CARDINALITY:
        return getCardinality();
      case UnityPackage.CHANNEL__IP:
        return getIp();
      case UnityPackage.CHANNEL__PORT:
        return getPort();
      case UnityPackage.CHANNEL__AREANAME:
        return getAreaname();
      case UnityPackage.CHANNEL__QNAME:
        return getQname();
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
      case UnityPackage.CHANNEL__INTERFACE_NAME:
        setInterfaceName((String)newValue);
        return;
      case UnityPackage.CHANNEL__TYPE:
        setType((interfaceType)newValue);
        return;
      case UnityPackage.CHANNEL__CARDINALITY:
        setCardinality((Integer)newValue);
        return;
      case UnityPackage.CHANNEL__IP:
        setIp((String)newValue);
        return;
      case UnityPackage.CHANNEL__PORT:
        setPort((Port)newValue);
        return;
      case UnityPackage.CHANNEL__AREANAME:
        setAreaname((AreaName)newValue);
        return;
      case UnityPackage.CHANNEL__QNAME:
        setQname((QName)newValue);
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
      case UnityPackage.CHANNEL__INTERFACE_NAME:
        setInterfaceName(INTERFACE_NAME_EDEFAULT);
        return;
      case UnityPackage.CHANNEL__TYPE:
        setType((interfaceType)null);
        return;
      case UnityPackage.CHANNEL__CARDINALITY:
        setCardinality(CARDINALITY_EDEFAULT);
        return;
      case UnityPackage.CHANNEL__IP:
        setIp(IP_EDEFAULT);
        return;
      case UnityPackage.CHANNEL__PORT:
        setPort((Port)null);
        return;
      case UnityPackage.CHANNEL__AREANAME:
        setAreaname((AreaName)null);
        return;
      case UnityPackage.CHANNEL__QNAME:
        setQname((QName)null);
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
      case UnityPackage.CHANNEL__INTERFACE_NAME:
        return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
      case UnityPackage.CHANNEL__TYPE:
        return type != null;
      case UnityPackage.CHANNEL__CARDINALITY:
        return cardinality != CARDINALITY_EDEFAULT;
      case UnityPackage.CHANNEL__IP:
        return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
      case UnityPackage.CHANNEL__PORT:
        return port != null;
      case UnityPackage.CHANNEL__AREANAME:
        return areaname != null;
      case UnityPackage.CHANNEL__QNAME:
        return qname != null;
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
    result.append(" (interfaceName: ");
    result.append(interfaceName);
    result.append(", cardinality: ");
    result.append(cardinality);
    result.append(", ip: ");
    result.append(ip);
    result.append(')');
    return result.toString();
  }

} //ChannelImpl