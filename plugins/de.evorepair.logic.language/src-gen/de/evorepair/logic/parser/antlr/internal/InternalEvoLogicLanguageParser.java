package de.evorepair.logic.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.evorepair.logic.services.EvoLogicLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoLogicLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'formula'", "'{'", "'variables'", "','", "'}'", "'term'", "'EvoVariableTerm'", "'variable'", "'afeature'", "'or'", "'||'", "'and'", "'&&'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvoLogicLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoLogicLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoLogicLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoLogicLanguage.g"; }



     	private EvoLogicLanguageGrammarAccess grammarAccess;

        public InternalEvoLogicLanguageParser(TokenStream input, EvoLogicLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CommandDocument";
       	}

       	@Override
       	protected EvoLogicLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCommandDocument"
    // InternalEvoLogicLanguage.g:64:1: entryRuleCommandDocument returns [EObject current=null] : iv_ruleCommandDocument= ruleCommandDocument EOF ;
    public final EObject entryRuleCommandDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandDocument = null;


        try {
            // InternalEvoLogicLanguage.g:64:56: (iv_ruleCommandDocument= ruleCommandDocument EOF )
            // InternalEvoLogicLanguage.g:65:2: iv_ruleCommandDocument= ruleCommandDocument EOF
            {
             newCompositeNode(grammarAccess.getCommandDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandDocument=ruleCommandDocument();

            state._fsp--;

             current =iv_ruleCommandDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandDocument"


    // $ANTLR start "ruleCommandDocument"
    // InternalEvoLogicLanguage.g:71:1: ruleCommandDocument returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_formula_1_0= ruleEvoFormula ) ) ) ;
    public final EObject ruleCommandDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_formula_1_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_formula_1_0= ruleEvoFormula ) ) ) )
            // InternalEvoLogicLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_formula_1_0= ruleEvoFormula ) ) )
            {
            // InternalEvoLogicLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_formula_1_0= ruleEvoFormula ) ) )
            // InternalEvoLogicLanguage.g:79:3: ( (lv_imports_0_0= ruleImport ) ) ( (lv_formula_1_0= ruleEvoFormula ) )
            {
            // InternalEvoLogicLanguage.g:79:3: ( (lv_imports_0_0= ruleImport ) )
            // InternalEvoLogicLanguage.g:80:4: (lv_imports_0_0= ruleImport )
            {
            // InternalEvoLogicLanguage.g:80:4: (lv_imports_0_0= ruleImport )
            // InternalEvoLogicLanguage.g:81:5: lv_imports_0_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getCommandDocumentAccess().getImportsImportParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_imports_0_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandDocumentRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_0_0,
            						"de.evorepair.logic.EvoLogicLanguage.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoLogicLanguage.g:98:3: ( (lv_formula_1_0= ruleEvoFormula ) )
            // InternalEvoLogicLanguage.g:99:4: (lv_formula_1_0= ruleEvoFormula )
            {
            // InternalEvoLogicLanguage.g:99:4: (lv_formula_1_0= ruleEvoFormula )
            // InternalEvoLogicLanguage.g:100:5: lv_formula_1_0= ruleEvoFormula
            {

            					newCompositeNode(grammarAccess.getCommandDocumentAccess().getFormulaEvoFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_1_0=ruleEvoFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandDocumentRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_1_0,
            						"de.evorepair.logic.EvoLogicLanguage.EvoFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandDocument"


    // $ANTLR start "entryRuleImport"
    // InternalEvoLogicLanguage.g:121:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEvoLogicLanguage.g:121:47: (iv_ruleImport= ruleImport EOF )
            // InternalEvoLogicLanguage.g:122:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEvoLogicLanguage.g:128:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:134:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalEvoLogicLanguage.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalEvoLogicLanguage.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalEvoLogicLanguage.g:136:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalEvoLogicLanguage.g:140:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalEvoLogicLanguage.g:141:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalEvoLogicLanguage.g:141:4: (lv_importURI_1_0= RULE_STRING )
            // InternalEvoLogicLanguage.g:142:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEvoFormula"
    // InternalEvoLogicLanguage.g:162:1: entryRuleEvoFormula returns [EObject current=null] : iv_ruleEvoFormula= ruleEvoFormula EOF ;
    public final EObject entryRuleEvoFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFormula = null;


        try {
            // InternalEvoLogicLanguage.g:162:51: (iv_ruleEvoFormula= ruleEvoFormula EOF )
            // InternalEvoLogicLanguage.g:163:2: iv_ruleEvoFormula= ruleEvoFormula EOF
            {
             newCompositeNode(grammarAccess.getEvoFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFormula=ruleEvoFormula();

            state._fsp--;

             current =iv_ruleEvoFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoFormula"


    // $ANTLR start "ruleEvoFormula"
    // InternalEvoLogicLanguage.g:169:1: ruleEvoFormula returns [EObject current=null] : (otherlv_0= 'formula' otherlv_1= '{' (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'term' ( (lv_term_9_0= ruleEvoAbstractTerm ) ) otherlv_10= '}' ) ;
    public final EObject ruleEvoFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variables_4_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_term_9_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:175:2: ( (otherlv_0= 'formula' otherlv_1= '{' (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'term' ( (lv_term_9_0= ruleEvoAbstractTerm ) ) otherlv_10= '}' ) )
            // InternalEvoLogicLanguage.g:176:2: (otherlv_0= 'formula' otherlv_1= '{' (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'term' ( (lv_term_9_0= ruleEvoAbstractTerm ) ) otherlv_10= '}' )
            {
            // InternalEvoLogicLanguage.g:176:2: (otherlv_0= 'formula' otherlv_1= '{' (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'term' ( (lv_term_9_0= ruleEvoAbstractTerm ) ) otherlv_10= '}' )
            // InternalEvoLogicLanguage.g:177:3: otherlv_0= 'formula' otherlv_1= '{' (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'term' ( (lv_term_9_0= ruleEvoAbstractTerm ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFormulaAccess().getFormulaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEvoLogicLanguage.g:185:3: (otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvoLogicLanguage.g:186:4: otherlv_2= 'variables' otherlv_3= '{' ( (lv_variables_4_0= ruleEvoVariable ) ) (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoFormulaAccess().getVariablesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoFormulaAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalEvoLogicLanguage.g:194:4: ( (lv_variables_4_0= ruleEvoVariable ) )
                    // InternalEvoLogicLanguage.g:195:5: (lv_variables_4_0= ruleEvoVariable )
                    {
                    // InternalEvoLogicLanguage.g:195:5: (lv_variables_4_0= ruleEvoVariable )
                    // InternalEvoLogicLanguage.g:196:6: lv_variables_4_0= ruleEvoVariable
                    {

                    						newCompositeNode(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_variables_4_0=ruleEvoVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoFormulaRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_4_0,
                    							"de.evorepair.logic.EvoLogicLanguage.EvoVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEvoLogicLanguage.g:213:4: (otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEvoLogicLanguage.g:214:5: otherlv_5= ',' ( (lv_variables_6_0= ruleEvoVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEvoFormulaAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalEvoLogicLanguage.g:218:5: ( (lv_variables_6_0= ruleEvoVariable ) )
                    	    // InternalEvoLogicLanguage.g:219:6: (lv_variables_6_0= ruleEvoVariable )
                    	    {
                    	    // InternalEvoLogicLanguage.g:219:6: (lv_variables_6_0= ruleEvoVariable )
                    	    // InternalEvoLogicLanguage.g:220:7: lv_variables_6_0= ruleEvoVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvoFormulaAccess().getVariablesEvoVariableParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_variables_6_0=ruleEvoVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvoFormulaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_6_0,
                    	    								"de.evorepair.logic.EvoLogicLanguage.EvoVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getEvoFormulaAccess().getTermKeyword_3());
            		
            // InternalEvoLogicLanguage.g:247:3: ( (lv_term_9_0= ruleEvoAbstractTerm ) )
            // InternalEvoLogicLanguage.g:248:4: (lv_term_9_0= ruleEvoAbstractTerm )
            {
            // InternalEvoLogicLanguage.g:248:4: (lv_term_9_0= ruleEvoAbstractTerm )
            // InternalEvoLogicLanguage.g:249:5: lv_term_9_0= ruleEvoAbstractTerm
            {

            					newCompositeNode(grammarAccess.getEvoFormulaAccess().getTermEvoAbstractTermParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_term_9_0=ruleEvoAbstractTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoFormulaRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_9_0,
            						"de.evorepair.logic.EvoLogicLanguage.EvoAbstractTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEvoFormulaAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoFormula"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoLogicLanguage.g:274:1: entryRuleEvoVariable returns [EObject current=null] : iv_ruleEvoVariable= ruleEvoVariable EOF ;
    public final EObject entryRuleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariable = null;


        try {
            // InternalEvoLogicLanguage.g:274:52: (iv_ruleEvoVariable= ruleEvoVariable EOF )
            // InternalEvoLogicLanguage.g:275:2: iv_ruleEvoVariable= ruleEvoVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVariable=ruleEvoVariable();

            state._fsp--;

             current =iv_ruleEvoVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoVariable"


    // $ANTLR start "ruleEvoVariable"
    // InternalEvoLogicLanguage.g:281:1: ruleEvoVariable returns [EObject current=null] : this_EvoArbitratyFeatureVariable_0= ruleEvoArbitratyFeatureVariable ;
    public final EObject ruleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoArbitratyFeatureVariable_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:287:2: (this_EvoArbitratyFeatureVariable_0= ruleEvoArbitratyFeatureVariable )
            // InternalEvoLogicLanguage.g:288:2: this_EvoArbitratyFeatureVariable_0= ruleEvoArbitratyFeatureVariable
            {

            		newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoArbitratyFeatureVariableParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoArbitratyFeatureVariable_0=ruleEvoArbitratyFeatureVariable();

            state._fsp--;


            		current = this_EvoArbitratyFeatureVariable_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoVariable"


    // $ANTLR start "entryRuleEvoVariableTerm"
    // InternalEvoLogicLanguage.g:299:1: entryRuleEvoVariableTerm returns [EObject current=null] : iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF ;
    public final EObject entryRuleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableTerm = null;


        try {
            // InternalEvoLogicLanguage.g:299:56: (iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF )
            // InternalEvoLogicLanguage.g:300:2: iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoVariableTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVariableTerm=ruleEvoVariableTerm();

            state._fsp--;

             current =iv_ruleEvoVariableTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoVariableTerm"


    // $ANTLR start "ruleEvoVariableTerm"
    // InternalEvoLogicLanguage.g:306:1: ruleEvoVariableTerm returns [EObject current=null] : (otherlv_0= 'EvoVariableTerm' otherlv_1= '{' otherlv_2= 'variable' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:312:2: ( (otherlv_0= 'EvoVariableTerm' otherlv_1= '{' otherlv_2= 'variable' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalEvoLogicLanguage.g:313:2: (otherlv_0= 'EvoVariableTerm' otherlv_1= '{' otherlv_2= 'variable' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalEvoLogicLanguage.g:313:2: (otherlv_0= 'EvoVariableTerm' otherlv_1= '{' otherlv_2= 'variable' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalEvoLogicLanguage.g:314:3: otherlv_0= 'EvoVariableTerm' otherlv_1= '{' otherlv_2= 'variable' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoVariableTermAccess().getEvoVariableTermKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoVariableTermAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoVariableTermAccess().getVariableKeyword_2());
            		
            // InternalEvoLogicLanguage.g:326:3: ( (otherlv_3= RULE_ID ) )
            // InternalEvoLogicLanguage.g:327:4: (otherlv_3= RULE_ID )
            {
            // InternalEvoLogicLanguage.g:327:4: (otherlv_3= RULE_ID )
            // InternalEvoLogicLanguage.g:328:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableTermRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoVariableTermAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoVariableTerm"


    // $ANTLR start "entryRuleEvoArbitratyFeatureVariable"
    // InternalEvoLogicLanguage.g:347:1: entryRuleEvoArbitratyFeatureVariable returns [EObject current=null] : iv_ruleEvoArbitratyFeatureVariable= ruleEvoArbitratyFeatureVariable EOF ;
    public final EObject entryRuleEvoArbitratyFeatureVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoArbitratyFeatureVariable = null;


        try {
            // InternalEvoLogicLanguage.g:347:68: (iv_ruleEvoArbitratyFeatureVariable= ruleEvoArbitratyFeatureVariable EOF )
            // InternalEvoLogicLanguage.g:348:2: iv_ruleEvoArbitratyFeatureVariable= ruleEvoArbitratyFeatureVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoArbitratyFeatureVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoArbitratyFeatureVariable=ruleEvoArbitratyFeatureVariable();

            state._fsp--;

             current =iv_ruleEvoArbitratyFeatureVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoArbitratyFeatureVariable"


    // $ANTLR start "ruleEvoArbitratyFeatureVariable"
    // InternalEvoLogicLanguage.g:354:1: ruleEvoArbitratyFeatureVariable returns [EObject current=null] : (otherlv_0= 'afeature' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEvoArbitratyFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:360:2: ( (otherlv_0= 'afeature' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEvoLogicLanguage.g:361:2: (otherlv_0= 'afeature' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEvoLogicLanguage.g:361:2: (otherlv_0= 'afeature' ( (otherlv_1= RULE_ID ) ) )
            // InternalEvoLogicLanguage.g:362:3: otherlv_0= 'afeature' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoArbitratyFeatureVariableAccess().getAfeatureKeyword_0());
            		
            // InternalEvoLogicLanguage.g:366:3: ( (otherlv_1= RULE_ID ) )
            // InternalEvoLogicLanguage.g:367:4: (otherlv_1= RULE_ID )
            {
            // InternalEvoLogicLanguage.g:367:4: (otherlv_1= RULE_ID )
            // InternalEvoLogicLanguage.g:368:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoArbitratyFeatureVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEvoArbitratyFeatureVariableAccess().getFeatureHyFeatureCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoArbitratyFeatureVariable"


    // $ANTLR start "entryRuleEvoAbstractTerm"
    // InternalEvoLogicLanguage.g:383:1: entryRuleEvoAbstractTerm returns [EObject current=null] : iv_ruleEvoAbstractTerm= ruleEvoAbstractTerm EOF ;
    public final EObject entryRuleEvoAbstractTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAbstractTerm = null;


        try {
            // InternalEvoLogicLanguage.g:383:56: (iv_ruleEvoAbstractTerm= ruleEvoAbstractTerm EOF )
            // InternalEvoLogicLanguage.g:384:2: iv_ruleEvoAbstractTerm= ruleEvoAbstractTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoAbstractTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAbstractTerm=ruleEvoAbstractTerm();

            state._fsp--;

             current =iv_ruleEvoAbstractTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAbstractTerm"


    // $ANTLR start "ruleEvoAbstractTerm"
    // InternalEvoLogicLanguage.g:390:1: ruleEvoAbstractTerm returns [EObject current=null] : this_EvoOr_0= ruleEvoOr ;
    public final EObject ruleEvoAbstractTerm() throws RecognitionException {
        EObject current = null;

        EObject this_EvoOr_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:396:2: (this_EvoOr_0= ruleEvoOr )
            // InternalEvoLogicLanguage.g:397:2: this_EvoOr_0= ruleEvoOr
            {

            		newCompositeNode(grammarAccess.getEvoAbstractTermAccess().getEvoOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoOr_0=ruleEvoOr();

            state._fsp--;


            		current = this_EvoOr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAbstractTerm"


    // $ANTLR start "entryRuleEvoOr"
    // InternalEvoLogicLanguage.g:408:1: entryRuleEvoOr returns [EObject current=null] : iv_ruleEvoOr= ruleEvoOr EOF ;
    public final EObject entryRuleEvoOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOr = null;


        try {
            // InternalEvoLogicLanguage.g:408:46: (iv_ruleEvoOr= ruleEvoOr EOF )
            // InternalEvoLogicLanguage.g:409:2: iv_ruleEvoOr= ruleEvoOr EOF
            {
             newCompositeNode(grammarAccess.getEvoOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoOr=ruleEvoOr();

            state._fsp--;

             current =iv_ruleEvoOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoOr"


    // $ANTLR start "ruleEvoOr"
    // InternalEvoLogicLanguage.g:415:1: ruleEvoOr returns [EObject current=null] : (this_EvoAnd_0= ruleEvoAnd ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )* ) ;
    public final EObject ruleEvoOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EvoAnd_0 = null;

        EObject lv_rightElement_4_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:421:2: ( (this_EvoAnd_0= ruleEvoAnd ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )* ) )
            // InternalEvoLogicLanguage.g:422:2: (this_EvoAnd_0= ruleEvoAnd ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )* )
            {
            // InternalEvoLogicLanguage.g:422:2: (this_EvoAnd_0= ruleEvoAnd ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )* )
            // InternalEvoLogicLanguage.g:423:3: this_EvoAnd_0= ruleEvoAnd ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_EvoAnd_0=ruleEvoAnd();

            state._fsp--;


            			current = this_EvoAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoLogicLanguage.g:431:3: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoLogicLanguage.g:432:4: () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_rightElement_4_0= ruleEvoAnd ) )
            	    {
            	    // InternalEvoLogicLanguage.g:432:4: ()
            	    // InternalEvoLogicLanguage.g:433:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoOrAccess().getEvoOrLeftElementAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEvoLogicLanguage.g:439:4: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==21) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==22) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalEvoLogicLanguage.g:440:5: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEvoOrAccess().getOrKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalEvoLogicLanguage.g:445:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            	            					newLeafNode(otherlv_3, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalEvoLogicLanguage.g:450:4: ( (lv_rightElement_4_0= ruleEvoAnd ) )
            	    // InternalEvoLogicLanguage.g:451:5: (lv_rightElement_4_0= ruleEvoAnd )
            	    {
            	    // InternalEvoLogicLanguage.g:451:5: (lv_rightElement_4_0= ruleEvoAnd )
            	    // InternalEvoLogicLanguage.g:452:6: lv_rightElement_4_0= ruleEvoAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoOrAccess().getRightElementEvoAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rightElement_4_0=ruleEvoAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightElement",
            	    							lv_rightElement_4_0,
            	    							"de.evorepair.logic.EvoLogicLanguage.EvoAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoOr"


    // $ANTLR start "entryRuleEvoAnd"
    // InternalEvoLogicLanguage.g:474:1: entryRuleEvoAnd returns [EObject current=null] : iv_ruleEvoAnd= ruleEvoAnd EOF ;
    public final EObject entryRuleEvoAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAnd = null;


        try {
            // InternalEvoLogicLanguage.g:474:47: (iv_ruleEvoAnd= ruleEvoAnd EOF )
            // InternalEvoLogicLanguage.g:475:2: iv_ruleEvoAnd= ruleEvoAnd EOF
            {
             newCompositeNode(grammarAccess.getEvoAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAnd=ruleEvoAnd();

            state._fsp--;

             current =iv_ruleEvoAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAnd"


    // $ANTLR start "ruleEvoAnd"
    // InternalEvoLogicLanguage.g:481:1: ruleEvoAnd returns [EObject current=null] : (this_EvoAbstractOneParameterTerm_0= ruleEvoAbstractOneParameterTerm ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )* ) ;
    public final EObject ruleEvoAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EvoAbstractOneParameterTerm_0 = null;

        EObject lv_rightElement_4_0 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:487:2: ( (this_EvoAbstractOneParameterTerm_0= ruleEvoAbstractOneParameterTerm ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )* ) )
            // InternalEvoLogicLanguage.g:488:2: (this_EvoAbstractOneParameterTerm_0= ruleEvoAbstractOneParameterTerm ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )* )
            {
            // InternalEvoLogicLanguage.g:488:2: (this_EvoAbstractOneParameterTerm_0= ruleEvoAbstractOneParameterTerm ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )* )
            // InternalEvoLogicLanguage.g:489:3: this_EvoAbstractOneParameterTerm_0= ruleEvoAbstractOneParameterTerm ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoAndAccess().getEvoAbstractOneParameterTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_EvoAbstractOneParameterTerm_0=ruleEvoAbstractOneParameterTerm();

            state._fsp--;


            			current = this_EvoAbstractOneParameterTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoLogicLanguage.g:497:3: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvoLogicLanguage.g:498:4: () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) )
            	    {
            	    // InternalEvoLogicLanguage.g:498:4: ()
            	    // InternalEvoLogicLanguage.g:499:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoAndAccess().getEvoAndLeftElementAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEvoLogicLanguage.g:505:4: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==23) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==24) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalEvoLogicLanguage.g:506:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEvoAndAccess().getAndKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalEvoLogicLanguage.g:511:5: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            	            					newLeafNode(otherlv_3, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalEvoLogicLanguage.g:516:4: ( (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm ) )
            	    // InternalEvoLogicLanguage.g:517:5: (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm )
            	    {
            	    // InternalEvoLogicLanguage.g:517:5: (lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm )
            	    // InternalEvoLogicLanguage.g:518:6: lv_rightElement_4_0= ruleEvoAbstractOneParameterTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEvoAndAccess().getRightElementEvoAbstractOneParameterTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_rightElement_4_0=ruleEvoAbstractOneParameterTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightElement",
            	    							lv_rightElement_4_0,
            	    							"de.evorepair.logic.EvoLogicLanguage.EvoAbstractOneParameterTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAnd"


    // $ANTLR start "entryRuleEvoAbstractOneParameterTerm"
    // InternalEvoLogicLanguage.g:540:1: entryRuleEvoAbstractOneParameterTerm returns [EObject current=null] : iv_ruleEvoAbstractOneParameterTerm= ruleEvoAbstractOneParameterTerm EOF ;
    public final EObject entryRuleEvoAbstractOneParameterTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAbstractOneParameterTerm = null;


        try {
            // InternalEvoLogicLanguage.g:540:68: (iv_ruleEvoAbstractOneParameterTerm= ruleEvoAbstractOneParameterTerm EOF )
            // InternalEvoLogicLanguage.g:541:2: iv_ruleEvoAbstractOneParameterTerm= ruleEvoAbstractOneParameterTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoAbstractOneParameterTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAbstractOneParameterTerm=ruleEvoAbstractOneParameterTerm();

            state._fsp--;

             current =iv_ruleEvoAbstractOneParameterTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvoAbstractOneParameterTerm"


    // $ANTLR start "ruleEvoAbstractOneParameterTerm"
    // InternalEvoLogicLanguage.g:547:1: ruleEvoAbstractOneParameterTerm returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' ) ) ;
    public final EObject ruleEvoAbstractOneParameterTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoOr_2 = null;



        	enterRule();

        try {
            // InternalEvoLogicLanguage.g:553:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' ) ) )
            // InternalEvoLogicLanguage.g:554:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' ) )
            {
            // InternalEvoLogicLanguage.g:554:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoLogicLanguage.g:555:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoVariableTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_0=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoLogicLanguage.g:564:3: (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' )
                    {
                    // InternalEvoLogicLanguage.g:564:3: (otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')' )
                    // InternalEvoLogicLanguage.g:565:4: otherlv_1= '(' this_EvoOr_2= ruleEvoOr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEvoAbstractOneParameterTermAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getEvoAbstractOneParameterTermAccess().getEvoOrParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_EvoOr_2=ruleEvoOr();

                    state._fsp--;


                    				current = this_EvoOr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoAbstractOneParameterTermAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvoAbstractOneParameterTerm"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}