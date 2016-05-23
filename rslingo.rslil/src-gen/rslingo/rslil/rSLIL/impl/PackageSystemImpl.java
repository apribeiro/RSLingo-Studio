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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getSystem <em>System</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getQrs <em>Qrs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageSystemImpl extends ModelImpl implements PackageSystem
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected rslingo.rslil.rSLIL.System system;

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
  protected PackageSystemImpl()
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
    return RSLILPackage.Literals.PACKAGE_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(rslingo.rslil.rSLIL.System newSystem, NotificationChain msgs)
  {
    rslingo.rslil.rSLIL.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PACKAGE_SYSTEM__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(rslingo.rslil.rSLIL.System newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PACKAGE_SYSTEM__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PACKAGE_SYSTEM__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PACKAGE_SYSTEM__SYSTEM, newSystem, newSystem));
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
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, RSLILPackage.PACKAGE_SYSTEM__ENTITIES);
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
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, RSLILPackage.PACKAGE_SYSTEM__ACTORS);
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
      useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, RSLILPackage.PACKAGE_SYSTEM__USE_CASES);
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
      frs = new EObjectContainmentEList<FR>(FR.class, this, RSLILPackage.PACKAGE_SYSTEM__FRS);
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
      qrs = new EObjectContainmentEList<QR>(QR.class, this, RSLILPackage.PACKAGE_SYSTEM__QRS);
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
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS);
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
      case RSLILPackage.PACKAGE_SYSTEM__SYSTEM:
        return basicSetSystem(null, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__USE_CASES:
        return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__FRS:
        return ((InternalEList<?>)getFrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__QRS:
        return ((InternalEList<?>)getQrs()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS:
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
      case RSLILPackage.PACKAGE_SYSTEM__SYSTEM:
        return getSystem();
      case RSLILPackage.PACKAGE_SYSTEM__ENTITIES:
        return getEntities();
      case RSLILPackage.PACKAGE_SYSTEM__ACTORS:
        return getActors();
      case RSLILPackage.PACKAGE_SYSTEM__USE_CASES:
        return getUseCases();
      case RSLILPackage.PACKAGE_SYSTEM__FRS:
        return getFrs();
      case RSLILPackage.PACKAGE_SYSTEM__QRS:
        return getQrs();
      case RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS:
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
      case RSLILPackage.PACKAGE_SYSTEM__SYSTEM:
        setSystem((rslingo.rslil.rSLIL.System)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__USE_CASES:
        getUseCases().clear();
        getUseCases().addAll((Collection<? extends UseCase>)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__FRS:
        getFrs().clear();
        getFrs().addAll((Collection<? extends FR>)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__QRS:
        getQrs().clear();
        getQrs().addAll((Collection<? extends QR>)newValue);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS:
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
      case RSLILPackage.PACKAGE_SYSTEM__SYSTEM:
        setSystem((rslingo.rslil.rSLIL.System)null);
        return;
      case RSLILPackage.PACKAGE_SYSTEM__ENTITIES:
        getEntities().clear();
        return;
      case RSLILPackage.PACKAGE_SYSTEM__ACTORS:
        getActors().clear();
        return;
      case RSLILPackage.PACKAGE_SYSTEM__USE_CASES:
        getUseCases().clear();
        return;
      case RSLILPackage.PACKAGE_SYSTEM__FRS:
        getFrs().clear();
        return;
      case RSLILPackage.PACKAGE_SYSTEM__QRS:
        getQrs().clear();
        return;
      case RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS:
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
      case RSLILPackage.PACKAGE_SYSTEM__SYSTEM:
        return system != null;
      case RSLILPackage.PACKAGE_SYSTEM__ENTITIES:
        return entities != null && !entities.isEmpty();
      case RSLILPackage.PACKAGE_SYSTEM__ACTORS:
        return actors != null && !actors.isEmpty();
      case RSLILPackage.PACKAGE_SYSTEM__USE_CASES:
        return useCases != null && !useCases.isEmpty();
      case RSLILPackage.PACKAGE_SYSTEM__FRS:
        return frs != null && !frs.isEmpty();
      case RSLILPackage.PACKAGE_SYSTEM__QRS:
        return qrs != null && !qrs.isEmpty();
      case RSLILPackage.PACKAGE_SYSTEM__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageSystemImpl
