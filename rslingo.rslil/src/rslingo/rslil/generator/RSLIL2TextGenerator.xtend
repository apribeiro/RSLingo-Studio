package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.Project
import rslingo.rslil.rSLIL.GlossaryTerm
import rslingo.rslil.rSLIL.System
import rslingo.rslil.rSLIL.Constraint
import rslingo.rslil.rSLIL.QR
import rslingo.rslil.rSLIL.FR
import rslingo.rslil.rSLIL.UseCase
import rslingo.rslil.rSLIL.Actor
import rslingo.rslil.rSLIL.Entity
import rslingo.rslil.rSLIL.Goal
import rslingo.rslil.rSLIL.Stakeholder
import rslingo.rslil.rSLIL.PackageProject
import rslingo.rslil.rSLIL.PackageSystem

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

	//----------------------------------------------------
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
	'''
	
	def compile(GlossaryTerm g)
	'''
	«g.name».«g.nameAlias»(«g.type»):
	«g.acronym»,
	«g.description»,
	«g.pos»,
	«g.synset»,
	«g.description»,
		//Term Relation
	'''
	
	def compile(Stakeholder s)
	'''
	'''
	
	def compile(Goal g)
	'''
	'''
	
	def compile(Entity e)
	'''
	'''
	
	def compile(Actor a)
	'''
	'''
	
	def compile(UseCase u)
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