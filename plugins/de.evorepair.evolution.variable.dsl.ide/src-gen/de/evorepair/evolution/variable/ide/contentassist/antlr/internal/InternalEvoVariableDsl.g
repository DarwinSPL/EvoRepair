/*
 * generated by Xtext 2.11.0
 */
grammar InternalEvoVariableDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.evorepair.evolution.variable.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.evorepair.evolution.variable.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.evorepair.evolution.variable.services.EvoVariableDslGrammarAccess;

}
@parser::members {
	private EvoVariableDslGrammarAccess grammarAccess;

	public void setGrammarAccess(EvoVariableDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getVariablesAssignment()); }
		(rule__Model__VariablesAssignment)*
		{ after(grammarAccess.getModelAccess().getVariablesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoVariable
entryRuleEvoVariable
:
{ before(grammarAccess.getEvoVariableRule()); }
	 ruleEvoVariable
{ after(grammarAccess.getEvoVariableRule()); } 
	 EOF 
;

// Rule EvoVariable
ruleEvoVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoVariableAccess().getAlternatives()); }
		(rule__EvoVariable__Alternatives)
		{ after(grammarAccess.getEvoVariableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoGenericVariable
entryRuleEvoGenericVariable
:
{ before(grammarAccess.getEvoGenericVariableRule()); }
	 ruleEvoGenericVariable
{ after(grammarAccess.getEvoGenericVariableRule()); } 
	 EOF 
;

// Rule EvoGenericVariable
ruleEvoGenericVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoGenericVariableAccess().getGroup()); }
		(rule__EvoGenericVariable__Group__0)
		{ after(grammarAccess.getEvoGenericVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoFeatureVariable
entryRuleEvoFeatureVariable
:
{ before(grammarAccess.getEvoFeatureVariableRule()); }
	 ruleEvoFeatureVariable
{ after(grammarAccess.getEvoFeatureVariableRule()); } 
	 EOF 
;

// Rule EvoFeatureVariable
ruleEvoFeatureVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); }
		(rule__EvoFeatureVariable__Group__0)
		{ after(grammarAccess.getEvoFeatureVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EvoVariableType
ruleEvoVariableType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); }
		(rule__EvoVariableType__Alternatives)
		{ after(grammarAccess.getEvoVariableTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EvoFeatureVariableType
ruleEvoFeatureVariableType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); }
		(rule__EvoFeatureVariableType__Alternatives)
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoVariable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0()); }
		ruleEvoGenericVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); }
		ruleEvoFeatureVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoVariableType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); }
		('@ident')
		{ after(grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); }
		('@pre')
		{ after(grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); }
		('@post')
		{ after(grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariableType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); }
		('parent')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); }
		('source')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); }
		('child')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGenericVariable__Group__0__Impl
	rule__EvoGenericVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGenericVariable__Group__1__Impl
	rule__EvoGenericVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); }
	(rule__EvoGenericVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoGenericVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGenericVariable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); }
	(rule__EvoGenericVariable__VariableTypeAssignment_2)
	{ after(grammarAccess.getEvoGenericVariableAccess().getVariableTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoFeatureVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group__0__Impl
	rule__EvoFeatureVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); }
	'feature'
	{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group__1__Impl
	rule__EvoFeatureVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); }
	(rule__EvoFeatureVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); }
	(rule__EvoFeatureVariable__Group_2__0)?
	{ after(grammarAccess.getEvoFeatureVariableAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoFeatureVariable__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group_2__0__Impl
	rule__EvoFeatureVariable__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); }
	'.'
	{ after(grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); }
	(rule__EvoFeatureVariable__FeatureTypeAssignment_2_1)
	{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__VariablesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0()); }
		ruleEvoVariable
		{ after(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGenericVariable__VariableTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0()); }
		ruleEvoVariableType
		{ after(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__FeatureTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0()); }
		ruleEvoFeatureVariableType
		{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
