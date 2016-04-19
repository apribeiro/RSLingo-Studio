/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActionType;
import rslingo.rslil.rSLIL.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getPostConditions <em>Post Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RefActionType type;

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
   * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected Actor actor;

  /**
   * The default value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreConditions()
   * @generated
   * @ordered
   */
  protected static final String PRE_CONDITIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreConditions()
   * @generated
   * @ordered
   */
  protected String preConditions = PRE_CONDITIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getPostConditions() <em>Post Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostConditions()
   * @generated
   * @ordered
   */
  protected static final String POST_CONDITIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostConditions()
   * @generated
   * @ordered
   */
  protected String postConditions = POST_CONDITIONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepImpl()
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
    return RSLILPackage.Literals.STEP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefActionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(RefActionType newType, NotificationChain msgs)
  {
    RefActionType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RefActionType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.STEP__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.STEP__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getActor()
  {
    if (actor != null && actor.eIsProxy())
    {
      InternalEObject oldActor = (InternalEObject)actor;
      actor = (Actor)eResolveProxy(oldActor);
      if (actor != oldActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.STEP__ACTOR, oldActor, actor));
      }
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetActor()
  {
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActor(Actor newActor)
  {
    Actor oldActor = actor;
    actor = newActor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__ACTOR, oldActor, actor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPreConditions()
  {
    return preConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreConditions(String newPreConditions)
  {
    String oldPreConditions = preConditions;
    preConditions = newPreConditions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__PRE_CONDITIONS, oldPreConditions, preConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPostConditions()
  {
    return postConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostConditions(String newPostConditions)
  {
    String oldPostConditions = postConditions;
    postConditions = newPostConditions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__POST_CONDITIONS, oldPostConditions, postConditions));
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
      case RSLILPackage.STEP__TYPE:
        return basicSetType(null, msgs);
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
      case RSLILPackage.STEP__ID:
        return getId();
      case RSLILPackage.STEP__TYPE:
        return getType();
      case RSLILPackage.STEP__DESCRIPTION:
        return getDescription();
      case RSLILPackage.STEP__ACTOR:
        if (resolve) return getActor();
        return basicGetActor();
      case RSLILPackage.STEP__PRE_CONDITIONS:
        return getPreConditions();
      case RSLILPackage.STEP__POST_CONDITIONS:
        return getPostConditions();
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
      case RSLILPackage.STEP__ID:
        setId((String)newValue);
        return;
      case RSLILPackage.STEP__TYPE:
        setType((RefActionType)newValue);
        return;
      case RSLILPackage.STEP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.STEP__ACTOR:
        setActor((Actor)newValue);
        return;
      case RSLILPackage.STEP__PRE_CONDITIONS:
        setPreConditions((String)newValue);
        return;
      case RSLILPackage.STEP__POST_CONDITIONS:
        setPostConditions((String)newValue);
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
      case RSLILPackage.STEP__ID:
        setId(ID_EDEFAULT);
        return;
      case RSLILPackage.STEP__TYPE:
        setType((RefActionType)null);
        return;
      case RSLILPackage.STEP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.STEP__ACTOR:
        setActor((Actor)null);
        return;
      case RSLILPackage.STEP__PRE_CONDITIONS:
        setPreConditions(PRE_CONDITIONS_EDEFAULT);
        return;
      case RSLILPackage.STEP__POST_CONDITIONS:
        setPostConditions(POST_CONDITIONS_EDEFAULT);
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
      case RSLILPackage.STEP__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RSLILPackage.STEP__TYPE:
        return type != null;
      case RSLILPackage.STEP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.STEP__ACTOR:
        return actor != null;
      case RSLILPackage.STEP__PRE_CONDITIONS:
        return PRE_CONDITIONS_EDEFAULT == null ? preConditions != null : !PRE_CONDITIONS_EDEFAULT.equals(preConditions);
      case RSLILPackage.STEP__POST_CONDITIONS:
        return POST_CONDITIONS_EDEFAULT == null ? postConditions != null : !POST_CONDITIONS_EDEFAULT.equals(postConditions);
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
    result.append(", preConditions: ");
    result.append(preConditions);
    result.append(", postConditions: ");
    result.append(postConditions);
    result.append(')');
    return result.toString();
  }

} //StepImpl
