/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.RSLILPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnGoalImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.DependsOnGoalImpl#getRefGoal <em>Ref Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependsOnGoalImpl extends MinimalEObjectImpl.Container implements DependsOnGoal
{
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
   * The cached value of the '{@link #getRefGoal() <em>Ref Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefGoal()
   * @generated
   * @ordered
   */
  protected Goal refGoal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependsOnGoalImpl()
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
    return RSLILPackage.Literals.DEPENDS_ON_GOAL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_GOAL__TYPE, oldType, type));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, oldRefGoal, refGoal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, oldRefGoal, refGoal));
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
      case RSLILPackage.DEPENDS_ON_GOAL__TYPE:
        return getType();
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        if (resolve) return getRefGoal();
        return basicGetRefGoal();
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
      case RSLILPackage.DEPENDS_ON_GOAL__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        setRefGoal((Goal)newValue);
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
      case RSLILPackage.DEPENDS_ON_GOAL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        setRefGoal((Goal)null);
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
      case RSLILPackage.DEPENDS_ON_GOAL__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        return refGoal != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DependsOnGoalImpl
