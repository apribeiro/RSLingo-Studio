/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefTerm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefTermImpl#getRefTerm <em>Ref Term</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.RefTermImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefTermImpl extends MinimalEObjectImpl.Container implements RefTerm
{
  /**
   * The default value of the '{@link #getRefTerm() <em>Ref Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTerm()
   * @generated
   * @ordered
   */
  protected static final String REF_TERM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefTerm() <em>Ref Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTerm()
   * @generated
   * @ordered
   */
  protected String refTerm = REF_TERM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<String> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefTermImpl()
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
    return RSLILPackage.Literals.REF_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefTerm()
  {
    return refTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTerm(String newRefTerm)
  {
    String oldRefTerm = refTerm;
    refTerm = newRefTerm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.REF_TERM__REF_TERM, oldRefTerm, refTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRefs()
  {
    if (refs == null)
    {
      refs = new EDataTypeEList<String>(String.class, this, RSLILPackage.REF_TERM__REFS);
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
      case RSLILPackage.REF_TERM__REF_TERM:
        return getRefTerm();
      case RSLILPackage.REF_TERM__REFS:
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
      case RSLILPackage.REF_TERM__REF_TERM:
        setRefTerm((String)newValue);
        return;
      case RSLILPackage.REF_TERM__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends String>)newValue);
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
      case RSLILPackage.REF_TERM__REF_TERM:
        setRefTerm(REF_TERM_EDEFAULT);
        return;
      case RSLILPackage.REF_TERM__REFS:
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
      case RSLILPackage.REF_TERM__REF_TERM:
        return REF_TERM_EDEFAULT == null ? refTerm != null : !REF_TERM_EDEFAULT.equals(refTerm);
      case RSLILPackage.REF_TERM__REFS:
        return refs != null && !refs.isEmpty();
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
    result.append(" (refTerm: ");
    result.append(refTerm);
    result.append(", refs: ");
    result.append(refs);
    result.append(')');
    return result.toString();
  }

} //RefTermImpl
