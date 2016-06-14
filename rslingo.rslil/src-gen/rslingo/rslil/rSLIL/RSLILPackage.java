/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rslingo.rslil.rSLIL.RSLILFactory
 * @model kind="package"
 * @generated
 */
public interface RSLILPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rSLIL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rslil.rslingo/RSLIL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rSLIL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RSLILPackage eINSTANCE = rslingo.rslil.rSLIL.impl.RSLILPackageImpl.init();

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ModelImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl <em>Package Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PackageProjectImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageProject()
   * @generated
   */
  int PACKAGE_PROJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__IMPORTS = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PROJECT = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Package Glossary</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_GLOSSARY = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Package Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Package Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_GOALS = MODEL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Goal Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__GOAL_RELATIONS = MODEL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Package Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_SYSTEMS = MODEL_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>System Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__SYSTEM_RELATIONS = MODEL_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Package Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT_FEATURE_COUNT = MODEL_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl <em>Package System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PackageSystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageSystem()
   * @generated
   */
  int PACKAGE_SYSTEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__IMPORTS = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__SYSTEM = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__ENTITIES = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__ACTORS = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__USE_CASES = MODEL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Frs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__FRS = MODEL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Qrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__QRS = MODEL_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__CONSTRAINTS = MODEL_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Requirement Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__REQUIREMENT_RELATIONS = MODEL_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Package System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PackageGlossaryImpl <em>Package Glossary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PackageGlossaryImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageGlossary()
   * @generated
   */
  int PACKAGE_GLOSSARY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Glossary Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY__GLOSSARY_TERMS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Glossary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PackageStakeholderImpl <em>Package Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PackageStakeholderImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageStakeholder()
   * @generated
   */
  int PACKAGE_STAKEHOLDER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER__STAKEHOLDERS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PackageGoalImpl <em>Package Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PackageGoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageGoal()
   * @generated
   */
  int PACKAGE_GOAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GOAL__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GOAL__GOALS = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Goal Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GOAL__GOAL_RELATIONS = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GOAL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ImportImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 6;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ProjectImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TYPE = 2;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DOMAIN = 3;

  /**
   * The feature id for the '<em><b>Planned</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PLANNED = 4;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ACTUAL = 5;

  /**
   * The feature id for the '<em><b>Organizations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ORGANIZATIONS = 6;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROGRESS = 7;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__SUMMARY = 8;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DESCRIPTION = 9;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PlannedScheduleImpl <em>Planned Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PlannedScheduleImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPlannedSchedule()
   * @generated
   */
  int PLANNED_SCHEDULE = 8;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE__END = 1;

  /**
   * The number of structural features of the '<em>Planned Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ActualScheduleImpl <em>Actual Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ActualScheduleImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getActualSchedule()
   * @generated
   */
  int ACTUAL_SCHEDULE = 9;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE__END = 1;

  /**
   * The number of structural features of the '<em>Actual Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.DateImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDate()
   * @generated
   */
  int DATE = 10;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DAY = 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__MONTH = 1;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__YEAR = 2;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.MonthImpl <em>Month</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.MonthImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getMonth()
   * @generated
   */
  int MONTH = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH__NAME = 0;

  /**
   * The number of structural features of the '<em>Month</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.OrganizationsImpl <em>Organizations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.OrganizationsImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getOrganizations()
   * @generated
   */
  int ORGANIZATIONS = 12;

  /**
   * The feature id for the '<em><b>Customer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__CUSTOMER = 0;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__SUPPLIER = 1;

  /**
   * The feature id for the '<em><b>Partners</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__PARTNERS = 2;

  /**
   * The number of structural features of the '<em>Organizations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ProjectProgressImpl <em>Project Progress</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ProjectProgressImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getProjectProgress()
   * @generated
   */
  int PROJECT_PROGRESS = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_PROGRESS__VALUE = 0;

  /**
   * The number of structural features of the '<em>Project Progress</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_PROGRESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.SystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__TYPE = 3;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SCOPE = 4;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__PART_OF = 5;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.SystemRelationImpl <em>System Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.SystemRelationImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystemRelation()
   * @generated
   */
  int SYSTEM_RELATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__CATEGORY = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__TYPE = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>System Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GlossaryTermImpl <em>Glossary Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GlossaryTermImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGlossaryTerm()
   * @generated
   */
  int GLOSSARY_TERM = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__TYPE = 3;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__ACRONYM = 4;

  /**
   * The feature id for the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__POS = 5;

  /**
   * The feature id for the '<em><b>Synonym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__SYNONYM = 6;

  /**
   * The feature id for the '<em><b>Hypernym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__HYPERNYM = 7;

  /**
   * The number of structural features of the '<em>Glossary Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefTermTypeImpl <em>Ref Term Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefTermTypeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefTermType()
   * @generated
   */
  int REF_TERM_TYPE = 17;

  /**
   * The feature id for the '<em><b>Ref Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_TYPE__REF_TYPE = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_TYPE__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref Term Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.TermTypeImpl <em>Term Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.TermTypeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getTermType()
   * @generated
   */
  int TERM_TYPE = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Term Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.StakeholderImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__TYPE = 3;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__CATEGORY = 4;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__IS_A = 5;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__PART_OF = 6;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER = 3;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = 4;

  /**
   * The feature id for the '<em><b>Part Of And</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PART_OF_AND = 5;

  /**
   * The feature id for the '<em><b>Part Of Or</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PART_OF_OR = 6;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PROGRESS = 7;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GoalRelationImpl <em>Goal Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GoalRelationImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGoalRelation()
   * @generated
   */
  int GOAL_RELATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION__TYPE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION__DESCRIPTION = 4;

  /**
   * The number of structural features of the '<em>Goal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_RELATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PriorityImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefGoalImpl <em>Ref Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefGoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefGoal()
   * @generated
   */
  int REF_GOAL = 23;

  /**
   * The feature id for the '<em><b>Ref Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_GOAL__REF_GOAL = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_GOAL__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_GOAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.EntityImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRIMARY_KEY = 5;

  /**
   * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FOREIGN_KEYS = 6;

  /**
   * The feature id for the '<em><b>Checks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CHECKS = 7;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.AttributeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 3;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SIZE = 4;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTIPLICITY = 5;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT_VALUE = 6;

  /**
   * The feature id for the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NOT_NULL = 7;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNIQUE = 8;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.MultiplicityImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.PrimaryKeyImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPrimaryKey()
   * @generated
   */
  int PRIMARY_KEY = 27;

  /**
   * The feature id for the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__REF_TO = 0;

  /**
   * The number of structural features of the '<em>Primary Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ForeignKeyImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 28;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__REF_TO = 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__MULTIPLICITY = 2;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefAttributeImpl <em>Ref Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefAttributeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefAttribute()
   * @generated
   */
  int REF_ATTRIBUTE = 29;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ATTRIBUTE__REF_ATTR = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ATTRIBUTE__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.CheckImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__NAME = 0;

  /**
   * The feature id for the '<em><b>Check Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHECK_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ActorImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__TYPE = 3;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__STAKEHOLDER = 4;

  /**
   * The feature id for the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ACTOR = 5;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.UseCaseImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__TYPE = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ENTITIES = 4;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRIORITY = 5;

  /**
   * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTENSION_POINTS = 6;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__GOALS = 7;

  /**
   * The feature id for the '<em><b>Frs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__FRS = 8;

  /**
   * The feature id for the '<em><b>Actor Initiates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTOR_INITIATES = 9;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTORS = 10;

  /**
   * The feature id for the '<em><b>Pre Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRE_CONDITIONS = 11;

  /**
   * The feature id for the '<em><b>Post Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__POST_CONDITIONS = 12;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__INCLUDES = 13;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTENDS = 14;

  /**
   * The feature id for the '<em><b>Ext Point</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXT_POINT = 15;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__SCENARIOS = 16;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefEntityImpl <em>Ref Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefEntityImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefEntity()
   * @generated
   */
  int REF_ENTITY = 33;

  /**
   * The feature id for the '<em><b>Ref Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY__REF_ENTITY = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY__REFS = 2;

  /**
   * The feature id for the '<em><b>Ref Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY__REF_TYPE = 3;

  /**
   * The number of structural features of the '<em>Ref Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.EntityTypeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 34;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefFRImpl <em>Ref FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefFR()
   * @generated
   */
  int REF_FR = 35;

  /**
   * The feature id for the '<em><b>Ref FR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FR__REF_FR = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FR__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefActorImpl <em>Ref Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefActorImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefActor()
   * @generated
   */
  int REF_ACTOR = 36;

  /**
   * The feature id for the '<em><b>Ref Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ACTOR__REF_ACTOR = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ACTOR__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ACTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefUCImpl <em>Ref UC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefUCImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefUC()
   * @generated
   */
  int REF_UC = 37;

  /**
   * The feature id for the '<em><b>Ref UC</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC__REF_UC = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref UC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ExtensionPointImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getExtensionPoint()
   * @generated
   */
  int EXTENSION_POINT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_POINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_POINT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Extension Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ScenarioImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TYPE = 3;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__MODE = 4;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = 5;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.StepImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStep()
   * @generated
   */
  int STEP = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TYPE = 3;

  /**
   * The feature id for the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__ACTOR = 4;

  /**
   * The feature id for the '<em><b>Pre Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__PRE_CONDITIONS = 5;

  /**
   * The feature id for the '<em><b>Post Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__POST_CONDITIONS = 6;

  /**
   * The feature id for the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NEXT = 7;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RequirementImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TYPE = 3;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER = 4;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PRIORITY = 5;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PROGRESS = 6;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.FRImpl <em>FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.FRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getFR()
   * @generated
   */
  int FR = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__TYPE = REQUIREMENT__TYPE;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PART_OF = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.QRImpl <em>QR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.QRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getQR()
   * @generated
   */
  int QR = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__TYPE = REQUIREMENT__TYPE;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__SUB_TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__METRIC = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__VALUE = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PART_OF = REQUIREMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>QR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ConstraintImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = REQUIREMENT__TYPE;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PART_OF = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RequirementRelationImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRequirementRelation()
   * @generated
   */
  int REQUIREMENT_RELATION = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__TYPE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__DESCRIPTION = 4;

  /**
   * The number of structural features of the '<em>Requirement Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see rslingo.rslil.rSLIL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PackageProject <em>Package Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Project</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject
   * @generated
   */
  EClass getPackageProject();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getImports()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_Imports();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.PackageProject#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getProject()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_Project();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getPackageGlossary <em>Package Glossary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Glossary</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getPackageGlossary()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageGlossary();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getPackageStakeholders <em>Package Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Stakeholders</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getPackageStakeholders()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageStakeholders();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getPackageGoals <em>Package Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Goals</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getPackageGoals()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageGoals();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getGoalRelations <em>Goal Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goal Relations</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getGoalRelations()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_GoalRelations();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getPackageSystems <em>Package Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Systems</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getPackageSystems()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageSystems();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageProject#getSystemRelations <em>System Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Relations</em>'.
   * @see rslingo.rslil.rSLIL.PackageProject#getSystemRelations()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_SystemRelations();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PackageSystem <em>Package System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package System</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem
   * @generated
   */
  EClass getPackageSystem();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getImports()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Imports();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.PackageSystem#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getSystem()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_System();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getEntities()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getActors()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Actors();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getUseCases <em>Use Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Use Cases</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getUseCases()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_UseCases();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getFrs <em>Frs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Frs</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getFrs()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Frs();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getQrs <em>Qrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qrs</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getQrs()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Qrs();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getConstraints()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageSystem#getRequirementRelations <em>Requirement Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirement Relations</em>'.
   * @see rslingo.rslil.rSLIL.PackageSystem#getRequirementRelations()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_RequirementRelations();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PackageGlossary <em>Package Glossary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Glossary</em>'.
   * @see rslingo.rslil.rSLIL.PackageGlossary
   * @generated
   */
  EClass getPackageGlossary();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageGlossary#getGlossaryTerms <em>Glossary Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Glossary Terms</em>'.
   * @see rslingo.rslil.rSLIL.PackageGlossary#getGlossaryTerms()
   * @see #getPackageGlossary()
   * @generated
   */
  EReference getPackageGlossary_GlossaryTerms();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PackageStakeholder <em>Package Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.PackageStakeholder
   * @generated
   */
  EClass getPackageStakeholder();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageStakeholder#getStakeholders <em>Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
   * @see rslingo.rslil.rSLIL.PackageStakeholder#getStakeholders()
   * @see #getPackageStakeholder()
   * @generated
   */
  EReference getPackageStakeholder_Stakeholders();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PackageGoal <em>Package Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Goal</em>'.
   * @see rslingo.rslil.rSLIL.PackageGoal
   * @generated
   */
  EClass getPackageGoal();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageGoal#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see rslingo.rslil.rSLIL.PackageGoal#getGoals()
   * @see #getPackageGoal()
   * @generated
   */
  EReference getPackageGoal_Goals();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.PackageGoal#getGoalRelations <em>Goal Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goal Relations</em>'.
   * @see rslingo.rslil.rSLIL.PackageGoal#getGoalRelations()
   * @see #getPackageGoal()
   * @generated
   */
  EReference getPackageGoal_GoalRelations();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see rslingo.rslil.rSLIL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see rslingo.rslil.rSLIL.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see rslingo.rslil.rSLIL.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Project#getNameAlias()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Project#getType()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain</em>'.
   * @see rslingo.rslil.rSLIL.Project#getDomain()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Domain();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Project#getPlanned <em>Planned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Planned</em>'.
   * @see rslingo.rslil.rSLIL.Project#getPlanned()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Planned();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Project#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see rslingo.rslil.rSLIL.Project#getActual()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Actual();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Project#getOrganizations <em>Organizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Organizations</em>'.
   * @see rslingo.rslil.rSLIL.Project#getOrganizations()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Organizations();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Project#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Progress</em>'.
   * @see rslingo.rslil.rSLIL.Project#getProgress()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Progress();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see rslingo.rslil.rSLIL.Project#getSummary()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Summary();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Project#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Project#getDescription()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PlannedSchedule <em>Planned Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planned Schedule</em>'.
   * @see rslingo.rslil.rSLIL.PlannedSchedule
   * @generated
   */
  EClass getPlannedSchedule();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.PlannedSchedule#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see rslingo.rslil.rSLIL.PlannedSchedule#getStart()
   * @see #getPlannedSchedule()
   * @generated
   */
  EReference getPlannedSchedule_Start();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.PlannedSchedule#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see rslingo.rslil.rSLIL.PlannedSchedule#getEnd()
   * @see #getPlannedSchedule()
   * @generated
   */
  EReference getPlannedSchedule_End();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.ActualSchedule <em>Actual Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Schedule</em>'.
   * @see rslingo.rslil.rSLIL.ActualSchedule
   * @generated
   */
  EClass getActualSchedule();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.ActualSchedule#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see rslingo.rslil.rSLIL.ActualSchedule#getStart()
   * @see #getActualSchedule()
   * @generated
   */
  EReference getActualSchedule_Start();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.ActualSchedule#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see rslingo.rslil.rSLIL.ActualSchedule#getEnd()
   * @see #getActualSchedule()
   * @generated
   */
  EReference getActualSchedule_End();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see rslingo.rslil.rSLIL.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Date#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see rslingo.rslil.rSLIL.Date#getDay()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Day();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Date#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Month</em>'.
   * @see rslingo.rslil.rSLIL.Date#getMonth()
   * @see #getDate()
   * @generated
   */
  EReference getDate_Month();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Date#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see rslingo.rslil.rSLIL.Date#getYear()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Year();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Month <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Month</em>'.
   * @see rslingo.rslil.rSLIL.Month
   * @generated
   */
  EClass getMonth();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Month#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Month#getName()
   * @see #getMonth()
   * @generated
   */
  EAttribute getMonth_Name();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Organizations <em>Organizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organizations</em>'.
   * @see rslingo.rslil.rSLIL.Organizations
   * @generated
   */
  EClass getOrganizations();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Organizations#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer</em>'.
   * @see rslingo.rslil.rSLIL.Organizations#getCustomer()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Customer();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Organizations#getSupplier <em>Supplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supplier</em>'.
   * @see rslingo.rslil.rSLIL.Organizations#getSupplier()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Supplier();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Organizations#getPartners <em>Partners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partners</em>'.
   * @see rslingo.rslil.rSLIL.Organizations#getPartners()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Partners();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.ProjectProgress <em>Project Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Progress</em>'.
   * @see rslingo.rslil.rSLIL.ProjectProgress
   * @generated
   */
  EClass getProjectProgress();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.ProjectProgress#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rslil.rSLIL.ProjectProgress#getValue()
   * @see #getProjectProgress()
   * @generated
   */
  EAttribute getProjectProgress_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see rslingo.rslil.rSLIL.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.System#getNameAlias()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.System#getDescription()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.System#getType()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see rslingo.rslil.rSLIL.System#getScope()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Scope();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.System#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.System#getPartOf()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.SystemRelation <em>System Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Relation</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation
   * @generated
   */
  EClass getSystemRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.SystemRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getName()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Name();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.SystemRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getSource()
   * @see #getSystemRelation()
   * @generated
   */
  EReference getSystemRelation_Source();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.SystemRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getTarget()
   * @see #getSystemRelation()
   * @generated
   */
  EReference getSystemRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.SystemRelation#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getCategory()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Category();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.SystemRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getType()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.SystemRelation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.SystemRelation#getDescription()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.GlossaryTerm <em>Glossary Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Glossary Term</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm
   * @generated
   */
  EClass getGlossaryTerm();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getName()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getNameAlias()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getDescription()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Description();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.GlossaryTerm#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getType()
   * @see #getGlossaryTerm()
   * @generated
   */
  EReference getGlossaryTerm_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getAcronym <em>Acronym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acronym</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getAcronym()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Acronym();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pos</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getPos()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Pos();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getSynonym <em>Synonym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synonym</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getSynonym()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Synonym();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getHypernym <em>Hypernym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hypernym</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getHypernym()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Hypernym();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefTermType <em>Ref Term Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Term Type</em>'.
   * @see rslingo.rslil.rSLIL.RefTermType
   * @generated
   */
  EClass getRefTermType();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.RefTermType#getRefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Type</em>'.
   * @see rslingo.rslil.rSLIL.RefTermType#getRefType()
   * @see #getRefTermType()
   * @generated
   */
  EReference getRefTermType_RefType();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.RefTermType#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefTermType#getRefs()
   * @see #getRefTermType()
   * @generated
   */
  EReference getRefTermType_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.TermType <em>Term Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Type</em>'.
   * @see rslingo.rslil.rSLIL.TermType
   * @generated
   */
  EClass getTermType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.TermType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.TermType#getType()
   * @see #getTermType()
   * @generated
   */
  EAttribute getTermType_Type();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getName()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getNameAlias()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getDescription()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getType()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getCategory()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Category();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Stakeholder#getIsA <em>Is A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Is A</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getIsA()
   * @see #getStakeholder()
   * @generated
   */
  EReference getStakeholder_IsA();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Stakeholder#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getPartOf()
   * @see #getStakeholder()
   * @generated
   */
  EReference getStakeholder_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see rslingo.rslil.rSLIL.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getNameAlias()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getDescription()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Description();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Goal#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getStakeholder()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Stakeholder();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Goal#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getPriority()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Priority();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Goal#getPartOfAnd <em>Part Of And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of And</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getPartOfAnd()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_PartOfAnd();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Goal#getPartOfOr <em>Part Of Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of Or</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getPartOfOr()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_PartOfOr();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Goal#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Progress</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getProgress()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Progress();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.GoalRelation <em>Goal Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Relation</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation
   * @generated
   */
  EClass getGoalRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GoalRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation#getName()
   * @see #getGoalRelation()
   * @generated
   */
  EAttribute getGoalRelation_Name();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.GoalRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation#getSource()
   * @see #getGoalRelation()
   * @generated
   */
  EReference getGoalRelation_Source();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.GoalRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation#getTarget()
   * @see #getGoalRelation()
   * @generated
   */
  EReference getGoalRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GoalRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation#getType()
   * @see #getGoalRelation()
   * @generated
   */
  EAttribute getGoalRelation_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GoalRelation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.GoalRelation#getDescription()
   * @see #getGoalRelation()
   * @generated
   */
  EAttribute getGoalRelation_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Priority#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rslil.rSLIL.Priority#getValue()
   * @see #getPriority()
   * @generated
   */
  EAttribute getPriority_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefGoal <em>Ref Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Goal</em>'.
   * @see rslingo.rslil.rSLIL.RefGoal
   * @generated
   */
  EClass getRefGoal();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefGoal#getRefGoal <em>Ref Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Goal</em>'.
   * @see rslingo.rslil.rSLIL.RefGoal#getRefGoal()
   * @see #getRefGoal()
   * @generated
   */
  EReference getRefGoal_RefGoal();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefGoal#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefGoal#getRefs()
   * @see #getRefGoal()
   * @generated
   */
  EReference getRefGoal_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see rslingo.rslil.rSLIL.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Entity#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getNameAlias()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Entity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getDescription()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Entity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Type();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Entity#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getPrimaryKey()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Entity#getForeignKeys <em>Foreign Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getForeignKeys()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ForeignKeys();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Entity#getChecks <em>Checks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Checks</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getChecks()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Checks();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see rslingo.rslil.rSLIL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getNameAlias()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getDescription()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getSize()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Size();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Attribute#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getDefaultValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getNotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Null</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getNotNull()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_NotNull();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getUnique()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Unique();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see rslingo.rslil.rSLIL.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Multiplicity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rslil.rSLIL.Multiplicity#getValue()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key</em>'.
   * @see rslingo.rslil.rSLIL.PrimaryKey
   * @generated
   */
  EClass getPrimaryKey();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.PrimaryKey#getRefTo <em>Ref To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref To</em>'.
   * @see rslingo.rslil.rSLIL.PrimaryKey#getRefTo()
   * @see #getPrimaryKey()
   * @generated
   */
  EReference getPrimaryKey_RefTo();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see rslingo.rslil.rSLIL.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.ForeignKey#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see rslingo.rslil.rSLIL.ForeignKey#getEntity()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Entity();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.ForeignKey#getRefTo <em>Ref To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref To</em>'.
   * @see rslingo.rslil.rSLIL.ForeignKey#getRefTo()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_RefTo();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.ForeignKey#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see rslingo.rslil.rSLIL.ForeignKey#getMultiplicity()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Multiplicity();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefAttribute <em>Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Attribute</em>'.
   * @see rslingo.rslil.rSLIL.RefAttribute
   * @generated
   */
  EClass getRefAttribute();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefAttribute#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attr</em>'.
   * @see rslingo.rslil.rSLIL.RefAttribute#getRefAttr()
   * @see #getRefAttribute()
   * @generated
   */
  EReference getRefAttribute_RefAttr();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefAttribute#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefAttribute#getRefs()
   * @see #getRefAttribute()
   * @generated
   */
  EReference getRefAttribute_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see rslingo.rslil.rSLIL.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Check#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Check#getName()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Check#getCheckExpression <em>Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Expression</em>'.
   * @see rslingo.rslil.rSLIL.Check#getCheckExpression()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_CheckExpression();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see rslingo.rslil.rSLIL.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getNameAlias()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getDescription()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getType()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Actor#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getStakeholder()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Stakeholder();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Actor#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getActor()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Actor();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Case</em>'.
   * @see rslingo.rslil.rSLIL.UseCase
   * @generated
   */
  EClass getUseCase();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getName()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getNameAlias()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getDescription()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getType()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.UseCase#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entities</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getEntities()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Entities();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.UseCase#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getPriority()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getExtensionPoints <em>Extension Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extension Points</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getExtensionPoints()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ExtensionPoints();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getGoals()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Goals();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getFrs <em>Frs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Frs</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getFrs()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Frs();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.UseCase#getActorInitiates <em>Actor Initiates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor Initiates</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getActorInitiates()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ActorInitiates();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.UseCase#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actors</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getActors()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Actors();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getPreConditions <em>Pre Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre Conditions</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getPreConditions()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_PreConditions();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getPostConditions <em>Post Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Post Conditions</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getPostConditions()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_PostConditions();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getIncludes()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Includes();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.UseCase#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getExtends()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Extends();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.UseCase#getExtPoint <em>Ext Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ext Point</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getExtPoint()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ExtPoint();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getScenarios()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Scenarios();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Entity</em>'.
   * @see rslingo.rslil.rSLIL.RefEntity
   * @generated
   */
  EClass getRefEntity();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefEntity#getRefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Entity</em>'.
   * @see rslingo.rslil.rSLIL.RefEntity#getRefEntity()
   * @see #getRefEntity()
   * @generated
   */
  EReference getRefEntity_RefEntity();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.RefEntity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.RefEntity#getType()
   * @see #getRefEntity()
   * @generated
   */
  EReference getRefEntity_Type();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefEntity#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefEntity#getRefs()
   * @see #getRefEntity()
   * @generated
   */
  EReference getRefEntity_Refs();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.RefEntity#getRefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Type</em>'.
   * @see rslingo.rslil.rSLIL.RefEntity#getRefType()
   * @see #getRefEntity()
   * @generated
   */
  EReference getRefEntity_RefType();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see rslingo.rslil.rSLIL.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.EntityType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.EntityType#getType()
   * @see #getEntityType()
   * @generated
   */
  EAttribute getEntityType_Type();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefFR <em>Ref FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref FR</em>'.
   * @see rslingo.rslil.rSLIL.RefFR
   * @generated
   */
  EClass getRefFR();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefFR#getRefFR <em>Ref FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref FR</em>'.
   * @see rslingo.rslil.rSLIL.RefFR#getRefFR()
   * @see #getRefFR()
   * @generated
   */
  EReference getRefFR_RefFR();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefFR#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefFR#getRefs()
   * @see #getRefFR()
   * @generated
   */
  EReference getRefFR_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefActor <em>Ref Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Actor</em>'.
   * @see rslingo.rslil.rSLIL.RefActor
   * @generated
   */
  EClass getRefActor();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefActor#getRefActor <em>Ref Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Actor</em>'.
   * @see rslingo.rslil.rSLIL.RefActor#getRefActor()
   * @see #getRefActor()
   * @generated
   */
  EReference getRefActor_RefActor();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefActor#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefActor#getRefs()
   * @see #getRefActor()
   * @generated
   */
  EReference getRefActor_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefUC <em>Ref UC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref UC</em>'.
   * @see rslingo.rslil.rSLIL.RefUC
   * @generated
   */
  EClass getRefUC();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefUC#getRefUC <em>Ref UC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref UC</em>'.
   * @see rslingo.rslil.rSLIL.RefUC#getRefUC()
   * @see #getRefUC()
   * @generated
   */
  EReference getRefUC_RefUC();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefUC#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefUC#getRefs()
   * @see #getRefUC()
   * @generated
   */
  EReference getRefUC_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.ExtensionPoint <em>Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Point</em>'.
   * @see rslingo.rslil.rSLIL.ExtensionPoint
   * @generated
   */
  EClass getExtensionPoint();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.ExtensionPoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.ExtensionPoint#getName()
   * @see #getExtensionPoint()
   * @generated
   */
  EAttribute getExtensionPoint_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.ExtensionPoint#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.ExtensionPoint#getDescription()
   * @see #getExtensionPoint()
   * @generated
   */
  EAttribute getExtensionPoint_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see rslingo.rslil.rSLIL.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Scenario#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getNameAlias()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Scenario#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getDescription()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Scenario#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getType()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Scenario#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getMode()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Mode();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Scenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see rslingo.rslil.rSLIL.Scenario#getSteps()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Steps();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see rslingo.rslil.rSLIL.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Step#getNameAlias()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Step#getDescription()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Step#getType()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Step#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor</em>'.
   * @see rslingo.rslil.rSLIL.Step#getActor()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Actor();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getPreConditions <em>Pre Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre Conditions</em>'.
   * @see rslingo.rslil.rSLIL.Step#getPreConditions()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_PreConditions();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Step#getPostConditions <em>Post Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Post Conditions</em>'.
   * @see rslingo.rslil.rSLIL.Step#getPostConditions()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_PostConditions();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Step#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next</em>'.
   * @see rslingo.rslil.rSLIL.Step#getNext()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Next();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.FR <em>FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FR</em>'.
   * @see rslingo.rslil.rSLIL.FR
   * @generated
   */
  EClass getFR();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.FR#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.FR#getPartOf()
   * @see #getFR()
   * @generated
   */
  EReference getFR_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.QR <em>QR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QR</em>'.
   * @see rslingo.rslil.rSLIL.QR
   * @generated
   */
  EClass getQR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.QR#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Type</em>'.
   * @see rslingo.rslil.rSLIL.QR#getSubType()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_SubType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.QR#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see rslingo.rslil.rSLIL.QR#getMetric()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_Metric();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.QR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rslil.rSLIL.QR#getValue()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_Value();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.QR#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.QR#getPartOf()
   * @see #getQR()
   * @generated
   */
  EReference getQR_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see rslingo.rslil.rSLIL.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Constraint#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.Constraint#getPartOf()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see rslingo.rslil.rSLIL.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Requirement#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getNameAlias()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Requirement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getType()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Requirement#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getStakeholder()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Stakeholder();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Requirement#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getPriority()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Priority();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Requirement#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Progress</em>'.
   * @see rslingo.rslil.rSLIL.Requirement#getProgress()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Progress();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RequirementRelation <em>Requirement Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Relation</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation
   * @generated
   */
  EClass getRequirementRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.RequirementRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation#getName()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Name();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RequirementRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation#getSource()
   * @see #getRequirementRelation()
   * @generated
   */
  EReference getRequirementRelation_Source();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RequirementRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation#getTarget()
   * @see #getRequirementRelation()
   * @generated
   */
  EReference getRequirementRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.RequirementRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation#getType()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.RequirementRelation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.RequirementRelation#getDescription()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Description();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RSLILFactory getRSLILFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ModelImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PackageProjectImpl <em>Package Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PackageProjectImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageProject()
     * @generated
     */
    EClass PACKAGE_PROJECT = eINSTANCE.getPackageProject();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__IMPORTS = eINSTANCE.getPackageProject_Imports();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PROJECT = eINSTANCE.getPackageProject_Project();

    /**
     * The meta object literal for the '<em><b>Package Glossary</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_GLOSSARY = eINSTANCE.getPackageProject_PackageGlossary();

    /**
     * The meta object literal for the '<em><b>Package Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS = eINSTANCE.getPackageProject_PackageStakeholders();

    /**
     * The meta object literal for the '<em><b>Package Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_GOALS = eINSTANCE.getPackageProject_PackageGoals();

    /**
     * The meta object literal for the '<em><b>Goal Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__GOAL_RELATIONS = eINSTANCE.getPackageProject_GoalRelations();

    /**
     * The meta object literal for the '<em><b>Package Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_SYSTEMS = eINSTANCE.getPackageProject_PackageSystems();

    /**
     * The meta object literal for the '<em><b>System Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__SYSTEM_RELATIONS = eINSTANCE.getPackageProject_SystemRelations();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PackageSystemImpl <em>Package System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PackageSystemImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageSystem()
     * @generated
     */
    EClass PACKAGE_SYSTEM = eINSTANCE.getPackageSystem();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__IMPORTS = eINSTANCE.getPackageSystem_Imports();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__SYSTEM = eINSTANCE.getPackageSystem_System();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__ENTITIES = eINSTANCE.getPackageSystem_Entities();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__ACTORS = eINSTANCE.getPackageSystem_Actors();

    /**
     * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__USE_CASES = eINSTANCE.getPackageSystem_UseCases();

    /**
     * The meta object literal for the '<em><b>Frs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__FRS = eINSTANCE.getPackageSystem_Frs();

    /**
     * The meta object literal for the '<em><b>Qrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__QRS = eINSTANCE.getPackageSystem_Qrs();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__CONSTRAINTS = eINSTANCE.getPackageSystem_Constraints();

    /**
     * The meta object literal for the '<em><b>Requirement Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__REQUIREMENT_RELATIONS = eINSTANCE.getPackageSystem_RequirementRelations();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PackageGlossaryImpl <em>Package Glossary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PackageGlossaryImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageGlossary()
     * @generated
     */
    EClass PACKAGE_GLOSSARY = eINSTANCE.getPackageGlossary();

    /**
     * The meta object literal for the '<em><b>Glossary Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_GLOSSARY__GLOSSARY_TERMS = eINSTANCE.getPackageGlossary_GlossaryTerms();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PackageStakeholderImpl <em>Package Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PackageStakeholderImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageStakeholder()
     * @generated
     */
    EClass PACKAGE_STAKEHOLDER = eINSTANCE.getPackageStakeholder();

    /**
     * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_STAKEHOLDER__STAKEHOLDERS = eINSTANCE.getPackageStakeholder_Stakeholders();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PackageGoalImpl <em>Package Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PackageGoalImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPackageGoal()
     * @generated
     */
    EClass PACKAGE_GOAL = eINSTANCE.getPackageGoal();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_GOAL__GOALS = eINSTANCE.getPackageGoal_Goals();

    /**
     * The meta object literal for the '<em><b>Goal Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_GOAL__GOAL_RELATIONS = eINSTANCE.getPackageGoal_GoalRelations();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ImportImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ProjectImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME_ALIAS = eINSTANCE.getProject_NameAlias();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__TYPE = eINSTANCE.getProject_Type();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DOMAIN = eINSTANCE.getProject_Domain();

    /**
     * The meta object literal for the '<em><b>Planned</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PLANNED = eINSTANCE.getProject_Planned();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ACTUAL = eINSTANCE.getProject_Actual();

    /**
     * The meta object literal for the '<em><b>Organizations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ORGANIZATIONS = eINSTANCE.getProject_Organizations();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PROGRESS = eINSTANCE.getProject_Progress();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__SUMMARY = eINSTANCE.getProject_Summary();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PlannedScheduleImpl <em>Planned Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PlannedScheduleImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPlannedSchedule()
     * @generated
     */
    EClass PLANNED_SCHEDULE = eINSTANCE.getPlannedSchedule();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANNED_SCHEDULE__START = eINSTANCE.getPlannedSchedule_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANNED_SCHEDULE__END = eINSTANCE.getPlannedSchedule_End();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ActualScheduleImpl <em>Actual Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ActualScheduleImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getActualSchedule()
     * @generated
     */
    EClass ACTUAL_SCHEDULE = eINSTANCE.getActualSchedule();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_SCHEDULE__START = eINSTANCE.getActualSchedule_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_SCHEDULE__END = eINSTANCE.getActualSchedule_End();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.DateImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DAY = eINSTANCE.getDate_Day();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE__MONTH = eINSTANCE.getDate_Month();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.MonthImpl <em>Month</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.MonthImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getMonth()
     * @generated
     */
    EClass MONTH = eINSTANCE.getMonth();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONTH__NAME = eINSTANCE.getMonth_Name();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.OrganizationsImpl <em>Organizations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.OrganizationsImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getOrganizations()
     * @generated
     */
    EClass ORGANIZATIONS = eINSTANCE.getOrganizations();

    /**
     * The meta object literal for the '<em><b>Customer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__CUSTOMER = eINSTANCE.getOrganizations_Customer();

    /**
     * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__SUPPLIER = eINSTANCE.getOrganizations_Supplier();

    /**
     * The meta object literal for the '<em><b>Partners</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__PARTNERS = eINSTANCE.getOrganizations_Partners();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ProjectProgressImpl <em>Project Progress</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ProjectProgressImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getProjectProgress()
     * @generated
     */
    EClass PROJECT_PROGRESS = eINSTANCE.getProjectProgress();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_PROGRESS__VALUE = eINSTANCE.getProjectProgress_Value();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.SystemImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME_ALIAS = eINSTANCE.getSystem_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__TYPE = eINSTANCE.getSystem_Type();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__SCOPE = eINSTANCE.getSystem_Scope();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__PART_OF = eINSTANCE.getSystem_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.SystemRelationImpl <em>System Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.SystemRelationImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystemRelation()
     * @generated
     */
    EClass SYSTEM_RELATION = eINSTANCE.getSystemRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__NAME = eINSTANCE.getSystemRelation_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_RELATION__SOURCE = eINSTANCE.getSystemRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_RELATION__TARGET = eINSTANCE.getSystemRelation_Target();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__CATEGORY = eINSTANCE.getSystemRelation_Category();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__TYPE = eINSTANCE.getSystemRelation_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__DESCRIPTION = eINSTANCE.getSystemRelation_Description();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.GlossaryTermImpl <em>Glossary Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.GlossaryTermImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGlossaryTerm()
     * @generated
     */
    EClass GLOSSARY_TERM = eINSTANCE.getGlossaryTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__NAME = eINSTANCE.getGlossaryTerm_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__NAME_ALIAS = eINSTANCE.getGlossaryTerm_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__DESCRIPTION = eINSTANCE.getGlossaryTerm_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOSSARY_TERM__TYPE = eINSTANCE.getGlossaryTerm_Type();

    /**
     * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__ACRONYM = eINSTANCE.getGlossaryTerm_Acronym();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__POS = eINSTANCE.getGlossaryTerm_Pos();

    /**
     * The meta object literal for the '<em><b>Synonym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__SYNONYM = eINSTANCE.getGlossaryTerm_Synonym();

    /**
     * The meta object literal for the '<em><b>Hypernym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__HYPERNYM = eINSTANCE.getGlossaryTerm_Hypernym();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefTermTypeImpl <em>Ref Term Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefTermTypeImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefTermType()
     * @generated
     */
    EClass REF_TERM_TYPE = eINSTANCE.getRefTermType();

    /**
     * The meta object literal for the '<em><b>Ref Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TERM_TYPE__REF_TYPE = eINSTANCE.getRefTermType_RefType();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TERM_TYPE__REFS = eINSTANCE.getRefTermType_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.TermTypeImpl <em>Term Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.TermTypeImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getTermType()
     * @generated
     */
    EClass TERM_TYPE = eINSTANCE.getTermType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_TYPE__TYPE = eINSTANCE.getTermType_Type();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.StakeholderImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME_ALIAS = eINSTANCE.getStakeholder_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DESCRIPTION = eINSTANCE.getStakeholder_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__TYPE = eINSTANCE.getStakeholder_Type();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__CATEGORY = eINSTANCE.getStakeholder_Category();

    /**
     * The meta object literal for the '<em><b>Is A</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER__IS_A = eINSTANCE.getStakeholder_IsA();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER__PART_OF = eINSTANCE.getStakeholder_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.GoalImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME_ALIAS = eINSTANCE.getGoal_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__STAKEHOLDER = eINSTANCE.getGoal_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

    /**
     * The meta object literal for the '<em><b>Part Of And</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PART_OF_AND = eINSTANCE.getGoal_PartOfAnd();

    /**
     * The meta object literal for the '<em><b>Part Of Or</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PART_OF_OR = eINSTANCE.getGoal_PartOfOr();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PROGRESS = eINSTANCE.getGoal_Progress();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.GoalRelationImpl <em>Goal Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.GoalRelationImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGoalRelation()
     * @generated
     */
    EClass GOAL_RELATION = eINSTANCE.getGoalRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_RELATION__NAME = eINSTANCE.getGoalRelation_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_RELATION__SOURCE = eINSTANCE.getGoalRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_RELATION__TARGET = eINSTANCE.getGoalRelation_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_RELATION__TYPE = eINSTANCE.getGoalRelation_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_RELATION__DESCRIPTION = eINSTANCE.getGoalRelation_Description();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PriorityImpl <em>Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PriorityImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPriority()
     * @generated
     */
    EClass PRIORITY = eINSTANCE.getPriority();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIORITY__VALUE = eINSTANCE.getPriority_Value();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefGoalImpl <em>Ref Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefGoalImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefGoal()
     * @generated
     */
    EClass REF_GOAL = eINSTANCE.getRefGoal();

    /**
     * The meta object literal for the '<em><b>Ref Goal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_GOAL__REF_GOAL = eINSTANCE.getRefGoal_RefGoal();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_GOAL__REFS = eINSTANCE.getRefGoal_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.EntityImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME_ALIAS = eINSTANCE.getEntity_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PRIMARY_KEY = eINSTANCE.getEntity_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FOREIGN_KEYS = eINSTANCE.getEntity_ForeignKeys();

    /**
     * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__CHECKS = eINSTANCE.getEntity_Checks();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.AttributeImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME_ALIAS = eINSTANCE.getAttribute_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__SIZE = eINSTANCE.getAttribute_Size();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NOT_NULL = eINSTANCE.getAttribute_NotNull();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UNIQUE = eINSTANCE.getAttribute_Unique();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.MultiplicityImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__VALUE = eINSTANCE.getMultiplicity_Value();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.PrimaryKeyImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getPrimaryKey()
     * @generated
     */
    EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

    /**
     * The meta object literal for the '<em><b>Ref To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_KEY__REF_TO = eINSTANCE.getPrimaryKey_RefTo();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ForeignKeyImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__ENTITY = eINSTANCE.getForeignKey_Entity();

    /**
     * The meta object literal for the '<em><b>Ref To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__REF_TO = eINSTANCE.getForeignKey_RefTo();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__MULTIPLICITY = eINSTANCE.getForeignKey_Multiplicity();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefAttributeImpl <em>Ref Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefAttributeImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefAttribute()
     * @generated
     */
    EClass REF_ATTRIBUTE = eINSTANCE.getRefAttribute();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ATTRIBUTE__REF_ATTR = eINSTANCE.getRefAttribute_RefAttr();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ATTRIBUTE__REFS = eINSTANCE.getRefAttribute_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.CheckImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__NAME = eINSTANCE.getCheck_Name();

    /**
     * The meta object literal for the '<em><b>Check Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__CHECK_EXPRESSION = eINSTANCE.getCheck_CheckExpression();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ActorImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME_ALIAS = eINSTANCE.getActor_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__STAKEHOLDER = eINSTANCE.getActor_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__ACTOR = eINSTANCE.getActor_Actor();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.UseCaseImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getUseCase()
     * @generated
     */
    EClass USE_CASE = eINSTANCE.getUseCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__NAME_ALIAS = eINSTANCE.getUseCase_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__TYPE = eINSTANCE.getUseCase_Type();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ENTITIES = eINSTANCE.getUseCase_Entities();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__PRIORITY = eINSTANCE.getUseCase_Priority();

    /**
     * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTENSION_POINTS = eINSTANCE.getUseCase_ExtensionPoints();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__GOALS = eINSTANCE.getUseCase_Goals();

    /**
     * The meta object literal for the '<em><b>Frs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__FRS = eINSTANCE.getUseCase_Frs();

    /**
     * The meta object literal for the '<em><b>Actor Initiates</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTOR_INITIATES = eINSTANCE.getUseCase_ActorInitiates();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTORS = eINSTANCE.getUseCase_Actors();

    /**
     * The meta object literal for the '<em><b>Pre Conditions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__PRE_CONDITIONS = eINSTANCE.getUseCase_PreConditions();

    /**
     * The meta object literal for the '<em><b>Post Conditions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__POST_CONDITIONS = eINSTANCE.getUseCase_PostConditions();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__INCLUDES = eINSTANCE.getUseCase_Includes();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTENDS = eINSTANCE.getUseCase_Extends();

    /**
     * The meta object literal for the '<em><b>Ext Point</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXT_POINT = eINSTANCE.getUseCase_ExtPoint();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__SCENARIOS = eINSTANCE.getUseCase_Scenarios();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefEntityImpl <em>Ref Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefEntityImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefEntity()
     * @generated
     */
    EClass REF_ENTITY = eINSTANCE.getRefEntity();

    /**
     * The meta object literal for the '<em><b>Ref Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENTITY__REF_ENTITY = eINSTANCE.getRefEntity_RefEntity();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENTITY__TYPE = eINSTANCE.getRefEntity_Type();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENTITY__REFS = eINSTANCE.getRefEntity_Refs();

    /**
     * The meta object literal for the '<em><b>Ref Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENTITY__REF_TYPE = eINSTANCE.getRefEntity_RefType();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.EntityTypeImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_TYPE__TYPE = eINSTANCE.getEntityType_Type();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefFRImpl <em>Ref FR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefFRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefFR()
     * @generated
     */
    EClass REF_FR = eINSTANCE.getRefFR();

    /**
     * The meta object literal for the '<em><b>Ref FR</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_FR__REF_FR = eINSTANCE.getRefFR_RefFR();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_FR__REFS = eINSTANCE.getRefFR_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefActorImpl <em>Ref Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefActorImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefActor()
     * @generated
     */
    EClass REF_ACTOR = eINSTANCE.getRefActor();

    /**
     * The meta object literal for the '<em><b>Ref Actor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ACTOR__REF_ACTOR = eINSTANCE.getRefActor_RefActor();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ACTOR__REFS = eINSTANCE.getRefActor_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefUCImpl <em>Ref UC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefUCImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefUC()
     * @generated
     */
    EClass REF_UC = eINSTANCE.getRefUC();

    /**
     * The meta object literal for the '<em><b>Ref UC</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_UC__REF_UC = eINSTANCE.getRefUC_RefUC();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_UC__REFS = eINSTANCE.getRefUC_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ExtensionPointImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getExtensionPoint()
     * @generated
     */
    EClass EXTENSION_POINT = eINSTANCE.getExtensionPoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION_POINT__NAME = eINSTANCE.getExtensionPoint_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION_POINT__DESCRIPTION = eINSTANCE.getExtensionPoint_Description();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ScenarioImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME_ALIAS = eINSTANCE.getScenario_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__DESCRIPTION = eINSTANCE.getScenario_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__TYPE = eINSTANCE.getScenario_Type();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__MODE = eINSTANCE.getScenario_Mode();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.StepImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME_ALIAS = eINSTANCE.getStep_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__ACTOR = eINSTANCE.getStep_Actor();

    /**
     * The meta object literal for the '<em><b>Pre Conditions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__PRE_CONDITIONS = eINSTANCE.getStep_PreConditions();

    /**
     * The meta object literal for the '<em><b>Post Conditions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__POST_CONDITIONS = eINSTANCE.getStep_PostConditions();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__NEXT = eINSTANCE.getStep_Next();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.FRImpl <em>FR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.FRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getFR()
     * @generated
     */
    EClass FR = eINSTANCE.getFR();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__PART_OF = eINSTANCE.getFR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.QRImpl <em>QR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.QRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getQR()
     * @generated
     */
    EClass QR = eINSTANCE.getQR();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__SUB_TYPE = eINSTANCE.getQR_SubType();

    /**
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__METRIC = eINSTANCE.getQR_Metric();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__VALUE = eINSTANCE.getQR_Value();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QR__PART_OF = eINSTANCE.getQR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ConstraintImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__PART_OF = eINSTANCE.getConstraint_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RequirementImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME_ALIAS = eINSTANCE.getRequirement_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__STAKEHOLDER = eINSTANCE.getRequirement_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PROGRESS = eINSTANCE.getRequirement_Progress();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RequirementRelationImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRequirementRelation()
     * @generated
     */
    EClass REQUIREMENT_RELATION = eINSTANCE.getRequirementRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__NAME = eINSTANCE.getRequirementRelation_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_RELATION__SOURCE = eINSTANCE.getRequirementRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_RELATION__TARGET = eINSTANCE.getRequirementRelation_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__TYPE = eINSTANCE.getRequirementRelation_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__DESCRIPTION = eINSTANCE.getRequirementRelation_Description();

  }

} //RSLILPackage
