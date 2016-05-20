package rslingo.rslil.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil.rSLIL.PackageProject

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
		
	}
	'''
}