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
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref UC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefUCImpl#getRefUC <em>Ref UC</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefUCImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefUCImpl extends MinimalEObjectImpl.Container implements RefUC
{
  /**
   * The cached value of the '{@link #getRefUC() <em>Ref UC</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefUC()
   * @generated
   * @ordered
   */
  protected UseCase refUC;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<UseCase> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefUCImpl()
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
    return RSLILPackage.Literals.REF_UC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getRefUC()
  {
    if (refUC != null && refUC.eIsProxy())
    {
      InternalEObject oldRefUC = (InternalEObject)refUC;
      refUC = (UseCase)eResolveProxy(oldRefUC);
      if (refUC != oldRefUC)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_UC__REF_UC, oldRefUC, refUC));
      }
    }
    return refUC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetRefUC()
  {
    return refUC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefUC(UseCase newRefUC)
  {
    UseCase oldRefUC = refUC;
    refUC = newRefUC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_UC__REF_UC, oldRefUC, refUC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<UseCase>(UseCase.class, this, RSLILPackage.REF_UC__REFS);
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
      case RSLILPackage.REF_UC__REF_UC:
        if (resolve) return getRefUC();
        return basicGetRefUC();
      case RSLILPackage.REF_UC__REFS:
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
      case RSLILPackage.REF_UC__REF_UC:
        setRefUC((UseCase)newValue);
        return;
      case RSLILPackage.REF_UC__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends UseCase>)newValue);
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
      case RSLILPackage.REF_UC__REF_UC:
        setRefUC((UseCase)null);
        return;
      case RSLILPackage.REF_UC__REFS:
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
      case RSLILPackage.REF_UC__REF_UC:
        return refUC != null;
      case RSLILPackage.REF_UC__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefUCImpl
