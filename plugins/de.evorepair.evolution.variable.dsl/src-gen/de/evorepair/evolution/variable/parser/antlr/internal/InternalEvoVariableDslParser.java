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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoVariableDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature'", "'group'", "'value'", "'='", "'set'", "'('", "','", "')'", "'mapping'", "'configuration'", "'parentOf'", "'siblingOf'", "'childOf'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvoVariableDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoVariableDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoVariableDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoVariableDsl.g"; }



     	private EvoVariableDslGrammarAccess grammarAccess;

        public InternalEvoVariableDslParser(TokenStream input, EvoVariableDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EvoVariableModel";
       	}

       	@Override
       	protected EvoVariableDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEvoVariableModel"
    // InternalEvoVariableDsl.g:65:1: entryRuleEvoVariableModel returns [EObject current=null] : iv_ruleEvoVariableModel= ruleEvoVariableModel EOF ;
    public final EObject entryRuleEvoVariableModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableModel = null;


        try {
            // InternalEvoVariableDsl.g:65:57: (iv_ruleEvoVariableModel= ruleEvoVariableModel EOF )
            // InternalEvoVariableDsl.g:66:2: iv_ruleEvoVariableModel= ruleEvoVariableModel EOF
            {
             newCompositeNode(grammarAccess.getEvoVariableModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVariableModel=ruleEvoVariableModel();

            state._fsp--;

             current =iv_ruleEvoVariableModel; 
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
    // $ANTLR end "entryRuleEvoVariableModel"


    // $ANTLR start "ruleEvoVariableModel"
    // InternalEvoVariableDsl.g:72:1: ruleEvoVariableModel returns [EObject current=null] : ( (lv_variables_0_0= ruleEvoVariable ) )* ;
    public final EObject ruleEvoVariableModel() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:78:2: ( ( (lv_variables_0_0= ruleEvoVariable ) )* )
            // InternalEvoVariableDsl.g:79:2: ( (lv_variables_0_0= ruleEvoVariable ) )*
            {
            // InternalEvoVariableDsl.g:79:2: ( (lv_variables_0_0= ruleEvoVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==15||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    {
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    // InternalEvoVariableDsl.g:81:4: lv_variables_0_0= ruleEvoVariable
            	    {

            	    				newCompositeNode(grammarAccess.getEvoVariableModelAccess().getVariablesEvoVariableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleEvoVariable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEvoVariableModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"de.evorepair.evolution.variable.EvoVariableDsl.EvoVariable");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEvoVariableModel"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoVariableDsl.g:101:1: entryRuleEvoVariable returns [EObject current=null] : iv_ruleEvoVariable= ruleEvoVariable EOF ;
    public final EObject entryRuleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariable = null;


        try {
            // InternalEvoVariableDsl.g:101:52: (iv_ruleEvoVariable= ruleEvoVariable EOF )
            // InternalEvoVariableDsl.g:102:2: iv_ruleEvoVariable= ruleEvoVariable EOF
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
    // InternalEvoVariableDsl.g:108:1: ruleEvoVariable returns [EObject current=null] : (this_EvoConfigurationVariable_0= ruleEvoConfigurationVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable ) ;
    public final EObject ruleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoConfigurationVariable_0 = null;

        EObject this_EvoFeatureVariable_1 = null;

        EObject this_EvoGroupVariable_2 = null;

        EObject this_EvoSetVariable_3 = null;

        EObject this_EvoMappingVariable_4 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:114:2: ( (this_EvoConfigurationVariable_0= ruleEvoConfigurationVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable ) )
            // InternalEvoVariableDsl.g:115:2: (this_EvoConfigurationVariable_0= ruleEvoConfigurationVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable )
            {
            // InternalEvoVariableDsl.g:115:2: (this_EvoConfigurationVariable_0= ruleEvoConfigurationVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvoVariableDsl.g:116:3: this_EvoConfigurationVariable_0= ruleEvoConfigurationVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoConfigurationVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoConfigurationVariable_0=ruleEvoConfigurationVariable();

                    state._fsp--;


                    			current = this_EvoConfigurationVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:125:3: this_EvoFeatureVariable_1= ruleEvoFeatureVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoFeatureVariable_1=ruleEvoFeatureVariable();

                    state._fsp--;


                    			current = this_EvoFeatureVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:134:3: this_EvoGroupVariable_2= ruleEvoGroupVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoGroupVariable_2=ruleEvoGroupVariable();

                    state._fsp--;


                    			current = this_EvoGroupVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEvoVariableDsl.g:143:3: this_EvoSetVariable_3= ruleEvoSetVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetVariable_3=ruleEvoSetVariable();

                    state._fsp--;


                    			current = this_EvoSetVariable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEvoVariableDsl.g:152:3: this_EvoMappingVariable_4= ruleEvoMappingVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingVariable_4=ruleEvoMappingVariable();

                    state._fsp--;


                    			current = this_EvoMappingVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEvoVariable"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoVariableDsl.g:164:1: entryRuleEvoFeatureVariable returns [EObject current=null] : iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF ;
    public final EObject entryRuleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureVariable = null;


        try {
            // InternalEvoVariableDsl.g:164:59: (iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF )
            // InternalEvoVariableDsl.g:165:2: iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureVariable=ruleEvoFeatureVariable();

            state._fsp--;

             current =iv_ruleEvoFeatureVariable; 
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
    // $ANTLR end "entryRuleEvoFeatureVariable"


    // $ANTLR start "ruleEvoFeatureVariable"
    // InternalEvoVariableDsl.g:171:1: ruleEvoFeatureVariable returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:177:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoVariableDsl.g:179:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
            		
            // InternalEvoVariableDsl.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoFeatureVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEvoFeatureVariable"


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoVariableDsl.g:205:1: entryRuleEvoGroupVariable returns [EObject current=null] : iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF ;
    public final EObject entryRuleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupVariable = null;


        try {
            // InternalEvoVariableDsl.g:205:57: (iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF )
            // InternalEvoVariableDsl.g:206:2: iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoGroupVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGroupVariable=ruleEvoGroupVariable();

            state._fsp--;

             current =iv_ruleEvoGroupVariable; 
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
    // $ANTLR end "entryRuleEvoGroupVariable"


    // $ANTLR start "ruleEvoGroupVariable"
    // InternalEvoVariableDsl.g:212:1: ruleEvoGroupVariable returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:218:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )? ) )
            // InternalEvoVariableDsl.g:219:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )? )
            {
            // InternalEvoVariableDsl.g:219:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )? )
            // InternalEvoVariableDsl.g:220:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0());
            		
            // InternalEvoVariableDsl.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGroupVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:242:3: (otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvoVariableDsl.g:243:4: otherlv_2= 'value' otherlv_3= '=' ( (otherlv_4= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalEvoVariableDsl.g:251:4: ( (otherlv_4= RULE_STRING ) )
                    // InternalEvoVariableDsl.g:252:5: (otherlv_4= RULE_STRING )
                    {
                    // InternalEvoVariableDsl.g:252:5: (otherlv_4= RULE_STRING )
                    // InternalEvoVariableDsl.g:253:6: otherlv_4= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoGroupVariableRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleEvoGroupVariable"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalEvoVariableDsl.g:269:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalEvoVariableDsl.g:269:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalEvoVariableDsl.g:270:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoSetVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetVariable=ruleEvoSetVariable();

            state._fsp--;

             current =iv_ruleEvoSetVariable; 
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
    // $ANTLR end "entryRuleEvoSetVariable"


    // $ANTLR start "ruleEvoSetVariable"
    // InternalEvoVariableDsl.g:276:1: ruleEvoSetVariable returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:282:2: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) )
            // InternalEvoVariableDsl.g:283:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            {
            // InternalEvoVariableDsl.g:283:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            // InternalEvoVariableDsl.g:284:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetVariableAccess().getSetKeyword_0());
            		
            // InternalEvoVariableDsl.g:288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:289:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:290:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoSetVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:306:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:307:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:311:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEvoVariableDsl.g:312:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:312:5: (otherlv_3= RULE_ID )
                    // InternalEvoVariableDsl.g:313:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoSetVariableRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalEvoVariableDsl.g:324:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )
                    // InternalEvoVariableDsl.g:325:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0());
                    				
                    // InternalEvoVariableDsl.g:329:5: ( (otherlv_5= RULE_ID ) )
                    // InternalEvoVariableDsl.g:330:6: (otherlv_5= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:330:6: (otherlv_5= RULE_ID )
                    // InternalEvoVariableDsl.g:331:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEvoSetVariableRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(otherlv_5, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0());
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEvoSetVariable"


    // $ANTLR start "entryRuleEvoMappingVariable"
    // InternalEvoVariableDsl.g:352:1: entryRuleEvoMappingVariable returns [EObject current=null] : iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF ;
    public final EObject entryRuleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVariable = null;


        try {
            // InternalEvoVariableDsl.g:352:59: (iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF )
            // InternalEvoVariableDsl.g:353:2: iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingVariable=ruleEvoMappingVariable();

            state._fsp--;

             current =iv_ruleEvoMappingVariable; 
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
    // $ANTLR end "entryRuleEvoMappingVariable"


    // $ANTLR start "ruleEvoMappingVariable"
    // InternalEvoVariableDsl.g:359:1: ruleEvoMappingVariable returns [EObject current=null] : (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_mapping_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:365:2: ( (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) )
            // InternalEvoVariableDsl.g:366:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
            {
            // InternalEvoVariableDsl.g:366:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
            // InternalEvoVariableDsl.g:367:3: otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0());
            		
            // InternalEvoVariableDsl.g:371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:372:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:373:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:389:3: (otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:390:4: otherlv_2= '(' ( (lv_mapping_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:394:4: ( (lv_mapping_3_0= RULE_STRING ) )
                    // InternalEvoVariableDsl.g:395:5: (lv_mapping_3_0= RULE_STRING )
                    {
                    // InternalEvoVariableDsl.g:395:5: (lv_mapping_3_0= RULE_STRING )
                    // InternalEvoVariableDsl.g:396:6: lv_mapping_3_0= RULE_STRING
                    {
                    lv_mapping_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_mapping_3_0, grammarAccess.getEvoMappingVariableAccess().getMappingSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mapping",
                    							lv_mapping_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoMappingVariableAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEvoMappingVariable"


    // $ANTLR start "entryRuleEvoConfigurationVariable"
    // InternalEvoVariableDsl.g:421:1: entryRuleEvoConfigurationVariable returns [EObject current=null] : iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF ;
    public final EObject entryRuleEvoConfigurationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoConfigurationVariable = null;


        try {
            // InternalEvoVariableDsl.g:421:65: (iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF )
            // InternalEvoVariableDsl.g:422:2: iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoConfigurationVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoConfigurationVariable=ruleEvoConfigurationVariable();

            state._fsp--;

             current =iv_ruleEvoConfigurationVariable; 
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
    // $ANTLR end "entryRuleEvoConfigurationVariable"


    // $ANTLR start "ruleEvoConfigurationVariable"
    // InternalEvoVariableDsl.g:428:1: ruleEvoConfigurationVariable returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEvoConfigurationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_configuration_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:434:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) )
            // InternalEvoVariableDsl.g:435:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
            {
            // InternalEvoVariableDsl.g:435:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
            // InternalEvoVariableDsl.g:436:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0());
            		
            // InternalEvoVariableDsl.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoConfigurationVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoConfigurationVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:458:3: (otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:459:4: otherlv_2= '(' ( (lv_configuration_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoConfigurationVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:463:4: ( (lv_configuration_3_0= RULE_STRING ) )
                    // InternalEvoVariableDsl.g:464:5: (lv_configuration_3_0= RULE_STRING )
                    {
                    // InternalEvoVariableDsl.g:464:5: (lv_configuration_3_0= RULE_STRING )
                    // InternalEvoVariableDsl.g:465:6: lv_configuration_3_0= RULE_STRING
                    {
                    lv_configuration_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_configuration_3_0, grammarAccess.getEvoConfigurationVariableAccess().getConfigurationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoConfigurationVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"configuration",
                    							lv_configuration_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoConfigurationVariableAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEvoConfigurationVariable"


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoVariableDsl.g:490:1: ruleEvoFeatureVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) ) ;
    public final Enumerator ruleEvoFeatureVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:496:2: ( ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) ) )
            // InternalEvoVariableDsl.g:497:2: ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) )
            {
            // InternalEvoVariableDsl.g:497:2: ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEvoVariableDsl.g:498:3: (enumLiteral_0= 'parentOf' )
                    {
                    // InternalEvoVariableDsl.g:498:3: (enumLiteral_0= 'parentOf' )
                    // InternalEvoVariableDsl.g:499:4: enumLiteral_0= 'parentOf'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:506:3: (enumLiteral_1= 'siblingOf' )
                    {
                    // InternalEvoVariableDsl.g:506:3: (enumLiteral_1= 'siblingOf' )
                    // InternalEvoVariableDsl.g:507:4: enumLiteral_1= 'siblingOf'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:514:3: (enumLiteral_2= 'childOf' )
                    {
                    // InternalEvoVariableDsl.g:514:3: (enumLiteral_2= 'childOf' )
                    // InternalEvoVariableDsl.g:515:4: enumLiteral_2= 'childOf'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000189802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}