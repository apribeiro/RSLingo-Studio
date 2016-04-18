/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Field;
import rslingo.rslil.rSLIL.RSLILPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.FieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.FieldImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.FieldImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
{
  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

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
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return RSLILPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FIELD__SIZE, oldSize, size));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FIELD__MULTIPLICITY, oldMultiplicity, multiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
      case RSLILPackage.FIELD__SIZE:
        return getSize();
      case RSLILPackage.FIELD__MULTIPLICITY:
        return getMultiplicity();
      case RSLILPackage.FIELD__DEFAULT_VALUE:
        return getDefaultValue();
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
      case RSLILPackage.FIELD__SIZE:
        setSize((Integer)newValue);
        return;
      case RSLILPackage.FIELD__MULTIPLICITY:
        setMultiplicity((String)newValue);
        return;
      case RSLILPackage.FIELD__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
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
      case RSLILPackage.FIELD__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case RSLILPackage.FIELD__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case RSLILPackage.FIELD__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
      case RSLILPackage.FIELD__SIZE:
        return size != SIZE_EDEFAULT;
      case RSLILPackage.FIELD__MULTIPLICITY:
        return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
      case RSLILPackage.FIELD__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
    result.append(" (size: ");
    result.append(size);
    result.append(", multiplicity: ");
    result.append(multiplicity);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
