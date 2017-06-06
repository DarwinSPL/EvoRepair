/*
 * generated by Xtext 2.11.0
 */
grammar InternalEvoVariableDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.evorepair.evolution.variable.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.evorepair.evolution.variable.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.evorepair.evolution.variable.services.EvoVariableDslGrammarAccess;

}

@parser::members {

 	private EvoVariableDslGrammarAccess grammarAccess;

    public InternalEvoVariableDslParser(TokenStream input, EvoVariableDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EvoVariableDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0());
			}
			lv_variables_0_0=ruleEvoVariable
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"variables",
					lv_variables_0_0,
					"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariable");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleEvoVariable
entryRuleEvoVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoVariableRule()); }
	iv_ruleEvoVariable=ruleEvoVariable
	{ $current=$iv_ruleEvoVariable.current; }
	EOF;

// Rule EvoVariable
ruleEvoVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoVariableAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='_'
			{
				newLeafNode(otherlv_2, grammarAccess.getEvoVariableAccess().get_Keyword_2_0());
			}
			(
				(
					lv_index_3_0=RULE_INT
					{
						newLeafNode(lv_index_3_0, grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvoVariableRule());
						}
						setWithLastConsumed(
							$current,
							"index",
							lv_index_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0());
				}
				lv_variableType_4_0=ruleEvoVariableType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvoVariableRule());
					}
					set(
						$current,
						"variableType",
						lv_variableType_4_0,
						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariableType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule EvoVariableType
ruleEvoVariableType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='@ident'
			{
				$current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='@pre'
			{
				$current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='@post'
			{
				$current = grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule EvoFeatureVariableType
ruleEvoFeatureVariableType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='parent'
			{
				$current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='source'
			{
				$current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='child'
			{
				$current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;