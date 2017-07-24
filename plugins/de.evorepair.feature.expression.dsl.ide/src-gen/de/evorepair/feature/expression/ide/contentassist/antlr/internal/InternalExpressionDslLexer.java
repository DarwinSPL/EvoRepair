package de.evorepair.feature.expression.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionDslLexer extends Lexer {
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

    public InternalExpressionDslLexer() {;} 
    public InternalExpressionDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExpressionDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExpressionDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:11:7: ( 'false' )
            // InternalExpressionDsl.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:12:7: ( '<' )
            // InternalExpressionDsl.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:13:7: ( '<=' )
            // InternalExpressionDsl.g:13:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:14:7: ( '=' )
            // InternalExpressionDsl.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:15:7: ( '>=' )
            // InternalExpressionDsl.g:15:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:16:7: ( '>' )
            // InternalExpressionDsl.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:17:7: ( '@ident' )
            // InternalExpressionDsl.g:17:9: '@ident'
            {
            match("@ident"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:18:7: ( '@pre' )
            // InternalExpressionDsl.g:18:9: '@pre'
            {
            match("@pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:19:7: ( '@post' )
            // InternalExpressionDsl.g:19:9: '@post'
            {
            match("@post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:20:7: ( 'optional' )
            // InternalExpressionDsl.g:20:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:21:7: ( 'mandatory' )
            // InternalExpressionDsl.g:21:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:22:7: ( 'and' )
            // InternalExpressionDsl.g:22:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:23:7: ( 'or' )
            // InternalExpressionDsl.g:23:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:24:7: ( 'alternative' )
            // InternalExpressionDsl.g:24:9: 'alternative'
            {
            match("alternative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:25:7: ( 'elementOf' )
            // InternalExpressionDsl.g:25:9: 'elementOf'
            {
            match("elementOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:26:7: ( '.' )
            // InternalExpressionDsl.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:27:7: ( '(' )
            // InternalExpressionDsl.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:28:7: ( ')' )
            // InternalExpressionDsl.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:29:7: ( '->' )
            // InternalExpressionDsl.g:29:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:30:7: ( '[' )
            // InternalExpressionDsl.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:31:7: ( ']' )
            // InternalExpressionDsl.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:32:7: ( '-' )
            // InternalExpressionDsl.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:33:7: ( 'EnumLiteral(' )
            // InternalExpressionDsl.g:33:9: 'EnumLiteral('
            {
            match("EnumLiteral("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:34:7: ( ',' )
            // InternalExpressionDsl.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:35:7: ( 'eternity' )
            // InternalExpressionDsl.g:35:9: 'eternity'
            {
            match("eternity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:36:7: ( '||' )
            // InternalExpressionDsl.g:36:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:37:7: ( '&&' )
            // InternalExpressionDsl.g:37:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:38:7: ( '==' )
            // InternalExpressionDsl.g:38:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:39:7: ( '!=' )
            // InternalExpressionDsl.g:39:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:40:7: ( '<=>' )
            // InternalExpressionDsl.g:40:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:41:7: ( 'inclusion' )
            // InternalExpressionDsl.g:41:9: 'inclusion'
            {
            match("inclusion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:42:7: ( 'intersection' )
            // InternalExpressionDsl.g:42:9: 'intersection'
            {
            match("intersection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:43:7: ( 'union' )
            // InternalExpressionDsl.g:43:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:44:7: ( 'difference' )
            // InternalExpressionDsl.g:44:9: 'difference'
            {
            match("difference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:45:7: ( 'symmetric_difference' )
            // InternalExpressionDsl.g:45:9: 'symmetric_difference'
            {
            match("symmetric_difference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:46:7: ( 'x' )
            // InternalExpressionDsl.g:46:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:47:7: ( 'feature' )
            // InternalExpressionDsl.g:47:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:48:7: ( 'not' )
            // InternalExpressionDsl.g:48:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:49:7: ( 'AC' )
            // InternalExpressionDsl.g:49:9: 'AC'
            {
            match("AC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:50:7: ( '{' )
            // InternalExpressionDsl.g:50:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:51:7: ( '}' )
            // InternalExpressionDsl.g:51:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:52:7: ( 'true' )
            // InternalExpressionDsl.g:52:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5471:11: ( '0' .. '9' '/' ( '0' | '1' ) '0' .. '9' '/' ( '0' .. '9' )* )
            // InternalExpressionDsl.g:5471:13: '0' .. '9' '/' ( '0' | '1' ) '0' .. '9' '/' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            match('/'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            matchRange('0','9'); 
            match('/'); 
            // InternalExpressionDsl.g:5471:49: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressionDsl.g:5471:50: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5473:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalExpressionDsl.g:5473:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalExpressionDsl.g:5473:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressionDsl.g:5473:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalExpressionDsl.g:5473:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressionDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5475:10: ( ( '0' .. '9' )+ )
            // InternalExpressionDsl.g:5475:12: ( '0' .. '9' )+
            {
            // InternalExpressionDsl.g:5475:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressionDsl.g:5475:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5477:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalExpressionDsl.g:5477:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalExpressionDsl.g:5477:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressionDsl.g:5477:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalExpressionDsl.g:5477:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalExpressionDsl.g:5477:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExpressionDsl.g:5477:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalExpressionDsl.g:5477:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalExpressionDsl.g:5477:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalExpressionDsl.g:5477:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExpressionDsl.g:5477:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5479:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExpressionDsl.g:5479:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExpressionDsl.g:5479:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExpressionDsl.g:5479:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5481:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalExpressionDsl.g:5481:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalExpressionDsl.g:5481:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExpressionDsl.g:5481:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalExpressionDsl.g:5481:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpressionDsl.g:5481:41: ( '\\r' )? '\\n'
                    {
                    // InternalExpressionDsl.g:5481:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalExpressionDsl.g:5481:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5483:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExpressionDsl.g:5483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExpressionDsl.g:5483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpressionDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionDsl.g:5485:16: ( . )
            // InternalExpressionDsl.g:5485:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalExpressionDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=50;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalExpressionDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalExpressionDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalExpressionDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalExpressionDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalExpressionDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalExpressionDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalExpressionDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalExpressionDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalExpressionDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalExpressionDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalExpressionDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalExpressionDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalExpressionDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalExpressionDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalExpressionDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalExpressionDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalExpressionDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalExpressionDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalExpressionDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalExpressionDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalExpressionDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalExpressionDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalExpressionDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalExpressionDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalExpressionDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalExpressionDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalExpressionDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalExpressionDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalExpressionDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalExpressionDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalExpressionDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalExpressionDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalExpressionDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalExpressionDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalExpressionDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalExpressionDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalExpressionDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalExpressionDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalExpressionDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalExpressionDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalExpressionDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalExpressionDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalExpressionDsl.g:1:262: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 44 :
                // InternalExpressionDsl.g:1:272: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalExpressionDsl.g:1:280: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalExpressionDsl.g:1:289: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalExpressionDsl.g:1:301: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalExpressionDsl.g:1:317: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalExpressionDsl.g:1:333: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalExpressionDsl.g:1:341: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\51\1\53\1\55\1\57\1\46\4\51\3\uffff\1\75\2\uffff\1\51\1\uffff\3\46\4\51\1\111\2\51\2\uffff\1\51\1\120\1\46\1\uffff\3\46\2\uffff\2\51\1\uffff\1\130\7\uffff\1\51\1\134\5\51\7\uffff\1\51\4\uffff\4\51\1\uffff\1\51\1\151\2\uffff\1\51\6\uffff\2\51\4\uffff\1\51\1\uffff\1\51\1\157\11\51\1\171\1\uffff\5\51\1\uffff\11\51\1\uffff\1\u0088\1\u0089\11\51\1\u0093\2\51\2\uffff\11\51\1\uffff\2\51\1\u00a1\12\51\1\uffff\1\u00ac\3\51\1\u00b0\5\51\1\uffff\1\u00b6\1\51\1\u00b8\1\uffff\1\51\1\u00ba\3\51\1\uffff\1\51\1\uffff\1\51\1\uffff\1\51\1\u00c1\1\51\1\u00c3\2\51\1\uffff\1\51\2\uffff\1\u00c7\1\51\1\uffff\7\51\1\u00d0\1\uffff";
    static final String DFA13_eofS =
        "\u00d1\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\3\75\1\151\1\160\1\141\2\154\3\uffff\1\76\2\uffff\1\156\1\uffff\1\174\1\46\1\75\2\156\1\151\1\171\1\60\1\157\1\103\2\uffff\1\162\1\57\1\101\1\uffff\2\0\1\52\2\uffff\1\154\1\141\1\uffff\1\76\6\uffff\1\157\1\164\1\60\1\156\1\144\1\164\2\145\7\uffff\1\165\4\uffff\1\143\1\151\1\146\1\155\1\uffff\1\164\1\60\2\uffff\1\165\6\uffff\1\163\1\164\4\uffff\1\151\1\uffff\1\144\1\60\1\145\1\155\1\162\1\155\1\154\1\145\1\157\1\146\1\155\1\60\1\uffff\2\145\1\165\1\157\1\141\1\uffff\1\162\1\145\1\156\1\114\1\165\1\162\1\156\2\145\1\uffff\2\60\1\162\1\156\1\164\2\156\2\151\2\163\1\60\1\162\1\164\2\uffff\1\145\1\141\1\157\1\141\3\164\1\151\1\145\1\uffff\1\145\1\162\1\60\1\154\1\162\1\164\1\117\1\171\1\145\1\157\1\143\1\156\1\151\1\uffff\1\60\1\171\1\151\1\146\1\60\1\162\1\156\1\164\2\143\1\uffff\1\60\1\166\1\60\1\uffff\1\141\1\60\1\151\1\145\1\137\1\uffff\1\145\1\uffff\1\154\1\uffff\1\157\1\60\1\144\1\60\1\50\1\156\1\uffff\1\151\2\uffff\1\60\1\146\1\uffff\1\146\1\145\1\162\1\145\1\156\1\143\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\3\75\1\160\1\162\1\141\1\156\1\164\3\uffff\1\76\2\uffff\1\156\1\uffff\1\174\1\46\1\75\2\156\1\151\1\171\1\172\1\157\1\103\2\uffff\1\162\1\57\1\172\1\uffff\2\uffff\1\57\2\uffff\1\154\1\141\1\uffff\1\76\6\uffff\1\162\1\164\1\172\1\156\1\144\1\164\2\145\7\uffff\1\165\4\uffff\1\164\1\151\1\146\1\155\1\uffff\1\164\1\172\2\uffff\1\165\6\uffff\1\163\1\164\4\uffff\1\151\1\uffff\1\144\1\172\1\145\1\155\1\162\1\155\1\154\1\145\1\157\1\146\1\155\1\172\1\uffff\2\145\1\165\1\157\1\141\1\uffff\1\162\1\145\1\156\1\114\1\165\1\162\1\156\2\145\1\uffff\2\172\1\162\1\156\1\164\2\156\2\151\2\163\1\172\1\162\1\164\2\uffff\1\145\1\141\1\157\1\141\3\164\1\151\1\145\1\uffff\1\145\1\162\1\172\1\154\1\162\1\164\1\117\1\171\1\145\1\157\1\143\1\156\1\151\1\uffff\1\172\1\171\1\151\1\146\1\172\1\162\1\156\1\164\2\143\1\uffff\1\172\1\166\1\172\1\uffff\1\141\1\172\1\151\1\145\1\137\1\uffff\1\145\1\uffff\1\154\1\uffff\1\157\1\172\1\144\1\172\1\50\1\156\1\uffff\1\151\2\uffff\1\172\1\146\1\uffff\1\146\1\145\1\162\1\145\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\12\uffff\1\20\1\21\1\22\1\uffff\1\24\1\25\1\uffff\1\30\12\uffff\1\50\1\51\3\uffff\1\54\3\uffff\1\61\1\62\2\uffff\1\54\1\uffff\1\2\1\34\1\4\1\5\1\6\1\7\10\uffff\1\20\1\21\1\22\1\23\1\26\1\24\1\25\1\uffff\1\30\1\32\1\33\1\35\4\uffff\1\44\2\uffff\1\50\1\51\1\uffff\1\53\1\55\1\56\1\57\1\60\1\61\2\uffff\1\36\1\3\1\10\1\11\1\uffff\1\15\14\uffff\1\47\5\uffff\1\14\11\uffff\1\46\16\uffff\1\52\1\1\11\uffff\1\41\15\uffff\1\45\12\uffff\1\12\3\uffff\1\31\5\uffff\1\13\1\uffff\1\17\1\uffff\1\37\6\uffff\1\42\1\uffff\1\16\1\27\2\uffff\1\40\10\uffff\1\43";
    static final String DFA13_specialS =
        "\1\1\41\uffff\1\0\1\2\u00ad\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\24\1\42\3\46\1\23\1\43\1\13\1\14\2\46\1\21\1\15\1\12\1\44\12\37\2\46\1\2\1\3\1\4\1\46\1\5\1\33\3\41\1\20\25\41\1\16\1\46\1\17\1\40\1\41\1\46\1\10\2\41\1\27\1\11\1\1\2\41\1\25\3\41\1\7\1\32\1\6\3\41\1\30\1\36\1\26\2\41\1\31\2\41\1\34\1\22\1\35\uff82\46",
            "\1\47\3\uffff\1\50",
            "\1\52",
            "\1\54",
            "\1\56",
            "\1\60\6\uffff\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64",
            "\1\66\1\uffff\1\65",
            "\1\67\7\uffff\1\70",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "\1\100",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\116",
            "\1\117",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\0\121",
            "\0\121",
            "\1\122\4\uffff\1\123",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\2\uffff\1\131",
            "\1\133",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "",
            "",
            "",
            "",
            "\1\143\20\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "\1\155",
            "",
            "\1\156",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00b9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 81;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='<') ) {s = 2;}

                        else if ( (LA13_0=='=') ) {s = 3;}

                        else if ( (LA13_0=='>') ) {s = 4;}

                        else if ( (LA13_0=='@') ) {s = 5;}

                        else if ( (LA13_0=='o') ) {s = 6;}

                        else if ( (LA13_0=='m') ) {s = 7;}

                        else if ( (LA13_0=='a') ) {s = 8;}

                        else if ( (LA13_0=='e') ) {s = 9;}

                        else if ( (LA13_0=='.') ) {s = 10;}

                        else if ( (LA13_0=='(') ) {s = 11;}

                        else if ( (LA13_0==')') ) {s = 12;}

                        else if ( (LA13_0=='-') ) {s = 13;}

                        else if ( (LA13_0=='[') ) {s = 14;}

                        else if ( (LA13_0==']') ) {s = 15;}

                        else if ( (LA13_0=='E') ) {s = 16;}

                        else if ( (LA13_0==',') ) {s = 17;}

                        else if ( (LA13_0=='|') ) {s = 18;}

                        else if ( (LA13_0=='&') ) {s = 19;}

                        else if ( (LA13_0=='!') ) {s = 20;}

                        else if ( (LA13_0=='i') ) {s = 21;}

                        else if ( (LA13_0=='u') ) {s = 22;}

                        else if ( (LA13_0=='d') ) {s = 23;}

                        else if ( (LA13_0=='s') ) {s = 24;}

                        else if ( (LA13_0=='x') ) {s = 25;}

                        else if ( (LA13_0=='n') ) {s = 26;}

                        else if ( (LA13_0=='A') ) {s = 27;}

                        else if ( (LA13_0=='{') ) {s = 28;}

                        else if ( (LA13_0=='}') ) {s = 29;}

                        else if ( (LA13_0=='t') ) {s = 30;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 31;}

                        else if ( (LA13_0=='^') ) {s = 32;}

                        else if ( ((LA13_0>='B' && LA13_0<='D')||(LA13_0>='F' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='c')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='v' && LA13_0<='w')||(LA13_0>='y' && LA13_0<='z')) ) {s = 33;}

                        else if ( (LA13_0=='\"') ) {s = 34;}

                        else if ( (LA13_0=='\'') ) {s = 35;}

                        else if ( (LA13_0=='/') ) {s = 36;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 37;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_35 = input.LA(1);

                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFF')) ) {s = 81;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}