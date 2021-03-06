/**
 * generated by Xtext
 */
package rslingo.rslil.ui.contentassist;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.ui.contentassist.AbstractRSLILProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class RSLILProposalProvider extends AbstractRSLILProposalProvider {
  private final static Set<String> SUBTYPES = Sets.<String>newHashSet("Security.Privacy", 
    "Security.Integrity", "Usability.EaseOfUse", 
    "Usability.EaseOfLearn", "Usability.Accessibility", 
    "Usability.Understandability", "Usability.Learnability", 
    "Usability.Attractiveness", "Efficiency.ResourceUse");
  
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
  public void complete_ID(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    if (((!(model instanceof Scenario)) && (!(model instanceof Step)))) {
      super.complete_ID(model, ruleCall, context, acceptor);
    }
  }
  
  @Override
  public void completeStep_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    if ((model instanceof Scenario)) {
      Scenario scenario = ((Scenario) model);
      String stepName = this.getStepName(scenario, null);
      Image _image = this.getImage(model);
      ICompletionProposal _createCompletionProposal = this.createCompletionProposal(stepName, stepName, _image, context);
      acceptor.accept(_createCompletionProposal);
    } else {
      if ((model instanceof Step)) {
        final Step step = ((Step) model);
        EObject _eContainer = step.eContainer();
        Scenario scenario_1 = ((Scenario) _eContainer);
        String stepName_1 = this.getStepName(scenario_1, step);
        Image _image_1 = this.getImage(model);
        ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal(stepName_1, stepName_1, _image_1, context);
        acceptor.accept(_createCompletionProposal_1);
      }
    }
  }
  
  @Override
  public void completeQR_SubType(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String qrType = ((QR) model).getType();
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = qrType.equals("Security");
    if (_equals) {
      _or_1 = true;
    } else {
      boolean _equals_1 = qrType.equals("Usability");
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_2 = qrType.equals("Efficiency");
      _or = _equals_2;
    }
    if (_or) {
      AbstractElement _terminal = assignment.getTerminal();
      EList<AbstractElement> _elements = ((Alternatives) _terminal).getElements();
      final Consumer<AbstractElement> _function = (AbstractElement e) -> {
        String option = ((Keyword) e).getValue();
        boolean _contains = option.contains(qrType);
        if (_contains) {
          Image _image = this.getImage(model);
          ICompletionProposal _createCompletionProposal = this.createCompletionProposal(option, option, _image, context);
          acceptor.accept(_createCompletionProposal);
        }
      };
      _elements.forEach(_function);
    } else {
      super.completeQR_SubType(model, assignment, context, acceptor);
    }
  }
  
  private String getStepName(final Scenario scenario, final Step step) {
    String stepName = "s";
    boolean _notEquals = (!Objects.equal(step, null));
    if (_notEquals) {
      EList<Step> _steps = scenario.getSteps();
      int _size = _steps.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        EList<Step> _steps_1 = scenario.getSteps();
        Step _last = IterableExtensions.<Step>last(_steps_1);
        boolean _equals = _last.equals(step);
        boolean _not = (!_equals);
        if (_not) {
          String _stepName = stepName;
          EList<Step> _steps_2 = scenario.getSteps();
          Step _last_1 = IterableExtensions.<Step>last(_steps_2);
          String _name = _last_1.getName();
          String[] _split = _name.split("s");
          String _get = _split[1];
          int _parseInt = Integer.parseInt(_get);
          int _plus = (_parseInt + 1);
          stepName = (_stepName + Integer.valueOf(_plus));
        } else {
          EList<Step> _steps_3 = scenario.getSteps();
          EList<Step> _steps_4 = scenario.getSteps();
          int _size_1 = _steps_4.size();
          int _minus = (_size_1 - 2);
          Step last = _steps_3.get(_minus);
          String _stepName_1 = stepName;
          String _name_1 = last.getName();
          String[] _split_1 = _name_1.split("s");
          String _get_1 = _split_1[1];
          int _parseInt_1 = Integer.parseInt(_get_1);
          int _plus_1 = (_parseInt_1 + 1);
          stepName = (_stepName_1 + Integer.valueOf(_plus_1));
        }
      } else {
        String _stepName_2 = stepName;
        stepName = (_stepName_2 + Integer.valueOf(1));
      }
    } else {
      EList<Step> _steps_5 = scenario.getSteps();
      int _size_2 = _steps_5.size();
      boolean _greaterThan_1 = (_size_2 > 0);
      if (_greaterThan_1) {
        String _stepName_3 = stepName;
        EList<Step> _steps_6 = scenario.getSteps();
        Step _last_2 = IterableExtensions.<Step>last(_steps_6);
        String _name_2 = _last_2.getName();
        String[] _split_2 = _name_2.split("s");
        String _get_2 = _split_2[1];
        int _parseInt_2 = Integer.parseInt(_get_2);
        int _plus_2 = (_parseInt_2 + 1);
        stepName = (_stepName_3 + Integer.valueOf(_plus_2));
      } else {
        String _stepName_4 = stepName;
        stepName = (_stepName_4 + Integer.valueOf(1));
      }
    }
    return stepName;
  }
}
