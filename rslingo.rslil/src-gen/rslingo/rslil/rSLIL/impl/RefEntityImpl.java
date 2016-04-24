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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefEntityImpl#getRefEntity <em>Ref Entity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefEntityImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefEntityImpl#getRefType <em>Ref Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefEntityImpl extends MinimalEObjectImpl.Container implements RefEntity
{
  /**
   * The cached value of the '{@link #getRefEntity() <em>Ref Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEntity()
   * @generated
   * @ordered
   */
  protected Entity refEntity;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EntityType type;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Entity> refs;

  /**
   * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected EList<EntityType> refType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefEntityImpl()
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
    return RSLILPackage.Literals.REF_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getRefEntity()
  {
    if (refEntity != null && refEntity.eIsProxy())
    {
      InternalEObject oldRefEntity = (InternalEObject)refEntity;
      refEntity = (Entity)eResolveProxy(oldRefEntity);
      if (refEntity != oldRefEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_ENTITY__REF_ENTITY, oldRefEntity, refEntity));
      }
    }
    return refEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetRefEntity()
  {
    return refEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEntity(Entity newRefEntity)
  {
    Entity oldRefEntity = refEntity;
    refEntity = newRefEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_ENTITY__REF_ENTITY, oldRefEntity, refEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EntityType newType, NotificationChain msgs)
  {
    EntityType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_ENTITY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EntityType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_ENTITY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REF_ENTITY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_ENTITY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Entity>(Entity.class, this, RSLILPackage.REF_ENTITY__REFS);
    }
    return refs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityType> getRefType()
  {
    if (refType == null)
    {
      refType = new EObjectContainmentEList<EntityType>(EntityType.class, this, RSLILPackage.REF_ENTITY__REF_TYPE);
    }
    return refType;
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
      case RSLILPackage.REF_ENTITY__TYPE:
        return basicSetType(null, msgs);
      case RSLILPackage.REF_ENTITY__REF_TYPE:
        return ((InternalEList<?>)getRefType()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.REF_ENTITY__REF_ENTITY:
        if (resolve) return getRefEntity();
        return basicGetRefEntity();
      case RSLILPackage.REF_ENTITY__TYPE:
        return getType();
      case RSLILPackage.REF_ENTITY__REFS:
        return getRefs();
      case RSLILPackage.REF_ENTITY__REF_TYPE:
        return getRefType();
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
      case RSLILPackage.REF_ENTITY__REF_ENTITY:
        setRefEntity((Entity)newValue);
        return;
      case RSLILPackage.REF_ENTITY__TYPE:
        setType((EntityType)newValue);
        return;
      case RSLILPackage.REF_ENTITY__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Entity>)newValue);
        return;
      case RSLILPackage.REF_ENTITY__REF_TYPE:
        getRefType().clear();
        getRefType().addAll((Collection<? extends EntityType>)newValue);
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
      case RSLILPackage.REF_ENTITY__REF_ENTITY:
        setRefEntity((Entity)null);
        return;
      case RSLILPackage.REF_ENTITY__TYPE:
        setType((EntityType)null);
        return;
      case RSLILPackage.REF_ENTITY__REFS:
        getRefs().clear();
        return;
      case RSLILPackage.REF_ENTITY__REF_TYPE:
        getRefType().clear();
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
      case RSLILPackage.REF_ENTITY__REF_ENTITY:
        return refEntity != null;
      case RSLILPackage.REF_ENTITY__TYPE:
        return type != null;
      case RSLILPackage.REF_ENTITY__REFS:
        return refs != null && !refs.isEmpty();
      case RSLILPackage.REF_ENTITY__REF_TYPE:
        return refType != null && !refType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefEntityImpl
