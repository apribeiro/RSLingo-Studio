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
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getGlossaryTerms <em>Glossary Terms</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getNfrs <em>Nfrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected Project project;

  /**
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<rslingo.rslil.rSLIL.System> systems;

  /**
   * The cached value of the '{@link #getGlossaryTerms() <em>Glossary Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlossaryTerms()
   * @generated
   * @ordered
   */
  protected EList<GlossaryTerm> glossaryTerms;

  /**
   * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholders()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> stakeholders;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Goal> goals;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actors;

  /**
   * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseCases()
   * @generated
   * @ordered
   */
  protected EList<UseCase> useCases;

  /**
   * The cached value of the '{@link #getFrs() <em>Frs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrs()
   * @generated
   * @ordered
   */
  protected EList<FR> frs;

  /**
   * The cached value of the '{@link #getNfrs() <em>Nfrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNfrs()
   * @generated
   * @ordered
   */
  protected EList<NFR> nfrs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return RSLILPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProject(Project newProject, NotificationChain msgs)
  {
    Project oldProject = project;
    project = newProject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.MODEL__PROJECT, oldProject, newProject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(Project newProject)
  {
    if (newProject != project)
    {
      NotificationChain msgs = null;
      if (project != null)
        msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.MODEL__PROJECT, null, msgs);
      if (newProject != null)
        msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.MODEL__PROJECT, null, msgs);
      msgs = basicSetProject(newProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.MODEL__PROJECT, newProject, newProject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rslingo.rslil.rSLIL.System> getSystems()
  {
    if (systems == null)
    {
      systems = new EObjectContainmentEList<rslingo.rslil.rSLIL.System>(rslingo.rslil.rSLIL.System.class, this, RSLILPackage.MODEL__SYSTEMS);
    }
    return systems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlossaryTerm> getGlossaryTerms()
  {
    if (glossaryTerms == null)
    {
      glossaryTerms = new EObjectContainmentEList<GlossaryTerm>(GlossaryTerm.class, this, RSLILPackage.MODEL__GLOSSARY_TERMS);
    }
    return glossaryTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stakeholder> getStakeholders()
  {
    if (stakeholders == null)
    {
      stakeholders = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, RSLILPackage.MODEL__STAKEHOLDERS);
    }
    return stakeholders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, RSLILPackage.MODEL__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, RSLILPackage.MODEL__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, RSLILPackage.MODEL__ACTORS);
    }
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getUseCases()
  {
    if (useCases == null)
    {
      useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, RSLILPackage.MODEL__USE_CASES);
    }
    return useCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FR> getFrs()
  {
    if (frs == null)
    {
      frs = new EObjectContainmentEList<FR>(FR.class, this, RSLILPackage.MODEL__FRS);
    }
    return frs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFR> getNfrs()
  {
    if (nfrs == null)
    {
      nfrs = new EObjectContainmentEList<NFR>(NFR.class, this, RSLILPackage.MODEL__NFRS);
    }
    return nfrs;
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
      case RSLILPackage.MODEL__PROJECT:
        return basicSetProject(null, msgs);
      case RSLILPackage.MODEL__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__GLOSSARY_TERMS:
        return ((InternalEList<?>)getGlossaryTerms()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__USE_CASES:
        return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__FRS:
        return ((InternalEList<?>)getFrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__NFRS:
        return ((InternalEList<?>)getNfrs()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.MODEL__PROJECT:
        return getProject();
      case RSLILPackage.MODEL__SYSTEMS:
        return getSystems();
      case RSLILPackage.MODEL__GLOSSARY_TERMS:
        return getGlossaryTerms();
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return getStakeholders();
      case RSLILPackage.MODEL__GOALS:
        return getGoals();
      case RSLILPackage.MODEL__ENTITIES:
        return getEntities();
      case RSLILPackage.MODEL__ACTORS:
        return getActors();
      case RSLILPackage.MODEL__USE_CASES:
        return getUseCases();
      case RSLILPackage.MODEL__FRS:
        return getFrs();
      case RSLILPackage.MODEL__NFRS:
        return getNfrs();
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
      case RSLILPackage.MODEL__PROJECT:
        setProject((Project)newValue);
        return;
      case RSLILPackage.MODEL__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends rslingo.rslil.rSLIL.System>)newValue);
        return;
      case RSLILPackage.MODEL__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
        getGlossaryTerms().addAll((Collection<? extends GlossaryTerm>)newValue);
        return;
      case RSLILPackage.MODEL__STAKEHOLDERS:
        getStakeholders().clear();
        getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case RSLILPackage.MODEL__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
        return;
      case RSLILPackage.MODEL__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case RSLILPackage.MODEL__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case RSLILPackage.MODEL__USE_CASES:
        getUseCases().clear();
        getUseCases().addAll((Collection<? extends UseCase>)newValue);
        return;
      case RSLILPackage.MODEL__FRS:
        getFrs().clear();
        getFrs().addAll((Collection<? extends FR>)newValue);
        return;
      case RSLILPackage.MODEL__NFRS:
        getNfrs().clear();
        getNfrs().addAll((Collection<? extends NFR>)newValue);
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
      case RSLILPackage.MODEL__PROJECT:
        setProject((Project)null);
        return;
      case RSLILPackage.MODEL__SYSTEMS:
        getSystems().clear();
        return;
      case RSLILPackage.MODEL__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
        return;
      case RSLILPackage.MODEL__STAKEHOLDERS:
        getStakeholders().clear();
        return;
      case RSLILPackage.MODEL__GOALS:
        getGoals().clear();
        return;
      case RSLILPackage.MODEL__ENTITIES:
        getEntities().clear();
        return;
      case RSLILPackage.MODEL__ACTORS:
        getActors().clear();
        return;
      case RSLILPackage.MODEL__USE_CASES:
        getUseCases().clear();
        return;
      case RSLILPackage.MODEL__FRS:
        getFrs().clear();
        return;
      case RSLILPackage.MODEL__NFRS:
        getNfrs().clear();
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
      case RSLILPackage.MODEL__PROJECT:
        return project != null;
      case RSLILPackage.MODEL__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case RSLILPackage.MODEL__GLOSSARY_TERMS:
        return glossaryTerms != null && !glossaryTerms.isEmpty();
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return stakeholders != null && !stakeholders.isEmpty();
      case RSLILPackage.MODEL__GOALS:
        return goals != null && !goals.isEmpty();
      case RSLILPackage.MODEL__ENTITIES:
        return entities != null && !entities.isEmpty();
      case RSLILPackage.MODEL__ACTORS:
        return actors != null && !actors.isEmpty();
      case RSLILPackage.MODEL__USE_CASES:
        return useCases != null && !useCases.isEmpty();
      case RSLILPackage.MODEL__FRS:
        return frs != null && !frs.isEmpty();
      case RSLILPackage.MODEL__NFRS:
        return nfrs != null && !nfrs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
