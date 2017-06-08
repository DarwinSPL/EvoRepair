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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'feature'", "'.'", "'group'", "'set'", "'('", "','", "')'", "'mapping'", "'@ident'", "'@pre'", "'@post'", "'parent'", "'source'", "'child'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
        	return "Model";
       	}

       	@Override
       	protected EvoVariableDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEvoVariableDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEvoVariableDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEvoVariableDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvoVariableDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_variables_0_0= ruleEvoVariable ) )* ;
    public final EObject ruleModel() throws RecognitionException {
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=15)||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    {
            	    // InternalEvoVariableDsl.g:80:3: (lv_variables_0_0= ruleEvoVariable )
            	    // InternalEvoVariableDsl.g:81:4: lv_variables_0_0= ruleEvoVariable
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVariablesEvoVariableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleEvoVariable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


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
    // InternalEvoVariableDsl.g:108:1: ruleEvoVariable returns [EObject current=null] : (this_EvoGenericVariable_0= ruleEvoGenericVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable ) ;
    public final EObject ruleEvoVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoGenericVariable_0 = null;

        EObject this_EvoFeatureVariable_1 = null;

        EObject this_EvoGroupVariable_2 = null;

        EObject this_EvoSetVariable_3 = null;

        EObject this_EvoMappingVariable_4 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:114:2: ( (this_EvoGenericVariable_0= ruleEvoGenericVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable ) )
            // InternalEvoVariableDsl.g:115:2: (this_EvoGenericVariable_0= ruleEvoGenericVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable )
            {
            // InternalEvoVariableDsl.g:115:2: (this_EvoGenericVariable_0= ruleEvoGenericVariable | this_EvoFeatureVariable_1= ruleEvoFeatureVariable | this_EvoGroupVariable_2= ruleEvoGroupVariable | this_EvoSetVariable_3= ruleEvoSetVariable | this_EvoMappingVariable_4= ruleEvoMappingVariable )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalEvoVariableDsl.g:116:3: this_EvoGenericVariable_0= ruleEvoGenericVariable
                    {

                    			newCompositeNode(grammarAccess.getEvoVariableAccess().getEvoGenericVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoGenericVariable_0=ruleEvoGenericVariable();

                    state._fsp--;


                    			current = this_EvoGenericVariable_0;
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


    // $ANTLR start "entryRuleEvoGenericVariable"
    // InternalEvoVariableDsl.g:164:1: entryRuleEvoGenericVariable returns [EObject current=null] : iv_ruleEvoGenericVariable= ruleEvoGenericVariable EOF ;
    public final EObject entryRuleEvoGenericVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGenericVariable = null;


        try {
            // InternalEvoVariableDsl.g:164:59: (iv_ruleEvoGenericVariable= ruleEvoGenericVariable EOF )
            // InternalEvoVariableDsl.g:165:2: iv_ruleEvoGenericVariable= ruleEvoGenericVariable EOF
            {
             newCompositeNode(grammarAccess.getEvoGenericVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGenericVariable=ruleEvoGenericVariable();

            state._fsp--;

             current =iv_ruleEvoGenericVariable; 
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
    // $ANTLR end "entryRuleEvoGenericVariable"


    // $ANTLR start "ruleEvoGenericVariable"
    // InternalEvoVariableDsl.g:171:1: ruleEvoGenericVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variableType_2_0= ruleEvoVariableType ) ) ) ;
    public final EObject ruleEvoGenericVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_variableType_2_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:177:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variableType_2_0= ruleEvoVariableType ) ) ) )
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variableType_2_0= ruleEvoVariableType ) ) )
            {
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variableType_2_0= ruleEvoVariableType ) ) )
            // InternalEvoVariableDsl.g:179:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variableType_2_0= ruleEvoVariableType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoGenericVariableAccess().getVarKeyword_0());
            		
            // InternalEvoVariableDsl.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoGenericVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGenericVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvoVariableDsl.g:201:3: ( (lv_variableType_2_0= ruleEvoVariableType ) )
            // InternalEvoVariableDsl.g:202:4: (lv_variableType_2_0= ruleEvoVariableType )
            {
            // InternalEvoVariableDsl.g:202:4: (lv_variableType_2_0= ruleEvoVariableType )
            // InternalEvoVariableDsl.g:203:5: lv_variableType_2_0= ruleEvoVariableType
            {

            					newCompositeNode(grammarAccess.getEvoGenericVariableAccess().getVariableTypeEvoVariableTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_variableType_2_0=ruleEvoVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoGenericVariableRule());
            					}
            					set(
            						current,
            						"variableType",
            						lv_variableType_2_0,
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
    // $ANTLR end "ruleEvoGenericVariable"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoVariableDsl.g:224:1: entryRuleEvoFeatureVariable returns [EObject current=null] : iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF ;
    public final EObject entryRuleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureVariable = null;


        try {
            // InternalEvoVariableDsl.g:224:59: (iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF )
            // InternalEvoVariableDsl.g:225:2: iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF
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
    // InternalEvoVariableDsl.g:231:1: ruleEvoFeatureVariable returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )? ) ;
    public final EObject ruleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_featureType_3_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:237:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )? ) )
            // InternalEvoVariableDsl.g:238:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )? )
            {
            // InternalEvoVariableDsl.g:238:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )? )
            // InternalEvoVariableDsl.g:239:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
            		
            // InternalEvoVariableDsl.g:243:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:244:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:244:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:245:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalEvoVariableDsl.g:261:3: (otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvoVariableDsl.g:262:4: otherlv_2= '.' ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoFeatureVariableAccess().getFullStopKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:266:4: ( (lv_featureType_3_0= ruleEvoFeatureVariableType ) )
                    // InternalEvoVariableDsl.g:267:5: (lv_featureType_3_0= ruleEvoFeatureVariableType )
                    {
                    // InternalEvoVariableDsl.g:267:5: (lv_featureType_3_0= ruleEvoFeatureVariableType )
                    // InternalEvoVariableDsl.g:268:6: lv_featureType_3_0= ruleEvoFeatureVariableType
                    {

                    						newCompositeNode(grammarAccess.getEvoFeatureVariableAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_featureType_3_0=ruleEvoFeatureVariableType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoFeatureVariableRule());
                    						}
                    						set(
                    							current,
                    							"featureType",
                    							lv_featureType_3_0,
                    							"de.evorepair.evolution.variable.EvoVariableDsl.EvoFeatureVariableType");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEvoFeatureVariable"


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoVariableDsl.g:290:1: entryRuleEvoGroupVariable returns [EObject current=null] : iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF ;
    public final EObject entryRuleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupVariable = null;


        try {
            // InternalEvoVariableDsl.g:290:57: (iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF )
            // InternalEvoVariableDsl.g:291:2: iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF
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
    // InternalEvoVariableDsl.g:297:1: ruleEvoGroupVariable returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:303:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoVariableDsl.g:304:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoVariableDsl.g:304:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoVariableDsl.g:305:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0());
            		
            // InternalEvoVariableDsl.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalEvoVariableDsl.g:331:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalEvoVariableDsl.g:331:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalEvoVariableDsl.g:332:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
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
    // InternalEvoVariableDsl.g:338:1: ruleEvoSetVariable returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) ;
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
            // InternalEvoVariableDsl.g:344:2: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) )
            // InternalEvoVariableDsl.g:345:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            {
            // InternalEvoVariableDsl.g:345:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            // InternalEvoVariableDsl.g:346:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetVariableAccess().getSetKeyword_0());
            		
            // InternalEvoVariableDsl.g:350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:351:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:352:5: lv_name_1_0= RULE_ID
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

            // InternalEvoVariableDsl.g:368:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:369:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:373:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEvoVariableDsl.g:374:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:374:5: (otherlv_3= RULE_ID )
                    // InternalEvoVariableDsl.g:375:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoSetVariableRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalEvoVariableDsl.g:386:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )
                    // InternalEvoVariableDsl.g:387:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0());
                    				
                    // InternalEvoVariableDsl.g:391:5: ( (otherlv_5= RULE_ID ) )
                    // InternalEvoVariableDsl.g:392:6: (otherlv_5= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:392:6: (otherlv_5= RULE_ID )
                    // InternalEvoVariableDsl.g:393:7: otherlv_5= RULE_ID
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
    // InternalEvoVariableDsl.g:414:1: entryRuleEvoMappingVariable returns [EObject current=null] : iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF ;
    public final EObject entryRuleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVariable = null;


        try {
            // InternalEvoVariableDsl.g:414:59: (iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF )
            // InternalEvoVariableDsl.g:415:2: iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF
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
    // InternalEvoVariableDsl.g:421:1: ruleEvoMappingVariable returns [EObject current=null] : (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:427:2: ( (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoVariableDsl.g:428:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoVariableDsl.g:428:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoVariableDsl.g:429:3: otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0());
            		
            // InternalEvoVariableDsl.g:433:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:434:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:434:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:435:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoVariableDsl.g:455:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:461:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalEvoVariableDsl.g:462:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalEvoVariableDsl.g:462:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:463:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalEvoVariableDsl.g:463:3: (enumLiteral_0= '@ident' )
                    // InternalEvoVariableDsl.g:464:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:471:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalEvoVariableDsl.g:471:3: (enumLiteral_1= '@pre' )
                    // InternalEvoVariableDsl.g:472:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:479:3: (enumLiteral_2= '@post' )
                    {
                    // InternalEvoVariableDsl.g:479:3: (enumLiteral_2= '@post' )
                    // InternalEvoVariableDsl.g:480:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalEvoVariableDsl.g:490:1: ruleEvoFeatureVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) ;
    public final Enumerator ruleEvoFeatureVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:496:2: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) ) )
            // InternalEvoVariableDsl.g:497:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            {
            // InternalEvoVariableDsl.g:497:2: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'child' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:498:3: (enumLiteral_0= 'parent' )
                    {
                    // InternalEvoVariableDsl.g:498:3: (enumLiteral_0= 'parent' )
                    // InternalEvoVariableDsl.g:499:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:506:3: (enumLiteral_1= 'source' )
                    {
                    // InternalEvoVariableDsl.g:506:3: (enumLiteral_1= 'source' )
                    // InternalEvoVariableDsl.g:507:4: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:514:3: (enumLiteral_2= 'child' )
                    {
                    // InternalEvoVariableDsl.g:514:3: (enumLiteral_2= 'child' )
                    // InternalEvoVariableDsl.g:515:4: enumLiteral_2= 'child'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000008D802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}