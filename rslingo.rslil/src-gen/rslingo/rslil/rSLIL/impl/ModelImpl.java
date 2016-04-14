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

import rslingo.rslil.rSLIL.Glossary;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getGlossaries <em>Glossaries</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ModelImpl#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getGlossaries() <em>Glossaries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlossaries()
   * @generated
   * @ordered
   */
  protected EList<Glossary> glossaries;

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
  public EList<Glossary> getGlossaries()
  {
    if (glossaries == null)
    {
      glossaries = new EObjectContainmentEList<Glossary>(Glossary.class, this, RSLILPackage.MODEL__GLOSSARIES);
    }
    return glossaries;
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RSLILPackage.MODEL__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__GLOSSARIES:
        return ((InternalEList<?>)getGlossaries()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
      case RSLILPackage.MODEL__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.MODEL__SYSTEMS:
        return getSystems();
      case RSLILPackage.MODEL__GLOSSARIES:
        return getGlossaries();
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return getStakeholders();
      case RSLILPackage.MODEL__GOALS:
        return getGoals();
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
      case RSLILPackage.MODEL__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends rslingo.rslil.rSLIL.System>)newValue);
        return;
      case RSLILPackage.MODEL__GLOSSARIES:
        getGlossaries().clear();
        getGlossaries().addAll((Collection<? extends Glossary>)newValue);
        return;
      case RSLILPackage.MODEL__STAKEHOLDERS:
        getStakeholders().clear();
        getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case RSLILPackage.MODEL__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
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
      case RSLILPackage.MODEL__SYSTEMS:
        getSystems().clear();
        return;
      case RSLILPackage.MODEL__GLOSSARIES:
        getGlossaries().clear();
        return;
      case RSLILPackage.MODEL__STAKEHOLDERS:
        getStakeholders().clear();
        return;
      case RSLILPackage.MODEL__GOALS:
        getGoals().clear();
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
      case RSLILPackage.MODEL__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case RSLILPackage.MODEL__GLOSSARIES:
        return glossaries != null && !glossaries.isEmpty();
      case RSLILPackage.MODEL__STAKEHOLDERS:
        return stakeholders != null && !stakeholders.isEmpty();
      case RSLILPackage.MODEL__GOALS:
        return goals != null && !goals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
