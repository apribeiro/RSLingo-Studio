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
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = 0;

  /**
   * The feature id for the '<em><b>Glossaries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GLOSSARIES = 1;

  /**
   * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STAKEHOLDERS = 2;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GOALS = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 4;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTORS = 5;

  /**
   * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USE_CASES = 6;

  /**
   * The feature id for the '<em><b>Frs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FRS = 7;

  /**
   * The feature id for the '<em><b>Nfrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NFRS = 8;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.SystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__ID = 0;

  /**
   * The feature id for the '<em><b>System Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SYSTEM_ID = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Ref System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__REF_SYSTEM = 4;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefSystemImpl <em>Ref System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefSystemImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefSystem()
   * @generated
   */
  int REF_SYSTEM = 2;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.GlossaryImpl <em>Glossary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.GlossaryImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGlossary()
   * @generated
   */
  int GLOSSARY = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__ACRONYM = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__POS = 5;

  /**
   * The feature id for the '<em><b>Synset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__SYNSET = 6;

  /**
   * The feature id for the '<em><b>Term Relation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__TERM_RELATION_TYPE = 7;

  /**
   * The feature id for the '<em><b>Term Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY__TERM_RELATION = 8;

  /**
   * The number of structural features of the '<em>Glossary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.StakeholderImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = 1;

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
   * The feature id for the '<em><b>Depends On Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DEPENDS_ON_TYPE = 5;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DEPENDS_ON = 6;

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
  int GOAL = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ID = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER = 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Depends On Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DEPENDS_ON_TYPE = 4;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DEPENDS_ON = 5;

  /**
   * The feature id for the '<em><b>Composed By Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__COMPOSED_BY_TYPE = 6;

  /**
   * The feature id for the '<em><b>Composed By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__COMPOSED_BY = 7;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.EntityImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.AttributeImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Descrition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRITION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Field Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FIELD_SIZE = 3;

  /**
   * The feature id for the '<em><b>Field Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FIELD_MULTIPLICITY = 4;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT_VALUE = 5;

  /**
   * The feature id for the '<em><b>Ref To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__REF_TO = 6;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTIPLICITY = 7;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.ActorImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 1;

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
   * The feature id for the '<em><b>Depends On Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DEPENDS_ON_TYPE = 5;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DEPENDS_ON = 6;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.UseCaseImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Priotity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRIOTITY = 4;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__GOALS = 5;

  /**
   * The feature id for the '<em><b>Frs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__FRS = 6;

  /**
   * The feature id for the '<em><b>Actor Initiates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTOR_INITIATES = 7;

  /**
   * The feature id for the '<em><b>Actor Participates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTOR_PARTICIPATES = 8;

  /**
   * The feature id for the '<em><b>Pre Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRE_CONDITIONS = 9;

  /**
   * The feature id for the '<em><b>Post Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__POST_CONDITIONS = 10;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__INCLUDES = 11;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.FRImpl <em>FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.FRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getFR()
   * @generated
   */
  int FR = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Modality Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__MODALITY_TYPE = 3;

  /**
   * The feature id for the '<em><b>Action Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__ACTION_TYPE = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__SOURCE = 5;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PRIORITY = 6;

  /**
   * The number of structural features of the '<em>FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.NFRImpl <em>NFR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.NFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getNFR()
   * @generated
   */
  int NFR = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__NAME = 1;

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
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__SOURCE = 7;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR__PRIORITY = 8;

  /**
   * The number of structural features of the '<em>NFR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefGoalImpl <em>Ref Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefGoalImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefGoal()
   * @generated
   */
  int REF_GOAL = 12;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefFRImpl <em>Ref FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefFRImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefFR()
   * @generated
   */
  int REF_FR = 13;

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
   * The meta object id for the '{@link rslingo.rslil.rSLIL.impl.RefUCImpl <em>Ref UC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil.rSLIL.impl.RefUCImpl
   * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getRefUC()
   * @generated
   */
  int REF_UC = 14;

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see rslingo.rslil.rSLIL.Model
   * @generated
   */
  EClass getModel();

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
   * Returns the meta object for the containment reference list '{@link rslingo.rslil.rSLIL.Model#getGlossaries <em>Glossaries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Glossaries</em>'.
   * @see rslingo.rslil.rSLIL.Model#getGlossaries()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Glossaries();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see rslingo.rslil.rSLIL.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.System#getId()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Id();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.System#getSystemId <em>System Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System Id</em>'.
   * @see rslingo.rslil.rSLIL.System#getSystemId()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_SystemId();

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
   * Returns the meta object for the containment reference '{@link rslingo.rslil.rSLIL.System#getRefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref System</em>'.
   * @see rslingo.rslil.rSLIL.System#getRefSystem()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_RefSystem();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.Glossary <em>Glossary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Glossary</em>'.
   * @see rslingo.rslil.rSLIL.Glossary
   * @generated
   */
  EClass getGlossary();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getId()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Id();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getName()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getType()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getAcronym <em>Acronym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acronym</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getAcronym()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Acronym();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getDescription()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pos</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getPos()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Pos();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getSynset <em>Synset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synset</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getSynset()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_Synset();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getTermRelationType <em>Term Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term Relation Type</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getTermRelationType()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_TermRelationType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Glossary#getTermRelation <em>Term Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term Relation</em>'.
   * @see rslingo.rslil.rSLIL.Glossary#getTermRelation()
   * @see #getGlossary()
   * @generated
   */
  EAttribute getGlossary_TermRelation();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getId()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Id();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getDependsOnType <em>Depends On Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On Type</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getDependsOnType()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_DependsOnType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Stakeholder#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On</em>'.
   * @see rslingo.rslil.rSLIL.Stakeholder#getDependsOn()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_DependsOn();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getId()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Id();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getDependsOnType <em>Depends On Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On Type</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getDependsOnType()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_DependsOnType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getDependsOn()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_DependsOn();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getComposedByType <em>Composed By Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Composed By Type</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getComposedByType()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_ComposedByType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Goal#getComposedBy <em>Composed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Composed By</em>'.
   * @see rslingo.rslil.rSLIL.Goal#getComposedBy()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_ComposedBy();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Entity#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.Entity#getId()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Id();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getDescrition <em>Descrition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descrition</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getDescrition()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Descrition();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getFieldSize <em>Field Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Size</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getFieldSize()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_FieldSize();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getFieldMultiplicity <em>Field Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Multiplicity</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getFieldMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_FieldMultiplicity();

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
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.Attribute#getRefTo <em>Ref To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref To</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getRefTo()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_RefTo();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Attribute#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see rslingo.rslil.rSLIL.Attribute#getMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Multiplicity();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getId()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Id();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getDependsOnType <em>Depends On Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On Type</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getDependsOnType()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_DependsOnType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.Actor#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends On</em>'.
   * @see rslingo.rslil.rSLIL.Actor#getDependsOn()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_DependsOn();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.UseCase#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getId()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Id();

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
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.UseCase#getActorParticipates <em>Actor Participates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor Participates</em>'.
   * @see rslingo.rslil.rSLIL.UseCase#getActorParticipates()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ActorParticipates();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.FR <em>FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FR</em>'.
   * @see rslingo.rslil.rSLIL.FR
   * @generated
   */
  EClass getFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.FR#getId()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Id();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getModalityType <em>Modality Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality Type</em>'.
   * @see rslingo.rslil.rSLIL.FR#getModalityType()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_ModalityType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.FR#getActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action Type</em>'.
   * @see rslingo.rslil.rSLIL.FR#getActionType()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_ActionType();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.FR#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rslil.rSLIL.FR#getSource()
   * @see #getFR()
   * @generated
   */
  EReference getFR_Source();

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
   * Returns the meta object for class '{@link rslingo.rslil.rSLIL.NFR <em>NFR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR</em>'.
   * @see rslingo.rslil.rSLIL.NFR
   * @generated
   */
  EClass getNFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil.rSLIL.NFR#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getId()
   * @see #getNFR()
   * @generated
   */
  EAttribute getNFR_Id();

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
   * Returns the meta object for the reference '{@link rslingo.rslil.rSLIL.NFR#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rslil.rSLIL.NFR#getSource()
   * @see #getNFR()
   * @generated
   */
  EReference getNFR_Source();

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
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

    /**
     * The meta object literal for the '<em><b>Glossaries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GLOSSARIES = eINSTANCE.getModel_Glossaries();

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
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.SystemImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

    /**
     * The meta object literal for the '<em><b>System Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__SYSTEM_ID = eINSTANCE.getSystem_SystemId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();

    /**
     * The meta object literal for the '<em><b>Ref System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__REF_SYSTEM = eINSTANCE.getSystem_RefSystem();

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
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.GlossaryImpl <em>Glossary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.GlossaryImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getGlossary()
     * @generated
     */
    EClass GLOSSARY = eINSTANCE.getGlossary();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__ID = eINSTANCE.getGlossary_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__NAME = eINSTANCE.getGlossary_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__TYPE = eINSTANCE.getGlossary_Type();

    /**
     * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__ACRONYM = eINSTANCE.getGlossary_Acronym();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__DESCRIPTION = eINSTANCE.getGlossary_Description();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__POS = eINSTANCE.getGlossary_Pos();

    /**
     * The meta object literal for the '<em><b>Synset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__SYNSET = eINSTANCE.getGlossary_Synset();

    /**
     * The meta object literal for the '<em><b>Term Relation Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__TERM_RELATION_TYPE = eINSTANCE.getGlossary_TermRelationType();

    /**
     * The meta object literal for the '<em><b>Term Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY__TERM_RELATION = eINSTANCE.getGlossary_TermRelation();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__ID = eINSTANCE.getStakeholder_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

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
     * The meta object literal for the '<em><b>Depends On Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DEPENDS_ON_TYPE = eINSTANCE.getStakeholder_DependsOnType();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DEPENDS_ON = eINSTANCE.getStakeholder_DependsOn();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ID = eINSTANCE.getGoal_Id();

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
     * The meta object literal for the '<em><b>Depends On Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__DEPENDS_ON_TYPE = eINSTANCE.getGoal_DependsOnType();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__DEPENDS_ON = eINSTANCE.getGoal_DependsOn();

    /**
     * The meta object literal for the '<em><b>Composed By Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__COMPOSED_BY_TYPE = eINSTANCE.getGoal_ComposedByType();

    /**
     * The meta object literal for the '<em><b>Composed By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__COMPOSED_BY = eINSTANCE.getGoal_ComposedBy();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

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
     * The meta object literal for the '<em><b>Descrition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRITION = eINSTANCE.getAttribute_Descrition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Field Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__FIELD_SIZE = eINSTANCE.getAttribute_FieldSize();

    /**
     * The meta object literal for the '<em><b>Field Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__FIELD_MULTIPLICITY = eINSTANCE.getAttribute_FieldMultiplicity();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Ref To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__REF_TO = eINSTANCE.getAttribute_RefTo();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__ID = eINSTANCE.getActor_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

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
     * The meta object literal for the '<em><b>Depends On Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DEPENDS_ON_TYPE = eINSTANCE.getActor_DependsOnType();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DEPENDS_ON = eINSTANCE.getActor_DependsOn();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__ID = eINSTANCE.getUseCase_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__TYPE = eINSTANCE.getUseCase_Type();

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
     * The meta object literal for the '<em><b>Actor Participates</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTOR_PARTICIPATES = eINSTANCE.getUseCase_ActorParticipates();

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
     * The meta object literal for the '{@link rslingo.rslil.rSLIL.impl.FRImpl <em>FR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil.rSLIL.impl.FRImpl
     * @see rslingo.rslil.rSLIL.impl.RSLILPackageImpl#getFR()
     * @generated
     */
    EClass FR = eINSTANCE.getFR();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__ID = eINSTANCE.getFR_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__NAME = eINSTANCE.getFR_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__DESCRIPTION = eINSTANCE.getFR_Description();

    /**
     * The meta object literal for the '<em><b>Modality Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__MODALITY_TYPE = eINSTANCE.getFR_ModalityType();

    /**
     * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__ACTION_TYPE = eINSTANCE.getFR_ActionType();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__SOURCE = eINSTANCE.getFR_Source();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__PRIORITY = eINSTANCE.getFR_Priority();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__ID = eINSTANCE.getNFR_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__NAME = eINSTANCE.getNFR_Name();

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
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR__SOURCE = eINSTANCE.getNFR_Source();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR__PRIORITY = eINSTANCE.getNFR_Priority();

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

  }

} //RSLILPackage
