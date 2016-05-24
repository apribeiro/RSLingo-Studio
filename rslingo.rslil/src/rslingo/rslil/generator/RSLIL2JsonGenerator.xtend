package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.PackageProject
import rslingo.rslil.rSLIL.GlossaryTerm
import rslingo.rslil.rSLIL.Stakeholder
import rslingo.rslil.rSLIL.Goal
import rslingo.rslil.rSLIL.PackageSystem

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
		"name": "«packageProject.project.name»",
		"description": "«packageProject.project.description»",
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
	'''
	'''
	
	def compile(Stakeholder s)
	'''
	'''
	
	def compile(Goal g)
	'''
	'''
	
	def compile(PackageSystem g)
	'''
	'''
}