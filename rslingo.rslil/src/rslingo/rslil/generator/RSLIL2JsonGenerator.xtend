package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.PackageProject
import rslingo.rslil.rSLIL.GlossaryTerm
import rslingo.rslil.rSLIL.Stakeholder
import rslingo.rslil.rSLIL.Goal
import rslingo.rslil.rSLIL.PackageSystem
import rslingo.rslil.rSLIL.RefTermType
import rslingo.rslil.rSLIL.TermRelation
import rslingo.rslil.rSLIL.DependsOnGoal
import rslingo.rslil.rSLIL.ComposedBy
import rslingo.rslil.rSLIL.Entity
import rslingo.rslil.rSLIL.Actor
import rslingo.rslil.rSLIL.UseCase
import rslingo.rslil.rSLIL.FR
import rslingo.rslil.rSLIL.QR
import rslingo.rslil.rSLIL.Constraint
import rslingo.rslil.rSLIL.PrimaryKey
import rslingo.rslil.rSLIL.ForeignKey
import rslingo.rslil.rSLIL.Check
import rslingo.rslil.rSLIL.Attribute
import rslingo.rslil.rSLIL.RefEntity
import rslingo.rslil.rSLIL.RefGoal
import rslingo.rslil.rSLIL.RefFR
import rslingo.rslil.rSLIL.RefActor
import rslingo.rslil.rSLIL.RefUC
import rslingo.rslil.rSLIL.Scenario
import rslingo.rslil.rSLIL.Step
import rslingo.rslil.rSLIL.DependsOnFR
import rslingo.rslil.rSLIL.DependsOnQR
import rslingo.rslil.rSLIL.DependsOnConstraint

class RSLIL2JsonGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className +'.json', 		
			resource.allContents.filter(typeof(PackageProject)).map[compile].join(' ')
		)
	}
	
	def className(Resource res) {
	    var name = res.URI.lastSegment
	    return name.substring(0, name.indexOf('.'))
	}
	
	def compile(PackageProject packageProject)
	'''{
		"ID": "«packageProject.project.name»",
		"Name": "«packageProject.project.nameAlias»",
		"Description": "«packageProject.project.description»",
		«IF !packageProject.glossaryTerms.empty»"Glossary": [
	    «FOR g:packageProject.glossaryTerms SEPARATOR ','»«g.compile»«ENDFOR»],«ENDIF»
	    «IF !packageProject.stakeholders.empty»"Stakeholders": [
	    «FOR s:packageProject.stakeholders SEPARATOR ','»«s.compile»«ENDFOR»],«ENDIF»
	    «IF !packageProject.goals.empty»"Goals": [
	    «FOR g:packageProject.goals SEPARATOR ','»«g.compile»«ENDFOR»],«ENDIF»
	    «IF !packageProject.packageSystems.empty»"Systems": [
	    «FOR s:packageProject.packageSystems SEPARATOR ','»«s.compile»«ENDFOR»]«ENDIF»
	}
	'''
	
	def compile(GlossaryTerm g)
	'''	{
			"ID": "«g.name»",
			"Name": "«g.nameAlias»",
			"Description": "«g.description»",
			"Type": "«g.type.compile»",
			«IF g.acronym != null»"Acronym": "«g.acronym»",«ENDIF»
			«IF g.pos != null»"POS": "«g.pos»",«ENDIF»
			«IF g.synset != null»"Synset": "«g.synset»",«ENDIF»
			«IF !g.termRelation.empty»"Term Relations": [«FOR t:g.termRelation SEPARATOR ',\n'»«t.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(RefTermType r)
	'''«r.refType.type»«IF !r.refs.empty»,«FOR t:r.refs SEPARATOR ','»«t.type»«ENDFOR»«ENDIF»'''
	
	def compile(TermRelation t)
	''' {
			"Type": "«t.type»",
			"Value": "«t.refTerm.refTerm»«IF !t.refTerm.refs.empty»,«FOR r:t.refTerm.refs SEPARATOR ','»«r»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(Stakeholder s)
	'''	{
			"ID": "«s.name»",
			"Name": "«s.nameAlias»",
			"Description": "«s.description»",
			"Type": "«s.type»",
			"Category": "«s.category»",
			«IF s.partOf != null»"Part Of": "«s.partOf.name»"«ENDIF»
		}
	'''
	
	def compile(Goal g)
	'''	{
			"ID": "«g.name»",
			"Name": "«g.nameAlias»",
			"Description": "«g.description»",
			«IF g.stakeholder != null»"Acronym": "«g.stakeholder.name»",«ENDIF»
			"Priority": "«g.priority.value»",
			«IF !g.dependsOn.empty»"Depends On": [«FOR d:g.dependsOn SEPARATOR ',\n'»«d.compile»«ENDFOR»],«ENDIF»
			«IF !g.composedBy.empty»"Composed By": [«FOR c:g.composedBy SEPARATOR ',\n'»«c.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(DependsOnGoal d)
	''' {
			"Type": "«d.type»",
			"Value": "«d.refGoal.refGoal.name»«IF !d.refGoal.refs.empty»,«FOR r:d.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(ComposedBy c)
	''' {
			"Type": "«c.type»",
			"Value": "«c.refGoal.refGoal.name»«IF !c.refGoal.refs.empty»,«FOR r:c.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(PackageSystem p)
	''' {
			"ID": "«p.system.name»",
			"Name": "«p.system.nameAlias»",
			"Description": "«p.system.description»",
			"Project": "«p.system.project.name»",
			«IF p.system.partOf != null»"Part Of": "«p.system.partOf.name»",«ENDIF»
			«IF !p.entities.empty»"Entities": [
		    «FOR e:p.entities SEPARATOR ','»«e.compile»«ENDFOR»],«ENDIF»
		    «IF !p.actors.empty»"Actors": [
		    «FOR a:p.actors SEPARATOR ','»«a.compile»«ENDFOR»],«ENDIF»
		    «IF !p.useCases.empty»"Use Cases": [
		    «FOR u:p.useCases SEPARATOR ','»«u.compile»«ENDFOR»],«ENDIF»
		    «IF !p.frs.empty»"Functional Requirements": [
		    «FOR f:p.frs SEPARATOR ','»«f.compile»«ENDFOR»],«ENDIF»
		    «IF !p.qrs.empty»"Quality Requirements": [
		    «FOR q:p.qrs SEPARATOR ','»«q.compile»«ENDFOR»],«ENDIF»
		    «IF !p.constraints.empty»"Constraints": [
		    «FOR c:p.constraints SEPARATOR ','»«c.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(Entity e)
	'''	{
			"ID": "«e.name»",
			"Name": "«e.nameAlias»",
			"Description": "«e.description»",
			«IF e.type != null»"Type": "«e.type»",«ENDIF»
			"Attributes": [«FOR a:e.attributes SEPARATOR ',\n'»«a.compile»«ENDFOR»],
			«IF e.primaryKey != null»"Primary Key": "«e.primaryKey.compile»",«ENDIF»
			«IF !e.foreignKeys.empty»"Foreign Keys": [«FOR f:e.foreignKeys SEPARATOR ',\n'»«f.compile»«ENDFOR»],«ENDIF»
			«IF !e.checks.empty»"Checks": [«FOR c:e.checks SEPARATOR ',\n'»«c.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(Attribute a)
	'''	{
			"ID": "«a.name»",
			"Name": "«a.nameAlias»",
			"Description": "«a.description»",
			"Type": "«a.type»",
			«IF a.size > 0»"Size": "«a.size»",«ENDIF»
			«IF a.multiplicity != null»"Multiplicity": «a.multiplicity.value»,«ENDIF»
			«IF a.defaultValue != null»"Default Value": "«a.defaultValue»",«ENDIF»
			«IF a.notNull != null»"Not Null": "true",«ENDIF»
			«IF a.unique != null»"Unique": "true"«ENDIF»
		}
	'''
	
	def compile(PrimaryKey p)
	'''«p.refTo.refAttr.name»«IF !p.refTo.refs.empty»,«FOR r:p.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»'''
	
	def compile(ForeignKey f)
	''' {
			"Value": "«f.entity.name»(«f.refTo.refAttr.name»«IF !f.refTo.refs.empty»,«FOR r:f.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»)",
			"Multiplicity": «f.multiplicity.value»
		}
	'''
	
	def compile(Check c)
	''' {
			"ID": «c.name»,
			"Expression": "«c.checkExpression»"
		}
	'''
	
	def compile(Actor a)
	'''	{
			"ID": "«a.name»",
			"Name": "«a.nameAlias»",
			"Description": "«a.description»",
			"Type": "«a.type»",
			«IF a.stakeholder != null»"Stakeholder": "«a.stakeholder.name»",«ENDIF»
			«IF a.actor != null»"Specialized From": "«a.actor.name»",«ENDIF»
		}
	'''
	
	def compile(UseCase u)
	'''	{
			"ID": "«u.name»",
			"Name": "«u.nameAlias»",
			"Description": "«u.description»",
			"Type": "«u.type»",
			«IF u.entities != null»"Entities": "«u.entities.compile»",«ENDIF»
			"Priority": "«u.priority.value»",
			«IF !u.goals.empty»"Goals": "«FOR g:u.goals SEPARATOR ','»«g.compile»«ENDFOR»",«ENDIF»
			«IF !u.frs.empty»"Functional Requirements": "«FOR f:u.frs SEPARATOR ','»«f.compile»«ENDFOR»",«ENDIF»
			"Actor Initiates": "«u.actorInitiates.name»",
			«IF u.actors != null»"Actor Participates": "«u.actors.compile»",«ENDIF»
			«IF u.preConditions != null»"Pre-Conditions": "«u.preConditions»",«ENDIF»
			«IF u.postConditions != null»"Post-Conditions": "«u.postConditions»",«ENDIF»
			«IF !u.includes.empty»"Include": "«FOR i:u.includes SEPARATOR ','»«i.compile»«ENDFOR»",«ENDIF»
			«IF u.extends != null»"Extend": "«u.extends.name» on «u.extPoint.name»",«ENDIF»
			«IF !u.scenarios.empty»"Scenarios": [«FOR s:u.scenarios SEPARATOR ',\n'»«s.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(RefEntity r)
	'''«r.refEntity.name» as «r.type.type»«IF !r.refs.empty»,«FOR e:r.refs SEPARATOR ','»«e.name» as «r.refType.get(r.refs.indexOf(e)).type»«ENDFOR»«ENDIF»'''
	
	def compile(RefGoal r)
	'''«r.refGoal.name»«IF !r.refs.empty»,«FOR g:r.refs SEPARATOR ','»«g.name»«ENDFOR»«ENDIF»'''
	
	def compile(RefFR r)
	'''«r.refFR.name»«IF !r.refs.empty»,«FOR f:r.refs SEPARATOR ','»«f.name»«ENDFOR»«ENDIF»'''
	
	def compile(RefActor r)
	'''«r.refActor.name»«IF !r.refs.empty»,«FOR a:r.refs SEPARATOR ','»«a.name»«ENDFOR»«ENDIF»	'''
	
	def compile(RefUC r)
	'''«r.refUC.name»«IF !r.refs.empty»,«FOR u:r.refs SEPARATOR ','»«u.name»«ENDFOR»«ENDIF»	'''
	
	def compile(Scenario s)
	''' {
			"ID": "«s.name»",
			"Name": "«s.nameAlias»",
			"Description": "«s.description»",
			"Execution Mode": "«s.mode»",
			«IF !s.steps.empty»"Steps": [«FOR st:s.steps SEPARATOR ',\n'»«st.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(Step s)
	''' {
			"ID": "«s.name»",
			"Name": "«s.nameAlias»",
			"Description": "«s.description»",
			"Type": "«s.type»",
			«IF s.actor != null»"Actor": "«s.actor.name»",«ENDIF»
			«IF s.preConditions != null»"Pre-Conditions": "«s.preConditions»",«ENDIF»
			«IF s.postConditions != null»"Post-Conditions": "«s.postConditions»",«ENDIF»
			«IF s.next != null»"Next Step": "«s.next.name»"«ENDIF»
		}
	'''
	
	def compile(FR f)
	''' {
			"ID": "«f.name»",
			"Name": "«f.nameAlias»",
			"Description": "«f.description»",
			"Type": "«f.type»",
			«IF f.stakeholder != null»"Stakeholder": "«f.stakeholder.name»",«ENDIF»
			Priority": "«f.priority.value»",
			«IF !f.depends.empty»"Depends On": [«FOR d:f.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»],«ENDIF»
			«IF f.partOf != null»"Part Of": "«f.partOf.name»"«ENDIF»
		}
	'''
	
	def compile(DependsOnFR d)
	''' {
			"Type": «d.type»,
			"Value": "«d.refFR.refFR.name»«IF !d.refFR.refs.empty»,«FOR r:d.refFR.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(QR q)
	''' {
			"ID": "«q.name»",
			"Name": "«q.nameAlias»",
			"Description": "«q.description»",
			"Type": "«q.type»",
			«IF q.subType != null»"Sub-Type": "«q.subType»",«ENDIF»
			"Metric": "«q.metric»",
			"Value": "«q.value»",
			«IF q.stakeholder != null»"Stakeholder": "«q.stakeholder.name»",«ENDIF»
			Priority": "«q.priority.value»",
			«IF !q.depends.empty»"Depends On": [«FOR d:q.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»],«ENDIF»
			«IF q.partOf != null»"Part Of": "«q.partOf.name»"«ENDIF»
		}
	'''
	
	def compile(DependsOnQR d)
	''' {
			"Type": «d.type»,
			"Value": "«d.refQR.refQR.name»«IF !d.refQR.refs.empty»,«FOR r:d.refQR.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(Constraint c)
	''' {
			"ID": "«c.name»",
			"Name": "«c.nameAlias»",
			"Description": "«c.description»",
			"Type": "«c.type»",
			«IF c.stakeholder != null»"Stakeholder": "«c.stakeholder.name»",«ENDIF»
			Priority": "«c.priority.value»",
			«IF !c.depends.empty»"Depends On": [«FOR d:c.depends SEPARATOR ',\n'»«d.compile»«ENDFOR»],«ENDIF»
			«IF c.partOf != null»"Part Of": "«c.partOf.name»"«ENDIF»
		}
	'''
	
	def compile(DependsOnConstraint d)
	''' {
			"Type": «d.type»,
			"Value": "«d.refConst.refConst.name»«IF !d.refConst.refs.empty»,«FOR r:d.refConst.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
}