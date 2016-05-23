package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.Actor
import rslingo.rslil.rSLIL.Constraint
import rslingo.rslil.rSLIL.Entity
import rslingo.rslil.rSLIL.FR
import rslingo.rslil.rSLIL.GlossaryTerm
import rslingo.rslil.rSLIL.Goal
import rslingo.rslil.rSLIL.PackageProject
import rslingo.rslil.rSLIL.PackageSystem
import rslingo.rslil.rSLIL.Project
import rslingo.rslil.rSLIL.QR
import rslingo.rslil.rSLIL.Stakeholder
import rslingo.rslil.rSLIL.System
import rslingo.rslil.rSLIL.UseCase
import rslingo.rslil.rSLIL.RefEntity
import rslingo.rslil.rSLIL.TermRelation
import rslingo.rslil.rSLIL.ComposedBy
import rslingo.rslil.rSLIL.DependsOnGoal
import rslingo.rslil.rSLIL.Attribute
import rslingo.rslil.rSLIL.PrimaryKey
import rslingo.rslil.rSLIL.ForeignKey
import rslingo.rslil.rSLIL.Check

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RSLIL2TextGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className + '.txt',
			resource.allContents.filter(typeof(PackageProject)).map[compile].join(' ')
		)
	}

	def className(Resource res) {
	    var name = res.URI.lastSegment
	    return name.substring(0, name.indexOf('.'))
	}

	def compile(PackageProject packageProject)
	'''
	Project
	----------------------------------------
	«packageProject.project.compile»
	«IF !packageProject.glossaryTerms.empty»
	
	#Glossary
	------------------
	«FOR g:packageProject.glossaryTerms»«g.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.stakeholders.empty»
	
	#Stakeholders
	------------------
	«FOR s:packageProject.stakeholders»«s.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.goals.empty»
	
	#Goals
	------------------
	«FOR g:packageProject.goals»«g.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.packageSystems.empty»
	
	#Systems
	------------------
	«FOR s:packageProject.packageSystems»«s.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(Project p)
	'''
	«p.name».«p.nameAlias»:
	«p.description»
	'''
	
	def compile(PackageSystem p)
	'''
	«p.system.compile»
	«IF !p.entities.empty»
	
	#Entities
	------------------
	«FOR e:p.entities»«e.compile»«ENDFOR»«ENDIF»
	«IF !p.actors.empty»
	
	#Actors
	------------------
	«FOR a:p.actors»«a.compile»«ENDFOR»«ENDIF»
	«IF !p.useCases.empty»
	
	#Use Cases
	------------------
	«FOR u:p.useCases»«u.compile»«ENDFOR»«ENDIF»
	«IF !p.frs.empty»
	
	#Functional Requirements
	--------------------------
	«FOR f:p.frs»«f.compile»«ENDFOR»«ENDIF»
	«IF !p.qrs.empty»
	
	#Quality Requirements
	-----------------------------
	«FOR n:p.qrs»«n.compile»«ENDFOR»«ENDIF»
	«IF !p.constraints.empty»
	
	#Constraints
	------------------
	«FOR c:p.constraints»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(System s)
	'''
	«s.name»(«s.nameAlias»):
	«s.description»
	«IF s.partOf != null»Part of: «s.partOf.name»«ENDIF»
	'''
	
	def compile(GlossaryTerm g)
	'''
	«g.name».«g.nameAlias» («g.type»):
	«g.description»,
	«g.acronym»,
	«g.pos»,
	«g.synset»,
	«IF g.termRelation.empty»Term Relation: «FOR t:g.termRelation SEPARATOR ','»«t.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(TermRelation t)
	'''
	«t.type» «t.refTerm.refTerm»«FOR r:t.refTerm.refs SEPARATOR ','»«r»«ENDFOR»
	'''
	
	def compile(Stakeholder s)
	'''
	«s.name».«s.nameAlias» («s.type»):
	«s.description»,
	«s.category»,
	«IF s.partOf != null»Part of: «s.partOf.name»«ENDIF»
	'''
	
	def compile(Goal g)
	'''
	«g.name».«g.nameAlias»:
	«g.description»,
	«IF g.stakeholder != null»Stakeholder: «g.stakeholder.name»«ENDIF»
	«g.priority»,
	«FOR d:g.dependsOn SEPARATOR ',\n'»«d.compile»«ENDFOR»
	«FOR c:g.composedBy SEPARATOR ',\n'»«c.compile»«ENDFOR»
	'''
	
	def compile(DependsOnGoal d)
	'''
	«d.type» «d.refGoal.refGoal»«FOR r:d.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»
	'''
	
	def compile(ComposedBy c)
	'''
	«c.type» «c.refGoal.refGoal»«FOR r:c.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»
	'''
	
	def compile(Entity e)
	'''
	«e.name».«e.nameAlias» («e.type»):
	«e.description»,
	Attributes: «FOR a:e.attributes SEPARATOR ',\n'»«a.compile»«ENDFOR»
	«IF e.primaryKey != null»Primary Key: «e.primaryKey.compile»«ENDIF»
	«IF !e.foreignKeys.empty»Foreign Keys: «FOR f:e.foreignKeys SEPARATOR ',\n'»«f.compile»«ENDFOR»«ENDIF»
	«IF !e.checks.empty»Checks: «FOR c:e.checks SEPARATOR ',\n'»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(Attribute a)
	'''
	«a.name».«a.nameAlias» («a.type»):
	«a.description»
	Size: «a.size»
	Multiplicity: «a.multiplicity»
	Default Value: «a.defaultValue»
	«IF a.notNull != null»NotNull«ENDIF»
	«IF a.unique != null»Unique«ENDIF»
	'''
	
	def compile(PrimaryKey p)
	'''
	«p.refTo.refAttr.name»«IF !p.refTo.refs.empty»,«FOR r:p.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(ForeignKey f)
	'''
	«f.entity.name»(«f.refTo.refAttr.name»«IF !f.refTo.refs.empty»,«FOR r:f.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF») «f.multiplicity.value»
	'''
	
	def compile(Check c)
	'''
	«c.name» «c.checkExpression»
	'''
	
	def compile(Actor a)
	'''
	«a.name».«a.nameAlias» («a.type»):
	«a.description»
	Stakeholder: «a.stakeholder.name»
	«IF a.actor != null»Specialized from: «a.actor.name»«ENDIF»
	'''
	
	def compile(UseCase u)
	'''
	«u.name».«u.nameAlias» («u.type»):
	«u.description»
	«IF u.entities != null»Entities: «u.entities.compile»«ENDIF»
	Priority: «u.priority»
	«IF !u.extensionPoints.empty»Extension Points: «FOR e:u.extensionPoints SEPARATOR ', '»«e.name»«ENDFOR»«ENDIF»
		extensionPoints+=ExtensionPoint*
	«IF u.entities != null» «ENDIF»
		('Goals' goals+=RefGoal*)?
	«IF u.entities != null» «ENDIF»
		('FunctionalRequirements' frs+=RefFR*)?
	Actor Initiates: «u.actorInitiates.name»
	«IF u.entities != null» «ENDIF»
		('ActorParticipates' actors=RefActor)?
	«IF u.entities != null» «ENDIF»
		('Pre-Conditions' preConditions=STRING)?
	«IF u.entities != null» «ENDIF»
		('Post-Conditions' postConditions=STRING)?
	«IF u.entities != null» «ENDIF»
		('Include' includes+=RefUC*)?
	«IF u.extends != null»Extend «u.extends.name» on «u.extPoint.name»: «u.extPoint.description»«ENDIF»
	«IF u.scenarios != null»Scenarios«ENDIF»
	'''
	
	def compile(RefEntity r)
	'''
	'''
	
	def compile(FR f)
	'''
	'''
	
	def compile(QR q)
	'''
	'''
	
	def compile(Constraint c)
	'''
	'''
		
	def compileRefSystem(System s)
	'''«s.name»'''
	
}