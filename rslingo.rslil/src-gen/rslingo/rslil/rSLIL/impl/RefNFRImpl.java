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

import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefNFR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref NFR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefNFRImpl#getRefNFR <em>Ref NFR</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefNFRImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefNFRImpl extends MinimalEObjectImpl.Container implements RefNFR
{
  /**
   * The cached value of the '{@link #getRefNFR() <em>Ref NFR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefNFR()
   * @generated
   * @ordered
   */
  protected NFR refNFR;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<NFR> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefNFRImpl()
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
    return RSLILPackage.Literals.REF_NFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFR getRefNFR()
  {
    if (refNFR != null && refNFR.eIsProxy())
    {
      InternalEObject oldRefNFR = (InternalEObject)refNFR;
      refNFR = (NFR)eResolveProxy(oldRefNFR);
      if (refNFR != oldRefNFR)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_NFR__REF_NFR, oldRefNFR, refNFR));
      }
    }
    return refNFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFR basicGetRefNFR()
  {
    return refNFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefNFR(NFR newRefNFR)
  {
    NFR oldRefNFR = refNFR;
    refNFR = newRefNFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_NFR__REF_NFR, oldRefNFR, refNFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFR> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<NFR>(NFR.class, this, RSLILPackage.REF_NFR__REFS);
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
      case RSLILPackage.REF_NFR__REF_NFR:
        if (resolve) return getRefNFR();
        return basicGetRefNFR();
      case RSLILPackage.REF_NFR__REFS:
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
      case RSLILPackage.REF_NFR__REF_NFR:
        setRefNFR((NFR)newValue);
        return;
      case RSLILPackage.REF_NFR__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends NFR>)newValue);
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
      case RSLILPackage.REF_NFR__REF_NFR:
        setRefNFR((NFR)null);
        return;
      case RSLILPackage.REF_NFR__REFS:
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
      case RSLILPackage.REF_NFR__REF_NFR:
        return refNFR != null;
      case RSLILPackage.REF_NFR__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefNFRImpl
