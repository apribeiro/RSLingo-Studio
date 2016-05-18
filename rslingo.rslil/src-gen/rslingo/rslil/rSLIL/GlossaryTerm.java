/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getPos <em>Pos</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getSynset <em>Synset</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.GlossaryTerm#getTermRelation <em>Term Relation</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm()
 * @model
 * @generated
 */
public interface GlossaryTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(RefTermType)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Type()
   * @model containment="true"
   * @generated
   */
  RefTermType getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(RefTermType value);

  /**
   * Returns the value of the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acronym</em>' attribute.
   * @see #setAcronym(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Acronym()
   * @model
   * @generated
   */
  String getAcronym();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getAcronym <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acronym</em>' attribute.
   * @see #getAcronym()
   * @generated
   */
  void setAcronym(String value);

  /**
   * Returns the value of the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos</em>' attribute.
   * @see #setPos(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Pos()
   * @model
   * @generated
   */
  String getPos();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getPos <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos</em>' attribute.
   * @see #getPos()
   * @generated
   */
  void setPos(String value);

  /**
   * Returns the value of the '<em><b>Synset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synset</em>' attribute.
   * @see #setSynset(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_Synset()
   * @model
   * @generated
   */
  String getSynset();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.GlossaryTerm#getSynset <em>Synset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synset</em>' attribute.
   * @see #getSynset()
   * @generated
   */
  void setSynset(String value);

  /**
   * Returns the value of the '<em><b>Term Relation</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.TermRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Relation</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGlossaryTerm_TermRelation()
   * @model containment="true"
   * @generated
   */
  EList<TermRelation> getTermRelation();

} // GlossaryTerm
