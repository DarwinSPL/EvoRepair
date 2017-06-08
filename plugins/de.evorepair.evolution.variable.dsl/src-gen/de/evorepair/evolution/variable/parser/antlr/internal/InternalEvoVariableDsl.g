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
		{
			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0());
		}
		this_EvoGenericVariable_0=ruleEvoGenericVariable
		{
			$current = $this_EvoGenericVariable_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1());
		}
		this_EvoFeatureVariable_1=ruleEvoFeatureVariable
		{
			$current = $this_EvoFeatureVariable_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2());
		}
		this_EvoGroupVariable_2=ruleEvoGroupVariable
		{
			$current = $this_EvoGroupVariable_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3());
		}
		this_EvoSetVariable_3=ruleEvoSetVariable
		{
			$current = $this_EvoSetVariable_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4());
		}
		this_EvoMappingVariable_4=ruleEvoMappingVariable
		{
			$current = $this_EvoMappingVariable_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEvoGenericVariable
entryRuleEvoGenericVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoGenericVariableRule()); }
	iv_ruleEvoGenericVariable=ruleEvoGenericVariable
	{ $current=$iv_ruleEvoGenericVariable.current; }
	EOF;

// Rule EvoGenericVariable
ruleEvoGenericVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoGenericVariableRule());
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
			(
				{
					newCompositeNode(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0());
				}
				lv_variableType_2_0=ruleEvoVariableType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvoGenericVariableRule());
					}
					set(
						$current,
						"variableType",
						lv_variableType_2_0,
						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariableType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEvoFeatureVariable
entryRuleEvoFeatureVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoFeatureVariableRule()); }
	iv_ruleEvoFeatureVariable=ruleEvoFeatureVariable
	{ $current=$iv_ruleEvoFeatureVariable.current; }
	EOF;

// Rule EvoFeatureVariable
ruleEvoFeatureVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='feature'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoFeatureVariableRule());
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
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0());
					}
					lv_featureType_3_0=ruleEvoFeatureVariableType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEvoFeatureVariableRule());
						}
						set(
							$current,
							"featureType",
							lv_featureType_3_0,
							"de.evorepair.evolution.variable.EvoVariableDsl.EvoFeatureVariableType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEvoGroupVariable
entryRuleEvoGroupVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoGroupVariableRule()); }
	iv_ruleEvoGroupVariable=ruleEvoGroupVariable
	{ $current=$iv_ruleEvoGroupVariable.current; }
	EOF;

// Rule EvoGroupVariable
ruleEvoGroupVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='group'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoGroupVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEvoSetVariable
entryRuleEvoSetVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoSetVariableRule()); }
	iv_ruleEvoSetVariable=ruleEvoSetVariable
	{ $current=$iv_ruleEvoSetVariable.current; }
	EOF;

// Rule EvoSetVariable
ruleEvoSetVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoSetVariableAccess().getSetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoSetVariableRule());
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
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvoSetVariableRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0());
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEvoSetVariableRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0());
						}
					)
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleEvoMappingVariable
entryRuleEvoMappingVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvoMappingVariableRule()); }
	iv_ruleEvoMappingVariable=ruleEvoMappingVariable
	{ $current=$iv_ruleEvoMappingVariable.current; }
	EOF;

// Rule EvoMappingVariable
ruleEvoMappingVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mapping'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvoMappingVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
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
