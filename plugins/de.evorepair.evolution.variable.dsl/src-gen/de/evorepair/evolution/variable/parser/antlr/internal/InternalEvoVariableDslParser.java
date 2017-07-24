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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature'", "'reference'", "':'", "'('", "','", "')'", "'group'", "'value'", "'='", "'set'", "'mapping'", "'configuration'", "'.'", "'parentOf'", "'siblingOf'", "'childOf'"
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

                if ( (LA1_0==11||LA1_0==17||(LA1_0>=20 && LA1_0<=22)) ) {
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
            case 22:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
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
    // InternalEvoVariableDsl.g:171:1: ruleEvoFeatureVariable returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relation_2_0= ruleEvoFeatureRelation ) )? (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_relation_2_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:177:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relation_2_0= ruleEvoFeatureRelation ) )? (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )? ) )
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relation_2_0= ruleEvoFeatureRelation ) )? (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )? )
            {
            // InternalEvoVariableDsl.g:178:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relation_2_0= ruleEvoFeatureRelation ) )? (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )? )
            // InternalEvoVariableDsl.g:179:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relation_2_0= ruleEvoFeatureRelation ) )? (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
            		
            // InternalEvoVariableDsl.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalEvoVariableDsl.g:201:3: ( (lv_relation_2_0= ruleEvoFeatureRelation ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=26)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvoVariableDsl.g:202:4: (lv_relation_2_0= ruleEvoFeatureRelation )
                    {
                    // InternalEvoVariableDsl.g:202:4: (lv_relation_2_0= ruleEvoFeatureRelation )
                    // InternalEvoVariableDsl.g:203:5: lv_relation_2_0= ruleEvoFeatureRelation
                    {

                    					newCompositeNode(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_relation_2_0=ruleEvoFeatureRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoFeatureVariableRule());
                    					}
                    					set(
                    						current,
                    						"relation",
                    						lv_relation_2_0,
                    						"de.evorepair.evolution.variable.EvoVariableDsl.EvoFeatureRelation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEvoVariableDsl.g:220:3: (otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvoVariableDsl.g:221:4: otherlv_3= 'reference' otherlv_4= ':' ( (otherlv_5= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoFeatureVariableAccess().getReferenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoFeatureVariableAccess().getColonKeyword_3_1());
                    			
                    // InternalEvoVariableDsl.g:229:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalEvoVariableDsl.g:230:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalEvoVariableDsl.g:230:5: (otherlv_5= RULE_STRING )
                    // InternalEvoVariableDsl.g:231:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoFeatureVariableRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0());
                    					

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


    // $ANTLR start "entryRuleEvoFeatureRelation"
    // InternalEvoVariableDsl.g:247:1: entryRuleEvoFeatureRelation returns [EObject current=null] : iv_ruleEvoFeatureRelation= ruleEvoFeatureRelation EOF ;
    public final EObject entryRuleEvoFeatureRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureRelation = null;


        try {
            // InternalEvoVariableDsl.g:247:59: (iv_ruleEvoFeatureRelation= ruleEvoFeatureRelation EOF )
            // InternalEvoVariableDsl.g:248:2: iv_ruleEvoFeatureRelation= ruleEvoFeatureRelation EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureRelation=ruleEvoFeatureRelation();

            state._fsp--;

             current =iv_ruleEvoFeatureRelation; 
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
    // $ANTLR end "entryRuleEvoFeatureRelation"


    // $ANTLR start "ruleEvoFeatureRelation"
    // InternalEvoVariableDsl.g:254:1: ruleEvoFeatureRelation returns [EObject current=null] : ( ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleEvoFeatureRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_featureType_0_0 = null;



        	enterRule();

        try {
            // InternalEvoVariableDsl.g:260:2: ( ( ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalEvoVariableDsl.g:261:2: ( ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalEvoVariableDsl.g:261:2: ( ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalEvoVariableDsl.g:262:3: ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            // InternalEvoVariableDsl.g:262:3: ( (lv_featureType_0_0= ruleEvoFeatureVariableType ) )
            // InternalEvoVariableDsl.g:263:4: (lv_featureType_0_0= ruleEvoFeatureVariableType )
            {
            // InternalEvoVariableDsl.g:263:4: (lv_featureType_0_0= ruleEvoFeatureVariableType )
            // InternalEvoVariableDsl.g:264:5: lv_featureType_0_0= ruleEvoFeatureVariableType
            {

            					newCompositeNode(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_featureType_0_0=ruleEvoFeatureVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoFeatureRelationRule());
            					}
            					set(
            						current,
            						"featureType",
            						lv_featureType_0_0,
            						"de.evorepair.evolution.variable.EvoVariableDsl.EvoFeatureVariableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoVariableDsl.g:285:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvoVariableDsl.g:286:4: (otherlv_2= RULE_ID )
            {
            // InternalEvoVariableDsl.g:286:4: (otherlv_2= RULE_ID )
            // InternalEvoVariableDsl.g:287:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoFeatureRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0());
            				

            }


            }

            // InternalEvoVariableDsl.g:298:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoVariableDsl.g:299:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0());
                    			
                    // InternalEvoVariableDsl.g:303:4: ( (otherlv_4= RULE_ID ) )
                    // InternalEvoVariableDsl.g:304:5: (otherlv_4= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:304:5: (otherlv_4= RULE_ID )
                    // InternalEvoVariableDsl.g:305:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoFeatureRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleEvoFeatureRelation"


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoVariableDsl.g:325:1: entryRuleEvoGroupVariable returns [EObject current=null] : iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF ;
    public final EObject entryRuleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupVariable = null;


        try {
            // InternalEvoVariableDsl.g:325:57: (iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF )
            // InternalEvoVariableDsl.g:326:2: iv_ruleEvoGroupVariable= ruleEvoGroupVariable EOF
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
    // InternalEvoVariableDsl.g:332:1: ruleEvoGroupVariable returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleEvoGroupVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:338:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )? ) )
            // InternalEvoVariableDsl.g:339:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalEvoVariableDsl.g:339:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )? )
            // InternalEvoVariableDsl.g:340:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0());
            		
            // InternalEvoVariableDsl.g:344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:345:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalEvoVariableDsl.g:362:3: (otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoVariableDsl.g:363:4: otherlv_2= 'value' otherlv_3= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalEvoVariableDsl.g:371:4: ( ( ruleQualifiedName ) )
                    // InternalEvoVariableDsl.g:372:5: ( ruleQualifiedName )
                    {
                    // InternalEvoVariableDsl.g:372:5: ( ruleQualifiedName )
                    // InternalEvoVariableDsl.g:373:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoGroupVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


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
    // $ANTLR end "ruleEvoGroupVariable"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalEvoVariableDsl.g:392:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalEvoVariableDsl.g:392:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalEvoVariableDsl.g:393:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
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
    // InternalEvoVariableDsl.g:399:1: ruleEvoSetVariable returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) ;
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
            // InternalEvoVariableDsl.g:405:2: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? ) )
            // InternalEvoVariableDsl.g:406:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            {
            // InternalEvoVariableDsl.g:406:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )? )
            // InternalEvoVariableDsl.g:407:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetVariableAccess().getSetKeyword_0());
            		
            // InternalEvoVariableDsl.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalEvoVariableDsl.g:429:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoVariableDsl.g:430:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEvoVariableDsl.g:434:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEvoVariableDsl.g:435:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:435:5: (otherlv_3= RULE_ID )
                    // InternalEvoVariableDsl.g:436:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoSetVariableRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_3, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalEvoVariableDsl.g:447:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )
                    // InternalEvoVariableDsl.g:448:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0());
                    				
                    // InternalEvoVariableDsl.g:452:5: ( (otherlv_5= RULE_ID ) )
                    // InternalEvoVariableDsl.g:453:6: (otherlv_5= RULE_ID )
                    {
                    // InternalEvoVariableDsl.g:453:6: (otherlv_5= RULE_ID )
                    // InternalEvoVariableDsl.g:454:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEvoSetVariableRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(otherlv_5, grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0());
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalEvoVariableDsl.g:475:1: entryRuleEvoMappingVariable returns [EObject current=null] : iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF ;
    public final EObject entryRuleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVariable = null;


        try {
            // InternalEvoVariableDsl.g:475:59: (iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF )
            // InternalEvoVariableDsl.g:476:2: iv_ruleEvoMappingVariable= ruleEvoMappingVariable EOF
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
    // InternalEvoVariableDsl.g:482:1: ruleEvoMappingVariable returns [EObject current=null] : (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoMappingVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:488:2: ( (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoVariableDsl.g:489:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoVariableDsl.g:489:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoVariableDsl.g:490:3: otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0());
            		
            // InternalEvoVariableDsl.g:494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:495:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:496:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEvoConfigurationVariable"
    // InternalEvoVariableDsl.g:516:1: entryRuleEvoConfigurationVariable returns [EObject current=null] : iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF ;
    public final EObject entryRuleEvoConfigurationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoConfigurationVariable = null;


        try {
            // InternalEvoVariableDsl.g:516:65: (iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF )
            // InternalEvoVariableDsl.g:517:2: iv_ruleEvoConfigurationVariable= ruleEvoConfigurationVariable EOF
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
    // InternalEvoVariableDsl.g:523:1: ruleEvoConfigurationVariable returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoConfigurationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:529:2: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEvoVariableDsl.g:530:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEvoVariableDsl.g:530:2: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEvoVariableDsl.g:531:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0());
            		
            // InternalEvoVariableDsl.g:535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoVariableDsl.g:536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoVariableDsl.g:536:4: (lv_name_1_0= RULE_ID )
            // InternalEvoVariableDsl.g:537:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEvoVariableDsl.g:557:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEvoVariableDsl.g:557:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEvoVariableDsl.g:558:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEvoVariableDsl.g:564:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:570:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEvoVariableDsl.g:571:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEvoVariableDsl.g:571:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEvoVariableDsl.g:572:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEvoVariableDsl.g:579:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEvoVariableDsl.g:580:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoVariableDsl.g:597:1: ruleEvoFeatureVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) ) ;
    public final Enumerator ruleEvoFeatureVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoVariableDsl.g:603:2: ( ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) ) )
            // InternalEvoVariableDsl.g:604:2: ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) )
            {
            // InternalEvoVariableDsl.g:604:2: ( (enumLiteral_0= 'parentOf' ) | (enumLiteral_1= 'siblingOf' ) | (enumLiteral_2= 'childOf' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEvoVariableDsl.g:605:3: (enumLiteral_0= 'parentOf' )
                    {
                    // InternalEvoVariableDsl.g:605:3: (enumLiteral_0= 'parentOf' )
                    // InternalEvoVariableDsl.g:606:4: enumLiteral_0= 'parentOf'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoVariableDsl.g:613:3: (enumLiteral_1= 'siblingOf' )
                    {
                    // InternalEvoVariableDsl.g:613:3: (enumLiteral_1= 'siblingOf' )
                    // InternalEvoVariableDsl.g:614:4: enumLiteral_1= 'siblingOf'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoVariableDsl.g:621:3: (enumLiteral_2= 'childOf' )
                    {
                    // InternalEvoVariableDsl.g:621:3: (enumLiteral_2= 'childOf' )
                    // InternalEvoVariableDsl.g:622:4: enumLiteral_2= 'childOf'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000720802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});

}