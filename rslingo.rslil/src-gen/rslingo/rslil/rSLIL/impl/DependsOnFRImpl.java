/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.DependsOnFR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefFR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On FR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnFRImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnFRImpl#getRefFr <em>Ref Fr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependsOnFRImpl extends MinimalEObjectImpl.Container implements DependsOnFR
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
  protected RefFR refFr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependsOnFRImpl()
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
    return RSLILPackage.Literals.DEPENDS_ON_FR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_FR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefFR getRefFr()
  {
    return refFr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefFr(RefFR newRefFr, NotificationChain msgs)
  {
    RefFR oldRefFr = refFr;
    refFr = newRefFr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_FR__REF_FR, oldRefFr, newRefFr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefFr(RefFR newRefFr)
  {
    if (newRefFr != refFr)
    {
      NotificationChain msgs = null;
      if (refFr != null)
        msgs = ((InternalEObject)refFr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_FR__REF_FR, null, msgs);
      if (newRefFr != null)
        msgs = ((InternalEObject)newRefFr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_FR__REF_FR, null, msgs);
      msgs = basicSetRefFr(newRefFr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_FR__REF_FR, newRefFr, newRefFr));
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
      case RSLILPackage.DEPENDS_ON_FR__REF_FR:
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
      case RSLILPackage.DEPENDS_ON_FR__TYPE:
        return getType();
      case RSLILPackage.DEPENDS_ON_FR__REF_FR:
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
      case RSLILPackage.DEPENDS_ON_FR__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.DEPENDS_ON_FR__REF_FR:
        setRefFr((RefFR)newValue);
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
      case RSLILPackage.DEPENDS_ON_FR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.DEPENDS_ON_FR__REF_FR:
        setRefFr((RefFR)null);
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
      case RSLILPackage.DEPENDS_ON_FR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.DEPENDS_ON_FR__REF_FR:
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

} //DependsOnFRImpl
