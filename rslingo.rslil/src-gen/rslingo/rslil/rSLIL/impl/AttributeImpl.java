/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Field;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Reference;

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
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getField <em>Field</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.AttributeImpl#getReference <em>Reference</em>}</li>
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
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected Field field;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Reference reference;

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
  public Field getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField(Field newField, NotificationChain msgs)
  {
    Field oldField = field;
    field = newField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__FIELD, oldField, newField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(Field newField)
  {
    if (newField != field)
    {
      NotificationChain msgs = null;
      if (field != null)
        msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ATTRIBUTE__FIELD, null, msgs);
      if (newField != null)
        msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ATTRIBUTE__FIELD, null, msgs);
      msgs = basicSetField(newField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__FIELD, newField, newField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs)
  {
    Reference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__REFERENCE, oldReference, newReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(Reference newReference)
  {
    if (newReference != reference)
    {
      NotificationChain msgs = null;
      if (reference != null)
        msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ATTRIBUTE__REFERENCE, null, msgs);
      if (newReference != null)
        msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ATTRIBUTE__REFERENCE, null, msgs);
      msgs = basicSetReference(newReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ATTRIBUTE__REFERENCE, newReference, newReference));
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
      case RSLILPackage.ATTRIBUTE__FIELD:
        return basicSetField(null, msgs);
      case RSLILPackage.ATTRIBUTE__REFERENCE:
        return basicSetReference(null, msgs);
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
      case RSLILPackage.ATTRIBUTE__NAME:
        return getName();
      case RSLILPackage.ATTRIBUTE__DESCRITION:
        return getDescrition();
      case RSLILPackage.ATTRIBUTE__TYPE:
        return getType();
      case RSLILPackage.ATTRIBUTE__FIELD:
        return getField();
      case RSLILPackage.ATTRIBUTE__REFERENCE:
        return getReference();
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
      case RSLILPackage.ATTRIBUTE__FIELD:
        setField((Field)newValue);
        return;
      case RSLILPackage.ATTRIBUTE__REFERENCE:
        setReference((Reference)newValue);
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
      case RSLILPackage.ATTRIBUTE__FIELD:
        setField((Field)null);
        return;
      case RSLILPackage.ATTRIBUTE__REFERENCE:
        setReference((Reference)null);
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
      case RSLILPackage.ATTRIBUTE__FIELD:
        return field != null;
      case RSLILPackage.ATTRIBUTE__REFERENCE:
        return reference != null;
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
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
