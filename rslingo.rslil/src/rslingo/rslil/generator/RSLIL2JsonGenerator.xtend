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
	    «FOR s:packageProject.packageSystems SEPARATOR ','»«s.compile»«ENDFOR»],«ENDIF»
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
	'''
	«r.refType.type»«IF !r.refs.empty»,«FOR t:r.refs SEPARATOR ','»«t.type»«ENDFOR»«ENDIF»
	'''
	
	def compile(TermRelation t)
	''' {
			"Type": «t.type»,
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
			«IF !g.dependsOn.empty»"Depends On": [«FOR d:g.dependsOn SEPARATOR ',\n'»«d.compile»«ENDFOR»]«ENDIF»
			«IF !g.composedBy.empty»"Composed By": [«FOR c:g.composedBy SEPARATOR ',\n'»«c.compile»«ENDFOR»]«ENDIF»
		}
	'''
	
	def compile(DependsOnGoal d)
	''' {
			"Type": «d.type»,
			"Value": "«d.refGoal.refGoal.name»«IF !d.refGoal.refs.empty»,«FOR r:d.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(ComposedBy c)
	''' {
			"Type": «c.type»,
			"Value": "«c.refGoal.refGoal.name»«IF !c.refGoal.refs.empty»,«FOR r:c.refGoal.refs SEPARATOR ','»«r.name»«ENDFOR»«ENDIF»"
		}
	'''
	
	def compile(PackageSystem g)
	'''
	'''
}