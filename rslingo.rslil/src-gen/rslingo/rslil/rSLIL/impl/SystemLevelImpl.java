/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.SystemLevel;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getQrs <em>Qrs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.SystemLevelImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemLevelImpl extends MinimalEObjectImpl.Container implements SystemLevel
{
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
   * The cached value of the '{@link #getQrs() <em>Qrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQrs()
   * @generated
   * @ordered
   */
  protected EList<QR> qrs;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemLevelImpl()
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
    return RSLILPackage.Literals.SYSTEM_LEVEL;
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
      systems = new EObjectContainmentEList<rslingo.rslil.rSLIL.System>(rslingo.rslil.rSLIL.System.class, this, RSLILPackage.SYSTEM_LEVEL__SYSTEMS);
    }
    return systems;
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
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, RSLILPackage.SYSTEM_LEVEL__ENTITIES);
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
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, RSLILPackage.SYSTEM_LEVEL__ACTORS);
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
      useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, RSLILPackage.SYSTEM_LEVEL__USE_CASES);
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
      frs = new EObjectContainmentEList<FR>(FR.class, this, RSLILPackage.SYSTEM_LEVEL__FRS);
    }
    return frs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QR> getQrs()
  {
    if (qrs == null)
    {
      qrs = new EObjectContainmentEList<QR>(QR.class, this, RSLILPackage.SYSTEM_LEVEL__QRS);
    }
    return qrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS);
    }
    return constraints;
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
      case RSLILPackage.SYSTEM_LEVEL__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__USE_CASES:
        return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__FRS:
        return ((InternalEList<?>)getFrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__QRS:
        return ((InternalEList<?>)getQrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.SYSTEM_LEVEL__SYSTEMS:
        return getSystems();
      case RSLILPackage.SYSTEM_LEVEL__ENTITIES:
        return getEntities();
      case RSLILPackage.SYSTEM_LEVEL__ACTORS:
        return getActors();
      case RSLILPackage.SYSTEM_LEVEL__USE_CASES:
        return getUseCases();
      case RSLILPackage.SYSTEM_LEVEL__FRS:
        return getFrs();
      case RSLILPackage.SYSTEM_LEVEL__QRS:
        return getQrs();
      case RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS:
        return getConstraints();
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
      case RSLILPackage.SYSTEM_LEVEL__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends rslingo.rslil.rSLIL.System>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__USE_CASES:
        getUseCases().clear();
        getUseCases().addAll((Collection<? extends UseCase>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__FRS:
        getFrs().clear();
        getFrs().addAll((Collection<? extends FR>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__QRS:
        getQrs().clear();
        getQrs().addAll((Collection<? extends QR>)newValue);
        return;
      case RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
      case RSLILPackage.SYSTEM_LEVEL__SYSTEMS:
        getSystems().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__ENTITIES:
        getEntities().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__ACTORS:
        getActors().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__USE_CASES:
        getUseCases().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__FRS:
        getFrs().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__QRS:
        getQrs().clear();
        return;
      case RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS:
        getConstraints().clear();
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
      case RSLILPackage.SYSTEM_LEVEL__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__ENTITIES:
        return entities != null && !entities.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__ACTORS:
        return actors != null && !actors.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__USE_CASES:
        return useCases != null && !useCases.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__FRS:
        return frs != null && !frs.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__QRS:
        return qrs != null && !qrs.isEmpty();
      case RSLILPackage.SYSTEM_LEVEL__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SystemLevelImpl
