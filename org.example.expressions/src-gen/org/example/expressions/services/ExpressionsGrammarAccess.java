/*
* generated by Xtext
*/
package org.example.expressions.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ExpressionsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ExpressionsModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExpressionsModel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//ExpressionsModel:
		//	elements+=AbstractElement*;
		public ParserRule getRule() { return rule; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}

	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractElement:
		//	Variable | Expression;
		public ParserRule getRule() { return rule; }

		//Variable | Expression
		public Alternatives getAlternatives() { return cAlternatives; }

		//Variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//Variable:
		//	name=ID "=" expression=Expression;
		public ParserRule getRule() { return rule; }

		//name=ID "=" expression=Expression
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIntConstantAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cStringConstantAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cBoolConstantAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cValueAlternatives_2_1_0 = (Alternatives)cValueAssignment_2_1.eContents().get(0);
		private final Keyword cValueTrueKeyword_2_1_0_0 = (Keyword)cValueAlternatives_2_1_0.eContents().get(0);
		private final Keyword cValueFalseKeyword_2_1_0_1 = (Keyword)cValueAlternatives_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cVariableRefAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cVariableAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cVariableVariableCrossReference_3_1_0 = (CrossReference)cVariableAssignment_3_1.eContents().get(0);
		private final RuleCall cVariableVariableIDTerminalRuleCall_3_1_0_1 = (RuleCall)cVariableVariableCrossReference_3_1_0.eContents().get(1);
		
		//Expression:
		//	{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=("true" | "false") | {VariableRef}
		//	variable=[Variable];
		public ParserRule getRule() { return rule; }

		//{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=("true" | "false") | {VariableRef}
		//variable=[Variable]
		public Alternatives getAlternatives() { return cAlternatives; }

		//{IntConstant} value=INT
		public Group getGroup_0() { return cGroup_0; }

		//{IntConstant}
		public Action getIntConstantAction_0_0() { return cIntConstantAction_0_0; }

		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }

		//{StringConstant} value=STRING
		public Group getGroup_1() { return cGroup_1; }

		//{StringConstant}
		public Action getStringConstantAction_1_0() { return cStringConstantAction_1_0; }

		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }

		//{BoolConstant} value=("true" | "false")
		public Group getGroup_2() { return cGroup_2; }

		//{BoolConstant}
		public Action getBoolConstantAction_2_0() { return cBoolConstantAction_2_0; }

		//value=("true" | "false")
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//"true" | "false"
		public Alternatives getValueAlternatives_2_1_0() { return cValueAlternatives_2_1_0; }

		//"true"
		public Keyword getValueTrueKeyword_2_1_0_0() { return cValueTrueKeyword_2_1_0_0; }

		//"false"
		public Keyword getValueFalseKeyword_2_1_0_1() { return cValueFalseKeyword_2_1_0_1; }

		//{VariableRef} variable=[Variable]
		public Group getGroup_3() { return cGroup_3; }

		//{VariableRef}
		public Action getVariableRefAction_3_0() { return cVariableRefAction_3_0; }

		//variable=[Variable]
		public Assignment getVariableAssignment_3_1() { return cVariableAssignment_3_1; }

		//[Variable]
		public CrossReference getVariableVariableCrossReference_3_1_0() { return cVariableVariableCrossReference_3_1_0; }

		//ID
		public RuleCall getVariableVariableIDTerminalRuleCall_3_1_0_1() { return cVariableVariableIDTerminalRuleCall_3_1_0_1; }
	}
	
	
	private ExpressionsModelElements pExpressionsModel;
	private AbstractElementElements pAbstractElement;
	private VariableElements pVariable;
	private ExpressionElements pExpression;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ExpressionsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.example.expressions.Expressions".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ExpressionsModel:
	//	elements+=AbstractElement*;
	public ExpressionsModelElements getExpressionsModelAccess() {
		return (pExpressionsModel != null) ? pExpressionsModel : (pExpressionsModel = new ExpressionsModelElements());
	}
	
	public ParserRule getExpressionsModelRule() {
		return getExpressionsModelAccess().getRule();
	}

	//AbstractElement:
	//	Variable | Expression;
	public AbstractElementElements getAbstractElementAccess() {
		return (pAbstractElement != null) ? pAbstractElement : (pAbstractElement = new AbstractElementElements());
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}

	//Variable:
	//	name=ID "=" expression=Expression;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//Expression:
	//	{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=("true" | "false") | {VariableRef}
	//	variable=[Variable];
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
