/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getRefSystem <em>Ref System</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements rslingo.rslil.rSLIL.System
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemId()
   * @generated
   * @ordered
   */
  protected static final String SYSTEM_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemId()
   * @generated
   * @ordered
   */
  protected String systemId = SYSTEM_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefSystem() <em>Ref System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSystem()
   * @generated
   * @ordered
   */
  protected RefSystem refSystem;

  /**
   * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartOf()
   * @generated
   * @ordered
   */
  protected rslingo.rslil.rSLIL.System partOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return RSLILPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSystemId()
  {
    return systemId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemId(String newSystemId)
  {
    String oldSystemId = systemId;
    systemId = newSystemId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__SYSTEM_ID, oldSystemId, systemId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSystem getRefSystem()
  {
    return refSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefSystem(RefSystem newRefSystem, NotificationChain msgs)
  {
    RefSystem oldRefSystem = refSystem;
    refSystem = newRefSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__REF_SYSTEM, oldRefSystem, newRefSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefSystem(RefSystem newRefSystem)
  {
    if (newRefSystem != refSystem)
    {
      NotificationChain msgs = null;
      if (refSystem != null)
        msgs = ((InternalEObject)refSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.SYSTEM__REF_SYSTEM, null, msgs);
      if (newRefSystem != null)
        msgs = ((InternalEObject)newRefSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.SYSTEM__REF_SYSTEM, null, msgs);
      msgs = basicSetRefSystem(newRefSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__REF_SYSTEM, newRefSystem, newRefSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System getPartOf()
  {
    if (partOf != null && partOf.eIsProxy())
    {
      InternalEObject oldPartOf = (InternalEObject)partOf;
      partOf = (rslingo.rslil.rSLIL.System)eResolveProxy(oldPartOf);
      if (partOf != oldPartOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.SYSTEM__PART_OF, oldPartOf, partOf));
      }
    }
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System basicGetPartOf()
  {
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartOf(rslingo.rslil.rSLIL.System newPartOf)
  {
    rslingo.rslil.rSLIL.System oldPartOf = partOf;
    partOf = newPartOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.SYSTEM__PART_OF, oldPartOf, partOf));
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
      case RSLILPackage.SYSTEM__REF_SYSTEM:
        return basicSetRefSystem(null, msgs);
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
      case RSLILPackage.SYSTEM__ID:
        return getId();
      case RSLILPackage.SYSTEM__SYSTEM_ID:
        return getSystemId();
      case RSLILPackage.SYSTEM__NAME:
        return getName();
      case RSLILPackage.SYSTEM__DESCRIPTION:
        return getDescription();
      case RSLILPackage.SYSTEM__REF_SYSTEM:
        return getRefSystem();
      case RSLILPackage.SYSTEM__PART_OF:
        if (resolve) return getPartOf();
        return basicGetPartOf();
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
      case RSLILPackage.SYSTEM__ID:
        setId((String)newValue);
        return;
      case RSLILPackage.SYSTEM__SYSTEM_ID:
        setSystemId((String)newValue);
        return;
      case RSLILPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.SYSTEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.SYSTEM__REF_SYSTEM:
        setRefSystem((RefSystem)newValue);
        return;
      case RSLILPackage.SYSTEM__PART_OF:
        setPartOf((rslingo.rslil.rSLIL.System)newValue);
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
      case RSLILPackage.SYSTEM__ID:
        setId(ID_EDEFAULT);
        return;
      case RSLILPackage.SYSTEM__SYSTEM_ID:
        setSystemId(SYSTEM_ID_EDEFAULT);
        return;
      case RSLILPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.SYSTEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.SYSTEM__REF_SYSTEM:
        setRefSystem((RefSystem)null);
        return;
      case RSLILPackage.SYSTEM__PART_OF:
        setPartOf((rslingo.rslil.rSLIL.System)null);
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
      case RSLILPackage.SYSTEM__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RSLILPackage.SYSTEM__SYSTEM_ID:
        return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
      case RSLILPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.SYSTEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.SYSTEM__REF_SYSTEM:
        return refSystem != null;
      case RSLILPackage.SYSTEM__PART_OF:
        return partOf != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", systemId: ");
    result.append(systemId);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
