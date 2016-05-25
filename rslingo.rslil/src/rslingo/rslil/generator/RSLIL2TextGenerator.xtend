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
import rslingo.rslil.rSLIL.RefGoal
import rslingo.rslil.rSLIL.RefFR
import rslingo.rslil.rSLIL.RefActor
import rslingo.rslil.rSLIL.Scenario
import rslingo.rslil.rSLIL.RefUC
import rslingo.rslil.rSLIL.Step
import rslingo.rslil.rSLIL.DependsOnFR
import rslingo.rslil.rSLIL.DependsOnQR
import rslingo.rslil.rSLIL.DependsOnConstraint
import rslingo.rslil.rSLIL.RefTermType

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
	«FOR g:packageProject.glossaryTerms SEPARATOR '\n'»«g.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.stakeholders.empty»
	
	#Stakeholders
	------------------
	«FOR s:packageProject.stakeholders SEPARATOR '\n'»«s.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.goals.empty»
	
	#Goals
	------------------
	«FOR g:packageProject.goals SEPARATOR '\n'»«g.compile»«ENDFOR»«ENDIF»
	«IF !packageProject.packageSystems.empty»
	
	#Systems
	------------------
	«FOR s:packageProject.packageSystems SEPARATOR '\n'»«s.compile»«ENDFOR»«ENDIF»
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
	«FOR e:p.entities SEPARATOR '\n'»«e.compile»«ENDFOR»«ENDIF»
	«IF !p.actors.empty»
	
	#Actors
	------------------
	«FOR a:p.actors SEPARATOR '\n'»«a.compile»«ENDFOR»«ENDIF»
	«IF !p.useCases.empty»
	
	#Use Cases
	------------------
	«FOR u:p.useCases SEPARATOR '\n'»«u.compile»«ENDFOR»«ENDIF»
	«IF !p.frs.empty»
	
	#Functional Requirements
	--------------------------
	«FOR f:p.frs SEPARATOR '\n'»«f.compile»«ENDFOR»«ENDIF»
	«IF !p.qrs.empty»
	
	#Quality Requirements
	-----------------------------
	«FOR n:p.qrs SEPARATOR '\n'»«n.compile»«ENDFOR»«ENDIF»
	«IF !p.constraints.empty»
	
	#Constraints
	------------------
	«FOR c:p.constraints SEPARATOR '\n'»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(System s)
	'''
	«s.name» («s.nameAlias»):
	«s.description»
	Project: «s.project.name»
	«IF s.partOf != null»Part Of: «s.partOf.name»«ENDIF»
	'''
	
	def compile(GlossaryTerm g)
	'''
	«g.name».«g.nameAlias» («g.type.compile»):
	«g.description»,
	«IF g.acronym != null»Acronym: «g.acronym»,«ENDIF»
	«IF g.pos != null»POS: «g.pos»,«ENDIF»
	«IF g.synset != null»Synset: «g.synset»,«ENDIF»
	«IF !g.termRelation.empty»Term Relations: «FOR t:g.termRelation SEPARATOR ',\n'»«t.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefTermType r)
	'''«r.refType.type»«IF !r.refs.empty»,«FOR t:r.refs SEPARATOR ','»«t.type»«ENDFOR»«ENDIF»'''
	
	def compile(TermRelation t)
	'''
	«t.type» «t.refTerm.refTerm»«IF !t.refTerm.refs.empty»,«FOR r:t.refTerm.refs SEPARATOR ','»«r»«ENDFOR»«ENDIF»
	'''
	
	def compile(Stakeholder s)
	'''
	«s.name».«s.nameAlias» («s.type»):
	«s.description»,
	«s.category»,
	«IF s.partOf != null»Part Of: «s.partOf.name»«ENDIF»
	'''
	
	def compile(Goal g)
	'''
	«g.name».«g.nameAlias»:
	«g.description»,
	«IF g.stakeholder != null»Stakeholder: «g.stakeholder.name»«ENDIF»
	Priority: «g.priority.value»,
	«IF !g.dependsOn.empty»Depends On: «FOR d:g.dependsOn SEPARATOR ',\n'»«d.compile»«ENDFOR»«ENDIF»
	«IF !g.composedBy.empty»Composed By: «FOR c:g.composedBy SEPARATOR ',\n'»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(DependsOnGoal d)
	'''
	«d.type» «d.refGoal.refGoal.name»«IF !d.refGoal.refs.empty»,«FOR r:d.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(ComposedBy c)
	'''
	«c.type» «c.refGoal.refGoal.name»«FOR r:c.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»
	'''
	
	def compile(Entity e)
	'''
	«e.name».«e.nameAlias» («e.type»):
	«e.description»,
	Attributes:
		«FOR a:e.attributes SEPARATOR ',\n'»«a.compile»«ENDFOR»
	«IF e.primaryKey != null»Primary Key: «e.primaryKey.compile»«ENDIF»
	«IF !e.foreignKeys.empty»Foreign Keys: «FOR f:e.foreignKeys SEPARATOR ',\n'»«f.compile»«ENDFOR»«ENDIF»
	«IF !e.checks.empty»Checks: «FOR c:e.checks SEPARATOR ',\n'»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(Attribute a)
	'''
	«a.name».«a.nameAlias» («a.type»):
	«a.description»
	Type: «a.type»
	«IF a.size > 0»Size: «a.size»«ENDIF»
	«IF a.multiplicity != null»Multiplicity: «a.multiplicity.value»«ENDIF»
	«IF a.defaultValue != null»Default Value: «a.defaultValue»«ENDIF»
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
	«IF a.stakeholder != null»Stakeholder: «a.stakeholder.name»«ENDIF»
	«IF a.actor != null»Specialized From: «a.actor.name»«ENDIF»
	'''
	
	def compile(UseCase u)
	'''
	«u.name».«u.nameAlias» («u.type»):
	«u.description»
	«IF u.entities != null»Entities: «u.entities.compile»«ENDIF»
	Priority: «u.priority.value»
	«IF !u.extensionPoints.empty»Extension Points: «FOR e:u.extensionPoints SEPARATOR ', '»«e.name»«ENDFOR»«ENDIF»
	«IF !u.goals.empty»Goals: «FOR g:u.goals SEPARATOR ','»«g.compile»«ENDFOR»«ENDIF»
	«IF !u.frs.empty»Functional Requirements: «FOR f:u.frs SEPARATOR ','»«f.compile»«ENDFOR»«ENDIF»
	Actor Initiates: «u.actorInitiates.name»
	«IF u.actors != null»Actor Participates: «u.actors.compile»«ENDIF»
	«IF u.preConditions != null»Pre-Conditions: «u.preConditions»«ENDIF»
	«IF u.postConditions != null»Post-Conditions: «u.postConditions»«ENDIF»
	«IF !u.includes.empty»Include: «FOR i:u.includes SEPARATOR ','»«i.compile»«ENDFOR»«ENDIF»
	«IF u.extends != null»Extend «u.extends.name» on «u.extPoint.name»«ENDIF»
	«IF !u.scenarios.empty»Scenarios:
		«FOR s:u.scenarios SEPARATOR ',\n'»«s.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefEntity r)
	'''
	«r.refEntity.name» as «r.type.type»«IF !r.refs.empty»,«FOR e:r.refs SEPARATOR ','»«e.name» as «r.refType.get(r.refs.indexOf(e)).type»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefGoal r)
	'''
	«r.refGoal.name»«IF !r.refs.empty»,«FOR g:r.refs SEPARATOR ','»«g.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefFR r)
	'''
	«r.refFR.name»«IF !r.refs.empty»,«FOR f:r.refs SEPARATOR ','»«f.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefActor r)
	'''
	«r.refActor.name»«IF !r.refs.empty»,«FOR a:r.refs SEPARATOR ','»«a.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(RefUC r)
	'''
	«r.refUC.name»«IF !r.refs.empty»,«FOR u:r.refs SEPARATOR ','»«u.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(Scenario s)
	'''
	«s.name».«s.nameAlias» («s.type»):
	«s.description»,
	Execution Mode: «s.mode»,
	«IF !s.steps.empty»Steps:
		«FOR st:s.steps SEPARATOR ',\n'»«st.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(Step s)
	'''
	«s.name».«s.nameAlias» («s.type»):
	«s.description»,
	«IF s.actor != null»Actor: «s.actor.name»,«ENDIF»
	«IF s.preConditions != null»Pre-Conditions: «s.preConditions»,«ENDIF»
	«IF s.postConditions != null»Post-Conditions: «s.postConditions»,«ENDIF»
	«IF s.next != null»Next Step: «s.next.name»«ENDIF»
	'''
	
	def compile(FR f)
	'''
	«f.name».«f.nameAlias» («f.type»):
	«f.description»,
	«IF f.stakeholder != null»Stakeholder: «f.stakeholder.name»,«ENDIF»
	Priority: «f.priority.value»,
	«IF !f.depends.empty»Depends On: «FOR d:f.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»«ENDIF»
	«IF f.partOf != null»Part Of: «f.partOf.name»«ENDIF»
	'''
	
	def compile(DependsOnFR d)
	'''
	«d.type» «d.refFR.refFR.name»«IF !d.refFR.refs.empty»,«FOR f:d.refFR.refs SEPARATOR ','»«f.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(QR q)
	'''
	«q.name».«q.nameAlias» («q.type»):
	«q.description»,
	«IF q.subType != null»Sub-Type: «q.subType»,«ENDIF»
	Metric: «q.metric»
	Value: «q.value»
	«IF q.stakeholder != null»Stakeholder: «q.stakeholder.name»,«ENDIF»
	Priority: «q.priority.value»,
	«IF !q.depends.empty»Depends On: «FOR d:q.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»«ENDIF»
	«IF q.partOf != null»Part Of: «q.partOf.name»«ENDIF»
	'''
	
	def compile(DependsOnQR d)
	'''
	«d.type» «d.refQR.refQR.name»«IF !d.refQR.refs.empty»,«FOR q:d.refQR.refs SEPARATOR ','»«q.name»«ENDFOR»«ENDIF»
	'''
	
	def compile(Constraint c)
	'''
	«c.name».«c.nameAlias» («c.type»):
	«c.description»,
	«IF c.stakeholder != null»Stakeholder: «c.stakeholder.name»,«ENDIF»
	Priority: «c.priority.value»,
	«IF !c.depends.empty»Depends On: «FOR d:c.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»«ENDIF»
	«IF c.partOf != null»Part Of: «c.partOf.name»«ENDIF»
	'''
	
	def compile(DependsOnConstraint d)
	'''
	«d.type» «d.refConst.refConst.name»«IF !d.refConst.refs.empty»,«FOR q:d.refConst.refs SEPARATOR ','»«q.name»«ENDFOR»«ENDIF»
	'''
}