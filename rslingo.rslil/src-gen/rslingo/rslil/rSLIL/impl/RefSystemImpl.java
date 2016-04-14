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

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefSystemImpl#getRefSystem <em>Ref System</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefSystemImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefSystemImpl extends MinimalEObjectImpl.Container implements RefSystem
{
  /**
   * The cached value of the '{@link #getRefSystem() <em>Ref System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSystem()
   * @generated
   * @ordered
   */
  protected rslingo.rslil.rSLIL.System refSystem;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<rslingo.rslil.rSLIL.System> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefSystemImpl()
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
    return RSLILPackage.Literals.REF_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System getRefSystem()
  {
    if (refSystem != null && refSystem.eIsProxy())
    {
      InternalEObject oldRefSystem = (InternalEObject)refSystem;
      refSystem = (rslingo.rslil.rSLIL.System)eResolveProxy(oldRefSystem);
      if (refSystem != oldRefSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_SYSTEM__REF_SYSTEM, oldRefSystem, refSystem));
      }
    }
    return refSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System basicGetRefSystem()
  {
    return refSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefSystem(rslingo.rslil.rSLIL.System newRefSystem)
  {
    rslingo.rslil.rSLIL.System oldRefSystem = refSystem;
    refSystem = newRefSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_SYSTEM__REF_SYSTEM, oldRefSystem, refSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rslingo.rslil.rSLIL.System> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<rslingo.rslil.rSLIL.System>(rslingo.rslil.rSLIL.System.class, this, RSLILPackage.REF_SYSTEM__REFS);
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
      case RSLILPackage.REF_SYSTEM__REF_SYSTEM:
        if (resolve) return getRefSystem();
        return basicGetRefSystem();
      case RSLILPackage.REF_SYSTEM__REFS:
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
      case RSLILPackage.REF_SYSTEM__REF_SYSTEM:
        setRefSystem((rslingo.rslil.rSLIL.System)newValue);
        return;
      case RSLILPackage.REF_SYSTEM__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends rslingo.rslil.rSLIL.System>)newValue);
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
      case RSLILPackage.REF_SYSTEM__REF_SYSTEM:
        setRefSystem((rslingo.rslil.rSLIL.System)null);
        return;
      case RSLILPackage.REF_SYSTEM__REFS:
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
      case RSLILPackage.REF_SYSTEM__REF_SYSTEM:
        return refSystem != null;
      case RSLILPackage.REF_SYSTEM__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefSystemImpl
