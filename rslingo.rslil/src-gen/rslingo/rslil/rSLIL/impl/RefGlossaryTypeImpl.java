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

import rslingo.rslil.rSLIL.GlossaryType;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefGlossaryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Glossary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefGlossaryTypeImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefGlossaryTypeImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefGlossaryTypeImpl extends MinimalEObjectImpl.Container implements RefGlossaryType
{
  /**
   * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected GlossaryType refType;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<GlossaryType> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefGlossaryTypeImpl()
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
    return RSLILPackage.Literals.REF_GLOSSARY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryType getRefType()
  {
    return refType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefType(GlossaryType newRefType, NotificationChain msgs)
  {
    GlossaryType oldRefType = refType;
    refType = newRefType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE, oldRefType, newRefType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefType(GlossaryType newRefType)
  {
    if (newRefType != refType)
    {
      NotificationChain msgs = null;
      if (refType != null)
        msgs = ((InternalEObject)refType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE, null, msgs);
      if (newRefType != null)
        msgs = ((InternalEObject)newRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE, null, msgs);
      msgs = basicSetRefType(newRefType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE, newRefType, newRefType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlossaryType> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectContainmentEList<GlossaryType>(GlossaryType.class, this, RSLILPackage.REF_GLOSSARY_TYPE__REFS);
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
      case RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE:
        return basicSetRefType(null, msgs);
      case RSLILPackage.REF_GLOSSARY_TYPE__REFS:
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
      case RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE:
        return getRefType();
      case RSLILPackage.REF_GLOSSARY_TYPE__REFS:
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
      case RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE:
        setRefType((GlossaryType)newValue);
        return;
      case RSLILPackage.REF_GLOSSARY_TYPE__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends GlossaryType>)newValue);
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
      case RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE:
        setRefType((GlossaryType)null);
        return;
      case RSLILPackage.REF_GLOSSARY_TYPE__REFS:
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
      case RSLILPackage.REF_GLOSSARY_TYPE__REF_TYPE:
        return refType != null;
      case RSLILPackage.REF_GLOSSARY_TYPE__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefGlossaryTypeImpl
