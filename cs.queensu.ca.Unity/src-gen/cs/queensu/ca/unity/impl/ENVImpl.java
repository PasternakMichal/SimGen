/**
 * generated by Xtext 2.12.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Channel;
import cs.queensu.ca.unity.ENV;
import cs.queensu.ca.unity.Init;
import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.Map;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.UnityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getInitCodes <em>Init Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENVImpl extends MinimalEObjectImpl.Container implements ENV
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

  /**
   * The cached value of the '{@link #getMaps() <em>Maps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaps()
   * @generated
   * @ordered
   */
  protected EList<Map> maps;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> instances;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getInitCodes() <em>Init Codes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitCodes()
   * @generated
   * @ordered
   */
  protected Init initCodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENVImpl()
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
    return UnityPackage.Literals.ENV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectContainmentEList<Channel>(Channel.class, this, UnityPackage.ENV__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Map> getMaps()
  {
    if (maps == null)
    {
      maps = new EObjectContainmentEList<Map>(Map.class, this, UnityPackage.ENV__MAPS);
    }
    return maps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, UnityPackage.ENV__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, UnityPackage.ENV__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init getInitCodes()
  {
    return initCodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitCodes(Init newInitCodes, NotificationChain msgs)
  {
    Init oldInitCodes = initCodes;
    initCodes = newInitCodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__INIT_CODES, oldInitCodes, newInitCodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitCodes(Init newInitCodes)
  {
    if (newInitCodes != initCodes)
    {
      NotificationChain msgs = null;
      if (initCodes != null)
        msgs = ((InternalEObject)initCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__INIT_CODES, null, msgs);
      if (newInitCodes != null)
        msgs = ((InternalEObject)newInitCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__INIT_CODES, null, msgs);
      msgs = basicSetInitCodes(newInitCodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__INIT_CODES, newInitCodes, newInitCodes));
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
      case UnityPackage.ENV__CHANNELS:
        return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__MAPS:
        return ((InternalEList<?>)getMaps()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__INIT_CODES:
        return basicSetInitCodes(null, msgs);
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
      case UnityPackage.ENV__NAME:
        return getName();
      case UnityPackage.ENV__CHANNELS:
        return getChannels();
      case UnityPackage.ENV__MAPS:
        return getMaps();
      case UnityPackage.ENV__INSTANCES:
        return getInstances();
      case UnityPackage.ENV__PROPERTIES:
        return getProperties();
      case UnityPackage.ENV__INIT_CODES:
        return getInitCodes();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnityPackage.ENV__NAME:
        setName((String)newValue);
        return;
      case UnityPackage.ENV__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case UnityPackage.ENV__MAPS:
        getMaps().clear();
        getMaps().addAll((Collection<? extends Map>)newValue);
        return;
      case UnityPackage.ENV__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case UnityPackage.ENV__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case UnityPackage.ENV__INIT_CODES:
        setInitCodes((Init)newValue);
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
      case UnityPackage.ENV__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UnityPackage.ENV__CHANNELS:
        getChannels().clear();
        return;
      case UnityPackage.ENV__MAPS:
        getMaps().clear();
        return;
      case UnityPackage.ENV__INSTANCES:
        getInstances().clear();
        return;
      case UnityPackage.ENV__PROPERTIES:
        getProperties().clear();
        return;
      case UnityPackage.ENV__INIT_CODES:
        setInitCodes((Init)null);
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
      case UnityPackage.ENV__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UnityPackage.ENV__CHANNELS:
        return channels != null && !channels.isEmpty();
      case UnityPackage.ENV__MAPS:
        return maps != null && !maps.isEmpty();
      case UnityPackage.ENV__INSTANCES:
        return instances != null && !instances.isEmpty();
      case UnityPackage.ENV__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case UnityPackage.ENV__INIT_CODES:
        return initCodes != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ENVImpl
