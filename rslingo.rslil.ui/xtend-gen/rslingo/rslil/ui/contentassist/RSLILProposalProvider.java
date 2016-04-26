/**
 * generated by Xtext
 */
package rslingo.rslil.ui.contentassist;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.ui.contentassist.AbstractRSLILProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class RSLILProposalProvider extends AbstractRSLILProposalProvider {
  private final static Set<String> SUBTYPES = Sets.<String>newHashSet("Security.Privacy", 
    "Security.Integrity", "Usability.EaseOfUse", 
    "Usability.EaseOfLearn", "Usability.Accessibility");
  
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    String _value = keyword.getValue();
    boolean _contains = RSLILProposalProvider.SUBTYPES.contains(_value);
    if (_contains) {
      return;
    } else {
      super.completeKeyword(keyword, contentAssistContext, acceptor);
    }
  }
  
  @Override
  public void completeNFR_SubType(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String nfrType = ((NFR) model).getType();
    boolean _or = false;
    boolean _equals = nfrType.equals("Security");
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = nfrType.equals("Usability");
      _or = _equals_1;
    }
    if (_or) {
      AbstractElement _terminal = assignment.getTerminal();
      EList<AbstractElement> _elements = ((Alternatives) _terminal).getElements();
      final Consumer<AbstractElement> _function = (AbstractElement e) -> {
        String option = ((Keyword) e).getValue();
        boolean _contains = option.contains(nfrType);
        if (_contains) {
          ICompletionProposal _createCompletionProposal = this.createCompletionProposal(option, option, null, context);
          acceptor.accept(_createCompletionProposal);
        }
      };
      _elements.forEach(_function);
    } else {
      super.completeNFR_SubType(model, assignment, context, acceptor);
    }
  }
}
