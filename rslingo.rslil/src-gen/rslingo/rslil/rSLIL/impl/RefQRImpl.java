/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefQR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefQRImpl#getRefQR <em>Ref QR</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefQRImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefQRImpl extends MinimalEObjectImpl.Container implements RefQR
{
  /**
   * The cached value of the '{@link #getRefQR() <em>Ref QR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefQR()
   * @generated
   * @ordered
   */
  protected QR refQR;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<QR> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefQRImpl()
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
    return RSLILPackage.Literals.REF_QR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR getRefQR()
  {
    if (refQR != null && refQR.eIsProxy())
    {
      InternalEObject oldRefQR = (InternalEObject)refQR;
      refQR = (QR)eResolveProxy(oldRefQR);
      if (refQR != oldRefQR)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_QR__REF_QR, oldRefQR, refQR));
      }
    }
    return refQR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR basicGetRefQR()
  {
    return refQR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefQR(QR newRefQR)
  {
    QR oldRefQR = refQR;
    refQR = newRefQR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_QR__REF_QR, oldRefQR, refQR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QR> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<QR>(QR.class, this, RSLILPackage.REF_QR__REFS);
    }
    return refs;
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
      case RSLILPackage.REF_QR__REF_QR:
        if (resolve) return getRefQR();
        return basicGetRefQR();
      case RSLILPackage.REF_QR__REFS:
        return getRefs();
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
      case RSLILPackage.REF_QR__REF_QR:
        setRefQR((QR)newValue);
        return;
      case RSLILPackage.REF_QR__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends QR>)newValue);
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
      case RSLILPackage.REF_QR__REF_QR:
        setRefQR((QR)null);
        return;
      case RSLILPackage.REF_QR__REFS:
        getRefs().clear();
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
      case RSLILPackage.REF_QR__REF_QR:
        return refQR != null;
      case RSLILPackage.REF_QR__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefQRImpl
