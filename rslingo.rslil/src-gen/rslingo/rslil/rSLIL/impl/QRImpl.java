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

import rslingo.rslil.rSLIL.DependsOnQR;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.QRImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRImpl extends MinimalEObjectImpl.Container implements QR
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
   * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected static final String SUB_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected String subType = SUB_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final String METRIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected String metric = METRIC_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholder()
   * @generated
   * @ordered
   */
  protected Stakeholder stakeholder;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected Priority priority;

  /**
   * The cached value of the '{@link #getDepends() <em>Depends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepends()
   * @generated
   * @ordered
   */
  protected EList<DependsOnQR> depends;

  /**
   * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartOf()
   * @generated
   * @ordered
   */
  protected QR partOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QRImpl()
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
    return RSLILPackage.Literals.QR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__NAME_ALIAS, oldNameAlias, nameAlias));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubType()
  {
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubType(String newSubType)
  {
    String oldSubType = subType;
    subType = newSubType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__SUB_TYPE, oldSubType, subType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetric(String newMetric)
  {
    String oldMetric = metric;
    metric = newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__METRIC, oldMetric, metric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder getStakeholder()
  {
    if (stakeholder != null && stakeholder.eIsProxy())
    {
      InternalEObject oldStakeholder = (InternalEObject)stakeholder;
      stakeholder = (Stakeholder)eResolveProxy(oldStakeholder);
      if (stakeholder != oldStakeholder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.QR__STAKEHOLDER, oldStakeholder, stakeholder));
      }
    }
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetStakeholder()
  {
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStakeholder(Stakeholder newStakeholder)
  {
    Stakeholder oldStakeholder = stakeholder;
    stakeholder = newStakeholder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__STAKEHOLDER, oldStakeholder, stakeholder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPriority(Priority newPriority, NotificationChain msgs)
  {
    Priority oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__PRIORITY, oldPriority, newPriority);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(Priority newPriority)
  {
    if (newPriority != priority)
    {
      NotificationChain msgs = null;
      if (priority != null)
        msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.QR__PRIORITY, null, msgs);
      if (newPriority != null)
        msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.QR__PRIORITY, null, msgs);
      msgs = basicSetPriority(newPriority, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__PRIORITY, newPriority, newPriority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependsOnQR> getDepends()
  {
    if (depends == null)
    {
      depends = new EObjectContainmentEList<DependsOnQR>(DependsOnQR.class, this, RSLILPackage.QR__DEPENDS);
    }
    return depends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR getPartOf()
  {
    if (partOf != null && partOf.eIsProxy())
    {
      InternalEObject oldPartOf = (InternalEObject)partOf;
      partOf = (QR)eResolveProxy(oldPartOf);
      if (partOf != oldPartOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLILPackage.QR__PART_OF, oldPartOf, partOf));
      }
    }
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR basicGetPartOf()
  {
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartOf(QR newPartOf)
  {
    QR oldPartOf = partOf;
    partOf = newPartOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.QR__PART_OF, oldPartOf, partOf));
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
      case RSLILPackage.QR__PRIORITY:
        return basicSetPriority(null, msgs);
      case RSLILPackage.QR__DEPENDS:
        return ((InternalEList<?>)getDepends()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.QR__NAME:
        return getName();
      case RSLILPackage.QR__NAME_ALIAS:
        return getNameAlias();
      case RSLILPackage.QR__DESCRIPTION:
        return getDescription();
      case RSLILPackage.QR__TYPE:
        return getType();
      case RSLILPackage.QR__SUB_TYPE:
        return getSubType();
      case RSLILPackage.QR__METRIC:
        return getMetric();
      case RSLILPackage.QR__VALUE:
        return getValue();
      case RSLILPackage.QR__STAKEHOLDER:
        if (resolve) return getStakeholder();
        return basicGetStakeholder();
      case RSLILPackage.QR__PRIORITY:
        return getPriority();
      case RSLILPackage.QR__DEPENDS:
        return getDepends();
      case RSLILPackage.QR__PART_OF:
        if (resolve) return getPartOf();
        return basicGetPartOf();
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
      case RSLILPackage.QR__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.QR__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RSLILPackage.QR__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.QR__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.QR__SUB_TYPE:
        setSubType((String)newValue);
        return;
      case RSLILPackage.QR__METRIC:
        setMetric((String)newValue);
        return;
      case RSLILPackage.QR__VALUE:
        setValue((Integer)newValue);
        return;
      case RSLILPackage.QR__STAKEHOLDER:
        setStakeholder((Stakeholder)newValue);
        return;
      case RSLILPackage.QR__PRIORITY:
        setPriority((Priority)newValue);
        return;
      case RSLILPackage.QR__DEPENDS:
        getDepends().clear();
        getDepends().addAll((Collection<? extends DependsOnQR>)newValue);
        return;
      case RSLILPackage.QR__PART_OF:
        setPartOf((QR)newValue);
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
      case RSLILPackage.QR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.QR__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RSLILPackage.QR__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.QR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.QR__SUB_TYPE:
        setSubType(SUB_TYPE_EDEFAULT);
        return;
      case RSLILPackage.QR__METRIC:
        setMetric(METRIC_EDEFAULT);
        return;
      case RSLILPackage.QR__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case RSLILPackage.QR__STAKEHOLDER:
        setStakeholder((Stakeholder)null);
        return;
      case RSLILPackage.QR__PRIORITY:
        setPriority((Priority)null);
        return;
      case RSLILPackage.QR__DEPENDS:
        getDepends().clear();
        return;
      case RSLILPackage.QR__PART_OF:
        setPartOf((QR)null);
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
      case RSLILPackage.QR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.QR__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RSLILPackage.QR__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.QR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.QR__SUB_TYPE:
        return SUB_TYPE_EDEFAULT == null ? subType != null : !SUB_TYPE_EDEFAULT.equals(subType);
      case RSLILPackage.QR__METRIC:
        return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
      case RSLILPackage.QR__VALUE:
        return value != VALUE_EDEFAULT;
      case RSLILPackage.QR__STAKEHOLDER:
        return stakeholder != null;
      case RSLILPackage.QR__PRIORITY:
        return priority != null;
      case RSLILPackage.QR__DEPENDS:
        return depends != null && !depends.isEmpty();
      case RSLILPackage.QR__PART_OF:
        return partOf != null;
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
    result.append(", subType: ");
    result.append(subType);
    result.append(", metric: ");
    result.append(metric);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //QRImpl
