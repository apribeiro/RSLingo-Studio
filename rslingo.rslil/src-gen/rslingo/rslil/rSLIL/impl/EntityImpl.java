/**
 */
package rslingo.rslil.rSLIL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.RSLILPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.EntityImpl#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
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
   * The default value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected static final String NAME_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected String nameAlias = NAME_ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKey()
   * @generated
   * @ordered
   */
  protected ForeignKey foreignKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return RSLILPackage.Literals.ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameAlias()
  {
    return nameAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameAlias(String newNameAlias)
  {
    String oldNameAlias = nameAlias;
    nameAlias = newNameAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RSLILPackage.ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey getForeignKey()
  {
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeignKey(ForeignKey newForeignKey, NotificationChain msgs)
  {
    ForeignKey oldForeignKey = foreignKey;
    foreignKey = newForeignKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__FOREIGN_KEY, oldForeignKey, newForeignKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignKey(ForeignKey newForeignKey)
  {
    if (newForeignKey != foreignKey)
    {
      NotificationChain msgs = null;
      if (foreignKey != null)
        msgs = ((InternalEObject)foreignKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ENTITY__FOREIGN_KEY, null, msgs);
      if (newForeignKey != null)
        msgs = ((InternalEObject)newForeignKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.ENTITY__FOREIGN_KEY, null, msgs);
      msgs = basicSetForeignKey(newForeignKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.ENTITY__FOREIGN_KEY, newForeignKey, newForeignKey));
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
      case RSLILPackage.ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case RSLILPackage.ENTITY__FOREIGN_KEY:
        return basicSetForeignKey(null, msgs);
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
      case RSLILPackage.ENTITY__NAME:
        return getName();
      case RSLILPackage.ENTITY__NAME_ALIAS:
        return getNameAlias();
      case RSLILPackage.ENTITY__DESCRIPTION:
        return getDescription();
      case RSLILPackage.ENTITY__TYPE:
        return getType();
      case RSLILPackage.ENTITY__ATTRIBUTES:
        return getAttributes();
      case RSLILPackage.ENTITY__FOREIGN_KEY:
        return getForeignKey();
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
      case RSLILPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.ENTITY__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RSLILPackage.ENTITY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.ENTITY__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case RSLILPackage.ENTITY__FOREIGN_KEY:
        setForeignKey((ForeignKey)newValue);
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
      case RSLILPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.ENTITY__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RSLILPackage.ENTITY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.ENTITY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case RSLILPackage.ENTITY__FOREIGN_KEY:
        setForeignKey((ForeignKey)null);
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
      case RSLILPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.ENTITY__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RSLILPackage.ENTITY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.ENTITY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case RSLILPackage.ENTITY__FOREIGN_KEY:
        return foreignKey != null;
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
    result.append(", nameAlias: ");
    result.append(nameAlias);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
