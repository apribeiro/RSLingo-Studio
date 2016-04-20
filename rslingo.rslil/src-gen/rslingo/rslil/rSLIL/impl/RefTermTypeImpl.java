/**
 */
package rslingo.rslil.rSLIL.impl;

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

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.TermType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Term Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefTermTypeImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefTermTypeImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefTermTypeImpl extends MinimalEObjectImpl.Container implements RefTermType
{
  /**
   * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected TermType refType;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<TermType> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefTermTypeImpl()
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
    return RSLILPackage.Literals.REF_TERM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermType getRefType()
  {
    return refType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefType(TermType newRefType, NotificationChain msgs)
  {
    TermType oldRefType = refType;
    refType = newRefType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_TERM_TYPE__REF_TYPE, oldRefType, newRefType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefType(TermType newRefType)
  {
    if (newRefType != refType)
    {
      NotificationChain msgs = null;
      if (refType != null)
        msgs = ((InternalEObject)refType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_TERM_TYPE__REF_TYPE, null, msgs);
      if (newRefType != null)
        msgs = ((InternalEObject)newRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_TERM_TYPE__REF_TYPE, null, msgs);
      msgs = basicSetRefType(newRefType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_TERM_TYPE__REF_TYPE, newRefType, newRefType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TermType> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectContainmentEList<TermType>(TermType.class, this, RSLILPackage.REF_TERM_TYPE__REFS);
    }
    return refs;
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
      case RSLILPackage.REF_TERM_TYPE__REF_TYPE:
        return basicSetRefType(null, msgs);
      case RSLILPackage.REF_TERM_TYPE__REFS:
        return ((InternalEList<?>)getRefs()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.REF_TERM_TYPE__REF_TYPE:
        return getRefType();
      case RSLILPackage.REF_TERM_TYPE__REFS:
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
      case RSLILPackage.REF_TERM_TYPE__REF_TYPE:
        setRefType((TermType)newValue);
        return;
      case RSLILPackage.REF_TERM_TYPE__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends TermType>)newValue);
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
      case RSLILPackage.REF_TERM_TYPE__REF_TYPE:
        setRefType((TermType)null);
        return;
      case RSLILPackage.REF_TERM_TYPE__REFS:
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
      case RSLILPackage.REF_TERM_TYPE__REF_TYPE:
        return refType != null;
      case RSLILPackage.REF_TERM_TYPE__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefTermTypeImpl
