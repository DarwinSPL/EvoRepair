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
import de.evorepair.feature.expression.services.ExpressionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'elementOf'", "'.'", "'('", "')'", "'->'", "'['", "']'", "'true'", "'false'", "'-'", "'EnumLiteral('", "','", "'eternity'", "'||'", "'&&'", "'=='", "'!='", "'<=>'", "'inclusion'", "'intersection'", "'union'", "'difference'", "'symmetric_difference'", "'x'", "'feature'", "'not'", "'AC'", "'{'", "'}'", "'<'", "'<='", "'='", "'>='", "'>'", "'@ident'", "'@pre'", "'@post'", "'optional'", "'mandatory'", "'and'", "'or'", "'alternative'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalExpressionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressionDsl.g"; }



     	private ExpressionDslGrammarAccess grammarAccess;

        public InternalExpressionDslParser(TokenStream input, ExpressionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GrammarEntry";
       	}

       	@Override
       	protected ExpressionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammarEntry"
    // InternalExpressionDsl.g:65:1: entryRuleGrammarEntry returns [EObject current=null] : iv_ruleGrammarEntry= ruleGrammarEntry EOF ;
    public final EObject entryRuleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarEntry = null;


        try {
            // InternalExpressionDsl.g:65:53: (iv_ruleGrammarEntry= ruleGrammarEntry EOF )
            // InternalExpressionDsl.g:66:2: iv_ruleGrammarEntry= ruleGrammarEntry EOF
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
    // InternalExpressionDsl.g:72:1: ruleGrammarEntry returns [EObject current=null] : ( (lv_expression_0_0= ruleEvoExpression ) ) ;
    public final EObject ruleGrammarEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:78:2: ( ( (lv_expression_0_0= ruleEvoExpression ) ) )
            // InternalExpressionDsl.g:79:2: ( (lv_expression_0_0= ruleEvoExpression ) )
            {
            // InternalExpressionDsl.g:79:2: ( (lv_expression_0_0= ruleEvoExpression ) )
            // InternalExpressionDsl.g:80:3: (lv_expression_0_0= ruleEvoExpression )
            {
            // InternalExpressionDsl.g:80:3: (lv_expression_0_0= ruleEvoExpression )
            // InternalExpressionDsl.g:81:4: lv_expression_0_0= ruleEvoExpression
            {

            				newCompositeNode(grammarAccess.getGrammarEntryAccess().getExpressionEvoExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleEvoExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGrammarEntryRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"de.evorepair.feature.expression.ExpressionDsl.EvoExpression");
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


    // $ANTLR start "entryRuleEvoExpression"
    // InternalExpressionDsl.g:101:1: entryRuleEvoExpression returns [EObject current=null] : iv_ruleEvoExpression= ruleEvoExpression EOF ;
    public final EObject entryRuleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoExpression = null;


        try {
            // InternalExpressionDsl.g:101:54: (iv_ruleEvoExpression= ruleEvoExpression EOF )
            // InternalExpressionDsl.g:102:2: iv_ruleEvoExpression= ruleEvoExpression EOF
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
    // InternalExpressionDsl.g:108:1: ruleEvoExpression returns [EObject current=null] : this_EvoOr_0= ruleEvoOr ;
    public final EObject ruleEvoExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvoOr_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:114:2: (this_EvoOr_0= ruleEvoOr )
            // InternalExpressionDsl.g:115:2: this_EvoOr_0= ruleEvoOr
            {

            		newCompositeNode(grammarAccess.getEvoExpressionAccess().getEvoOrParserRuleCall());
            	
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
    // $ANTLR end "ruleEvoExpression"


    // $ANTLR start "entryRuleEvoElementOf"
    // InternalExpressionDsl.g:126:1: entryRuleEvoElementOf returns [EObject current=null] : iv_ruleEvoElementOf= ruleEvoElementOf EOF ;
    public final EObject entryRuleEvoElementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoElementOf = null;


        try {
            // InternalExpressionDsl.g:126:53: (iv_ruleEvoElementOf= ruleEvoElementOf EOF )
            // InternalExpressionDsl.g:127:2: iv_ruleEvoElementOf= ruleEvoElementOf EOF
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
    // InternalExpressionDsl.g:133:1: ruleEvoElementOf returns [EObject current=null] : (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* ) ;
    public final EObject ruleEvoElementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoTerminal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:139:2: ( (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* ) )
            // InternalExpressionDsl.g:140:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* )
            {
            // InternalExpressionDsl.g:140:2: (this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )* )
            // InternalExpressionDsl.g:141:3: this_EvoTerminal_0= ruleEvoTerminal ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoElementOfAccess().getEvoTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_EvoTerminal_0=ruleEvoTerminal();

            state._fsp--;


            			current = this_EvoTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:149:3: ( () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressionDsl.g:150:4: () otherlv_2= 'elementOf' ( (lv_operand2_3_0= ruleEvoTerminal ) )
            	    {
            	    // InternalExpressionDsl.g:150:4: ()
            	    // InternalExpressionDsl.g:151:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoElementOfAccess().getEvoSetElementOfOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoElementOfAccess().getElementOfKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:161:4: ( (lv_operand2_3_0= ruleEvoTerminal ) )
            	    // InternalExpressionDsl.g:162:5: (lv_operand2_3_0= ruleEvoTerminal )
            	    {
            	    // InternalExpressionDsl.g:162:5: (lv_operand2_3_0= ruleEvoTerminal )
            	    // InternalExpressionDsl.g:163:6: lv_operand2_3_0= ruleEvoTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getEvoElementOfAccess().getOperand2EvoTerminalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operand2_3_0=ruleEvoTerminal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoElementOfRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.ExpressionDsl.EvoTerminal");
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
    // $ANTLR end "ruleEvoElementOf"


    // $ANTLR start "entryRuleEvoTerminal"
    // InternalExpressionDsl.g:185:1: entryRuleEvoTerminal returns [EObject current=null] : iv_ruleEvoTerminal= ruleEvoTerminal EOF ;
    public final EObject entryRuleEvoTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoTerminal = null;


        try {
            // InternalExpressionDsl.g:185:52: (iv_ruleEvoTerminal= ruleEvoTerminal EOF )
            // InternalExpressionDsl.g:186:2: iv_ruleEvoTerminal= ruleEvoTerminal EOF
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
    // InternalExpressionDsl.g:192:1: ruleEvoTerminal returns [EObject current=null] : (this_EvoFeatureReferenceExpression_0= ruleEvoFeatureReferenceExpression | this_EvoNestedExpression_1= ruleEvoNestedExpression ) ;
    public final EObject ruleEvoTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_EvoFeatureReferenceExpression_0 = null;

        EObject this_EvoNestedExpression_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:198:2: ( (this_EvoFeatureReferenceExpression_0= ruleEvoFeatureReferenceExpression | this_EvoNestedExpression_1= ruleEvoNestedExpression ) )
            // InternalExpressionDsl.g:199:2: (this_EvoFeatureReferenceExpression_0= ruleEvoFeatureReferenceExpression | this_EvoNestedExpression_1= ruleEvoNestedExpression )
            {
            // InternalExpressionDsl.g:199:2: (this_EvoFeatureReferenceExpression_0= ruleEvoFeatureReferenceExpression | this_EvoNestedExpression_1= ruleEvoNestedExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressionDsl.g:200:3: this_EvoFeatureReferenceExpression_0= ruleEvoFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoFeatureReferenceExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoFeatureReferenceExpression_0=ruleEvoFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_EvoFeatureReferenceExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:209:3: this_EvoNestedExpression_1= ruleEvoNestedExpression
                    {

                    			newCompositeNode(grammarAccess.getEvoTerminalAccess().getEvoNestedExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNestedExpression_1=ruleEvoNestedExpression();

                    state._fsp--;


                    			current = this_EvoNestedExpression_1;
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
    // $ANTLR end "ruleEvoTerminal"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalExpressionDsl.g:221:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalExpressionDsl.g:221:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalExpressionDsl.g:222:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalExpressionDsl.g:228:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:234:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalExpressionDsl.g:235:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalExpressionDsl.g:235:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalExpressionDsl.g:236:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalExpressionDsl.g:243:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressionDsl.g:244:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvoNestedExpression"
    // InternalExpressionDsl.g:261:1: entryRuleEvoNestedExpression returns [EObject current=null] : iv_ruleEvoNestedExpression= ruleEvoNestedExpression EOF ;
    public final EObject entryRuleEvoNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNestedExpression = null;


        try {
            // InternalExpressionDsl.g:261:60: (iv_ruleEvoNestedExpression= ruleEvoNestedExpression EOF )
            // InternalExpressionDsl.g:262:2: iv_ruleEvoNestedExpression= ruleEvoNestedExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoNestedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoNestedExpression=ruleEvoNestedExpression();

            state._fsp--;

             current =iv_ruleEvoNestedExpression; 
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
    // $ANTLR end "entryRuleEvoNestedExpression"


    // $ANTLR start "ruleEvoNestedExpression"
    // InternalExpressionDsl.g:268:1: ruleEvoNestedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEvoNestedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:274:2: ( (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoExpression ) ) otherlv_2= ')' ) )
            // InternalExpressionDsl.g:275:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoExpression ) ) otherlv_2= ')' )
            {
            // InternalExpressionDsl.g:275:2: (otherlv_0= '(' ( (lv_operand_1_0= ruleEvoExpression ) ) otherlv_2= ')' )
            // InternalExpressionDsl.g:276:3: otherlv_0= '(' ( (lv_operand_1_0= ruleEvoExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoNestedExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalExpressionDsl.g:280:3: ( (lv_operand_1_0= ruleEvoExpression ) )
            // InternalExpressionDsl.g:281:4: (lv_operand_1_0= ruleEvoExpression )
            {
            // InternalExpressionDsl.g:281:4: (lv_operand_1_0= ruleEvoExpression )
            // InternalExpressionDsl.g:282:5: lv_operand_1_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoNestedExpressionAccess().getOperandEvoExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_operand_1_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoNestedExpressionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_1_0,
            						"de.evorepair.feature.expression.ExpressionDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoNestedExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleEvoNestedExpression"


    // $ANTLR start "entryRuleEvoImplication"
    // InternalExpressionDsl.g:307:1: entryRuleEvoImplication returns [EObject current=null] : iv_ruleEvoImplication= ruleEvoImplication EOF ;
    public final EObject entryRuleEvoImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplication = null;


        try {
            // InternalExpressionDsl.g:307:55: (iv_ruleEvoImplication= ruleEvoImplication EOF )
            // InternalExpressionDsl.g:308:2: iv_ruleEvoImplication= ruleEvoImplication EOF
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
    // InternalExpressionDsl.g:314:1: ruleEvoImplication returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) ;
    public final EObject ruleEvoImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoBiconditional_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:320:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* ) )
            // InternalExpressionDsl.g:321:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            {
            // InternalExpressionDsl.g:321:2: (this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )* )
            // InternalExpressionDsl.g:322:3: this_EvoBiconditional_0= ruleEvoBiconditional ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoImplicationAccess().getEvoBiconditionalParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_EvoBiconditional_0=ruleEvoBiconditional();

            state._fsp--;


            			current = this_EvoBiconditional_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:330:3: ( () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressionDsl.g:331:4: () otherlv_2= '->' ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    {
            	    // InternalExpressionDsl.g:331:4: ()
            	    // InternalExpressionDsl.g:332:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoImplicationAccess().getEvoImplicationOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoImplicationAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:342:4: ( (lv_operand2_3_0= ruleEvoBiconditionalSize ) )
            	    // InternalExpressionDsl.g:343:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    {
            	    // InternalExpressionDsl.g:343:5: (lv_operand2_3_0= ruleEvoBiconditionalSize )
            	    // InternalExpressionDsl.g:344:6: lv_operand2_3_0= ruleEvoBiconditionalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoImplicationAccess().getOperand2EvoBiconditionalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleEvoImplication"


    // $ANTLR start "entryRuleEvoFeatureReferenceExpression"
    // InternalExpressionDsl.g:366:1: entryRuleEvoFeatureReferenceExpression returns [EObject current=null] : iv_ruleEvoFeatureReferenceExpression= ruleEvoFeatureReferenceExpression EOF ;
    public final EObject entryRuleEvoFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureReferenceExpression = null;


        try {
            // InternalExpressionDsl.g:366:70: (iv_ruleEvoFeatureReferenceExpression= ruleEvoFeatureReferenceExpression EOF )
            // InternalExpressionDsl.g:367:2: iv_ruleEvoFeatureReferenceExpression= ruleEvoFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEvoFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoFeatureReferenceExpression=ruleEvoFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleEvoFeatureReferenceExpression; 
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
    // $ANTLR end "entryRuleEvoFeatureReferenceExpression"


    // $ANTLR start "ruleEvoFeatureReferenceExpression"
    // InternalExpressionDsl.g:373:1: ruleEvoFeatureReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleEvoFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:379:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalExpressionDsl.g:380:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalExpressionDsl.g:380:2: ( (otherlv_0= RULE_STRING ) )
            // InternalExpressionDsl.g:381:3: (otherlv_0= RULE_STRING )
            {
            // InternalExpressionDsl.g:381:3: (otherlv_0= RULE_STRING )
            // InternalExpressionDsl.g:382:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoFeatureReferenceExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEvoFeatureReferenceExpressionAccess().getFeatureHyFeatureCrossReference_0());
            			

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
    // $ANTLR end "ruleEvoFeatureReferenceExpression"


    // $ANTLR start "entryRuleEvoVersionRestriction"
    // InternalExpressionDsl.g:396:1: entryRuleEvoVersionRestriction returns [EObject current=null] : iv_ruleEvoVersionRestriction= ruleEvoVersionRestriction EOF ;
    public final EObject entryRuleEvoVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVersionRestriction = null;


        try {
            // InternalExpressionDsl.g:396:62: (iv_ruleEvoVersionRestriction= ruleEvoVersionRestriction EOF )
            // InternalExpressionDsl.g:397:2: iv_ruleEvoVersionRestriction= ruleEvoVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVersionRestriction=ruleEvoVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoVersionRestriction; 
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
    // $ANTLR end "entryRuleEvoVersionRestriction"


    // $ANTLR start "ruleEvoVersionRestriction"
    // InternalExpressionDsl.g:403:1: ruleEvoVersionRestriction returns [EObject current=null] : (this_EvoRelativeVersionRestriction_0= ruleEvoRelativeVersionRestriction | this_EvoVersionRangeRestriction_1= ruleEvoVersionRangeRestriction ) ;
    public final EObject ruleEvoVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_EvoRelativeVersionRestriction_0 = null;

        EObject this_EvoVersionRangeRestriction_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:409:2: ( (this_EvoRelativeVersionRestriction_0= ruleEvoRelativeVersionRestriction | this_EvoVersionRangeRestriction_1= ruleEvoVersionRangeRestriction ) )
            // InternalExpressionDsl.g:410:2: (this_EvoRelativeVersionRestriction_0= ruleEvoRelativeVersionRestriction | this_EvoVersionRangeRestriction_1= ruleEvoVersionRangeRestriction )
            {
            // InternalExpressionDsl.g:410:2: (this_EvoRelativeVersionRestriction_0= ruleEvoRelativeVersionRestriction | this_EvoVersionRangeRestriction_1= ruleEvoVersionRangeRestriction )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=41 && LA5_1<=45)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpressionDsl.g:411:3: this_EvoRelativeVersionRestriction_0= ruleEvoRelativeVersionRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoVersionRestrictionAccess().getEvoRelativeVersionRestrictionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoRelativeVersionRestriction_0=ruleEvoRelativeVersionRestriction();

                    state._fsp--;


                    			current = this_EvoRelativeVersionRestriction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:420:3: this_EvoVersionRangeRestriction_1= ruleEvoVersionRangeRestriction
                    {

                    			newCompositeNode(grammarAccess.getEvoVersionRestrictionAccess().getEvoVersionRangeRestrictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoVersionRangeRestriction_1=ruleEvoVersionRangeRestriction();

                    state._fsp--;


                    			current = this_EvoVersionRangeRestriction_1;
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
    // $ANTLR end "ruleEvoVersionRestriction"


    // $ANTLR start "entryRuleEvoRelativeVersionRestriction"
    // InternalExpressionDsl.g:432:1: entryRuleEvoRelativeVersionRestriction returns [EObject current=null] : iv_ruleEvoRelativeVersionRestriction= ruleEvoRelativeVersionRestriction EOF ;
    public final EObject entryRuleEvoRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoRelativeVersionRestriction = null;


        try {
            // InternalExpressionDsl.g:432:70: (iv_ruleEvoRelativeVersionRestriction= ruleEvoRelativeVersionRestriction EOF )
            // InternalExpressionDsl.g:433:2: iv_ruleEvoRelativeVersionRestriction= ruleEvoRelativeVersionRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoRelativeVersionRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoRelativeVersionRestriction=ruleEvoRelativeVersionRestriction();

            state._fsp--;

             current =iv_ruleEvoRelativeVersionRestriction; 
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
    // $ANTLR end "entryRuleEvoRelativeVersionRestriction"


    // $ANTLR start "ruleEvoRelativeVersionRestriction"
    // InternalExpressionDsl.g:439:1: ruleEvoRelativeVersionRestriction returns [EObject current=null] : (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleEvoRelativeVersionRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:445:2: ( (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) )
            // InternalExpressionDsl.g:446:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            {
            // InternalExpressionDsl.g:446:2: (otherlv_0= '[' ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            // InternalExpressionDsl.g:447:3: otherlv_0= '[' ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoRelativeVersionRestrictionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalExpressionDsl.g:451:3: ( (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator ) )
            // InternalExpressionDsl.g:452:4: (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator )
            {
            // InternalExpressionDsl.g:452:4: (lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator )
            // InternalExpressionDsl.g:453:5: lv_operator_1_0= ruleEvoRelativeVersionRestrictionOperator
            {

            					newCompositeNode(grammarAccess.getEvoRelativeVersionRestrictionAccess().getOperatorEvoRelativeVersionRestrictionOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_1_0=ruleEvoRelativeVersionRestrictionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoRelativeVersionRestrictionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"de.evorepair.feature.expression.ExpressionDsl.EvoRelativeVersionRestrictionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpressionDsl.g:470:3: ( (otherlv_2= RULE_ID ) )
            // InternalExpressionDsl.g:471:4: (otherlv_2= RULE_ID )
            {
            // InternalExpressionDsl.g:471:4: (otherlv_2= RULE_ID )
            // InternalExpressionDsl.g:472:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoRelativeVersionRestrictionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getEvoRelativeVersionRestrictionAccess().getVersionHyVersionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoRelativeVersionRestrictionAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEvoRelativeVersionRestriction"


    // $ANTLR start "entryRuleEvoVersionRangeRestriction"
    // InternalExpressionDsl.g:491:1: entryRuleEvoVersionRangeRestriction returns [EObject current=null] : iv_ruleEvoVersionRangeRestriction= ruleEvoVersionRangeRestriction EOF ;
    public final EObject entryRuleEvoVersionRangeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVersionRangeRestriction = null;


        try {
            // InternalExpressionDsl.g:491:67: (iv_ruleEvoVersionRangeRestriction= ruleEvoVersionRangeRestriction EOF )
            // InternalExpressionDsl.g:492:2: iv_ruleEvoVersionRangeRestriction= ruleEvoVersionRangeRestriction EOF
            {
             newCompositeNode(grammarAccess.getEvoVersionRangeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoVersionRangeRestriction=ruleEvoVersionRangeRestriction();

            state._fsp--;

             current =iv_ruleEvoVersionRangeRestriction; 
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
    // $ANTLR end "entryRuleEvoVersionRangeRestriction"


    // $ANTLR start "ruleEvoVersionRangeRestriction"
    // InternalExpressionDsl.g:498:1: ruleEvoVersionRangeRestriction returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleEvoVersionRangeRestriction() throws RecognitionException {
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
            // InternalExpressionDsl.g:504:2: ( ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) ) )
            // InternalExpressionDsl.g:505:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            {
            // InternalExpressionDsl.g:505:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalExpressionDsl.g:506:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    {
                    // InternalExpressionDsl.g:506:3: (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) )
                    // InternalExpressionDsl.g:507:4: otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getEvoVersionRangeRestrictionAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalExpressionDsl.g:511:4: ( (lv_lowerIncluded_1_0= 'true' ) )
                    // InternalExpressionDsl.g:512:5: (lv_lowerIncluded_1_0= 'true' )
                    {
                    // InternalExpressionDsl.g:512:5: (lv_lowerIncluded_1_0= 'true' )
                    // InternalExpressionDsl.g:513:6: lv_lowerIncluded_1_0= 'true'
                    {
                    lv_lowerIncluded_1_0=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_lowerIncluded_1_0, grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerIncludedTrueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "lowerIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:527:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    {
                    // InternalExpressionDsl.g:527:3: (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) )
                    // InternalExpressionDsl.g:528:4: otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_1_0());
                    			
                    // InternalExpressionDsl.g:532:4: ( ( ruleQualifiedName ) )
                    // InternalExpressionDsl.g:533:5: ( ruleQualifiedName )
                    {
                    // InternalExpressionDsl.g:533:5: ( ruleQualifiedName )
                    // InternalExpressionDsl.g:534:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoVersionRangeRestrictionAccess().getLowerVersionHyVersionCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvoVersionRangeRestrictionAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalExpressionDsl.g:552:4: ( (lv_upperIncluded_5_0= 'true' ) )
                    // InternalExpressionDsl.g:553:5: (lv_upperIncluded_5_0= 'true' )
                    {
                    // InternalExpressionDsl.g:553:5: (lv_upperIncluded_5_0= 'true' )
                    // InternalExpressionDsl.g:554:6: lv_upperIncluded_5_0= 'true'
                    {
                    lv_upperIncluded_5_0=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_upperIncluded_5_0, grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperIncludedTrueKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoVersionRangeRestrictionRule());
                    						}
                    						setWithLastConsumed(current, "upperIncluded", true, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:568:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    {
                    // InternalExpressionDsl.g:568:3: (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' )
                    // InternalExpressionDsl.g:569:4: otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvoVersionRangeRestrictionAccess().getFalseKeyword_2_0());
                    			
                    // InternalExpressionDsl.g:573:4: ( ( ruleQualifiedName ) )
                    // InternalExpressionDsl.g:574:5: ( ruleQualifiedName )
                    {
                    // InternalExpressionDsl.g:574:5: ( ruleQualifiedName )
                    // InternalExpressionDsl.g:575:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoVersionRangeRestrictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvoVersionRangeRestrictionAccess().getUpperVersionHyVersionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEvoVersionRangeRestrictionAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleEvoVersionRangeRestriction"


    // $ANTLR start "entryRuleEvoValue"
    // InternalExpressionDsl.g:598:1: entryRuleEvoValue returns [EObject current=null] : iv_ruleEvoValue= ruleEvoValue EOF ;
    public final EObject entryRuleEvoValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoValue = null;


        try {
            // InternalExpressionDsl.g:598:49: (iv_ruleEvoValue= ruleEvoValue EOF )
            // InternalExpressionDsl.g:599:2: iv_ruleEvoValue= ruleEvoValue EOF
            {
             newCompositeNode(grammarAccess.getEvoValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoValue=ruleEvoValue();

            state._fsp--;

             current =iv_ruleEvoValue; 
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
    // $ANTLR end "entryRuleEvoValue"


    // $ANTLR start "ruleEvoValue"
    // InternalExpressionDsl.g:605:1: ruleEvoValue returns [EObject current=null] : (this_EvoNumberValue_0= ruleEvoNumberValue | this_EvoBooleanValue_1= ruleEvoBooleanValue ) ;
    public final EObject ruleEvoValue() throws RecognitionException {
        EObject current = null;

        EObject this_EvoNumberValue_0 = null;

        EObject this_EvoBooleanValue_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:611:2: ( (this_EvoNumberValue_0= ruleEvoNumberValue | this_EvoBooleanValue_1= ruleEvoBooleanValue ) )
            // InternalExpressionDsl.g:612:2: (this_EvoNumberValue_0= ruleEvoNumberValue | this_EvoBooleanValue_1= ruleEvoBooleanValue )
            {
            // InternalExpressionDsl.g:612:2: (this_EvoNumberValue_0= ruleEvoNumberValue | this_EvoBooleanValue_1= ruleEvoBooleanValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressionDsl.g:613:3: this_EvoNumberValue_0= ruleEvoNumberValue
                    {

                    			newCompositeNode(grammarAccess.getEvoValueAccess().getEvoNumberValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoNumberValue_0=ruleEvoNumberValue();

                    state._fsp--;


                    			current = this_EvoNumberValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:622:3: this_EvoBooleanValue_1= ruleEvoBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getEvoValueAccess().getEvoBooleanValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvoBooleanValue_1=ruleEvoBooleanValue();

                    state._fsp--;


                    			current = this_EvoBooleanValue_1;
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
    // $ANTLR end "ruleEvoValue"


    // $ANTLR start "entryRuleEvoNumberValue"
    // InternalExpressionDsl.g:634:1: entryRuleEvoNumberValue returns [EObject current=null] : iv_ruleEvoNumberValue= ruleEvoNumberValue EOF ;
    public final EObject entryRuleEvoNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNumberValue = null;


        try {
            // InternalExpressionDsl.g:634:55: (iv_ruleEvoNumberValue= ruleEvoNumberValue EOF )
            // InternalExpressionDsl.g:635:2: iv_ruleEvoNumberValue= ruleEvoNumberValue EOF
            {
             newCompositeNode(grammarAccess.getEvoNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoNumberValue=ruleEvoNumberValue();

            state._fsp--;

             current =iv_ruleEvoNumberValue; 
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
    // $ANTLR end "entryRuleEvoNumberValue"


    // $ANTLR start "ruleEvoNumberValue"
    // InternalExpressionDsl.g:641:1: ruleEvoNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEvoNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:647:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalExpressionDsl.g:648:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalExpressionDsl.g:648:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalExpressionDsl.g:649:3: (lv_value_0_0= RULE_INT )
            {
            // InternalExpressionDsl.g:649:3: (lv_value_0_0= RULE_INT )
            // InternalExpressionDsl.g:650:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEvoNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEvoNumberValueRule());
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
    // $ANTLR end "ruleEvoNumberValue"


    // $ANTLR start "entryRuleEvoBooleanValue"
    // InternalExpressionDsl.g:669:1: entryRuleEvoBooleanValue returns [EObject current=null] : iv_ruleEvoBooleanValue= ruleEvoBooleanValue EOF ;
    public final EObject entryRuleEvoBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBooleanValue = null;


        try {
            // InternalExpressionDsl.g:669:56: (iv_ruleEvoBooleanValue= ruleEvoBooleanValue EOF )
            // InternalExpressionDsl.g:670:2: iv_ruleEvoBooleanValue= ruleEvoBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getEvoBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoBooleanValue=ruleEvoBooleanValue();

            state._fsp--;

             current =iv_ruleEvoBooleanValue; 
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
    // $ANTLR end "entryRuleEvoBooleanValue"


    // $ANTLR start "ruleEvoBooleanValue"
    // InternalExpressionDsl.g:676:1: ruleEvoBooleanValue returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleEvoBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:682:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalExpressionDsl.g:683:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalExpressionDsl.g:683:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalExpressionDsl.g:684:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalExpressionDsl.g:684:3: ()
            // InternalExpressionDsl.g:685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoBooleanValueAccess().getHyBooleanValueAction_0(),
            					current);
            			

            }

            // InternalExpressionDsl.g:691:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpressionDsl.g:692:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalExpressionDsl.g:692:4: ( (lv_value_1_0= 'true' ) )
                    // InternalExpressionDsl.g:693:5: (lv_value_1_0= 'true' )
                    {
                    // InternalExpressionDsl.g:693:5: (lv_value_1_0= 'true' )
                    // InternalExpressionDsl.g:694:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getEvoBooleanValueAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvoBooleanValueRule());
                    						}
                    						setWithLastConsumed(current, "value", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:707:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvoBooleanValueAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleEvoBooleanValue"


    // $ANTLR start "entryRuleEvoEnumLiteral"
    // InternalExpressionDsl.g:716:1: entryRuleEvoEnumLiteral returns [EObject current=null] : iv_ruleEvoEnumLiteral= ruleEvoEnumLiteral EOF ;
    public final EObject entryRuleEvoEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoEnumLiteral = null;


        try {
            // InternalExpressionDsl.g:716:55: (iv_ruleEvoEnumLiteral= ruleEvoEnumLiteral EOF )
            // InternalExpressionDsl.g:717:2: iv_ruleEvoEnumLiteral= ruleEvoEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEvoEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvoEnumLiteral=ruleEvoEnumLiteral();

            state._fsp--;

             current =iv_ruleEvoEnumLiteral; 
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
    // $ANTLR end "entryRuleEvoEnumLiteral"


    // $ANTLR start "ruleEvoEnumLiteral"
    // InternalExpressionDsl.g:723:1: ruleEvoEnumLiteral returns [EObject current=null] : (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) ;
    public final EObject ruleEvoEnumLiteral() throws RecognitionException {
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
            // InternalExpressionDsl.g:729:2: ( (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? ) )
            // InternalExpressionDsl.g:730:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            {
            // InternalExpressionDsl.g:730:2: (otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )? )
            // InternalExpressionDsl.g:731:3: otherlv_0= 'EnumLiteral(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoEnumLiteralAccess().getEnumLiteralKeyword_0());
            		
            // InternalExpressionDsl.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpressionDsl.g:736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpressionDsl.g:736:4: (lv_name_1_0= RULE_ID )
            // InternalExpressionDsl.g:737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvoEnumLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getEvoEnumLiteralAccess().getCommaKeyword_2());
            		
            // InternalExpressionDsl.g:757:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalExpressionDsl.g:758:4: (lv_value_3_0= RULE_INT )
            {
            // InternalExpressionDsl.g:758:4: (lv_value_3_0= RULE_INT )
            // InternalExpressionDsl.g:759:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_value_3_0, grammarAccess.getEvoEnumLiteralAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getEvoEnumLiteralAccess().getRightParenthesisKeyword_4());
            		
            // InternalExpressionDsl.g:779:3: (otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpressionDsl.g:780:4: otherlv_5= '[' ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) ) otherlv_14= ']'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvoEnumLiteralAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalExpressionDsl.g:784:4: ( ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) ) | ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' ) | (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) ) )
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_DATE) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==21) ) {
                            int LA9_3 = input.LA(3);

                            if ( (LA9_3==18) ) {
                                alt9=2;
                            }
                            else if ( (LA9_3==RULE_DATE) ) {
                                alt9=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA9_0==24) ) {
                        alt9=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalExpressionDsl.g:785:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            {
                            // InternalExpressionDsl.g:785:5: ( ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) ) )
                            // InternalExpressionDsl.g:786:6: ( (lv_validSince_6_0= RULE_DATE ) ) otherlv_7= '-' ( (lv_validUntil_8_0= RULE_DATE ) )
                            {
                            // InternalExpressionDsl.g:786:6: ( (lv_validSince_6_0= RULE_DATE ) )
                            // InternalExpressionDsl.g:787:7: (lv_validSince_6_0= RULE_DATE )
                            {
                            // InternalExpressionDsl.g:787:7: (lv_validSince_6_0= RULE_DATE )
                            // InternalExpressionDsl.g:788:8: lv_validSince_6_0= RULE_DATE
                            {
                            lv_validSince_6_0=(Token)match(input,RULE_DATE,FOLLOW_13); 

                            								newLeafNode(lv_validSince_6_0, grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_6_0,
                            									"de.evorepair.feature.expression.ExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,21,FOLLOW_18); 

                            						newLeafNode(otherlv_7, grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_0_1());
                            					
                            // InternalExpressionDsl.g:808:6: ( (lv_validUntil_8_0= RULE_DATE ) )
                            // InternalExpressionDsl.g:809:7: (lv_validUntil_8_0= RULE_DATE )
                            {
                            // InternalExpressionDsl.g:809:7: (lv_validUntil_8_0= RULE_DATE )
                            // InternalExpressionDsl.g:810:8: lv_validUntil_8_0= RULE_DATE
                            {
                            lv_validUntil_8_0=(Token)match(input,RULE_DATE,FOLLOW_11); 

                            								newLeafNode(lv_validUntil_8_0, grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_8_0,
                            									"de.evorepair.feature.expression.ExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalExpressionDsl.g:828:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            {
                            // InternalExpressionDsl.g:828:5: ( ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-' )
                            // InternalExpressionDsl.g:829:6: ( (lv_validSince_9_0= RULE_DATE ) ) otherlv_10= '-'
                            {
                            // InternalExpressionDsl.g:829:6: ( (lv_validSince_9_0= RULE_DATE ) )
                            // InternalExpressionDsl.g:830:7: (lv_validSince_9_0= RULE_DATE )
                            {
                            // InternalExpressionDsl.g:830:7: (lv_validSince_9_0= RULE_DATE )
                            // InternalExpressionDsl.g:831:8: lv_validSince_9_0= RULE_DATE
                            {
                            lv_validSince_9_0=(Token)match(input,RULE_DATE,FOLLOW_13); 

                            								newLeafNode(lv_validSince_9_0, grammarAccess.getEvoEnumLiteralAccess().getValidSinceDATETerminalRuleCall_5_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validSince",
                            									lv_validSince_9_0,
                            									"de.evorepair.feature.expression.ExpressionDsl.DATE");
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,21,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalExpressionDsl.g:853:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            {
                            // InternalExpressionDsl.g:853:5: (otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) ) )
                            // InternalExpressionDsl.g:854:6: otherlv_11= 'eternity' otherlv_12= '-' ( (lv_validUntil_13_0= RULE_DATE ) )
                            {
                            otherlv_11=(Token)match(input,24,FOLLOW_13); 

                            						newLeafNode(otherlv_11, grammarAccess.getEvoEnumLiteralAccess().getEternityKeyword_5_1_2_0());
                            					
                            otherlv_12=(Token)match(input,21,FOLLOW_18); 

                            						newLeafNode(otherlv_12, grammarAccess.getEvoEnumLiteralAccess().getHyphenMinusKeyword_5_1_2_1());
                            					
                            // InternalExpressionDsl.g:862:6: ( (lv_validUntil_13_0= RULE_DATE ) )
                            // InternalExpressionDsl.g:863:7: (lv_validUntil_13_0= RULE_DATE )
                            {
                            // InternalExpressionDsl.g:863:7: (lv_validUntil_13_0= RULE_DATE )
                            // InternalExpressionDsl.g:864:8: lv_validUntil_13_0= RULE_DATE
                            {
                            lv_validUntil_13_0=(Token)match(input,RULE_DATE,FOLLOW_11); 

                            								newLeafNode(lv_validUntil_13_0, grammarAccess.getEvoEnumLiteralAccess().getValidUntilDATETerminalRuleCall_5_1_2_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getEvoEnumLiteralRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"validUntil",
                            									lv_validUntil_13_0,
                            									"de.evorepair.feature.expression.ExpressionDsl.DATE");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEvoEnumLiteralAccess().getRightSquareBracketKeyword_5_2());
                    			

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
    // $ANTLR end "ruleEvoEnumLiteral"


    // $ANTLR start "entryRuleEvoOr"
    // InternalExpressionDsl.g:891:1: entryRuleEvoOr returns [EObject current=null] : iv_ruleEvoOr= ruleEvoOr EOF ;
    public final EObject entryRuleEvoOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoOr = null;


        try {
            // InternalExpressionDsl.g:891:46: (iv_ruleEvoOr= ruleEvoOr EOF )
            // InternalExpressionDsl.g:892:2: iv_ruleEvoOr= ruleEvoOr EOF
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
    // InternalExpressionDsl.g:898:1: ruleEvoOr returns [EObject current=null] : (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) ;
    public final EObject ruleEvoOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoAnd_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:904:2: ( (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* ) )
            // InternalExpressionDsl.g:905:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            {
            // InternalExpressionDsl.g:905:2: (this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )* )
            // InternalExpressionDsl.g:906:3: this_EvoAnd_0= ruleEvoAnd ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoOrAccess().getEvoAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EvoAnd_0=ruleEvoAnd();

            state._fsp--;


            			current = this_EvoAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:914:3: ( () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpressionDsl.g:915:4: () otherlv_2= '||' ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    {
            	    // InternalExpressionDsl.g:915:4: ()
            	    // InternalExpressionDsl.g:916:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoOrAccess().getEvoOrOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:926:4: ( (lv_operand2_3_0= ruleEvoAnd ) )
            	    // InternalExpressionDsl.g:927:5: (lv_operand2_3_0= ruleEvoAnd )
            	    {
            	    // InternalExpressionDsl.g:927:5: (lv_operand2_3_0= ruleEvoAnd )
            	    // InternalExpressionDsl.g:928:6: lv_operand2_3_0= ruleEvoAnd
            	    {

            	    						newCompositeNode(grammarAccess.getEvoOrAccess().getOperand2EvoAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "ruleEvoOr"


    // $ANTLR start "entryRuleEvoAnd"
    // InternalExpressionDsl.g:950:1: entryRuleEvoAnd returns [EObject current=null] : iv_ruleEvoAnd= ruleEvoAnd EOF ;
    public final EObject entryRuleEvoAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoAnd = null;


        try {
            // InternalExpressionDsl.g:950:47: (iv_ruleEvoAnd= ruleEvoAnd EOF )
            // InternalExpressionDsl.g:951:2: iv_ruleEvoAnd= ruleEvoAnd EOF
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
    // InternalExpressionDsl.g:957:1: ruleEvoAnd returns [EObject current=null] : (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) ;
    public final EObject ruleEvoAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoEqual_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:963:2: ( (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* ) )
            // InternalExpressionDsl.g:964:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            {
            // InternalExpressionDsl.g:964:2: (this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )* )
            // InternalExpressionDsl.g:965:3: this_EvoEqual_0= ruleEvoEqual ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoAndAccess().getEvoEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EvoEqual_0=ruleEvoEqual();

            state._fsp--;


            			current = this_EvoEqual_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:973:3: ( () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpressionDsl.g:974:4: () otherlv_2= '&&' ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    {
            	    // InternalExpressionDsl.g:974:4: ()
            	    // InternalExpressionDsl.g:975:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoAndAccess().getEvoAndOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:985:4: ( (lv_operand2_3_0= ruleEvoEqual ) )
            	    // InternalExpressionDsl.g:986:5: (lv_operand2_3_0= ruleEvoEqual )
            	    {
            	    // InternalExpressionDsl.g:986:5: (lv_operand2_3_0= ruleEvoEqual )
            	    // InternalExpressionDsl.g:987:6: lv_operand2_3_0= ruleEvoEqual
            	    {

            	    						newCompositeNode(grammarAccess.getEvoAndAccess().getOperand2EvoEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleEvoAnd"


    // $ANTLR start "entryRuleEvoEqual"
    // InternalExpressionDsl.g:1009:1: entryRuleEvoEqual returns [EObject current=null] : iv_ruleEvoEqual= ruleEvoEqual EOF ;
    public final EObject entryRuleEvoEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoEqual = null;


        try {
            // InternalExpressionDsl.g:1009:49: (iv_ruleEvoEqual= ruleEvoEqual EOF )
            // InternalExpressionDsl.g:1010:2: iv_ruleEvoEqual= ruleEvoEqual EOF
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
    // InternalExpressionDsl.g:1016:1: ruleEvoEqual returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) ;
    public final EObject ruleEvoEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoUnequal_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1022:2: ( (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* ) )
            // InternalExpressionDsl.g:1023:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            {
            // InternalExpressionDsl.g:1023:2: (this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )* )
            // InternalExpressionDsl.g:1024:3: this_EvoUnequal_0= ruleEvoUnequal ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoEqualAccess().getEvoUnequalParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EvoUnequal_0=ruleEvoUnequal();

            state._fsp--;


            			current = this_EvoUnequal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1032:3: ( () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpressionDsl.g:1033:4: () otherlv_2= '==' ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    {
            	    // InternalExpressionDsl.g:1033:4: ()
            	    // InternalExpressionDsl.g:1034:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoEqualAccess().getEvoEqualOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoEqualAccess().getEqualsSignEqualsSignKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1044:4: ( (lv_operand2_3_0= ruleEvoUnequalSize ) )
            	    // InternalExpressionDsl.g:1045:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    {
            	    // InternalExpressionDsl.g:1045:5: (lv_operand2_3_0= ruleEvoUnequalSize )
            	    // InternalExpressionDsl.g:1046:6: lv_operand2_3_0= ruleEvoUnequalSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoEqualAccess().getOperand2EvoUnequalSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleEvoEqual"


    // $ANTLR start "entryRuleEvoUnequalSize"
    // InternalExpressionDsl.g:1068:1: entryRuleEvoUnequalSize returns [EObject current=null] : iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF ;
    public final EObject entryRuleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequalSize = null;


        try {
            // InternalExpressionDsl.g:1068:55: (iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF )
            // InternalExpressionDsl.g:1069:2: iv_ruleEvoUnequalSize= ruleEvoUnequalSize EOF
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
    // InternalExpressionDsl.g:1075:1: ruleEvoUnequalSize returns [EObject current=null] : (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoUnequalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoUnequal_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1081:2: ( (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize ) )
            // InternalExpressionDsl.g:1082:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            {
            // InternalExpressionDsl.g:1082:2: (this_EvoUnequal_0= ruleEvoUnequal | this_EvoSize_1= ruleEvoSize )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalExpressionDsl.g:1083:3: this_EvoUnequal_0= ruleEvoUnequal
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
                    // InternalExpressionDsl.g:1092:3: this_EvoSize_1= ruleEvoSize
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
    // InternalExpressionDsl.g:1104:1: entryRuleEvoUnequal returns [EObject current=null] : iv_ruleEvoUnequal= ruleEvoUnequal EOF ;
    public final EObject entryRuleEvoUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoUnequal = null;


        try {
            // InternalExpressionDsl.g:1104:51: (iv_ruleEvoUnequal= ruleEvoUnequal EOF )
            // InternalExpressionDsl.g:1105:2: iv_ruleEvoUnequal= ruleEvoUnequal EOF
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
    // InternalExpressionDsl.g:1111:1: ruleEvoUnequal returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) ;
    public final EObject ruleEvoUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoImplication_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1117:2: ( (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* ) )
            // InternalExpressionDsl.g:1118:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            {
            // InternalExpressionDsl.g:1118:2: (this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )* )
            // InternalExpressionDsl.g:1119:3: this_EvoImplication_0= ruleEvoImplication ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoUnequalAccess().getEvoImplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_EvoImplication_0=ruleEvoImplication();

            state._fsp--;


            			current = this_EvoImplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1127:3: ( () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpressionDsl.g:1128:4: () otherlv_2= '!=' ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    {
            	    // InternalExpressionDsl.g:1128:4: ()
            	    // InternalExpressionDsl.g:1129:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoUnequalAccess().getEvoUnequalOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoUnequalAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1139:4: ( (lv_operand2_3_0= ruleEvoImplicationSize ) )
            	    // InternalExpressionDsl.g:1140:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    {
            	    // InternalExpressionDsl.g:1140:5: (lv_operand2_3_0= ruleEvoImplicationSize )
            	    // InternalExpressionDsl.g:1141:6: lv_operand2_3_0= ruleEvoImplicationSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoUnequalAccess().getOperand2EvoImplicationSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleEvoUnequal"


    // $ANTLR start "entryRuleEvoImplicationSize"
    // InternalExpressionDsl.g:1163:1: entryRuleEvoImplicationSize returns [EObject current=null] : iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF ;
    public final EObject entryRuleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoImplicationSize = null;


        try {
            // InternalExpressionDsl.g:1163:59: (iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF )
            // InternalExpressionDsl.g:1164:2: iv_ruleEvoImplicationSize= ruleEvoImplicationSize EOF
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
    // InternalExpressionDsl.g:1170:1: ruleEvoImplicationSize returns [EObject current=null] : (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoImplicationSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoImplication_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1176:2: ( (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize ) )
            // InternalExpressionDsl.g:1177:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            {
            // InternalExpressionDsl.g:1177:2: (this_EvoImplication_0= ruleEvoImplication | this_EvoSize_1= ruleEvoSize )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalExpressionDsl.g:1178:3: this_EvoImplication_0= ruleEvoImplication
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
                    // InternalExpressionDsl.g:1187:3: this_EvoSize_1= ruleEvoSize
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


    // $ANTLR start "entryRuleEvoBiconditionalSize"
    // InternalExpressionDsl.g:1199:1: entryRuleEvoBiconditionalSize returns [EObject current=null] : iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF ;
    public final EObject entryRuleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditionalSize = null;


        try {
            // InternalExpressionDsl.g:1199:61: (iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF )
            // InternalExpressionDsl.g:1200:2: iv_ruleEvoBiconditionalSize= ruleEvoBiconditionalSize EOF
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
    // InternalExpressionDsl.g:1206:1: ruleEvoBiconditionalSize returns [EObject current=null] : (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoBiconditionalSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoBiconditional_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1212:2: ( (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize ) )
            // InternalExpressionDsl.g:1213:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            {
            // InternalExpressionDsl.g:1213:2: (this_EvoBiconditional_0= ruleEvoBiconditional | this_EvoSize_1= ruleEvoSize )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==14) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalExpressionDsl.g:1214:3: this_EvoBiconditional_0= ruleEvoBiconditional
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
                    // InternalExpressionDsl.g:1223:3: this_EvoSize_1= ruleEvoSize
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
    // InternalExpressionDsl.g:1235:1: entryRuleEvoBiconditional returns [EObject current=null] : iv_ruleEvoBiconditional= ruleEvoBiconditional EOF ;
    public final EObject entryRuleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoBiconditional = null;


        try {
            // InternalExpressionDsl.g:1235:57: (iv_ruleEvoBiconditional= ruleEvoBiconditional EOF )
            // InternalExpressionDsl.g:1236:2: iv_ruleEvoBiconditional= ruleEvoBiconditional EOF
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
    // InternalExpressionDsl.g:1242:1: ruleEvoBiconditional returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) ;
    public final EObject ruleEvoBiconditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetInclusion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1248:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* ) )
            // InternalExpressionDsl.g:1249:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            {
            // InternalExpressionDsl.g:1249:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )* )
            // InternalExpressionDsl.g:1250:3: this_EvoSetInclusion_0= ruleEvoSetInclusion ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getEvoSetInclusionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_EvoSetInclusion_0=ruleEvoSetInclusion();

            state._fsp--;


            			current = this_EvoSetInclusion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1258:3: ( () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpressionDsl.g:1259:4: () otherlv_2= '<=>' ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    {
            	    // InternalExpressionDsl.g:1259:4: ()
            	    // InternalExpressionDsl.g:1260:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoBiconditionalAccess().getEvoBiconditionalOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoBiconditionalAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1270:4: ( (lv_operand2_3_0= ruleEvoSetInclusionSize ) )
            	    // InternalExpressionDsl.g:1271:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    {
            	    // InternalExpressionDsl.g:1271:5: (lv_operand2_3_0= ruleEvoSetInclusionSize )
            	    // InternalExpressionDsl.g:1272:6: lv_operand2_3_0= ruleEvoSetInclusionSize
            	    {

            	    						newCompositeNode(grammarAccess.getEvoBiconditionalAccess().getOperand2EvoSetInclusionSizeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop18;
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
    // InternalExpressionDsl.g:1294:1: entryRuleEvoSetInclusionSize returns [EObject current=null] : iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF ;
    public final EObject entryRuleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusionSize = null;


        try {
            // InternalExpressionDsl.g:1294:60: (iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF )
            // InternalExpressionDsl.g:1295:2: iv_ruleEvoSetInclusionSize= ruleEvoSetInclusionSize EOF
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
    // InternalExpressionDsl.g:1301:1: ruleEvoSetInclusionSize returns [EObject current=null] : (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) ;
    public final EObject ruleEvoSetInclusionSize() throws RecognitionException {
        EObject current = null;

        EObject this_EvoSetInclusion_0 = null;

        EObject this_EvoSize_1 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1307:2: ( (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize ) )
            // InternalExpressionDsl.g:1308:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            {
            // InternalExpressionDsl.g:1308:2: (this_EvoSetInclusion_0= ruleEvoSetInclusion | this_EvoSize_1= ruleEvoSize )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING||LA19_0==14) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalExpressionDsl.g:1309:3: this_EvoSetInclusion_0= ruleEvoSetInclusion
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
                    // InternalExpressionDsl.g:1318:3: this_EvoSize_1= ruleEvoSize
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
    // InternalExpressionDsl.g:1330:1: entryRuleEvoSetInclusion returns [EObject current=null] : iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF ;
    public final EObject entryRuleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetInclusion = null;


        try {
            // InternalExpressionDsl.g:1330:56: (iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF )
            // InternalExpressionDsl.g:1331:2: iv_ruleEvoSetInclusion= ruleEvoSetInclusion EOF
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
    // InternalExpressionDsl.g:1337:1: ruleEvoSetInclusion returns [EObject current=null] : (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) ;
    public final EObject ruleEvoSetInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetIntersection_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1343:2: ( (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* ) )
            // InternalExpressionDsl.g:1344:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            {
            // InternalExpressionDsl.g:1344:2: (this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )* )
            // InternalExpressionDsl.g:1345:3: this_EvoSetIntersection_0= ruleEvoSetIntersection ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getEvoSetIntersectionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_EvoSetIntersection_0=ruleEvoSetIntersection();

            state._fsp--;


            			current = this_EvoSetIntersection_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1353:3: ( () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalExpressionDsl.g:1354:4: () otherlv_2= 'inclusion' ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    {
            	    // InternalExpressionDsl.g:1354:4: ()
            	    // InternalExpressionDsl.g:1355:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetInclusionAccess().getEvoSetInclusionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetInclusionAccess().getInclusionKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1365:4: ( (lv_operand2_3_0= ruleEvoSetIntersection ) )
            	    // InternalExpressionDsl.g:1366:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    {
            	    // InternalExpressionDsl.g:1366:5: (lv_operand2_3_0= ruleEvoSetIntersection )
            	    // InternalExpressionDsl.g:1367:6: lv_operand2_3_0= ruleEvoSetIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetInclusionAccess().getOperand2EvoSetIntersectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop20;
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
    // InternalExpressionDsl.g:1389:1: entryRuleEvoSetIntersection returns [EObject current=null] : iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF ;
    public final EObject entryRuleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetIntersection = null;


        try {
            // InternalExpressionDsl.g:1389:59: (iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF )
            // InternalExpressionDsl.g:1390:2: iv_ruleEvoSetIntersection= ruleEvoSetIntersection EOF
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
    // InternalExpressionDsl.g:1396:1: ruleEvoSetIntersection returns [EObject current=null] : (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) ;
    public final EObject ruleEvoSetIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetUnion_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1402:2: ( (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* ) )
            // InternalExpressionDsl.g:1403:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            {
            // InternalExpressionDsl.g:1403:2: (this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )* )
            // InternalExpressionDsl.g:1404:3: this_EvoSetUnion_0= ruleEvoSetUnion ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getEvoSetUnionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_EvoSetUnion_0=ruleEvoSetUnion();

            state._fsp--;


            			current = this_EvoSetUnion_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1412:3: ( () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalExpressionDsl.g:1413:4: () otherlv_2= 'intersection' ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    {
            	    // InternalExpressionDsl.g:1413:4: ()
            	    // InternalExpressionDsl.g:1414:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetIntersectionAccess().getEvoSetIntersectionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetIntersectionAccess().getIntersectionKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1424:4: ( (lv_operand2_3_0= ruleEvoSetUnion ) )
            	    // InternalExpressionDsl.g:1425:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    {
            	    // InternalExpressionDsl.g:1425:5: (lv_operand2_3_0= ruleEvoSetUnion )
            	    // InternalExpressionDsl.g:1426:6: lv_operand2_3_0= ruleEvoSetUnion
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetIntersectionAccess().getOperand2EvoSetUnionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop21;
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
    // InternalExpressionDsl.g:1448:1: entryRuleEvoSetUnion returns [EObject current=null] : iv_ruleEvoSetUnion= ruleEvoSetUnion EOF ;
    public final EObject entryRuleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetUnion = null;


        try {
            // InternalExpressionDsl.g:1448:52: (iv_ruleEvoSetUnion= ruleEvoSetUnion EOF )
            // InternalExpressionDsl.g:1449:2: iv_ruleEvoSetUnion= ruleEvoSetUnion EOF
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
    // InternalExpressionDsl.g:1455:1: ruleEvoSetUnion returns [EObject current=null] : (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) ;
    public final EObject ruleEvoSetUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1461:2: ( (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* ) )
            // InternalExpressionDsl.g:1462:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            {
            // InternalExpressionDsl.g:1462:2: (this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )* )
            // InternalExpressionDsl.g:1463:3: this_EvoSetDifference_0= ruleEvoSetDifference ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetUnionAccess().getEvoSetDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_EvoSetDifference_0=ruleEvoSetDifference();

            state._fsp--;


            			current = this_EvoSetDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1471:3: ( () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalExpressionDsl.g:1472:4: () otherlv_2= 'union' ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    {
            	    // InternalExpressionDsl.g:1472:4: ()
            	    // InternalExpressionDsl.g:1473:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetUnionAccess().getEvoSetUnionOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetUnionAccess().getUnionKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1483:4: ( (lv_operand2_3_0= ruleEvoSetDifference ) )
            	    // InternalExpressionDsl.g:1484:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    {
            	    // InternalExpressionDsl.g:1484:5: (lv_operand2_3_0= ruleEvoSetDifference )
            	    // InternalExpressionDsl.g:1485:6: lv_operand2_3_0= ruleEvoSetDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetUnionAccess().getOperand2EvoSetDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop22;
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
    // InternalExpressionDsl.g:1507:1: entryRuleEvoSetDifference returns [EObject current=null] : iv_ruleEvoSetDifference= ruleEvoSetDifference EOF ;
    public final EObject entryRuleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetDifference = null;


        try {
            // InternalExpressionDsl.g:1507:57: (iv_ruleEvoSetDifference= ruleEvoSetDifference EOF )
            // InternalExpressionDsl.g:1508:2: iv_ruleEvoSetDifference= ruleEvoSetDifference EOF
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
    // InternalExpressionDsl.g:1514:1: ruleEvoSetDifference returns [EObject current=null] : (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) ;
    public final EObject ruleEvoSetDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetSymmetricDifference_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1520:2: ( (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* ) )
            // InternalExpressionDsl.g:1521:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            {
            // InternalExpressionDsl.g:1521:2: (this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )* )
            // InternalExpressionDsl.g:1522:3: this_EvoSetSymmetricDifference_0= ruleEvoSetSymmetricDifference ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getEvoSetSymmetricDifferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_EvoSetSymmetricDifference_0=ruleEvoSetSymmetricDifference();

            state._fsp--;


            			current = this_EvoSetSymmetricDifference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1530:3: ( () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalExpressionDsl.g:1531:4: () otherlv_2= 'difference' ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    {
            	    // InternalExpressionDsl.g:1531:4: ()
            	    // InternalExpressionDsl.g:1532:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetDifferenceAccess().getEvoSetDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetDifferenceAccess().getDifferenceKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1542:4: ( (lv_operand2_3_0= ruleEvoSetSymmetricDifference ) )
            	    // InternalExpressionDsl.g:1543:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    {
            	    // InternalExpressionDsl.g:1543:5: (lv_operand2_3_0= ruleEvoSetSymmetricDifference )
            	    // InternalExpressionDsl.g:1544:6: lv_operand2_3_0= ruleEvoSetSymmetricDifference
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetDifferenceAccess().getOperand2EvoSetSymmetricDifferenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalExpressionDsl.g:1566:1: entryRuleEvoSetSymmetricDifference returns [EObject current=null] : iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF ;
    public final EObject entryRuleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetSymmetricDifference = null;


        try {
            // InternalExpressionDsl.g:1566:66: (iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF )
            // InternalExpressionDsl.g:1567:2: iv_ruleEvoSetSymmetricDifference= ruleEvoSetSymmetricDifference EOF
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
    // InternalExpressionDsl.g:1573:1: ruleEvoSetSymmetricDifference returns [EObject current=null] : (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) ;
    public final EObject ruleEvoSetSymmetricDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoSetCartesianProduct_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1579:2: ( (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* ) )
            // InternalExpressionDsl.g:1580:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            {
            // InternalExpressionDsl.g:1580:2: (this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )* )
            // InternalExpressionDsl.g:1581:3: this_EvoSetCartesianProduct_0= ruleEvoSetCartesianProduct ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetCartesianProductParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_EvoSetCartesianProduct_0=ruleEvoSetCartesianProduct();

            state._fsp--;


            			current = this_EvoSetCartesianProduct_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1589:3: ( () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalExpressionDsl.g:1590:4: () otherlv_2= 'symmetric_difference' ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    {
            	    // InternalExpressionDsl.g:1590:4: ()
            	    // InternalExpressionDsl.g:1591:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetSymmetricDifferenceAccess().getEvoSetSymmetricDifferenceOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetSymmetricDifferenceAccess().getSymmetric_differenceKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1601:4: ( (lv_operand2_3_0= ruleEvoSetCartesianProduct ) )
            	    // InternalExpressionDsl.g:1602:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    {
            	    // InternalExpressionDsl.g:1602:5: (lv_operand2_3_0= ruleEvoSetCartesianProduct )
            	    // InternalExpressionDsl.g:1603:6: lv_operand2_3_0= ruleEvoSetCartesianProduct
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetSymmetricDifferenceAccess().getOperand2EvoSetCartesianProductParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop24;
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
    // InternalExpressionDsl.g:1625:1: entryRuleEvoSetCartesianProduct returns [EObject current=null] : iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF ;
    public final EObject entryRuleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetCartesianProduct = null;


        try {
            // InternalExpressionDsl.g:1625:63: (iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF )
            // InternalExpressionDsl.g:1626:2: iv_ruleEvoSetCartesianProduct= ruleEvoSetCartesianProduct EOF
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
    // InternalExpressionDsl.g:1632:1: ruleEvoSetCartesianProduct returns [EObject current=null] : (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) ;
    public final EObject ruleEvoSetCartesianProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EvoElementOf_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1638:2: ( (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* ) )
            // InternalExpressionDsl.g:1639:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            {
            // InternalExpressionDsl.g:1639:2: (this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )* )
            // InternalExpressionDsl.g:1640:3: this_EvoElementOf_0= ruleEvoElementOf ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            {

            			newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getEvoElementOfParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_EvoElementOf_0=ruleEvoElementOf();

            state._fsp--;


            			current = this_EvoElementOf_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressionDsl.g:1648:3: ( () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalExpressionDsl.g:1649:4: () otherlv_2= 'x' ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    {
            	    // InternalExpressionDsl.g:1649:4: ()
            	    // InternalExpressionDsl.g:1650:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEvoSetCartesianProductAccess().getEvoSetCartesianProductOperand1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetCartesianProductAccess().getXKeyword_1_1());
            	    			
            	    // InternalExpressionDsl.g:1660:4: ( (lv_operand2_3_0= ruleEvoElementOf ) )
            	    // InternalExpressionDsl.g:1661:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    {
            	    // InternalExpressionDsl.g:1661:5: (lv_operand2_3_0= ruleEvoElementOf )
            	    // InternalExpressionDsl.g:1662:6: lv_operand2_3_0= ruleEvoElementOf
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetCartesianProductAccess().getOperand2EvoElementOfParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operand2_3_0=ruleEvoElementOf();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvoSetCartesianProductRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operand2",
            	    							lv_operand2_3_0,
            	    							"de.evorepair.feature.expression.ExpressionDsl.EvoElementOf");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleEvoSetCartesianProduct"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalExpressionDsl.g:1684:1: entryRuleEvoFeatureVariable returns [EObject current=null] : iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF ;
    public final EObject entryRuleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoFeatureVariable = null;


        try {
            // InternalExpressionDsl.g:1684:59: (iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF )
            // InternalExpressionDsl.g:1685:2: iv_ruleEvoFeatureVariable= ruleEvoFeatureVariable EOF
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
    // InternalExpressionDsl.g:1691:1: ruleEvoFeatureVariable returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvoFeatureVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:1697:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalExpressionDsl.g:1698:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalExpressionDsl.g:1698:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalExpressionDsl.g:1699:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0());
            		
            // InternalExpressionDsl.g:1703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpressionDsl.g:1704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpressionDsl.g:1704:4: (lv_name_1_0= RULE_ID )
            // InternalExpressionDsl.g:1705:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEvoNot"
    // InternalExpressionDsl.g:1725:1: entryRuleEvoNot returns [EObject current=null] : iv_ruleEvoNot= ruleEvoNot EOF ;
    public final EObject entryRuleEvoNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoNot = null;


        try {
            // InternalExpressionDsl.g:1725:47: (iv_ruleEvoNot= ruleEvoNot EOF )
            // InternalExpressionDsl.g:1726:2: iv_ruleEvoNot= ruleEvoNot EOF
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
    // InternalExpressionDsl.g:1732:1: ruleEvoNot returns [EObject current=null] : (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1738:2: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' ) )
            // InternalExpressionDsl.g:1739:2: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
            {
            // InternalExpressionDsl.g:1739:2: (otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')' )
            // InternalExpressionDsl.g:1740:3: otherlv_0= 'not' otherlv_1= '(' ( (lv_operand_2_0= ruleEvoExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoNotAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpressionDsl.g:1748:3: ( (lv_operand_2_0= ruleEvoExpression ) )
            // InternalExpressionDsl.g:1749:4: (lv_operand_2_0= ruleEvoExpression )
            {
            // InternalExpressionDsl.g:1749:4: (lv_operand_2_0= ruleEvoExpression )
            // InternalExpressionDsl.g:1750:5: lv_operand_2_0= ruleEvoExpression
            {

            					newCompositeNode(grammarAccess.getEvoNotAccess().getOperandEvoExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operand_2_0=ruleEvoExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvoNotRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"de.evorepair.feature.expression.ExpressionDsl.EvoExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEvoNotAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleEvoSize"
    // InternalExpressionDsl.g:1775:1: entryRuleEvoSize returns [EObject current=null] : iv_ruleEvoSize= ruleEvoSize EOF ;
    public final EObject entryRuleEvoSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSize = null;


        try {
            // InternalExpressionDsl.g:1775:48: (iv_ruleEvoSize= ruleEvoSize EOF )
            // InternalExpressionDsl.g:1776:2: iv_ruleEvoSize= ruleEvoSize EOF
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
    // InternalExpressionDsl.g:1782:1: ruleEvoSize returns [EObject current=null] : ( () ( (lv_size_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEvoSize() throws RecognitionException {
        EObject current = null;

        Token lv_size_1_0=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:1788:2: ( ( () ( (lv_size_1_0= RULE_INT ) ) ) )
            // InternalExpressionDsl.g:1789:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            {
            // InternalExpressionDsl.g:1789:2: ( () ( (lv_size_1_0= RULE_INT ) ) )
            // InternalExpressionDsl.g:1790:3: () ( (lv_size_1_0= RULE_INT ) )
            {
            // InternalExpressionDsl.g:1790:3: ()
            // InternalExpressionDsl.g:1791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvoSizeAccess().getEvoSizeAction_0(),
            					current);
            			

            }

            // InternalExpressionDsl.g:1797:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalExpressionDsl.g:1798:4: (lv_size_1_0= RULE_INT )
            {
            // InternalExpressionDsl.g:1798:4: (lv_size_1_0= RULE_INT )
            // InternalExpressionDsl.g:1799:5: lv_size_1_0= RULE_INT
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
    // InternalExpressionDsl.g:1819:1: entryRuleEvoVariableTerm returns [EObject current=null] : iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF ;
    public final EObject entryRuleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoVariableTerm = null;


        try {
            // InternalExpressionDsl.g:1819:56: (iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF )
            // InternalExpressionDsl.g:1820:2: iv_ruleEvoVariableTerm= ruleEvoVariableTerm EOF
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
    // InternalExpressionDsl.g:1826:1: ruleEvoVariableTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoVariableTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1832:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalExpressionDsl.g:1833:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalExpressionDsl.g:1833:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalExpressionDsl.g:1834:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalExpressionDsl.g:1834:3: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:1835:4: ( ruleQualifiedName )
            {
            // InternalExpressionDsl.g:1835:4: ( ruleQualifiedName )
            // InternalExpressionDsl.g:1836:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoVariableTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoVariableTermAccess().getVariableEvoVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpressionDsl.g:1850:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=46 && LA26_0<=48)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalExpressionDsl.g:1851:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalExpressionDsl.g:1851:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalExpressionDsl.g:1852:5: lv_type_1_0= ruleEvoVariableType
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
    // InternalExpressionDsl.g:1873:1: entryRuleEvoApplicationConstraintTerm returns [EObject current=null] : iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF ;
    public final EObject entryRuleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoApplicationConstraintTerm = null;


        try {
            // InternalExpressionDsl.g:1873:69: (iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF )
            // InternalExpressionDsl.g:1874:2: iv_ruleEvoApplicationConstraintTerm= ruleEvoApplicationConstraintTerm EOF
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
    // InternalExpressionDsl.g:1880:1: ruleEvoApplicationConstraintTerm returns [EObject current=null] : (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) ;
    public final EObject ruleEvoApplicationConstraintTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:1886:2: ( (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' ) )
            // InternalExpressionDsl.g:1887:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            {
            // InternalExpressionDsl.g:1887:2: (otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')' )
            // InternalExpressionDsl.g:1888:3: otherlv_0= 'AC' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoApplicationConstraintTermAccess().getACKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEvoApplicationConstraintTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpressionDsl.g:1896:3: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:1897:4: ( ruleQualifiedName )
            {
            // InternalExpressionDsl.g:1897:4: ( ruleQualifiedName )
            // InternalExpressionDsl.g:1898:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoApplicationConstraintTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoApplicationConstraintTermAccess().getVariableEvoMappingVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEvoGroupTerm"
    // InternalExpressionDsl.g:1920:1: entryRuleEvoGroupTerm returns [EObject current=null] : iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF ;
    public final EObject entryRuleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoGroupTerm = null;


        try {
            // InternalExpressionDsl.g:1920:53: (iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF )
            // InternalExpressionDsl.g:1921:2: iv_ruleEvoGroupTerm= ruleEvoGroupTerm EOF
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
    // InternalExpressionDsl.g:1927:1: ruleEvoGroupTerm returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) ;
    public final EObject ruleEvoGroupTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1933:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? ) )
            // InternalExpressionDsl.g:1934:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            {
            // InternalExpressionDsl.g:1934:2: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )? )
            // InternalExpressionDsl.g:1935:3: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleEvoVariableType ) )?
            {
            // InternalExpressionDsl.g:1935:3: ( ( ruleQualifiedName ) )
            // InternalExpressionDsl.g:1936:4: ( ruleQualifiedName )
            {
            // InternalExpressionDsl.g:1936:4: ( ruleQualifiedName )
            // InternalExpressionDsl.g:1937:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvoGroupTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEvoGroupTermAccess().getVariableEvoGroupVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpressionDsl.g:1951:3: ( (lv_type_1_0= ruleEvoVariableType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=46 && LA27_0<=48)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalExpressionDsl.g:1952:4: (lv_type_1_0= ruleEvoVariableType )
                    {
                    // InternalExpressionDsl.g:1952:4: (lv_type_1_0= ruleEvoVariableType )
                    // InternalExpressionDsl.g:1953:5: lv_type_1_0= ruleEvoVariableType
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
    // InternalExpressionDsl.g:1974:1: entryRuleEvoSetTerm returns [EObject current=null] : iv_ruleEvoSetTerm= ruleEvoSetTerm EOF ;
    public final EObject entryRuleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetTerm = null;


        try {
            // InternalExpressionDsl.g:1974:51: (iv_ruleEvoSetTerm= ruleEvoSetTerm EOF )
            // InternalExpressionDsl.g:1975:2: iv_ruleEvoSetTerm= ruleEvoSetTerm EOF
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
    // InternalExpressionDsl.g:1981:1: ruleEvoSetTerm returns [EObject current=null] : (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEvoSetTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:1987:2: ( (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' ) )
            // InternalExpressionDsl.g:1988:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            {
            // InternalExpressionDsl.g:1988:2: (otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}' )
            // InternalExpressionDsl.g:1989:3: otherlv_0= '{' ( (lv_variables_1_0= ruleEvoSetVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getEvoSetTermAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalExpressionDsl.g:1993:3: ( (lv_variables_1_0= ruleEvoSetVariable ) )
            // InternalExpressionDsl.g:1994:4: (lv_variables_1_0= ruleEvoSetVariable )
            {
            // InternalExpressionDsl.g:1994:4: (lv_variables_1_0= ruleEvoSetVariable )
            // InternalExpressionDsl.g:1995:5: lv_variables_1_0= ruleEvoSetVariable
            {

            					newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalExpressionDsl.g:2012:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalExpressionDsl.g:2013:4: otherlv_2= ',' ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEvoSetTermAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalExpressionDsl.g:2017:4: ( (lv_variables_3_0= ruleEvoSetVariable ) )
            	    // InternalExpressionDsl.g:2018:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    {
            	    // InternalExpressionDsl.g:2018:5: (lv_variables_3_0= ruleEvoSetVariable )
            	    // InternalExpressionDsl.g:2019:6: lv_variables_3_0= ruleEvoSetVariable
            	    {

            	    						newCompositeNode(grammarAccess.getEvoSetTermAccess().getVariablesEvoSetVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_2); 

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
    // InternalExpressionDsl.g:2045:1: entryRuleEvoSetVariable returns [EObject current=null] : iv_ruleEvoSetVariable= ruleEvoSetVariable EOF ;
    public final EObject entryRuleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvoSetVariable = null;


        try {
            // InternalExpressionDsl.g:2045:55: (iv_ruleEvoSetVariable= ruleEvoSetVariable EOF )
            // InternalExpressionDsl.g:2046:2: iv_ruleEvoSetVariable= ruleEvoSetVariable EOF
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
    // InternalExpressionDsl.g:2052:1: ruleEvoSetVariable returns [EObject current=null] : (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) ;
    public final EObject ruleEvoSetVariable() throws RecognitionException {
        EObject current = null;

        EObject this_EvoVariableTerm_0 = null;

        EObject this_EvoSetTerm_1 = null;

        EObject this_EvoNot_2 = null;



        	enterRule();

        try {
            // InternalExpressionDsl.g:2058:2: ( (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot ) )
            // InternalExpressionDsl.g:2059:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            {
            // InternalExpressionDsl.g:2059:2: (this_EvoVariableTerm_0= ruleEvoVariableTerm | this_EvoSetTerm_1= ruleEvoSetTerm | this_EvoNot_2= ruleEvoNot )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 39:
                {
                alt29=2;
                }
                break;
            case 37:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalExpressionDsl.g:2060:3: this_EvoVariableTerm_0= ruleEvoVariableTerm
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
                    // InternalExpressionDsl.g:2069:3: this_EvoSetTerm_1= ruleEvoSetTerm
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
                    // InternalExpressionDsl.g:2078:3: this_EvoNot_2= ruleEvoNot
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


    // $ANTLR start "ruleEvoRelativeVersionRestrictionOperator"
    // InternalExpressionDsl.g:2090:1: ruleEvoRelativeVersionRestrictionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleEvoRelativeVersionRestrictionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:2096:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalExpressionDsl.g:2097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalExpressionDsl.g:2097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            case 44:
                {
                alt30=4;
                }
                break;
            case 45:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalExpressionDsl.g:2098:3: (enumLiteral_0= '<' )
                    {
                    // InternalExpressionDsl.g:2098:3: (enumLiteral_0= '<' )
                    // InternalExpressionDsl.g:2099:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:2106:3: (enumLiteral_1= '<=' )
                    {
                    // InternalExpressionDsl.g:2106:3: (enumLiteral_1= '<=' )
                    // InternalExpressionDsl.g:2107:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:2114:3: (enumLiteral_2= '=' )
                    {
                    // InternalExpressionDsl.g:2114:3: (enumLiteral_2= '=' )
                    // InternalExpressionDsl.g:2115:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressionDsl.g:2122:3: (enumLiteral_3= '>=' )
                    {
                    // InternalExpressionDsl.g:2122:3: (enumLiteral_3= '>=' )
                    // InternalExpressionDsl.g:2123:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressionDsl.g:2130:3: (enumLiteral_4= '>' )
                    {
                    // InternalExpressionDsl.g:2130:3: (enumLiteral_4= '>' )
                    // InternalExpressionDsl.g:2131:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvoRelativeVersionRestrictionOperatorAccess().getGreaterThanEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleEvoRelativeVersionRestrictionOperator"


    // $ANTLR start "ruleEvoVariableType"
    // InternalExpressionDsl.g:2141:1: ruleEvoVariableType returns [Enumerator current=null] : ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) ;
    public final Enumerator ruleEvoVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:2147:2: ( ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) ) )
            // InternalExpressionDsl.g:2148:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            {
            // InternalExpressionDsl.g:2148:2: ( (enumLiteral_0= '@ident' ) | (enumLiteral_1= '@pre' ) | (enumLiteral_2= '@post' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt31=1;
                }
                break;
            case 47:
                {
                alt31=2;
                }
                break;
            case 48:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalExpressionDsl.g:2149:3: (enumLiteral_0= '@ident' )
                    {
                    // InternalExpressionDsl.g:2149:3: (enumLiteral_0= '@ident' )
                    // InternalExpressionDsl.g:2150:4: enumLiteral_0= '@ident'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoVariableTypeAccess().getEvoIdentifierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:2157:3: (enumLiteral_1= '@pre' )
                    {
                    // InternalExpressionDsl.g:2157:3: (enumLiteral_1= '@pre' )
                    // InternalExpressionDsl.g:2158:4: enumLiteral_1= '@pre'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoVariableTypeAccess().getEvoSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:2165:3: (enumLiteral_2= '@post' )
                    {
                    // InternalExpressionDsl.g:2165:3: (enumLiteral_2= '@post' )
                    // InternalExpressionDsl.g:2166:4: enumLiteral_2= '@post'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

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
    // InternalExpressionDsl.g:2176:1: ruleHyFeatureTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) ;
    public final Enumerator ruleHyFeatureTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:2182:2: ( ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) ) )
            // InternalExpressionDsl.g:2183:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            {
            // InternalExpressionDsl.g:2183:2: ( (enumLiteral_0= 'optional' ) | (enumLiteral_1= 'mandatory' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            else if ( (LA32_0==50) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalExpressionDsl.g:2184:3: (enumLiteral_0= 'optional' )
                    {
                    // InternalExpressionDsl.g:2184:3: (enumLiteral_0= 'optional' )
                    // InternalExpressionDsl.g:2185:4: enumLiteral_0= 'optional'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyFeatureTypeEnumAccess().getOPTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:2192:3: (enumLiteral_1= 'mandatory' )
                    {
                    // InternalExpressionDsl.g:2192:3: (enumLiteral_1= 'mandatory' )
                    // InternalExpressionDsl.g:2193:4: enumLiteral_1= 'mandatory'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalExpressionDsl.g:2203:1: ruleHyGroupTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) ;
    public final Enumerator ruleHyGroupTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalExpressionDsl.g:2209:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) ) )
            // InternalExpressionDsl.g:2210:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            {
            // InternalExpressionDsl.g:2210:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'alternative' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt33=1;
                }
                break;
            case 52:
                {
                alt33=2;
                }
                break;
            case 53:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalExpressionDsl.g:2211:3: (enumLiteral_0= 'and' )
                    {
                    // InternalExpressionDsl.g:2211:3: (enumLiteral_0= 'and' )
                    // InternalExpressionDsl.g:2212:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHyGroupTypeEnumAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:2219:3: (enumLiteral_1= 'or' )
                    {
                    // InternalExpressionDsl.g:2219:3: (enumLiteral_1= 'or' )
                    // InternalExpressionDsl.g:2220:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHyGroupTypeEnumAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressionDsl.g:2227:3: (enumLiteral_2= 'alternative' )
                    {
                    // InternalExpressionDsl.g:2227:3: (enumLiteral_2= 'alternative' )
                    // InternalExpressionDsl.g:2228:4: enumLiteral_2= 'alternative'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\21\1\uffff\1\4\1\15\1\4\2\uffff\1\15";
    static final String dfa_3s = "\1\24\1\uffff\1\4\1\25\1\4\2\uffff\1\25";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\3\1\2\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\4\4\uffff\1\5\2\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\4\4\uffff\1\5\2\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "505:2: ( (otherlv_0= '[' ( (lv_lowerIncluded_1_0= 'true' ) ) ) | (otherlv_2= 'false' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( (lv_upperIncluded_5_0= 'true' ) ) ) | (otherlv_6= 'false' ( ( ruleQualifiedName ) ) otherlv_8= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000A000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000800000L});

}