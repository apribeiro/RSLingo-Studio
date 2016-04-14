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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

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

  }

} //RSLILPackage
