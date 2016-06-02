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
import rslingo.rslil.rSLIL.GoalRelation
import rslingo.rslil.rSLIL.RequirementRelation
import rslingo.rslil.rSLIL.SystemRelation

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
	"Application Domain": "«packageProject.project.domain»",
	"Type": "«packageProject.project.type»",
	«IF packageProject.project.planned != null»
	"Planned Schedule": {
		"Start": "«packageProject.project.planned.start.day»-«packageProject.project.planned.start.month.name»-«packageProject.project.planned.start.year»",
		"End": "«packageProject.project.planned.end.day»-«packageProject.project.planned.end.month.name»-«packageProject.project.planned.end.year»"
	},
	«ENDIF»
	«IF packageProject.project.actual != null»
	"Actual Schedule": {
		"Start": "«packageProject.project.actual.start.day»-«packageProject.project.actual.start.month.name»-«packageProject.project.actual.start.year»",
		"End": "«packageProject.project.actual.end.day»-«packageProject.project.actual.end.month.name»-«packageProject.project.actual.end.year»"
	},
	«ENDIF»
	«IF packageProject.project.organizations != null»
	"Organizations": {
		"Customer": "«packageProject.project.organizations.customer»",
		"Supplier": "«packageProject.project.organizations.supplier»",
		"Partners": "«packageProject.project.organizations.partners»"
	},
	«ENDIF»
	«IF packageProject.project.progress != null»
	"Project Progress": "«packageProject.project.progress.value»",
	«ENDIF»
	"Summary": "«packageProject.project.summary»",
	"Description": "«packageProject.project.description»",
	«IF !packageProject.glossaryTerms.empty»"Glossary": [
	«FOR g:packageProject.glossaryTerms SEPARATOR ', '»«g.compile»«ENDFOR»],«ENDIF»
	«IF !packageProject.stakeholders.empty»"Stakeholders": [
	«FOR s:packageProject.stakeholders SEPARATOR ', '»«s.compile»«ENDFOR»],«ENDIF»
	«IF !packageProject.goals.empty»"Goals": [
	«FOR g:packageProject.goals SEPARATOR ', '»«g.compile»«ENDFOR»],«ENDIF»
	«IF !packageProject.goalRelations.empty»"Goal Relations": [
	«FOR g:packageProject.goalRelations SEPARATOR ', '»«g.compile»«ENDFOR»],«ENDIF»
	«IF !packageProject.packageSystems.empty»"Systems": [
	«FOR s:packageProject.packageSystems SEPARATOR ', '»«s.compile»«ENDFOR»],«ENDIF»
	«IF !packageProject.systemRelations.empty»"System Relations": [
	«FOR s:packageProject.systemRelations SEPARATOR ', '»«s.compile»«ENDFOR»]«ENDIF»
}
'''
	
	def compile(GlossaryTerm g)
'''{
	"ID": "«g.name»",
	"Name": "«g.nameAlias»",
	«IF g.description != null»"Description": "«g.description»",«ENDIF»
	"Type": "«g.type.compile»",
	«IF g.acronym != null»"Acronym": "«g.acronym»",«ENDIF»
	«IF g.pos != null»"POS": "«g.pos»",«ENDIF»
	«IF g.synonym != null»"Synonym": "«g.synonym»",«ENDIF»
	«IF g.hypernym != null»"Hypernym": "«g.hypernym»"«ENDIF»
}'''
	
	def compile(RefTermType r)
	'''«r.refType.type»«IF !r.refs.empty»,«FOR t:r.refs SEPARATOR ','»«t.type»«ENDFOR»«ENDIF»'''
	
	def compile(Stakeholder s)
'''{
	"ID": "«s.name»",
	"Name": "«s.nameAlias»",
	«IF s.description != null»"Description": "«s.description»",«ENDIF»
	"Type": "«s.type»",
	"Category": "«s.category»",
	«IF s.isA != null»"Is A": "«s.isA.name»",«ENDIF»
	«IF s.partOf != null»Part Of: «s.partOf.name»«ENDIF»
}'''
	
	def compile(Goal g)
'''{
	"ID": "«g.name»",
	"Name": "«g.nameAlias»",
	«IF g.description != null»"Description": "«g.description»",«ENDIF»
	"Stakeholder": "«g.stakeholder.name»",
	"Priority": "«g.priority.value»",
	«IF g.progress != null»"Project Progress": "«g.progress.value»",«ENDIF»
	«IF g.partOfAnd != null»"Part Of (And)": "«g.partOfAnd.name»",«ENDIF»
	«IF g.partOfOr != null»"Part Of (Or)": "«g.partOfOr.name»"«ENDIF»
}'''
	
	def compile(GoalRelation g)
'''{
	"ID": "«g.name»",
	"Source": "«g.source.name»",
	"Target": "«g.target.name»",
	"Type": "«g.type»",
	«IF g.description != null»"Description": "«g.description»"«ENDIF»
}'''
	
	def compile(PackageSystem p)
'''{
	"ID": "«p.system.name»",
	"Name": "«p.system.nameAlias»",
	«IF p.system.description != null»"Description": "«p.system.description»",«ENDIF»
	"Type": "«p.system.type»",
	"Scope": "«p.system.scope»",
	«IF p.system.partOf != null»"Part Of": "«p.system.partOf.name»",«ENDIF»
	«IF !p.entities.empty»"Entities": [
    «FOR e:p.entities SEPARATOR ', '»«e.compile»«ENDFOR»],«ENDIF»
    «IF !p.actors.empty»"Actors": [
    «FOR a:p.actors SEPARATOR ', '»«a.compile»«ENDFOR»],«ENDIF»
    «IF !p.useCases.empty»"Use Cases": [
    «FOR u:p.useCases SEPARATOR ', '»«u.compile»«ENDFOR»],«ENDIF»
    «IF !p.frs.empty»"Functional Requirements": [
    «FOR f:p.frs SEPARATOR ', '»«f.compile»«ENDFOR»],«ENDIF»
    «IF !p.qrs.empty»"Quality Requirements": [
    «FOR q:p.qrs SEPARATOR ', '»«q.compile»«ENDFOR»],«ENDIF»
    «IF !p.constraints.empty»"Constraints": [
    «FOR c:p.constraints SEPARATOR ', '»«c.compile»«ENDFOR»],«ENDIF»
    «IF !p.requirementRelations.empty»"Requirement Relations": [
    «FOR r:p.requirementRelations SEPARATOR ', '»«r.compile»«ENDFOR»]«ENDIF»
}'''
	
	def compile(SystemRelation s)
'''{
	"ID": "«s.name»",
	"Source": "«s.source.name»",
	"Target": "«s.target.name»",
	"Category": "«s.category»",
	"Type": "«s.type»",
	«IF s.description != null»"Description": "«s.description»"«ENDIF»
}'''
	
	def compile(Entity e)
'''{
	"ID": "«e.name»",
	"Name": "«e.nameAlias»",
	«IF e.description != null»"Description": "«e.description»",«ENDIF»
	«IF e.type != null»"Type": "«e.type»",«ENDIF»
	"Attributes": [«FOR a:e.attributes SEPARATOR ', '»«a.compile»«ENDFOR»],
	«IF e.primaryKey != null»"Primary Key": "(«e.primaryKey.compile»)",«ENDIF»
	«IF !e.foreignKeys.empty»"Foreign Keys": [«FOR f:e.foreignKeys SEPARATOR ',\n'»«f.compile»«ENDFOR»],«ENDIF»
	«IF !e.checks.empty»"Checks": [«FOR c:e.checks SEPARATOR ',\n'»«c.compile»«ENDFOR»]«ENDIF»
}'''
	
	def compile(Attribute a)
'''{
	"ID": "«a.name»",
	"Name": "«a.nameAlias»",
	«IF a.description != null»"Description": "«a.description»",«ENDIF»
	"Type": "«a.type»",
	«IF a.size > 0»"Size": "«a.size»",«ENDIF»
	«IF a.multiplicity != null»"Multiplicity": "«a.multiplicity.value.replaceAll("\"", "")»",«ENDIF»
	«IF a.defaultValue != null»"Default Value": "«a.defaultValue»",«ENDIF»
	"Not Null": "«a.notNull != null»",
	"Unique": "«a.unique != null»"
}'''
	
	def compile(PrimaryKey p)
	'''«p.refTo.refAttr.name»«IF !p.refTo.refs.empty»,«FOR r:p.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»'''
	
	def compile(ForeignKey f)
'''{
	"Value": "«f.entity.name»(«f.refTo.refAttr.name»«IF !f.refTo.refs.empty»,«FOR r:f.refTo.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»)",
	"Multiplicity": "«f.multiplicity.value.replaceAll("\"", "")»"
}'''
	
	def compile(Check c)
'''{
	"ID": «c.name»,
	"Expression": "«c.checkExpression»"
}'''
	
	def compile(Actor a)
'''{
	"ID": "«a.name»",
	"Name": "«a.nameAlias»",
	«IF a.description != null»"Description": "«a.description»",«ENDIF»
	"Type": "«a.type»",
	«IF a.stakeholder != null»"Stakeholder": "«a.stakeholder.name»",«ENDIF»
	«IF a.actor != null»"Is A": "«a.actor.name»"«ENDIF»
}'''
	
	def compile(UseCase u)
'''{
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
}'''
	
	def compile(RefEntity r)
	'''«r.refEntity.name» as «r.type.type»«IF !r.refs.empty»,«FOR e:r.refs SEPARATOR ','»«e.name» as «r.refType.get(r.refs.indexOf(e)).type»«ENDFOR»«ENDIF»'''
	
	def compile(RefGoal r)
	'''«r.refGoal.name»«IF !r.refs.empty»,«FOR g:r.refs SEPARATOR ','»«g.name»«ENDFOR»«ENDIF»'''
	
	def compile(RefFR r)
	'''«r.refFR.name»«IF !r.refs.empty»,«FOR f:r.refs SEPARATOR ','»«f.name»«ENDFOR»«ENDIF»'''
	
	def compile(RefActor r)
	'''«r.refActor.name»«IF !r.refs.empty»,«FOR a:r.refs SEPARATOR ','»«a.name»«ENDFOR»«ENDIF»'''
	
	def compile(RefUC r)
	'''«r.refUC.name»«IF !r.refs.empty»,«FOR u:r.refs SEPARATOR ','»«u.name»«ENDFOR»«ENDIF»'''
	
	def compile(Scenario s)
'''{
	"ID": "«s.name»",
	"Name": "«s.nameAlias»",
	"Description": "«s.description»",
	"Execution Mode": "«s.mode»",
	«IF !s.steps.empty»"Steps": [«FOR st:s.steps SEPARATOR ','»«st.compile»«ENDFOR»]«ENDIF»
}'''
	
	def compile(Step s)
'''{
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
'''{
	"ID": "«f.name»",
	"Name": "«f.nameAlias»",
	«IF f.description != null»"Description": "«f.description»",«ENDIF»
	"Type": "«f.type»",
	«IF f.stakeholder != null»"Stakeholder": "«f.stakeholder.name»",«ENDIF»
	"Priority": "«f.priority.value»",
	«IF f.partOf != null»"Part Of": "«f.partOf.name»",«ENDIF»
	«IF f.progress != null»"Progress": "«f.progress.value»"«ENDIF»
}'''
	
	def compile(QR q)
'''{
	"ID": "«q.name»",
	"Name": "«q.nameAlias»",
	«IF q.description != null»"Description": "«q.description»",«ENDIF»
	"Type": "«q.type»",
	«IF q.subType != null»"Sub-Type": "«q.subType»",«ENDIF»
	"Metric": "«q.metric»",
	"Value": "«q.value»",
	«IF q.stakeholder != null»"Stakeholder": "«q.stakeholder.name»",«ENDIF»
	"Priority": "«q.priority.value»",
	«IF q.partOf != null»"Part Of": "«q.partOf.name»",«ENDIF»
	«IF q.progress != null»"Progress": "«q.progress.value»"«ENDIF»
}'''
	
	def compile(Constraint c)
'''{
	"ID": "«c.name»",
	"Name": "«c.nameAlias»",
	«IF c.description != null»"Description": "«c.description»",«ENDIF»
	"Type": "«c.type»",
	«IF c.stakeholder != null»"Stakeholder": "«c.stakeholder.name»",«ENDIF»
	"Priority": "«c.priority.value»",
	«IF c.partOf != null»"Part Of": "«c.partOf.name»",«ENDIF»
	«IF c.progress != null»"Progress": "«c.progress.value»"«ENDIF»
}'''
	
	def compile(RequirementRelation r)
'''{
	"ID": "«r.name»",
	"Source": "«r.source.name»",
	"Target": "«r.target.name»",
	"Type": "«r.type»",
	«IF r.description != null»"Description": "«r.description»"«ENDIF»
}'''

}