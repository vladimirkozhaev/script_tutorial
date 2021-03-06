/*
* generated by Xtext
*/
package org.example.expressions.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.example.expressions.services.ExpressionsGrammarAccess;

public class ExpressionsParser extends AbstractContentAssistParser {
	
	@Inject
	private ExpressionsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.example.expressions.ui.contentassist.antlr.internal.InternalExpressionsParser createParser() {
		org.example.expressions.ui.contentassist.antlr.internal.InternalExpressionsParser result = new org.example.expressions.ui.contentassist.antlr.internal.InternalExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0(), "rule__Atomic__ValueAlternatives_3_1_0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getExpressionsModelAccess().getElementsAssignment(), "rule__ExpressionsModel__ElementsAssignment");
					put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
					put(grammarAccess.getVariableAccess().getExpressionAssignment_2(), "rule__Variable__ExpressionAssignment_2");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_4_1(), "rule__Atomic__VariableAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.example.expressions.ui.contentassist.antlr.internal.InternalExpressionsParser typedParser = (org.example.expressions.ui.contentassist.antlr.internal.InternalExpressionsParser) parser;
			typedParser.entryRuleExpressionsModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
