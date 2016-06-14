/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import rslingo.rslil.rSLIL.RSLILFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSLILFactoryImpl extends EFactoryImpl implements RSLILFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RSLILFactory init()
  {
    try
    {
      RSLILFactory theRSLILFactory = (RSLILFactory)EPackage.Registry.INSTANCE.getEFactory(RSLILPackage.eNS_URI);
      if (theRSLILFactory != null)
      {
        return theRSLILFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RSLILFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RSLILPackage.MODEL: return createModel();
      case RSLILPackage.PACKAGE_PROJECT: return createPackageProject();
      case RSLILPackage.PACKAGE_SYSTEM: return createPackageSystem();
      case RSLILPackage.PACKAGE_GLOSSARY: return createPackageGlossary();
      case RSLILPackage.PACKAGE_STAKEHOLDER: return createPackageStakeholder();
      case RSLILPackage.PACKAGE_GOAL: return createPackageGoal();
      case RSLILPackage.IMPORT: return createImport();
      case RSLILPackage.PROJECT: return createProject();
      case RSLILPackage.PLANNED_SCHEDULE: return createPlannedSchedule();
      case RSLILPackage.ACTUAL_SCHEDULE: return createActualSchedule();
      case RSLILPackage.DATE: return createDate();
      case RSLILPackage.MONTH: return createMonth();
      case RSLILPackage.ORGANIZATIONS: return createOrganizations();
      case RSLILPackage.PROJECT_PROGRESS: return createProjectProgress();
      case RSLILPackage.SYSTEM: return createSystem();
      case RSLILPackage.SYSTEM_RELATION: return createSystemRelation();
      case RSLILPackage.GLOSSARY_TERM: return createGlossaryTerm();
      case RSLILPackage.REF_TERM_TYPE: return createRefTermType();
      case RSLILPackage.TERM_TYPE: return createTermType();
      case RSLILPackage.STAKEHOLDER: return createStakeholder();
      case RSLILPackage.GOAL: return createGoal();
      case RSLILPackage.GOAL_RELATION: return createGoalRelation();
      case RSLILPackage.PRIORITY: return createPriority();
      case RSLILPackage.REF_GOAL: return createRefGoal();
      case RSLILPackage.ENTITY: return createEntity();
      case RSLILPackage.ATTRIBUTE: return createAttribute();
      case RSLILPackage.MULTIPLICITY: return createMultiplicity();
      case RSLILPackage.PRIMARY_KEY: return createPrimaryKey();
      case RSLILPackage.FOREIGN_KEY: return createForeignKey();
      case RSLILPackage.REF_ATTRIBUTE: return createRefAttribute();
      case RSLILPackage.CHECK: return createCheck();
      case RSLILPackage.ACTOR: return createActor();
      case RSLILPackage.USE_CASE: return createUseCase();
      case RSLILPackage.REF_ENTITY: return createRefEntity();
      case RSLILPackage.ENTITY_TYPE: return createEntityType();
      case RSLILPackage.REF_FR: return createRefFR();
      case RSLILPackage.REF_ACTOR: return createRefActor();
      case RSLILPackage.REF_UC: return createRefUC();
      case RSLILPackage.EXTENSION_POINT: return createExtensionPoint();
      case RSLILPackage.SCENARIO: return createScenario();
      case RSLILPackage.STEP: return createStep();
      case RSLILPackage.FR: return createFR();
      case RSLILPackage.QR: return createQR();
      case RSLILPackage.CONSTRAINT: return createConstraint();
      case RSLILPackage.REQUIREMENT: return createRequirement();
      case RSLILPackage.REQUIREMENT_RELATION: return createRequirementRelation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageProject createPackageProject()
  {
    PackageProjectImpl packageProject = new PackageProjectImpl();
    return packageProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageSystem createPackageSystem()
  {
    PackageSystemImpl packageSystem = new PackageSystemImpl();
    return packageSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageGlossary createPackageGlossary()
  {
    PackageGlossaryImpl packageGlossary = new PackageGlossaryImpl();
    return packageGlossary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageStakeholder createPackageStakeholder()
  {
    PackageStakeholderImpl packageStakeholder = new PackageStakeholderImpl();
    return packageStakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageGoal createPackageGoal()
  {
    PackageGoalImpl packageGoal = new PackageGoalImpl();
    return packageGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedSchedule createPlannedSchedule()
  {
    PlannedScheduleImpl plannedSchedule = new PlannedScheduleImpl();
    return plannedSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualSchedule createActualSchedule()
  {
    ActualScheduleImpl actualSchedule = new ActualScheduleImpl();
    return actualSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Month createMonth()
  {
    MonthImpl month = new MonthImpl();
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizations createOrganizations()
  {
    OrganizationsImpl organizations = new OrganizationsImpl();
    return organizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectProgress createProjectProgress()
  {
    ProjectProgressImpl projectProgress = new ProjectProgressImpl();
    return projectProgress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelation createSystemRelation()
  {
    SystemRelationImpl systemRelation = new SystemRelationImpl();
    return systemRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryTerm createGlossaryTerm()
  {
    GlossaryTermImpl glossaryTerm = new GlossaryTermImpl();
    return glossaryTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTermType createRefTermType()
  {
    RefTermTypeImpl refTermType = new RefTermTypeImpl();
    return refTermType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermType createTermType()
  {
    TermTypeImpl termType = new TermTypeImpl();
    return termType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder createStakeholder()
  {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalRelation createGoalRelation()
  {
    GoalRelationImpl goalRelation = new GoalRelationImpl();
    return goalRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefGoal createRefGoal()
  {
    RefGoalImpl refGoal = new RefGoalImpl();
    return refGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey createPrimaryKey()
  {
    PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey createForeignKey()
  {
    ForeignKeyImpl foreignKey = new ForeignKeyImpl();
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute createRefAttribute()
  {
    RefAttributeImpl refAttribute = new RefAttributeImpl();
    return refAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEntity createRefEntity()
  {
    RefEntityImpl refEntity = new RefEntityImpl();
    return refEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefFR createRefFR()
  {
    RefFRImpl refFR = new RefFRImpl();
    return refFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefActor createRefActor()
  {
    RefActorImpl refActor = new RefActorImpl();
    return refActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefUC createRefUC()
  {
    RefUCImpl refUC = new RefUCImpl();
    return refUC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPoint createExtensionPoint()
  {
    ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
    return extensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FR createFR()
  {
    FRImpl fr = new FRImpl();
    return fr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR createQR()
  {
    QRImpl qr = new QRImpl();
    return qr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementRelation createRequirementRelation()
  {
    RequirementRelationImpl requirementRelation = new RequirementRelationImpl();
    return requirementRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILPackage getRSLILPackage()
  {
    return (RSLILPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RSLILPackage getPackage()
  {
    return RSLILPackage.eINSTANCE;
  }

} //RSLILFactoryImpl
