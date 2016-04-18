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
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ReferenceImpl#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference
{
  /**
   * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTo()
   * @generated
   * @ordered
   */
  protected RefAttribute refTo;

  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLICITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected String multiplicity = MULTIPLICITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
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
    return RSLILPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute getRefTo()
  {
    return refTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefTo(RefAttribute newRefTo, NotificationChain msgs)
  {
    RefAttribute oldRefTo = refTo;
    refTo = newRefTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.REFERENCE__REF_TO, oldRefTo, newRefTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTo(RefAttribute newRefTo)
  {
    if (newRefTo != refTo)
    {
      NotificationChain msgs = null;
      if (refTo != null)
        msgs = ((InternalEObject)refTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REFERENCE__REF_TO, null, msgs);
      if (newRefTo != null)
        msgs = ((InternalEObject)newRefTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.REFERENCE__REF_TO, null, msgs);
      msgs = basicSetRefTo(newRefTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REFERENCE__REF_TO, newRefTo, newRefTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(String newMultiplicity)
  {
    String oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity));
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
      case RSLILPackage.REFERENCE__REF_TO:
        return basicSetRefTo(null, msgs);
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
      case RSLILPackage.REFERENCE__REF_TO:
        return getRefTo();
      case RSLILPackage.REFERENCE__MULTIPLICITY:
        return getMultiplicity();
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
      case RSLILPackage.REFERENCE__REF_TO:
        setRefTo((RefAttribute)newValue);
        return;
      case RSLILPackage.REFERENCE__MULTIPLICITY:
        setMultiplicity((String)newValue);
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
      case RSLILPackage.REFERENCE__REF_TO:
        setRefTo((RefAttribute)null);
        return;
      case RSLILPackage.REFERENCE__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
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
      case RSLILPackage.REFERENCE__REF_TO:
        return refTo != null;
      case RSLILPackage.REFERENCE__MULTIPLICITY:
        return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
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
    result.append(" (multiplicity: ");
    result.append(multiplicity);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
