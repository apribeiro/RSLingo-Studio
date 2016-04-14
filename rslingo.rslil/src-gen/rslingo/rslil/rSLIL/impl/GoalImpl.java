/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getDependsOnType <em>Depends On Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getComposedByType <em>Composed By Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GoalImpl#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends MinimalEObjectImpl.Container implements Goal
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
   * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholder()
   * @generated
   * @ordered
   */
  protected Stakeholder stakeholder;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final String PRIORITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected String priority = PRIORITY_EDEFAULT;

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
   * The default value of the '{@link #getComposedByType() <em>Composed By Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposedByType()
   * @generated
   * @ordered
   */
  protected static final String COMPOSED_BY_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComposedByType() <em>Composed By Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposedByType()
   * @generated
   * @ordered
   */
  protected String composedByType = COMPOSED_BY_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getComposedBy() <em>Composed By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposedBy()
   * @generated
   * @ordered
   */
  protected static final String COMPOSED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComposedBy() <em>Composed By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposedBy()
   * @generated
   * @ordered
   */
  protected String composedBy = COMPOSED_BY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalImpl()
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
    return RSLILPackage.Literals.GOAL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder getStakeholder()
  {
    if (stakeholder != null && stakeholder.eIsProxy())
    {
      InternalEObject oldStakeholder = (InternalEObject)stakeholder;
      stakeholder = (Stakeholder)eResolveProxy(oldStakeholder);
      if (stakeholder != oldStakeholder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.GOAL__STAKEHOLDER, oldStakeholder, stakeholder));
      }
    }
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetStakeholder()
  {
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStakeholder(Stakeholder newStakeholder)
  {
    Stakeholder oldStakeholder = stakeholder;
    stakeholder = newStakeholder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__STAKEHOLDER, oldStakeholder, stakeholder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(String newPriority)
  {
    String oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__PRIORITY, oldPriority, priority));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__DEPENDS_ON_TYPE, oldDependsOnType, dependsOnType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__DEPENDS_ON, oldDependsOn, dependsOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComposedByType()
  {
    return composedByType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposedByType(String newComposedByType)
  {
    String oldComposedByType = composedByType;
    composedByType = newComposedByType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__COMPOSED_BY_TYPE, oldComposedByType, composedByType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComposedBy()
  {
    return composedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposedBy(String newComposedBy)
  {
    String oldComposedBy = composedBy;
    composedBy = newComposedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GOAL__COMPOSED_BY, oldComposedBy, composedBy));
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
      case RSLILPackage.GOAL__ID:
        return getId();
      case RSLILPackage.GOAL__DESCRIPTION:
        return getDescription();
      case RSLILPackage.GOAL__STAKEHOLDER:
        if (resolve) return getStakeholder();
        return basicGetStakeholder();
      case RSLILPackage.GOAL__PRIORITY:
        return getPriority();
      case RSLILPackage.GOAL__DEPENDS_ON_TYPE:
        return getDependsOnType();
      case RSLILPackage.GOAL__DEPENDS_ON:
        return getDependsOn();
      case RSLILPackage.GOAL__COMPOSED_BY_TYPE:
        return getComposedByType();
      case RSLILPackage.GOAL__COMPOSED_BY:
        return getComposedBy();
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
      case RSLILPackage.GOAL__ID:
        setId((String)newValue);
        return;
      case RSLILPackage.GOAL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.GOAL__STAKEHOLDER:
        setStakeholder((Stakeholder)newValue);
        return;
      case RSLILPackage.GOAL__PRIORITY:
        setPriority((String)newValue);
        return;
      case RSLILPackage.GOAL__DEPENDS_ON_TYPE:
        setDependsOnType((String)newValue);
        return;
      case RSLILPackage.GOAL__DEPENDS_ON:
        setDependsOn((String)newValue);
        return;
      case RSLILPackage.GOAL__COMPOSED_BY_TYPE:
        setComposedByType((String)newValue);
        return;
      case RSLILPackage.GOAL__COMPOSED_BY:
        setComposedBy((String)newValue);
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
      case RSLILPackage.GOAL__ID:
        setId(ID_EDEFAULT);
        return;
      case RSLILPackage.GOAL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.GOAL__STAKEHOLDER:
        setStakeholder((Stakeholder)null);
        return;
      case RSLILPackage.GOAL__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case RSLILPackage.GOAL__DEPENDS_ON_TYPE:
        setDependsOnType(DEPENDS_ON_TYPE_EDEFAULT);
        return;
      case RSLILPackage.GOAL__DEPENDS_ON:
        setDependsOn(DEPENDS_ON_EDEFAULT);
        return;
      case RSLILPackage.GOAL__COMPOSED_BY_TYPE:
        setComposedByType(COMPOSED_BY_TYPE_EDEFAULT);
        return;
      case RSLILPackage.GOAL__COMPOSED_BY:
        setComposedBy(COMPOSED_BY_EDEFAULT);
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
      case RSLILPackage.GOAL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RSLILPackage.GOAL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.GOAL__STAKEHOLDER:
        return stakeholder != null;
      case RSLILPackage.GOAL__PRIORITY:
        return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
      case RSLILPackage.GOAL__DEPENDS_ON_TYPE:
        return DEPENDS_ON_TYPE_EDEFAULT == null ? dependsOnType != null : !DEPENDS_ON_TYPE_EDEFAULT.equals(dependsOnType);
      case RSLILPackage.GOAL__DEPENDS_ON:
        return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
      case RSLILPackage.GOAL__COMPOSED_BY_TYPE:
        return COMPOSED_BY_TYPE_EDEFAULT == null ? composedByType != null : !COMPOSED_BY_TYPE_EDEFAULT.equals(composedByType);
      case RSLILPackage.GOAL__COMPOSED_BY:
        return COMPOSED_BY_EDEFAULT == null ? composedBy != null : !COMPOSED_BY_EDEFAULT.equals(composedBy);
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
    result.append(", description: ");
    result.append(description);
    result.append(", priority: ");
    result.append(priority);
    result.append(", dependsOnType: ");
    result.append(dependsOnType);
    result.append(", dependsOn: ");
    result.append(dependsOn);
    result.append(", composedByType: ");
    result.append(composedByType);
    result.append(", composedBy: ");
    result.append(composedBy);
    result.append(')');
    return result.toString();
  }

} //GoalImpl
