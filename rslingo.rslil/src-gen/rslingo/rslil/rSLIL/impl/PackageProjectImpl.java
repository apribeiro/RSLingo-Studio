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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getGlossaryTerms <em>Glossary Terms</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageProjectImpl extends ModelImpl implements PackageProject
{
  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected Project project;

  /**
   * The cached value of the '{@link #getGlossaryTerms() <em>Glossary Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlossaryTerms()
   * @generated
   * @ordered
   */
  protected EList<GlossaryTerm> glossaryTerms;

  /**
   * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholders()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> stakeholders;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Goal> goals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageProjectImpl()
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
    return RSLILPackage.Literals.PACKAGE_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProject(Project newProject, NotificationChain msgs)
  {
    Project oldProject = project;
    project = newProject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLILPackage.PACKAGE_PROJECT__PROJECT, oldProject, newProject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(Project newProject)
  {
    if (newProject != project)
    {
      NotificationChain msgs = null;
      if (project != null)
        msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PACKAGE_PROJECT__PROJECT, null, msgs);
      if (newProject != null)
        msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLILPackage.PACKAGE_PROJECT__PROJECT, null, msgs);
      msgs = basicSetProject(newProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLILPackage.PACKAGE_PROJECT__PROJECT, newProject, newProject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlossaryTerm> getGlossaryTerms()
  {
    if (glossaryTerms == null)
    {
      glossaryTerms = new EObjectContainmentEList<GlossaryTerm>(GlossaryTerm.class, this, RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS);
    }
    return glossaryTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stakeholder> getStakeholders()
  {
    if (stakeholders == null)
    {
      stakeholders = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS);
    }
    return stakeholders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, RSLILPackage.PACKAGE_PROJECT__GOALS);
    }
    return goals;
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
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return basicSetProject(null, msgs);
      case RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS:
        return ((InternalEList<?>)getGlossaryTerms()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS:
        return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return getProject();
      case RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS:
        return getGlossaryTerms();
      case RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS:
        return getStakeholders();
      case RSLILPackage.PACKAGE_PROJECT__GOALS:
        return getGoals();
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
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        setProject((Project)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
        getGlossaryTerms().addAll((Collection<? extends GlossaryTerm>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS:
        getStakeholders().clear();
        getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
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
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        setProject((Project)null);
        return;
      case RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS:
        getStakeholders().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__GOALS:
        getGoals().clear();
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
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return project != null;
      case RSLILPackage.PACKAGE_PROJECT__GLOSSARY_TERMS:
        return glossaryTerms != null && !glossaryTerms.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__STAKEHOLDERS:
        return stakeholders != null && !stakeholders.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__GOALS:
        return goals != null && !goals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageProjectImpl
