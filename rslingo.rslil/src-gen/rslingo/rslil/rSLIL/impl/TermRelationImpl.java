/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefTerm;
import rslingo.rslil.rSLIL.TermRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.TermRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.TermRelationImpl#getRefTerm <em>Ref Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermRelationImpl extends MinimalEObjectImpl.Container implements TermRelation
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
   * The cached value of the '{@link #getRefTerm() <em>Ref Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTerm()
   * @generated
   * @ordered
   */
  protected RefTerm refTerm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermRelationImpl()
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
    return RSLILPackage.Literals.TERM_RELATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.TERM_RELATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTerm getRefTerm()
  {
    return refTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefTerm(RefTerm newRefTerm, NotificationChain msgs)
  {
    RefTerm oldRefTerm = refTerm;
    refTerm = newRefTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.TERM_RELATION__REF_TERM, oldRefTerm, newRefTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTerm(RefTerm newRefTerm)
  {
    if (newRefTerm != refTerm)
    {
      NotificationChain msgs = null;
      if (refTerm != null)
        msgs = ((InternalEObject)refTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.TERM_RELATION__REF_TERM, null, msgs);
      if (newRefTerm != null)
        msgs = ((InternalEObject)newRefTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.TERM_RELATION__REF_TERM, null, msgs);
      msgs = basicSetRefTerm(newRefTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.TERM_RELATION__REF_TERM, newRefTerm, newRefTerm));
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
      case RSLILPackage.TERM_RELATION__REF_TERM:
        return basicSetRefTerm(null, msgs);
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
      case RSLILPackage.TERM_RELATION__TYPE:
        return getType();
      case RSLILPackage.TERM_RELATION__REF_TERM:
        return getRefTerm();
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
      case RSLILPackage.TERM_RELATION__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.TERM_RELATION__REF_TERM:
        setRefTerm((RefTerm)newValue);
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
      case RSLILPackage.TERM_RELATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.TERM_RELATION__REF_TERM:
        setRefTerm((RefTerm)null);
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
      case RSLILPackage.TERM_RELATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.TERM_RELATION__REF_TERM:
        return refTerm != null;
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

} //TermRelationImpl
