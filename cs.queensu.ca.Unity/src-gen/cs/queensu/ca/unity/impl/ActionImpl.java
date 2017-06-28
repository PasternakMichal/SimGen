/**
 * generated by Xtext 2.12.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Action;
import cs.queensu.ca.unity.Expression;
import cs.queensu.ca.unity.Payload;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ActionImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ActionImpl#getReturnPayload <em>Return Payload</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ActionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
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
   * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayload()
   * @generated
   * @ordered
   */
  protected Payload payload;

  /**
   * The cached value of the '{@link #getReturnPayload() <em>Return Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnPayload()
   * @generated
   * @ordered
   */
  protected Payload returnPayload;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return UnityPackage.Literals.ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Payload getPayload()
  {
    return payload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPayload(Payload newPayload, NotificationChain msgs)
  {
    Payload oldPayload = payload;
    payload = newPayload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ACTION__PAYLOAD, oldPayload, newPayload);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPayload(Payload newPayload)
  {
    if (newPayload != payload)
    {
      NotificationChain msgs = null;
      if (payload != null)
        msgs = ((InternalEObject)payload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ACTION__PAYLOAD, null, msgs);
      if (newPayload != null)
        msgs = ((InternalEObject)newPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ACTION__PAYLOAD, null, msgs);
      msgs = basicSetPayload(newPayload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ACTION__PAYLOAD, newPayload, newPayload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Payload getReturnPayload()
  {
    return returnPayload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnPayload(Payload newReturnPayload, NotificationChain msgs)
  {
    Payload oldReturnPayload = returnPayload;
    returnPayload = newReturnPayload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ACTION__RETURN_PAYLOAD, oldReturnPayload, newReturnPayload);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnPayload(Payload newReturnPayload)
  {
    if (newReturnPayload != returnPayload)
    {
      NotificationChain msgs = null;
      if (returnPayload != null)
        msgs = ((InternalEObject)returnPayload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ACTION__RETURN_PAYLOAD, null, msgs);
      if (newReturnPayload != null)
        msgs = ((InternalEObject)newReturnPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ACTION__RETURN_PAYLOAD, null, msgs);
      msgs = basicSetReturnPayload(newReturnPayload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ACTION__RETURN_PAYLOAD, newReturnPayload, newReturnPayload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, UnityPackage.ACTION__EXPRESSIONS);
    }
    return expressions;
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
      case UnityPackage.ACTION__PAYLOAD:
        return basicSetPayload(null, msgs);
      case UnityPackage.ACTION__RETURN_PAYLOAD:
        return basicSetReturnPayload(null, msgs);
      case UnityPackage.ACTION__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case UnityPackage.ACTION__NAME:
        return getName();
      case UnityPackage.ACTION__PAYLOAD:
        return getPayload();
      case UnityPackage.ACTION__RETURN_PAYLOAD:
        return getReturnPayload();
      case UnityPackage.ACTION__EXPRESSIONS:
        return getExpressions();
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
      case UnityPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case UnityPackage.ACTION__PAYLOAD:
        setPayload((Payload)newValue);
        return;
      case UnityPackage.ACTION__RETURN_PAYLOAD:
        setReturnPayload((Payload)newValue);
        return;
      case UnityPackage.ACTION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
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
      case UnityPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UnityPackage.ACTION__PAYLOAD:
        setPayload((Payload)null);
        return;
      case UnityPackage.ACTION__RETURN_PAYLOAD:
        setReturnPayload((Payload)null);
        return;
      case UnityPackage.ACTION__EXPRESSIONS:
        getExpressions().clear();
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
      case UnityPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UnityPackage.ACTION__PAYLOAD:
        return payload != null;
      case UnityPackage.ACTION__RETURN_PAYLOAD:
        return returnPayload != null;
      case UnityPackage.ACTION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
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

} //ActionImpl
