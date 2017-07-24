/*
 * generated by Xtext 2.12.0
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

// Entry rule entryRuleEvoFeatureRelation
entryRuleEvoFeatureRelation
:
{ before(grammarAccess.getEvoFeatureRelationRule()); }
	 ruleEvoFeatureRelation
{ after(grammarAccess.getEvoFeatureRelationRule()); } 
	 EOF 
;

// Rule EvoFeatureRelation
ruleEvoFeatureRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoFeatureRelationAccess().getGroup()); }
		(rule__EvoFeatureRelation__Group__0)
		{ after(grammarAccess.getEvoFeatureRelationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoGroupVariable
entryRuleEvoGroupVariable
:
{ before(grammarAccess.getEvoGroupVariableRule()); }
	 ruleEvoGroupVariable
{ after(grammarAccess.getEvoGroupVariableRule()); } 
	 EOF 
;

// Rule EvoGroupVariable
ruleEvoGroupVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoGroupVariableAccess().getGroup()); }
		(rule__EvoGroupVariable__Group__0)
		{ after(grammarAccess.getEvoGroupVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoSetVariable
entryRuleEvoSetVariable
:
{ before(grammarAccess.getEvoSetVariableRule()); }
	 ruleEvoSetVariable
{ after(grammarAccess.getEvoSetVariableRule()); } 
	 EOF 
;

// Rule EvoSetVariable
ruleEvoSetVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoSetVariableAccess().getGroup()); }
		(rule__EvoSetVariable__Group__0)
		{ after(grammarAccess.getEvoSetVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoMappingVariable
entryRuleEvoMappingVariable
:
{ before(grammarAccess.getEvoMappingVariableRule()); }
	 ruleEvoMappingVariable
{ after(grammarAccess.getEvoMappingVariableRule()); } 
	 EOF 
;

// Rule EvoMappingVariable
ruleEvoMappingVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoMappingVariableAccess().getGroup()); }
		(rule__EvoMappingVariable__Group__0)
		{ after(grammarAccess.getEvoMappingVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvoConfigurationVariable
entryRuleEvoConfigurationVariable
:
{ before(grammarAccess.getEvoConfigurationVariableRule()); }
	 ruleEvoConfigurationVariable
{ after(grammarAccess.getEvoConfigurationVariableRule()); } 
	 EOF 
;

// Rule EvoConfigurationVariable
ruleEvoConfigurationVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); }
		(rule__EvoConfigurationVariable__Group__0)
		{ after(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
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
		{ before(grammarAccess.getEvoVariableAccess().getEvoConfigurationVariableParserRuleCall_0()); }
		ruleEvoConfigurationVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoConfigurationVariableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); }
		ruleEvoFeatureVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2()); }
		ruleEvoGroupVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3()); }
		ruleEvoSetVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4()); }
		ruleEvoMappingVariable
		{ after(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4()); }
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
		('parentOf')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); }
		('siblingOf')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); }
		('childOf')
		{ after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); }
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
	rule__EvoFeatureVariable__Group__3
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
	{ before(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); }
	(rule__EvoFeatureVariable__RelationAssignment_2)?
	{ after(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); }
	(rule__EvoFeatureVariable__Group_3__0)?
	{ after(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoFeatureVariable__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group_3__0__Impl
	rule__EvoFeatureVariable__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getReferenceKeyword_3_0()); }
	'reference'
	{ after(grammarAccess.getEvoFeatureVariableAccess().getReferenceKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group_3__1__Impl
	rule__EvoFeatureVariable__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getColonKeyword_3_1()); }
	':'
	{ after(grammarAccess.getEvoFeatureVariableAccess().getColonKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureVariable__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); }
	(rule__EvoFeatureVariable__FeatureAssignment_3_2)
	{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoFeatureRelation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group__0__Impl
	rule__EvoFeatureRelation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); }
	(rule__EvoFeatureRelation__FeatureTypeAssignment_0)
	{ after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group__1__Impl
	rule__EvoFeatureRelation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group__2__Impl
	rule__EvoFeatureRelation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); }
	(rule__EvoFeatureRelation__RelatedFeaturesAssignment_2)
	{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group__3__Impl
	rule__EvoFeatureRelation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); }
	(rule__EvoFeatureRelation__Group_3__0)?
	{ after(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoFeatureRelation__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group_3__0__Impl
	rule__EvoFeatureRelation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoFeatureRelation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); }
	(rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1)
	{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoGroupVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group__0__Impl
	rule__EvoGroupVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); }
	'group'
	{ after(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group__1__Impl
	rule__EvoGroupVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); }
	(rule__EvoGroupVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); }
	(rule__EvoGroupVariable__Group_2__0)?
	{ after(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoGroupVariable__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group_2__0__Impl
	rule__EvoGroupVariable__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); }
	'value'
	{ after(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group_2__1__Impl
	rule__EvoGroupVariable__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); }
	'='
	{ after(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoGroupVariable__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); }
	(rule__EvoGroupVariable__GroupAssignment_2_2)
	{ after(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoSetVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group__0__Impl
	rule__EvoSetVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); }
	'set'
	{ after(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group__1__Impl
	rule__EvoSetVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); }
	(rule__EvoSetVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); }
	(rule__EvoSetVariable__Group_2__0)?
	{ after(grammarAccess.getEvoSetVariableAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoSetVariable__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2__0__Impl
	rule__EvoSetVariable__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2__1__Impl
	rule__EvoSetVariable__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); }
	(rule__EvoSetVariable__ElementsAssignment_2_1)
	{ after(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2__2__Impl
	rule__EvoSetVariable__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); }
	(rule__EvoSetVariable__Group_2_2__0)
	{ after(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoSetVariable__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2_2__0__Impl
	rule__EvoSetVariable__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoSetVariable__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); }
	(rule__EvoSetVariable__ElementsAssignment_2_2_1)
	{ after(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoMappingVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoMappingVariable__Group__0__Impl
	rule__EvoMappingVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoMappingVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); }
	'mapping'
	{ after(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoMappingVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoMappingVariable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoMappingVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); }
	(rule__EvoMappingVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvoConfigurationVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoConfigurationVariable__Group__0__Impl
	rule__EvoConfigurationVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoConfigurationVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); }
	'configuration'
	{ after(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoConfigurationVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvoConfigurationVariable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoConfigurationVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); }
	(rule__EvoConfigurationVariable__NameAssignment_1)
	{ after(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
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

rule__EvoFeatureVariable__RelationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); }
		ruleEvoFeatureRelation
		{ after(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureVariable__FeatureAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); }
		(
			{ before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_3_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_3_2_0_1()); }
		)
		{ after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__FeatureTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); }
		ruleEvoFeatureVariableType
		{ after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__RelatedFeaturesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); }
		(
			{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoGroupVariable__GroupAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__ElementsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoSetVariable__ElementsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoMappingVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvoConfigurationVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvoConfigurationVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvoConfigurationVariableAccess().getNameIDTerminalRuleCall_1_0()); }
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
