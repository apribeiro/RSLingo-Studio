/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.RSLILPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getDescrition <em>Descrition</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getFieldSize <em>Field Size</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getFieldMultiplicity <em>Field Multiplicity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescrition() <em>Descrition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrition()
   * @generated
   * @ordered
   */
  protected static final String DESCRITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescrition() <em>Descrition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrition()
   * @generated
   * @ordered
   */
  protected String descrition = DESCRITION_EDEFAULT;

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
   * The default value of the '{@link #getFieldSize() <em>Field Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldSize()
   * @generated
   * @ordered
   */
  protected static final int FIELD_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFieldSize() <em>Field Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldSize()
   * @generated
   * @ordered
   */
  protected int fieldSize = FIELD_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldMultiplicity() <em>Field Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldMultiplicity()
   * @generated
   * @ordered
   */
  protected static final String FIELD_MULTIPLICITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldMultiplicity() <em>Field Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldMultiplicity()
   * @generated
   * @ordered
   */
  protected String fieldMultiplicity = FIELD_MULTIPLICITY_EDEFAULT;

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
   * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTo()
   * @generated
   * @ordered
   */
  protected Entity refTo;

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
  protected AttributeImpl()
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
    return RSLILPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescrition()
  {
    return descrition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescrition(String newDescrition)
  {
    String oldDescrition = descrition;
    descrition = newDescrition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__DESCRITION, oldDescrition, descrition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFieldSize()
  {
    return fieldSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldSize(int newFieldSize)
  {
    int oldFieldSize = fieldSize;
    fieldSize = newFieldSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__FIELD_SIZE, oldFieldSize, fieldSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldMultiplicity()
  {
    return fieldMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldMultiplicity(String newFieldMultiplicity)
  {
    String oldFieldMultiplicity = fieldMultiplicity;
    fieldMultiplicity = newFieldMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__FIELD_MULTIPLICITY, oldFieldMultiplicity, fieldMultiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getRefTo()
  {
    if (refTo != null && refTo.eIsProxy())
    {
      InternalEObject oldRefTo = (InternalEObject)refTo;
      refTo = (Entity)eResolveProxy(oldRefTo);
      if (refTo != oldRefTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.ATTRIBUTE__REF_TO, oldRefTo, refTo));
      }
    }
    return refTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetRefTo()
  {
    return refTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTo(Entity newRefTo)
  {
    Entity oldRefTo = refTo;
    refTo = newRefTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__REF_TO, oldRefTo, refTo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__MULTIPLICITY, oldMultiplicity, multiplicity));
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
      case RSLILPackage.ATTRIBUTE__NAME:
        return getName();
      case RSLILPackage.ATTRIBUTE__DESCRITION:
        return getDescrition();
      case RSLILPackage.ATTRIBUTE__TYPE:
        return getType();
      case RSLILPackage.ATTRIBUTE__FIELD_SIZE:
        return getFieldSize();
      case RSLILPackage.ATTRIBUTE__FIELD_MULTIPLICITY:
        return getFieldMultiplicity();
      case RSLILPackage.ATTRIBUTE__DEFAULT_VALUE:
        return getDefaultValue();
      case RSLILPackage.ATTRIBUTE__REF_TO:
        if (resolve) return getRefTo();
        return basicGetRefTo();
      case RSLILPackage.ATTRIBUTE__MULTIPLICITY:
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
      case RSLILPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__DESCRITION:
        setDescrition((String)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__FIELD_SIZE:
        setFieldSize((Integer)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__FIELD_MULTIPLICITY:
        setFieldMultiplicity((String)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__REF_TO:
        setRefTo((Entity)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__MULTIPLICITY:
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
      case RSLILPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__DESCRITION:
        setDescrition(DESCRITION_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__FIELD_SIZE:
        setFieldSize(FIELD_SIZE_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__FIELD_MULTIPLICITY:
        setFieldMultiplicity(FIELD_MULTIPLICITY_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case RSLILPackage.ATTRIBUTE__REF_TO:
        setRefTo((Entity)null);
        return;
      case RSLILPackage.ATTRIBUTE__MULTIPLICITY:
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
      case RSLILPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.ATTRIBUTE__DESCRITION:
        return DESCRITION_EDEFAULT == null ? descrition != null : !DESCRITION_EDEFAULT.equals(descrition);
      case RSLILPackage.ATTRIBUTE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.ATTRIBUTE__FIELD_SIZE:
        return fieldSize != FIELD_SIZE_EDEFAULT;
      case RSLILPackage.ATTRIBUTE__FIELD_MULTIPLICITY:
        return FIELD_MULTIPLICITY_EDEFAULT == null ? fieldMultiplicity != null : !FIELD_MULTIPLICITY_EDEFAULT.equals(fieldMultiplicity);
      case RSLILPackage.ATTRIBUTE__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case RSLILPackage.ATTRIBUTE__REF_TO:
        return refTo != null;
      case RSLILPackage.ATTRIBUTE__MULTIPLICITY:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", descrition: ");
    result.append(descrition);
    result.append(", type: ");
    result.append(type);
    result.append(", fieldSize: ");
    result.append(fieldSize);
    result.append(", fieldMultiplicity: ");
    result.append(fieldMultiplicity);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", multiplicity: ");
    result.append(multiplicity);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
