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

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getPriotity <em>Priotity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getExtensionnPoints <em>Extensionn Points</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getActorInitiates <em>Actor Initiates</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getExtPoint <em>Ext Point</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.UseCaseImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends MinimalEObjectImpl.Container implements UseCase
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
   * The default value of the '{@link #getPriotity() <em>Priotity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriotity()
   * @generated
   * @ordered
   */
  protected static final String PRIOTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriotity() <em>Priotity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriotity()
   * @generated
   * @ordered
   */
  protected String priotity = PRIOTITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtensionnPoints() <em>Extensionn Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionnPoints()
   * @generated
   * @ordered
   */
  protected EList<ExtensionPoint> extensionnPoints;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<RefGoal> goals;

  /**
   * The cached value of the '{@link #getFrs() <em>Frs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrs()
   * @generated
   * @ordered
   */
  protected EList<RefFR> frs;

  /**
   * The cached value of the '{@link #getActorInitiates() <em>Actor Initiates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorInitiates()
   * @generated
   * @ordered
   */
  protected Actor actorInitiates;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected RefActor actors;

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
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<RefUC> includes;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected UseCase extends_;

  /**
   * The cached value of the '{@link #getExtPoint() <em>Ext Point</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtPoint()
   * @generated
   * @ordered
   */
  protected ExtensionPoint extPoint;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseImpl()
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
    return RSLILPackage.Literals.USE_CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__NAME_ALIAS, oldNameAlias, nameAlias));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPriotity()
  {
    return priotity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriotity(String newPriotity)
  {
    String oldPriotity = priotity;
    priotity = newPriotity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__PRIOTITY, oldPriotity, priotity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtensionPoint> getExtensionnPoints()
  {
    if (extensionnPoints == null)
    {
      extensionnPoints = new EObjectContainmentEList<ExtensionPoint>(ExtensionPoint.class, this, RSLILPackage.USE_CASE__EXTENSIONN_POINTS);
    }
    return extensionnPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefGoal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<RefGoal>(RefGoal.class, this, RSLILPackage.USE_CASE__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefFR> getFrs()
  {
    if (frs == null)
    {
      frs = new EObjectContainmentEList<RefFR>(RefFR.class, this, RSLILPackage.USE_CASE__FRS);
    }
    return frs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getActorInitiates()
  {
    if (actorInitiates != null && actorInitiates.eIsProxy())
    {
      InternalEObject oldActorInitiates = (InternalEObject)actorInitiates;
      actorInitiates = (Actor)eResolveProxy(oldActorInitiates);
      if (actorInitiates != oldActorInitiates)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.USE_CASE__ACTOR_INITIATES, oldActorInitiates, actorInitiates));
      }
    }
    return actorInitiates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetActorInitiates()
  {
    return actorInitiates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActorInitiates(Actor newActorInitiates)
  {
    Actor oldActorInitiates = actorInitiates;
    actorInitiates = newActorInitiates;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__ACTOR_INITIATES, oldActorInitiates, actorInitiates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefActor getActors()
  {
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActors(RefActor newActors, NotificationChain msgs)
  {
    RefActor oldActors = actors;
    actors = newActors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__ACTORS, oldActors, newActors);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActors(RefActor newActors)
  {
    if (newActors != actors)
    {
      NotificationChain msgs = null;
      if (actors != null)
        msgs = ((InternalEObject)actors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.USE_CASE__ACTORS, null, msgs);
      if (newActors != null)
        msgs = ((InternalEObject)newActors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.USE_CASE__ACTORS, null, msgs);
      msgs = basicSetActors(newActors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__ACTORS, newActors, newActors));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__PRE_CONDITIONS, oldPreConditions, preConditions));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__POST_CONDITIONS, oldPostConditions, postConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefUC> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<RefUC>(RefUC.class, this, RSLILPackage.USE_CASE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (UseCase)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.USE_CASE__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(UseCase newExtends)
  {
    UseCase oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPoint getExtPoint()
  {
    if (extPoint != null && extPoint.eIsProxy())
    {
      InternalEObject oldExtPoint = (InternalEObject)extPoint;
      extPoint = (ExtensionPoint)eResolveProxy(oldExtPoint);
      if (extPoint != oldExtPoint)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.USE_CASE__EXT_POINT, oldExtPoint, extPoint));
      }
    }
    return extPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPoint basicGetExtPoint()
  {
    return extPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtPoint(ExtensionPoint newExtPoint)
  {
    ExtensionPoint oldExtPoint = extPoint;
    extPoint = newExtPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.USE_CASE__EXT_POINT, oldExtPoint, extPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, RSLILPackage.USE_CASE__SCENARIOS);
    }
    return scenarios;
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
      case RSLILPackage.USE_CASE__EXTENSIONN_POINTS:
        return ((InternalEList<?>)getExtensionnPoints()).basicRemove(otherEnd, msgs);
      case RSLILPackage.USE_CASE__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case RSLILPackage.USE_CASE__FRS:
        return ((InternalEList<?>)getFrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.USE_CASE__ACTORS:
        return basicSetActors(null, msgs);
      case RSLILPackage.USE_CASE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case RSLILPackage.USE_CASE__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.USE_CASE__NAME:
        return getName();
      case RSLILPackage.USE_CASE__NAME_ALIAS:
        return getNameAlias();
      case RSLILPackage.USE_CASE__TYPE:
        return getType();
      case RSLILPackage.USE_CASE__DESCRIPTION:
        return getDescription();
      case RSLILPackage.USE_CASE__PRIOTITY:
        return getPriotity();
      case RSLILPackage.USE_CASE__EXTENSIONN_POINTS:
        return getExtensionnPoints();
      case RSLILPackage.USE_CASE__GOALS:
        return getGoals();
      case RSLILPackage.USE_CASE__FRS:
        return getFrs();
      case RSLILPackage.USE_CASE__ACTOR_INITIATES:
        if (resolve) return getActorInitiates();
        return basicGetActorInitiates();
      case RSLILPackage.USE_CASE__ACTORS:
        return getActors();
      case RSLILPackage.USE_CASE__PRE_CONDITIONS:
        return getPreConditions();
      case RSLILPackage.USE_CASE__POST_CONDITIONS:
        return getPostConditions();
      case RSLILPackage.USE_CASE__INCLUDES:
        return getIncludes();
      case RSLILPackage.USE_CASE__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case RSLILPackage.USE_CASE__EXT_POINT:
        if (resolve) return getExtPoint();
        return basicGetExtPoint();
      case RSLILPackage.USE_CASE__SCENARIOS:
        return getScenarios();
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
      case RSLILPackage.USE_CASE__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.USE_CASE__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RSLILPackage.USE_CASE__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.USE_CASE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.USE_CASE__PRIOTITY:
        setPriotity((String)newValue);
        return;
      case RSLILPackage.USE_CASE__EXTENSIONN_POINTS:
        getExtensionnPoints().clear();
        getExtensionnPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
        return;
      case RSLILPackage.USE_CASE__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends RefGoal>)newValue);
        return;
      case RSLILPackage.USE_CASE__FRS:
        getFrs().clear();
        getFrs().addAll((Collection<? extends RefFR>)newValue);
        return;
      case RSLILPackage.USE_CASE__ACTOR_INITIATES:
        setActorInitiates((Actor)newValue);
        return;
      case RSLILPackage.USE_CASE__ACTORS:
        setActors((RefActor)newValue);
        return;
      case RSLILPackage.USE_CASE__PRE_CONDITIONS:
        setPreConditions((String)newValue);
        return;
      case RSLILPackage.USE_CASE__POST_CONDITIONS:
        setPostConditions((String)newValue);
        return;
      case RSLILPackage.USE_CASE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends RefUC>)newValue);
        return;
      case RSLILPackage.USE_CASE__EXTENDS:
        setExtends((UseCase)newValue);
        return;
      case RSLILPackage.USE_CASE__EXT_POINT:
        setExtPoint((ExtensionPoint)newValue);
        return;
      case RSLILPackage.USE_CASE__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case RSLILPackage.USE_CASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__PRIOTITY:
        setPriotity(PRIOTITY_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__EXTENSIONN_POINTS:
        getExtensionnPoints().clear();
        return;
      case RSLILPackage.USE_CASE__GOALS:
        getGoals().clear();
        return;
      case RSLILPackage.USE_CASE__FRS:
        getFrs().clear();
        return;
      case RSLILPackage.USE_CASE__ACTOR_INITIATES:
        setActorInitiates((Actor)null);
        return;
      case RSLILPackage.USE_CASE__ACTORS:
        setActors((RefActor)null);
        return;
      case RSLILPackage.USE_CASE__PRE_CONDITIONS:
        setPreConditions(PRE_CONDITIONS_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__POST_CONDITIONS:
        setPostConditions(POST_CONDITIONS_EDEFAULT);
        return;
      case RSLILPackage.USE_CASE__INCLUDES:
        getIncludes().clear();
        return;
      case RSLILPackage.USE_CASE__EXTENDS:
        setExtends((UseCase)null);
        return;
      case RSLILPackage.USE_CASE__EXT_POINT:
        setExtPoint((ExtensionPoint)null);
        return;
      case RSLILPackage.USE_CASE__SCENARIOS:
        getScenarios().clear();
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
      case RSLILPackage.USE_CASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.USE_CASE__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RSLILPackage.USE_CASE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.USE_CASE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.USE_CASE__PRIOTITY:
        return PRIOTITY_EDEFAULT == null ? priotity != null : !PRIOTITY_EDEFAULT.equals(priotity);
      case RSLILPackage.USE_CASE__EXTENSIONN_POINTS:
        return extensionnPoints != null && !extensionnPoints.isEmpty();
      case RSLILPackage.USE_CASE__GOALS:
        return goals != null && !goals.isEmpty();
      case RSLILPackage.USE_CASE__FRS:
        return frs != null && !frs.isEmpty();
      case RSLILPackage.USE_CASE__ACTOR_INITIATES:
        return actorInitiates != null;
      case RSLILPackage.USE_CASE__ACTORS:
        return actors != null;
      case RSLILPackage.USE_CASE__PRE_CONDITIONS:
        return PRE_CONDITIONS_EDEFAULT == null ? preConditions != null : !PRE_CONDITIONS_EDEFAULT.equals(preConditions);
      case RSLILPackage.USE_CASE__POST_CONDITIONS:
        return POST_CONDITIONS_EDEFAULT == null ? postConditions != null : !POST_CONDITIONS_EDEFAULT.equals(postConditions);
      case RSLILPackage.USE_CASE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case RSLILPackage.USE_CASE__EXTENDS:
        return extends_ != null;
      case RSLILPackage.USE_CASE__EXT_POINT:
        return extPoint != null;
      case RSLILPackage.USE_CASE__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(", description: ");
    result.append(description);
    result.append(", priotity: ");
    result.append(priotity);
    result.append(", preConditions: ");
    result.append(preConditions);
    result.append(", postConditions: ");
    result.append(postConditions);
    result.append(')');
    return result.toString();
  }

} //UseCaseImpl
