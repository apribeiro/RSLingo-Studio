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
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = 1;

  /**
   * The feature id for the '<em><b>Glossary Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GLOSSARY_TERMS = 2;

  /**
   * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STAKEHOLDERS = 3;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GOALS = 4;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 5;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTORS = 6;

  /**
   * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USE_CASES = 7;

  /**
   * The feature id for the '<em><b>Frs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FRS = 8;

  /**
   * The feature id for the '<em><b>Nfrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NFRS = 9;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ProjectImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Ref System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__REF_SYSTEM = 3;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.SystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 2;

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
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__PART_OF = 3;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefSystemImpl <em>Ref System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefSystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefSystem()
   * @generated
   */
  int REF_SYSTEM = 3;

  /**
   * The feature id for the '<em><b>Ref System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SYSTEM__REF_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SYSTEM__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GlossaryTermImpl <em>Glossary Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GlossaryTermImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGlossaryTerm()
   * @generated
   */
  int GLOSSARY_TERM = 4;

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
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__TYPE = 2;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__ACRONYM = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__POS = 5;

  /**
   * The feature id for the '<em><b>Synset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__SYNSET = 6;

  /**
   * The feature id for the '<em><b>Term Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__TERM_RELATION = 7;

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
  int REF_TERM_TYPE = 5;

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
  int TERM_TYPE = 6;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.TermRelationImpl <em>Term Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.TermRelationImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getTermRelation()
   * @generated
   */
  int TERM_RELATION = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_RELATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_RELATION__REF_TERM = 1;

  /**
   * The number of structural features of the '<em>Term Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefTermImpl <em>Ref Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefTermImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefTerm()
   * @generated
   */
  int REF_TERM = 8;

  /**
   * The feature id for the '<em><b>Ref Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM__REF_TERM = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.StakeholderImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 9;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__TYPE = 2;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__CATEGORY = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__PART_OF = 5;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 10;

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
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = 4;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DEPENDS_ON = 5;

  /**
   * The feature id for the '<em><b>Composed By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__COMPOSED_BY = 6;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.DependsOnGoalImpl <em>Depends On Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.DependsOnGoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnGoal()
   * @generated
   */
  int DEPENDS_ON_GOAL = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_GOAL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_GOAL__REF_GOAL = 1;

  /**
   * The number of structural features of the '<em>Depends On Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_GOAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ComposedByImpl <em>Composed By</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ComposedByImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getComposedBy()
   * @generated
   */
  int COMPOSED_BY = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_BY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_BY__REF_GOAL = 1;

  /**
   * The number of structural features of the '<em>Composed By</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_BY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefGoalImpl <em>Ref Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefGoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefGoal()
   * @generated
   */
  int REF_GOAL = 13;

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
  int ENTITY = 14;

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
  int ATTRIBUTE = 15;

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
  int MULTIPLICITY = 16;

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
  int PRIMARY_KEY = 17;

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
  int FOREIGN_KEY = 18;

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
  int REF_ATTRIBUTE = 19;

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
  int CHECK = 20;

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
  int ACTOR = 21;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__TYPE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = 3;

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
  int USE_CASE = 22;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ENTITIES = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Priotity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRIOTITY = 5;

  /**
   * The feature id for the '<em><b>Extensionn Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTENSIONN_POINTS = 6;

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
  int REF_ENTITY = 23;

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
  int ENTITY_TYPE = 24;

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
  int REF_FR = 25;

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
  int REF_ACTOR = 26;

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
  int REF_UC = 27;

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
  int EXTENSION_POINT = 28;

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
  int SCENARIO = 29;

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
  int STEP = 30;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TYPE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESCRIPTION = 3;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.FRImpl <em>FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.FRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getFR()
   * @generated
   */
  int FR = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__TYPE = 3;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__MODALITY = 4;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__STAKEHOLDER = 5;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PRIORITY = 6;

  /**
   * The feature id for the '<em><b>Depends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__DEPENDS = 7;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PART_OF = 8;

  /**
   * The number of structural features of the '<em>FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.DependsOnFRImpl <em>Depends On FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.DependsOnFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnFR()
   * @generated
   */
  int DEPENDS_ON_FR = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_FR__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Fr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_FR__REF_FR = 1;

  /**
   * The number of structural features of the '<em>Depends On FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_FR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.NFRImpl <em>NFR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.NFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getNFR()
   * @generated
   */
  int NFR = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__TYPE = 3;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__SUB_TYPE = 4;

  /**
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__METRIC = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__VALUE = 6;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__STAKEHOLDER = 7;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__PRIORITY = 8;

  /**
   * The feature id for the '<em><b>Depends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__DEPENDS = 9;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__PART_OF = 10;

  /**
   * The number of structural features of the '<em>NFR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.DependsOnNFRImpl <em>Depends On NFR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.DependsOnNFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnNFR()
   * @generated
   */
  int DEPENDS_ON_NFR = 34;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_NFR__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Fr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_NFR__REF_FR = 1;

  /**
   * The number of structural features of the '<em>Depends On NFR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_ON_NFR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefNFRImpl <em>Ref NFR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefNFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefNFR()
   * @generated
   */
  int REF_NFR = 35;

  /**
   * The feature id for the '<em><b>Ref NFR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NFR__REF_NFR = 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NFR__REFS = 1;

  /**
   * The number of structural features of the '<em>Ref NFR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NFR_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Model#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see rslingo.rslil.rSLIL.Model#getProject()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Project();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see rslingo.rslil.rSLIL.Model#getSystems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Systems();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getGlossaryTerms <em>Glossary Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Glossary Terms</em>'.
   * @see rslingo.rslil.rSLIL.Model#getGlossaryTerms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_GlossaryTerms();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getStakeholders <em>Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
   * @see rslingo.rslil.rSLIL.Model#getStakeholders()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stakeholders();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see rslingo.rslil.rSLIL.Model#getGoals()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Goals();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see rslingo.rslil.rSLIL.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see rslingo.rslil.rSLIL.Model#getActors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Actors();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getUseCases <em>Use Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Use Cases</em>'.
   * @see rslingo.rslil.rSLIL.Model#getUseCases()
   * @see #getModel()
   * @generated
   */
  EReference getModel_UseCases();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getFrs <em>Frs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Frs</em>'.
   * @see rslingo.rslil.rSLIL.Model#getFrs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Frs();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getNfrs <em>Nfrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nfrs</em>'.
   * @see rslingo.rslil.rSLIL.Model#getNfrs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Nfrs();

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
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.Project#getRefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref System</em>'.
   * @see rslingo.rslil.rSLIL.Project#getRefSystem()
   * @see #getProject()
   * @generated
   */
  EReference getProject_RefSystem();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref System</em>'.
   * @see rslingo.rslil.rSLIL.RefSystem
   * @generated
   */
  EClass getRefSystem();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefSystem#getRefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref System</em>'.
   * @see rslingo.rslil.rSLIL.RefSystem#getRefSystem()
   * @see #getRefSystem()
   * @generated
   */
  EReference getRefSystem_RefSystem();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefSystem#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefSystem#getRefs()
   * @see #getRefSystem()
   * @generated
   */
  EReference getRefSystem_Refs();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.GlossaryTerm#getSynset <em>Synset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synset</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getSynset()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Synset();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.GlossaryTerm#getTermRelation <em>Term Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term Relation</em>'.
   * @see rslingo.rslil.rSLIL.GlossaryTerm#getTermRelation()
   * @see #getGlossaryTerm()
   * @generated
   */
  EReference getGlossaryTerm_TermRelation();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.TermRelation <em>Term Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Relation</em>'.
   * @see rslingo.rslil.rSLIL.TermRelation
   * @generated
   */
  EClass getTermRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.TermRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.TermRelation#getType()
   * @see #getTermRelation()
   * @generated
   */
  EAttribute getTermRelation_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.TermRelation#getRefTerm <em>Ref Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Term</em>'.
   * @see rslingo.rslil.rSLIL.TermRelation#getRefTerm()
   * @see #getTermRelation()
   * @generated
   */
  EReference getTermRelation_RefTerm();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefTerm <em>Ref Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Term</em>'.
   * @see rslingo.rslil.rSLIL.RefTerm
   * @generated
   */
  EClass getRefTerm();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.RefTerm#getRefTerm <em>Ref Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Term</em>'.
   * @see rslingo.rslil.rSLIL.RefTerm#getRefTerm()
   * @see #getRefTerm()
   * @generated
   */
  EAttribute getRefTerm_RefTerm();

  /**
   * Returns the meta object for the attribute list '{@link rslingo.rslil.rSLIL.RefTerm#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefTerm#getRefs()
   * @see #getRefTerm()
   * @generated
   */
  EAttribute getRefTerm_Refs();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getPriority()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Goal#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Depends On</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getDependsOn()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_DependsOn();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Goal#getComposedBy <em>Composed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composed By</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getComposedBy()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_ComposedBy();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.DependsOnGoal <em>Depends On Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depends On Goal</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnGoal
   * @generated
   */
  EClass getDependsOnGoal();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.DependsOnGoal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnGoal#getType()
   * @see #getDependsOnGoal()
   * @generated
   */
  EAttribute getDependsOnGoal_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.DependsOnGoal#getRefGoal <em>Ref Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Goal</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnGoal#getRefGoal()
   * @see #getDependsOnGoal()
   * @generated
   */
  EReference getDependsOnGoal_RefGoal();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.ComposedBy <em>Composed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composed By</em>'.
   * @see rslingo.rslil.rSLIL.ComposedBy
   * @generated
   */
  EClass getComposedBy();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.ComposedBy#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.ComposedBy#getType()
   * @see #getComposedBy()
   * @generated
   */
  EAttribute getComposedBy_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.ComposedBy#getRefGoal <em>Ref Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Goal</em>'.
   * @see rslingo.rslil.rSLIL.ComposedBy#getRefGoal()
   * @see #getComposedBy()
   * @generated
   */
  EReference getComposedBy_RefGoal();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getPriotity <em>Priotity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priotity</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getPriotity()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Priotity();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.UseCase#getExtensionnPoints <em>Extensionn Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensionn Points</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getExtensionnPoints()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ExtensionnPoints();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.FR#getName()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.FR#getNameAlias()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.FR#getDescription()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.FR#getType()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil.rSLIL.FR#getModality()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Modality();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.FR#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.FR#getStakeholder()
   * @see #getFR()
   * @generated
   */
  EReference getFR_Stakeholder();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.FR#getPriority()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.FR#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Depends</em>'.
   * @see rslingo.rslil.rSLIL.FR#getDepends()
   * @see #getFR()
   * @generated
   */
  EReference getFR_Depends();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.DependsOnFR <em>Depends On FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depends On FR</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnFR
   * @generated
   */
  EClass getDependsOnFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.DependsOnFR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnFR#getType()
   * @see #getDependsOnFR()
   * @generated
   */
  EAttribute getDependsOnFR_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.DependsOnFR#getRefFr <em>Ref Fr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Fr</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnFR#getRefFr()
   * @see #getDependsOnFR()
   * @generated
   */
  EReference getDependsOnFR_RefFr();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.NFR <em>NFR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR</em>'.
   * @see rslingo.rslil.rSLIL.NFR
   * @generated
   */
  EClass getNFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getName()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getNameAlias()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getDescription()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getType()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Type</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getSubType()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_SubType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getMetric()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Metric();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getValue()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Value();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.NFR#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getStakeholder()
   * @see #getNFR()
   * @generated
   */
  EReference getNFR_Stakeholder();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getPriority()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.NFR#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Depends</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getDepends()
   * @see #getNFR()
   * @generated
   */
  EReference getNFR_Depends();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.NFR#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getPartOf()
   * @see #getNFR()
   * @generated
   */
  EReference getNFR_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.DependsOnNFR <em>Depends On NFR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depends On NFR</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnNFR
   * @generated
   */
  EClass getDependsOnNFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.DependsOnNFR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnNFR#getType()
   * @see #getDependsOnNFR()
   * @generated
   */
  EAttribute getDependsOnNFR_Type();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.DependsOnNFR#getRefFr <em>Ref Fr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Fr</em>'.
   * @see rslingo.rslil.rSLIL.DependsOnNFR#getRefFr()
   * @see #getDependsOnNFR()
   * @generated
   */
  EReference getDependsOnNFR_RefFr();

  /**
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.RefNFR <em>Ref NFR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref NFR</em>'.
   * @see rslingo.rslil.rSLIL.RefNFR
   * @generated
   */
  EClass getRefNFR();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.RefNFR#getRefNFR <em>Ref NFR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref NFR</em>'.
   * @see rslingo.rslil.rSLIL.RefNFR#getRefNFR()
   * @see #getRefNFR()
   * @generated
   */
  EReference getRefNFR_RefNFR();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rslil.rSLIL.RefNFR#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rslil.rSLIL.RefNFR#getRefs()
   * @see #getRefNFR()
   * @generated
   */
  EReference getRefNFR_Refs();

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
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROJECT = eINSTANCE.getModel_Project();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

    /**
     * The meta object literal for the '<em><b>Glossary Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GLOSSARY_TERMS = eINSTANCE.getModel_GlossaryTerms();

    /**
     * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STAKEHOLDERS = eINSTANCE.getModel_Stakeholders();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GOALS = eINSTANCE.getModel_Goals();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTORS = eINSTANCE.getModel_Actors();

    /**
     * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__USE_CASES = eINSTANCE.getModel_UseCases();

    /**
     * The meta object literal for the '<em><b>Frs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FRS = eINSTANCE.getModel_Frs();

    /**
     * The meta object literal for the '<em><b>Nfrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NFRS = eINSTANCE.getModel_Nfrs();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

    /**
     * The meta object literal for the '<em><b>Ref System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__REF_SYSTEM = eINSTANCE.getProject_RefSystem();

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
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__PART_OF = eINSTANCE.getSystem_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefSystemImpl <em>Ref System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefSystemImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefSystem()
     * @generated
     */
    EClass REF_SYSTEM = eINSTANCE.getRefSystem();

    /**
     * The meta object literal for the '<em><b>Ref System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SYSTEM__REF_SYSTEM = eINSTANCE.getRefSystem_RefSystem();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SYSTEM__REFS = eINSTANCE.getRefSystem_Refs();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__DESCRIPTION = eINSTANCE.getGlossaryTerm_Description();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__POS = eINSTANCE.getGlossaryTerm_Pos();

    /**
     * The meta object literal for the '<em><b>Synset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__SYNSET = eINSTANCE.getGlossaryTerm_Synset();

    /**
     * The meta object literal for the '<em><b>Term Relation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOSSARY_TERM__TERM_RELATION = eINSTANCE.getGlossaryTerm_TermRelation();

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
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.TermRelationImpl <em>Term Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.TermRelationImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getTermRelation()
     * @generated
     */
    EClass TERM_RELATION = eINSTANCE.getTermRelation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_RELATION__TYPE = eINSTANCE.getTermRelation_Type();

    /**
     * The meta object literal for the '<em><b>Ref Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_RELATION__REF_TERM = eINSTANCE.getTermRelation_RefTerm();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefTermImpl <em>Ref Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefTermImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefTerm()
     * @generated
     */
    EClass REF_TERM = eINSTANCE.getRefTerm();

    /**
     * The meta object literal for the '<em><b>Ref Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TERM__REF_TERM = eINSTANCE.getRefTerm_RefTerm();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TERM__REFS = eINSTANCE.getRefTerm_Refs();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DESCRIPTION = eINSTANCE.getStakeholder_Description();

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
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__DEPENDS_ON = eINSTANCE.getGoal_DependsOn();

    /**
     * The meta object literal for the '<em><b>Composed By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__COMPOSED_BY = eINSTANCE.getGoal_ComposedBy();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.DependsOnGoalImpl <em>Depends On Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.DependsOnGoalImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnGoal()
     * @generated
     */
    EClass DEPENDS_ON_GOAL = eINSTANCE.getDependsOnGoal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDS_ON_GOAL__TYPE = eINSTANCE.getDependsOnGoal_Type();

    /**
     * The meta object literal for the '<em><b>Ref Goal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDS_ON_GOAL__REF_GOAL = eINSTANCE.getDependsOnGoal_RefGoal();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.ComposedByImpl <em>Composed By</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.ComposedByImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getComposedBy()
     * @generated
     */
    EClass COMPOSED_BY = eINSTANCE.getComposedBy();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSED_BY__TYPE = eINSTANCE.getComposedBy_Type();

    /**
     * The meta object literal for the '<em><b>Ref Goal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSED_BY__REF_GOAL = eINSTANCE.getComposedBy_RefGoal();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

    /**
     * The meta object literal for the '<em><b>Priotity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__PRIOTITY = eINSTANCE.getUseCase_Priotity();

    /**
     * The meta object literal for the '<em><b>Extensionn Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTENSIONN_POINTS = eINSTANCE.getUseCase_ExtensionnPoints();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__NAME = eINSTANCE.getFR_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__NAME_ALIAS = eINSTANCE.getFR_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__DESCRIPTION = eINSTANCE.getFR_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__TYPE = eINSTANCE.getFR_Type();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__MODALITY = eINSTANCE.getFR_Modality();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__STAKEHOLDER = eINSTANCE.getFR_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__PRIORITY = eINSTANCE.getFR_Priority();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__DEPENDS = eINSTANCE.getFR_Depends();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__PART_OF = eINSTANCE.getFR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.DependsOnFRImpl <em>Depends On FR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.DependsOnFRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnFR()
     * @generated
     */
    EClass DEPENDS_ON_FR = eINSTANCE.getDependsOnFR();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDS_ON_FR__TYPE = eINSTANCE.getDependsOnFR_Type();

    /**
     * The meta object literal for the '<em><b>Ref Fr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDS_ON_FR__REF_FR = eINSTANCE.getDependsOnFR_RefFr();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.NFRImpl <em>NFR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.NFRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getNFR()
     * @generated
     */
    EClass NFR = eINSTANCE.getNFR();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__NAME = eINSTANCE.getNFR_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__NAME_ALIAS = eINSTANCE.getNFR_NameAlias();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__DESCRIPTION = eINSTANCE.getNFR_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__TYPE = eINSTANCE.getNFR_Type();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__SUB_TYPE = eINSTANCE.getNFR_SubType();

    /**
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__METRIC = eINSTANCE.getNFR_Metric();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__VALUE = eINSTANCE.getNFR_Value();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR__STAKEHOLDER = eINSTANCE.getNFR_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__PRIORITY = eINSTANCE.getNFR_Priority();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR__DEPENDS = eINSTANCE.getNFR_Depends();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR__PART_OF = eINSTANCE.getNFR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.DependsOnNFRImpl <em>Depends On NFR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.DependsOnNFRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getDependsOnNFR()
     * @generated
     */
    EClass DEPENDS_ON_NFR = eINSTANCE.getDependsOnNFR();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDS_ON_NFR__TYPE = eINSTANCE.getDependsOnNFR_Type();

    /**
     * The meta object literal for the '<em><b>Ref Fr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDS_ON_NFR__REF_FR = eINSTANCE.getDependsOnNFR_RefFr();

    /**
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.RefNFRImpl <em>Ref NFR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.RefNFRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefNFR()
     * @generated
     */
    EClass REF_NFR = eINSTANCE.getRefNFR();

    /**
     * The meta object literal for the '<em><b>Ref NFR</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_NFR__REF_NFR = eINSTANCE.getRefNFR_RefNFR();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_NFR__REFS = eINSTANCE.getRefNFR_Refs();

  }

} //RSLILPackage
