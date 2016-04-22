/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ForeignKeyImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ForeignKeyImpl#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ForeignKeyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTo()
   * @generated
   * @ordered
   */
  protected RefAttribute refTo;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected Multiplicity multiplicity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeignKeyImpl()
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
    return RSLILPackage.Literals.FOREIGN_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.FOREIGN_KEY__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FOREIGN_KEY__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute getRefTo()
  {
    return refTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefTo(RefAttribute newRefTo, NotificationChain msgs)
  {
    RefAttribute oldRefTo = refTo;
    refTo = newRefTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.FOREIGN_KEY__REF_TO, oldRefTo, newRefTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTo(RefAttribute newRefTo)
  {
    if (newRefTo != refTo)
    {
      NotificationChain msgs = null;
      if (refTo != null)
        msgs = ((InternalEObject)refTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.FOREIGN_KEY__REF_TO, null, msgs);
      if (newRefTo != null)
        msgs = ((InternalEObject)newRefTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.FOREIGN_KEY__REF_TO, null, msgs);
      msgs = basicSetRefTo(newRefTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FOREIGN_KEY__REF_TO, newRefTo, newRefTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs)
  {
    Multiplicity oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.FOREIGN_KEY__MULTIPLICITY, oldMultiplicity, newMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(Multiplicity newMultiplicity)
  {
    if (newMultiplicity != multiplicity)
    {
      NotificationChain msgs = null;
      if (multiplicity != null)
        msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.FOREIGN_KEY__MULTIPLICITY, null, msgs);
      if (newMultiplicity != null)
        msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.FOREIGN_KEY__MULTIPLICITY, null, msgs);
      msgs = basicSetMultiplicity(newMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FOREIGN_KEY__MULTIPLICITY, newMultiplicity, newMultiplicity));
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
      case RSLILPackage.FOREIGN_KEY__REF_TO:
        return basicSetRefTo(null, msgs);
      case RSLILPackage.FOREIGN_KEY__MULTIPLICITY:
        return basicSetMultiplicity(null, msgs);
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
      case RSLILPackage.FOREIGN_KEY__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case RSLILPackage.FOREIGN_KEY__REF_TO:
        return getRefTo();
      case RSLILPackage.FOREIGN_KEY__MULTIPLICITY:
        return getMultiplicity();
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
      case RSLILPackage.FOREIGN_KEY__ENTITY:
        setEntity((Entity)newValue);
        return;
      case RSLILPackage.FOREIGN_KEY__REF_TO:
        setRefTo((RefAttribute)newValue);
        return;
      case RSLILPackage.FOREIGN_KEY__MULTIPLICITY:
        setMultiplicity((Multiplicity)newValue);
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
      case RSLILPackage.FOREIGN_KEY__ENTITY:
        setEntity((Entity)null);
        return;
      case RSLILPackage.FOREIGN_KEY__REF_TO:
        setRefTo((RefAttribute)null);
        return;
      case RSLILPackage.FOREIGN_KEY__MULTIPLICITY:
        setMultiplicity((Multiplicity)null);
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
      case RSLILPackage.FOREIGN_KEY__ENTITY:
        return entity != null;
      case RSLILPackage.FOREIGN_KEY__REF_TO:
        return refTo != null;
      case RSLILPackage.FOREIGN_KEY__MULTIPLICITY:
        return multiplicity != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeignKeyImpl
