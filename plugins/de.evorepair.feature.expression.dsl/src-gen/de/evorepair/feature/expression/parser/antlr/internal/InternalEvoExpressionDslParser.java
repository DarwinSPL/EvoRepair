package de.evorepair.feature.expression.parser.antlr.internal;

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
import de.evorepair.feature.expression.services.EvoExpressionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoExpressionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'=='", "'!='", "'->'", "'<->'", "'<'", "'ifPossible('", "','", "')'", "'<='", "'>'", "'>='", "'-'", "'+'", "'%'", "'*'", "'/'", "'('", "'!'", "'?'", "'['", "']'", "'true'", "'false'", "'context:'", "'.'", "'EnumLiteral('", "'eternity'", "'min('", "'max('", "'xor'", "'=>'", "'<=>'", "'inclusion'", "'intersection'", "'union'", "'difference'", "'symmetric_difference'", "'x'", "'|'", "'size'", "'elementOf'", "'forAll'", "':'", "'exists'", "'not'", "'satisfiable'", "'All_Mappings'", "'All_Configurations'", "'AC'", "'featureType'", "'groupType'", "'{'", "'}'", "'parentOf'", "'sibilingsOf'", "'childrenOf'", "'='", "'@ident'", "'@pre'", "'@post'", "'optional'", "'mandatory'", "'and'", "'or'", "'alternative'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEvoExpressionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoExpressionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoExpressionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoExpressionDsl.g"; }



     	private EvoExpressionDslGrammarAccess grammarAccess;

        public InternalEvoExpressionDslParser(TokenStream input, EvoExpressionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GrammarEntry";
       	}

       	@Override
       	protected EvoExpressionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammarEntry"
    // InternalEvoExpressionDsl.g:65:1: entryRuleGrammarEntry returns [EObject current=null] : iv_ruleGrammarEntry= ruleGrammarEntry EOF ;
    public final EObject entryRuleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarEntry = null;


        try {
            // InternalEvoExpressionDsl.g:65:53: (iv_ruleGrammarEntry= ruleGrammarEntry EOF )
            // InternalEvoExpressionDsl.g:66:2: iv_ruleGrammarEntry= ruleGrammarEntry EOF
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
    // InternalEvoExpressionDsl.g:72:1: ruleGrammarEntry returns [EObject current=null] : ( (lv_expression_0_0= ruleEvoMappingExpression ) ) ;
    public final EObject ruleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:78:2: ( ( (lv_expression_0_0= ruleEvoMappingExpression ) ) )
            // InternalEvoExpressionDsl.g:79:2: ( (lv_expression_0_0= ruleEvoMappingExpression ) )
            {
            // InternalEvoExpressionDsl.g:79:2: ( (lv_expression_0_0= ruleEvoMappingExpression ) )
            // InternalEvoExpressionDsl.g:80:3: (lv_expression_0_0= ruleEvoMappingExpression )
            {
            // InternalEvoExpressionDsl.g:80:3: (lv_expression_0_0= ruleEvoMappingExpression )
            // InternalEvoExpressionDsl.g:81:4: lv_expression_0_0= ruleEvoMappingExpression
            {

            				newCompositeNode(grammarAccess.getGrammarEntryAccess().getExpressionEvoMappingExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleEvoMappingExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGrammarEntryRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
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


    // $ANTLR start "entryRuleEvoMappingExpression"
    // InternalEvoExpressionDsl.g:101:1: entryRuleEvoMappingExpression returns [EObject current=null] : iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF ;
    public final EObject entryRuleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingExpression = null;


        try {
            // InternalEvoExpressionDsl.g:101:61: (iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF )
            // InternalEvoExpressionDsl.g:102:2: iv_ruleEvoMappingExpression= ruleEvoMappingExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingExpression=ruleEvoMappingExpression();

            state._fsp--;

             current =iv_ruleEvoMappingExpression; 
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
    // $ANTLR end "entryRuleEvoMappingExpression"


    // $ANTLR start "ruleEvoMappingExpression"
    // InternalEvoExpressionDsl.g:108:1: ruleEvoMappingExpression returns [EObject current=null] : this_EvoMappingOr_0= ruleEvoMappingOr ;
    public final EObject ruleEvoMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingOr_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:114:2: (this_EvoMappingOr_0= ruleEvoMappingOr )
            // InternalEvoExpressionDsl.g:115:2: this_EvoMappingOr_0= ruleEvoMappingOr
            {

            		newCompositeNode(grammarAccess.getEvoMappingExpressionAccess().getEvoMappingOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoMappingOr_0=ruleEvoMappingOr();

            state._fsp--;


            		current = this_EvoMappingOr_0;
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
    // $ANTLR end "ruleEvoMappingExpression"


    // $ANTLR start "entryRuleEvoMappingOr"
    // InternalEvoExpressionDsl.g:126:1: entryRuleEvoMappingOr returns [EObject current=null] : iv_ruleEvoMappingOr= ruleEvoMappingOr EOF ;
    public final EObject entryRuleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingOr = null;


        try {
            // InternalEvoExpressionDsl.g:126:53: (iv_ruleEvoMappingOr= ruleEvoMappingOr EOF )
            // InternalEvoExpressionDsl.g:127:2: iv_ruleEvoMappingOr= ruleEvoMappingOr EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingOr=ruleEvoMappingOr();

            state._fsp--;

             current =iv_ruleEvoMappingOr; 
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
    // $ANTLR end "entryRuleEvoMappingOr"


    // $ANTLR start "ruleEvoMappingOr"
    // InternalEvoExpressionDsl.g:133:1: ruleEvoMappingOr returns [EObject current=null] : (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) ;
    public final EObject ruleEvoMappingOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:139:2: ( (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* ) )
            // InternalEvoExpressionDsl.g:140:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            {
            // InternalEvoExpressionDsl.g:140:2: (this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )* )
            // InternalEvoExpressionDsl.g:141:3: this_EvoMappingAnd_0= ruleEvoMappingAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingOrAccess().getEvoMappingAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_EvoMappingAnd_0=ruleEvoMappingAnd();

            state._fsp--;


            			current = this_EvoMappingAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:149:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:150:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    {
            	    // InternalEvoExpressionDsl.g:150:4: ()
            	    // InternalEvoExpressionDsl.g:151:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingOrAccess().getHyOrExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:161:4: ( (lv_operand2_3_0= ruleEvoMappingAnd ) )
            	    // InternalEvoExpressionDsl.g:162:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    {
            	    // InternalEvoExpressionDsl.g:162:5: (lv_operand2_3_0= ruleEvoMappingAnd )
            	    // InternalEvoExpressionDsl.g:163:6: lv_operand2_3_0= ruleEvoMappingAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingOrAccess().getOperand2EvoMappingAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operand2_3_0=ruleEvoMappingAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleEvoMappingOr"


    // $ANTLR start "entryRuleEvoMappingAnd"
    // InternalEvoExpressionDsl.g:185:1: entryRuleEvoMappingAnd returns [EObject current=null] : iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF ;
    public final EObject entryRuleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAnd = null;


        try {
            // InternalEvoExpressionDsl.g:185:54: (iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF )
            // InternalEvoExpressionDsl.g:186:2: iv_ruleEvoMappingAnd= ruleEvoMappingAnd EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAnd=ruleEvoMappingAnd();

            state._fsp--;

             current =iv_ruleEvoMappingAnd; 
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
    // $ANTLR end "entryRuleEvoMappingAnd"


    // $ANTLR start "ruleEvoMappingAnd"
    // InternalEvoExpressionDsl.g:192:1: ruleEvoMappingAnd returns [EObject current=null] : (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) ;
    public final EObject ruleEvoMappingAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:198:2: ( (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* ) )
            // InternalEvoExpressionDsl.g:199:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            {
            // InternalEvoExpressionDsl.g:199:2: (this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )* )
            // InternalEvoExpressionDsl.g:200:3: this_EvoMappingEqual_0= ruleEvoMappingEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAndAccess().getEvoMappingEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_EvoMappingEqual_0=ruleEvoMappingEqual();

            state._fsp--;


            			current = this_EvoMappingEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:208:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:209:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    {
            	    // InternalEvoExpressionDsl.g:209:4: ()
            	    // InternalEvoExpressionDsl.g:210:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAndAccess().getHyAndExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:220:4: ( (lv_operand2_3_0= ruleEvoMappingEqual ) )
            	    // InternalEvoExpressionDsl.g:221:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    {
            	    // InternalEvoExpressionDsl.g:221:5: (lv_operand2_3_0= ruleEvoMappingEqual )
            	    // InternalEvoExpressionDsl.g:222:6: lv_operand2_3_0= ruleEvoMappingEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAndAccess().getOperand2EvoMappingEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operand2_3_0=ruleEvoMappingEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingEqual");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleEvoMappingAnd"


    // $ANTLR start "entryRuleEvoMappingEqual"
    // InternalEvoExpressionDsl.g:244:1: entryRuleEvoMappingEqual returns [EObject current=null] : iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF ;
    public final EObject entryRuleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEqual = null;


        try {
            // InternalEvoExpressionDsl.g:244:56: (iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF )
            // InternalEvoExpressionDsl.g:245:2: iv_ruleEvoMappingEqual= ruleEvoMappingEqual EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEqual=ruleEvoMappingEqual();

            state._fsp--;

             current =iv_ruleEvoMappingEqual; 
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
    // $ANTLR end "entryRuleEvoMappingEqual"


    // $ANTLR start "ruleEvoMappingEqual"
    // InternalEvoExpressionDsl.g:251:1: ruleEvoMappingEqual returns [EObject current=null] : (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) ;
    public final EObject ruleEvoMappingEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:257:2: ( (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* ) )
            // InternalEvoExpressionDsl.g:258:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            {
            // InternalEvoExpressionDsl.g:258:2: (this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )* )
            // InternalEvoExpressionDsl.g:259:3: this_EvoMappingUnequal_0= ruleEvoMappingUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getEvoMappingUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_EvoMappingUnequal_0=ruleEvoMappingUnequal();

            state._fsp--;


            			current = this_EvoMappingUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:267:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:268:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    {
            	    // InternalEvoExpressionDsl.g:268:4: ()
            	    // InternalEvoExpressionDsl.g:269:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEqualAccess().getHyEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:279:4: ( (lv_operand2_3_0= ruleEvoMappingUnequal ) )
            	    // InternalEvoExpressionDsl.g:280:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    {
            	    // InternalEvoExpressionDsl.g:280:5: (lv_operand2_3_0= ruleEvoMappingUnequal )
            	    // InternalEvoExpressionDsl.g:281:6: lv_operand2_3_0= ruleEvoMappingUnequal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEqualAccess().getOperand2EvoMappingUnequalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operand2_3_0=ruleEvoMappingUnequal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingUnequal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleEvoMappingEqual"


    // $ANTLR start "entryRuleEvoMappingUnequal"
    // InternalEvoExpressionDsl.g:303:1: entryRuleEvoMappingUnequal returns [EObject current=null] : iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF ;
    public final EObject entryRuleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingUnequal = null;


        try {
            // InternalEvoExpressionDsl.g:303:58: (iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF )
            // InternalEvoExpressionDsl.g:304:2: iv_ruleEvoMappingUnequal= ruleEvoMappingUnequal EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingUnequalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingUnequal=ruleEvoMappingUnequal();

            state._fsp--;

             current =iv_ruleEvoMappingUnequal; 
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
    // $ANTLR end "entryRuleEvoMappingUnequal"


    // $ANTLR start "ruleEvoMappingUnequal"
    // InternalEvoExpressionDsl.g:310:1: ruleEvoMappingUnequal returns [EObject current=null] : (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) ;
    public final EObject ruleEvoMappingUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:316:2: ( (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* ) )
            // InternalEvoExpressionDsl.g:317:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            {
            // InternalEvoExpressionDsl.g:317:2: (this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )* )
            // InternalEvoExpressionDsl.g:318:3: this_EvoMappingImplication_0= ruleEvoMappingImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getEvoMappingImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_EvoMappingImplication_0=ruleEvoMappingImplication();

            state._fsp--;


            			current = this_EvoMappingImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:326:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:327:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    {
            	    // InternalEvoExpressionDsl.g:327:4: ()
            	    // InternalEvoExpressionDsl.g:328:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingUnequalAccess().getHyNotEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:338:4: ( (lv_operand2_3_0= ruleEvoMappingImplication ) )
            	    // InternalEvoExpressionDsl.g:339:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    {
            	    // InternalEvoExpressionDsl.g:339:5: (lv_operand2_3_0= ruleEvoMappingImplication )
            	    // InternalEvoExpressionDsl.g:340:6: lv_operand2_3_0= ruleEvoMappingImplication
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingUnequalAccess().getOperand2EvoMappingImplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_operand2_3_0=ruleEvoMappingImplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingUnequalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingImplication");
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
    // $ANTLR end "ruleEvoMappingUnequal"


    // $ANTLR start "entryRuleEvoMappingImplication"
    // InternalEvoExpressionDsl.g:362:1: entryRuleEvoMappingImplication returns [EObject current=null] : iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF ;
    public final EObject entryRuleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingImplication = null;


        try {
            // InternalEvoExpressionDsl.g:362:62: (iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF )
            // InternalEvoExpressionDsl.g:363:2: iv_ruleEvoMappingImplication= ruleEvoMappingImplication EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingImplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingImplication=ruleEvoMappingImplication();

            state._fsp--;

             current =iv_ruleEvoMappingImplication; 
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
    // $ANTLR end "entryRuleEvoMappingImplication"


    // $ANTLR start "ruleEvoMappingImplication"
    // InternalEvoExpressionDsl.g:369:1: ruleEvoMappingImplication returns [EObject current=null] : (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) ;
    public final EObject ruleEvoMappingImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingEquivalence_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:375:2: ( (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* ) )
            // InternalEvoExpressionDsl.g:376:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            {
            // InternalEvoExpressionDsl.g:376:2: (this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )* )
            // InternalEvoExpressionDsl.g:377:3: this_EvoMappingEquivalence_0= ruleEvoMappingEquivalence ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getEvoMappingEquivalenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_EvoMappingEquivalence_0=ruleEvoMappingEquivalence();

            state._fsp--;


            			current = this_EvoMappingEquivalence_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:385:3: ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:386:4: () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    {
            	    // InternalEvoExpressionDsl.g:386:4: ()
            	    // InternalEvoExpressionDsl.g:387:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingImplicationAccess().getHyImpliesExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:397:4: ( (lv_operand2_3_0= ruleEvoMappingEquivalence ) )
            	    // InternalEvoExpressionDsl.g:398:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    {
            	    // InternalEvoExpressionDsl.g:398:5: (lv_operand2_3_0= ruleEvoMappingEquivalence )
            	    // InternalEvoExpressionDsl.g:399:6: lv_operand2_3_0= ruleEvoMappingEquivalence
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingImplicationAccess().getOperand2EvoMappingEquivalenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operand2_3_0=ruleEvoMappingEquivalence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingImplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingEquivalence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleEvoMappingImplication"


    // $ANTLR start "entryRuleEvoMappingEquivalence"
    // InternalEvoExpressionDsl.g:421:1: entryRuleEvoMappingEquivalence returns [EObject current=null] : iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF ;
    public final EObject entryRuleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEquivalence = null;


        try {
            // InternalEvoExpressionDsl.g:421:62: (iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF )
            // InternalEvoExpressionDsl.g:422:2: iv_ruleEvoMappingEquivalence= ruleEvoMappingEquivalence EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEquivalenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEquivalence=ruleEvoMappingEquivalence();

            state._fsp--;

             current =iv_ruleEvoMappingEquivalence; 
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
    // $ANTLR end "entryRuleEvoMappingEquivalence"


    // $ANTLR start "ruleEvoMappingEquivalence"
    // InternalEvoExpressionDsl.g:428:1: ruleEvoMappingEquivalence returns [EObject current=null] : (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) ;
    public final EObject ruleEvoMappingEquivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingLessExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:434:2: ( (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:435:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:435:2: (this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )* )
            // InternalEvoExpressionDsl.g:436:3: this_EvoMappingLessExpression_0= ruleEvoMappingLessExpression ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getEvoMappingLessExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_EvoMappingLessExpression_0=ruleEvoMappingLessExpression();

            state._fsp--;


            			current = this_EvoMappingLessExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:444:3: ( () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:445:4: () otherlv_2= '<->' ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:445:4: ()
            	    // InternalEvoExpressionDsl.g:446:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingEquivalenceAccess().getHyEquivalenceExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingEquivalenceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:456:4: ( (lv_operand2_3_0= ruleEvoMappingLessExpression ) )
            	    // InternalEvoExpressionDsl.g:457:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:457:5: (lv_operand2_3_0= ruleEvoMappingLessExpression )
            	    // InternalEvoExpressionDsl.g:458:6: lv_operand2_3_0= ruleEvoMappingLessExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingEquivalenceAccess().getOperand2EvoMappingLessExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_operand2_3_0=ruleEvoMappingLessExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingEquivalenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingLessExpression");
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
    // $ANTLR end "ruleEvoMappingEquivalence"


    // $ANTLR start "entryRuleEvoMappingLessExpression"
    // InternalEvoExpressionDsl.g:480:1: entryRuleEvoMappingLessExpression returns [EObject current=null] : iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF ;
    public final EObject entryRuleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessExpression = null;


        try {
            // InternalEvoExpressionDsl.g:480:65: (iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF )
            // InternalEvoExpressionDsl.g:481:2: iv_ruleEvoMappingLessExpression= ruleEvoMappingLessExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingLessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingLessExpression=ruleEvoMappingLessExpression();

            state._fsp--;

             current =iv_ruleEvoMappingLessExpression; 
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
    // $ANTLR end "entryRuleEvoMappingLessExpression"


    // $ANTLR start "ruleEvoMappingLessExpression"
    // InternalEvoExpressionDsl.g:487:1: ruleEvoMappingLessExpression returns [EObject current=null] : (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingIfPossibleExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:493:2: ( (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:494:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:494:2: (this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )* )
            // InternalEvoExpressionDsl.g:495:3: this_EvoMappingIfPossibleExpression_0= ruleEvoMappingIfPossibleExpression ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getEvoMappingIfPossibleExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EvoMappingIfPossibleExpression_0=ruleEvoMappingIfPossibleExpression();

            state._fsp--;


            			current = this_EvoMappingIfPossibleExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:503:3: ( () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:504:4: () otherlv_2= '<' ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:504:4: ()
            	    // InternalEvoExpressionDsl.g:505:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessExpressionAccess().getHyLessExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessExpressionAccess().getLessThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:515:4: ( (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression ) )
            	    // InternalEvoExpressionDsl.g:516:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:516:5: (lv_operand2_3_0= ruleEvoMappingIfPossibleExpression )
            	    // InternalEvoExpressionDsl.g:517:6: lv_operand2_3_0= ruleEvoMappingIfPossibleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessExpressionAccess().getOperand2EvoMappingIfPossibleExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operand2_3_0=ruleEvoMappingIfPossibleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingLessExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingIfPossibleExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleEvoMappingLessExpression"


    // $ANTLR start "entryRuleEvoMappingIfPossibleExpression"
    // InternalEvoExpressionDsl.g:539:1: entryRuleEvoMappingIfPossibleExpression returns [EObject current=null] : iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF ;
    public final EObject entryRuleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingIfPossibleExpression = null;


        try {
            // InternalEvoExpressionDsl.g:539:71: (iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF )
            // InternalEvoExpressionDsl.g:540:2: iv_ruleEvoMappingIfPossibleExpression= ruleEvoMappingIfPossibleExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingIfPossibleExpression=ruleEvoMappingIfPossibleExpression();

            state._fsp--;

             current =iv_ruleEvoMappingIfPossibleExpression; 
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
    // $ANTLR end "entryRuleEvoMappingIfPossibleExpression"


    // $ANTLR start "ruleEvoMappingIfPossibleExpression"
    // InternalEvoExpressionDsl.g:546:1: ruleEvoMappingIfPossibleExpression returns [EObject current=null] : (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) ;
    public final EObject ruleEvoMappingIfPossibleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_EvoMappingLessOrEqualExpression_0 = null;

        EObject lv_operands_4_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:552:2: ( (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* ) )
            // InternalEvoExpressionDsl.g:553:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            {
            // InternalEvoExpressionDsl.g:553:2: (this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )* )
            // InternalEvoExpressionDsl.g:554:3: this_EvoMappingLessOrEqualExpression_0= ruleEvoMappingLessOrEqualExpression (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getEvoMappingLessOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_EvoMappingLessOrEqualExpression_0=ruleEvoMappingLessOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingLessOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:562:3: (otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:563:4: otherlv_1= 'ifPossible(' () (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )* otherlv_5= ')'
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getIfPossibleKeyword_1_0());
            	    			
            	    // InternalEvoExpressionDsl.g:567:4: ()
            	    // InternalEvoExpressionDsl.g:568:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEvoMappingIfPossibleExpressionAccess().getHyIfPossibleExpressionOperandsAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalEvoExpressionDsl.g:574:4: (otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==20) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalEvoExpressionDsl.g:575:5: otherlv_3= ',' ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,20,FOLLOW_4); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalEvoExpressionDsl.g:579:5: ( (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression ) )
            	    	    // InternalEvoExpressionDsl.g:580:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    {
            	    	    // InternalEvoExpressionDsl.g:580:6: (lv_operands_4_0= ruleEvoMappingLessOrEqualExpression )
            	    	    // InternalEvoExpressionDsl.g:581:7: lv_operands_4_0= ruleEvoMappingLessOrEqualExpression
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getEvoMappingIfPossibleExpressionAccess().getOperandsEvoMappingLessOrEqualExpressionParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_operands_4_0=ruleEvoMappingLessOrEqualExpression();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getEvoMappingIfPossibleExpressionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"operands",
            	    	    								lv_operands_4_0,
            	    	    								"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingLessOrEqualExpression");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingIfPossibleExpressionAccess().getRightParenthesisKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleEvoMappingIfPossibleExpression"


    // $ANTLR start "entryRuleEvoMappingLessOrEqualExpression"
    // InternalEvoExpressionDsl.g:608:1: entryRuleEvoMappingLessOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingLessOrEqualExpression = null;


        try {
            // InternalEvoExpressionDsl.g:608:72: (iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF )
            // InternalEvoExpressionDsl.g:609:2: iv_ruleEvoMappingLessOrEqualExpression= ruleEvoMappingLessOrEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingLessOrEqualExpression=ruleEvoMappingLessOrEqualExpression();

            state._fsp--;

             current =iv_ruleEvoMappingLessOrEqualExpression; 
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
    // $ANTLR end "entryRuleEvoMappingLessOrEqualExpression"


    // $ANTLR start "ruleEvoMappingLessOrEqualExpression"
    // InternalEvoExpressionDsl.g:615:1: ruleEvoMappingLessOrEqualExpression returns [EObject current=null] : (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) ;
    public final EObject ruleEvoMappingLessOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:621:2: ( (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:622:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:622:2: (this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )* )
            // InternalEvoExpressionDsl.g:623:3: this_EvoMappingGreaterExpression_0= ruleEvoMappingGreaterExpression ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getEvoMappingGreaterExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EvoMappingGreaterExpression_0=ruleEvoMappingGreaterExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:631:3: ( () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:632:4: () otherlv_2= '<=' ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:632:4: ()
            	    // InternalEvoExpressionDsl.g:633:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getHyLessOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getLessThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:643:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterExpression ) )
            	    // InternalEvoExpressionDsl.g:644:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:644:5: (lv_operand2_3_0= ruleEvoMappingGreaterExpression )
            	    // InternalEvoExpressionDsl.g:645:6: lv_operand2_3_0= ruleEvoMappingGreaterExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingLessOrEqualExpressionAccess().getOperand2EvoMappingGreaterExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_operand2_3_0=ruleEvoMappingGreaterExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingLessOrEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingGreaterExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleEvoMappingLessOrEqualExpression"


    // $ANTLR start "entryRuleEvoMappingGreaterExpression"
    // InternalEvoExpressionDsl.g:667:1: entryRuleEvoMappingGreaterExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterExpression = null;


        try {
            // InternalEvoExpressionDsl.g:667:68: (iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF )
            // InternalEvoExpressionDsl.g:668:2: iv_ruleEvoMappingGreaterExpression= ruleEvoMappingGreaterExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingGreaterExpression=ruleEvoMappingGreaterExpression();

            state._fsp--;

             current =iv_ruleEvoMappingGreaterExpression; 
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
    // $ANTLR end "entryRuleEvoMappingGreaterExpression"


    // $ANTLR start "ruleEvoMappingGreaterExpression"
    // InternalEvoExpressionDsl.g:674:1: ruleEvoMappingGreaterExpression returns [EObject current=null] : (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingGreaterOrEqualExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:680:2: ( (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:681:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:681:2: (this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )* )
            // InternalEvoExpressionDsl.g:682:3: this_EvoMappingGreaterOrEqualExpression_0= ruleEvoMappingGreaterOrEqualExpression ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getEvoMappingGreaterOrEqualExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_EvoMappingGreaterOrEqualExpression_0=ruleEvoMappingGreaterOrEqualExpression();

            state._fsp--;


            			current = this_EvoMappingGreaterOrEqualExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:690:3: ( () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:691:4: () otherlv_2= '>' ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:691:4: ()
            	    // InternalEvoExpressionDsl.g:692:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterExpressionAccess().getHyGreaterExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterExpressionAccess().getGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:702:4: ( (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression ) )
            	    // InternalEvoExpressionDsl.g:703:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:703:5: (lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression )
            	    // InternalEvoExpressionDsl.g:704:6: lv_operand2_3_0= ruleEvoMappingGreaterOrEqualExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterExpressionAccess().getOperand2EvoMappingGreaterOrEqualExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operand2_3_0=ruleEvoMappingGreaterOrEqualExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingGreaterExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingGreaterOrEqualExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleEvoMappingGreaterExpression"


    // $ANTLR start "entryRuleEvoMappingGreaterOrEqualExpression"
    // InternalEvoExpressionDsl.g:726:1: entryRuleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF ;
    public final EObject entryRuleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingGreaterOrEqualExpression = null;


        try {
            // InternalEvoExpressionDsl.g:726:75: (iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF )
            // InternalEvoExpressionDsl.g:727:2: iv_ruleEvoMappingGreaterOrEqualExpression= ruleEvoMappingGreaterOrEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingGreaterOrEqualExpression=ruleEvoMappingGreaterOrEqualExpression();

            state._fsp--;

             current =iv_ruleEvoMappingGreaterOrEqualExpression; 
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
    // $ANTLR end "entryRuleEvoMappingGreaterOrEqualExpression"


    // $ANTLR start "ruleEvoMappingGreaterOrEqualExpression"
    // InternalEvoExpressionDsl.g:733:1: ruleEvoMappingGreaterOrEqualExpression returns [EObject current=null] : (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingGreaterOrEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingSubtractionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:739:2: ( (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:740:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:740:2: (this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )* )
            // InternalEvoExpressionDsl.g:741:3: this_EvoMappingSubtractionExpression_0= ruleEvoMappingSubtractionExpression ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getEvoMappingSubtractionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_EvoMappingSubtractionExpression_0=ruleEvoMappingSubtractionExpression();

            state._fsp--;


            			current = this_EvoMappingSubtractionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:749:3: ( () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:750:4: () otherlv_2= '>=' ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:750:4: ()
            	    // InternalEvoExpressionDsl.g:751:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getHyGreaterOrEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:761:4: ( (lv_operand2_3_0= ruleEvoMappingSubtractionExpression ) )
            	    // InternalEvoExpressionDsl.g:762:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:762:5: (lv_operand2_3_0= ruleEvoMappingSubtractionExpression )
            	    // InternalEvoExpressionDsl.g:763:6: lv_operand2_3_0= ruleEvoMappingSubtractionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingGreaterOrEqualExpressionAccess().getOperand2EvoMappingSubtractionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operand2_3_0=ruleEvoMappingSubtractionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingGreaterOrEqualExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingSubtractionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleEvoMappingGreaterOrEqualExpression"


    // $ANTLR start "entryRuleEvoMappingSubtractionExpression"
    // InternalEvoExpressionDsl.g:785:1: entryRuleEvoMappingSubtractionExpression returns [EObject current=null] : iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF ;
    public final EObject entryRuleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingSubtractionExpression = null;


        try {
            // InternalEvoExpressionDsl.g:785:72: (iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF )
            // InternalEvoExpressionDsl.g:786:2: iv_ruleEvoMappingSubtractionExpression= ruleEvoMappingSubtractionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingSubtractionExpression=ruleEvoMappingSubtractionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingSubtractionExpression; 
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
    // $ANTLR end "entryRuleEvoMappingSubtractionExpression"


    // $ANTLR start "ruleEvoMappingSubtractionExpression"
    // InternalEvoExpressionDsl.g:792:1: ruleEvoMappingSubtractionExpression returns [EObject current=null] : (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingSubtractionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingAdditionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:798:2: ( (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:799:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:799:2: (this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )* )
            // InternalEvoExpressionDsl.g:800:3: this_EvoMappingAdditionExpression_0= ruleEvoMappingAdditionExpression ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getEvoMappingAdditionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EvoMappingAdditionExpression_0=ruleEvoMappingAdditionExpression();

            state._fsp--;


            			current = this_EvoMappingAdditionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:808:3: ( () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:809:4: () otherlv_2= '-' ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:809:4: ()
            	    // InternalEvoExpressionDsl.g:810:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingSubtractionExpressionAccess().getHySubtractionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingSubtractionExpressionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:820:4: ( (lv_operand2_3_0= ruleEvoMappingAdditionExpression ) )
            	    // InternalEvoExpressionDsl.g:821:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:821:5: (lv_operand2_3_0= ruleEvoMappingAdditionExpression )
            	    // InternalEvoExpressionDsl.g:822:6: lv_operand2_3_0= ruleEvoMappingAdditionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingSubtractionExpressionAccess().getOperand2EvoMappingAdditionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_operand2_3_0=ruleEvoMappingAdditionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingSubtractionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingAdditionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleEvoMappingSubtractionExpression"


    // $ANTLR start "entryRuleEvoMappingAdditionExpression"
    // InternalEvoExpressionDsl.g:844:1: entryRuleEvoMappingAdditionExpression returns [EObject current=null] : iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF ;
    public final EObject entryRuleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAdditionExpression = null;


        try {
            // InternalEvoExpressionDsl.g:844:69: (iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF )
            // InternalEvoExpressionDsl.g:845:2: iv_ruleEvoMappingAdditionExpression= ruleEvoMappingAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAdditionExpression=ruleEvoMappingAdditionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingAdditionExpression; 
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
    // $ANTLR end "entryRuleEvoMappingAdditionExpression"


    // $ANTLR start "ruleEvoMappingAdditionExpression"
    // InternalEvoExpressionDsl.g:851:1: ruleEvoMappingAdditionExpression returns [EObject current=null] : (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) ;
    public final EObject ruleEvoMappingAdditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingModuloExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:857:2: ( (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:858:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:858:2: (this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )* )
            // InternalEvoExpressionDsl.g:859:3: this_EvoMappingModuloExpression_0= ruleEvoMappingModuloExpression ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getEvoMappingModuloExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_EvoMappingModuloExpression_0=ruleEvoMappingModuloExpression();

            state._fsp--;


            			current = this_EvoMappingModuloExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:867:3: ( () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:868:4: () otherlv_2= '+' ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:868:4: ()
            	    // InternalEvoExpressionDsl.g:869:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingAdditionExpressionAccess().getHyAdditionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingAdditionExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:879:4: ( (lv_operand2_3_0= ruleEvoMappingModuloExpression ) )
            	    // InternalEvoExpressionDsl.g:880:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:880:5: (lv_operand2_3_0= ruleEvoMappingModuloExpression )
            	    // InternalEvoExpressionDsl.g:881:6: lv_operand2_3_0= ruleEvoMappingModuloExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingAdditionExpressionAccess().getOperand2EvoMappingModuloExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operand2_3_0=ruleEvoMappingModuloExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingAdditionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingModuloExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleEvoMappingAdditionExpression"


    // $ANTLR start "entryRuleEvoMappingModuloExpression"
    // InternalEvoExpressionDsl.g:903:1: entryRuleEvoMappingModuloExpression returns [EObject current=null] : iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF ;
    public final EObject entryRuleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingModuloExpression = null;


        try {
            // InternalEvoExpressionDsl.g:903:67: (iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF )
            // InternalEvoExpressionDsl.g:904:2: iv_ruleEvoMappingModuloExpression= ruleEvoMappingModuloExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingModuloExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingModuloExpression=ruleEvoMappingModuloExpression();

            state._fsp--;

             current =iv_ruleEvoMappingModuloExpression; 
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
    // $ANTLR end "entryRuleEvoMappingModuloExpression"


    // $ANTLR start "ruleEvoMappingModuloExpression"
    // InternalEvoExpressionDsl.g:910:1: ruleEvoMappingModuloExpression returns [EObject current=null] : (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) ;
    public final EObject ruleEvoMappingModuloExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingMultiplicationExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:916:2: ( (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:917:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:917:2: (this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )* )
            // InternalEvoExpressionDsl.g:918:3: this_EvoMappingMultiplicationExpression_0= ruleEvoMappingMultiplicationExpression ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getEvoMappingMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_EvoMappingMultiplicationExpression_0=ruleEvoMappingMultiplicationExpression();

            state._fsp--;


            			current = this_EvoMappingMultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:926:3: ( () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:927:4: () otherlv_2= '%' ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:927:4: ()
            	    // InternalEvoExpressionDsl.g:928:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingModuloExpressionAccess().getHyModuloExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingModuloExpressionAccess().getPercentSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:938:4: ( (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression ) )
            	    // InternalEvoExpressionDsl.g:939:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:939:5: (lv_operand2_3_0= ruleEvoMappingMultiplicationExpression )
            	    // InternalEvoExpressionDsl.g:940:6: lv_operand2_3_0= ruleEvoMappingMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingModuloExpressionAccess().getOperand2EvoMappingMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_operand2_3_0=ruleEvoMappingMultiplicationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingModuloExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingMultiplicationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleEvoMappingModuloExpression"


    // $ANTLR start "entryRuleEvoMappingMultiplicationExpression"
    // InternalEvoExpressionDsl.g:962:1: entryRuleEvoMappingMultiplicationExpression returns [EObject current=null] : iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF ;
    public final EObject entryRuleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMultiplicationExpression = null;


        try {
            // InternalEvoExpressionDsl.g:962:75: (iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF )
            // InternalEvoExpressionDsl.g:963:2: iv_ruleEvoMappingMultiplicationExpression= ruleEvoMappingMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMultiplicationExpression=ruleEvoMappingMultiplicationExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMultiplicationExpression; 
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
    // $ANTLR end "entryRuleEvoMappingMultiplicationExpression"


    // $ANTLR start "ruleEvoMappingMultiplicationExpression"
    // InternalEvoExpressionDsl.g:969:1: ruleEvoMappingMultiplicationExpression returns [EObject current=null] : (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) ;
    public final EObject ruleEvoMappingMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingDivisionExpression_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:975:2: ( (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* ) )
            // InternalEvoExpressionDsl.g:976:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            {
            // InternalEvoExpressionDsl.g:976:2: (this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )* )
            // InternalEvoExpressionDsl.g:977:3: this_EvoMappingDivisionExpression_0= ruleEvoMappingDivisionExpression ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getEvoMappingDivisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EvoMappingDivisionExpression_0=ruleEvoMappingDivisionExpression();

            state._fsp--;


            			current = this_EvoMappingDivisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:985:3: ( () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:986:4: () otherlv_2= '*' ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    {
            	    // InternalEvoExpressionDsl.g:986:4: ()
            	    // InternalEvoExpressionDsl.g:987:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingMultiplicationExpressionAccess().getHyMultiplicationExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingMultiplicationExpressionAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:997:4: ( (lv_operand2_3_0= ruleEvoMappingDivisionExpression ) )
            	    // InternalEvoExpressionDsl.g:998:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    {
            	    // InternalEvoExpressionDsl.g:998:5: (lv_operand2_3_0= ruleEvoMappingDivisionExpression )
            	    // InternalEvoExpressionDsl.g:999:6: lv_operand2_3_0= ruleEvoMappingDivisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingMultiplicationExpressionAccess().getOperand2EvoMappingDivisionExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_operand2_3_0=ruleEvoMappingDivisionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingMultiplicationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingDivisionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleEvoMappingMultiplicationExpression"


    // $ANTLR start "entryRuleEvoMappingDivisionExpression"
    // InternalEvoExpressionDsl.g:1021:1: entryRuleEvoMappingDivisionExpression returns [EObject current=null] : iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF ;
    public final EObject entryRuleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingDivisionExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1021:69: (iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF )
            // InternalEvoExpressionDsl.g:1022:2: iv_ruleEvoMappingDivisionExpression= ruleEvoMappingDivisionExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingDivisionExpression=ruleEvoMappingDivisionExpression();

            state._fsp--;

             current =iv_ruleEvoMappingDivisionExpression; 
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
    // $ANTLR end "entryRuleEvoMappingDivisionExpression"


    // $ANTLR start "ruleEvoMappingDivisionExpression"
    // InternalEvoExpressionDsl.g:1028:1: ruleEvoMappingDivisionExpression returns [EObject current=null] : (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) ;
    public final EObject ruleEvoMappingDivisionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoMappingTerminal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1034:2: ( (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* ) )
            // InternalEvoExpressionDsl.g:1035:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            {
            // InternalEvoExpressionDsl.g:1035:2: (this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )* )
            // InternalEvoExpressionDsl.g:1036:3: this_EvoMappingTerminal_0= ruleEvoMappingTerminal ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getEvoMappingTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EvoMappingTerminal_0=ruleEvoMappingTerminal();

            state._fsp--;


            			current = this_EvoMappingTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:1044:3: ( () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:1045:4: () otherlv_2= '/' ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    {
            	    // InternalEvoExpressionDsl.g:1045:4: ()
            	    // InternalEvoExpressionDsl.g:1046:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoMappingDivisionExpressionAccess().getHyDivisionExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingDivisionExpressionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:1056:4: ( (lv_operand2_3_0= ruleEvoMappingTerminal ) )
            	    // InternalEvoExpressionDsl.g:1057:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    {
            	    // InternalEvoExpressionDsl.g:1057:5: (lv_operand2_3_0= ruleEvoMappingTerminal )
            	    // InternalEvoExpressionDsl.g:1058:6: lv_operand2_3_0= ruleEvoMappingTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoMappingDivisionExpressionAccess().getOperand2EvoMappingTerminalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operand2_3_0=ruleEvoMappingTerminal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoMappingDivisionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleEvoMappingDivisionExpression"


    // $ANTLR start "entryRuleEvoMappingNegation"
    // InternalEvoExpressionDsl.g:1080:1: entryRuleEvoMappingNegation returns [EObject current=null] : iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF ;
    public final EObject entryRuleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNegation = null;


        try {
            // InternalEvoExpressionDsl.g:1080:59: (iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF )
            // InternalEvoExpressionDsl.g:1081:2: iv_ruleEvoMappingNegation= ruleEvoMappingNegation EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNegation=ruleEvoMappingNegation();

            state._fsp--;

             current =iv_ruleEvoMappingNegation; 
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
    // $ANTLR end "entryRuleEvoMappingNegation"


    // $ANTLR start "ruleEvoMappingNegation"
    // InternalEvoExpressionDsl.g:1087:1: ruleEvoMappingNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) ;
    public final EObject ruleEvoMappingNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1093:2: ( (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) )
            // InternalEvoExpressionDsl.g:1094:2: (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            {
            // InternalEvoExpressionDsl.g:1094:2: (otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            // InternalEvoExpressionDsl.g:1095:3: otherlv_0= '-' ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNegationAccess().getHyphenMinusKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1099:3: ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            // InternalEvoExpressionDsl.g:1100:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            {
            // InternalEvoExpressionDsl.g:1100:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            // InternalEvoExpressionDsl.g:1101:5: lv_operand_1_0= ruleEvoMappingTerminal
            {

            					newCompositeNode(grammarAccess.getEvoMappingNegationAccess().getOperandEvoMappingTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNegationRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
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
    // $ANTLR end "ruleEvoMappingNegation"


    // $ANTLR start "entryRuleEvoMappingTerminal"
    // InternalEvoExpressionDsl.g:1122:1: entryRuleEvoMappingTerminal returns [EObject current=null] : iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF ;
    public final EObject entryRuleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingTerminal = null;


        try {
            // InternalEvoExpressionDsl.g:1122:59: (iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF )
            // InternalEvoExpressionDsl.g:1123:2: iv_ruleEvoMappingTerminal= ruleEvoMappingTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingTerminal=ruleEvoMappingTerminal();

            state._fsp--;

             current =iv_ruleEvoMappingTerminal; 
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
    // $ANTLR end "entryRuleEvoMappingTerminal"


    // $ANTLR start "ruleEvoMappingTerminal"
    // InternalEvoExpressionDsl.g:1129:1: ruleEvoMappingTerminal returns [EObject current=null] : (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot ) ;
    public final EObject ruleEvoMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingFeatureReferenceExpression_0 = null;

        EObject this_EvoMappingNestedExpression_1 = null;

        EObject this_EvoMappingNegation_2 = null;

        EObject this_EvoMappingConditionalFeatureReferenceExpression_3 = null;

        EObject this_EvoMappingContextInformationReferenceExpression_4 = null;

        EObject this_EvoMappingAttributeReferenceExpression_5 = null;

        EObject this_EvoMappingValueExpression_6 = null;

        EObject this_EvoMappingBooleanValueExpression_7 = null;

        EObject this_EvoMappingMimumumExpression_8 = null;

        EObject this_EvoMappingMaximumExpression_9 = null;

        EObject this_EvoMappingNot_10 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1135:2: ( (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot ) )
            // InternalEvoExpressionDsl.g:1136:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )
            {
            // InternalEvoExpressionDsl.g:1136:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )
            int alt18=11;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1137:3: this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingFeatureReferenceExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingFeatureReferenceExpression_0=ruleEvoMappingFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingFeatureReferenceExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:1146:3: this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNestedExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNestedExpression_1=ruleEvoMappingNestedExpression();

                    state._fsp--;


                    			current = this_EvoMappingNestedExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:1155:3: this_EvoMappingNegation_2= ruleEvoMappingNegation
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNegationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNegation_2=ruleEvoMappingNegation();

                    state._fsp--;


                    			current = this_EvoMappingNegation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEvoExpressionDsl.g:1164:3: this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingConditionalFeatureReferenceExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingConditionalFeatureReferenceExpression_3=ruleEvoMappingConditionalFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingConditionalFeatureReferenceExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEvoExpressionDsl.g:1173:3: this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingContextInformationReferenceExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingContextInformationReferenceExpression_4=ruleEvoMappingContextInformationReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingContextInformationReferenceExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEvoExpressionDsl.g:1182:3: this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingAttributeReferenceExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingAttributeReferenceExpression_5=ruleEvoMappingAttributeReferenceExpression();

                    state._fsp--;


                    			current = this_EvoMappingAttributeReferenceExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEvoExpressionDsl.g:1191:3: this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingValueExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingValueExpression_6=ruleEvoMappingValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingValueExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEvoExpressionDsl.g:1200:3: this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingBooleanValueExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingBooleanValueExpression_7=ruleEvoMappingBooleanValueExpression();

                    state._fsp--;


                    			current = this_EvoMappingBooleanValueExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalEvoExpressionDsl.g:1209:3: this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMimumumExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMimumumExpression_8=ruleEvoMappingMimumumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMimumumExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalEvoExpressionDsl.g:1218:3: this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingMaximumExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingMaximumExpression_9=ruleEvoMappingMaximumExpression();

                    state._fsp--;


                    			current = this_EvoMappingMaximumExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalEvoExpressionDsl.g:1227:3: this_EvoMappingNot_10= ruleEvoMappingNot
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingTerminalAccess().getEvoMappingNotParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingNot_10=ruleEvoMappingNot();

                    state._fsp--;


                    			current = this_EvoMappingNot_10;
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
    // $ANTLR end "ruleEvoMappingTerminal"


    // $ANTLR start "entryRuleEvoMappingNestedExpression"
    // InternalEvoExpressionDsl.g:1239:1: entryRuleEvoMappingNestedExpression returns [EObject current=null] : iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF ;
    public final EObject entryRuleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNestedExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1239:67: (iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF )
            // InternalEvoExpressionDsl.g:1240:2: iv_ruleEvoMappingNestedExpression= ruleEvoMappingNestedExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNestedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNestedExpression=ruleEvoMappingNestedExpression();

            state._fsp--;

             current =iv_ruleEvoMappingNestedExpression; 
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
    // $ANTLR end "entryRuleEvoMappingNestedExpression"


    // $ANTLR start "ruleEvoMappingNestedExpression"
    // InternalEvoExpressionDsl.g:1246:1: ruleEvoMappingNestedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingNestedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1252:2: ( (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoExpressionDsl.g:1253:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoExpressionDsl.g:1253:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoExpressionDsl.g:1254:3: otherlv_0= '(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNestedExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1258:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoExpressionDsl.g:1259:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoExpressionDsl.g:1259:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoExpressionDsl.g:1260:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingNestedExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNestedExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingNestedExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleEvoMappingNestedExpression"


    // $ANTLR start "entryRuleEvoMappingNot"
    // InternalEvoExpressionDsl.g:1285:1: entryRuleEvoMappingNot returns [EObject current=null] : iv_ruleEvoMappingNot= ruleEvoMappingNot EOF ;
    public final EObject entryRuleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNot = null;


        try {
            // InternalEvoExpressionDsl.g:1285:54: (iv_ruleEvoMappingNot= ruleEvoMappingNot EOF )
            // InternalEvoExpressionDsl.g:1286:2: iv_ruleEvoMappingNot= ruleEvoMappingNot EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNot=ruleEvoMappingNot();

            state._fsp--;

             current =iv_ruleEvoMappingNot; 
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
    // $ANTLR end "entryRuleEvoMappingNot"


    // $ANTLR start "ruleEvoMappingNot"
    // InternalEvoExpressionDsl.g:1292:1: ruleEvoMappingNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) ;
    public final EObject ruleEvoMappingNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1298:2: ( (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) ) )
            // InternalEvoExpressionDsl.g:1299:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            {
            // InternalEvoExpressionDsl.g:1299:2: (otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) ) )
            // InternalEvoExpressionDsl.g:1300:3: otherlv_0= '!' ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1304:3: ( (lv_operand_1_0= ruleEvoMappingTerminal ) )
            // InternalEvoExpressionDsl.g:1305:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            {
            // InternalEvoExpressionDsl.g:1305:4: (lv_operand_1_0= ruleEvoMappingTerminal )
            // InternalEvoExpressionDsl.g:1306:5: lv_operand_1_0= ruleEvoMappingTerminal
            {

            					newCompositeNode(grammarAccess.getEvoMappingNotAccess().getOperandEvoMappingTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleEvoMappingTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingNotRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingTerminal");
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
    // $ANTLR end "ruleEvoMappingNot"


    // $ANTLR start "entryRuleEvoMappingFeatureReferenceExpression"
    // InternalEvoExpressionDsl.g:1327:1: entryRuleEvoMappingFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingFeatureReferenceExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1327:77: (iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF )
            // InternalEvoExpressionDsl.g:1328:2: iv_ruleEvoMappingFeatureReferenceExpression= ruleEvoMappingFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingFeatureReferenceExpression=ruleEvoMappingFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingFeatureReferenceExpression; 
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
    // $ANTLR end "entryRuleEvoMappingFeatureReferenceExpression"


    // $ANTLR start "ruleEvoMappingFeatureReferenceExpression"
    // InternalEvoExpressionDsl.g:1334:1: ruleEvoMappingFeatureReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleEvoMappingFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1340:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalEvoExpressionDsl.g:1341:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalEvoExpressionDsl.g:1341:2: ( (otherlv_0= RULE_STRING ) )
            // InternalEvoExpressionDsl.g:1342:3: (otherlv_0= RULE_STRING )
            {
            // InternalEvoExpressionDsl.g:1342:3: (otherlv_0= RULE_STRING )
            // InternalEvoExpressionDsl.g:1343:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoMappingFeatureReferenceExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEvoMappingFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0());
            			

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
    // $ANTLR end "ruleEvoMappingFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingConditionalFeatureReferenceExpression"
    // InternalEvoExpressionDsl.g:1357:1: entryRuleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingConditionalFeatureReferenceExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1357:88: (iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF )
            // InternalEvoExpressionDsl.g:1358:2: iv_ruleEvoMappingConditionalFeatureReferenceExpression= ruleEvoMappingConditionalFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingConditionalFeatureReferenceExpression=ruleEvoMappingConditionalFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingConditionalFeatureReferenceExpression; 
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
    // $ANTLR end "entryRuleEvoMappingConditionalFeatureReferenceExpression"


    // $ANTLR start "ruleEvoMappingConditionalFeatureReferenceExpression"
    // InternalEvoExpressionDsl.g:1364:1: ruleEvoMappingConditionalFeatureReferenceExpression returns [EObject current=null] : (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) ;
    public final EObject ruleEvoMappingConditionalFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_versionRestriction_2_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1370:2: ( (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? ) )
            // InternalEvoExpressionDsl.g:1371:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            {
            // InternalEvoExpressionDsl.g:1371:2: (otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )? )
            // InternalEvoExpressionDsl.g:1372:3: otherlv_0= '?' ( ( ruleQualifiedName ) ) ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getQuestionMarkKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1376:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:1377:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:1377:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:1378:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:1392:3: ( (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33||LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1393:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    {
                    // InternalEvoExpressionDsl.g:1393:4: (lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction )
                    // InternalEvoExpressionDsl.g:1394:5: lv_versionRestriction_2_0= ruleEvoMappingVersionRestriction
                    {

                    					newCompositeNode(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionAccess().getVersionRestrictionEvoMappingVersionRestrictionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_versionRestriction_2_0=ruleEvoMappingVersionRestriction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoMappingConditionalFeatureReferenceExpressionRule());
                    					}
                    					set(
                    						current,
                    						"versionRestriction",
                    						lv_versionRestriction_2_0,
                    						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingVersionRestriction");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleEvoMappingConditionalFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingVersionRestriction"
    // InternalEvoExpressionDsl.g:1415:1: entryRuleEvoMappingVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRestriction = null;


        try {
            // InternalEvoExpressionDsl.g:1415:69: (iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF )
            // InternalEvoExpressionDsl.g:1416:2: iv_ruleEvoMappingVersionRestriction= ruleEvoMappingVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingVersionRestriction=ruleEvoMappingVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingVersionRestriction; 
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
    // $ANTLR end "entryRuleEvoMappingVersionRestriction"


    // $ANTLR start "ruleEvoMappingVersionRestriction"
    // InternalEvoExpressionDsl.g:1422:1: ruleEvoMappingVersionRestriction returns [EObject current=null] : (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) ;
    public final EObject ruleEvoMappingVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_EvoMappingRelativeVersionRestriction_0 = null;

        EObject this_EvoMappingVersionRangeRestriction_1 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1428:2: ( (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction ) )
            // InternalEvoExpressionDsl.g:1429:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            {
            // InternalEvoExpressionDsl.g:1429:2: (this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction | this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    alt20=2;
                }
                else if ( (LA20_1==18||(LA20_1>=22 && LA20_1<=24)||LA20_1==70) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==36) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1430:3: this_EvoMappingRelativeVersionRestriction_0= ruleEvoMappingRelativeVersionRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionAccess().getEvoMappingRelativeVersionRestrictionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingRelativeVersionRestriction_0=ruleEvoMappingRelativeVersionRestriction();

                    state._fsp--;


                    			current = this_EvoMappingRelativeVersionRestriction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:1439:3: this_EvoMappingVersionRangeRestriction_1= ruleEvoMappingVersionRangeRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoMappingVersionRestrictionAccess().getEvoMappingVersionRangeRestrictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoMappingVersionRangeRestriction_1=ruleEvoMappingVersionRangeRestriction();

                    state._fsp--;


                    			current = this_EvoMappingVersionRangeRestriction_1;
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
    // $ANTLR end "ruleEvoMappingVersionRestriction"


    // $ANTLR start "entryRuleEvoMappingRelativeVersionRestriction"
    // InternalEvoExpressionDsl.g:1451:1: entryRuleEvoMappingRelativeVersionRestriction returns [EObject current=null] : iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF ;
    public final EObject entryRuleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingRelativeVersionRestriction = null;


        try {
            // InternalEvoExpressionDsl.g:1451:77: (iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF )
            // InternalEvoExpressionDsl.g:1452:2: iv_ruleEvoMappingRelativeVersionRestriction= ruleEvoMappingRelativeVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingRelativeVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingRelativeVersionRestriction=ruleEvoMappingRelativeVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingRelativeVersionRestriction; 
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
    // $ANTLR end "entryRuleEvoMappingRelativeVersionRestriction"


    // $ANTLR start "ruleEvoMappingRelativeVersionRestriction"
    // InternalEvoExpressionDsl.g:1458:1: ruleEvoMappingRelativeVersionRestriction returns [EObject current=null] : (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleEvoMappingRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1464:2: ( (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) )
            // InternalEvoExpressionDsl.g:1465:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            {
            // InternalEvoExpressionDsl.g:1465:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            // InternalEvoExpressionDsl.g:1466:3: otherlv_0= '[' ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1470:3: ( (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator ) )
            // InternalEvoExpressionDsl.g:1471:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            {
            // InternalEvoExpressionDsl.g:1471:4: (lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator )
            // InternalEvoExpressionDsl.g:1472:5: lv_operator_1_0= ruleEvoMappingRelativeVersionRestrictionOperator
            {

            					newCompositeNode(grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getOperatorEvoMappingRelativeVersionRestrictionOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_operator_1_0=ruleEvoMappingRelativeVersionRestrictionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingRelativeVersionRestrictionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingRelativeVersionRestrictionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:1489:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvoExpressionDsl.g:1490:4: (otherlv_2= RULE_ID )
            {
            // InternalEvoExpressionDsl.g:1490:4: (otherlv_2= RULE_ID )
            // InternalEvoExpressionDsl.g:1491:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingRelativeVersionRestrictionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoMappingRelativeVersionRestrictionAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEvoMappingRelativeVersionRestriction"


    // $ANTLR start "entryRuleEvoMappingVersionRangeRestriction"
    // InternalEvoExpressionDsl.g:1510:1: entryRuleEvoMappingVersionRangeRestriction returns [EObject current=null] : iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF ;
    public final EObject entryRuleEvoMappingVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingVersionRangeRestriction = null;


        try {
            // InternalEvoExpressionDsl.g:1510:74: (iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF )
            // InternalEvoExpressionDsl.g:1511:2: iv_ruleEvoMappingVersionRangeRestriction= ruleEvoMappingVersionRangeRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingVersionRangeRestriction=ruleEvoMappingVersionRangeRestriction();

            state._fsp--;

             current =iv_ruleEvoMappingVersionRangeRestriction; 
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
    // $ANTLR end "entryRuleEvoMappingVersionRangeRestriction"


    // $ANTLR start "ruleEvoMappingVersionRangeRestriction"
    // InternalEvoExpressionDsl.g:1517:1: ruleEvoMappingVersionRangeRestriction returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleEvoMappingVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerIncluded_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_upperIncluded_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1523:2: ( ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) )
            // InternalEvoExpressionDsl.g:1524:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            {
            // InternalEvoExpressionDsl.g:1524:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1525:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    {
                    // InternalEvoExpressionDsl.g:1525:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    // InternalEvoExpressionDsl.g:1526:4: otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) )
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalEvoExpressionDsl.g:1530:4: ( (lv_lowerIncluded_1_0= 'true' ) )
                    // InternalEvoExpressionDsl.g:1531:5: (lv_lowerIncluded_1_0= 'true' )
                    {
                    // InternalEvoExpressionDsl.g:1531:5: (lv_lowerIncluded_1_0= 'true' )
                    // InternalEvoExpressionDsl.g:1532:6: lv_lowerIncluded_1_0= 'true'
                    {
                    lv_lowerIncluded_1_0=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_lowerIncluded_1_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "lowerIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:1546:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    {
                    // InternalEvoExpressionDsl.g:1546:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    // InternalEvoExpressionDsl.g:1547:4: otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_1_0());
                    			
                    // InternalEvoExpressionDsl.g:1551:4: ( ( ruleQualifiedName ) )
                    // InternalEvoExpressionDsl.g:1552:5: ( ruleQualifiedName )
                    {
                    // InternalEvoExpressionDsl.g:1552:5: ( ruleQualifiedName )
                    // InternalEvoExpressionDsl.g:1553:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalEvoExpressionDsl.g:1571:4: ( (lv_upperIncluded_5_0= 'true' ) )
                    // InternalEvoExpressionDsl.g:1572:5: (lv_upperIncluded_5_0= 'true' )
                    {
                    // InternalEvoExpressionDsl.g:1572:5: (lv_upperIncluded_5_0= 'true' )
                    // InternalEvoExpressionDsl.g:1573:6: lv_upperIncluded_5_0= 'true'
                    {
                    lv_upperIncluded_5_0=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_upperIncluded_5_0, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "upperIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:1587:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    {
                    // InternalEvoExpressionDsl.g:1587:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    // InternalEvoExpressionDsl.g:1588:4: otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getFalseKeyword_2_0());
                    			
                    // InternalEvoExpressionDsl.g:1592:4: ( ( ruleQualifiedName ) )
                    // InternalEvoExpressionDsl.g:1593:5: ( ruleQualifiedName )
                    {
                    // InternalEvoExpressionDsl.g:1593:5: ( ruleQualifiedName )
                    // InternalEvoExpressionDsl.g:1594:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEvoMappingVersionRangeRestrictionAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleEvoMappingVersionRangeRestriction"


    // $ANTLR start "entryRuleEvoMappingContextInformationReferenceExpression"
    // InternalEvoExpressionDsl.g:1617:1: entryRuleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingContextInformationReferenceExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1617:88: (iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF )
            // InternalEvoExpressionDsl.g:1618:2: iv_ruleEvoMappingContextInformationReferenceExpression= ruleEvoMappingContextInformationReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingContextInformationReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingContextInformationReferenceExpression=ruleEvoMappingContextInformationReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingContextInformationReferenceExpression; 
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
    // $ANTLR end "entryRuleEvoMappingContextInformationReferenceExpression"


    // $ANTLR start "ruleEvoMappingContextInformationReferenceExpression"
    // InternalEvoExpressionDsl.g:1624:1: ruleEvoMappingContextInformationReferenceExpression returns [EObject current=null] : (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingContextInformationReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1630:2: ( (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) ) )
            // InternalEvoExpressionDsl.g:1631:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            {
            // InternalEvoExpressionDsl.g:1631:2: (otherlv_0= 'context:' ( ( ruleQualifiedName ) ) )
            // InternalEvoExpressionDsl.g:1632:3: otherlv_0= 'context:' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1636:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:1637:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:1637:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:1638:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingContextInformationReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingContextInformationReferenceExpressionAccess().getContextInformationHyContextualInformationCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleEvoMappingContextInformationReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingAttributeReferenceExpression"
    // InternalEvoExpressionDsl.g:1656:1: entryRuleEvoMappingAttributeReferenceExpression returns [EObject current=null] : iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF ;
    public final EObject entryRuleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingAttributeReferenceExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1656:79: (iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF )
            // InternalEvoExpressionDsl.g:1657:2: iv_ruleEvoMappingAttributeReferenceExpression= ruleEvoMappingAttributeReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingAttributeReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingAttributeReferenceExpression=ruleEvoMappingAttributeReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoMappingAttributeReferenceExpression; 
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
    // $ANTLR end "entryRuleEvoMappingAttributeReferenceExpression"


    // $ANTLR start "ruleEvoMappingAttributeReferenceExpression"
    // InternalEvoExpressionDsl.g:1663:1: ruleEvoMappingAttributeReferenceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEvoMappingAttributeReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1669:2: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalEvoExpressionDsl.g:1670:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalEvoExpressionDsl.g:1670:2: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalEvoExpressionDsl.g:1671:3: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalEvoExpressionDsl.g:1671:3: ( (otherlv_0= RULE_STRING ) )
            // InternalEvoExpressionDsl.g:1672:4: (otherlv_0= RULE_STRING )
            {
            // InternalEvoExpressionDsl.g:1672:4: (otherlv_0= RULE_STRING )
            // InternalEvoExpressionDsl.g:1673:5: otherlv_0= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingAttributeReferenceExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getFullStopKeyword_1());
            		
            // InternalEvoExpressionDsl.g:1688:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:1689:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:1689:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:1690:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingAttributeReferenceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoMappingAttributeReferenceExpressionAccess().getAttributeHyFeatureAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleEvoMappingAttributeReferenceExpression"


    // $ANTLR start "entryRuleEvoMappingValueExpression"
    // InternalEvoExpressionDsl.g:1708:1: entryRuleEvoMappingValueExpression returns [EObject current=null] : iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF ;
    public final EObject entryRuleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingValueExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1708:66: (iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF )
            // InternalEvoExpressionDsl.g:1709:2: iv_ruleEvoMappingValueExpression= ruleEvoMappingValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingValueExpression=ruleEvoMappingValueExpression();

            state._fsp--;

             current =iv_ruleEvoMappingValueExpression; 
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
    // $ANTLR end "entryRuleEvoMappingValueExpression"


    // $ANTLR start "ruleEvoMappingValueExpression"
    // InternalEvoExpressionDsl.g:1715:1: ruleEvoMappingValueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) ;
    public final EObject ruleEvoMappingValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1721:2: ( ( (lv_value_0_0= ruleEvoMappingNumberValue ) ) )
            // InternalEvoExpressionDsl.g:1722:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            {
            // InternalEvoExpressionDsl.g:1722:2: ( (lv_value_0_0= ruleEvoMappingNumberValue ) )
            // InternalEvoExpressionDsl.g:1723:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            {
            // InternalEvoExpressionDsl.g:1723:3: (lv_value_0_0= ruleEvoMappingNumberValue )
            // InternalEvoExpressionDsl.g:1724:4: lv_value_0_0= ruleEvoMappingNumberValue
            {

            				newCompositeNode(grammarAccess.getEvoMappingValueExpressionAccess().getValueEvoMappingNumberValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEvoMappingNumberValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEvoMappingValueExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingNumberValue");
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
    // $ANTLR end "ruleEvoMappingValueExpression"


    // $ANTLR start "entryRuleEvoMappingBooleanValueExpression"
    // InternalEvoExpressionDsl.g:1744:1: entryRuleEvoMappingBooleanValueExpression returns [EObject current=null] : iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF ;
    public final EObject entryRuleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingBooleanValueExpression = null;


        try {
            // InternalEvoExpressionDsl.g:1744:73: (iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF )
            // InternalEvoExpressionDsl.g:1745:2: iv_ruleEvoMappingBooleanValueExpression= ruleEvoMappingBooleanValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingBooleanValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingBooleanValueExpression=ruleEvoMappingBooleanValueExpression();

            state._fsp--;

             current =iv_ruleEvoMappingBooleanValueExpression; 
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
    // $ANTLR end "entryRuleEvoMappingBooleanValueExpression"


    // $ANTLR start "ruleEvoMappingBooleanValueExpression"
    // InternalEvoExpressionDsl.g:1751:1: ruleEvoMappingBooleanValueExpression returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleEvoMappingBooleanValueExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1757:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalEvoExpressionDsl.g:1758:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalEvoExpressionDsl.g:1758:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalEvoExpressionDsl.g:1759:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalEvoExpressionDsl.g:1759:3: ()
            // InternalEvoExpressionDsl.g:1760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoMappingBooleanValueExpressionAccess().getHyBooleanValueExpressionAction_0(),
            					current);
            			

            }

            // InternalEvoExpressionDsl.g:1766:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1767:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalEvoExpressionDsl.g:1767:4: ( (lv_value_1_0= 'true' ) )
                    // InternalEvoExpressionDsl.g:1768:5: (lv_value_1_0= 'true' )
                    {
                    // InternalEvoExpressionDsl.g:1768:5: (lv_value_1_0= 'true' )
                    // InternalEvoExpressionDsl.g:1769:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getEvoMappingBooleanValueExpressionAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoMappingBooleanValueExpressionRule());
                    						}
                    						setWithLastConsumed(current, "value", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:1782:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoMappingBooleanValueExpressionAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleEvoMappingBooleanValueExpression"


    // $ANTLR start "entryRuleEvoMappingNumberValue"
    // InternalEvoExpressionDsl.g:1791:1: entryRuleEvoMappingNumberValue returns [EObject current=null] : iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF ;
    public final EObject entryRuleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingNumberValue = null;


        try {
            // InternalEvoExpressionDsl.g:1791:62: (iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF )
            // InternalEvoExpressionDsl.g:1792:2: iv_ruleEvoMappingNumberValue= ruleEvoMappingNumberValue EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingNumberValue=ruleEvoMappingNumberValue();

            state._fsp--;

             current =iv_ruleEvoMappingNumberValue; 
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
    // $ANTLR end "entryRuleEvoMappingNumberValue"


    // $ANTLR start "ruleEvoMappingNumberValue"
    // InternalEvoExpressionDsl.g:1798:1: ruleEvoMappingNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEvoMappingNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1804:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalEvoExpressionDsl.g:1805:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalEvoExpressionDsl.g:1805:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalEvoExpressionDsl.g:1806:3: (lv_value_0_0= RULE_INT )
            {
            // InternalEvoExpressionDsl.g:1806:3: (lv_value_0_0= RULE_INT )
            // InternalEvoExpressionDsl.g:1807:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEvoMappingNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoMappingNumberValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleEvoMappingNumberValue"


    // $ANTLR start "entryRuleEvoMappingEnumLiteral"
    // InternalEvoExpressionDsl.g:1826:1: entryRuleEvoMappingEnumLiteral returns [EObject current=null] : iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF ;
    public final EObject entryRuleEvoMappingEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingEnumLiteral = null;


        try {
            // InternalEvoExpressionDsl.g:1826:62: (iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF )
            // InternalEvoExpressionDsl.g:1827:2: iv_ruleEvoMappingEnumLiteral= ruleEvoMappingEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingEnumLiteral=ruleEvoMappingEnumLiteral();

            state._fsp--;

             current =iv_ruleEvoMappingEnumLiteral; 
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
    // $ANTLR end "entryRuleEvoMappingEnumLiteral"


    // $ANTLR start "ruleEvoMappingEnumLiteral"
    // InternalEvoExpressionDsl.g:1833:1: ruleEvoMappingEnumLiteral returns [EObject current=null] : (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) ;
    public final EObject ruleEvoMappingEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_validSince_6_0=null;
        Token otherlv_7=null;
        Token lv_validUntil_8_0=null;
        Token lv_validSince_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_validUntil_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:1839:2: ( (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) )
            // InternalEvoExpressionDsl.g:1840:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            {
            // InternalEvoExpressionDsl.g:1840:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            // InternalEvoExpressionDsl.g:1841:3: otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingEnumLiteralAccess().getEnumLiteralKeyword_0());
            		
            // InternalEvoExpressionDsl.g:1845:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvoExpressionDsl.g:1846:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvoExpressionDsl.g:1846:4: (lv_name_1_0= RULE_ID )
            // InternalEvoExpressionDsl.g:1847:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoMappingEnumLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingEnumLiteralAccess().getCommaKeyword_2());
            		
            // InternalEvoExpressionDsl.g:1867:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalEvoExpressionDsl.g:1868:4: (lv_value_3_0= RULE_INT )
            {
            // InternalEvoExpressionDsl.g:1868:4: (lv_value_3_0= RULE_INT )
            // InternalEvoExpressionDsl.g:1869:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_value_3_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoMappingEnumLiteralAccess().getRightParenthesisKeyword_4());
            		
            // InternalEvoExpressionDsl.g:1889:3: (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEvoExpressionDsl.g:1890:4: otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvoMappingEnumLiteralAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalEvoExpressionDsl.g:1894:4: ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) )
                    int alt23=3;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_DATE) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==25) ) {
                            int LA23_3 = input.LA(3);

                            if ( (LA23_3==34) ) {
                                alt23=2;
                            }
                            else if ( (LA23_3==RULE_DATE) ) {
                                alt23=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_0==40) ) {
                        alt23=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEvoExpressionDsl.g:1895:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            {
                            // InternalEvoExpressionDsl.g:1895:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            // InternalEvoExpressionDsl.g:1896:6: ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) )
                            {
                            // InternalEvoExpressionDsl.g:1896:6: ( (lv_validSince_6_0= RULE_DATE ) )
                            // InternalEvoExpressionDsl.g:1897:7: (lv_validSince_6_0= RULE_DATE )
                            {
                            // InternalEvoExpressionDsl.g:1897:7: (lv_validSince_6_0= RULE_DATE )
                            // InternalEvoExpressionDsl.g:1898:8: lv_validSince_6_0= RULE_DATE
                            {
                            lv_validSince_6_0=(Token)match(input,RULE_DATE,FOLLOW_27); 

                            								newLeafNode(lv_validSince_6_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_6_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,25,FOLLOW_33); 

                            						newLeafNode(otherlv_7, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1());
                            					
                            // InternalEvoExpressionDsl.g:1918:6: ( (lv_validUntil_8_0= RULE_DATE ) )
                            // InternalEvoExpressionDsl.g:1919:7: (lv_validUntil_8_0= RULE_DATE )
                            {
                            // InternalEvoExpressionDsl.g:1919:7: (lv_validUntil_8_0= RULE_DATE )
                            // InternalEvoExpressionDsl.g:1920:8: lv_validUntil_8_0= RULE_DATE
                            {
                            lv_validUntil_8_0=(Token)match(input,RULE_DATE,FOLLOW_25); 

                            								newLeafNode(lv_validUntil_8_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_8_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEvoExpressionDsl.g:1938:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            {
                            // InternalEvoExpressionDsl.g:1938:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            // InternalEvoExpressionDsl.g:1939:6: ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-'
                            {
                            // InternalEvoExpressionDsl.g:1939:6: ( (lv_validSince_9_0= RULE_DATE ) )
                            // InternalEvoExpressionDsl.g:1940:7: (lv_validSince_9_0= RULE_DATE )
                            {
                            // InternalEvoExpressionDsl.g:1940:7: (lv_validSince_9_0= RULE_DATE )
                            // InternalEvoExpressionDsl.g:1941:8: lv_validSince_9_0= RULE_DATE
                            {
                            lv_validSince_9_0=(Token)match(input,RULE_DATE,FOLLOW_27); 

                            								newLeafNode(lv_validSince_9_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_9_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,25,FOLLOW_25); 

                            						newLeafNode(otherlv_10, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalEvoExpressionDsl.g:1963:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            {
                            // InternalEvoExpressionDsl.g:1963:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            // InternalEvoExpressionDsl.g:1964:6: otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) )
                            {
                            otherlv_11=(Token)match(input,40,FOLLOW_27); 

                            						newLeafNode(otherlv_11, grammarAccess.getEvoMappingEnumLiteralAccess().getEternityKeyword_5_1_2_0());
                            					
                            otherlv_12=(Token)match(input,25,FOLLOW_33); 

                            						newLeafNode(otherlv_12, grammarAccess.getEvoMappingEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1());
                            					
                            // InternalEvoExpressionDsl.g:1972:6: ( (lv_validUntil_13_0= RULE_DATE ) )
                            // InternalEvoExpressionDsl.g:1973:7: (lv_validUntil_13_0= RULE_DATE )
                            {
                            // InternalEvoExpressionDsl.g:1973:7: (lv_validUntil_13_0= RULE_DATE )
                            // InternalEvoExpressionDsl.g:1974:8: lv_validUntil_13_0= RULE_DATE
                            {
                            lv_validUntil_13_0=(Token)match(input,RULE_DATE,FOLLOW_25); 

                            								newLeafNode(lv_validUntil_13_0, grammarAccess.getEvoMappingEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_2_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoMappingEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_13_0,
                            									"de.evorepair.feature.expression.EvoExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEvoMappingEnumLiteralAccess().getRightSquareBracketKeyword_5_2());
                    			

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
    // $ANTLR end "ruleEvoMappingEnumLiteral"


    // $ANTLR start "entryRuleEvoMappingMimumumExpression"
    // InternalEvoExpressionDsl.g:2001:1: entryRuleEvoMappingMimumumExpression returns [EObject current=null] : iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF ;
    public final EObject entryRuleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMimumumExpression = null;


        try {
            // InternalEvoExpressionDsl.g:2001:68: (iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF )
            // InternalEvoExpressionDsl.g:2002:2: iv_ruleEvoMappingMimumumExpression= ruleEvoMappingMimumumExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMimumumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMimumumExpression=ruleEvoMappingMimumumExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMimumumExpression; 
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
    // $ANTLR end "entryRuleEvoMappingMimumumExpression"


    // $ANTLR start "ruleEvoMappingMimumumExpression"
    // InternalEvoExpressionDsl.g:2008:1: ruleEvoMappingMimumumExpression returns [EObject current=null] : (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMimumumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2014:2: ( (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoExpressionDsl.g:2015:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoExpressionDsl.g:2015:2: (otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoExpressionDsl.g:2016:3: otherlv_0= 'min(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMimumumExpressionAccess().getMinKeyword_0());
            		
            // InternalEvoExpressionDsl.g:2020:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoExpressionDsl.g:2021:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoExpressionDsl.g:2021:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoExpressionDsl.g:2022:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMimumumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingMimumumExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingMimumumExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleEvoMappingMimumumExpression"


    // $ANTLR start "entryRuleEvoMappingMaximumExpression"
    // InternalEvoExpressionDsl.g:2047:1: entryRuleEvoMappingMaximumExpression returns [EObject current=null] : iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF ;
    public final EObject entryRuleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoMappingMaximumExpression = null;


        try {
            // InternalEvoExpressionDsl.g:2047:68: (iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF )
            // InternalEvoExpressionDsl.g:2048:2: iv_ruleEvoMappingMaximumExpression= ruleEvoMappingMaximumExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoMappingMaximumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoMappingMaximumExpression=ruleEvoMappingMaximumExpression();

            state._fsp--;

             current =iv_ruleEvoMappingMaximumExpression; 
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
    // $ANTLR end "entryRuleEvoMappingMaximumExpression"


    // $ANTLR start "ruleEvoMappingMaximumExpression"
    // InternalEvoExpressionDsl.g:2054:1: ruleEvoMappingMaximumExpression returns [EObject current=null] : (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoMappingMaximumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2060:2: ( (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' ) )
            // InternalEvoExpressionDsl.g:2061:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            {
            // InternalEvoExpressionDsl.g:2061:2: (otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')' )
            // InternalEvoExpressionDsl.g:2062:3: otherlv_0= 'max(' ( (lv_operand_1_0= ruleEvoMappingExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoMappingMaximumExpressionAccess().getMaxKeyword_0());
            		
            // InternalEvoExpressionDsl.g:2066:3: ( (lv_operand_1_0= ruleEvoMappingExpression ) )
            // InternalEvoExpressionDsl.g:2067:4: (lv_operand_1_0= ruleEvoMappingExpression )
            {
            // InternalEvoExpressionDsl.g:2067:4: (lv_operand_1_0= ruleEvoMappingExpression )
            // InternalEvoExpressionDsl.g:2068:5: lv_operand_1_0= ruleEvoMappingExpression
            {

            					newCompositeNode(grammarAccess.getEvoMappingMaximumExpressionAccess().getOperandEvoMappingExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operand_1_0=ruleEvoMappingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoMappingMaximumExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.EvoExpressionDsl.EvoMappingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoMappingMaximumExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleEvoMappingMaximumExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEvoExpressionDsl.g:2093:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEvoExpressionDsl.g:2093:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEvoExpressionDsl.g:2094:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalEvoExpressionDsl.g:2100:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2106:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEvoExpressionDsl.g:2107:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEvoExpressionDsl.g:2107:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEvoExpressionDsl.g:2108:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEvoExpressionDsl.g:2115:3: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2116:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_22); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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


    // $ANTLR start "entryRuleEvoExpression"
    // InternalEvoExpressionDsl.g:2133:1: entryRuleEvoExpression returns [EObject current=null] : iv_ruleEvoExpression= ruleEvoExpression EOF ;
    public final EObject entryRuleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExpression = null;


        try {
            // InternalEvoExpressionDsl.g:2133:54: (iv_ruleEvoExpression= ruleEvoExpression EOF )
            // InternalEvoExpressionDsl.g:2134:2: iv_ruleEvoExpression= ruleEvoExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoExpression=ruleEvoExpression();

            state._fsp--;

             current =iv_ruleEvoExpression; 
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
    // $ANTLR end "entryRuleEvoExpression"


    // $ANTLR start "ruleEvoExpression"
    // InternalEvoExpressionDsl.g:2140:1: ruleEvoExpression returns [EObject current=null] : this_EvoXOr_0= ruleEvoXOr ;
    public final EObject ruleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoXOr_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2146:2: (this_EvoXOr_0= ruleEvoXOr )
            // InternalEvoExpressionDsl.g:2147:2: this_EvoXOr_0= ruleEvoXOr
            {

            		newCompositeNode(grammarAccess.getEvoExpressionAccess().getEvoXOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EvoXOr_0=ruleEvoXOr();

            state._fsp--;


            		current = this_EvoXOr_0;
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
    // $ANTLR end "ruleEvoExpression"


    // $ANTLR start "entryRuleEvoXOr"
    // InternalEvoExpressionDsl.g:2158:1: entryRuleEvoXOr returns [EObject current=null] : iv_ruleEvoXOr= ruleEvoXOr EOF ;
    public final EObject entryRuleEvoXOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoXOr = null;


        try {
            // InternalEvoExpressionDsl.g:2158:47: (iv_ruleEvoXOr= ruleEvoXOr EOF )
            // InternalEvoExpressionDsl.g:2159:2: iv_ruleEvoXOr= ruleEvoXOr EOF
            {
             newCompositeNode(grammarAccess.getEvoXOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoXOr=ruleEvoXOr();

            state._fsp--;

             current =iv_ruleEvoXOr; 
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
    // $ANTLR end "entryRuleEvoXOr"


    // $ANTLR start "ruleEvoXOr"
    // InternalEvoExpressionDsl.g:2165:1: ruleEvoXOr returns [EObject current=null] : (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) ;
    public final EObject ruleEvoXOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoOr_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2171:2: ( (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* ) )
            // InternalEvoExpressionDsl.g:2172:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2172:2: (this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )* )
            // InternalEvoExpressionDsl.g:2173:3: this_EvoOr_0= ruleEvoOr ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoXOrAccess().getEvoOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_EvoOr_0=ruleEvoOr();

            state._fsp--;


            			current = this_EvoOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2181:3: ( () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2182:4: () otherlv_2= 'xor' ( (lv_operand2_3_0= ruleEvoOr ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2182:4: ()
            	    // InternalEvoExpressionDsl.g:2183:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoXOrAccess().getEvoXOrOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoXOrAccess().getXorKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2193:4: ( (lv_operand2_3_0= ruleEvoOr ) )
            	    // InternalEvoExpressionDsl.g:2194:5: (lv_operand2_3_0= ruleEvoOr )
            	    {
            	    // InternalEvoExpressionDsl.g:2194:5: (lv_operand2_3_0= ruleEvoOr )
            	    // InternalEvoExpressionDsl.g:2195:6: lv_operand2_3_0= ruleEvoOr
            	    {

            	    						newCompositeNode(grammarAccess.getEvoXOrAccess().getOperand2EvoOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_operand2_3_0=ruleEvoOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoXOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoOr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleEvoXOr"


    // $ANTLR start "entryRuleEvoOr"
    // InternalEvoExpressionDsl.g:2217:1: entryRuleEvoOr returns [EObject current=null] : iv_ruleEvoOr= ruleEvoOr EOF ;
    public final EObject entryRuleEvoOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOr = null;


        try {
            // InternalEvoExpressionDsl.g:2217:46: (iv_ruleEvoOr= ruleEvoOr EOF )
            // InternalEvoExpressionDsl.g:2218:2: iv_ruleEvoOr= ruleEvoOr EOF
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
    // InternalEvoExpressionDsl.g:2224:1: ruleEvoOr returns [EObject current=null] : (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) ;
    public final EObject ruleEvoOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2230:2: ( (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) )
            // InternalEvoExpressionDsl.g:2231:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2231:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            // InternalEvoExpressionDsl.g:2232:3: this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_EvoAnd_0=ruleEvoAnd();

            state._fsp--;


            			current = this_EvoAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2240:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2241:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2241:4: ()
            	    // InternalEvoExpressionDsl.g:2242:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoOrAccess().getHyOrExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2252:4: ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    // InternalEvoExpressionDsl.g:2253:5: (lv_operand2_3_0= ruleEvoAnd )
            	    {
            	    // InternalEvoExpressionDsl.g:2253:5: (lv_operand2_3_0= ruleEvoAnd )
            	    // InternalEvoExpressionDsl.g:2254:6: lv_operand2_3_0= ruleEvoAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operand2_3_0=ruleEvoAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalEvoExpressionDsl.g:2276:1: entryRuleEvoAnd returns [EObject current=null] : iv_ruleEvoAnd= ruleEvoAnd EOF ;
    public final EObject entryRuleEvoAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAnd = null;


        try {
            // InternalEvoExpressionDsl.g:2276:47: (iv_ruleEvoAnd= ruleEvoAnd EOF )
            // InternalEvoExpressionDsl.g:2277:2: iv_ruleEvoAnd= ruleEvoAnd EOF
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
    // InternalEvoExpressionDsl.g:2283:1: ruleEvoAnd returns [EObject current=null] : (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) ;
    public final EObject ruleEvoAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2289:2: ( (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) )
            // InternalEvoExpressionDsl.g:2290:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2290:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            // InternalEvoExpressionDsl.g:2291:3: this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_EvoEqual_0=ruleEvoEqual();

            state._fsp--;


            			current = this_EvoEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2299:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2300:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2300:4: ()
            	    // InternalEvoExpressionDsl.g:2301:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoAndAccess().getHyAndExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2311:4: ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    // InternalEvoExpressionDsl.g:2312:5: (lv_operand2_3_0= ruleEvoEqual )
            	    {
            	    // InternalEvoExpressionDsl.g:2312:5: (lv_operand2_3_0= ruleEvoEqual )
            	    // InternalEvoExpressionDsl.g:2313:6: lv_operand2_3_0= ruleEvoEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operand2_3_0=ruleEvoEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoEqual");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "entryRuleEvoEqual"
    // InternalEvoExpressionDsl.g:2335:1: entryRuleEvoEqual returns [EObject current=null] : iv_ruleEvoEqual= ruleEvoEqual EOF ;
    public final EObject entryRuleEvoEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoEqual = null;


        try {
            // InternalEvoExpressionDsl.g:2335:49: (iv_ruleEvoEqual= ruleEvoEqual EOF )
            // InternalEvoExpressionDsl.g:2336:2: iv_ruleEvoEqual= ruleEvoEqual EOF
            {
             newCompositeNode(grammarAccess.getEvoEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoEqual=ruleEvoEqual();

            state._fsp--;

             current =iv_ruleEvoEqual; 
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
    // $ANTLR end "entryRuleEvoEqual"


    // $ANTLR start "ruleEvoEqual"
    // InternalEvoExpressionDsl.g:2342:1: ruleEvoEqual returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) ;
    public final EObject ruleEvoEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2348:2: ( (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) )
            // InternalEvoExpressionDsl.g:2349:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2349:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            // InternalEvoExpressionDsl.g:2350:3: this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_EvoUnequal_0=ruleEvoUnequal();

            state._fsp--;


            			current = this_EvoUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2358:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2359:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2359:4: ()
            	    // InternalEvoExpressionDsl.g:2360:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoEqualAccess().getHyEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2370:4: ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    // InternalEvoExpressionDsl.g:2371:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    {
            	    // InternalEvoExpressionDsl.g:2371:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    // InternalEvoExpressionDsl.g:2372:6: lv_operand2_3_0= ruleEvoUnequalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operand2_3_0=ruleEvoUnequalSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoUnequalSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleEvoEqual"


    // $ANTLR start "entryRuleEvoUnequalSize"
    // InternalEvoExpressionDsl.g:2394:1: entryRuleEvoUnequalSize returns [EObject current=null] : iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF ;
    public final EObject entryRuleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequalSize = null;


        try {
            // InternalEvoExpressionDsl.g:2394:55: (iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF )
            // InternalEvoExpressionDsl.g:2395:2: iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF
            {
             newCompositeNode(grammarAccess.getEvoUnequalSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoUnequalSize=ruleEvoUnequalSize();

            state._fsp--;

             current =iv_ruleEvoUnequalSize; 
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
    // $ANTLR end "entryRuleEvoUnequalSize"


    // $ANTLR start "ruleEvoUnequalSize"
    // InternalEvoExpressionDsl.g:2401:1: ruleEvoUnequalSize returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoUnequal_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2407:2: ( (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoExpressionDsl.g:2408:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoExpressionDsl.g:2408:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=30 && LA30_0<=31)||(LA30_0>=52 && LA30_0<=53)||LA30_0==55||(LA30_0>=57 && LA30_0<=59)||(LA30_0>=62 && LA30_0<=65)||(LA30_0>=67 && LA30_0<=69)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEvoExpressionDsl.g:2409:3: this_EvoUnequal_0= ruleEvoUnequal
                    {

                    			newCompositeNode(grammarAccess.getEvoUnequalSizeAccess().getEvoUnequalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoUnequal_0=ruleEvoUnequal();

                    state._fsp--;


                    			current = this_EvoUnequal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:2418:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoUnequalSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
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
    // $ANTLR end "ruleEvoUnequalSize"


    // $ANTLR start "entryRuleEvoUnequal"
    // InternalEvoExpressionDsl.g:2430:1: entryRuleEvoUnequal returns [EObject current=null] : iv_ruleEvoUnequal= ruleEvoUnequal EOF ;
    public final EObject entryRuleEvoUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequal = null;


        try {
            // InternalEvoExpressionDsl.g:2430:51: (iv_ruleEvoUnequal= ruleEvoUnequal EOF )
            // InternalEvoExpressionDsl.g:2431:2: iv_ruleEvoUnequal= ruleEvoUnequal EOF
            {
             newCompositeNode(grammarAccess.getEvoUnequalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoUnequal=ruleEvoUnequal();

            state._fsp--;

             current =iv_ruleEvoUnequal; 
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
    // $ANTLR end "entryRuleEvoUnequal"


    // $ANTLR start "ruleEvoUnequal"
    // InternalEvoExpressionDsl.g:2437:1: ruleEvoUnequal returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) ;
    public final EObject ruleEvoUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2443:2: ( (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) )
            // InternalEvoExpressionDsl.g:2444:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2444:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            // InternalEvoExpressionDsl.g:2445:3: this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_EvoImplication_0=ruleEvoImplication();

            state._fsp--;


            			current = this_EvoImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2453:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2454:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2454:4: ()
            	    // InternalEvoExpressionDsl.g:2455:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoUnequalAccess().getHyNotEqualExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2465:4: ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    // InternalEvoExpressionDsl.g:2466:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    {
            	    // InternalEvoExpressionDsl.g:2466:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    // InternalEvoExpressionDsl.g:2467:6: lv_operand2_3_0= ruleEvoImplicationSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_operand2_3_0=ruleEvoImplicationSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoUnequalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoImplicationSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleEvoUnequal"


    // $ANTLR start "entryRuleEvoImplicationSize"
    // InternalEvoExpressionDsl.g:2489:1: entryRuleEvoImplicationSize returns [EObject current=null] : iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF ;
    public final EObject entryRuleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplicationSize = null;


        try {
            // InternalEvoExpressionDsl.g:2489:59: (iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF )
            // InternalEvoExpressionDsl.g:2490:2: iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF
            {
             newCompositeNode(grammarAccess.getEvoImplicationSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoImplicationSize=ruleEvoImplicationSize();

            state._fsp--;

             current =iv_ruleEvoImplicationSize; 
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
    // $ANTLR end "entryRuleEvoImplicationSize"


    // $ANTLR start "ruleEvoImplicationSize"
    // InternalEvoExpressionDsl.g:2496:1: ruleEvoImplicationSize returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoImplication_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2502:2: ( (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoExpressionDsl.g:2503:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoExpressionDsl.g:2503:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||(LA32_0>=30 && LA32_0<=31)||(LA32_0>=52 && LA32_0<=53)||LA32_0==55||(LA32_0>=57 && LA32_0<=59)||(LA32_0>=62 && LA32_0<=65)||(LA32_0>=67 && LA32_0<=69)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_INT) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEvoExpressionDsl.g:2504:3: this_EvoImplication_0= ruleEvoImplication
                    {

                    			newCompositeNode(grammarAccess.getEvoImplicationSizeAccess().getEvoImplicationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoImplication_0=ruleEvoImplication();

                    state._fsp--;


                    			current = this_EvoImplication_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:2513:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoImplicationSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
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
    // $ANTLR end "ruleEvoImplicationSize"


    // $ANTLR start "entryRuleEvoImplication"
    // InternalEvoExpressionDsl.g:2525:1: entryRuleEvoImplication returns [EObject current=null] : iv_ruleEvoImplication= ruleEvoImplication EOF ;
    public final EObject entryRuleEvoImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplication = null;


        try {
            // InternalEvoExpressionDsl.g:2525:55: (iv_ruleEvoImplication= ruleEvoImplication EOF )
            // InternalEvoExpressionDsl.g:2526:2: iv_ruleEvoImplication= ruleEvoImplication EOF
            {
             newCompositeNode(grammarAccess.getEvoImplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoImplication=ruleEvoImplication();

            state._fsp--;

             current =iv_ruleEvoImplication; 
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
    // $ANTLR end "entryRuleEvoImplication"


    // $ANTLR start "ruleEvoImplication"
    // InternalEvoExpressionDsl.g:2532:1: ruleEvoImplication returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) ;
    public final EObject ruleEvoImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoBiconditional_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2538:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) )
            // InternalEvoExpressionDsl.g:2539:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2539:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            // InternalEvoExpressionDsl.g:2540:3: this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_EvoBiconditional_0=ruleEvoBiconditional();

            state._fsp--;


            			current = this_EvoBiconditional_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2548:3: ( () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2549:4: () otherlv_2= '=>' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2549:4: ()
            	    // InternalEvoExpressionDsl.g:2550:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoImplicationAccess().getHyImpliesExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoImplicationAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2560:4: ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    // InternalEvoExpressionDsl.g:2561:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    {
            	    // InternalEvoExpressionDsl.g:2561:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    // InternalEvoExpressionDsl.g:2562:6: lv_operand2_3_0= ruleEvoBiconditionalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_operand2_3_0=ruleEvoBiconditionalSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoImplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoBiconditionalSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleEvoImplication"


    // $ANTLR start "entryRuleEvoBiconditionalSize"
    // InternalEvoExpressionDsl.g:2584:1: entryRuleEvoBiconditionalSize returns [EObject current=null] : iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF ;
    public final EObject entryRuleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditionalSize = null;


        try {
            // InternalEvoExpressionDsl.g:2584:61: (iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF )
            // InternalEvoExpressionDsl.g:2585:2: iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF
            {
             newCompositeNode(grammarAccess.getEvoBiconditionalSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoBiconditionalSize=ruleEvoBiconditionalSize();

            state._fsp--;

             current =iv_ruleEvoBiconditionalSize; 
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
    // $ANTLR end "entryRuleEvoBiconditionalSize"


    // $ANTLR start "ruleEvoBiconditionalSize"
    // InternalEvoExpressionDsl.g:2591:1: ruleEvoBiconditionalSize returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoBiconditional_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2597:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoExpressionDsl.g:2598:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoExpressionDsl.g:2598:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||(LA34_0>=30 && LA34_0<=31)||(LA34_0>=52 && LA34_0<=53)||LA34_0==55||(LA34_0>=57 && LA34_0<=59)||(LA34_0>=62 && LA34_0<=65)||(LA34_0>=67 && LA34_0<=69)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_INT) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalEvoExpressionDsl.g:2599:3: this_EvoBiconditional_0= ruleEvoBiconditional
                    {

                    			newCompositeNode(grammarAccess.getEvoBiconditionalSizeAccess().getEvoBiconditionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoBiconditional_0=ruleEvoBiconditional();

                    state._fsp--;


                    			current = this_EvoBiconditional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:2608:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoBiconditionalSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
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
    // $ANTLR end "ruleEvoBiconditionalSize"


    // $ANTLR start "entryRuleEvoBiconditional"
    // InternalEvoExpressionDsl.g:2620:1: entryRuleEvoBiconditional returns [EObject current=null] : iv_ruleEvoBiconditional= ruleEvoBiconditional EOF ;
    public final EObject entryRuleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditional = null;


        try {
            // InternalEvoExpressionDsl.g:2620:57: (iv_ruleEvoBiconditional= ruleEvoBiconditional EOF )
            // InternalEvoExpressionDsl.g:2621:2: iv_ruleEvoBiconditional= ruleEvoBiconditional EOF
            {
             newCompositeNode(grammarAccess.getEvoBiconditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoBiconditional=ruleEvoBiconditional();

            state._fsp--;

             current =iv_ruleEvoBiconditional; 
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
    // $ANTLR end "entryRuleEvoBiconditional"


    // $ANTLR start "ruleEvoBiconditional"
    // InternalEvoExpressionDsl.g:2627:1: ruleEvoBiconditional returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) ;
    public final EObject ruleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetInclusion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2633:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) )
            // InternalEvoExpressionDsl.g:2634:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2634:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            // InternalEvoExpressionDsl.g:2635:3: this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_EvoSetInclusion_0=ruleEvoSetInclusion();

            state._fsp--;


            			current = this_EvoSetInclusion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2643:3: ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2644:4: () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2644:4: ()
            	    // InternalEvoExpressionDsl.g:2645:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoBiconditionalAccess().getEvoBinaryExpressionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2655:4: ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    // InternalEvoExpressionDsl.g:2656:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    {
            	    // InternalEvoExpressionDsl.g:2656:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    // InternalEvoExpressionDsl.g:2657:6: lv_operand2_3_0= ruleEvoSetInclusionSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_operand2_3_0=ruleEvoSetInclusionSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoBiconditionalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetInclusionSize");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleEvoBiconditional"


    // $ANTLR start "entryRuleEvoSetInclusionSize"
    // InternalEvoExpressionDsl.g:2679:1: entryRuleEvoSetInclusionSize returns [EObject current=null] : iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF ;
    public final EObject entryRuleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusionSize = null;


        try {
            // InternalEvoExpressionDsl.g:2679:60: (iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF )
            // InternalEvoExpressionDsl.g:2680:2: iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF
            {
             newCompositeNode(grammarAccess.getEvoSetInclusionSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetInclusionSize=ruleEvoSetInclusionSize();

            state._fsp--;

             current =iv_ruleEvoSetInclusionSize; 
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
    // $ANTLR end "entryRuleEvoSetInclusionSize"


    // $ANTLR start "ruleEvoSetInclusionSize"
    // InternalEvoExpressionDsl.g:2686:1: ruleEvoSetInclusionSize returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoSetInclusion_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2692:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) )
            // InternalEvoExpressionDsl.g:2693:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            {
            // InternalEvoExpressionDsl.g:2693:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||(LA36_0>=30 && LA36_0<=31)||(LA36_0>=52 && LA36_0<=53)||LA36_0==55||(LA36_0>=57 && LA36_0<=59)||(LA36_0>=62 && LA36_0<=65)||(LA36_0>=67 && LA36_0<=69)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INT) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEvoExpressionDsl.g:2694:3: this_EvoSetInclusion_0= ruleEvoSetInclusion
                    {

                    			newCompositeNode(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSetInclusionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetInclusion_0=ruleEvoSetInclusion();

                    state._fsp--;


                    			current = this_EvoSetInclusion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:2703:3: this_EvoSize_1= ruleEvoSize
                    {

                    			newCompositeNode(grammarAccess.getEvoSetInclusionSizeAccess().getEvoSizeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSize_1=ruleEvoSize();

                    state._fsp--;


                    			current = this_EvoSize_1;
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
    // $ANTLR end "ruleEvoSetInclusionSize"


    // $ANTLR start "entryRuleEvoSetInclusion"
    // InternalEvoExpressionDsl.g:2715:1: entryRuleEvoSetInclusion returns [EObject current=null] : iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF ;
    public final EObject entryRuleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusion = null;


        try {
            // InternalEvoExpressionDsl.g:2715:56: (iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF )
            // InternalEvoExpressionDsl.g:2716:2: iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF
            {
             newCompositeNode(grammarAccess.getEvoSetInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetInclusion=ruleEvoSetInclusion();

            state._fsp--;

             current =iv_ruleEvoSetInclusion; 
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
    // $ANTLR end "entryRuleEvoSetInclusion"


    // $ANTLR start "ruleEvoSetInclusion"
    // InternalEvoExpressionDsl.g:2722:1: ruleEvoSetInclusion returns [EObject current=null] : (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) ;
    public final EObject ruleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetIntersection_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2728:2: ( (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) )
            // InternalEvoExpressionDsl.g:2729:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2729:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            // InternalEvoExpressionDsl.g:2730:3: this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_EvoSetIntersection_0=ruleEvoSetIntersection();

            state._fsp--;


            			current = this_EvoSetIntersection_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2738:3: ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2739:4: () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2739:4: ()
            	    // InternalEvoExpressionDsl.g:2740:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2750:4: ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    // InternalEvoExpressionDsl.g:2751:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    {
            	    // InternalEvoExpressionDsl.g:2751:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    // InternalEvoExpressionDsl.g:2752:6: lv_operand2_3_0= ruleEvoSetIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_operand2_3_0=ruleEvoSetIntersection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetInclusionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetIntersection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleEvoSetInclusion"


    // $ANTLR start "entryRuleEvoSetIntersection"
    // InternalEvoExpressionDsl.g:2774:1: entryRuleEvoSetIntersection returns [EObject current=null] : iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF ;
    public final EObject entryRuleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetIntersection = null;


        try {
            // InternalEvoExpressionDsl.g:2774:59: (iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF )
            // InternalEvoExpressionDsl.g:2775:2: iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF
            {
             newCompositeNode(grammarAccess.getEvoSetIntersectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetIntersection=ruleEvoSetIntersection();

            state._fsp--;

             current =iv_ruleEvoSetIntersection; 
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
    // $ANTLR end "entryRuleEvoSetIntersection"


    // $ANTLR start "ruleEvoSetIntersection"
    // InternalEvoExpressionDsl.g:2781:1: ruleEvoSetIntersection returns [EObject current=null] : (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) ;
    public final EObject ruleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetUnion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2787:2: ( (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) )
            // InternalEvoExpressionDsl.g:2788:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2788:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            // InternalEvoExpressionDsl.g:2789:3: this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_EvoSetUnion_0=ruleEvoSetUnion();

            state._fsp--;


            			current = this_EvoSetUnion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2797:3: ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2798:4: () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2798:4: ()
            	    // InternalEvoExpressionDsl.g:2799:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2809:4: ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    // InternalEvoExpressionDsl.g:2810:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    {
            	    // InternalEvoExpressionDsl.g:2810:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    // InternalEvoExpressionDsl.g:2811:6: lv_operand2_3_0= ruleEvoSetUnion
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_operand2_3_0=ruleEvoSetUnion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetIntersectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetUnion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleEvoSetIntersection"


    // $ANTLR start "entryRuleEvoSetUnion"
    // InternalEvoExpressionDsl.g:2833:1: entryRuleEvoSetUnion returns [EObject current=null] : iv_ruleEvoSetUnion= ruleEvoSetUnion EOF ;
    public final EObject entryRuleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetUnion = null;


        try {
            // InternalEvoExpressionDsl.g:2833:52: (iv_ruleEvoSetUnion= ruleEvoSetUnion EOF )
            // InternalEvoExpressionDsl.g:2834:2: iv_ruleEvoSetUnion= ruleEvoSetUnion EOF
            {
             newCompositeNode(grammarAccess.getEvoSetUnionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetUnion=ruleEvoSetUnion();

            state._fsp--;

             current =iv_ruleEvoSetUnion; 
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
    // $ANTLR end "entryRuleEvoSetUnion"


    // $ANTLR start "ruleEvoSetUnion"
    // InternalEvoExpressionDsl.g:2840:1: ruleEvoSetUnion returns [EObject current=null] : (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) ;
    public final EObject ruleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2846:2: ( (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) )
            // InternalEvoExpressionDsl.g:2847:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2847:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            // InternalEvoExpressionDsl.g:2848:3: this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_EvoSetDifference_0=ruleEvoSetDifference();

            state._fsp--;


            			current = this_EvoSetDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2856:3: ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==48) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2857:4: () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2857:4: ()
            	    // InternalEvoExpressionDsl.g:2858:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2868:4: ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    // InternalEvoExpressionDsl.g:2869:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    {
            	    // InternalEvoExpressionDsl.g:2869:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    // InternalEvoExpressionDsl.g:2870:6: lv_operand2_3_0= ruleEvoSetDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_operand2_3_0=ruleEvoSetDifference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetUnionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetDifference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleEvoSetUnion"


    // $ANTLR start "entryRuleEvoSetDifference"
    // InternalEvoExpressionDsl.g:2892:1: entryRuleEvoSetDifference returns [EObject current=null] : iv_ruleEvoSetDifference= ruleEvoSetDifference EOF ;
    public final EObject entryRuleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetDifference = null;


        try {
            // InternalEvoExpressionDsl.g:2892:57: (iv_ruleEvoSetDifference= ruleEvoSetDifference EOF )
            // InternalEvoExpressionDsl.g:2893:2: iv_ruleEvoSetDifference= ruleEvoSetDifference EOF
            {
             newCompositeNode(grammarAccess.getEvoSetDifferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetDifference=ruleEvoSetDifference();

            state._fsp--;

             current =iv_ruleEvoSetDifference; 
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
    // $ANTLR end "entryRuleEvoSetDifference"


    // $ANTLR start "ruleEvoSetDifference"
    // InternalEvoExpressionDsl.g:2899:1: ruleEvoSetDifference returns [EObject current=null] : (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) ;
    public final EObject ruleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetSymmetricDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2905:2: ( (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) )
            // InternalEvoExpressionDsl.g:2906:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2906:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            // InternalEvoExpressionDsl.g:2907:3: this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_EvoSetSymmetricDifference_0=ruleEvoSetSymmetricDifference();

            state._fsp--;


            			current = this_EvoSetSymmetricDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2915:3: ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==49) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2916:4: () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2916:4: ()
            	    // InternalEvoExpressionDsl.g:2917:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2927:4: ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    // InternalEvoExpressionDsl.g:2928:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    {
            	    // InternalEvoExpressionDsl.g:2928:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    // InternalEvoExpressionDsl.g:2929:6: lv_operand2_3_0= ruleEvoSetSymmetricDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_operand2_3_0=ruleEvoSetSymmetricDifference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetDifferenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetSymmetricDifference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleEvoSetDifference"


    // $ANTLR start "entryRuleEvoSetSymmetricDifference"
    // InternalEvoExpressionDsl.g:2951:1: entryRuleEvoSetSymmetricDifference returns [EObject current=null] : iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF ;
    public final EObject entryRuleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetSymmetricDifference = null;


        try {
            // InternalEvoExpressionDsl.g:2951:66: (iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF )
            // InternalEvoExpressionDsl.g:2952:2: iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF
            {
             newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetSymmetricDifference=ruleEvoSetSymmetricDifference();

            state._fsp--;

             current =iv_ruleEvoSetSymmetricDifference; 
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
    // $ANTLR end "entryRuleEvoSetSymmetricDifference"


    // $ANTLR start "ruleEvoSetSymmetricDifference"
    // InternalEvoExpressionDsl.g:2958:1: ruleEvoSetSymmetricDifference returns [EObject current=null] : (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) ;
    public final EObject ruleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetCartesianProduct_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:2964:2: ( (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) )
            // InternalEvoExpressionDsl.g:2965:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            {
            // InternalEvoExpressionDsl.g:2965:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            // InternalEvoExpressionDsl.g:2966:3: this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_EvoSetCartesianProduct_0=ruleEvoSetCartesianProduct();

            state._fsp--;


            			current = this_EvoSetCartesianProduct_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:2974:3: ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:2975:4: () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    {
            	    // InternalEvoExpressionDsl.g:2975:4: ()
            	    // InternalEvoExpressionDsl.g:2976:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:2986:4: ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    // InternalEvoExpressionDsl.g:2987:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    {
            	    // InternalEvoExpressionDsl.g:2987:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    // InternalEvoExpressionDsl.g:2988:6: lv_operand2_3_0= ruleEvoSetCartesianProduct
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_operand2_3_0=ruleEvoSetCartesianProduct();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetSymmetricDifferenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetCartesianProduct");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleEvoSetSymmetricDifference"


    // $ANTLR start "entryRuleEvoSetCartesianProduct"
    // InternalEvoExpressionDsl.g:3010:1: entryRuleEvoSetCartesianProduct returns [EObject current=null] : iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF ;
    public final EObject entryRuleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCartesianProduct = null;


        try {
            // InternalEvoExpressionDsl.g:3010:63: (iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF )
            // InternalEvoExpressionDsl.g:3011:2: iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF
            {
             newCompositeNode(grammarAccess.getEvoSetCartesianProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetCartesianProduct=ruleEvoSetCartesianProduct();

            state._fsp--;

             current =iv_ruleEvoSetCartesianProduct; 
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
    // $ANTLR end "entryRuleEvoSetCartesianProduct"


    // $ANTLR start "ruleEvoSetCartesianProduct"
    // InternalEvoExpressionDsl.g:3017:1: ruleEvoSetCartesianProduct returns [EObject current=null] : (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) ;
    public final EObject ruleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoElementOf_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3023:2: ( (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) )
            // InternalEvoExpressionDsl.g:3024:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            {
            // InternalEvoExpressionDsl.g:3024:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            // InternalEvoExpressionDsl.g:3025:3: this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_EvoElementOf_0=ruleEvoElementOf();

            state._fsp--;


            			current = this_EvoElementOf_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:3033:3: ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==51) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:3034:4: () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    {
            	    // InternalEvoExpressionDsl.g:3034:4: ()
            	    // InternalEvoExpressionDsl.g:3035:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:3045:4: ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    // InternalEvoExpressionDsl.g:3046:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    {
            	    // InternalEvoExpressionDsl.g:3046:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    // InternalEvoExpressionDsl.g:3047:6: lv_operand2_3_0= ruleEvoElementOf
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_operand2_3_0=ruleEvoElementOf();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetCartesianProductRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoElementOf");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleEvoSetCartesianProduct"


    // $ANTLR start "entryRuleEvoSetCardinality"
    // InternalEvoExpressionDsl.g:3069:1: entryRuleEvoSetCardinality returns [EObject current=null] : iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF ;
    public final EObject entryRuleEvoSetCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCardinality = null;


        try {
            // InternalEvoExpressionDsl.g:3069:58: (iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF )
            // InternalEvoExpressionDsl.g:3070:2: iv_ruleEvoSetCardinality= ruleEvoSetCardinality EOF
            {
             newCompositeNode(grammarAccess.getEvoSetCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetCardinality=ruleEvoSetCardinality();

            state._fsp--;

             current =iv_ruleEvoSetCardinality; 
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
    // $ANTLR end "entryRuleEvoSetCardinality"


    // $ANTLR start "ruleEvoSetCardinality"
    // InternalEvoExpressionDsl.g:3076:1: ruleEvoSetCardinality returns [EObject current=null] : ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) ;
    public final EObject ruleEvoSetCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3082:2: ( ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) ) )
            // InternalEvoExpressionDsl.g:3083:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            {
            // InternalEvoExpressionDsl.g:3083:2: ( () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ) )
            // InternalEvoExpressionDsl.g:3084:3: () ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            {
            // InternalEvoExpressionDsl.g:3084:3: ()
            // InternalEvoExpressionDsl.g:3085:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSetCardinalityAccess().getEvoSetCardinalityAction_0(),
            					current);
            			

            }

            // InternalEvoExpressionDsl.g:3091:3: ( (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' ) | (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            else if ( (LA43_0==53) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalEvoExpressionDsl.g:3092:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    {
                    // InternalEvoExpressionDsl.g:3092:4: (otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|' )
                    // InternalEvoExpressionDsl.g:3093:5: otherlv_1= '|' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= '|'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_36); 

                    					newLeafNode(otherlv_1, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_0());
                    				
                    // InternalEvoExpressionDsl.g:3097:5: ( (lv_operand_2_0= ruleEvoExpression ) )
                    // InternalEvoExpressionDsl.g:3098:6: (lv_operand_2_0= ruleEvoExpression )
                    {
                    // InternalEvoExpressionDsl.g:3098:6: (lv_operand_2_0= ruleEvoExpression )
                    // InternalEvoExpressionDsl.g:3099:7: lv_operand_2_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_46);
                    lv_operand_2_0=ruleEvoExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEvoSetCardinalityRule());
                    							}
                    							set(
                    								current,
                    								"operand",
                    								lv_operand_2_0,
                    								"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getEvoSetCardinalityAccess().getVerticalLineKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:3122:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    {
                    // InternalEvoExpressionDsl.g:3122:4: (otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
                    // InternalEvoExpressionDsl.g:3123:5: otherlv_4= 'size' otherlv_5= '(' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_47); 

                    					newLeafNode(otherlv_4, grammarAccess.getEvoSetCardinalityAccess().getSizeKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,30,FOLLOW_36); 

                    					newLeafNode(otherlv_5, grammarAccess.getEvoSetCardinalityAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalEvoExpressionDsl.g:3131:5: ( (lv_operand_6_0= ruleEvoExpression ) )
                    // InternalEvoExpressionDsl.g:3132:6: (lv_operand_6_0= ruleEvoExpression )
                    {
                    // InternalEvoExpressionDsl.g:3132:6: (lv_operand_6_0= ruleEvoExpression )
                    // InternalEvoExpressionDsl.g:3133:7: lv_operand_6_0= ruleEvoExpression
                    {

                    							newCompositeNode(grammarAccess.getEvoSetCardinalityAccess().getOperandEvoExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_operand_6_0=ruleEvoExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEvoSetCardinalityRule());
                    							}
                    							set(
                    								current,
                    								"operand",
                    								lv_operand_6_0,
                    								"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getEvoSetCardinalityAccess().getRightParenthesisKeyword_1_1_3());
                    				

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
    // $ANTLR end "ruleEvoSetCardinality"


    // $ANTLR start "entryRuleEvoElementOf"
    // InternalEvoExpressionDsl.g:3160:1: entryRuleEvoElementOf returns [EObject current=null] : iv_ruleEvoElementOf= ruleEvoElementOf EOF ;
    public final EObject entryRuleEvoElementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoElementOf = null;


        try {
            // InternalEvoExpressionDsl.g:3160:53: (iv_ruleEvoElementOf= ruleEvoElementOf EOF )
            // InternalEvoExpressionDsl.g:3161:2: iv_ruleEvoElementOf= ruleEvoElementOf EOF
            {
             newCompositeNode(grammarAccess.getEvoElementOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoElementOf=ruleEvoElementOf();

            state._fsp--;

             current =iv_ruleEvoElementOf; 
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
    // $ANTLR end "entryRuleEvoElementOf"


    // $ANTLR start "ruleEvoElementOf"
    // InternalEvoExpressionDsl.g:3167:1: ruleEvoElementOf returns [EObject current=null] : (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* ) ;
    public final EObject ruleEvoElementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoTerminal_0 = null;

        EObject lv_operand2_3_1 = null;

        EObject lv_operand2_3_2 = null;

        EObject lv_operand2_3_3 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3173:2: ( (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* ) )
            // InternalEvoExpressionDsl.g:3174:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* )
            {
            // InternalEvoExpressionDsl.g:3174:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )* )
            // InternalEvoExpressionDsl.g:3175:3: this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_EvoTerminal_0=ruleEvoTerminal();

            state._fsp--;


            			current = this_EvoTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEvoExpressionDsl.g:3183:3: ( () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==54) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:3184:4: () otherlv_2= 'elementOf' ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) )
            	    {
            	    // InternalEvoExpressionDsl.g:3184:4: ()
            	    // InternalEvoExpressionDsl.g:3185:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoElementOfAccess().getEvoElementOfOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_49); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1());
            	    			
            	    // InternalEvoExpressionDsl.g:3195:4: ( ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) ) )
            	    // InternalEvoExpressionDsl.g:3196:5: ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) )
            	    {
            	    // InternalEvoExpressionDsl.g:3196:5: ( (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal ) )
            	    // InternalEvoExpressionDsl.g:3197:6: (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal )
            	    {
            	    // InternalEvoExpressionDsl.g:3197:6: (lv_operand2_3_1= ruleEvoTerminal | lv_operand2_3_2= ruleEvoAllMappingTerminal | lv_operand2_3_3= ruleEvoAllConfigurationTerminal )
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 30:
            	    case 31:
            	    case 52:
            	    case 53:
            	    case 55:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 62:
            	    case 63:
            	    case 64:
            	    case 65:
            	    case 67:
            	    case 68:
            	    case 69:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // InternalEvoExpressionDsl.g:3198:7: lv_operand2_3_1= ruleEvoTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_48);
            	            lv_operand2_3_1=ruleEvoTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_1,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEvoExpressionDsl.g:3214:7: lv_operand2_3_2= ruleEvoAllMappingTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoAllMappingTerminalParserRuleCall_1_2_0_1());
            	            						
            	            pushFollow(FOLLOW_48);
            	            lv_operand2_3_2=ruleEvoAllMappingTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_2,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoAllMappingTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalEvoExpressionDsl.g:3230:7: lv_operand2_3_3= ruleEvoAllConfigurationTerminal
            	            {

            	            							newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoAllConfigurationTerminalParserRuleCall_1_2_0_2());
            	            						
            	            pushFollow(FOLLOW_48);
            	            lv_operand2_3_3=ruleEvoAllConfigurationTerminal();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	            							}
            	            							set(
            	            								current,
            	            								"operand2",
            	            								lv_operand2_3_3,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoAllConfigurationTerminal");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleEvoElementOf"


    // $ANTLR start "entryRuleEvoForAll"
    // InternalEvoExpressionDsl.g:3253:1: entryRuleEvoForAll returns [EObject current=null] : iv_ruleEvoForAll= ruleEvoForAll EOF ;
    public final EObject entryRuleEvoForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoForAll = null;


        try {
            // InternalEvoExpressionDsl.g:3253:50: (iv_ruleEvoForAll= ruleEvoForAll EOF )
            // InternalEvoExpressionDsl.g:3254:2: iv_ruleEvoForAll= ruleEvoForAll EOF
            {
             newCompositeNode(grammarAccess.getEvoForAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoForAll=ruleEvoForAll();

            state._fsp--;

             current =iv_ruleEvoForAll; 
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
    // $ANTLR end "entryRuleEvoForAll"


    // $ANTLR start "ruleEvoForAll"
    // InternalEvoExpressionDsl.g:3260:1: ruleEvoForAll returns [EObject current=null] : (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleEvoForAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_boundedVariables_2_0 = null;

        EObject lv_boundedVariables_4_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3266:2: ( (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' ) )
            // InternalEvoExpressionDsl.g:3267:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            {
            // InternalEvoExpressionDsl.g:3267:2: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')' )
            // InternalEvoExpressionDsl.g:3268:3: otherlv_0= 'forAll' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )* otherlv_5= ':' ( (lv_operand_6_0= ruleEvoExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoForAllAccess().getForAllKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoForAllAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:3276:3: ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:3277:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:3277:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:3278:5: lv_boundedVariables_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_boundedVariables_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:3295:3: (otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==20) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:3296:4: otherlv_3= ',' ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEvoForAllAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalEvoExpressionDsl.g:3300:4: ( (lv_boundedVariables_4_0= ruleEvoVariableTerm ) )
            	    // InternalEvoExpressionDsl.g:3301:5: (lv_boundedVariables_4_0= ruleEvoVariableTerm )
            	    {
            	    // InternalEvoExpressionDsl.g:3301:5: (lv_boundedVariables_4_0= ruleEvoVariableTerm )
            	    // InternalEvoExpressionDsl.g:3302:6: lv_boundedVariables_4_0= ruleEvoVariableTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEvoForAllAccess().getBoundedVariablesEvoVariableTermParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_boundedVariables_4_0=ruleEvoVariableTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boundedVariables",
            	    							lv_boundedVariables_4_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,56,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoForAllAccess().getColonKeyword_4());
            		
            // InternalEvoExpressionDsl.g:3324:3: ( (lv_operand_6_0= ruleEvoExpression ) )
            // InternalEvoExpressionDsl.g:3325:4: (lv_operand_6_0= ruleEvoExpression )
            {
            // InternalEvoExpressionDsl.g:3325:4: (lv_operand_6_0= ruleEvoExpression )
            // InternalEvoExpressionDsl.g:3326:5: lv_operand_6_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoForAllAccess().getOperandEvoExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_operand_6_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoForAllRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_6_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoForAllAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleEvoForAll"


    // $ANTLR start "entryRuleEvoExists"
    // InternalEvoExpressionDsl.g:3351:1: entryRuleEvoExists returns [EObject current=null] : iv_ruleEvoExists= ruleEvoExists EOF ;
    public final EObject entryRuleEvoExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExists = null;


        try {
            // InternalEvoExpressionDsl.g:3351:50: (iv_ruleEvoExists= ruleEvoExists EOF )
            // InternalEvoExpressionDsl.g:3352:2: iv_ruleEvoExists= ruleEvoExists EOF
            {
             newCompositeNode(grammarAccess.getEvoExistsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoExists=ruleEvoExists();

            state._fsp--;

             current =iv_ruleEvoExists; 
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
    // $ANTLR end "entryRuleEvoExists"


    // $ANTLR start "ruleEvoExists"
    // InternalEvoExpressionDsl.g:3358:1: ruleEvoExists returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEvoExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_boundedVariables_2_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3364:2: ( (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' ) )
            // InternalEvoExpressionDsl.g:3365:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            {
            // InternalEvoExpressionDsl.g:3365:2: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')' )
            // InternalEvoExpressionDsl.g:3366:3: otherlv_0= 'exists' otherlv_1= '(' ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) ) otherlv_3= ':' ( (lv_operand_4_0= ruleEvoExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoExistsAccess().getExistsKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoExistsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:3374:3: ( (lv_boundedVariables_2_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:3375:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:3375:4: (lv_boundedVariables_2_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:3376:5: lv_boundedVariables_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getBoundedVariablesEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_boundedVariables_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					add(
            						current,
            						"boundedVariables",
            						lv_boundedVariables_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoExistsAccess().getColonKeyword_3());
            		
            // InternalEvoExpressionDsl.g:3397:3: ( (lv_operand_4_0= ruleEvoExpression ) )
            // InternalEvoExpressionDsl.g:3398:4: (lv_operand_4_0= ruleEvoExpression )
            {
            // InternalEvoExpressionDsl.g:3398:4: (lv_operand_4_0= ruleEvoExpression )
            // InternalEvoExpressionDsl.g:3399:5: lv_operand_4_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoExistsAccess().getOperandEvoExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_operand_4_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoExistsRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_4_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEvoExistsAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEvoExists"


    // $ANTLR start "entryRuleEvoNot"
    // InternalEvoExpressionDsl.g:3424:1: entryRuleEvoNot returns [EObject current=null] : iv_ruleEvoNot= ruleEvoNot EOF ;
    public final EObject entryRuleEvoNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNot = null;


        try {
            // InternalEvoExpressionDsl.g:3424:47: (iv_ruleEvoNot= ruleEvoNot EOF )
            // InternalEvoExpressionDsl.g:3425:2: iv_ruleEvoNot= ruleEvoNot EOF
            {
             newCompositeNode(grammarAccess.getEvoNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoNot=ruleEvoNot();

            state._fsp--;

             current =iv_ruleEvoNot; 
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
    // $ANTLR end "entryRuleEvoNot"


    // $ANTLR start "ruleEvoNot"
    // InternalEvoExpressionDsl.g:3431:1: ruleEvoNot returns [EObject current=null] : ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) ) ;
    public final EObject ruleEvoNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3437:2: ( ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) ) )
            // InternalEvoExpressionDsl.g:3438:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) )
            {
            // InternalEvoExpressionDsl.g:3438:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) | (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            else if ( (LA47_0==31) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEvoExpressionDsl.g:3439:3: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
                    {
                    // InternalEvoExpressionDsl.g:3439:3: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
                    // InternalEvoExpressionDsl.g:3440:4: otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_47); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoNotAccess().getNotKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,30,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalEvoExpressionDsl.g:3448:4: ( (lv_operand_2_0= ruleEvoExpression ) )
                    // InternalEvoExpressionDsl.g:3449:5: (lv_operand_2_0= ruleEvoExpression )
                    {
                    // InternalEvoExpressionDsl.g:3449:5: (lv_operand_2_0= ruleEvoExpression )
                    // InternalEvoExpressionDsl.g:3450:6: lv_operand_2_0= ruleEvoExpression
                    {

                    						newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operand_2_0=ruleEvoExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoNotRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"de.evorepair.logic.EvoLogicDsl.EvoExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:3473:3: (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) )
                    {
                    // InternalEvoExpressionDsl.g:3473:3: (otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) ) )
                    // InternalEvoExpressionDsl.g:3474:4: otherlv_4= '!' ( (lv_operand_5_0= ruleEvoVariableTerm ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoNotAccess().getExclamationMarkKeyword_1_0());
                    			
                    // InternalEvoExpressionDsl.g:3478:4: ( (lv_operand_5_0= ruleEvoVariableTerm ) )
                    // InternalEvoExpressionDsl.g:3479:5: (lv_operand_5_0= ruleEvoVariableTerm )
                    {
                    // InternalEvoExpressionDsl.g:3479:5: (lv_operand_5_0= ruleEvoVariableTerm )
                    // InternalEvoExpressionDsl.g:3480:6: lv_operand_5_0= ruleEvoVariableTerm
                    {

                    						newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoVariableTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_5_0=ruleEvoVariableTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoNotRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleEvoNot"


    // $ANTLR start "entryRuleEvoSatisfiable"
    // InternalEvoExpressionDsl.g:3502:1: entryRuleEvoSatisfiable returns [EObject current=null] : iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF ;
    public final EObject entryRuleEvoSatisfiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSatisfiable = null;


        try {
            // InternalEvoExpressionDsl.g:3502:55: (iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF )
            // InternalEvoExpressionDsl.g:3503:2: iv_ruleEvoSatisfiable= ruleEvoSatisfiable EOF
            {
             newCompositeNode(grammarAccess.getEvoSatisfiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSatisfiable=ruleEvoSatisfiable();

            state._fsp--;

             current =iv_ruleEvoSatisfiable; 
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
    // $ANTLR end "entryRuleEvoSatisfiable"


    // $ANTLR start "ruleEvoSatisfiable"
    // InternalEvoExpressionDsl.g:3509:1: ruleEvoSatisfiable returns [EObject current=null] : ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEvoSatisfiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_3_1 = null;

        EObject lv_variables_3_2 = null;

        EObject lv_variables_5_1 = null;

        EObject lv_variables_5_2 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3515:2: ( ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' ) )
            // InternalEvoExpressionDsl.g:3516:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            {
            // InternalEvoExpressionDsl.g:3516:2: ( () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')' )
            // InternalEvoExpressionDsl.g:3517:3: () otherlv_1= 'satisfiable' otherlv_2= '(' ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )* otherlv_6= ')'
            {
            // InternalEvoExpressionDsl.g:3517:3: ()
            // InternalEvoExpressionDsl.g:3518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSatisfiableAccess().getEvoSatisfiableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSatisfiableAccess().getSatisfiableKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoSatisfiableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEvoExpressionDsl.g:3532:3: ( ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) ) )
            // InternalEvoExpressionDsl.g:3533:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            {
            // InternalEvoExpressionDsl.g:3533:4: ( (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm ) )
            // InternalEvoExpressionDsl.g:3534:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            {
            // InternalEvoExpressionDsl.g:3534:5: (lv_variables_3_1= ruleEvoSetVariable | lv_variables_3_2= ruleEvoApplicationConstraintTerm )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==31||LA48_0==58||LA48_0==65) ) {
                alt48=1;
            }
            else if ( (LA48_0==62) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalEvoExpressionDsl.g:3535:6: lv_variables_3_1= ruleEvoSetVariable
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variables_3_1=ruleEvoSetVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_1,
                    							"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:3551:6: lv_variables_3_2= ruleEvoApplicationConstraintTerm
                    {

                    						newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variables_3_2=ruleEvoApplicationConstraintTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_2,
                    							"de.evorepair.logic.EvoLogicDsl.EvoApplicationConstraintTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalEvoExpressionDsl.g:3569:3: (otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:3570:4: otherlv_4= ',' ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_52); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEvoSatisfiableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEvoExpressionDsl.g:3574:4: ( ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) ) )
            	    // InternalEvoExpressionDsl.g:3575:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    {
            	    // InternalEvoExpressionDsl.g:3575:5: ( (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm ) )
            	    // InternalEvoExpressionDsl.g:3576:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    {
            	    // InternalEvoExpressionDsl.g:3576:6: (lv_variables_5_1= ruleEvoSetVariable | lv_variables_5_2= ruleEvoApplicationConstraintTerm )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_ID||LA49_0==31||LA49_0==58||LA49_0==65) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==62) ) {
            	        alt49=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalEvoExpressionDsl.g:3577:7: lv_variables_5_1= ruleEvoSetVariable
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoSetVariableParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_12);
            	            lv_variables_5_1=ruleEvoSetVariable();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"variables",
            	            								lv_variables_5_1,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEvoExpressionDsl.g:3593:7: lv_variables_5_2= ruleEvoApplicationConstraintTerm
            	            {

            	            							newCompositeNode(grammarAccess.getEvoSatisfiableAccess().getVariablesEvoApplicationConstraintTermParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_12);
            	            lv_variables_5_2=ruleEvoApplicationConstraintTerm();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getEvoSatisfiableRule());
            	            							}
            	            							add(
            	            								current,
            	            								"variables",
            	            								lv_variables_5_2,
            	            								"de.evorepair.logic.EvoLogicDsl.EvoApplicationConstraintTerm");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEvoSatisfiableAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEvoSatisfiable"


    // $ANTLR start "entryRuleEvoTerminal"
    // InternalEvoExpressionDsl.g:3620:1: entryRuleEvoTerminal returns [EObject current=null] : iv_ruleEvoTerminal= ruleEvoTerminal EOF ;
    public final EObject entryRuleEvoTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoTerminal = null;


        try {
            // InternalEvoExpressionDsl.g:3620:52: (iv_ruleEvoTerminal= ruleEvoTerminal EOF )
            // InternalEvoExpressionDsl.g:3621:2: iv_ruleEvoTerminal= ruleEvoTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoTerminal=ruleEvoTerminal();

            state._fsp--;

             current =iv_ruleEvoTerminal; 
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
    // $ANTLR end "entryRuleEvoTerminal"


    // $ANTLR start "ruleEvoTerminal"
    // InternalEvoExpressionDsl.g:3627:1: ruleEvoTerminal returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) ;
    public final EObject ruleEvoTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoApplicationConstraintTerm_2 = null;

        EObject this_EvoForAll_3 = null;

        EObject this_EvoExists_4 = null;

        EObject this_EvoNot_5 = null;

        EObject this_EvoFeatureType_6 = null;

        EObject this_EvoGroupType_7 = null;

        EObject this_EvoSetCardinality_8 = null;

        EObject this_EvoChildrenOf_9 = null;

        EObject this_EvoParentOf_10 = null;

        EObject this_EvoSiblingsOf_11 = null;

        EObject this_EvoSatisfiable_12 = null;

        EObject this_EvoXOr_14 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3633:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) ) )
            // InternalEvoExpressionDsl.g:3634:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            {
            // InternalEvoExpressionDsl.g:3634:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm | this_EvoForAll_3= ruleEvoForAll | this_EvoExists_4= ruleEvoExists | this_EvoNot_5= ruleEvoNot | this_EvoFeatureType_6= ruleEvoFeatureType | this_EvoGroupType_7= ruleEvoGroupType | this_EvoSetCardinality_8= ruleEvoSetCardinality | this_EvoChildrenOf_9= ruleEvoChildrenOf | this_EvoParentOf_10= ruleEvoParentOf | this_EvoSiblingsOf_11= ruleEvoSiblingsOf | this_EvoSatisfiable_12= ruleEvoSatisfiable | (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' ) )
            int alt51=14;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case 65:
                {
                alt51=2;
                }
                break;
            case 62:
                {
                alt51=3;
                }
                break;
            case 55:
                {
                alt51=4;
                }
                break;
            case 57:
                {
                alt51=5;
                }
                break;
            case 31:
            case 58:
                {
                alt51=6;
                }
                break;
            case 63:
                {
                alt51=7;
                }
                break;
            case 64:
                {
                alt51=8;
                }
                break;
            case 52:
            case 53:
                {
                alt51=9;
                }
                break;
            case 69:
                {
                alt51=10;
                }
                break;
            case 67:
                {
                alt51=11;
                }
                break;
            case 68:
                {
                alt51=12;
                }
                break;
            case 59:
                {
                alt51=13;
                }
                break;
            case 30:
                {
                alt51=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalEvoExpressionDsl.g:3635:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoVariableTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_0=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:3644:3: this_EvoSetTerm_1= ruleEvoSetTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSetTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetTerm_1=ruleEvoSetTerm();

                    state._fsp--;


                    			current = this_EvoSetTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:3653:3: this_EvoApplicationConstraintTerm_2= ruleEvoApplicationConstraintTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoApplicationConstraintTermParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoApplicationConstraintTerm_2=ruleEvoApplicationConstraintTerm();

                    state._fsp--;


                    			current = this_EvoApplicationConstraintTerm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEvoExpressionDsl.g:3662:3: this_EvoForAll_3= ruleEvoForAll
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoForAllParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoForAll_3=ruleEvoForAll();

                    state._fsp--;


                    			current = this_EvoForAll_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEvoExpressionDsl.g:3671:3: this_EvoExists_4= ruleEvoExists
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoExistsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoExists_4=ruleEvoExists();

                    state._fsp--;


                    			current = this_EvoExists_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEvoExpressionDsl.g:3680:3: this_EvoNot_5= ruleEvoNot
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoNotParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNot_5=ruleEvoNot();

                    state._fsp--;


                    			current = this_EvoNot_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEvoExpressionDsl.g:3689:3: this_EvoFeatureType_6= ruleEvoFeatureType
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoFeatureTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoFeatureType_6=ruleEvoFeatureType();

                    state._fsp--;


                    			current = this_EvoFeatureType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEvoExpressionDsl.g:3698:3: this_EvoGroupType_7= ruleEvoGroupType
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoGroupTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoGroupType_7=ruleEvoGroupType();

                    state._fsp--;


                    			current = this_EvoGroupType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalEvoExpressionDsl.g:3707:3: this_EvoSetCardinality_8= ruleEvoSetCardinality
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSetCardinalityParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetCardinality_8=ruleEvoSetCardinality();

                    state._fsp--;


                    			current = this_EvoSetCardinality_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalEvoExpressionDsl.g:3716:3: this_EvoChildrenOf_9= ruleEvoChildrenOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoChildrenOfParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoChildrenOf_9=ruleEvoChildrenOf();

                    state._fsp--;


                    			current = this_EvoChildrenOf_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalEvoExpressionDsl.g:3725:3: this_EvoParentOf_10= ruleEvoParentOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoParentOfParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoParentOf_10=ruleEvoParentOf();

                    state._fsp--;


                    			current = this_EvoParentOf_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalEvoExpressionDsl.g:3734:3: this_EvoSiblingsOf_11= ruleEvoSiblingsOf
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSiblingsOfParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSiblingsOf_11=ruleEvoSiblingsOf();

                    state._fsp--;


                    			current = this_EvoSiblingsOf_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalEvoExpressionDsl.g:3743:3: this_EvoSatisfiable_12= ruleEvoSatisfiable
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoSatisfiableParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSatisfiable_12=ruleEvoSatisfiable();

                    state._fsp--;


                    			current = this_EvoSatisfiable_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalEvoExpressionDsl.g:3752:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    {
                    // InternalEvoExpressionDsl.g:3752:3: (otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')' )
                    // InternalEvoExpressionDsl.g:3753:4: otherlv_13= '(' this_EvoXOr_14= ruleEvoXOr otherlv_15= ')'
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getEvoTerminalAccess().getLeftParenthesisKeyword_13_0());
                    			

                    				newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoXOrParserRuleCall_13_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_EvoXOr_14=ruleEvoXOr();

                    state._fsp--;


                    				current = this_EvoXOr_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvoTerminalAccess().getRightParenthesisKeyword_13_2());
                    			

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
    // $ANTLR end "ruleEvoTerminal"


    // $ANTLR start "entryRuleEvoAllMappingTerminal"
    // InternalEvoExpressionDsl.g:3774:1: entryRuleEvoAllMappingTerminal returns [EObject current=null] : iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF ;
    public final EObject entryRuleEvoAllMappingTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAllMappingTerminal = null;


        try {
            // InternalEvoExpressionDsl.g:3774:62: (iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF )
            // InternalEvoExpressionDsl.g:3775:2: iv_ruleEvoAllMappingTerminal= ruleEvoAllMappingTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoAllMappingTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAllMappingTerminal=ruleEvoAllMappingTerminal();

            state._fsp--;

             current =iv_ruleEvoAllMappingTerminal; 
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
    // $ANTLR end "entryRuleEvoAllMappingTerminal"


    // $ANTLR start "ruleEvoAllMappingTerminal"
    // InternalEvoExpressionDsl.g:3781:1: ruleEvoAllMappingTerminal returns [EObject current=null] : ( () otherlv_1= 'All_Mappings' ) ;
    public final EObject ruleEvoAllMappingTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3787:2: ( ( () otherlv_1= 'All_Mappings' ) )
            // InternalEvoExpressionDsl.g:3788:2: ( () otherlv_1= 'All_Mappings' )
            {
            // InternalEvoExpressionDsl.g:3788:2: ( () otherlv_1= 'All_Mappings' )
            // InternalEvoExpressionDsl.g:3789:3: () otherlv_1= 'All_Mappings'
            {
            // InternalEvoExpressionDsl.g:3789:3: ()
            // InternalEvoExpressionDsl.g:3790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoAllMappingTerminalAccess().getEvoAllMappingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoAllMappingTerminalAccess().getAll_MappingsKeyword_1());
            		

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
    // $ANTLR end "ruleEvoAllMappingTerminal"


    // $ANTLR start "entryRuleEvoAllConfigurationTerminal"
    // InternalEvoExpressionDsl.g:3804:1: entryRuleEvoAllConfigurationTerminal returns [EObject current=null] : iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF ;
    public final EObject entryRuleEvoAllConfigurationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAllConfigurationTerminal = null;


        try {
            // InternalEvoExpressionDsl.g:3804:68: (iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF )
            // InternalEvoExpressionDsl.g:3805:2: iv_ruleEvoAllConfigurationTerminal= ruleEvoAllConfigurationTerminal EOF
            {
             newCompositeNode(grammarAccess.getEvoAllConfigurationTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoAllConfigurationTerminal=ruleEvoAllConfigurationTerminal();

            state._fsp--;

             current =iv_ruleEvoAllConfigurationTerminal; 
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
    // $ANTLR end "entryRuleEvoAllConfigurationTerminal"


    // $ANTLR start "ruleEvoAllConfigurationTerminal"
    // InternalEvoExpressionDsl.g:3811:1: ruleEvoAllConfigurationTerminal returns [EObject current=null] : ( () otherlv_1= 'All_Configurations' ) ;
    public final EObject ruleEvoAllConfigurationTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3817:2: ( ( () otherlv_1= 'All_Configurations' ) )
            // InternalEvoExpressionDsl.g:3818:2: ( () otherlv_1= 'All_Configurations' )
            {
            // InternalEvoExpressionDsl.g:3818:2: ( () otherlv_1= 'All_Configurations' )
            // InternalEvoExpressionDsl.g:3819:3: () otherlv_1= 'All_Configurations'
            {
            // InternalEvoExpressionDsl.g:3819:3: ()
            // InternalEvoExpressionDsl.g:3820:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoAllConfigurationTerminalAccess().getEvoAllConfigurationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoAllConfigurationTerminalAccess().getAll_ConfigurationsKeyword_1());
            		

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
    // $ANTLR end "ruleEvoAllConfigurationTerminal"


    // $ANTLR start "entryRuleEvoSize"
    // InternalEvoExpressionDsl.g:3834:1: entryRuleEvoSize returns [EObject current=null] : iv_ruleEvoSize= ruleEvoSize EOF ;
    public final EObject entryRuleEvoSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSize = null;


        try {
            // InternalEvoExpressionDsl.g:3834:48: (iv_ruleEvoSize= ruleEvoSize EOF )
            // InternalEvoExpressionDsl.g:3835:2: iv_ruleEvoSize= ruleEvoSize EOF
            {
             newCompositeNode(grammarAccess.getEvoSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSize=ruleEvoSize();

            state._fsp--;

             current =iv_ruleEvoSize; 
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
    // $ANTLR end "entryRuleEvoSize"


    // $ANTLR start "ruleEvoSize"
    // InternalEvoExpressionDsl.g:3841:1: ruleEvoSize returns [EObject current=null] : ( () ( (lv_size_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEvoSize() throws RecognitionException {
        EObject current = null;

        Token lv_size_1_0=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3847:2: ( ( () ( (lv_size_1_0= RULE_INT ) ) ) )
            // InternalEvoExpressionDsl.g:3848:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            {
            // InternalEvoExpressionDsl.g:3848:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            // InternalEvoExpressionDsl.g:3849:3: () ( (lv_size_1_0= RULE_INT ) )
            {
            // InternalEvoExpressionDsl.g:3849:3: ()
            // InternalEvoExpressionDsl.g:3850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSizeAccess().getEvoSizeAction_0(),
            					current);
            			

            }

            // InternalEvoExpressionDsl.g:3856:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalEvoExpressionDsl.g:3857:4: (lv_size_1_0= RULE_INT )
            {
            // InternalEvoExpressionDsl.g:3857:4: (lv_size_1_0= RULE_INT )
            // InternalEvoExpressionDsl.g:3858:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_size_1_0, grammarAccess.getEvoSizeAccess().getSizeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleEvoSize"


    // $ANTLR start "entryRuleEvoVariableTerm"
    // InternalEvoExpressionDsl.g:3878:1: entryRuleEvoVariableTerm returns [EObject current=null] : iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF ;
    public final EObject entryRuleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableTerm = null;


        try {
            // InternalEvoExpressionDsl.g:3878:56: (iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF )
            // InternalEvoExpressionDsl.g:3879:2: iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF
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
    // InternalEvoExpressionDsl.g:3885:1: ruleEvoVariableTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3891:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalEvoExpressionDsl.g:3892:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalEvoExpressionDsl.g:3892:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalEvoExpressionDsl.g:3893:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalEvoExpressionDsl.g:3893:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:3894:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:3894:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:3895:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:3909:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=71 && LA52_0<=73)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEvoExpressionDsl.g:3910:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalEvoExpressionDsl.g:3910:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalEvoExpressionDsl.g:3911:5: lv_type_1_0= ruleEvoVariableType
                    {

                    					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleEvoVariableType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoVariableTermRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.evorepair.logic.EvoLogicDsl.EvoVariableType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleEvoVariableTerm"


    // $ANTLR start "entryRuleEvoApplicationConstraintTerm"
    // InternalEvoExpressionDsl.g:3932:1: entryRuleEvoApplicationConstraintTerm returns [EObject current=null] : iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF ;
    public final EObject entryRuleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoApplicationConstraintTerm = null;


        try {
            // InternalEvoExpressionDsl.g:3932:69: (iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF )
            // InternalEvoExpressionDsl.g:3933:2: iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoApplicationConstraintTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoApplicationConstraintTerm=ruleEvoApplicationConstraintTerm();

            state._fsp--;

             current =iv_ruleEvoApplicationConstraintTerm; 
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
    // $ANTLR end "entryRuleEvoApplicationConstraintTerm"


    // $ANTLR start "ruleEvoApplicationConstraintTerm"
    // InternalEvoExpressionDsl.g:3939:1: ruleEvoApplicationConstraintTerm returns [EObject current=null] : (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3945:2: ( (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // InternalEvoExpressionDsl.g:3946:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // InternalEvoExpressionDsl.g:3946:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // InternalEvoExpressionDsl.g:3947:3: otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:3955:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:3956:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:3956:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:3957:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoApplicationConstraintTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoApplicationConstraintTermAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEvoApplicationConstraintTerm"


    // $ANTLR start "entryRuleEvoFeatureType"
    // InternalEvoExpressionDsl.g:3979:1: entryRuleEvoFeatureType returns [EObject current=null] : iv_ruleEvoFeatureType= ruleEvoFeatureType EOF ;
    public final EObject entryRuleEvoFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureType = null;


        try {
            // InternalEvoExpressionDsl.g:3979:55: (iv_ruleEvoFeatureType= ruleEvoFeatureType EOF )
            // InternalEvoExpressionDsl.g:3980:2: iv_ruleEvoFeatureType= ruleEvoFeatureType EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureType=ruleEvoFeatureType();

            state._fsp--;

             current =iv_ruleEvoFeatureType; 
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
    // $ANTLR end "entryRuleEvoFeatureType"


    // $ANTLR start "ruleEvoFeatureType"
    // InternalEvoExpressionDsl.g:3986:1: ruleEvoFeatureType returns [EObject current=null] : ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) ;
    public final EObject ruleEvoFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:3992:2: ( ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) ) )
            // InternalEvoExpressionDsl.g:3993:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            {
            // InternalEvoExpressionDsl.g:3993:2: ( () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) ) )
            // InternalEvoExpressionDsl.g:3994:3: () otherlv_1= 'featureType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            {
            // InternalEvoExpressionDsl.g:3994:3: ()
            // InternalEvoExpressionDsl.g:3995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoFeatureTypeAccess().getEvoFeatureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoFeatureTypeAccess().getFeatureTypeKeyword_1());
            		
            // InternalEvoExpressionDsl.g:4005:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')' )
            // InternalEvoExpressionDsl.g:4006:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoVariableTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoFeatureTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalEvoExpressionDsl.g:4010:4: ( (lv_variables_3_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:4011:5: (lv_variables_3_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:4011:5: (lv_variables_3_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:4012:6: lv_variables_3_0= ruleEvoVariableTerm
            {

            						newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_variables_3_0=ruleEvoVariableTerm();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEvoExpressionDsl.g:4029:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==20) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:4030:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoFeatureTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalEvoExpressionDsl.g:4034:5: ( (lv_variables_5_0= ruleEvoVariableTerm ) )
            	    // InternalEvoExpressionDsl.g:4035:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    {
            	    // InternalEvoExpressionDsl.g:4035:6: (lv_variables_5_0= ruleEvoVariableTerm )
            	    // InternalEvoExpressionDsl.g:4036:7: lv_variables_5_0= ruleEvoVariableTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getVariablesEvoVariableTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_variables_5_0=ruleEvoVariableTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_54); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoFeatureTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,14,FOLLOW_55); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoFeatureTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalEvoExpressionDsl.g:4063:3: ( (lv_type_8_0= ruleHyFeatureTypeEnum ) )
            // InternalEvoExpressionDsl.g:4064:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            {
            // InternalEvoExpressionDsl.g:4064:4: (lv_type_8_0= ruleHyFeatureTypeEnum )
            // InternalEvoExpressionDsl.g:4065:5: lv_type_8_0= ruleHyFeatureTypeEnum
            {

            					newCompositeNode(grammarAccess.getEvoFeatureTypeAccess().getTypeHyFeatureTypeEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleHyFeatureTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoFeatureTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"de.evorepair.logic.EvoLogicDsl.HyFeatureTypeEnum");
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
    // $ANTLR end "ruleEvoFeatureType"


    // $ANTLR start "entryRuleEvoGroupType"
    // InternalEvoExpressionDsl.g:4086:1: entryRuleEvoGroupType returns [EObject current=null] : iv_ruleEvoGroupType= ruleEvoGroupType EOF ;
    public final EObject entryRuleEvoGroupType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupType = null;


        try {
            // InternalEvoExpressionDsl.g:4086:53: (iv_ruleEvoGroupType= ruleEvoGroupType EOF )
            // InternalEvoExpressionDsl.g:4087:2: iv_ruleEvoGroupType= ruleEvoGroupType EOF
            {
             newCompositeNode(grammarAccess.getEvoGroupTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGroupType=ruleEvoGroupType();

            state._fsp--;

             current =iv_ruleEvoGroupType; 
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
    // $ANTLR end "entryRuleEvoGroupType"


    // $ANTLR start "ruleEvoGroupType"
    // InternalEvoExpressionDsl.g:4093:1: ruleEvoGroupType returns [EObject current=null] : ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) ;
    public final EObject ruleEvoGroupType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4099:2: ( ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) ) )
            // InternalEvoExpressionDsl.g:4100:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            {
            // InternalEvoExpressionDsl.g:4100:2: ( () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) ) )
            // InternalEvoExpressionDsl.g:4101:3: () otherlv_1= 'groupType' (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' ) otherlv_7= '==' ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            {
            // InternalEvoExpressionDsl.g:4101:3: ()
            // InternalEvoExpressionDsl.g:4102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoGroupTypeAccess().getEvoGroupTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoGroupTypeAccess().getGroupTypeKeyword_1());
            		
            // InternalEvoExpressionDsl.g:4112:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')' )
            // InternalEvoExpressionDsl.g:4113:4: otherlv_2= '(' ( (lv_variables_3_0= ruleEvoGroupTerm ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getEvoGroupTypeAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalEvoExpressionDsl.g:4117:4: ( (lv_variables_3_0= ruleEvoGroupTerm ) )
            // InternalEvoExpressionDsl.g:4118:5: (lv_variables_3_0= ruleEvoGroupTerm )
            {
            // InternalEvoExpressionDsl.g:4118:5: (lv_variables_3_0= ruleEvoGroupTerm )
            // InternalEvoExpressionDsl.g:4119:6: lv_variables_3_0= ruleEvoGroupTerm
            {

            						newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_variables_3_0=ruleEvoGroupTerm();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"de.evorepair.logic.EvoLogicDsl.EvoGroupTerm");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEvoExpressionDsl.g:4136:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==20) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:4137:5: otherlv_4= ',' ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEvoGroupTypeAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalEvoExpressionDsl.g:4141:5: ( (lv_variables_5_0= ruleEvoGroupTerm ) )
            	    // InternalEvoExpressionDsl.g:4142:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    {
            	    // InternalEvoExpressionDsl.g:4142:6: (lv_variables_5_0= ruleEvoGroupTerm )
            	    // InternalEvoExpressionDsl.g:4143:7: lv_variables_5_0= ruleEvoGroupTerm
            	    {

            	    							newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getVariablesEvoGroupTermParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_variables_5_0=ruleEvoGroupTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"de.evorepair.logic.EvoLogicDsl.EvoGroupTerm");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_54); 

            				newLeafNode(otherlv_6, grammarAccess.getEvoGroupTypeAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_7=(Token)match(input,14,FOLLOW_56); 

            			newLeafNode(otherlv_7, grammarAccess.getEvoGroupTypeAccess().getEqualsSignEqualsSignKeyword_3());
            		
            // InternalEvoExpressionDsl.g:4170:3: ( (lv_type_8_0= ruleHyGroupTypeEnum ) )
            // InternalEvoExpressionDsl.g:4171:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            {
            // InternalEvoExpressionDsl.g:4171:4: (lv_type_8_0= ruleHyGroupTypeEnum )
            // InternalEvoExpressionDsl.g:4172:5: lv_type_8_0= ruleHyGroupTypeEnum
            {

            					newCompositeNode(grammarAccess.getEvoGroupTypeAccess().getTypeHyGroupTypeEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleHyGroupTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoGroupTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"de.evorepair.logic.EvoLogicDsl.HyGroupTypeEnum");
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
    // $ANTLR end "ruleEvoGroupType"


    // $ANTLR start "entryRuleEvoGroupTerm"
    // InternalEvoExpressionDsl.g:4193:1: entryRuleEvoGroupTerm returns [EObject current=null] : iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF ;
    public final EObject entryRuleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupTerm = null;


        try {
            // InternalEvoExpressionDsl.g:4193:53: (iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF )
            // InternalEvoExpressionDsl.g:4194:2: iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoGroupTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoGroupTerm=ruleEvoGroupTerm();

            state._fsp--;

             current =iv_ruleEvoGroupTerm; 
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
    // $ANTLR end "entryRuleEvoGroupTerm"


    // $ANTLR start "ruleEvoGroupTerm"
    // InternalEvoExpressionDsl.g:4200:1: ruleEvoGroupTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4206:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalEvoExpressionDsl.g:4207:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalEvoExpressionDsl.g:4207:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalEvoExpressionDsl.g:4208:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalEvoExpressionDsl.g:4208:3: ( ( ruleQualifiedName ) )
            // InternalEvoExpressionDsl.g:4209:4: ( ruleQualifiedName )
            {
            // InternalEvoExpressionDsl.g:4209:4: ( ruleQualifiedName )
            // InternalEvoExpressionDsl.g:4210:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGroupTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:4224:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=71 && LA55_0<=73)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4225:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalEvoExpressionDsl.g:4225:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalEvoExpressionDsl.g:4226:5: lv_type_1_0= ruleEvoVariableType
                    {

                    					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getTypeEvoVariableTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleEvoVariableType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvoGroupTermRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.evorepair.logic.EvoLogicDsl.EvoVariableType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleEvoGroupTerm"


    // $ANTLR start "entryRuleEvoSetTerm"
    // InternalEvoExpressionDsl.g:4247:1: entryRuleEvoSetTerm returns [EObject current=null] : iv_ruleEvoSetTerm= ruleEvoSetTerm EOF ;
    public final EObject entryRuleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetTerm = null;


        try {
            // InternalEvoExpressionDsl.g:4247:51: (iv_ruleEvoSetTerm= ruleEvoSetTerm EOF )
            // InternalEvoExpressionDsl.g:4248:2: iv_ruleEvoSetTerm= ruleEvoSetTerm EOF
            {
             newCompositeNode(grammarAccess.getEvoSetTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSetTerm=ruleEvoSetTerm();

            state._fsp--;

             current =iv_ruleEvoSetTerm; 
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
    // $ANTLR end "entryRuleEvoSetTerm"


    // $ANTLR start "ruleEvoSetTerm"
    // InternalEvoExpressionDsl.g:4254:1: ruleEvoSetTerm returns [EObject current=null] : (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4260:2: ( (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) )
            // InternalEvoExpressionDsl.g:4261:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            {
            // InternalEvoExpressionDsl.g:4261:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            // InternalEvoExpressionDsl.g:4262:3: otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalEvoExpressionDsl.g:4266:3: ( (lv_variables_1_0= ruleEvoSetVariable ) )
            // InternalEvoExpressionDsl.g:4267:4: (lv_variables_1_0= ruleEvoSetVariable )
            {
            // InternalEvoExpressionDsl.g:4267:4: (lv_variables_1_0= ruleEvoSetVariable )
            // InternalEvoExpressionDsl.g:4268:5: lv_variables_1_0= ruleEvoSetVariable
            {

            					newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_variables_1_0=ruleEvoSetVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoSetTermRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvoExpressionDsl.g:4285:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==20) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalEvoExpressionDsl.g:4286:4: otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_57); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalEvoExpressionDsl.g:4290:4: ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    // InternalEvoExpressionDsl.g:4291:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    {
            	    // InternalEvoExpressionDsl.g:4291:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    // InternalEvoExpressionDsl.g:4292:6: lv_variables_3_0= ruleEvoSetVariable
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_variables_3_0=ruleEvoSetVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"de.evorepair.logic.EvoLogicDsl.EvoSetVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoSetTermAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEvoSetTerm"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalEvoExpressionDsl.g:4318:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalEvoExpressionDsl.g:4318:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalEvoExpressionDsl.g:4319:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
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
    // InternalEvoExpressionDsl.g:4325:1: ruleEvoSetVariable returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) ;
    public final EObject ruleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoNot_2 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4331:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) )
            // InternalEvoExpressionDsl.g:4332:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            {
            // InternalEvoExpressionDsl.g:4332:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt57=1;
                }
                break;
            case 65:
                {
                alt57=2;
                }
                break;
            case 31:
            case 58:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4333:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoVariableTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVariableTerm_0=ruleEvoVariableTerm();

                    state._fsp--;


                    			current = this_EvoVariableTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:4342:3: this_EvoSetTerm_1= ruleEvoSetTerm
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoSetTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoSetTerm_1=ruleEvoSetTerm();

                    state._fsp--;


                    			current = this_EvoSetTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:4351:3: this_EvoNot_2= ruleEvoNot
                    {

                    			newCompositeNode(grammarAccess.getEvoSetVariableAccess().getEvoNotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNot_2=ruleEvoNot();

                    state._fsp--;


                    			current = this_EvoNot_2;
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
    // $ANTLR end "ruleEvoSetVariable"


    // $ANTLR start "entryRuleEvoParentOf"
    // InternalEvoExpressionDsl.g:4363:1: entryRuleEvoParentOf returns [EObject current=null] : iv_ruleEvoParentOf= ruleEvoParentOf EOF ;
    public final EObject entryRuleEvoParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoParentOf = null;


        try {
            // InternalEvoExpressionDsl.g:4363:52: (iv_ruleEvoParentOf= ruleEvoParentOf EOF )
            // InternalEvoExpressionDsl.g:4364:2: iv_ruleEvoParentOf= ruleEvoParentOf EOF
            {
             newCompositeNode(grammarAccess.getEvoParentOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoParentOf=ruleEvoParentOf();

            state._fsp--;

             current =iv_ruleEvoParentOf; 
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
    // $ANTLR end "entryRuleEvoParentOf"


    // $ANTLR start "ruleEvoParentOf"
    // InternalEvoExpressionDsl.g:4370:1: ruleEvoParentOf returns [EObject current=null] : (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoParentOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4376:2: ( (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoExpressionDsl.g:4377:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoExpressionDsl.g:4377:2: (otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoExpressionDsl.g:4378:3: otherlv_0= 'parentOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoParentOfAccess().getParentOfKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoParentOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:4386:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:4387:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:4387:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:4388:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoParentOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoParentOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoParentOfAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEvoParentOf"


    // $ANTLR start "entryRuleEvoSiblingsOf"
    // InternalEvoExpressionDsl.g:4413:1: entryRuleEvoSiblingsOf returns [EObject current=null] : iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF ;
    public final EObject entryRuleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSiblingsOf = null;


        try {
            // InternalEvoExpressionDsl.g:4413:54: (iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF )
            // InternalEvoExpressionDsl.g:4414:2: iv_ruleEvoSiblingsOf= ruleEvoSiblingsOf EOF
            {
             newCompositeNode(grammarAccess.getEvoSiblingsOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoSiblingsOf=ruleEvoSiblingsOf();

            state._fsp--;

             current =iv_ruleEvoSiblingsOf; 
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
    // $ANTLR end "entryRuleEvoSiblingsOf"


    // $ANTLR start "ruleEvoSiblingsOf"
    // InternalEvoExpressionDsl.g:4420:1: ruleEvoSiblingsOf returns [EObject current=null] : (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoSiblingsOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4426:2: ( (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoExpressionDsl.g:4427:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoExpressionDsl.g:4427:2: (otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoExpressionDsl.g:4428:3: otherlv_0= 'sibilingsOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSiblingsOfAccess().getSibilingsOfKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoSiblingsOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:4436:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:4437:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:4437:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:4438:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoSiblingsOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoSiblingsOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoSiblingsOfAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEvoSiblingsOf"


    // $ANTLR start "entryRuleEvoChildrenOf"
    // InternalEvoExpressionDsl.g:4463:1: entryRuleEvoChildrenOf returns [EObject current=null] : iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF ;
    public final EObject entryRuleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoChildrenOf = null;


        try {
            // InternalEvoExpressionDsl.g:4463:54: (iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF )
            // InternalEvoExpressionDsl.g:4464:2: iv_ruleEvoChildrenOf= ruleEvoChildrenOf EOF
            {
             newCompositeNode(grammarAccess.getEvoChildrenOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoChildrenOf=ruleEvoChildrenOf();

            state._fsp--;

             current =iv_ruleEvoChildrenOf; 
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
    // $ANTLR end "entryRuleEvoChildrenOf"


    // $ANTLR start "ruleEvoChildrenOf"
    // InternalEvoExpressionDsl.g:4470:1: ruleEvoChildrenOf returns [EObject current=null] : (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoChildrenOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4476:2: ( (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' ) )
            // InternalEvoExpressionDsl.g:4477:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            {
            // InternalEvoExpressionDsl.g:4477:2: (otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')' )
            // InternalEvoExpressionDsl.g:4478:3: otherlv_0= 'childrenOf' otherlv_1= '(' ( (lv_variable_2_0= ruleEvoVariableTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoChildrenOfAccess().getChildrenOfKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoChildrenOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEvoExpressionDsl.g:4486:3: ( (lv_variable_2_0= ruleEvoVariableTerm ) )
            // InternalEvoExpressionDsl.g:4487:4: (lv_variable_2_0= ruleEvoVariableTerm )
            {
            // InternalEvoExpressionDsl.g:4487:4: (lv_variable_2_0= ruleEvoVariableTerm )
            // InternalEvoExpressionDsl.g:4488:5: lv_variable_2_0= ruleEvoVariableTerm
            {

            					newCompositeNode(grammarAccess.getEvoChildrenOfAccess().getVariableEvoVariableTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_2_0=ruleEvoVariableTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoChildrenOfRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"de.evorepair.logic.EvoLogicDsl.EvoVariableTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoChildrenOfAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEvoChildrenOf"


    // $ANTLR start "ruleEvoMappingRelativeVersionRestrictionOperator"
    // InternalEvoExpressionDsl.g:4513:1: ruleEvoMappingRelativeVersionRestrictionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleEvoMappingRelativeVersionRestrictionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4519:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalEvoExpressionDsl.g:4520:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalEvoExpressionDsl.g:4520:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt58=1;
                }
                break;
            case 22:
                {
                alt58=2;
                }
                break;
            case 70:
                {
                alt58=3;
                }
                break;
            case 24:
                {
                alt58=4;
                }
                break;
            case 23:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4521:3: (enumLiteral_0= '<' )
                    {
                    // InternalEvoExpressionDsl.g:4521:3: (enumLiteral_0= '<' )
                    // InternalEvoExpressionDsl.g:4522:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:4529:3: (enumLiteral_1= '<=' )
                    {
                    // InternalEvoExpressionDsl.g:4529:3: (enumLiteral_1= '<=' )
                    // InternalEvoExpressionDsl.g:4530:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:4537:3: (enumLiteral_2= '=' )
                    {
                    // InternalEvoExpressionDsl.g:4537:3: (enumLiteral_2= '=' )
                    // InternalEvoExpressionDsl.g:4538:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEvoExpressionDsl.g:4545:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEvoExpressionDsl.g:4545:3: (enumLiteral_3= '>=' )
                    // InternalEvoExpressionDsl.g:4546:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEvoExpressionDsl.g:4553:3: (enumLiteral_4= '>' )
                    {
                    // InternalEvoExpressionDsl.g:4553:3: (enumLiteral_4= '>' )
                    // InternalEvoExpressionDsl.g:4554:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvoMappingRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleEvoMappingRelativeVersionRestrictionOperator"


    // $ANTLR start "ruleEvoVariableType"
    // InternalEvoExpressionDsl.g:4564:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4570:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalEvoExpressionDsl.g:4571:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalEvoExpressionDsl.g:4571:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt59=1;
                }
                break;
            case 72:
                {
                alt59=2;
                }
                break;
            case 73:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4572:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalEvoExpressionDsl.g:4572:3: (enumLiteral_0= '@ident' )
                    // InternalEvoExpressionDsl.g:4573:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:4580:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalEvoExpressionDsl.g:4580:3: (enumLiteral_1= '@pre' )
                    // InternalEvoExpressionDsl.g:4581:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:4588:3: (enumLiteral_2= '@post' )
                    {
                    // InternalEvoExpressionDsl.g:4588:3: (enumLiteral_2= '@post' )
                    // InternalEvoExpressionDsl.g:4589:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

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


    // $ANTLR start "ruleHyFeatureTypeEnum"
    // InternalEvoExpressionDsl.g:4599:1: ruleHyFeatureTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) ;
    public final Enumerator ruleHyFeatureTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4605:2: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) )
            // InternalEvoExpressionDsl.g:4606:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            {
            // InternalEvoExpressionDsl.g:4606:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==74) ) {
                alt60=1;
            }
            else if ( (LA60_0==75) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4607:3: (enumLiteral_0= 'optional' )
                    {
                    // InternalEvoExpressionDsl.g:4607:3: (enumLiteral_0= 'optional' )
                    // InternalEvoExpressionDsl.g:4608:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:4615:3: (enumLiteral_1= 'mandatory' )
                    {
                    // InternalEvoExpressionDsl.g:4615:3: (enumLiteral_1= 'mandatory' )
                    // InternalEvoExpressionDsl.g:4616:4: enumLiteral_1= 'mandatory'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyFeatureTypeEnumAccess().getMANDATORYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleHyFeatureTypeEnum"


    // $ANTLR start "ruleHyGroupTypeEnum"
    // InternalEvoExpressionDsl.g:4626:1: ruleHyGroupTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) ;
    public final Enumerator ruleHyGroupTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvoExpressionDsl.g:4632:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) )
            // InternalEvoExpressionDsl.g:4633:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            {
            // InternalEvoExpressionDsl.g:4633:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt61=1;
                }
                break;
            case 77:
                {
                alt61=2;
                }
                break;
            case 78:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalEvoExpressionDsl.g:4634:3: (enumLiteral_0= 'and' )
                    {
                    // InternalEvoExpressionDsl.g:4634:3: (enumLiteral_0= 'and' )
                    // InternalEvoExpressionDsl.g:4635:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoExpressionDsl.g:4642:3: (enumLiteral_1= 'or' )
                    {
                    // InternalEvoExpressionDsl.g:4642:3: (enumLiteral_1= 'or' )
                    // InternalEvoExpressionDsl.g:4643:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoExpressionDsl.g:4650:3: (enumLiteral_2= 'alternative' )
                    {
                    // InternalEvoExpressionDsl.g:4650:3: (enumLiteral_2= 'alternative' )
                    // InternalEvoExpressionDsl.g:4651:4: enumLiteral_2= 'alternative'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHyGroupTypeEnumAccess().getALTERNATIVEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleHyGroupTypeEnum"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\1\13\13\uffff";
    static final String dfa_3s = "\1\4\1\14\13\uffff";
    static final String dfa_4s = "\1\52\1\46\13\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\1\1\6";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\6\22\uffff\1\3\4\uffff\1\2\1\12\1\4\2\uffff\2\7\1\5\3\uffff\1\10\1\11",
            "\22\13\10\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1136:2: (this_EvoMappingFeatureReferenceExpression_0= ruleEvoMappingFeatureReferenceExpression | this_EvoMappingNestedExpression_1= ruleEvoMappingNestedExpression | this_EvoMappingNegation_2= ruleEvoMappingNegation | this_EvoMappingConditionalFeatureReferenceExpression_3= ruleEvoMappingConditionalFeatureReferenceExpression | this_EvoMappingContextInformationReferenceExpression_4= ruleEvoMappingContextInformationReferenceExpression | this_EvoMappingAttributeReferenceExpression_5= ruleEvoMappingAttributeReferenceExpression | this_EvoMappingValueExpression_6= ruleEvoMappingValueExpression | this_EvoMappingBooleanValueExpression_7= ruleEvoMappingBooleanValueExpression | this_EvoMappingMimumumExpression_8= ruleEvoMappingMimumumExpression | this_EvoMappingMaximumExpression_9= ruleEvoMappingMaximumExpression | this_EvoMappingNot_10= ruleEvoMappingNot )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\41\1\uffff\1\5\1\31\1\5\2\uffff\1\31";
    static final String dfa_10s = "\1\44\1\uffff\1\5\1\46\1\5\2\uffff\1\46";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\3\1\2\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\6\10\uffff\1\5\3\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\6\10\uffff\1\5\3\uffff\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1524:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000639C2000050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001C40000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xCEB00000C0000020L,0x000000000000003BL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xCEB00000C0000060L,0x000000000000003BL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xFEB00000C0000020L,0x000000000000003BL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4400000080000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000080000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});

}