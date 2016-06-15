/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.GoalRelation;
import rslingo.rslil.rSLIL.Import;
import rslingo.rslil.rSLIL.PackageGoal;
import rslingo.rslil.rSLIL.RSLILPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageGoalImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageGoalImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageGoalImpl#getGoalRelations <em>Goal Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageGoalImpl extends ModelImpl implements PackageGoal
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

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
   * The cached value of the '{@link #getGoalRelations() <em>Goal Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalRelations()
   * @generated
   * @ordered
   */
  protected EList<GoalRelation> goalRelations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageGoalImpl()
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
    return RSLILPackage.Literals.PACKAGE_GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, RSLILPackage.PACKAGE_GOAL__IMPORTS);
    }
    return imports;
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
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, RSLILPackage.PACKAGE_GOAL__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GoalRelation> getGoalRelations()
  {
    if (goalRelations == null)
    {
      goalRelations = new EObjectContainmentEList<GoalRelation>(GoalRelation.class, this, RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS);
    }
    return goalRelations;
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
      case RSLILPackage.PACKAGE_GOAL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_GOAL__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS:
        return ((InternalEList<?>)getGoalRelations()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.PACKAGE_GOAL__IMPORTS:
        return getImports();
      case RSLILPackage.PACKAGE_GOAL__GOALS:
        return getGoals();
      case RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS:
        return getGoalRelations();
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
      case RSLILPackage.PACKAGE_GOAL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case RSLILPackage.PACKAGE_GOAL__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
        return;
      case RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS:
        getGoalRelations().clear();
        getGoalRelations().addAll((Collection<? extends GoalRelation>)newValue);
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
      case RSLILPackage.PACKAGE_GOAL__IMPORTS:
        getImports().clear();
        return;
      case RSLILPackage.PACKAGE_GOAL__GOALS:
        getGoals().clear();
        return;
      case RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS:
        getGoalRelations().clear();
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
      case RSLILPackage.PACKAGE_GOAL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RSLILPackage.PACKAGE_GOAL__GOALS:
        return goals != null && !goals.isEmpty();
      case RSLILPackage.PACKAGE_GOAL__GOAL_RELATIONS:
        return goalRelations != null && !goalRelations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageGoalImpl
