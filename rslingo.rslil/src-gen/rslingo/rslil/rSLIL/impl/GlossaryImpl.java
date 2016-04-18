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

import rslingo.rslil.rSLIL.Glossary;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefGlossaryType;
import rslingo.rslil.rSLIL.TermRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getSynset <em>Synset</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.GlossaryImpl#getTermRelation <em>Term Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryImpl extends MinimalEObjectImpl.Container implements Glossary
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RefGlossaryType type;

  /**
   * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected static final String ACRONYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected String acronym = ACRONYM_EDEFAULT;

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
   * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected static final String POS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected String pos = POS_EDEFAULT;

  /**
   * The default value of the '{@link #getSynset() <em>Synset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynset()
   * @generated
   * @ordered
   */
  protected static final String SYNSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSynset() <em>Synset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynset()
   * @generated
   * @ordered
   */
  protected String synset = SYNSET_EDEFAULT;

  /**
   * The cached value of the '{@link #getTermRelation() <em>Term Relation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermRelation()
   * @generated
   * @ordered
   */
  protected EList<TermRelation> termRelation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlossaryImpl()
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
    return RSLILPackage.Literals.GLOSSARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefGlossaryType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(RefGlossaryType newType, NotificationChain msgs)
  {
    RefGlossaryType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RefGlossaryType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.GLOSSARY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.GLOSSARY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcronym()
  {
    return acronym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcronym(String newAcronym)
  {
    String oldAcronym = acronym;
    acronym = newAcronym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__ACRONYM, oldAcronym, acronym));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPos()
  {
    return pos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPos(String newPos)
  {
    String oldPos = pos;
    pos = newPos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__POS, oldPos, pos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSynset()
  {
    return synset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSynset(String newSynset)
  {
    String oldSynset = synset;
    synset = newSynset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.GLOSSARY__SYNSET, oldSynset, synset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TermRelation> getTermRelation()
  {
    if (termRelation == null)
    {
      termRelation = new EObjectContainmentEList<TermRelation>(TermRelation.class, this, RSLILPackage.GLOSSARY__TERM_RELATION);
    }
    return termRelation;
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
      case RSLILPackage.GLOSSARY__TYPE:
        return basicSetType(null, msgs);
      case RSLILPackage.GLOSSARY__TERM_RELATION:
        return ((InternalEList<?>)getTermRelation()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.GLOSSARY__ID:
        return getId();
      case RSLILPackage.GLOSSARY__NAME:
        return getName();
      case RSLILPackage.GLOSSARY__TYPE:
        return getType();
      case RSLILPackage.GLOSSARY__ACRONYM:
        return getAcronym();
      case RSLILPackage.GLOSSARY__DESCRIPTION:
        return getDescription();
      case RSLILPackage.GLOSSARY__POS:
        return getPos();
      case RSLILPackage.GLOSSARY__SYNSET:
        return getSynset();
      case RSLILPackage.GLOSSARY__TERM_RELATION:
        return getTermRelation();
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
      case RSLILPackage.GLOSSARY__ID:
        setId((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__NAME:
        setName((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__TYPE:
        setType((RefGlossaryType)newValue);
        return;
      case RSLILPackage.GLOSSARY__ACRONYM:
        setAcronym((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__POS:
        setPos((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__SYNSET:
        setSynset((String)newValue);
        return;
      case RSLILPackage.GLOSSARY__TERM_RELATION:
        getTermRelation().clear();
        getTermRelation().addAll((Collection<? extends TermRelation>)newValue);
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
      case RSLILPackage.GLOSSARY__ID:
        setId(ID_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__TYPE:
        setType((RefGlossaryType)null);
        return;
      case RSLILPackage.GLOSSARY__ACRONYM:
        setAcronym(ACRONYM_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__POS:
        setPos(POS_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__SYNSET:
        setSynset(SYNSET_EDEFAULT);
        return;
      case RSLILPackage.GLOSSARY__TERM_RELATION:
        getTermRelation().clear();
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
      case RSLILPackage.GLOSSARY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RSLILPackage.GLOSSARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLILPackage.GLOSSARY__TYPE:
        return type != null;
      case RSLILPackage.GLOSSARY__ACRONYM:
        return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
      case RSLILPackage.GLOSSARY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLILPackage.GLOSSARY__POS:
        return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
      case RSLILPackage.GLOSSARY__SYNSET:
        return SYNSET_EDEFAULT == null ? synset != null : !SYNSET_EDEFAULT.equals(synset);
      case RSLILPackage.GLOSSARY__TERM_RELATION:
        return termRelation != null && !termRelation.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", acronym: ");
    result.append(acronym);
    result.append(", description: ");
    result.append(description);
    result.append(", pos: ");
    result.append(pos);
    result.append(", synset: ");
    result.append(synset);
    result.append(')');
    return result.toString();
  }

} //GlossaryImpl
