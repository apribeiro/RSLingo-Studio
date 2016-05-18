package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.Model
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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RSLIL2TextGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className + '.txt',
			resource.allContents.filter(typeof(Model)).map[compile].join(' ')
		)
	}

	def className(Resource res) {
	    var name = res.URI.lastSegment
	    return name.substring(0, name.indexOf('.'))
	}

	//----------------------------------------------------
	def compile(Model model)
	'''
	Project
	----------------------------------------
	«model.project.compile»
	«IF !model.systems.empty»
	
	#Systems
	------------------
	«FOR s:model.systems»«s.compile»«ENDFOR»«ENDIF»
	«IF !model.glossaryTerms.empty»
	
	#Glossary
	------------------
	«FOR g:model.glossaryTerms»«g.compile»«ENDFOR»«ENDIF»
	«IF !model.stakeholders.empty»
	
	#Stakeholders
	------------------
	«FOR s:model.stakeholders»«s.compile»«ENDFOR»«ENDIF»
	«IF !model.goals.empty»
	
	#Goals
	------------------
	«FOR g:model.goals»«g.compile»«ENDFOR»«ENDIF»
	«IF !model.entities.empty»
	
	#Entities
	------------------
	«FOR e:model.entities»«e.compile»«ENDFOR»«ENDIF»
	«IF !model.actors.empty»
	
	#Actors
	------------------
	«FOR a:model.actors»«a.compile»«ENDFOR»«ENDIF»
	«IF !model.useCases.empty»
	
	#Use Cases
	------------------
	«FOR u:model.useCases»«u.compile»«ENDFOR»«ENDIF»
	«IF !model.frs.empty»
	
	#Functional Requirements
	--------------------------
	«FOR f:model.frs»«f.compile»«ENDFOR»«ENDIF»
	«IF !model.qrs.empty»
	
	#Quality Requirements
	-----------------------------
	«FOR n:model.qrs»«n.compile»«ENDFOR»«ENDIF»
	«IF !model.constraints.empty»
	
	#Constraints
	------------------
	«FOR c:model.constraints»«c.compile»«ENDFOR»«ENDIF»
	'''
	
	def compile(Project p)
	'''
	«p.name».«p.nameAlias»:
	«p.description»,
		«IF p.refSystem != null»HasSystems: «p.refSystem.refSystem.compileRefSystem»«FOR part:p.refSystem.refs», «part.compileRefSystem»«ENDFOR»,«ENDIF»
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