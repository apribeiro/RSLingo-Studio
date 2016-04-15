/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefGoalImpl#getRefGoal <em>Ref Goal</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefGoalImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefGoalImpl extends MinimalEObjectImpl.Container implements RefGoal
{
  /**
   * The cached value of the '{@link #getRefGoal() <em>Ref Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefGoal()
   * @generated
   * @ordered
   */
  protected Goal refGoal;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Goal> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefGoalImpl()
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
    return RSLILPackage.Literals.REF_GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal getRefGoal()
  {
    if (refGoal != null && refGoal.eIsProxy())
    {
      InternalEObject oldRefGoal = (InternalEObject)refGoal;
      refGoal = (Goal)eResolveProxy(oldRefGoal);
      if (refGoal != oldRefGoal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.REF_GOAL__REF_GOAL, oldRefGoal, refGoal));
      }
    }
    return refGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal basicGetRefGoal()
  {
    return refGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefGoal(Goal newRefGoal)
  {
    Goal oldRefGoal = refGoal;
    refGoal = newRefGoal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_GOAL__REF_GOAL, oldRefGoal, refGoal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Goal>(Goal.class, this, RSLILPackage.REF_GOAL__REFS);
    }
    return refs;
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
      case RSLILPackage.REF_GOAL__REF_GOAL:
        if (resolve) return getRefGoal();
        return basicGetRefGoal();
      case RSLILPackage.REF_GOAL__REFS:
        return getRefs();
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
      case RSLILPackage.REF_GOAL__REF_GOAL:
        setRefGoal((Goal)newValue);
        return;
      case RSLILPackage.REF_GOAL__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Goal>)newValue);
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
      case RSLILPackage.REF_GOAL__REF_GOAL:
        setRefGoal((Goal)null);
        return;
      case RSLILPackage.REF_GOAL__REFS:
        getRefs().clear();
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
      case RSLILPackage.REF_GOAL__REF_GOAL:
        return refGoal != null;
      case RSLILPackage.REF_GOAL__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefGoalImpl
