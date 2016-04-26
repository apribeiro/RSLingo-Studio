/*
 * generated by Xtext
 */
package rslingo.rslil.validation

import org.eclipse.xtext.validation.Check
import rslingo.rslil.rSLIL.NFR
import rslingo.rslil.rSLIL.RSLILPackage
import rslingo.rslil.rSLIL.UseCase
import rslingo.rslil.rSLIL.EntityType

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RSLILValidator extends AbstractRSLILValidator {

	@Check
	def checkNFRSubType(NFR nfr) {
		if (nfr.type.equals("Security") && nfr.subType != null) {
			if (!nfr.subType.equals("Security.Privacy")
				&& !nfr.subType.equals("Security.Integrity")) {
				error('A Non-FunctionalRequirement of type \'Security\' can only have the following sub-types: Security.Privacy or Security.Integrity.', RSLILPackage.Literals.NFR__SUB_TYPE)	
			}
		} else if (nfr.type.equals("Usability") && nfr.subType != null) {
			if (!nfr.subType.equals("Usability.EaseOfUse")
				&& !nfr.subType.equals("Usability.EaseOfLearn")
				&& !nfr.subType.equals("Usability.Accessibility")) {
				error('A Non-FunctionalRequirement of type \'Usability\' can only have the following sub-types: Usability.EaseOfUse, Usability.EaseOfLearn or Usability.Accessibility.', RSLILPackage.Literals.NFR__SUB_TYPE)	
			}
		}
		// TODO Don't allow Sub-Type when Type != of Security and Usability
	}
	
	@Check
	def checkUseCaseEntities(UseCase uc) {
		if (!uc.type.equals("Report")) {
			if (uc.entities == null) {
				error('A Use Case of type \'' + uc.type + '\' should be associated to an Entity with the role Master.', RSLILPackage.Literals.USE_CASE__ENTITIES)	
			} else {
				if (!uc.entities.type.type.equals("Master")) {
					if (uc.entities.refs.isEmpty()) {
						error('A Use Case of type \'' + uc.type + '\' should be associated to an Entity with the role Master.', RSLILPackage.Literals.USE_CASE__ENTITIES)		
					} else {
						var hasMaster = false
						
						for (EntityType type : uc.entities.refType) {
							if (type.type.equals("Master")) {
								hasMaster = true
							}
						}
						
						if (!hasMaster) {
							error('A Use Case of type \'' + uc.type + '\' should be associated to an Entity with the role Master.', RSLILPackage.Literals.USE_CASE__ENTITIES)	
						}
					}
				}
			}
		}
	}
}
