/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getCotegory <em>Cotegory</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getDependsOnType <em>Depends On Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StakeholderImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCotegory() <em>Cotegory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCotegory()
   * @generated
   * @ordered
   */
  protected static final String COTEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCotegory() <em>Cotegory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCotegory()
   * @generated
   * @ordered
   */
  protected String cotegory = COTEGORY_EDEFAULT;

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
   * The default value of the '{@link #getDependsOnType() <em>Depends On Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependsOnType()
   * @generated
   * @ordered
   */
  protected static final String DEPENDS_ON_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDependsOnType() <em>Depends On Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependsOnType()
   * @generated
   * @ordered
   */
  protected String dependsOnType = DEPENDS_ON_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependsOn()
   * @generated
   * @ordered
   */
  protected static final String DEPENDS_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependsOn()
   * @generated
   * @ordered
   */
  protected String dependsOn = DEPENDS_ON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StakeholderImpl()
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
    return RSLILPackage.Literals.STAKEHOLDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCotegory()
  {
    return cotegory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCotegory(String newCotegory)
  {
    String oldCotegory = cotegory;
    cotegory = newCotegory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__COTEGORY, oldCotegory, cotegory));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDependsOnType()
  {
    return dependsOnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependsOnType(String newDependsOnType)
  {
    String oldDependsOnType = dependsOnType;
    dependsOnType = newDependsOnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__DEPENDS_ON_TYPE, oldDependsOnType, dependsOnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDependsOn()
  {
    return dependsOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependsOn(String newDependsOn)
  {
    String oldDependsOn = dependsOn;
    dependsOn = newDependsOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STAKEHOLDER__DEPENDS_ON, oldDependsOn, dependsOn));
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
      case RSLILPackage.STAKEHOLDER__ID:
        return getId();
      case RSLILPackage.STAKEHOLDER__NAME:
        return getName();
      case RSLILPackage.STAKEHOLDER__TYPE:
        return getType();
      case RSLILPackage.STAKEHOLDER__COTEGORY:
        return getCotegory();
      case RSLILPackage.STAKEHOLDER__DESCRIPTION:
        return getDescription();
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON_TYPE:
        return getDependsOnType();
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON:
        return getDependsOn();
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
      case RSLILPackage.STAKEHOLDER__ID:
        setId((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__COTEGORY:
        setCotegory((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON_TYPE:
        setDependsOnType((String)newValue);
        return;
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON:
        setDependsOn((String)newValue);
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
      case RSLILPackage.STAKEHOLDER__ID:
        setId(ID_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__COTEGORY:
        setCotegory(COTEGORY_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON_TYPE:
        setDependsOnType(DEPENDS_ON_TYPE_EDEFAULT);
        return;
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON:
        setDependsOn(DEPENDS_ON_EDEFAULT);
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
      case RSLILPackage.STAKEHOLDER__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RSLILPackage.STAKEHOLDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.STAKEHOLDER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.STAKEHOLDER__COTEGORY:
        return COTEGORY_EDEFAULT == null ? cotegory != null : !COTEGORY_EDEFAULT.equals(cotegory);
      case RSLILPackage.STAKEHOLDER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON_TYPE:
        return DEPENDS_ON_TYPE_EDEFAULT == null ? dependsOnType != null : !DEPENDS_ON_TYPE_EDEFAULT.equals(dependsOnType);
      case RSLILPackage.STAKEHOLDER__DEPENDS_ON:
        return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
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
    result.append(", name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", cotegory: ");
    result.append(cotegory);
    result.append(", description: ");
    result.append(description);
    result.append(", dependsOnType: ");
    result.append(dependsOnType);
    result.append(", dependsOn: ");
    result.append(dependsOn);
    result.append(')');
    return result.toString();
  }

} //StakeholderImpl
