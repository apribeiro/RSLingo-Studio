/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefGoal;

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
   * The cached value of the '{@link #getRefGoal() <em>Ref Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefGoal()
   * @generated
   * @ordered
   */
  protected RefGoal refGoal;

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
  public RefGoal getRefGoal()
  {
    return refGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefGoal(RefGoal newRefGoal, NotificationChain msgs)
  {
    RefGoal oldRefGoal = refGoal;
    refGoal = newRefGoal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, oldRefGoal, newRefGoal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefGoal(RefGoal newRefGoal)
  {
    if (newRefGoal != refGoal)
    {
      NotificationChain msgs = null;
      if (refGoal != null)
        msgs = ((InternalEObject)refGoal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, null, msgs);
      if (newRefGoal != null)
        msgs = ((InternalEObject)newRefGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, null, msgs);
      msgs = basicSetRefGoal(newRefGoal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL, newRefGoal, newRefGoal));
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
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        return basicSetRefGoal(null, msgs);
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
      case RSLILPackage.DEPENDS_ON_GOAL__TYPE:
        return getType();
      case RSLILPackage.DEPENDS_ON_GOAL__REF_GOAL:
        return getRefGoal();
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
        setRefGoal((RefGoal)newValue);
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
        setRefGoal((RefGoal)null);
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
