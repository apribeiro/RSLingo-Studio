/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.StepImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step
{
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
   * The default value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected static final String NAME_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected String nameAlias = NAME_ALIAS_EDEFAULT;

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
   * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Step next;

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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameAlias()
  {
    return nameAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameAlias(String newNameAlias)
  {
    String oldNameAlias = nameAlias;
    nameAlias = newNameAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__NAME_ALIAS, oldNameAlias, nameAlias));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__TYPE, oldType, type));
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
  public Step getNext()
  {
    if (next != null && next.eIsProxy())
    {
      InternalEObject oldNext = (InternalEObject)next;
      next = (Step)eResolveProxy(oldNext);
      if (next != oldNext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.STEP__NEXT, oldNext, next));
      }
    }
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step basicGetNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Step newNext)
  {
    Step oldNext = next;
    next = newNext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.STEP__NEXT, oldNext, next));
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
      case RSLILPackage.STEP__NAME:
        return getName();
      case RSLILPackage.STEP__NAME_ALIAS:
        return getNameAlias();
      case RSLILPackage.STEP__DESCRIPTION:
        return getDescription();
      case RSLILPackage.STEP__TYPE:
        return getType();
      case RSLILPackage.STEP__ACTOR:
        if (resolve) return getActor();
        return basicGetActor();
      case RSLILPackage.STEP__PRE_CONDITIONS:
        return getPreConditions();
      case RSLILPackage.STEP__POST_CONDITIONS:
        return getPostConditions();
      case RSLILPackage.STEP__NEXT:
        if (resolve) return getNext();
        return basicGetNext();
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
      case RSLILPackage.STEP__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.STEP__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RSLILPackage.STEP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.STEP__TYPE:
        setType((String)newValue);
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
      case RSLILPackage.STEP__NEXT:
        setNext((Step)newValue);
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
      case RSLILPackage.STEP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.STEP__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RSLILPackage.STEP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.STEP__TYPE:
        setType(TYPE_EDEFAULT);
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
      case RSLILPackage.STEP__NEXT:
        setNext((Step)null);
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
      case RSLILPackage.STEP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.STEP__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RSLILPackage.STEP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.STEP__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.STEP__ACTOR:
        return actor != null;
      case RSLILPackage.STEP__PRE_CONDITIONS:
        return PRE_CONDITIONS_EDEFAULT == null ? preConditions != null : !PRE_CONDITIONS_EDEFAULT.equals(preConditions);
      case RSLILPackage.STEP__POST_CONDITIONS:
        return POST_CONDITIONS_EDEFAULT == null ? postConditions != null : !POST_CONDITIONS_EDEFAULT.equals(postConditions);
      case RSLILPackage.STEP__NEXT:
        return next != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", nameAlias: ");
    result.append(nameAlias);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(", preConditions: ");
    result.append(preConditions);
    result.append(", postConditions: ");
    result.append(postConditions);
    result.append(')');
    return result.toString();
  }

} //StepImpl
