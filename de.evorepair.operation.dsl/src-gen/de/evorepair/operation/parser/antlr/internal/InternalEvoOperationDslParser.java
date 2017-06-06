package de.evorepair.operation.parser.antlr.internal;

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
import de.evorepair.operation.services.EvoOperationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoOperationDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'operation'", "'{'", "'variables'", "':'", "'}'", "'timestamp'", "'var'", "'_'", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvoOperationDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoOperationDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoOperationDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoOperationDsl.g"; }



     	private EvoOperationDslGrammarAccess grammarAccess;

        public InternalEvoOperationDslParser(TokenStream input, EvoOperationDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GrammarEntry";
       	}

       	@Override
       	protected EvoOperationDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammarEntry"
    // InternalEvoOperationDsl.g:65:1: entryRuleGrammarEntry returns [EObject current=null] : iv_ruleGrammarEntry= ruleGrammarEntry EOF ;
    public final EObject entryRuleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarEntry = null;


        try {
            // InternalEvoOperationDsl.g:65:53: (iv_ruleGrammarEntry= ruleGrammarEntry EOF )
            // InternalEvoOperationDsl.g:66:2: iv_ruleGrammarEntry= ruleGrammarEntry EOF
            {
             newCompositeNode(grammarAccess.getGrammarEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammarEntry=ruleGrammarEntry();

            state._fsp--;

             current =iv_ruleGrammarEntry; 
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
    // $ANTLR end "entryRuleGrammarEntry"


    // $ANTLR start "ruleGrammarEntry"
    // InternalEvoOperationDsl.g:72:1: ruleGrammarEntry returns [EObject current=null] : ( (lv_container_0_0= ruleEvoOperationContainer ) ) ;
    public final EObject ruleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_container_0_0 = null;



        	enterRule();

        try {
            // InternalEvoOperationDsl.g:78:2: ( ( (lv_container_0_0= ruleEvoOperationContainer ) ) )
            // InternalEvoOperationDsl.g:79:2: ( (lv_container_0_0= ruleEvoOperationContainer ) )
            {
            // InternalEvoOperationDsl.g:79:2: ( (lv_container_0_0= ruleEvoOperationContainer ) )
            // InternalEvoOperationDsl.g:80:3: (lv_container_0_0= ruleEvoOperationContainer )
            {
            // InternalEvoOperationDsl.g:80:3: (lv_container_0_0= ruleEvoOperationContainer )
            // InternalEvoOperationDsl.g:81:4: lv_container_0_0= ruleEvoOperationContainer
            {

            				newCompositeNode(grammarAccess.getGrammarEntryAccess().getContainerEvoOperationContainerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_container_0_0=ruleEvoOperationContainer();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGrammarEntryRule());
            				}
            				set(
            					current,
            					"container",
            					lv_container_0_0,
            					"de.evorepair.operation.EvoOperationDsl.EvoOperationContainer");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleGrammarEntry"


    // $ANTLR start "entryRuleEvoOperationContainer"
    // InternalEvoOperationDsl.g:101:1: entryRuleEvoOperationContainer returns [EObject current=null] : iv_ruleEvoOperationContainer= ruleEvoOperationContainer EOF ;
    public final EObject entryRuleEvoOperationContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOperationContainer = null;


        try {
            // InternalEvoOperationDsl.g:101:62: (iv_ruleEvoOperationContainer= ruleEvoOperationContainer EOF )
            // InternalEvoOperationDsl.g:102:2: iv_ruleEvoOperationContainer= ruleEvoOperationContainer EOF
            {
             newCompositeNode(grammarAccess.getEvoOperationContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoOperationContainer=ruleEvoOperationContainer();

            state._fsp--;

             current =iv_ruleEvoOperationContainer; 
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
    // $ANTLR end "entryRuleEvoOperationContainer"


    // $ANTLR start "ruleEvoOperationContainer"
    // InternalEvoOperationDsl.g:108:1: ruleEvoOperationContainer returns [EObject current=null] : ( ( (lv_operations_0_0= ruleEvoOperation ) ) ( (lv_operations_1_0= ruleEvoOperation ) )* ) ;
    public final EObject ruleEvoOperationContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalEvoOperationDsl.g:114:2: ( ( ( (lv_operations_0_0= ruleEvoOperation ) ) ( (lv_operations_1_0= ruleEvoOperation ) )* ) )
            // InternalEvoOperationDsl.g:115:2: ( ( (lv_operations_0_0= ruleEvoOperation ) ) ( (lv_operations_1_0= ruleEvoOperation ) )* )
            {
            // InternalEvoOperationDsl.g:115:2: ( ( (lv_operations_0_0= ruleEvoOperation ) ) ( (lv_operations_1_0= ruleEvoOperation ) )* )
            // InternalEvoOperationDsl.g:116:3: ( (lv_operations_0_0= ruleEvoOperation ) ) ( (lv_operations_1_0= ruleEvoOperation ) )*
            {
            // InternalEvoOperationDsl.g:116:3: ( (lv_operations_0_0= ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:117:4: (lv_operations_0_0= ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:117:4: (lv_operations_0_0= ruleEvoOperation )
            // InternalEvoOperationDsl.g:118:5: lv_operations_0_0= ruleEvoOperation
            {

            					newCompositeNode(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_operations_0_0=ruleEvoOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoOperationContainerRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_0_0,
            						"de.evorepair.operation.EvoOperationDsl.EvoOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoOperationDsl.g:135:3: ( (lv_operations_1_0= ruleEvoOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:136:4: (lv_operations_1_0= ruleEvoOperation )
            	    {
            	    // InternalEvoOperationDsl.g:136:4: (lv_operations_1_0= ruleEvoOperation )
            	    // InternalEvoOperationDsl.g:137:5: lv_operations_1_0= ruleEvoOperation
            	    {

            	    					newCompositeNode(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_operations_1_0=ruleEvoOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvoOperationContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"de.evorepair.operation.EvoOperationDsl.EvoOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleEvoOperationContainer"


    // $ANTLR start "entryRuleEvoOperation"
    // InternalEvoOperationDsl.g:158:1: entryRuleEvoOperation returns [EObject current=null] : iv_ruleEvoOperation= ruleEvoOperation EOF ;
    public final EObject entryRuleEvoOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOperation = null;


        try {
            // InternalEvoOperationDsl.g:158:53: (iv_ruleEvoOperation= ruleEvoOperation EOF )
            // InternalEvoOperationDsl.g:159:2: iv_ruleEvoOperation= ruleEvoOperation EOF
            {
             newCompositeNode(grammarAccess.getEvoOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoOperation=ruleEvoOperation();

            state._fsp--;

             current =iv_ruleEvoOperation; 
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
    // $ANTLR end "entryRuleEvoOperation"


    // $ANTLR start "ruleEvoOperation"
    // InternalEvoOperationDsl.g:165:1: ruleEvoOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'variables' otherlv_4= ':' otherlv_5= '{' ( (lv_variables_6_0= ruleEvoVariable ) ) ( (lv_variables_7_0= ruleEvoVariable ) )* otherlv_8= '}' otherlv_9= 'timestamp' otherlv_10= ':' ( (lv_date_11_0= ruleDate ) ) otherlv_12= '}' ) ;
    public final EObject ruleEvoOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_variables_6_0 = null;

        EObject lv_variables_7_0 = null;

        AntlrDatatypeRuleToken lv_date_11_0 = null;



        	enterRule();

        try {
            // InternalEvoOperationDsl.g:171:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'variables' otherlv_4= ':' otherlv_5= '{' ( (lv_variables_6_0= ruleEvoVariable ) ) ( (lv_variables_7_0= ruleEvoVariable ) )* otherlv_8= '}' otherlv_9= 'timestamp' otherlv_10= ':' ( (lv_date_11_0= ruleDate ) ) otherlv_12= '}' ) )
            // InternalEvoOperationDsl.g:172:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'variables' otherlv_4= ':' otherlv_5= '{' ( (lv_variables_6_0= ruleEvoVariable ) ) ( (lv_variables_7_0= ruleEvoVariable ) )* otherlv_8= '}' otherlv_9= 'timestamp' otherlv_10= ':' ( (lv_date_11_0= ruleDate ) ) otherlv_12= '}' )
            {
            // InternalEvoOperationDsl.g:172:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'variables' otherlv_4= ':' otherlv_5= '{' ( (lv_variables_6_0= ruleEvoVariable ) ) ( (lv_variables_7_0= ruleEvoVariable ) )* otherlv_8= '}' otherlv_9= 'timestamp' otherlv_10= ':' ( (lv_date_11_0= ruleDate ) ) otherlv_12= '}' )
            // InternalEvoOperationDsl.g:173:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'variables' otherlv_4= ':' otherlv_5= '{' ( (lv_variables_6_0= ruleEvoVariable ) ) ( (lv_variables_7_0= ruleEvoVariable ) )* otherlv_8= '}' otherlv_9= 'timestamp' otherlv_10= ':' ( (lv_date_11_0= ruleDate ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoOperationAccess().getOperationKeyword_0());
            		
            // InternalEvoOperationDsl.g:177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoOperationDsl.g:178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoOperationDsl.g:178:4: (lv_name_1_0= RULE_ID )
            // InternalEvoOperationDsl.g:179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoOperationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoOperationAccess().getVariablesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoOperationAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEvoOperationDsl.g:211:3: ( (lv_variables_6_0= ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:212:4: (lv_variables_6_0= ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:212:4: (lv_variables_6_0= ruleEvoVariable )
            // InternalEvoOperationDsl.g:213:5: lv_variables_6_0= ruleEvoVariable
            {

            					newCompositeNode(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_variables_6_0=ruleEvoVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoOperationRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_6_0,
            						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoOperationDsl.g:230:3: ( (lv_variables_7_0= ruleEvoVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:231:4: (lv_variables_7_0= ruleEvoVariable )
            	    {
            	    // InternalEvoOperationDsl.g:231:4: (lv_variables_7_0= ruleEvoVariable )
            	    // InternalEvoOperationDsl.g:232:5: lv_variables_7_0= ruleEvoVariable
            	    {

            	    					newCompositeNode(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_variables_7_0=ruleEvoVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvoOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_7_0,
            	    						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEvoOperationAccess().getTimestampKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getEvoOperationAccess().getColonKeyword_10());
            		
            // InternalEvoOperationDsl.g:261:3: ( (lv_date_11_0= ruleDate ) )
            // InternalEvoOperationDsl.g:262:4: (lv_date_11_0= ruleDate )
            {
            // InternalEvoOperationDsl.g:262:4: (lv_date_11_0= ruleDate )
            // InternalEvoOperationDsl.g:263:5: lv_date_11_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getEvoOperationAccess().getDateDateParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_date_11_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoOperationRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_11_0,
            						"de.evorepair.operation.EvoOperationDsl.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleEvoOperation"


    // $ANTLR start "entryRuleDate"
    // InternalEvoOperationDsl.g:288:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalEvoOperationDsl.g:288:44: (iv_ruleDate= ruleDate EOF )
            // InternalEvoOperationDsl.g:289:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalEvoOperationDsl.g:295:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEvoOperationDsl.g:301:2: (this_STRING_0= RULE_STRING )
            // InternalEvoOperationDsl.g:302:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDateAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoOperationDsl.g:312:1: entryRuleEvoVariable returns [EObject current=null] : iv_ruleEvoVariable= ruleEvoVariable EOF ;
    public final EObject entryRuleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariable = null;


        try {
            // InternalEvoOperationDsl.g:312:52: (iv_ruleEvoVariable= ruleEvoVariable EOF )
            // InternalEvoOperationDsl.g:313:2: iv_ruleEvoVariable= ruleEvoVariable EOF
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
    // InternalEvoOperationDsl.g:319:1: ruleEvoVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) ) ;
    public final EObject ruleEvoVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Enumerator lv_variableType_4_0 = null;



        	enterRule();

        try {
            // InternalEvoOperationDsl.g:325:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) ) )
            // InternalEvoOperationDsl.g:326:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) )
            {
            // InternalEvoOperationDsl.g:326:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) ) )
            // InternalEvoOperationDsl.g:327:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) ) ( (lv_variableType_4_0= ruleEvoVariableType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoVariableAccess().getVarKeyword_0());
            		
            // InternalEvoOperationDsl.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoOperationDsl.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoOperationDsl.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalEvoOperationDsl.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoOperationDsl.g:349:3: (otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) ) )
            // InternalEvoOperationDsl.g:350:4: otherlv_2= '_' ( (lv_index_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoVariableAccess().get_Keyword_2_0());
            			
            // InternalEvoOperationDsl.g:354:4: ( (lv_index_3_0= RULE_INT ) )
            // InternalEvoOperationDsl.g:355:5: (lv_index_3_0= RULE_INT )
            {
            // InternalEvoOperationDsl.g:355:5: (lv_index_3_0= RULE_INT )
            // InternalEvoOperationDsl.g:356:6: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            						newLeafNode(lv_index_3_0, grammarAccess.getEvoVariableAccess().getIndexINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEvoVariableRule());
            						}
            						setWithLastConsumed(
            							current,
            							"index",
            							lv_index_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            // InternalEvoOperationDsl.g:373:3: ( (lv_variableType_4_0= ruleEvoVariableType ) )
            // InternalEvoOperationDsl.g:374:4: (lv_variableType_4_0= ruleEvoVariableType )
            {
            // InternalEvoOperationDsl.g:374:4: (lv_variableType_4_0= ruleEvoVariableType )
            // InternalEvoOperationDsl.g:375:5: lv_variableType_4_0= ruleEvoVariableType
            {

            					newCompositeNode(grammarAccess.getEvoVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_variableType_4_0=ruleEvoVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoVariableRule());
            					}
            					set(
            						current,
            						"variableType",
            						lv_variableType_4_0,
            						"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariableType");
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
    // $ANTLR end "ruleEvoVariable"


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoOperationDsl.g:396:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoOperationDsl.g:402:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalEvoOperationDsl.g:403:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalEvoOperationDsl.g:403:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEvoOperationDsl.g:404:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalEvoOperationDsl.g:404:3: (enumLiteral_0= '@ident' )
                    // InternalEvoOperationDsl.g:405:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:412:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalEvoOperationDsl.g:412:3: (enumLiteral_1= '@pre' )
                    // InternalEvoOperationDsl.g:413:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:420:3: (enumLiteral_2= '@post' )
                    {
                    // InternalEvoOperationDsl.g:420:3: (enumLiteral_2= '@post' )
                    // InternalEvoOperationDsl.g:421:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoVariableTypeAccess().getEvoTargetEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEvoVariableType"


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoOperationDsl.g:431:1: ruleEvoFeatureVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) ;
    public final Enumerator ruleEvoFeatureVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoOperationDsl.g:437:2: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) )
            // InternalEvoOperationDsl.g:438:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            {
            // InternalEvoOperationDsl.g:438:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEvoOperationDsl.g:439:3: (enumLiteral_0= 'parent' )
                    {
                    // InternalEvoOperationDsl.g:439:3: (enumLiteral_0= 'parent' )
                    // InternalEvoOperationDsl.g:440:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:447:3: (enumLiteral_1= 'source' )
                    {
                    // InternalEvoOperationDsl.g:447:3: (enumLiteral_1= 'source' )
                    // InternalEvoOperationDsl.g:448:4: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:455:3: (enumLiteral_2= 'child' )
                    {
                    // InternalEvoOperationDsl.g:455:3: (enumLiteral_2= 'child' )
                    // InternalEvoOperationDsl.g:456:4: enumLiteral_2= 'child'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEvoFeatureVariableType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000380000L});

}