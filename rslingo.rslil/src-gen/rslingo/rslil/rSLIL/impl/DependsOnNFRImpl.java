/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.DependsOnNFR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefNFR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On NFR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnNFRImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnNFRImpl#getRefFr <em>Ref Fr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependsOnNFRImpl extends MinimalEObjectImpl.Container implements DependsOnNFR
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefFr() <em>Ref Fr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefFr()
   * @generated
   * @ordered
   */
  protected RefNFR refFr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependsOnNFRImpl()
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
    return RSLILPackage.Literals.DEPENDS_ON_NFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_NFR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefNFR getRefFr()
  {
    return refFr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefFr(RefNFR newRefFr, NotificationChain msgs)
  {
    RefNFR oldRefFr = refFr;
    refFr = newRefFr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_NFR__REF_FR, oldRefFr, newRefFr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefFr(RefNFR newRefFr)
  {
    if (newRefFr != refFr)
    {
      NotificationChain msgs = null;
      if (refFr != null)
        msgs = ((InternalEObject)refFr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_NFR__REF_FR, null, msgs);
      if (newRefFr != null)
        msgs = ((InternalEObject)newRefFr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_NFR__REF_FR, null, msgs);
      msgs = basicSetRefFr(newRefFr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_NFR__REF_FR, newRefFr, newRefFr));
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
      case RSLILPackage.DEPENDS_ON_NFR__REF_FR:
        return basicSetRefFr(null, msgs);
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
      case RSLILPackage.DEPENDS_ON_NFR__TYPE:
        return getType();
      case RSLILPackage.DEPENDS_ON_NFR__REF_FR:
        return getRefFr();
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
      case RSLILPackage.DEPENDS_ON_NFR__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.DEPENDS_ON_NFR__REF_FR:
        setRefFr((RefNFR)newValue);
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
      case RSLILPackage.DEPENDS_ON_NFR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.DEPENDS_ON_NFR__REF_FR:
        setRefFr((RefNFR)null);
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
      case RSLILPackage.DEPENDS_ON_NFR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.DEPENDS_ON_NFR__REF_FR:
        return refFr != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DependsOnNFRImpl
