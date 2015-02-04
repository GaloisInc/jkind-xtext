package jkind.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jkind.xtext.services.JKindGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJKindParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'type'", "'='", "';'", "'struct'", "'{'", "':'", "'}'", "'enum'", "','", "'['", "']'", "'int'", "'bool'", "'real'", "'subrange'", "'of'", "'-'", "'const'", "'node'", "'('", "')'", "'returns'", "'var'", "'let'", "'tel'", "'--%PROPERTY'", "'--%MAIN'", "'--%REALIZABLE'", "'assert'", "'->'", "'=>'", "'or'", "'xor'", "'and'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'*'", "'/'", "'div'", "'mod'", "'not'", "'pre'", "'.'", "':='", "'if'", "'then'", "'else'", "'floor'", "'condact'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=7;
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
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=9;
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


        public InternalJKindParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJKindParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJKindParser.tokenNames; }
    public String getGrammarFileName() { return "../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g"; }



     	private JKindGrammarAccess grammarAccess;
     	
        public InternalJKindParser(TokenStream input, JKindGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	}
       	
       	@Override
       	protected JKindGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFile"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:67:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:68:2: (iv_ruleFile= ruleFile EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:69:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile75);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:76:1: ruleFile returns [EObject current=null] : ( ( (lv_typedefs_0_0= ruleTypeDef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )* ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_typedefs_0_0 = null;

        EObject lv_constants_1_0 = null;

        EObject lv_nodes_2_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:79:28: ( ( ( (lv_typedefs_0_0= ruleTypeDef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:1: ( ( (lv_typedefs_0_0= ruleTypeDef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )*
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:1: ( ( (lv_typedefs_0_0= ruleTypeDef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 10:
                    {
                    alt1=1;
                    }
                    break;
                case 27:
                    {
                    alt1=2;
                    }
                    break;
                case 28:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:2: ( (lv_typedefs_0_0= ruleTypeDef ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:2: ( (lv_typedefs_0_0= ruleTypeDef ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:81:1: (lv_typedefs_0_0= ruleTypeDef )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:81:1: (lv_typedefs_0_0= ruleTypeDef )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:82:3: lv_typedefs_0_0= ruleTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getTypedefsTypeDefParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeDef_in_ruleFile131);
            	    lv_typedefs_0_0=ruleTypeDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typedefs",
            	              		lv_typedefs_0_0, 
            	              		"TypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:99:6: ( (lv_constants_1_0= ruleConstant ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:99:6: ( (lv_constants_1_0= ruleConstant ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:100:1: (lv_constants_1_0= ruleConstant )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:100:1: (lv_constants_1_0= ruleConstant )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:101:3: lv_constants_1_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstant_in_ruleFile158);
            	    lv_constants_1_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_1_0, 
            	              		"Constant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:118:6: ( (lv_nodes_2_0= ruleNode ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:118:6: ( (lv_nodes_2_0= ruleNode ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:119:1: (lv_nodes_2_0= ruleNode )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:119:1: (lv_nodes_2_0= ruleNode )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:120:3: lv_nodes_2_0= ruleNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNode_in_ruleFile185);
            	    lv_nodes_2_0=ruleNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nodes",
            	              		lv_nodes_2_0, 
            	              		"Node");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTypeDef"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:144:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:145:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:146:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef222);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef232); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:153:1: ruleTypeDef returns [EObject current=null] : ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) | ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_name_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_type_4_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_fields_16_0 = null;

        EObject lv_types_18_0 = null;

        EObject lv_values_27_0 = null;

        EObject lv_values_29_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:156:28: ( ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) | ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) | ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) | ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==11) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            {
                            alt4=1;
                            }
                            break;
                        case 13:
                            {
                            alt4=2;
                            }
                            break;
                        case 17:
                            {
                            alt4=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:3: () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:158:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getAbbreviationTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,10,FOLLOW_10_in_ruleTypeDef279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getTypeKeyword_0_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:167:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:168:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:168:1: (lv_name_2_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:169:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTypeDef313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_0_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:189:1: ( (lv_type_4_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:190:1: (lv_type_4_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:190:1: (lv_type_4_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:191:3: lv_type_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTypeDef334);
                    lv_type_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeDefAccess().getSemicolonKeyword_0_5());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:6: ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:6: ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:7: () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:213:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getRecordTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,10,FOLLOW_10_in_ruleTypeDef375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTypeDefAccess().getTypeKeyword_1_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:222:1: ( (lv_name_8_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:223:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:223:1: (lv_name_8_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:224:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_8_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,11,FOLLOW_11_in_ruleTypeDef409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_1_3());
                          
                    }
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleTypeDef421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTypeDefAccess().getStructKeyword_1_4());
                          
                    }
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleTypeDef433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_1_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:252:1: ( (lv_fields_12_0= ruleField ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:253:1: (lv_fields_12_0= ruleField )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:253:1: (lv_fields_12_0= ruleField )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:254:3: lv_fields_12_0= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_1_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleTypeDef454);
                    lv_fields_12_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_12_0, 
                              		"Field");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleTypeDef466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTypeDefAccess().getColonKeyword_1_7());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:274:1: ( (lv_types_14_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:275:1: (lv_types_14_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:275:1: (lv_types_14_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:276:3: lv_types_14_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypesTypeParserRuleCall_1_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTypeDef487);
                    lv_types_14_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"types",
                              		lv_types_14_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:292:2: (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:292:4: otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) )
                    	    {
                    	    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef500); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getTypeDefAccess().getSemicolonKeyword_1_9_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:296:1: ( (lv_fields_16_0= ruleField ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:297:1: (lv_fields_16_0= ruleField )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:297:1: (lv_fields_16_0= ruleField )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:298:3: lv_fields_16_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_1_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleField_in_ruleTypeDef521);
                    	    lv_fields_16_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_16_0, 
                    	              		"Field");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleTypeDef533); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getTypeDefAccess().getColonKeyword_1_9_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:318:1: ( (lv_types_18_0= ruleType ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:319:1: (lv_types_18_0= ruleType )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:319:1: (lv_types_18_0= ruleType )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:320:3: lv_types_18_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypesTypeParserRuleCall_1_9_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleType_in_ruleTypeDef554);
                    	    lv_types_18_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"types",
                    	              		lv_types_18_0, 
                    	              		"Type");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleTypeDef568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_1_10());
                          
                    }
                    otherlv_20=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTypeDefAccess().getSemicolonKeyword_1_11());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:345:6: ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:345:6: ( () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:345:7: () otherlv_22= 'type' ( (lv_name_23_0= RULE_ID ) ) otherlv_24= '=' otherlv_25= 'enum' otherlv_26= '{' ( (lv_values_27_0= ruleEnumValue ) ) (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )* otherlv_30= '}' otherlv_31= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:345:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:346:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeDefAccess().getEnumTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,10,FOLLOW_10_in_ruleTypeDef609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getTypeDefAccess().getTypeKeyword_2_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:355:1: ( (lv_name_23_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:356:1: (lv_name_23_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:356:1: (lv_name_23_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:357:3: lv_name_23_0= RULE_ID
                    {
                    lv_name_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_23_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_23_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,11,FOLLOW_11_in_ruleTypeDef643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2_3());
                          
                    }
                    otherlv_25=(Token)match(input,17,FOLLOW_17_in_ruleTypeDef655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getTypeDefAccess().getEnumKeyword_2_4());
                          
                    }
                    otherlv_26=(Token)match(input,14,FOLLOW_14_in_ruleTypeDef667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_2_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:385:1: ( (lv_values_27_0= ruleEnumValue ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:386:1: (lv_values_27_0= ruleEnumValue )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:386:1: (lv_values_27_0= ruleEnumValue )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:387:3: lv_values_27_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefAccess().getValuesEnumValueParserRuleCall_2_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleTypeDef688);
                    lv_values_27_0=ruleEnumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_27_0, 
                              		"EnumValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:403:2: (otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:403:4: otherlv_28= ',' ( (lv_values_29_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_28=(Token)match(input,18,FOLLOW_18_in_ruleTypeDef701); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_28, grammarAccess.getTypeDefAccess().getCommaKeyword_2_7_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:407:1: ( (lv_values_29_0= ruleEnumValue ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:408:1: (lv_values_29_0= ruleEnumValue )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:408:1: (lv_values_29_0= ruleEnumValue )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:409:3: lv_values_29_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefAccess().getValuesEnumValueParserRuleCall_2_7_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEnumValue_in_ruleTypeDef722);
                    	    lv_values_29_0=ruleEnumValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_29_0, 
                    	              		"EnumValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,16,FOLLOW_16_in_ruleTypeDef736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_2_8());
                          
                    }
                    otherlv_31=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getTypeDefAccess().getSemicolonKeyword_2_9());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleEnumValue"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:441:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:442:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:443:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue785);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:450:1: ruleEnumValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:453:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:454:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:454:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:454:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:454:2: ()
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:455:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEnumValueAccess().getEnumValueAction_0(),
                          current);
                  
            }

            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:460:2: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:461:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:461:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:462:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumValue846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:486:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:487:2: (iv_ruleType= ruleType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:488:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType887);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType897); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:495:1: ruleType returns [EObject current=null] : this_ArrayType_0= ruleArrayType ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayType_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:498:28: (this_ArrayType_0= ruleArrayType )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:500:5: this_ArrayType_0= ruleArrayType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrayType_in_ruleType943);
            this_ArrayType_0=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArrayType_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleArrayType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:516:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:517:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:518:2: iv_ruleArrayType= ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType977);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType987); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:525:1: ruleArrayType returns [EObject current=null] : (this_AtomicType_0= ruleAtomicType ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        EObject this_AtomicType_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:528:28: ( (this_AtomicType_0= ruleAtomicType ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:529:1: (this_AtomicType_0= ruleAtomicType ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:529:1: (this_AtomicType_0= ruleAtomicType ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:530:5: this_AtomicType_0= ruleAtomicType ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayTypeAccess().getAtomicTypeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicType_in_ruleArrayType1034);
            this_AtomicType_0=ruleAtomicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicType_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:538:1: ( () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:538:2: () otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:538:2: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:539:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleArrayType1055); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:548:1: ( (lv_size_3_0= RULE_INT ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:549:1: (lv_size_3_0= RULE_INT )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:549:1: (lv_size_3_0= RULE_INT )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:550:3: lv_size_3_0= RULE_INT
            	    {
            	    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayType1072); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_size_3_0, grammarAccess.getArrayTypeAccess().getSizeINTTerminalRuleCall_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getArrayTypeRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"size",
            	              		lv_size_3_0, 
            	              		"INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleArrayType1089); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleAtomicType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:578:1: entryRuleAtomicType returns [EObject current=null] : iv_ruleAtomicType= ruleAtomicType EOF ;
    public final EObject entryRuleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:579:2: (iv_ruleAtomicType= ruleAtomicType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:580:2: iv_ruleAtomicType= ruleAtomicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicType_in_entryRuleAtomicType1127);
            iv_ruleAtomicType=ruleAtomicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicType1137); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicType"


    // $ANTLR start "ruleAtomicType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:587:1: ruleAtomicType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_low_9_0 = null;

        AntlrDatatypeRuleToken lv_high_11_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:590:28: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:2: ( () otherlv_1= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:2: ( () otherlv_1= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:3: () otherlv_1= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:591:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:592:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicTypeAccess().getIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAtomicType1184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomicTypeAccess().getIntKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:602:6: ( () otherlv_3= 'bool' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:602:6: ( () otherlv_3= 'bool' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:602:7: () otherlv_3= 'bool'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:602:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:603:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicTypeAccess().getBoolTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAtomicType1213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicTypeAccess().getBoolKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:613:6: ( () otherlv_5= 'real' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:613:6: ( () otherlv_5= 'real' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:613:7: () otherlv_5= 'real'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:613:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:614:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicTypeAccess().getRealTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAtomicType1242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicTypeAccess().getRealKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:7: () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:625:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicTypeAccess().getSubrangeTypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleAtomicType1271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAtomicTypeAccess().getSubrangeKeyword_3_1());
                          
                    }
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleAtomicType1283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAtomicTypeAccess().getLeftSquareBracketKeyword_3_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:638:1: ( (lv_low_9_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:639:1: (lv_low_9_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:639:1: (lv_low_9_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:640:3: lv_low_9_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleAtomicType1304);
                    lv_low_9_0=ruleBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"low",
                              		lv_low_9_0, 
                              		"Bound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleAtomicType1316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAtomicTypeAccess().getCommaKeyword_3_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:660:1: ( (lv_high_11_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:661:1: (lv_high_11_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:661:1: (lv_high_11_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:662:3: lv_high_11_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleAtomicType1337);
                    lv_high_11_0=ruleBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"high",
                              		lv_high_11_0, 
                              		"Bound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleAtomicType1349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getAtomicTypeAccess().getRightSquareBracketKeyword_3_6());
                          
                    }
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleAtomicType1361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicTypeAccess().getOfKeyword_3_7());
                          
                    }
                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleAtomicType1373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getAtomicTypeAccess().getIntKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:691:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:691:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:691:7: () ( (otherlv_16= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:691:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:692:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicTypeAccess().getUserTypeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:697:2: ( (otherlv_16= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:698:1: (otherlv_16= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:698:1: (otherlv_16= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:699:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicTypeRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicType1410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_16, grammarAccess.getAtomicTypeAccess().getDefTypeDefCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomicType"


    // $ANTLR start "entryRuleField"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:718:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:719:2: (iv_ruleField= ruleField EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:720:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1447);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:727:1: ruleField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:730:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:731:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:731:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:732:1: (lv_name_0_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:732:1: (lv_name_0_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:733:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBound"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:757:1: entryRuleBound returns [String current=null] : iv_ruleBound= ruleBound EOF ;
    public final String entryRuleBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBound = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:758:2: (iv_ruleBound= ruleBound EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:759:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound1539);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound1550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:766:1: ruleBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:769:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:771:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBound1589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBound1606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleConstant"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:791:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:792:2: (iv_ruleConstant= ruleConstant EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:793:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1651);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:800:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:803:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:804:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:804:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:804:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConstant1698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:808:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:809:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:809:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:810:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:826:2: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:826:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConstant1733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getColonKeyword_2_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:830:1: ( (lv_type_3_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:831:1: (lv_type_3_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:831:1: (lv_type_3_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:832:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleConstant1754);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleConstant1768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:852:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:853:1: (lv_expr_5_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:853:1: (lv_expr_5_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:854:3: lv_expr_5_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleConstant1789);
            lv_expr_5_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_5_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleConstant1801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNode"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:882:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:883:2: (iv_ruleNode= ruleNode EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1837);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:891:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )* otherlv_23= 'tel' (otherlv_24= ';' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_outputs_9_0 = null;

        EObject lv_outputs_11_0 = null;

        EObject lv_locals_15_0 = null;

        EObject lv_equations_18_0 = null;

        EObject lv_assertions_19_0 = null;

        EObject lv_properties_20_0 = null;

        AntlrDatatypeRuleToken lv_main_21_0 = null;

        EObject lv_realizabilityInputs_22_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:894:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )* otherlv_23= 'tel' (otherlv_24= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:895:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )* otherlv_23= 'tel' (otherlv_24= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:895:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )* otherlv_23= 'tel' (otherlv_24= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:895:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )* otherlv_23= 'tel' (otherlv_24= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleNode1884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:899:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:900:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:900:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:901:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleNode1918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:921:1: ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:921:2: ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:921:2: ( (lv_inputs_3_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:922:1: (lv_inputs_3_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:922:1: (lv_inputs_3_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:923:3: lv_inputs_3_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1940);
                    lv_inputs_3_0=ruleVariableGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"inputs",
                              		lv_inputs_3_0, 
                              		"VariableGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:939:2: (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:939:4: otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleNode1953); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:943:1: ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:944:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:944:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:945:3: lv_inputs_5_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1974);
                    	    lv_inputs_5_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"inputs",
                    	              		lv_inputs_5_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleNode1990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleNode2002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getReturnsKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleNode2014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:973:1: ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:973:2: ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:973:2: ( (lv_outputs_9_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:974:1: (lv_outputs_9_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:974:1: (lv_outputs_9_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:975:3: lv_outputs_9_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode2036);
                    lv_outputs_9_0=ruleVariableGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"outputs",
                              		lv_outputs_9_0, 
                              		"VariableGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:991:2: (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==12) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:991:4: otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleNode2049); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:995:1: ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:996:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:996:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:997:3: lv_outputs_11_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode2070);
                    	    lv_outputs_11_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"outputs",
                    	              		lv_outputs_11_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleNode2086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleNode2098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getSemicolonKeyword_9());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1021:1: (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1021:3: otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleNode2111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getVarKeyword_10_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1025:1: ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1025:2: ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';'
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1025:2: ( (lv_locals_15_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1026:1: (lv_locals_15_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1026:1: (lv_locals_15_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1027:3: lv_locals_15_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode2133);
                    	    lv_locals_15_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"locals",
                    	              		lv_locals_15_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleNode2145); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleNode2161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLetKeyword_11());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:1: ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) | ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) ) )*
            loop15:
            do {
                int alt15=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case 29:
                    {
                    alt15=1;
                    }
                    break;
                case 38:
                    {
                    alt15=2;
                    }
                    break;
                case 35:
                    {
                    alt15=3;
                    }
                    break;
                case 36:
                    {
                    alt15=4;
                    }
                    break;
                case 37:
                    {
                    alt15=5;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( (lv_equations_18_0= ruleEquation ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( (lv_equations_18_0= ruleEquation ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: (lv_equations_18_0= ruleEquation )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: (lv_equations_18_0= ruleEquation )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1053:3: lv_equations_18_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquation_in_ruleNode2183);
            	    lv_equations_18_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_18_0, 
            	              		"Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1070:6: ( (lv_assertions_19_0= ruleAssertion ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1070:6: ( (lv_assertions_19_0= ruleAssertion ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1071:1: (lv_assertions_19_0= ruleAssertion )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1071:1: (lv_assertions_19_0= ruleAssertion )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1072:3: lv_assertions_19_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertion_in_ruleNode2210);
            	    lv_assertions_19_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assertions",
            	              		lv_assertions_19_0, 
            	              		"Assertion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1089:6: ( (lv_properties_20_0= ruleProperty ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1089:6: ( (lv_properties_20_0= ruleProperty ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1090:1: (lv_properties_20_0= ruleProperty )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1090:1: (lv_properties_20_0= ruleProperty )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1091:3: lv_properties_20_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleNode2237);
            	    lv_properties_20_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_20_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1108:6: ( (lv_main_21_0= ruleMain ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1108:6: ( (lv_main_21_0= ruleMain ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1109:1: (lv_main_21_0= ruleMain )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1109:1: (lv_main_21_0= ruleMain )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1110:3: lv_main_21_0= ruleMain
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMain_in_ruleNode2264);
            	    lv_main_21_0=ruleMain();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"main",
            	              		lv_main_21_0, 
            	              		"Main");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1127:6: ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1127:6: ( (lv_realizabilityInputs_22_0= ruleRealizabilityInputs ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1128:1: (lv_realizabilityInputs_22_0= ruleRealizabilityInputs )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1128:1: (lv_realizabilityInputs_22_0= ruleRealizabilityInputs )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1129:3: lv_realizabilityInputs_22_0= ruleRealizabilityInputs
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getRealizabilityInputsRealizabilityInputsParserRuleCall_12_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRealizabilityInputs_in_ruleNode2291);
            	    lv_realizabilityInputs_22_0=ruleRealizabilityInputs();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"realizabilityInputs",
            	              		lv_realizabilityInputs_22_0, 
            	              		"RealizabilityInputs");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_23=(Token)match(input,34,FOLLOW_34_in_ruleNode2305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getTelKeyword_13());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1149:1: (otherlv_24= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1149:3: otherlv_24= ';'
                    {
                    otherlv_24=(Token)match(input,12,FOLLOW_12_in_ruleNode2318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getNodeAccess().getSemicolonKeyword_14());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleVariableGroup"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1161:1: entryRuleVariableGroup returns [EObject current=null] : iv_ruleVariableGroup= ruleVariableGroup EOF ;
    public final EObject entryRuleVariableGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableGroup = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1162:2: (iv_ruleVariableGroup= ruleVariableGroup EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:2: iv_ruleVariableGroup= ruleVariableGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup2356);
            iv_ruleVariableGroup=ruleVariableGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableGroup2366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableGroup"


    // $ANTLR start "ruleVariableGroup"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1170:1: ruleVariableGroup returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleVariableGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1173:28: ( ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1174:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1174:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1174:2: ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1174:2: ( (lv_variables_0_0= ruleVariable ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1175:1: (lv_variables_0_0= ruleVariable )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1175:1: (lv_variables_0_0= ruleVariable )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1176:3: lv_variables_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup2412);
            lv_variables_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1192:2: (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1192:4: otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleVariableGroup2425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1196:1: ( (lv_variables_2_0= ruleVariable ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1197:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1197:1: (lv_variables_2_0= ruleVariable )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1198:3: lv_variables_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup2446);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_2_0, 
            	              		"Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableGroup2460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableGroupAccess().getColonKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1218:1: ( (lv_type_4_0= ruleType ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1219:1: (lv_type_4_0= ruleType )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1219:1: (lv_type_4_0= ruleType )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1220:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableGroup2481);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableGroup"


    // $ANTLR start "entryRuleVariable"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1245:2: (iv_ruleVariable= ruleVariable EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1246:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2517);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2527); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1253:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1256:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1257:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1257:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1258:1: (lv_name_0_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1258:1: (lv_name_0_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1259:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEquation"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1283:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1284:2: (iv_ruleEquation= ruleEquation EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1285:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation2608);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation2618); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1292:1: ruleEquation returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_rhs_4_0 = null;

        EObject lv_rhs_12_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1295:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:3: ( (otherlv_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1297:1: (otherlv_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1297:1: (otherlv_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1298:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1309:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1309:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEquation2677); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getCommaKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1313:1: ( (otherlv_2= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1314:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1314:1: (otherlv_2= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1315:3: otherlv_2= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEquationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleEquation2711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1330:1: ( (lv_rhs_4_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:1: (lv_rhs_4_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:1: (lv_rhs_4_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1332:3: lv_rhs_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleEquation2732);
                    lv_rhs_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_4_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEquation2744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getSemicolonKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1353:6: (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1353:6: (otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1353:8: otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= ')' otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleEquation2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEquationAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:1: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:2: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            {
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:2: ( (otherlv_7= RULE_ID ) )
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1358:1: (otherlv_7= RULE_ID )
                            {
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1358:1: (otherlv_7= RULE_ID )
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1359:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEquationRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2785); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1370:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==18) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1370:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEquation2798); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEquationAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1374:1: ( (otherlv_9= RULE_ID ) )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1375:1: (otherlv_9= RULE_ID )
                            	    {
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1375:1: (otherlv_9= RULE_ID )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1376:3: otherlv_9= RULE_ID
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getEquationRule());
                            	      	        }
                            	              
                            	    }
                            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2818); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		newLeafNode(otherlv_9, grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_1_1_0()); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleEquation2834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getEquationAccess().getRightParenthesisKeyword_1_2());
                          
                    }
                    otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleEquation2846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1395:1: ( (lv_rhs_12_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1396:1: (lv_rhs_12_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1396:1: (lv_rhs_12_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1397:3: lv_rhs_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleEquation2867);
                    lv_rhs_12_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_12_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleEquation2879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEquationAccess().getSemicolonKeyword_1_5());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleProperty"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1425:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1426:2: (iv_ruleProperty= ruleProperty EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1427:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2916);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2926); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1434:1: ruleProperty returns [EObject current=null] : (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1437:28: ( (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1438:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1438:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1438:3: otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty2963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPROPERTYKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1442:1: ( (otherlv_1= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1443:1: (otherlv_1= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1443:1: (otherlv_1= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1444:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProperty2995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMain"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1467:1: entryRuleMain returns [String current=null] : iv_ruleMain= ruleMain EOF ;
    public final String entryRuleMain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMain = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1468:2: (iv_ruleMain= ruleMain EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1469:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain3032);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain3043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:1: ruleMain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--%MAIN' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleMain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1479:28: ( (kw= '--%MAIN' (kw= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1480:1: (kw= '--%MAIN' (kw= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1480:1: (kw= '--%MAIN' (kw= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1481:2: kw= '--%MAIN' (kw= ';' )?
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleMain3081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMainAccess().getMAINKeyword_0()); 
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1486:1: (kw= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1487:2: kw= ';'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleMain3095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRealizabilityInputs"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1500:1: entryRuleRealizabilityInputs returns [EObject current=null] : iv_ruleRealizabilityInputs= ruleRealizabilityInputs EOF ;
    public final EObject entryRuleRealizabilityInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealizabilityInputs = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1501:2: (iv_ruleRealizabilityInputs= ruleRealizabilityInputs EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1502:2: iv_ruleRealizabilityInputs= ruleRealizabilityInputs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealizabilityInputsRule()); 
            }
            pushFollow(FOLLOW_ruleRealizabilityInputs_in_entryRuleRealizabilityInputs3137);
            iv_ruleRealizabilityInputs=ruleRealizabilityInputs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealizabilityInputs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealizabilityInputs3147); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealizabilityInputs"


    // $ANTLR start "ruleRealizabilityInputs"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1509:1: ruleRealizabilityInputs returns [EObject current=null] : ( () otherlv_1= '--%REALIZABLE' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ';' ) ;
    public final EObject ruleRealizabilityInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1512:28: ( ( () otherlv_1= '--%REALIZABLE' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:1: ( () otherlv_1= '--%REALIZABLE' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:1: ( () otherlv_1= '--%REALIZABLE' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:2: () otherlv_1= '--%REALIZABLE' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ';'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:2: ()
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1514:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealizabilityInputsAccess().getRealizabilityInputsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleRealizabilityInputs3193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealizabilityInputsAccess().getREALIZABLEKeyword_1());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1523:1: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1523:2: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1523:2: ( (otherlv_2= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1524:1: (otherlv_2= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1524:1: (otherlv_2= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1525:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealizabilityInputsRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRealizabilityInputs3214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getRealizabilityInputsAccess().getIdsVariableCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1536:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1536:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRealizabilityInputs3227); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getRealizabilityInputsAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1540:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1541:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1541:1: (otherlv_4= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1542:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRealizabilityInputsRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRealizabilityInputs3247); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getRealizabilityInputsAccess().getIdsVariableCrossReference_2_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRealizabilityInputs3263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRealizabilityInputsAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealizabilityInputs"


    // $ANTLR start "entryRuleAssertion"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1565:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1566:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1567:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion3299);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion3309); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1574:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1577:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1578:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1578:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1578:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleAssertion3346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1582:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1583:1: (lv_expr_1_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1583:1: (lv_expr_1_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1584:3: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleAssertion3367);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAssertion3379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1612:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1613:2: (iv_ruleExpr= ruleExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr3415);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr3425); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1621:1: ruleExpr returns [EObject current=null] : this_ArrowExpr_0= ruleArrowExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ArrowExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1624:28: (this_ArrowExpr_0= ruleArrowExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1626:5: this_ArrowExpr_0= ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr3471);
            this_ArrowExpr_0=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArrowExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleArrowExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1642:1: entryRuleArrowExpr returns [EObject current=null] : iv_ruleArrowExpr= ruleArrowExpr EOF ;
    public final EObject entryRuleArrowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1643:2: (iv_ruleArrowExpr= ruleArrowExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1644:2: iv_ruleArrowExpr= ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr3505);
            iv_ruleArrowExpr=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr3515); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrowExpr"


    // $ANTLR start "ruleArrowExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1651:1: ruleArrowExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) ;
    public final EObject ruleArrowExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1654:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1655:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1655:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1656:5: this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_ruleArrowExpr3562);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:1: ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred1_InternalJKind()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:3: ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1671:6: ( () ( (lv_op_2_0= '->' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1671:7: () ( (lv_op_2_0= '->' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1671:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1672:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1677:2: ( (lv_op_2_0= '->' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1678:1: (lv_op_2_0= '->' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1678:1: (lv_op_2_0= '->' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1679:3: lv_op_2_0= '->'
                    {
                    lv_op_2_0=(Token)match(input,39,FOLLOW_39_in_ruleArrowExpr3613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrowExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "->");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1692:4: ( (lv_right_3_0= ruleArrowExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1693:1: (lv_right_3_0= ruleArrowExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1693:1: (lv_right_3_0= ruleArrowExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1694:3: lv_right_3_0= ruleArrowExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrowExpr_in_ruleArrowExpr3649);
                    lv_right_3_0=ruleArrowExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrowExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ArrowExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrowExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1718:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1719:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1720:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr3687);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr3697); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1727:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1730:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1731:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1731:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1732:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpr_in_ruleImpliesExpr3744);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:1: ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred2_InternalJKind()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:3: ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1747:6: ( () ( (lv_op_2_0= '=>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1747:7: () ( (lv_op_2_0= '=>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1747:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1748:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1753:2: ( (lv_op_2_0= '=>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1754:1: (lv_op_2_0= '=>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1754:1: (lv_op_2_0= '=>' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1755:3: lv_op_2_0= '=>'
                    {
                    lv_op_2_0=(Token)match(input,40,FOLLOW_40_in_ruleImpliesExpr3795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImpliesExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1768:4: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1769:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1769:1: (lv_right_3_0= ruleImpliesExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1770:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr3831);
                    lv_right_3_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ImpliesExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1794:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1795:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1796:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr3869);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr3879); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1803:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1807:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1807:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1808:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3926);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:1: ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==42) ) {
                    int LA28_3 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1829:6: ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1829:7: () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1829:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1830:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1835:2: ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1836:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1836:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1837:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1837:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==41) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==42) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1838:3: lv_op_2_1= 'or'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_41_in_ruleOrExpr3998); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1850:8: lv_op_2_2= 'xor'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_42_in_ruleOrExpr4027); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1865:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1866:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1866:1: (lv_right_3_0= ruleAndExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1867:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr4066);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1891:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1892:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1893:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr4104);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr4114); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1900:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:28: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1904:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1904:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1905:5: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr4161);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:1: ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred4_InternalJKind()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:3: ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1920:6: ( () ( (lv_op_2_0= 'and' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1920:7: () ( (lv_op_2_0= 'and' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1920:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1921:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1926:2: ( (lv_op_2_0= 'and' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1927:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1927:1: (lv_op_2_0= 'and' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1928:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,43,FOLLOW_43_in_ruleAndExpr4212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1941:4: ( (lv_right_3_0= ruleRelationalExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1942:1: (lv_right_3_0= ruleRelationalExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1942:1: (lv_right_3_0= ruleRelationalExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1943:3: lv_right_3_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr4248);
            	    lv_right_3_0=ruleRelationalExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"RelationalExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1967:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1968:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1969:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr4286);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr4296); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1976:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_PlusExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1979:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1980:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1980:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1981:5: this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr4343);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:1: ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA31_1 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2014:6: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2014:7: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2014:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2015:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2020:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2022:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2022:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    int alt30=6;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt30=1;
                        }
                        break;
                    case 45:
                        {
                        alt30=2;
                        }
                        break;
                    case 46:
                        {
                        alt30=3;
                        }
                        break;
                    case 47:
                        {
                        alt30=4;
                        }
                        break;
                    case 11:
                        {
                        alt30=5;
                        }
                        break;
                    case 48:
                        {
                        alt30=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2023:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)match(input,44,FOLLOW_44_in_ruleRelationalExpr4471); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2035:8: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,45,FOLLOW_45_in_ruleRelationalExpr4500); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2047:8: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,46,FOLLOW_46_in_ruleRelationalExpr4529); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2059:8: lv_op_2_4= '>='
                            {
                            lv_op_2_4=(Token)match(input,47,FOLLOW_47_in_ruleRelationalExpr4558); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2071:8: lv_op_2_5= '='
                            {
                            lv_op_2_5=(Token)match(input,11,FOLLOW_11_in_ruleRelationalExpr4587); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_0_1_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2083:8: lv_op_2_6= '<>'
                            {
                            lv_op_2_6=(Token)match(input,48,FOLLOW_48_in_ruleRelationalExpr4616); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2098:4: ( (lv_right_3_0= rulePlusExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2099:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2099:1: (lv_right_3_0= rulePlusExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2100:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr4655);
                    lv_right_3_0=rulePlusExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PlusExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRulePlusExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2124:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2125:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2126:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr4693);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr4703); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusExpr"


    // $ANTLR start "rulePlusExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2133:1: rulePlusExpr returns [EObject current=null] : (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2136:28: ( (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2137:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2137:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2138:5: this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr4750);
            this_TimesExpr_0=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TimesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==26) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2159:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2159:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2159:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2160:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2165:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2166:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2166:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2167:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2167:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==49) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==26) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,49,FOLLOW_49_in_rulePlusExpr4822); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2180:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_rulePlusExpr4851); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2195:4: ( (lv_right_3_0= ruleTimesExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2196:1: (lv_right_3_0= ruleTimesExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2196:1: (lv_right_3_0= ruleTimesExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2197:3: lv_right_3_0= ruleTimesExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr4890);
            	    lv_right_3_0=ruleTimesExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"TimesExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePlusExpr"


    // $ANTLR start "entryRuleTimesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2221:1: entryRuleTimesExpr returns [EObject current=null] : iv_ruleTimesExpr= ruleTimesExpr EOF ;
    public final EObject entryRuleTimesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2222:2: (iv_ruleTimesExpr= ruleTimesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2223:2: iv_ruleTimesExpr= ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4928);
            iv_ruleTimesExpr=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr4938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimesExpr"


    // $ANTLR start "ruleTimesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2230:1: ruleTimesExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleTimesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2233:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2234:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2234:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2235:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4985);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:1: ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:2: ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:2: ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:3: ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2262:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2262:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2262:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2268:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2269:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2269:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2270:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2270:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2271:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,50,FOLLOW_50_in_ruleTimesExpr5085); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2283:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleTimesExpr5114); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2295:8: lv_op_2_3= 'div'
            	            {
            	            lv_op_2_3=(Token)match(input,52,FOLLOW_52_in_ruleTimesExpr5143); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2307:8: lv_op_2_4= 'mod'
            	            {
            	            lv_op_2_4=(Token)match(input,53,FOLLOW_53_in_ruleTimesExpr5172); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getTimesExprAccess().getOpModKeyword_1_0_0_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2322:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2323:1: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2323:1: (lv_right_3_0= rulePrefixExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2324:3: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr5211);
            	    lv_right_3_0=rulePrefixExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimesExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PrefixExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTimesExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2348:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2349:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2350:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr5249);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr5259); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2357:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AccessExpr_3= ruleAccessExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_expr_2_0 = null;

        EObject this_AccessExpr_3 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2360:28: ( ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AccessExpr_3= ruleAccessExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AccessExpr_3= ruleAccessExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AccessExpr_3= ruleAccessExpr )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26||(LA37_0>=54 && LA37_0<=55)) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==19||LA37_0==23||LA37_0==29||LA37_0==58||(LA37_0>=61 && LA37_0<=64)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:3: () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2362:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2367:2: ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2368:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2368:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2369:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2369:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    int alt36=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt36=1;
                        }
                        break;
                    case 54:
                        {
                        alt36=2;
                        }
                        break;
                    case 55:
                        {
                        alt36=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2370:3: lv_op_1_1= '-'
                            {
                            lv_op_1_1=(Token)match(input,26,FOLLOW_26_in_rulePrefixExpr5314); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:8: lv_op_1_2= 'not'
                            {
                            lv_op_1_2=(Token)match(input,54,FOLLOW_54_in_rulePrefixExpr5343); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2394:8: lv_op_1_3= 'pre'
                            {
                            lv_op_1_3=(Token)match(input,55,FOLLOW_55_in_rulePrefixExpr5372); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_3, grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2409:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2410:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2410:1: (lv_expr_2_0= rulePrefixExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2411:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrefixExpr_in_rulePrefixExpr5409);
                    lv_expr_2_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"PrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2429:5: this_AccessExpr_3= ruleAccessExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getAccessExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAccessExpr_in_rulePrefixExpr5438);
                    this_AccessExpr_3=ruleAccessExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AccessExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleAccessExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2445:1: entryRuleAccessExpr returns [EObject current=null] : iv_ruleAccessExpr= ruleAccessExpr EOF ;
    public final EObject entryRuleAccessExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2446:2: (iv_ruleAccessExpr= ruleAccessExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2447:2: iv_ruleAccessExpr= ruleAccessExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessExprRule()); 
            }
            pushFollow(FOLLOW_ruleAccessExpr_in_entryRuleAccessExpr5473);
            iv_ruleAccessExpr=ruleAccessExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessExpr5483); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAccessExpr"


    // $ANTLR start "ruleAccessExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2454:1: ruleAccessExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* ) ;
    public final EObject ruleAccessExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_AtomicExpr_0 = null;

        EObject lv_value_8_0 = null;

        EObject lv_index_12_0 = null;

        EObject lv_value_15_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2457:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2458:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2458:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2459:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAccessExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_ruleAccessExpr5530);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:1: ( ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' ) | ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' ) )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (synpred9_InternalJKind()) ) {
                        alt39=2;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (synpred10_InternalJKind()) ) {
                        alt39=3;
                    }


                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:2: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:2: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:3: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:3: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:4: ( ( () '.' ) )=> ( () otherlv_2= '.' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2469:5: ( () otherlv_2= '.' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2469:6: () otherlv_2= '.'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2469:6: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2470:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleAccessExpr5566); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAccessExprAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2479:3: ( (otherlv_3= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2480:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2480:1: (otherlv_3= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2481:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessExpr5588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getAccessExprAccess().getFieldFieldCrossReference_1_0_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:6: ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:6: ( ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:7: ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) ) ( (lv_value_8_0= ruleExpr ) ) otherlv_9= '}'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:7: ( ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:8: ( ( () '{' ( ( RULE_ID ) ) ':=' ) )=> ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2501:5: ( () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':=' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2501:6: () otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) otherlv_7= ':='
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2501:6: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2502:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAccessExpr5646); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getAccessExprAccess().getLeftCurlyBracketKeyword_1_1_0_0_1());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2511:1: ( (otherlv_6= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2512:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2512:1: (otherlv_6= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2513:3: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessExpr5666); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_6, grammarAccess.getAccessExprAccess().getFieldFieldCrossReference_1_1_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleAccessExpr5678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getAccessExprAccess().getColonEqualsSignKeyword_1_1_0_0_3());
            	          
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2528:3: ( (lv_value_8_0= ruleExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2529:1: (lv_value_8_0= ruleExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2529:1: (lv_value_8_0= ruleExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2530:3: lv_value_8_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleAccessExpr5701);
            	    lv_value_8_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_8_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleAccessExpr5713); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getAccessExprAccess().getRightCurlyBracketKeyword_1_1_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:6: ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:6: ( ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:7: ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) ) ( (lv_index_12_0= ruleExpr ) ) ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )? otherlv_16= ']'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:7: ( ( ( () '[' ) )=> ( () otherlv_11= '[' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:8: ( ( () '[' ) )=> ( () otherlv_11= '[' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2553:5: ( () otherlv_11= '[' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2553:6: () otherlv_11= '['
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2553:6: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2554:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleAccessExpr5756); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getAccessExprAccess().getLeftSquareBracketKeyword_1_2_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2563:3: ( (lv_index_12_0= ruleExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2564:1: (lv_index_12_0= ruleExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2564:1: (lv_index_12_0= ruleExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2565:3: lv_index_12_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExprAccess().getIndexExprParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleAccessExpr5779);
            	    lv_index_12_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"index",
            	              		lv_index_12_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:2: ( ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==57) && (synpred11_InternalJKind())) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:3: ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) ) ( (lv_value_15_0= ruleExpr ) )
            	            {
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:3: ( ( ( () ':=' ) )=> ( () otherlv_14= ':=' ) )
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:4: ( ( () ':=' ) )=> ( () otherlv_14= ':=' )
            	            {
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2583:5: ( () otherlv_14= ':=' )
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2583:6: () otherlv_14= ':='
            	            {
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2583:6: ()
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2584:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAccessExprAccess().getArrayUpdateExprAccessAction_1_2_2_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,57,FOLLOW_57_in_ruleAccessExpr5815); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getAccessExprAccess().getColonEqualsSignKeyword_1_2_2_0_0_1());
            	                  
            	            }

            	            }


            	            }

            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2593:3: ( (lv_value_15_0= ruleExpr ) )
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2594:1: (lv_value_15_0= ruleExpr )
            	            {
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2594:1: (lv_value_15_0= ruleExpr )
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2595:3: lv_value_15_0= ruleExpr
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_2_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpr_in_ruleAccessExpr5838);
            	            lv_value_15_0=ruleExpr();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"value",
            	                      		lv_value_15_0, 
            	                      		"Expr");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleAccessExpr5852); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getAccessExprAccess().getRightSquareBracketKeyword_1_2_3());
            	          
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAccessExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2623:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2624:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2625:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr5891);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr5901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2632:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' ) | ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' ) | (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_val_3_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_op_16_1=null;
        Token lv_op_16_2=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        AntlrDatatypeRuleToken lv_val_7_0 = null;

        EObject lv_cond_10_0 = null;

        EObject lv_then_12_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_expr_18_0 = null;

        EObject this_NodeCallExpr_20 = null;

        EObject lv_clock_24_0 = null;

        EObject lv_call_26_0 = null;

        EObject lv_args_28_0 = null;

        EObject lv_exprs_32_0 = null;

        EObject lv_exprs_34_0 = null;

        EObject lv_exprs_41_0 = null;

        EObject lv_exprs_45_0 = null;

        EObject this_Expr_48 = null;

        EObject lv_exprs_51_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' ) | ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' ) | (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' ) | ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' ) | (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' ) | ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' ) | (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' ) )
            int alt46=11;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2637:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIdExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2642:2: ( (otherlv_1= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2643:1: (otherlv_1= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2643:1: (otherlv_1= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2644:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2656:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2656:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2656:7: () ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2656:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2657:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIntExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2662:2: ( (lv_val_3_0= RULE_INT ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2663:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2663:1: (lv_val_3_0= RULE_INT )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2664:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicExpr5990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_val_3_0, grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"val",
                              		lv_val_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2681:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2681:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2681:7: () ( (lv_val_5_0= ruleREAL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2681:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2682:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRealExprAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2687:2: ( (lv_val_5_0= ruleREAL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2688:1: (lv_val_5_0= ruleREAL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2688:1: (lv_val_5_0= ruleREAL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2689:3: lv_val_5_0= ruleREAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicExpr6033);
                    lv_val_5_0=ruleREAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_5_0, 
                              		"REAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2706:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2706:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2706:7: () ( (lv_val_7_0= ruleBOOL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2706:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2707:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2712:2: ( (lv_val_7_0= ruleBOOL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2713:1: (lv_val_7_0= ruleBOOL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2713:1: (lv_val_7_0= ruleBOOL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2714:3: lv_val_7_0= ruleBOOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValBOOLParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBOOL_in_ruleAtomicExpr6071);
                    lv_val_7_0=ruleBOOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_7_0, 
                              		"BOOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2731:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2731:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2731:7: () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2731:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2732:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleAtomicExpr6100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAtomicExprAccess().getIfKeyword_4_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2741:1: ( (lv_cond_10_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2742:1: (lv_cond_10_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2742:1: (lv_cond_10_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2743:3: lv_cond_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6121);
                    lv_cond_10_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_10_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleAtomicExpr6133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getThenKeyword_4_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2763:1: ( (lv_then_12_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2764:1: (lv_then_12_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2764:1: (lv_then_12_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2765:3: lv_then_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6154);
                    lv_then_12_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_12_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleAtomicExpr6166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicExprAccess().getElseKeyword_4_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2785:1: ( (lv_else_14_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2786:1: (lv_else_14_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2786:1: (lv_else_14_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2787:3: lv_else_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6187);
                    lv_else_14_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_14_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2804:6: ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2804:6: ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2804:7: () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2804:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2805:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getCastExprAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2810:2: ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2811:1: ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2811:1: ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2812:1: (lv_op_16_1= 'real' | lv_op_16_2= 'floor' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2812:1: (lv_op_16_1= 'real' | lv_op_16_2= 'floor' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==23) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==61) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2813:3: lv_op_16_1= 'real'
                            {
                            lv_op_16_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomicExpr6224); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_16_1, grammarAccess.getAtomicExprAccess().getOpRealKeyword_5_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_16_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2825:8: lv_op_16_2= 'floor'
                            {
                            lv_op_16_2=(Token)match(input,61,FOLLOW_61_in_ruleAtomicExpr6253); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_16_2, grammarAccess.getAtomicExprAccess().getOpFloorKeyword_5_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_16_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr6281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2844:1: ( (lv_expr_18_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2845:1: (lv_expr_18_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2845:1: (lv_expr_18_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2846:3: lv_expr_18_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6302);
                    lv_expr_18_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_18_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,30,FOLLOW_30_in_ruleAtomicExpr6314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2868:5: this_NodeCallExpr_20= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getNodeCallExprParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr6343);
                    this_NodeCallExpr_20=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeCallExpr_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2877:6: ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2877:6: ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2877:7: () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2877:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2878:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getCondactExprAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,62,FOLLOW_62_in_ruleAtomicExpr6370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getAtomicExprAccess().getCondactKeyword_7_1());
                          
                    }
                    otherlv_23=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr6382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2891:1: ( (lv_clock_24_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2892:1: (lv_clock_24_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2892:1: (lv_clock_24_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2893:3: lv_clock_24_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getClockExprParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6403);
                    lv_clock_24_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"clock",
                              		lv_clock_24_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleAtomicExpr6415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAtomicExprAccess().getCommaKeyword_7_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2913:1: ( (lv_call_26_0= ruleNodeCallExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2914:1: (lv_call_26_0= ruleNodeCallExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2914:1: (lv_call_26_0= ruleNodeCallExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2915:3: lv_call_26_0= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCallNodeCallExprParserRuleCall_7_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr6436);
                    lv_call_26_0=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"call",
                              		lv_call_26_0, 
                              		"NodeCallExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2931:2: (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2931:4: otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) )
                    	    {
                    	    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleAtomicExpr6449); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_27, grammarAccess.getAtomicExprAccess().getCommaKeyword_7_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2935:1: ( (lv_args_28_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2936:1: (lv_args_28_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2936:1: (lv_args_28_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2937:3: lv_args_28_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_7_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6470);
                    	    lv_args_28_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_28_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,30,FOLLOW_30_in_ruleAtomicExpr6484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_7());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2958:6: ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2958:6: ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2958:7: () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2958:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2959:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getArrayExprAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_19_in_ruleAtomicExpr6513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getLeftSquareBracketKeyword_8_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2968:1: ( (lv_exprs_32_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2969:1: (lv_exprs_32_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2969:1: (lv_exprs_32_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2970:3: lv_exprs_32_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6534);
                    lv_exprs_32_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_32_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2986:2: (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2986:4: otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) )
                    	    {
                    	    otherlv_33=(Token)match(input,18,FOLLOW_18_in_ruleAtomicExpr6547); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getCommaKeyword_8_3_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2990:1: ( (lv_exprs_34_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2991:1: (lv_exprs_34_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2991:1: (lv_exprs_34_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2992:3: lv_exprs_34_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_8_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6568);
                    	    lv_exprs_34_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_34_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,20,FOLLOW_20_in_ruleAtomicExpr6582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getAtomicExprAccess().getRightSquareBracketKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3013:6: ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3013:6: ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3013:7: () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3013:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3014:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRecordExprAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3019:2: ( (otherlv_37= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3020:1: (otherlv_37= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3020:1: (otherlv_37= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3021:3: otherlv_37= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_37=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr6619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_37, grammarAccess.getAtomicExprAccess().getTypeRecordTypeCrossReference_9_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,14,FOLLOW_14_in_ruleAtomicExpr6631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_9_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3036:1: ( (otherlv_39= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3037:1: (otherlv_39= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3037:1: (otherlv_39= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3038:3: otherlv_39= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_39=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr6651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_39, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_9_3_0()); 
                      	
                    }

                    }


                    }

                    otherlv_40=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr6663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_9_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3053:1: ( (lv_exprs_41_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3054:1: (lv_exprs_41_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3054:1: (lv_exprs_41_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3055:3: lv_exprs_41_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_9_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6684);
                    lv_exprs_41_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_41_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3071:2: (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==12) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3071:4: otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) )
                    	    {
                    	    otherlv_42=(Token)match(input,12,FOLLOW_12_in_ruleAtomicExpr6697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_42, grammarAccess.getAtomicExprAccess().getSemicolonKeyword_9_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3075:1: ( (otherlv_43= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3076:1: (otherlv_43= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3076:1: (otherlv_43= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3077:3: otherlv_43= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_43=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr6717); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_43, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_9_6_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    otherlv_44=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr6729); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_44, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_9_6_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3092:1: ( (lv_exprs_45_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3093:1: (lv_exprs_45_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3093:1: (lv_exprs_45_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3094:3: lv_exprs_45_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_9_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6750);
                    	    lv_exprs_45_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_45_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,16,FOLLOW_16_in_ruleAtomicExpr6764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_9_7());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3115:6: (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3115:6: (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3115:8: otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')'
                    {
                    otherlv_47=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr6784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_10_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_10_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6806);
                    this_Expr_48=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_48; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3128:1: ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==18) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3128:2: () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+
                            {
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3128:2: ()
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3129:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndAdd(
                                          grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0(),
                                          current);
                                  
                            }

                            }

                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3134:2: (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+
                            int cnt44=0;
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==18) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3134:4: otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) )
                            	    {
                            	    otherlv_50=(Token)match(input,18,FOLLOW_18_in_ruleAtomicExpr6828); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_50, grammarAccess.getAtomicExprAccess().getCommaKeyword_10_2_1_0());
                            	          
                            	    }
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3138:1: ( (lv_exprs_51_0= ruleExpr ) )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3139:1: (lv_exprs_51_0= ruleExpr )
                            	    {
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3139:1: (lv_exprs_51_0= ruleExpr )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3140:3: lv_exprs_51_0= ruleExpr
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_10_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr6849);
                            	    lv_exprs_51_0=ruleExpr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"exprs",
                            	              		lv_exprs_51_0, 
                            	              		"Expr");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt44 >= 1 ) break loop44;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(44, input);
                                        throw eee;
                                }
                                cnt44++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_52=(Token)match(input,30,FOLLOW_30_in_ruleAtomicExpr6865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_10_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleNodeCallExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3168:1: entryRuleNodeCallExpr returns [EObject current=null] : iv_ruleNodeCallExpr= ruleNodeCallExpr EOF ;
    public final EObject entryRuleNodeCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeCallExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3169:2: (iv_ruleNodeCallExpr= ruleNodeCallExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3170:2: iv_ruleNodeCallExpr= ruleNodeCallExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeCallExprRule()); 
            }
            pushFollow(FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr6902);
            iv_ruleNodeCallExpr=ruleNodeCallExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeCallExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeCallExpr6912); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeCallExpr"


    // $ANTLR start "ruleNodeCallExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3177:1: ruleNodeCallExpr returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleNodeCallExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3180:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3181:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3181:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3181:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3181:2: ( (otherlv_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3182:1: (otherlv_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3182:1: (otherlv_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3183:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeCallExprRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeCallExpr6957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodeCallExprAccess().getNodeNodeCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleNodeCallExpr6969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeCallExprAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3198:1: ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==19||LA48_0==23||LA48_0==26||LA48_0==29||(LA48_0>=54 && LA48_0<=55)||LA48_0==58||(LA48_0>=61 && LA48_0<=64)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3198:2: ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3198:2: ( (lv_args_2_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3199:1: (lv_args_2_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3199:1: (lv_args_2_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3200:3: lv_args_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr6991);
                    lv_args_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeCallExprRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3216:2: (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==18) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3216:4: otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleNodeCallExpr7004); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getNodeCallExprAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3220:1: ( (lv_args_4_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3221:1: (lv_args_4_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3221:1: (lv_args_4_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3222:3: lv_args_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr7025);
                    	    lv_args_4_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeCallExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_4_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleNodeCallExpr7041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeCallExprAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeCallExpr"


    // $ANTLR start "entryRuleREAL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3252:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3253:2: (iv_ruleREAL= ruleREAL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3254:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL7080);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL7091); if (state.failed) return current;

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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3261:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3264:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3265:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3265:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3265:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL7131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,56,FOLLOW_56_in_ruleREAL7149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL7164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleBOOL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3293:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3294:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3295:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL7210);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL7221); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3302:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3305:28: ( (kw= 'true' | kw= 'false' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3306:1: (kw= 'true' | kw= 'false' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3306:1: (kw= 'true' | kw= 'false' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            else if ( (LA49_0==64) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3307:2: kw= 'true'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleBOOL7259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:3314:2: kw= 'false'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleBOOL7278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBOOL"

    // $ANTLR start synpred1_InternalJKind
    public final void synpred1_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:3: ( ( () ( ( '->' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:4: ( () ( ( '->' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:4: ( () ( ( '->' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:5: () ( ( '->' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1664:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1665:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1665:2: ( ( '->' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1666:1: ( '->' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1666:1: ( '->' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1667:2: '->'
        {
        match(input,39,FOLLOW_39_in_synpred1_InternalJKind3582); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalJKind

    // $ANTLR start synpred2_InternalJKind
    public final void synpred2_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:3: ( ( () ( ( '=>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:4: ( () ( ( '=>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:4: ( () ( ( '=>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:5: () ( ( '=>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1740:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1741:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1741:2: ( ( '=>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1742:1: ( '=>' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1742:1: ( '=>' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1743:2: '=>'
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalJKind3764); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalJKind

    // $ANTLR start synpred3_InternalJKind
    public final void synpred3_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:5: () ( ( ( 'or' | 'xor' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1816:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1817:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1817:2: ( ( ( 'or' | 'xor' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1818:1: ( ( 'or' | 'xor' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1818:1: ( ( 'or' | 'xor' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1819:1: ( 'or' | 'xor' )
        {
        if ( (input.LA(1)>=41 && input.LA(1)<=42) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalJKind

    // $ANTLR start synpred4_InternalJKind
    public final void synpred4_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:3: ( ( () ( ( 'and' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:4: ( () ( ( 'and' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:4: ( () ( ( 'and' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:5: () ( ( 'and' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1913:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1914:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1914:2: ( ( 'and' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1915:1: ( 'and' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1915:1: ( 'and' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1916:2: 'and'
        {
        match(input,43,FOLLOW_43_in_synpred4_InternalJKind4181); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalJKind

    // $ANTLR start synpred5_InternalJKind
    public final void synpred5_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:5: () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1989:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1990:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1990:2: ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1991:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1991:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1992:1: ( '<' | '<=' | '>' | '>=' | '=' | '<>' )
        {
        if ( input.LA(1)==11||(input.LA(1)>=44 && input.LA(1)<=48) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalJKind

    // $ANTLR start synpred6_InternalJKind
    public final void synpred6_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2146:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2147:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2147:2: ( ( ( '+' | '-' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2148:1: ( ( '+' | '-' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2148:1: ( ( '+' | '-' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2149:1: ( '+' | '-' )
        {
        if ( input.LA(1)==26||input.LA(1)==49 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalJKind

    // $ANTLR start synpred7_InternalJKind
    public final void synpred7_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:3: ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:4: ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:4: ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:5: () ( ( ( '*' | '/' | 'div' | 'mod' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2244:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2244:2: ( ( ( '*' | '/' | 'div' | 'mod' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2245:1: ( ( '*' | '/' | 'div' | 'mod' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2245:1: ( ( '*' | '/' | 'div' | 'mod' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2246:1: ( '*' | '/' | 'div' | 'mod' )
        {
        if ( (input.LA(1)>=50 && input.LA(1)<=53) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalJKind

    // $ANTLR start synpred8_InternalJKind
    public final void synpred8_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:4: ( ( () '.' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:5: ( () '.' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:5: ( () '.' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:6: () '.'
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2467:6: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2468:1: 
        {
        }

        match(input,56,FOLLOW_56_in_synpred8_InternalJKind5547); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalJKind

    // $ANTLR start synpred9_InternalJKind
    public final void synpred9_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:8: ( ( () '{' ( ( RULE_ID ) ) ':=' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:9: ( () '{' ( ( RULE_ID ) ) ':=' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:9: ( () '{' ( ( RULE_ID ) ) ':=' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:10: () '{' ( ( RULE_ID ) ) ':='
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:10: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2494:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred9_InternalJKind5612); if (state.failed) return ;
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2495:1: ( ( RULE_ID ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2496:1: ( RULE_ID )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2496:1: ( RULE_ID )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2497:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred9_InternalJKind5620); if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred9_InternalJKind5627); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalJKind

    // $ANTLR start synpred10_InternalJKind
    public final void synpred10_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:8: ( ( () '[' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:9: ( () '[' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:9: ( () '[' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:10: () '['
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2551:10: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2552:1: 
        {
        }

        match(input,19,FOLLOW_19_in_synpred10_InternalJKind5737); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalJKind

    // $ANTLR start synpred11_InternalJKind
    public final void synpred11_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:4: ( ( () ':=' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:5: ( () ':=' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:5: ( () ':=' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:6: () ':='
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2581:6: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2582:1: 
        {
        }

        match(input,57,FOLLOW_57_in_synpred11_InternalJKind5796); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalJKind

    // Delegated rules

    public final boolean synpred7_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA46_eotS =
        "\21\uffff";
    static final String DFA46_eofS =
        "\1\uffff\1\12\1\15\16\uffff";
    static final String DFA46_minS =
        "\1\4\2\13\6\uffff\1\4\2\uffff\1\4\1\uffff\1\13\2\uffff";
    static final String DFA46_maxS =
        "\1\100\2\74\6\uffff\1\4\2\uffff\1\5\1\uffff\1\71\2\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\10\1\11\1\13\1\uffff\1\1\1\7\1\uffff\1\2"+
        "\1\uffff\1\3\1\12";
    static final String DFA46_specialS =
        "\21\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\1\2\15\uffff\1\7\3\uffff\1\5\5\uffff\1\10\34\uffff\1\4"+
            "\2\uffff\1\5\1\6\2\3",
            "\2\12\1\uffff\1\11\1\uffff\1\12\1\uffff\3\12\5\uffff\1\12"+
            "\2\uffff\1\13\1\12\10\uffff\17\12\2\uffff\2\12\1\uffff\2\12",
            "\2\15\1\uffff\1\15\1\uffff\1\15\1\uffff\3\15\5\uffff\1\15"+
            "\3\uffff\1\15\10\uffff\17\15\2\uffff\1\14\1\15\1\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "\1\15\1\17",
            "",
            "\1\20\55\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2636:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () otherlv_31= '[' ( (lv_exprs_32_0= ruleExpr ) ) (otherlv_33= ',' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= ']' ) | ( () ( (otherlv_37= RULE_ID ) ) otherlv_38= '{' ( (otherlv_39= RULE_ID ) ) otherlv_40= '=' ( (lv_exprs_41_0= ruleExpr ) ) (otherlv_42= ';' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ( (lv_exprs_45_0= ruleExpr ) ) )* otherlv_46= '}' ) | (otherlv_47= '(' this_Expr_48= ruleExpr ( () (otherlv_50= ',' ( (lv_exprs_51_0= ruleExpr ) ) )+ )? otherlv_52= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleFile131 = new BitSet(new long[]{0x0000000018000402L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFile158 = new BitSet(new long[]{0x0000000018000402L});
    public static final BitSet FOLLOW_ruleNode_in_ruleFile185 = new BitSet(new long[]{0x0000000018000402L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDef279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef296 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypeDef313 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDef375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypeDef409 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypeDef421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDef433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleField_in_ruleTypeDef454 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDef466 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef487 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleField_in_ruleTypeDef521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDef533 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDef554 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleTypeDef568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypeDef609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef626 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypeDef643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDef655 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDef667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleTypeDef688 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDef701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleTypeDef722 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleTypeDef736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumValue846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleArrayType1034 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleArrayType1055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayType1072 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayType1089 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_entryRuleAtomicType1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicType1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAtomicType1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAtomicType1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtomicType1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomicType1271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicType1283 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleAtomicType1304 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicType1316 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleAtomicType1337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtomicType1349 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicType1361 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAtomicType1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicType1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound1539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBound1589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBound1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConstant1698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1715 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleConstant1733 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstant1754 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleConstant1768 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConstant1789 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstant1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNode1884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1901 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNode1918 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1940 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_12_in_ruleNode1953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1974 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_30_in_ruleNode1990 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNode2002 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNode2014 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode2036 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_12_in_ruleNode2049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode2070 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_30_in_ruleNode2086 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode2098 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleNode2111 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode2133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode2145 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleNode2161 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNode2183 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleNode2210 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode2237 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_ruleMain_in_ruleNode2264 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_ruleRealizabilityInputs_in_ruleNode2291 = new BitSet(new long[]{0x0000007C20000010L});
    public static final BitSet FOLLOW_34_in_ruleNode2305 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleNode2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableGroup2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup2412 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableGroup2425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup2446 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariableGroup2460 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableGroup2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2664 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_18_in_ruleEquation2677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2697 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_11_in_ruleEquation2711 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2732 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEquation2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEquation2764 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2785 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_ruleEquation2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2818 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_ruleEquation2834 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEquation2846 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2867 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEquation2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProperty2963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2983 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMain3081 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleMain3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealizabilityInputs_in_entryRuleRealizabilityInputs3137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealizabilityInputs3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRealizabilityInputs3193 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRealizabilityInputs3214 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleRealizabilityInputs3227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRealizabilityInputs3247 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_ruleRealizabilityInputs3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion3299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAssertion3346 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssertion3367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssertion3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr3415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr3505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleArrowExpr3562 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleArrowExpr3613 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleArrowExpr3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr3687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleImpliesExpr3744 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleImpliesExpr3795 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3926 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleOrExpr3998 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_42_in_ruleOrExpr4027 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr4066 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr4161 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAndExpr4212 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr4248 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr4286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr4343 = new BitSet(new long[]{0x0001F00000000802L});
    public static final BitSet FOLLOW_44_in_ruleRelationalExpr4471 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_45_in_ruleRelationalExpr4500 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_46_in_ruleRelationalExpr4529 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_47_in_ruleRelationalExpr4558 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_11_in_ruleRelationalExpr4587 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_48_in_ruleRelationalExpr4616 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr4693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr4750 = new BitSet(new long[]{0x0002000004000002L});
    public static final BitSet FOLLOW_49_in_rulePlusExpr4822 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_26_in_rulePlusExpr4851 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr4890 = new BitSet(new long[]{0x0002000004000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4985 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTimesExpr5085 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_51_in_ruleTimesExpr5114 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_52_in_ruleTimesExpr5143 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_53_in_ruleTimesExpr5172 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr5211 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrefixExpr5314 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_54_in_rulePrefixExpr5343 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_rulePrefixExpr5372 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rulePrefixExpr5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessExpr_in_rulePrefixExpr5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessExpr_in_entryRuleAccessExpr5473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessExpr5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleAccessExpr5530 = new BitSet(new long[]{0x0100000000084002L});
    public static final BitSet FOLLOW_56_in_ruleAccessExpr5566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpr5588 = new BitSet(new long[]{0x0100000000084002L});
    public static final BitSet FOLLOW_14_in_ruleAccessExpr5646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpr5666 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleAccessExpr5678 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAccessExpr5701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAccessExpr5713 = new BitSet(new long[]{0x0100000000084002L});
    public static final BitSet FOLLOW_19_in_ruleAccessExpr5756 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAccessExpr5779 = new BitSet(new long[]{0x0200000000100000L});
    public static final BitSet FOLLOW_57_in_ruleAccessExpr5815 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAccessExpr5838 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAccessExpr5852 = new BitSet(new long[]{0x0100000000084002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr5891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicExpr5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicExpr6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleAtomicExpr6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAtomicExpr6100 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6121 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleAtomicExpr6133 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6154 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleAtomicExpr6166 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtomicExpr6224 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_61_in_ruleAtomicExpr6253 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr6281 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6302 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAtomicExpr6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAtomicExpr6370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr6382 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpr6415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr6436 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpr6449 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6470 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_ruleAtomicExpr6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAtomicExpr6513 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6534 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpr6547 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6568 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleAtomicExpr6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr6619 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpr6631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr6651 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr6663 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6684 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicExpr6697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr6717 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr6729 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6750 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleAtomicExpr6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr6784 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6806 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpr6828 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr6849 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_ruleAtomicExpr6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr6902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeCallExpr6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeCallExpr6957 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNodeCallExpr6969 = new BitSet(new long[]{0xE4C0000064880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr6991 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeCallExpr7004 = new BitSet(new long[]{0xE4C0000024880030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr7025 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_ruleNodeCallExpr7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL7080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL7131 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleREAL7149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL7210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBOOL7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBOOL7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred1_InternalJKind3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalJKind3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalJKind3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred4_InternalJKind4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalJKind4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalJKind4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalJKind5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred8_InternalJKind5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred9_InternalJKind5612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred9_InternalJKind5620 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred9_InternalJKind5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred10_InternalJKind5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred11_InternalJKind5796 = new BitSet(new long[]{0x0000000000000002L});

}