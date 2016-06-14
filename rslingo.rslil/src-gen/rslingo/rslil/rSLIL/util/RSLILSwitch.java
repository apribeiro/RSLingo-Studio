/**
 */
package rslingo.rslil.rSLIL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.ActualSchedule;
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Check;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Date;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.GoalRelation;
import rslingo.rslil.rSLIL.Import;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.Month;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.Organizations;
import rslingo.rslil.rSLIL.PackageGlossary;
import rslingo.rslil.rSLIL.PackageGoal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageStakeholder;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.PlannedSchedule;
import rslingo.rslil.rSLIL.PrimaryKey;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.ProjectProgress;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Requirement;
import rslingo.rslil.rSLIL.RequirementRelation;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.SystemRelation;
import rslingo.rslil.rSLIL.TermType;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rslingo.rslil.rSLIL.RSLILPackage
 * @generated
 */
public class RSLILSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RSLILPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RSLILPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RSLILPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PACKAGE_PROJECT:
      {
        PackageProject packageProject = (PackageProject)theEObject;
        T result = casePackageProject(packageProject);
        if (result == null) result = caseModel(packageProject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PACKAGE_SYSTEM:
      {
        PackageSystem packageSystem = (PackageSystem)theEObject;
        T result = casePackageSystem(packageSystem);
        if (result == null) result = caseModel(packageSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PACKAGE_GLOSSARY:
      {
        PackageGlossary packageGlossary = (PackageGlossary)theEObject;
        T result = casePackageGlossary(packageGlossary);
        if (result == null) result = caseModel(packageGlossary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PACKAGE_STAKEHOLDER:
      {
        PackageStakeholder packageStakeholder = (PackageStakeholder)theEObject;
        T result = casePackageStakeholder(packageStakeholder);
        if (result == null) result = caseModel(packageStakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PACKAGE_GOAL:
      {
        PackageGoal packageGoal = (PackageGoal)theEObject;
        T result = casePackageGoal(packageGoal);
        if (result == null) result = caseModel(packageGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PLANNED_SCHEDULE:
      {
        PlannedSchedule plannedSchedule = (PlannedSchedule)theEObject;
        T result = casePlannedSchedule(plannedSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ACTUAL_SCHEDULE:
      {
        ActualSchedule actualSchedule = (ActualSchedule)theEObject;
        T result = caseActualSchedule(actualSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.MONTH:
      {
        Month month = (Month)theEObject;
        T result = caseMonth(month);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ORGANIZATIONS:
      {
        Organizations organizations = (Organizations)theEObject;
        T result = caseOrganizations(organizations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PROJECT_PROGRESS:
      {
        ProjectProgress projectProgress = (ProjectProgress)theEObject;
        T result = caseProjectProgress(projectProgress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.SYSTEM:
      {
        rslingo.rslil.rSLIL.System system = (rslingo.rslil.rSLIL.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.SYSTEM_RELATION:
      {
        SystemRelation systemRelation = (SystemRelation)theEObject;
        T result = caseSystemRelation(systemRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.GLOSSARY_TERM:
      {
        GlossaryTerm glossaryTerm = (GlossaryTerm)theEObject;
        T result = caseGlossaryTerm(glossaryTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_TERM_TYPE:
      {
        RefTermType refTermType = (RefTermType)theEObject;
        T result = caseRefTermType(refTermType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.TERM_TYPE:
      {
        TermType termType = (TermType)theEObject;
        T result = caseTermType(termType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.STAKEHOLDER:
      {
        Stakeholder stakeholder = (Stakeholder)theEObject;
        T result = caseStakeholder(stakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.GOAL_RELATION:
      {
        GoalRelation goalRelation = (GoalRelation)theEObject;
        T result = caseGoalRelation(goalRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PRIORITY:
      {
        Priority priority = (Priority)theEObject;
        T result = casePriority(priority);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_GOAL:
      {
        RefGoal refGoal = (RefGoal)theEObject;
        T result = caseRefGoal(refGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.MULTIPLICITY:
      {
        Multiplicity multiplicity = (Multiplicity)theEObject;
        T result = caseMultiplicity(multiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.PRIMARY_KEY:
      {
        PrimaryKey primaryKey = (PrimaryKey)theEObject;
        T result = casePrimaryKey(primaryKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.FOREIGN_KEY:
      {
        ForeignKey foreignKey = (ForeignKey)theEObject;
        T result = caseForeignKey(foreignKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_ATTRIBUTE:
      {
        RefAttribute refAttribute = (RefAttribute)theEObject;
        T result = caseRefAttribute(refAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.USE_CASE:
      {
        UseCase useCase = (UseCase)theEObject;
        T result = caseUseCase(useCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_ENTITY:
      {
        RefEntity refEntity = (RefEntity)theEObject;
        T result = caseRefEntity(refEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.ENTITY_TYPE:
      {
        EntityType entityType = (EntityType)theEObject;
        T result = caseEntityType(entityType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_FR:
      {
        RefFR refFR = (RefFR)theEObject;
        T result = caseRefFR(refFR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_ACTOR:
      {
        RefActor refActor = (RefActor)theEObject;
        T result = caseRefActor(refActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REF_UC:
      {
        RefUC refUC = (RefUC)theEObject;
        T result = caseRefUC(refUC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.EXTENSION_POINT:
      {
        ExtensionPoint extensionPoint = (ExtensionPoint)theEObject;
        T result = caseExtensionPoint(extensionPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.STEP:
      {
        Step step = (Step)theEObject;
        T result = caseStep(step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.FR:
      {
        FR fr = (FR)theEObject;
        T result = caseFR(fr);
        if (result == null) result = caseRequirement(fr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.QR:
      {
        QR qr = (QR)theEObject;
        T result = caseQR(qr);
        if (result == null) result = caseRequirement(qr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseRequirement(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLILPackage.REQUIREMENT_RELATION:
      {
        RequirementRelation requirementRelation = (RequirementRelation)theEObject;
        T result = caseRequirementRelation(requirementRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageProject(PackageProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageSystem(PackageSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Glossary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Glossary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageGlossary(PackageGlossary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageStakeholder(PackageStakeholder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageGoal(PackageGoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planned Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planned Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlannedSchedule(PlannedSchedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualSchedule(ActualSchedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Month</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonth(Month object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organizations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizations(Organizations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project Progress</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project Progress</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectProgress(ProjectProgress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(rslingo.rslil.rSLIL.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemRelation(SystemRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Glossary Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glossary Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlossaryTerm(GlossaryTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Term Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Term Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefTermType(RefTermType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermType(TermType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStakeholder(Stakeholder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalRelation(GoalRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriority(Priority object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefGoal(RefGoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicity(Multiplicity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKey(PrimaryKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeignKey(ForeignKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefAttribute(RefAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseCase(UseCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefEntity(RefEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityType(EntityType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref FR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref FR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefFR(RefFR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefActor(RefActor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref UC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref UC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefUC(RefUC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionPoint(ExtensionPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStep(Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFR(FR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQR(QR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementRelation(RequirementRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RSLILSwitch
