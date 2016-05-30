/*
 * generated by Xtext
 */
package rslingo.rslil.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import rslingo.rslil.rSLIL.ForeignKey
import rslingo.rslil.rSLIL.UseCase

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class RSLILScopeProvider extends AbstractDeclarativeScopeProvider {

	@Override
  	override IScope getScope(EObject context, EReference reference) {
//		System.out.println(
//			"scope_" + reference.getEContainingClass().getName()
//			+ "_" + reference.getName()
//			+ "(" + context.eClass().getName() + ", ..)"
//	 	);
	 	return super.getScope(context, reference);
  	}
  	
  	def IScope scope_RefAttribute_refAttr(ForeignKey ctx, EReference ref) {
        return Scopes.scopeFor(ctx.entity.attributes)
    }
	
	def IScope scope_RefAttribute_refs(ForeignKey ctx, EReference ref) {
        return Scopes.scopeFor(ctx.entity.attributes)
    }
    
    def IScope scope_UseCase_extPoint(UseCase ctx, EReference ref) {
        return Scopes.scopeFor(ctx.extends.extensionPoints)
    }
}
