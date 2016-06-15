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

import rslingo.rslil.rSLIL.Import;
import rslingo.rslil.rSLIL.PackageGlossary;
import rslingo.rslil.rSLIL.PackageGoal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageStakeholder;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.SystemRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getPackageGlossaries <em>Package Glossaries</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getPackageStakeholders <em>Package Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getPackageGoals <em>Package Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getPackageSystems <em>Package Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl#getSystemRelations <em>System Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageProjectImpl extends ModelImpl implements PackageProject
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

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
   * The cached value of the '{@link #getPackageGlossaries() <em>Package Glossaries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageGlossaries()
   * @generated
   * @ordered
   */
  protected EList<PackageGlossary> packageGlossaries;

  /**
   * The cached value of the '{@link #getPackageStakeholders() <em>Package Stakeholders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageStakeholders()
   * @generated
   * @ordered
   */
  protected EList<PackageStakeholder> packageStakeholders;

  /**
   * The cached value of the '{@link #getPackageGoals() <em>Package Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageGoals()
   * @generated
   * @ordered
   */
  protected EList<PackageGoal> packageGoals;

  /**
   * The cached value of the '{@link #getPackageSystems() <em>Package Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageSystems()
   * @generated
   * @ordered
   */
  protected EList<PackageSystem> packageSystems;

  /**
   * The cached value of the '{@link #getSystemRelations() <em>System Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemRelations()
   * @generated
   * @ordered
   */
  protected EList<SystemRelation> systemRelations;

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
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, RSLILPackage.PACKAGE_PROJECT__IMPORTS);
    }
    return imports;
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
  public EList<PackageGlossary> getPackageGlossaries()
  {
    if (packageGlossaries == null)
    {
      packageGlossaries = new EObjectContainmentEList<PackageGlossary>(PackageGlossary.class, this, RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES);
    }
    return packageGlossaries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageStakeholder> getPackageStakeholders()
  {
    if (packageStakeholders == null)
    {
      packageStakeholders = new EObjectContainmentEList<PackageStakeholder>(PackageStakeholder.class, this, RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS);
    }
    return packageStakeholders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageGoal> getPackageGoals()
  {
    if (packageGoals == null)
    {
      packageGoals = new EObjectContainmentEList<PackageGoal>(PackageGoal.class, this, RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS);
    }
    return packageGoals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageSystem> getPackageSystems()
  {
    if (packageSystems == null)
    {
      packageSystems = new EObjectContainmentEList<PackageSystem>(PackageSystem.class, this, RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS);
    }
    return packageSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemRelation> getSystemRelations()
  {
    if (systemRelations == null)
    {
      systemRelations = new EObjectContainmentEList<SystemRelation>(SystemRelation.class, this, RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS);
    }
    return systemRelations;
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
      case RSLILPackage.PACKAGE_PROJECT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return basicSetProject(null, msgs);
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES:
        return ((InternalEList<?>)getPackageGlossaries()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS:
        return ((InternalEList<?>)getPackageStakeholders()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS:
        return ((InternalEList<?>)getPackageGoals()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS:
        return ((InternalEList<?>)getPackageSystems()).basicRemove(otherEnd, msgs);
      case RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS:
        return ((InternalEList<?>)getSystemRelations()).basicRemove(otherEnd, msgs);
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
      case RSLILPackage.PACKAGE_PROJECT__IMPORTS:
        return getImports();
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return getProject();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES:
        return getPackageGlossaries();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS:
        return getPackageStakeholders();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS:
        return getPackageGoals();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS:
        return getPackageSystems();
      case RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS:
        return getSystemRelations();
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
      case RSLILPackage.PACKAGE_PROJECT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        setProject((Project)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES:
        getPackageGlossaries().clear();
        getPackageGlossaries().addAll((Collection<? extends PackageGlossary>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS:
        getPackageStakeholders().clear();
        getPackageStakeholders().addAll((Collection<? extends PackageStakeholder>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS:
        getPackageGoals().clear();
        getPackageGoals().addAll((Collection<? extends PackageGoal>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS:
        getPackageSystems().clear();
        getPackageSystems().addAll((Collection<? extends PackageSystem>)newValue);
        return;
      case RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS:
        getSystemRelations().clear();
        getSystemRelations().addAll((Collection<? extends SystemRelation>)newValue);
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
      case RSLILPackage.PACKAGE_PROJECT__IMPORTS:
        getImports().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        setProject((Project)null);
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES:
        getPackageGlossaries().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS:
        getPackageStakeholders().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS:
        getPackageGoals().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS:
        getPackageSystems().clear();
        return;
      case RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS:
        getSystemRelations().clear();
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
      case RSLILPackage.PACKAGE_PROJECT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__PROJECT:
        return project != null;
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GLOSSARIES:
        return packageGlossaries != null && !packageGlossaries.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS:
        return packageStakeholders != null && !packageStakeholders.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_GOALS:
        return packageGoals != null && !packageGoals.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__PACKAGE_SYSTEMS:
        return packageSystems != null && !packageSystems.isEmpty();
      case RSLILPackage.PACKAGE_PROJECT__SYSTEM_RELATIONS:
        return systemRelations != null && !systemRelations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageProjectImpl
