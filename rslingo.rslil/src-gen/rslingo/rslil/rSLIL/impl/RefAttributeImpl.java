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

import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefAttributeImpl#getRefAttr <em>Ref Attr</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefAttributeImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefAttributeImpl extends MinimalEObjectImpl.Container implements RefAttribute
{
  /**
   * The cached value of the '{@link #getRefAttr() <em>Ref Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAttr()
   * @generated
   * @ordered
   */
  protected Attribute refAttr;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Attribute> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefAttributeImpl()
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
    return RSLILPackage.Literals.REF_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRefAttr()
  {
    if (refAttr != null && refAttr.eIsProxy())
    {
      InternalEObject oldRefAttr = (InternalEObject)refAttr;
      refAttr = (Attribute)eResolveProxy(oldRefAttr);
      if (refAttr != oldRefAttr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_ATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
      }
    }
    return refAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRefAttr()
  {
    return refAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAttr(Attribute newRefAttr)
  {
    Attribute oldRefAttr = refAttr;
    refAttr = newRefAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_ATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Attribute>(Attribute.class, this, RSLILPackage.REF_ATTRIBUTE__REFS);
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
      case RSLILPackage.REF_ATTRIBUTE__REF_ATTR:
        if (resolve) return getRefAttr();
        return basicGetRefAttr();
      case RSLILPackage.REF_ATTRIBUTE__REFS:
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
      case RSLILPackage.REF_ATTRIBUTE__REF_ATTR:
        setRefAttr((Attribute)newValue);
        return;
      case RSLILPackage.REF_ATTRIBUTE__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Attribute>)newValue);
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
      case RSLILPackage.REF_ATTRIBUTE__REF_ATTR:
        setRefAttr((Attribute)null);
        return;
      case RSLILPackage.REF_ATTRIBUTE__REFS:
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
      case RSLILPackage.REF_ATTRIBUTE__REF_ATTR:
        return refAttr != null;
      case RSLILPackage.REF_ATTRIBUTE__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefAttributeImpl
