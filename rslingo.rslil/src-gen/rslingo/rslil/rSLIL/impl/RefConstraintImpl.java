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

import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefConstraintImpl#getRefConst <em>Ref Const</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefConstraintImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefConstraintImpl extends MinimalEObjectImpl.Container implements RefConstraint
{
  /**
   * The cached value of the '{@link #getRefConst() <em>Ref Const</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefConst()
   * @generated
   * @ordered
   */
  protected Constraint refConst;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Constraint> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefConstraintImpl()
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
    return RSLILPackage.Literals.REF_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getRefConst()
  {
    if (refConst != null && refConst.eIsProxy())
    {
      InternalEObject oldRefConst = (InternalEObject)refConst;
      refConst = (Constraint)eResolveProxy(oldRefConst);
      if (refConst != oldRefConst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_CONSTRAINT__REF_CONST, oldRefConst, refConst));
      }
    }
    return refConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint basicGetRefConst()
  {
    return refConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefConst(Constraint newRefConst)
  {
    Constraint oldRefConst = refConst;
    refConst = newRefConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_CONSTRAINT__REF_CONST, oldRefConst, refConst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Constraint>(Constraint.class, this, RSLILPackage.REF_CONSTRAINT__REFS);
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
      case RSLILPackage.REF_CONSTRAINT__REF_CONST:
        if (resolve) return getRefConst();
        return basicGetRefConst();
      case RSLILPackage.REF_CONSTRAINT__REFS:
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
      case RSLILPackage.REF_CONSTRAINT__REF_CONST:
        setRefConst((Constraint)newValue);
        return;
      case RSLILPackage.REF_CONSTRAINT__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Constraint>)newValue);
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
      case RSLILPackage.REF_CONSTRAINT__REF_CONST:
        setRefConst((Constraint)null);
        return;
      case RSLILPackage.REF_CONSTRAINT__REFS:
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
      case RSLILPackage.REF_CONSTRAINT__REF_CONST:
        return refConst != null;
      case RSLILPackage.REF_CONSTRAINT__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefConstraintImpl
