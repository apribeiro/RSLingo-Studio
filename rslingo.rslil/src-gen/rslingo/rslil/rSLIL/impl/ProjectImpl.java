/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil.rSLIL.ActualSchedule;
import rslingo.rslil.rSLIL.Organizations;
import rslingo.rslil.rSLIL.PlannedSchedule;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getPlanned <em>Planned</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
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
   * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected String domain = DOMAIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlanned() <em>Planned</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanned()
   * @generated
   * @ordered
   */
  protected PlannedSchedule planned;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected ActualSchedule actual;

  /**
   * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizations()
   * @generated
   * @ordered
   */
  protected Organizations organizations;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected Status status;

  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
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
    return RSLILPackage.Literals.PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__NAME_ALIAS, oldNameAlias, nameAlias));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(String newDomain)
  {
    String oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__DOMAIN, oldDomain, domain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedSchedule getPlanned()
  {
    return planned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlanned(PlannedSchedule newPlanned, NotificationChain msgs)
  {
    PlannedSchedule oldPlanned = planned;
    planned = newPlanned;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__PLANNED, oldPlanned, newPlanned);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanned(PlannedSchedule newPlanned)
  {
    if (newPlanned != planned)
    {
      NotificationChain msgs = null;
      if (planned != null)
        msgs = ((InternalEObject)planned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__PLANNED, null, msgs);
      if (newPlanned != null)
        msgs = ((InternalEObject)newPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__PLANNED, null, msgs);
      msgs = basicSetPlanned(newPlanned, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__PLANNED, newPlanned, newPlanned));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualSchedule getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(ActualSchedule newActual, NotificationChain msgs)
  {
    ActualSchedule oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(ActualSchedule newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__ACTUAL, newActual, newActual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizations getOrganizations()
  {
    return organizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrganizations(Organizations newOrganizations, NotificationChain msgs)
  {
    Organizations oldOrganizations = organizations;
    organizations = newOrganizations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__ORGANIZATIONS, oldOrganizations, newOrganizations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganizations(Organizations newOrganizations)
  {
    if (newOrganizations != organizations)
    {
      NotificationChain msgs = null;
      if (organizations != null)
        msgs = ((InternalEObject)organizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__ORGANIZATIONS, null, msgs);
      if (newOrganizations != null)
        msgs = ((InternalEObject)newOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__ORGANIZATIONS, null, msgs);
      msgs = basicSetOrganizations(newOrganizations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__ORGANIZATIONS, newOrganizations, newOrganizations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Status getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs)
  {
    Status oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__STATUS, oldStatus, newStatus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(Status newStatus)
  {
    if (newStatus != status)
    {
      NotificationChain msgs = null;
      if (status != null)
        msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__STATUS, null, msgs);
      if (newStatus != null)
        msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PROJECT__STATUS, null, msgs);
      msgs = basicSetStatus(newStatus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__STATUS, newStatus, newStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__SUMMARY, oldSummary, summary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PROJECT__DESCRIPTION, oldDescription, description));
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
      case RSLILPackage.PROJECT__PLANNED:
        return basicSetPlanned(null, msgs);
      case RSLILPackage.PROJECT__ACTUAL:
        return basicSetActual(null, msgs);
      case RSLILPackage.PROJECT__ORGANIZATIONS:
        return basicSetOrganizations(null, msgs);
      case RSLILPackage.PROJECT__STATUS:
        return basicSetStatus(null, msgs);
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
      case RSLILPackage.PROJECT__NAME:
        return getName();
      case RSLILPackage.PROJECT__NAME_ALIAS:
        return getNameAlias();
      case RSLILPackage.PROJECT__TYPE:
        return getType();
      case RSLILPackage.PROJECT__DOMAIN:
        return getDomain();
      case RSLILPackage.PROJECT__PLANNED:
        return getPlanned();
      case RSLILPackage.PROJECT__ACTUAL:
        return getActual();
      case RSLILPackage.PROJECT__ORGANIZATIONS:
        return getOrganizations();
      case RSLILPackage.PROJECT__STATUS:
        return getStatus();
      case RSLILPackage.PROJECT__SUMMARY:
        return getSummary();
      case RSLILPackage.PROJECT__DESCRIPTION:
        return getDescription();
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
      case RSLILPackage.PROJECT__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.PROJECT__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RSLILPackage.PROJECT__TYPE:
        setType((String)newValue);
        return;
      case RSLILPackage.PROJECT__DOMAIN:
        setDomain((String)newValue);
        return;
      case RSLILPackage.PROJECT__PLANNED:
        setPlanned((PlannedSchedule)newValue);
        return;
      case RSLILPackage.PROJECT__ACTUAL:
        setActual((ActualSchedule)newValue);
        return;
      case RSLILPackage.PROJECT__ORGANIZATIONS:
        setOrganizations((Organizations)newValue);
        return;
      case RSLILPackage.PROJECT__STATUS:
        setStatus((Status)newValue);
        return;
      case RSLILPackage.PROJECT__SUMMARY:
        setSummary((String)newValue);
        return;
      case RSLILPackage.PROJECT__DESCRIPTION:
        setDescription((String)newValue);
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
      case RSLILPackage.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.PROJECT__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RSLILPackage.PROJECT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RSLILPackage.PROJECT__DOMAIN:
        setDomain(DOMAIN_EDEFAULT);
        return;
      case RSLILPackage.PROJECT__PLANNED:
        setPlanned((PlannedSchedule)null);
        return;
      case RSLILPackage.PROJECT__ACTUAL:
        setActual((ActualSchedule)null);
        return;
      case RSLILPackage.PROJECT__ORGANIZATIONS:
        setOrganizations((Organizations)null);
        return;
      case RSLILPackage.PROJECT__STATUS:
        setStatus((Status)null);
        return;
      case RSLILPackage.PROJECT__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case RSLILPackage.PROJECT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case RSLILPackage.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.PROJECT__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RSLILPackage.PROJECT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RSLILPackage.PROJECT__DOMAIN:
        return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
      case RSLILPackage.PROJECT__PLANNED:
        return planned != null;
      case RSLILPackage.PROJECT__ACTUAL:
        return actual != null;
      case RSLILPackage.PROJECT__ORGANIZATIONS:
        return organizations != null;
      case RSLILPackage.PROJECT__STATUS:
        return status != null;
      case RSLILPackage.PROJECT__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case RSLILPackage.PROJECT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(", type: ");
    result.append(type);
    result.append(", domain: ");
    result.append(domain);
    result.append(", summary: ");
    result.append(summary);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ProjectImpl
