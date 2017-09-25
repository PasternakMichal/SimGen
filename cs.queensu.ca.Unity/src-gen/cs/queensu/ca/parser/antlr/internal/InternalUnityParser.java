package cs.queensu.ca.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cs.queensu.ca.services.UnityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUnityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MetaObject'", "':'", "'car'", "'rover'", "'generic'", "'others'", "'{'", "'}'", "'Action'", "'('", "')'", "'return'", "','", "'.'", "'property'", "'range'", "'bool'", "'int'", "'string'", "'real'", "'-'", "'Object'", "'override'", "'config'", "'='", "'Env'", "'Instance'", "'Channel'", "'direction'", "'type'", "'assign'", "'in'", "'out'", "'inout'", "'load'", "'map'", "'from'", "'qname'", "'area'", "'port'", "'TCP'", "'IPC'", "'or'", "'and'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'*'", "'/'", "'%'", "'!'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
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


        public InternalUnityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnity.g"; }



     	private UnityGrammarAccess grammarAccess;

        public InternalUnityParser(TokenStream input, UnityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected UnityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalUnity.g:64:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalUnity.g:64:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalUnity.g:65:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalUnity.g:71:1: ruleSpecification returns [EObject current=null] : ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )* ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_spec_0_1 = null;

        EObject lv_spec_0_2 = null;

        EObject lv_spec_0_3 = null;



        	enterRule();

        try {
            // InternalUnity.g:77:2: ( ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )* )
            // InternalUnity.g:78:2: ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )*
            {
            // InternalUnity.g:78:2: ( ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==33||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUnity.g:79:3: ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) )
            	    {
            	    // InternalUnity.g:79:3: ( (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV ) )
            	    // InternalUnity.g:80:4: (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV )
            	    {
            	    // InternalUnity.g:80:4: (lv_spec_0_1= ruleUnityObject | lv_spec_0_2= ruleMetaObject | lv_spec_0_3= ruleENV )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalUnity.g:81:5: lv_spec_0_1= ruleUnityObject
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecUnityObjectParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_1=ruleUnityObject();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_1,
            	              						"cs.queensu.ca.Unity.UnityObject");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:97:5: lv_spec_0_2= ruleMetaObject
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecMetaObjectParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_2=ruleMetaObject();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_2,
            	              						"cs.queensu.ca.Unity.MetaObject");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:113:5: lv_spec_0_3= ruleENV
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSpecificationAccess().getSpecENVParserRuleCall_0_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_spec_0_3=ruleENV();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	              					}
            	              					add(
            	              						current,
            	              						"spec",
            	              						lv_spec_0_3,
            	              						"cs.queensu.ca.Unity.ENV");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleMetaObject"
    // InternalUnity.g:134:1: entryRuleMetaObject returns [EObject current=null] : iv_ruleMetaObject= ruleMetaObject EOF ;
    public final EObject entryRuleMetaObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaObject = null;


        try {
            // InternalUnity.g:134:51: (iv_ruleMetaObject= ruleMetaObject EOF )
            // InternalUnity.g:135:2: iv_ruleMetaObject= ruleMetaObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaObject=ruleMetaObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaObject"


    // $ANTLR start "ruleMetaObject"
    // InternalUnity.g:141:1: ruleMetaObject returns [EObject current=null] : (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_3_1=null;
        Token lv_kind_3_2=null;
        Token lv_kind_3_3=null;
        Token lv_kind_3_4=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_properties_5_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:147:2: ( (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' ) )
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            {
            // InternalUnity.g:148:2: (otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}' )
            // InternalUnity.g:149:3: otherlv_0= 'MetaObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMetaObjectAccess().getMetaObjectKeyword_0());
              		
            }
            // InternalUnity.g:153:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:154:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:154:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:155:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMetaObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetaObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetaObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:175:3: ( ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) ) )
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) )
            {
            // InternalUnity.g:176:4: ( (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' ) )
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' )
            {
            // InternalUnity.g:177:5: (lv_kind_3_1= 'car' | lv_kind_3_2= 'rover' | lv_kind_3_3= 'generic' | lv_kind_3_4= 'others' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnity.g:178:6: lv_kind_3_1= 'car'
                    {
                    lv_kind_3_1=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_1, grammarAccess.getMetaObjectAccess().getKindCarKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:189:6: lv_kind_3_2= 'rover'
                    {
                    lv_kind_3_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_2, grammarAccess.getMetaObjectAccess().getKindRoverKeyword_3_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:200:6: lv_kind_3_3= 'generic'
                    {
                    lv_kind_3_3=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_3, grammarAccess.getMetaObjectAccess().getKindGenericKeyword_3_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:211:6: lv_kind_3_4= 'others'
                    {
                    lv_kind_3_4=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_kind_3_4, grammarAccess.getMetaObjectAccess().getKindOthersKeyword_3_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaObjectRule());
                      						}
                      						setWithLastConsumed(current, "kind", lv_kind_3_4, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMetaObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:228:3: ( ( (lv_properties_5_0= ruleAttribute ) ) | ( (lv_actions_6_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }
                else if ( (LA4_0==20) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUnity.g:229:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:229:4: ( (lv_properties_5_0= ruleAttribute ) )
            	    // InternalUnity.g:230:5: (lv_properties_5_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:230:5: (lv_properties_5_0= ruleAttribute )
            	    // InternalUnity.g:231:6: lv_properties_5_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMetaObjectAccess().getPropertiesAttributeParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_properties_5_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMetaObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_5_0,
            	      							"cs.queensu.ca.Unity.Attribute");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:249:4: ( (lv_actions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:249:4: ( (lv_actions_6_0= ruleAction ) )
            	    // InternalUnity.g:250:5: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:250:5: (lv_actions_6_0= ruleAction )
            	    // InternalUnity.g:251:6: lv_actions_6_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMetaObjectAccess().getActionsActionParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMetaObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actions",
            	      							lv_actions_6_0,
            	      							"cs.queensu.ca.Unity.Action");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMetaObjectAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleMetaObject"


    // $ANTLR start "entryRuleAction"
    // InternalUnity.g:277:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalUnity.g:277:47: (iv_ruleAction= ruleAction EOF )
            // InternalUnity.g:278:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalUnity.g:284:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_payload_3_0 = null;

        EObject lv_returnPayload_7_0 = null;

        EObject lv_expressions_10_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:290:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' ) )
            // InternalUnity.g:291:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' )
            {
            // InternalUnity.g:291:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}' )
            // InternalUnity.g:292:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_payload_3_0= rulePayload ) )? otherlv_4= ')' (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' ) otherlv_9= '{' ( (lv_expressions_10_0= ruleExpression ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
              		
            }
            // InternalUnity.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUnity.g:318:3: ( (lv_payload_3_0= rulePayload ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnity.g:319:4: (lv_payload_3_0= rulePayload )
                    {
                    // InternalUnity.g:319:4: (lv_payload_3_0= rulePayload )
                    // InternalUnity.g:320:5: lv_payload_3_0= rulePayload
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionAccess().getPayloadPayloadParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_payload_3_0=rulePayload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActionRule());
                      					}
                      					set(
                      						current,
                      						"payload",
                      						lv_payload_3_0,
                      						"cs.queensu.ca.Unity.Payload");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:341:3: (otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')' )
            // InternalUnity.g:342:4: otherlv_5= 'return' otherlv_6= '(' ( (lv_returnPayload_7_0= rulePayload ) )? otherlv_8= ')'
            {
            otherlv_5=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getReturnKeyword_5_0());
              			
            }
            otherlv_6=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getLeftParenthesisKeyword_5_1());
              			
            }
            // InternalUnity.g:350:4: ( (lv_returnPayload_7_0= rulePayload ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnity.g:351:5: (lv_returnPayload_7_0= rulePayload )
                    {
                    // InternalUnity.g:351:5: (lv_returnPayload_7_0= rulePayload )
                    // InternalUnity.g:352:6: lv_returnPayload_7_0= rulePayload
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActionAccess().getReturnPayloadPayloadParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_returnPayload_7_0=rulePayload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActionRule());
                      						}
                      						set(
                      							current,
                      							"returnPayload",
                      							lv_returnPayload_7_0,
                      							"cs.queensu.ca.Unity.Payload");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_5_3());
              			
            }

            }

            otherlv_9=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalUnity.g:378:3: ( (lv_expressions_10_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==21||LA7_0==32||LA7_0==66) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnity.g:379:4: (lv_expressions_10_0= ruleExpression )
            	    {
            	    // InternalUnity.g:379:4: (lv_expressions_10_0= ruleExpression )
            	    // InternalUnity.g:380:5: lv_expressions_10_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getActionAccess().getExpressionsExpressionParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_expressions_10_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getActionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_10_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePayload"
    // InternalUnity.g:405:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalUnity.g:405:48: (iv_rulePayload= rulePayload EOF )
            // InternalUnity.g:406:2: iv_rulePayload= rulePayload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPayloadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePayload=rulePayload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePayload; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalUnity.g:412:1: rulePayload returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:418:2: ( ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* ) )
            // InternalUnity.g:419:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            {
            // InternalUnity.g:419:2: ( ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )* )
            // InternalUnity.g:420:3: ( (lv_params_0_0= ruleParam ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            {
            // InternalUnity.g:420:3: ( (lv_params_0_0= ruleParam ) )
            // InternalUnity.g:421:4: (lv_params_0_0= ruleParam )
            {
            // InternalUnity.g:421:4: (lv_params_0_0= ruleParam )
            // InternalUnity.g:422:5: lv_params_0_0= ruleParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_params_0_0=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPayloadRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_0_0,
              						"cs.queensu.ca.Unity.Param");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:439:3: (otherlv_1= ',' ( (lv_params_2_0= ruleParam ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUnity.g:440:4: otherlv_1= ',' ( (lv_params_2_0= ruleParam ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPayloadAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalUnity.g:444:4: ( (lv_params_2_0= ruleParam ) )
            	    // InternalUnity.g:445:5: (lv_params_2_0= ruleParam )
            	    {
            	    // InternalUnity.g:445:5: (lv_params_2_0= ruleParam )
            	    // InternalUnity.g:446:6: lv_params_2_0= ruleParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPayloadAccess().getParamsParamParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_params_2_0=ruleParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPayloadRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_2_0,
            	      							"cs.queensu.ca.Unity.Param");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleParam"
    // InternalUnity.g:468:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalUnity.g:468:46: (iv_ruleParam= ruleParam EOF )
            // InternalUnity.g:469:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalUnity.g:475:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:481:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalUnity.g:482:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalUnity.g:482:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            // InternalUnity.g:483:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalUnity.g:483:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUnity.g:484:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUnity.g:484:4: (lv_name_0_0= RULE_ID )
            // InternalUnity.g:485:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:505:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalUnity.g:506:4: (lv_type_2_0= ruleVarType )
            {
            // InternalUnity.g:506:4: (lv_type_2_0= ruleVarType )
            // InternalUnity.g:507:5: lv_type_2_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamAccess().getTypeVarTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"cs.queensu.ca.Unity.VarType");
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDotExpression"
    // InternalUnity.g:528:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalUnity.g:528:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalUnity.g:529:2: iv_ruleDotExpression= ruleDotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotExpression=ruleDotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalUnity.g:535:1: ruleDotExpression returns [EObject current=null] : (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleRef_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:541:2: ( (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalUnity.g:542:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalUnity.g:542:2: (this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalUnity.g:543:3: this_SingleRef_0= ruleSingleRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDotExpressionAccess().getSingleRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_SingleRef_0=ruleSingleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SingleRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:551:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUnity.g:552:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalUnity.g:552:4: ()
            	    // InternalUnity.g:553:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDotExpressionAccess().getDotExpressionHeadAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:563:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUnity.g:564:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUnity.g:564:5: (otherlv_3= RULE_ID )
            	    // InternalUnity.g:565:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDotExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailPropertyCrossReference_1_2_0());
            	      					
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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleSingleRef"
    // InternalUnity.g:581:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // InternalUnity.g:581:50: (iv_ruleSingleRef= ruleSingleRef EOF )
            // InternalUnity.g:582:2: iv_ruleSingleRef= ruleSingleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleRef=ruleSingleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleRef"


    // $ANTLR start "ruleSingleRef"
    // InternalUnity.g:588:1: ruleSingleRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSingleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUnity.g:594:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUnity.g:595:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUnity.g:595:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalUnity.g:596:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalUnity.g:596:3: ()
            // InternalUnity.g:597:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSingleRefAccess().getSingleRefAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:603:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:604:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:604:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:605:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleRefRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSingleRefAccess().getSingleRefPropertyCrossReference_1_0());
              				
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
    // $ANTLR end "ruleSingleRef"


    // $ANTLR start "entryRuleProperty"
    // InternalUnity.g:620:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalUnity.g:620:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalUnity.g:621:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalUnity.g:627:1: ruleProperty returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Param_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:633:2: ( (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam ) )
            // InternalUnity.g:634:2: (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam )
            {
            // InternalUnity.g:634:2: (this_Attribute_0= ruleAttribute | this_Param_1= ruleParam )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUnity.g:635:3: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Attribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:644:3: this_Param_1= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyAccess().getParamParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Param_1=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Param_1;
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalUnity.g:656:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUnity.g:656:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUnity.g:657:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUnity.g:663:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_propertyType_3_0 = null;

        EObject lv_range_5_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:669:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? ) )
            // InternalUnity.g:670:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            {
            // InternalUnity.g:670:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )? )
            // InternalUnity.g:671:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_propertyType_3_0= ruleVarType ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPropertyKeyword_0());
              		
            }
            // InternalUnity.g:675:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:676:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:676:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:677:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:697:3: ( (lv_propertyType_3_0= ruleVarType ) )
            // InternalUnity.g:698:4: (lv_propertyType_3_0= ruleVarType )
            {
            // InternalUnity.g:698:4: (lv_propertyType_3_0= ruleVarType )
            // InternalUnity.g:699:5: lv_propertyType_3_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getPropertyTypeVarTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_propertyType_3_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"propertyType",
              						lv_propertyType_3_0,
              						"cs.queensu.ca.Unity.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUnity.g:716:3: (otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUnity.g:717:4: otherlv_4= 'range' ( (lv_range_5_0= ruleRange ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getRangeKeyword_4_0());
                      			
                    }
                    // InternalUnity.g:721:4: ( (lv_range_5_0= ruleRange ) )
                    // InternalUnity.g:722:5: (lv_range_5_0= ruleRange )
                    {
                    // InternalUnity.g:722:5: (lv_range_5_0= ruleRange )
                    // InternalUnity.g:723:6: lv_range_5_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getRangeRangeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_range_5_0=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_5_0,
                      							"cs.queensu.ca.Unity.Range");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleVarType"
    // InternalUnity.g:745:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalUnity.g:745:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalUnity.g:746:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalUnity.g:752:1: ruleVarType returns [EObject current=null] : ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalUnity.g:758:2: ( ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) ) )
            // InternalUnity.g:759:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            {
            // InternalUnity.g:759:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) ) )
            // InternalUnity.g:760:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            {
            // InternalUnity.g:760:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' ) )
            // InternalUnity.g:761:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            {
            // InternalUnity.g:761:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'int' | lv_name_0_3= 'string' | lv_name_0_4= 'real' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUnity.g:762:5: lv_name_0_1= 'bool'
                    {
                    lv_name_0_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getVarTypeAccess().getNameBoolKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:773:5: lv_name_0_2= 'int'
                    {
                    lv_name_0_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getVarTypeAccess().getNameIntKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:784:5: lv_name_0_3= 'string'
                    {
                    lv_name_0_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getVarTypeAccess().getNameStringKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:795:5: lv_name_0_4= 'real'
                    {
                    lv_name_0_4=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getVarTypeAccess().getNameRealKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_4, null);
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleRange"
    // InternalUnity.g:811:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalUnity.g:811:46: (iv_ruleRange= ruleRange EOF )
            // InternalUnity.g:812:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalUnity.g:818:1: ruleRange returns [EObject current=null] : (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:824:2: ( (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // InternalUnity.g:825:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // InternalUnity.g:825:2: (otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')' )
            // InternalUnity.g:826:3: otherlv_0= '(' ( (lv_from_1_0= ruleValue ) ) otherlv_2= '-' ( (lv_to_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUnity.g:830:3: ( (lv_from_1_0= ruleValue ) )
            // InternalUnity.g:831:4: (lv_from_1_0= ruleValue )
            {
            // InternalUnity.g:831:4: (lv_from_1_0= ruleValue )
            // InternalUnity.g:832:5: lv_from_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getFromValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_from_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_1_0,
              						"cs.queensu.ca.Unity.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalUnity.g:853:3: ( (lv_to_3_0= ruleValue ) )
            // InternalUnity.g:854:4: (lv_to_3_0= ruleValue )
            {
            // InternalUnity.g:854:4: (lv_to_3_0= ruleValue )
            // InternalUnity.g:855:5: lv_to_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeAccess().getToValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_to_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"cs.queensu.ca.Unity.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleValue"
    // InternalUnity.g:880:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalUnity.g:880:46: (iv_ruleValue= ruleValue EOF )
            // InternalUnity.g:881:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalUnity.g:887:1: ruleValue returns [EObject current=null] : ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_minues_0_0=null;
        Token lv_value_1_0=null;
        EObject lv_fixedPointValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:893:2: ( ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) ) )
            // InternalUnity.g:894:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            {
            // InternalUnity.g:894:2: ( ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_fixedPointValue_2_0= ruleRealLiteral ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==EOF||LA14_2==22||LA14_2==32) ) {
                    alt14=1;
                }
                else if ( (LA14_2==25) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUnity.g:895:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUnity.g:895:3: ( ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUnity.g:896:4: ( (lv_minues_0_0= '-' ) )? ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUnity.g:896:4: ( (lv_minues_0_0= '-' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==32) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUnity.g:897:5: (lv_minues_0_0= '-' )
                            {
                            // InternalUnity.g:897:5: (lv_minues_0_0= '-' )
                            // InternalUnity.g:898:6: lv_minues_0_0= '-'
                            {
                            lv_minues_0_0=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_minues_0_0, grammarAccess.getValueAccess().getMinuesHyphenMinusKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getValueRule());
                              						}
                              						setWithLastConsumed(current, "minues", true, "-");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalUnity.g:910:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUnity.g:911:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUnity.g:911:5: (lv_value_1_0= RULE_INT )
                    // InternalUnity.g:912:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnity.g:930:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    {
                    // InternalUnity.g:930:3: ( (lv_fixedPointValue_2_0= ruleRealLiteral ) )
                    // InternalUnity.g:931:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    {
                    // InternalUnity.g:931:4: (lv_fixedPointValue_2_0= ruleRealLiteral )
                    // InternalUnity.g:932:5: lv_fixedPointValue_2_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getFixedPointValueRealLiteralParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fixedPointValue_2_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"fixedPointValue",
                      						lv_fixedPointValue_2_0,
                      						"cs.queensu.ca.Unity.RealLiteral");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalUnity.g:953:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalUnity.g:953:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalUnity.g:954:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalUnity.g:960:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intPart_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:966:2: ( ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) ) )
            // InternalUnity.g:967:2: ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) )
            {
            // InternalUnity.g:967:2: ( ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) ) )
            // InternalUnity.g:968:3: ( (lv_intPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_INT ) )
            {
            // InternalUnity.g:968:3: ( (lv_intPart_0_0= RULE_INT ) )
            // InternalUnity.g:969:4: (lv_intPart_0_0= RULE_INT )
            {
            // InternalUnity.g:969:4: (lv_intPart_0_0= RULE_INT )
            // InternalUnity.g:970:5: lv_intPart_0_0= RULE_INT
            {
            lv_intPart_0_0=(Token)match(input,RULE_INT,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_intPart_0_0, grammarAccess.getRealLiteralAccess().getIntPartINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"intPart",
              						lv_intPart_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRealLiteralAccess().getFullStopKeyword_1());
              		
            }
            // InternalUnity.g:990:3: ( (lv_decimalPart_2_0= RULE_INT ) )
            // InternalUnity.g:991:4: (lv_decimalPart_2_0= RULE_INT )
            {
            // InternalUnity.g:991:4: (lv_decimalPart_2_0= RULE_INT )
            // InternalUnity.g:992:5: lv_decimalPart_2_0= RULE_INT
            {
            lv_decimalPart_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_decimalPart_2_0, grammarAccess.getRealLiteralAccess().getDecimalPartINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"decimalPart",
              						lv_decimalPart_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleUnityObject"
    // InternalUnity.g:1012:1: entryRuleUnityObject returns [EObject current=null] : iv_ruleUnityObject= ruleUnityObject EOF ;
    public final EObject entryRuleUnityObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnityObject = null;


        try {
            // InternalUnity.g:1012:52: (iv_ruleUnityObject= ruleUnityObject EOF )
            // InternalUnity.g:1013:2: iv_ruleUnityObject= ruleUnityObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnityObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnityObject=ruleUnityObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnityObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnityObject"


    // $ANTLR start "ruleUnityObject"
    // InternalUnity.g:1019:1: ruleUnityObject returns [EObject current=null] : (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleUnityObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_configurations_5_0 = null;

        EObject lv_newActions_6_0 = null;

        EObject lv_overrideActions_7_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1025:2: ( (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' ) )
            // InternalUnity.g:1026:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            {
            // InternalUnity.g:1026:2: (otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}' )
            // InternalUnity.g:1027:3: otherlv_0= 'Object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnityObjectAccess().getObjectKeyword_0());
              		
            }
            // InternalUnity.g:1031:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1032:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1032:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1033:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getUnityObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnityObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnityObjectAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1053:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1054:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1054:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1055:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnityObjectRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getUnityObjectAccess().getTypeMetaObjectCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getUnityObjectAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalUnity.g:1070:3: ( ( (lv_configurations_5_0= ruleConfigAssignment ) ) | ( (lv_newActions_6_0= ruleAction ) ) | ( (lv_overrideActions_7_0= ruleOverrideAction ) ) | ( (lv_properties_8_0= ruleAttribute ) ) )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt15=1;
                    }
                    break;
                case 20:
                    {
                    alt15=2;
                    }
                    break;
                case 34:
                    {
                    alt15=3;
                    }
                    break;
                case 26:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalUnity.g:1071:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    {
            	    // InternalUnity.g:1071:4: ( (lv_configurations_5_0= ruleConfigAssignment ) )
            	    // InternalUnity.g:1072:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    {
            	    // InternalUnity.g:1072:5: (lv_configurations_5_0= ruleConfigAssignment )
            	    // InternalUnity.g:1073:6: lv_configurations_5_0= ruleConfigAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getConfigurationsConfigAssignmentParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_configurations_5_0=ruleConfigAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"configurations",
            	      							lv_configurations_5_0,
            	      							"cs.queensu.ca.Unity.ConfigAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:1091:4: ( (lv_newActions_6_0= ruleAction ) )
            	    {
            	    // InternalUnity.g:1091:4: ( (lv_newActions_6_0= ruleAction ) )
            	    // InternalUnity.g:1092:5: (lv_newActions_6_0= ruleAction )
            	    {
            	    // InternalUnity.g:1092:5: (lv_newActions_6_0= ruleAction )
            	    // InternalUnity.g:1093:6: lv_newActions_6_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getNewActionsActionParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_newActions_6_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"newActions",
            	      							lv_newActions_6_0,
            	      							"cs.queensu.ca.Unity.Action");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnity.g:1111:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    {
            	    // InternalUnity.g:1111:4: ( (lv_overrideActions_7_0= ruleOverrideAction ) )
            	    // InternalUnity.g:1112:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    {
            	    // InternalUnity.g:1112:5: (lv_overrideActions_7_0= ruleOverrideAction )
            	    // InternalUnity.g:1113:6: lv_overrideActions_7_0= ruleOverrideAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getOverrideActionsOverrideActionParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_overrideActions_7_0=ruleOverrideAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"overrideActions",
            	      							lv_overrideActions_7_0,
            	      							"cs.queensu.ca.Unity.OverrideAction");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnity.g:1131:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    {
            	    // InternalUnity.g:1131:4: ( (lv_properties_8_0= ruleAttribute ) )
            	    // InternalUnity.g:1132:5: (lv_properties_8_0= ruleAttribute )
            	    {
            	    // InternalUnity.g:1132:5: (lv_properties_8_0= ruleAttribute )
            	    // InternalUnity.g:1133:6: lv_properties_8_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnityObjectAccess().getPropertiesAttributeParserRuleCall_5_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_properties_8_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnityObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_8_0,
            	      							"cs.queensu.ca.Unity.Attribute");
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

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getUnityObjectAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleUnityObject"


    // $ANTLR start "entryRuleOverrideAction"
    // InternalUnity.g:1159:1: entryRuleOverrideAction returns [EObject current=null] : iv_ruleOverrideAction= ruleOverrideAction EOF ;
    public final EObject entryRuleOverrideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideAction = null;


        try {
            // InternalUnity.g:1159:55: (iv_ruleOverrideAction= ruleOverrideAction EOF )
            // InternalUnity.g:1160:2: iv_ruleOverrideAction= ruleOverrideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverrideActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOverrideAction=ruleOverrideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverrideAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOverrideAction"


    // $ANTLR start "ruleOverrideAction"
    // InternalUnity.g:1166:1: ruleOverrideAction returns [EObject current=null] : (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) ;
    public final EObject ruleOverrideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1172:2: ( (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' ) )
            // InternalUnity.g:1173:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            {
            // InternalUnity.g:1173:2: (otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}' )
            // InternalUnity.g:1174:3: otherlv_0= 'override' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_expressions_3_0= ruleExpression ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOverrideActionAccess().getOverrideKeyword_0());
              		
            }
            // InternalUnity.g:1178:3: ( (otherlv_1= RULE_ID ) )
            // InternalUnity.g:1179:4: (otherlv_1= RULE_ID )
            {
            // InternalUnity.g:1179:4: (otherlv_1= RULE_ID )
            // InternalUnity.g:1180:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOverrideActionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getOverrideActionAccess().getActionNameActionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOverrideActionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1195:3: ( (lv_expressions_3_0= ruleExpression ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==21||LA16_0==32||LA16_0==66) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUnity.g:1196:4: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalUnity.g:1196:4: (lv_expressions_3_0= ruleExpression )
            	    // InternalUnity.g:1197:5: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOverrideActionAccess().getExpressionsExpressionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOverrideActionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_3_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOverrideActionAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleOverrideAction"


    // $ANTLR start "entryRuleConfigAssignment"
    // InternalUnity.g:1222:1: entryRuleConfigAssignment returns [EObject current=null] : iv_ruleConfigAssignment= ruleConfigAssignment EOF ;
    public final EObject entryRuleConfigAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigAssignment = null;


        try {
            // InternalUnity.g:1222:57: (iv_ruleConfigAssignment= ruleConfigAssignment EOF )
            // InternalUnity.g:1223:2: iv_ruleConfigAssignment= ruleConfigAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigAssignment=ruleConfigAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigAssignment"


    // $ANTLR start "ruleConfigAssignment"
    // InternalUnity.g:1229:1: ruleConfigAssignment returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) ;
    public final EObject ruleConfigAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_configs_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1235:2: ( (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' ) )
            // InternalUnity.g:1236:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            {
            // InternalUnity.g:1236:2: (otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}' )
            // InternalUnity.g:1237:3: otherlv_0= 'config' otherlv_1= '{' () ( (lv_configs_3_0= ruleConfig ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigAssignmentAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAssignmentAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:1245:3: ()
            // InternalUnity.g:1246:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigAssignmentAccess().getConfigAssignmentAction_2(),
              					current);
              			
            }

            }

            // InternalUnity.g:1252:3: ( (lv_configs_3_0= ruleConfig ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUnity.g:1253:4: (lv_configs_3_0= ruleConfig )
            	    {
            	    // InternalUnity.g:1253:4: (lv_configs_3_0= ruleConfig )
            	    // InternalUnity.g:1254:5: lv_configs_3_0= ruleConfig
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigAssignmentAccess().getConfigsConfigParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_configs_3_0=ruleConfig();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigAssignmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"configs",
            	      						lv_configs_3_0,
            	      						"cs.queensu.ca.Unity.Config");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConfigAssignmentAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleConfigAssignment"


    // $ANTLR start "entryRuleConfig"
    // InternalUnity.g:1279:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalUnity.g:1279:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalUnity.g:1280:2: iv_ruleConfig= ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfig; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalUnity.g:1286:1: ruleConfig returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1292:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) ) )
            // InternalUnity.g:1293:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            {
            // InternalUnity.g:1293:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) ) )
            // InternalUnity.g:1294:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyValue_2_0= ruleExpression ) )
            {
            // InternalUnity.g:1294:3: ( (otherlv_0= RULE_ID ) )
            // InternalUnity.g:1295:4: (otherlv_0= RULE_ID )
            {
            // InternalUnity.g:1295:4: (otherlv_0= RULE_ID )
            // InternalUnity.g:1296:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getPropertyNameAttributeCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalUnity.g:1311:3: ( (lv_propertyValue_2_0= ruleExpression ) )
            // InternalUnity.g:1312:4: (lv_propertyValue_2_0= ruleExpression )
            {
            // InternalUnity.g:1312:4: (lv_propertyValue_2_0= ruleExpression )
            // InternalUnity.g:1313:5: lv_propertyValue_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigAccess().getPropertyValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_propertyValue_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigRule());
              					}
              					set(
              						current,
              						"propertyValue",
              						lv_propertyValue_2_0,
              						"cs.queensu.ca.Unity.Expression");
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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleENV"
    // InternalUnity.g:1334:1: entryRuleENV returns [EObject current=null] : iv_ruleENV= ruleENV EOF ;
    public final EObject entryRuleENV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENV = null;


        try {
            // InternalUnity.g:1334:44: (iv_ruleENV= ruleENV EOF )
            // InternalUnity.g:1335:2: iv_ruleENV= ruleENV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENVRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENV=ruleENV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENV; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENV"


    // $ANTLR start "ruleENV"
    // InternalUnity.g:1341:1: ruleENV returns [EObject current=null] : (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' ) ;
    public final EObject ruleENV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_channels_3_0 = null;

        EObject lv_maps_4_0 = null;

        EObject lv_instances_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_initCodes_7_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1347:2: ( (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' ) )
            // InternalUnity.g:1348:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' )
            {
            // InternalUnity.g:1348:2: (otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}' )
            // InternalUnity.g:1349:3: otherlv_0= 'Env' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* ( (lv_initCodes_7_0= ruleInit ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getENVAccess().getEnvKeyword_0());
              		
            }
            // InternalUnity.g:1353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1354:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getENVAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getENVRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getENVAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUnity.g:1375:3: ( ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_maps_4_0= ruleMap ) ) | ( (lv_instances_5_0= ruleInstance ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt18=1;
                    }
                    break;
                case 46:
                    {
                    alt18=2;
                    }
                    break;
                case 38:
                    {
                    alt18=3;
                    }
                    break;
                case RULE_ID:
                case 26:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalUnity.g:1376:4: ( (lv_channels_3_0= ruleChannel ) )
            	    {
            	    // InternalUnity.g:1376:4: ( (lv_channels_3_0= ruleChannel ) )
            	    // InternalUnity.g:1377:5: (lv_channels_3_0= ruleChannel )
            	    {
            	    // InternalUnity.g:1377:5: (lv_channels_3_0= ruleChannel )
            	    // InternalUnity.g:1378:6: lv_channels_3_0= ruleChannel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getChannelsChannelParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_channels_3_0=ruleChannel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"channels",
            	      							lv_channels_3_0,
            	      							"cs.queensu.ca.Unity.Channel");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnity.g:1396:4: ( (lv_maps_4_0= ruleMap ) )
            	    {
            	    // InternalUnity.g:1396:4: ( (lv_maps_4_0= ruleMap ) )
            	    // InternalUnity.g:1397:5: (lv_maps_4_0= ruleMap )
            	    {
            	    // InternalUnity.g:1397:5: (lv_maps_4_0= ruleMap )
            	    // InternalUnity.g:1398:6: lv_maps_4_0= ruleMap
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getMapsMapParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_maps_4_0=ruleMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"maps",
            	      							lv_maps_4_0,
            	      							"cs.queensu.ca.Unity.Map");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnity.g:1416:4: ( (lv_instances_5_0= ruleInstance ) )
            	    {
            	    // InternalUnity.g:1416:4: ( (lv_instances_5_0= ruleInstance ) )
            	    // InternalUnity.g:1417:5: (lv_instances_5_0= ruleInstance )
            	    {
            	    // InternalUnity.g:1417:5: (lv_instances_5_0= ruleInstance )
            	    // InternalUnity.g:1418:6: lv_instances_5_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getInstancesInstanceParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_instances_5_0=ruleInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"instances",
            	      							lv_instances_5_0,
            	      							"cs.queensu.ca.Unity.Instance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnity.g:1436:4: ( (lv_properties_6_0= ruleProperty ) )
            	    {
            	    // InternalUnity.g:1436:4: ( (lv_properties_6_0= ruleProperty ) )
            	    // InternalUnity.g:1437:5: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalUnity.g:1437:5: (lv_properties_6_0= ruleProperty )
            	    // InternalUnity.g:1438:6: lv_properties_6_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getENVAccess().getPropertiesPropertyParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getENVRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_6_0,
            	      							"cs.queensu.ca.Unity.Property");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalUnity.g:1456:3: ( (lv_initCodes_7_0= ruleInit ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUnity.g:1457:4: (lv_initCodes_7_0= ruleInit )
                    {
                    // InternalUnity.g:1457:4: (lv_initCodes_7_0= ruleInit )
                    // InternalUnity.g:1458:5: lv_initCodes_7_0= ruleInit
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getENVAccess().getInitCodesInitParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_initCodes_7_0=ruleInit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getENVRule());
                      					}
                      					set(
                      						current,
                      						"initCodes",
                      						lv_initCodes_7_0,
                      						"cs.queensu.ca.Unity.Init");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getENVAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleENV"


    // $ANTLR start "entryRuleInstance"
    // InternalUnity.g:1483:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalUnity.g:1483:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalUnity.g:1484:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalUnity.g:1490:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUnity.g:1496:2: ( (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUnity.g:1497:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalUnity.g:1497:2: (otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalUnity.g:1498:3: otherlv_0= 'Instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
              		
            }
            // InternalUnity.g:1502:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1503:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1503:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1504:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
              		
            }
            // InternalUnity.g:1524:3: ( (otherlv_3= RULE_ID ) )
            // InternalUnity.g:1525:4: (otherlv_3= RULE_ID )
            {
            // InternalUnity.g:1525:4: (otherlv_3= RULE_ID )
            // InternalUnity.g:1526:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getInstanceTypeUnityObjectCrossReference_3_0());
              				
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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleChannel"
    // InternalUnity.g:1541:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalUnity.g:1541:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalUnity.g:1542:2: iv_ruleChannel= ruleChannel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalUnity.g:1548:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_direction_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_port_7_0 = null;

        EObject lv_areaname_8_0 = null;

        EObject lv_qname_10_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1554:2: ( (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? ) )
            // InternalUnity.g:1555:2: (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? )
            {
            // InternalUnity.g:1555:2: (otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )? )
            // InternalUnity.g:1556:3: otherlv_0= 'Channel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )? otherlv_6= '(' ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) ) otherlv_11= ')' (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
              		
            }
            // InternalUnity.g:1560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnity.g:1561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnity.g:1561:4: (lv_name_1_0= RULE_ID )
            // InternalUnity.g:1562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChannelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUnity.g:1578:3: (otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUnity.g:1579:4: otherlv_2= 'direction' ( (lv_direction_3_0= ruleDirection ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getDirectionKeyword_2_0());
                      			
                    }
                    // InternalUnity.g:1583:4: ( (lv_direction_3_0= ruleDirection ) )
                    // InternalUnity.g:1584:5: (lv_direction_3_0= ruleDirection )
                    {
                    // InternalUnity.g:1584:5: (lv_direction_3_0= ruleDirection )
                    // InternalUnity.g:1585:6: lv_direction_3_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getDirectionDirectionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_direction_3_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"direction",
                      							lv_direction_3_0,
                      							"cs.queensu.ca.Unity.Direction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUnity.g:1603:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUnity.g:1604:4: otherlv_4= 'type' ( (lv_type_5_0= ruleinterfaceType ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getChannelAccess().getTypeKeyword_3_0());
                      			
                    }
                    // InternalUnity.g:1608:4: ( (lv_type_5_0= ruleinterfaceType ) )
                    // InternalUnity.g:1609:5: (lv_type_5_0= ruleinterfaceType )
                    {
                    // InternalUnity.g:1609:5: (lv_type_5_0= ruleinterfaceType )
                    // InternalUnity.g:1610:6: lv_type_5_0= ruleinterfaceType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getTypeInterfaceTypeParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_type_5_0=ruleinterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_5_0,
                      							"cs.queensu.ca.Unity.interfaceType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUnity.g:1632:3: ( ( (lv_port_7_0= rulePort ) ) | ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            else if ( (LA22_0==50) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUnity.g:1633:4: ( (lv_port_7_0= rulePort ) )
                    {
                    // InternalUnity.g:1633:4: ( (lv_port_7_0= rulePort ) )
                    // InternalUnity.g:1634:5: (lv_port_7_0= rulePort )
                    {
                    // InternalUnity.g:1634:5: (lv_port_7_0= rulePort )
                    // InternalUnity.g:1635:6: lv_port_7_0= rulePort
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getPortPortParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_port_7_0=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"port",
                      							lv_port_7_0,
                      							"cs.queensu.ca.Unity.Port");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnity.g:1653:4: ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) )
                    {
                    // InternalUnity.g:1653:4: ( ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) ) )
                    // InternalUnity.g:1654:5: ( (lv_areaname_8_0= ruleAreaName ) ) otherlv_9= ',' ( (lv_qname_10_0= ruleQName ) )
                    {
                    // InternalUnity.g:1654:5: ( (lv_areaname_8_0= ruleAreaName ) )
                    // InternalUnity.g:1655:6: (lv_areaname_8_0= ruleAreaName )
                    {
                    // InternalUnity.g:1655:6: (lv_areaname_8_0= ruleAreaName )
                    // InternalUnity.g:1656:7: lv_areaname_8_0= ruleAreaName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getAreanameAreaNameParserRuleCall_5_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_areaname_8_0=ruleAreaName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"areaname",
                      								lv_areaname_8_0,
                      								"cs.queensu.ca.Unity.AreaName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getCommaKeyword_5_1_1());
                      				
                    }
                    // InternalUnity.g:1677:5: ( (lv_qname_10_0= ruleQName ) )
                    // InternalUnity.g:1678:6: (lv_qname_10_0= ruleQName )
                    {
                    // InternalUnity.g:1678:6: (lv_qname_10_0= ruleQName )
                    // InternalUnity.g:1679:7: lv_qname_10_0= ruleQName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getChannelAccess().getQnameQNameParserRuleCall_5_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_qname_10_0=ruleQName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getChannelRule());
                      							}
                      							set(
                      								current,
                      								"qname",
                      								lv_qname_10_0,
                      								"cs.queensu.ca.Unity.QName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getChannelAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalUnity.g:1702:3: (otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUnity.g:1703:4: otherlv_12= 'assign' ( (otherlv_13= RULE_ID ) )+
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getChannelAccess().getAssignKeyword_7_0());
                      			
                    }
                    // InternalUnity.g:1707:4: ( (otherlv_13= RULE_ID ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==EOF||LA23_2==RULE_ID||LA23_2==19||LA23_2==26||LA23_2==35||(LA23_2>=38 && LA23_2<=39)||LA23_2==46) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalUnity.g:1708:5: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalUnity.g:1708:5: (otherlv_13= RULE_ID )
                    	    // InternalUnity.g:1709:6: otherlv_13= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getChannelRule());
                    	      						}
                    	      					
                    	    }
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_13, grammarAccess.getChannelAccess().getBoundInstancesInstanceCrossReference_7_1_0());
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleDirection"
    // InternalUnity.g:1725:1: entryRuleDirection returns [String current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final String entryRuleDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirection = null;


        try {
            // InternalUnity.g:1725:49: (iv_ruleDirection= ruleDirection EOF )
            // InternalUnity.g:1726:2: iv_ruleDirection= ruleDirection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalUnity.g:1732:1: ruleDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | kw= 'inout' ) ;
    public final AntlrDatatypeRuleToken ruleDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnity.g:1738:2: ( (kw= 'in' | kw= 'out' | kw= 'inout' ) )
            // InternalUnity.g:1739:2: (kw= 'in' | kw= 'out' | kw= 'inout' )
            {
            // InternalUnity.g:1739:2: (kw= 'in' | kw= 'out' | kw= 'inout' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 45:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalUnity.g:1740:3: kw= 'in'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:1746:3: kw= 'out'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:1752:3: kw= 'inout'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDirectionAccess().getInoutKeyword_2());
                      		
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleInit"
    // InternalUnity.g:1761:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalUnity.g:1761:45: (iv_ruleInit= ruleInit EOF )
            // InternalUnity.g:1762:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalUnity.g:1768:1: ruleInit returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1774:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // InternalUnity.g:1775:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // InternalUnity.g:1775:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // InternalUnity.g:1776:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getConfigKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUnity.g:1784:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==21||LA26_0==32||LA26_0==66) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUnity.g:1785:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalUnity.g:1785:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalUnity.g:1786:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_2_0,
            	      						"cs.queensu.ca.Unity.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInitAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleMap"
    // InternalUnity.g:1811:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalUnity.g:1811:44: (iv_ruleMap= ruleMap EOF )
            // InternalUnity.g:1812:2: iv_ruleMap= ruleMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalUnity.g:1818:1: ruleMap returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_mapName_2_0=null;
        Token otherlv_3=null;
        EObject lv_pathName_4_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:1824:2: ( (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) ) )
            // InternalUnity.g:1825:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            {
            // InternalUnity.g:1825:2: (otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) ) )
            // InternalUnity.g:1826:3: otherlv_0= 'load' otherlv_1= 'map' ( (lv_mapName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (lv_pathName_4_0= ruleStLiteral ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getLoadKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
              		
            }
            // InternalUnity.g:1834:3: ( (lv_mapName_2_0= RULE_ID ) )
            // InternalUnity.g:1835:4: (lv_mapName_2_0= RULE_ID )
            {
            // InternalUnity.g:1835:4: (lv_mapName_2_0= RULE_ID )
            // InternalUnity.g:1836:5: lv_mapName_2_0= RULE_ID
            {
            lv_mapName_2_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_mapName_2_0, grammarAccess.getMapAccess().getMapNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"mapName",
              						lv_mapName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMapAccess().getFromKeyword_3());
              		
            }
            // InternalUnity.g:1856:3: ( (lv_pathName_4_0= ruleStLiteral ) )
            // InternalUnity.g:1857:4: (lv_pathName_4_0= ruleStLiteral )
            {
            // InternalUnity.g:1857:4: (lv_pathName_4_0= ruleStLiteral )
            // InternalUnity.g:1858:5: lv_pathName_4_0= ruleStLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapAccess().getPathNameStLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pathName_4_0=ruleStLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapRule());
              					}
              					set(
              						current,
              						"pathName",
              						lv_pathName_4_0,
              						"cs.queensu.ca.Unity.StLiteral");
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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleQName"
    // InternalUnity.g:1879:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // InternalUnity.g:1879:46: (iv_ruleQName= ruleQName EOF )
            // InternalUnity.g:1880:2: iv_ruleQName= ruleQName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQName=ruleQName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalUnity.g:1886:1: ruleQName returns [EObject current=null] : (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1892:2: ( (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:1893:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:1893:2: (otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:1894:3: otherlv_0= 'qname' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQNameAccess().getQnameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1902:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:1903:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:1903:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:1904:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQNameRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAreaName"
    // InternalUnity.g:1924:1: entryRuleAreaName returns [EObject current=null] : iv_ruleAreaName= ruleAreaName EOF ;
    public final EObject entryRuleAreaName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaName = null;


        try {
            // InternalUnity.g:1924:49: (iv_ruleAreaName= ruleAreaName EOF )
            // InternalUnity.g:1925:2: iv_ruleAreaName= ruleAreaName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAreaNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAreaName=ruleAreaName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAreaName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAreaName"


    // $ANTLR start "ruleAreaName"
    // InternalUnity.g:1931:1: ruleAreaName returns [EObject current=null] : (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAreaName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1937:2: ( (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUnity.g:1938:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUnity.g:1938:2: (otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUnity.g:1939:3: otherlv_0= 'area' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaNameAccess().getAreaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAreaNameAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1947:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUnity.g:1948:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUnity.g:1948:4: (lv_name_2_0= RULE_ID )
            // InternalUnity.g:1949:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAreaNameAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAreaNameRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleAreaName"


    // $ANTLR start "entryRulePort"
    // InternalUnity.g:1969:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalUnity.g:1969:45: (iv_rulePort= rulePort EOF )
            // InternalUnity.g:1970:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalUnity.g:1976:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_portnumber_2_0=null;


        	enterRule();

        try {
            // InternalUnity.g:1982:2: ( (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) ) )
            // InternalUnity.g:1983:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) )
            {
            // InternalUnity.g:1983:2: (otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) ) )
            // InternalUnity.g:1984:3: otherlv_0= 'port' otherlv_1= ':' ( (lv_portnumber_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getColonKeyword_1());
              		
            }
            // InternalUnity.g:1992:3: ( (lv_portnumber_2_0= RULE_INT ) )
            // InternalUnity.g:1993:4: (lv_portnumber_2_0= RULE_INT )
            {
            // InternalUnity.g:1993:4: (lv_portnumber_2_0= RULE_INT )
            // InternalUnity.g:1994:5: lv_portnumber_2_0= RULE_INT
            {
            lv_portnumber_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_portnumber_2_0, grammarAccess.getPortAccess().getPortnumberINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"portnumber",
              						lv_portnumber_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleinterfaceType"
    // InternalUnity.g:2014:1: entryRuleinterfaceType returns [EObject current=null] : iv_ruleinterfaceType= ruleinterfaceType EOF ;
    public final EObject entryRuleinterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterfaceType = null;


        try {
            // InternalUnity.g:2014:54: (iv_ruleinterfaceType= ruleinterfaceType EOF )
            // InternalUnity.g:2015:2: iv_ruleinterfaceType= ruleinterfaceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinterfaceType=ruleinterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterfaceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinterfaceType"


    // $ANTLR start "ruleinterfaceType"
    // InternalUnity.g:2021:1: ruleinterfaceType returns [EObject current=null] : ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) ;
    public final EObject ruleinterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalUnity.g:2027:2: ( ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) ) )
            // InternalUnity.g:2028:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            {
            // InternalUnity.g:2028:2: ( ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) ) )
            // InternalUnity.g:2029:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            {
            // InternalUnity.g:2029:3: ( (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' ) )
            // InternalUnity.g:2030:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            {
            // InternalUnity.g:2030:4: (lv_name_0_1= 'TCP' | lv_name_0_2= 'IPC' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==53) ) {
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
                    // InternalUnity.g:2031:5: lv_name_0_1= 'TCP'
                    {
                    lv_name_0_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getInterfaceTypeAccess().getNameTCPKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2042:5: lv_name_0_2= 'IPC'
                    {
                    lv_name_0_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getInterfaceTypeAccess().getNameIPCKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceTypeRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleinterfaceType"


    // $ANTLR start "entryRuleExpression"
    // InternalUnity.g:2058:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUnity.g:2058:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUnity.g:2059:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUnity.g:2065:1: ruleExpression returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2071:2: (this_Assign_0= ruleAssign )
            // InternalUnity.g:2072:2: this_Assign_0= ruleAssign
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Assign_0=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Assign_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssign"
    // InternalUnity.g:2083:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalUnity.g:2083:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalUnity.g:2084:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalUnity.g:2090:1: ruleAssign returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2096:2: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalUnity.g:2097:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalUnity.g:2097:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalUnity.g:2098:3: this_OrExpression_0= ruleOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2106:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUnity.g:2107:4: () otherlv_2= '=' ( (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalUnity.g:2107:4: ()
            	    // InternalUnity.g:2108:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAssignAccess().getAssignLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2118:4: ( (lv_right_3_0= ruleOrExpression ) )
            	    // InternalUnity.g:2119:5: (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalUnity.g:2119:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalUnity.g:2120:6: lv_right_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAssignRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.OrExpression");
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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleOrExpression"
    // InternalUnity.g:2142:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalUnity.g:2142:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalUnity.g:2143:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalUnity.g:2149:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2155:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalUnity.g:2156:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalUnity.g:2156:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalUnity.g:2157:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2165:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUnity.g:2166:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalUnity.g:2166:4: ()
            	    // InternalUnity.g:2167:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2177:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalUnity.g:2178:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalUnity.g:2178:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalUnity.g:2179:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.AndExpression");
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalUnity.g:2201:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalUnity.g:2201:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalUnity.g:2202:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalUnity.g:2208:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2214:2: ( (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* ) )
            // InternalUnity.g:2215:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            {
            // InternalUnity.g:2215:2: (this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )* )
            // InternalUnity.g:2216:3: this_ComparisonOperators_0= ruleComparisonOperators ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonOperatorsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonOperators_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2224:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUnity.g:2225:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleComparisonOperators ) )
            	    {
            	    // InternalUnity.g:2225:4: ()
            	    // InternalUnity.g:2226:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalUnity.g:2236:4: ( (lv_right_3_0= ruleComparisonOperators ) )
            	    // InternalUnity.g:2237:5: (lv_right_3_0= ruleComparisonOperators )
            	    {
            	    // InternalUnity.g:2237:5: (lv_right_3_0= ruleComparisonOperators )
            	    // InternalUnity.g:2238:6: lv_right_3_0= ruleComparisonOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonOperatorsParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleComparisonOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"cs.queensu.ca.Unity.ComparisonOperators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonOperators"
    // InternalUnity.g:2260:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // InternalUnity.g:2260:60: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // InternalUnity.g:2261:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperators; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonOperators"


    // $ANTLR start "ruleComparisonOperators"
    // InternalUnity.g:2267:1: ruleComparisonOperators returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) ;
    public final EObject ruleComparisonOperators() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Addition_0 = null;

        EObject lv_rest_13_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2273:2: ( (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* ) )
            // InternalUnity.g:2274:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            {
            // InternalUnity.g:2274:2: (this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )* )
            // InternalUnity.g:2275:3: this_Addition_0= ruleAddition ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2283:3: ( ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==56) && (synpred1_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==57) && (synpred1_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==58) && (synpred1_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==59) && (synpred1_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==60) && (synpred1_InternalUnity())) {
                    alt32=1;
                }
                else if ( (LA32_0==61) && (synpred1_InternalUnity())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUnity.g:2284:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) ) ( (lv_rest_13_0= ruleAddition ) )
            	    {
            	    // InternalUnity.g:2284:4: ( ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) ) )
            	    // InternalUnity.g:2285:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )=> ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    {
            	    // InternalUnity.g:2323:5: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '==' ) | ( () otherlv_12= '!=' ) )
            	    int alt31=6;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt31=4;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt31=5;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt31=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalUnity.g:2324:6: ( () otherlv_2= '>' )
            	            {
            	            // InternalUnity.g:2324:6: ( () otherlv_2= '>' )
            	            // InternalUnity.g:2325:7: () otherlv_2= '>'
            	            {
            	            // InternalUnity.g:2325:7: ()
            	            // InternalUnity.g:2326:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGTLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,56,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2338:6: ( () otherlv_4= '<' )
            	            {
            	            // InternalUnity.g:2338:6: ( () otherlv_4= '<' )
            	            // InternalUnity.g:2339:7: () otherlv_4= '<'
            	            {
            	            // InternalUnity.g:2339:7: ()
            	            // InternalUnity.g:2340:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLTLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,57,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2352:6: ( () otherlv_6= '>=' )
            	            {
            	            // InternalUnity.g:2352:6: ( () otherlv_6= '>=' )
            	            // InternalUnity.g:2353:7: () otherlv_6= '>='
            	            {
            	            // InternalUnity.g:2353:7: ()
            	            // InternalUnity.g:2354:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getGELeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,58,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalUnity.g:2366:6: ( () otherlv_8= '<=' )
            	            {
            	            // InternalUnity.g:2366:6: ( () otherlv_8= '<=' )
            	            // InternalUnity.g:2367:7: () otherlv_8= '<='
            	            {
            	            // InternalUnity.g:2367:7: ()
            	            // InternalUnity.g:2368:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getLELeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,59,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalUnity.g:2380:6: ( () otherlv_10= '==' )
            	            {
            	            // InternalUnity.g:2380:6: ( () otherlv_10= '==' )
            	            // InternalUnity.g:2381:7: () otherlv_10= '=='
            	            {
            	            // InternalUnity.g:2381:7: ()
            	            // InternalUnity.g:2382:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getEQLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,60,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getComparisonOperatorsAccess().getEqualsSignEqualsSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalUnity.g:2394:6: ( () otherlv_12= '!=' )
            	            {
            	            // InternalUnity.g:2394:6: ( () otherlv_12= '!=' )
            	            // InternalUnity.g:2395:7: () otherlv_12= '!='
            	            {
            	            // InternalUnity.g:2395:7: ()
            	            // InternalUnity.g:2396:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getComparisonOperatorsAccess().getNELeftAction_1_0_0_5_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_12=(Token)match(input,61,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_12, grammarAccess.getComparisonOperatorsAccess().getExclamationMarkEqualsSignKeyword_1_0_0_5_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2409:4: ( (lv_rest_13_0= ruleAddition ) )
            	    // InternalUnity.g:2410:5: (lv_rest_13_0= ruleAddition )
            	    {
            	    // InternalUnity.g:2410:5: (lv_rest_13_0= ruleAddition )
            	    // InternalUnity.g:2411:6: lv_rest_13_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRestAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_rest_13_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rest",
            	      							lv_rest_13_0,
            	      							"cs.queensu.ca.Unity.Addition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleComparisonOperators"


    // $ANTLR start "entryRuleAddition"
    // InternalUnity.g:2433:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalUnity.g:2433:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalUnity.g:2434:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalUnity.g:2440:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2446:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalUnity.g:2447:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalUnity.g:2447:2: (this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalUnity.g:2448:3: this_Multiplication_0= ruleMultiplication ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2456:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalUnity.g:2457:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalUnity.g:2457:4: ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) )
            	    // InternalUnity.g:2458:5: ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    {
            	    // InternalUnity.g:2472:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==62) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==32) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalUnity.g:2473:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalUnity.g:2473:6: ( () otherlv_2= '+' )
            	            // InternalUnity.g:2474:7: () otherlv_2= '+'
            	            {
            	            // InternalUnity.g:2474:7: ()
            	            // InternalUnity.g:2475:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,62,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2487:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalUnity.g:2487:6: ( () otherlv_4= '-' )
            	            // InternalUnity.g:2488:7: () otherlv_4= '-'
            	            {
            	            // InternalUnity.g:2488:7: ()
            	            // InternalUnity.g:2489:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2502:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalUnity.g:2503:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalUnity.g:2503:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalUnity.g:2504:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"cs.queensu.ca.Unity.Multiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalUnity.g:2526:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalUnity.g:2526:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalUnity.g:2527:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalUnity.g:2533:1: ruleMultiplication returns [EObject current=null] : (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Unary_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2539:2: ( (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* ) )
            // InternalUnity.g:2540:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            {
            // InternalUnity.g:2540:2: (this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )* )
            // InternalUnity.g:2541:3: this_Unary_0= ruleUnary ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_Unary_0=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Unary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUnity.g:2549:3: ( ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==63) && (synpred3_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==64) && (synpred3_InternalUnity())) {
                    alt36=1;
                }
                else if ( (LA36_0==65) && (synpred3_InternalUnity())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUnity.g:2550:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ) ( (lv_right_7_0= ruleUnary ) )
            	    {
            	    // InternalUnity.g:2550:4: ( ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) )
            	    // InternalUnity.g:2551:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )=> ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    {
            	    // InternalUnity.g:2571:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case 63:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // InternalUnity.g:2572:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalUnity.g:2572:6: ( () otherlv_2= '*' )
            	            // InternalUnity.g:2573:7: () otherlv_2= '*'
            	            {
            	            // InternalUnity.g:2573:7: ()
            	            // InternalUnity.g:2574:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,63,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnity.g:2586:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalUnity.g:2586:6: ( () otherlv_4= '/' )
            	            // InternalUnity.g:2587:7: () otherlv_4= '/'
            	            {
            	            // InternalUnity.g:2587:7: ()
            	            // InternalUnity.g:2588:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getDivideLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,64,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUnity.g:2600:6: ( () otherlv_6= '%' )
            	            {
            	            // InternalUnity.g:2600:6: ( () otherlv_6= '%' )
            	            // InternalUnity.g:2601:7: () otherlv_6= '%'
            	            {
            	            // InternalUnity.g:2601:7: ()
            	            // InternalUnity.g:2602:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultiplicationAccess().getModuloLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,65,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // InternalUnity.g:2615:4: ( (lv_right_7_0= ruleUnary ) )
            	    // InternalUnity.g:2616:5: (lv_right_7_0= ruleUnary )
            	    {
            	    // InternalUnity.g:2616:5: (lv_right_7_0= ruleUnary )
            	    // InternalUnity.g:2617:6: lv_right_7_0= ruleUnary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_right_7_0=ruleUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_7_0,
            	      							"cs.queensu.ca.Unity.Unary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnary"
    // InternalUnity.g:2639:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // InternalUnity.g:2639:46: (iv_ruleUnary= ruleUnary EOF )
            // InternalUnity.g:2640:2: iv_ruleUnary= ruleUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnary=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // InternalUnity.g:2646:1: ruleUnary returns [EObject current=null] : (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpressionNotPlusMinus_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2652:2: ( (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) ) )
            // InternalUnity.g:2653:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            {
            // InternalUnity.g:2653:2: (this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus | ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)||LA37_0==21||LA37_0==66) ) {
                alt37=1;
            }
            else if ( (LA37_0==32) ) {
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
                    // InternalUnity.g:2654:3: this_UnaryExpressionNotPlusMinus_0= ruleUnaryExpressionNotPlusMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryAccess().getUnaryExpressionNotPlusMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpressionNotPlusMinus_0=ruleUnaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpressionNotPlusMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2663:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    {
                    // InternalUnity.g:2663:3: ( () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) ) )
                    // InternalUnity.g:2664:4: () otherlv_2= '-' ( (lv_exp_3_0= ruleUnary ) )
                    {
                    // InternalUnity.g:2664:4: ()
                    // InternalUnity.g:2665:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryAccess().getUnaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalUnity.g:2675:4: ( (lv_exp_3_0= ruleUnary ) )
                    // InternalUnity.g:2676:5: (lv_exp_3_0= ruleUnary )
                    {
                    // InternalUnity.g:2676:5: (lv_exp_3_0= ruleUnary )
                    // InternalUnity.g:2677:6: lv_exp_3_0= ruleUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryAccess().getExpUnaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=ruleUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_3_0,
                      							"cs.queensu.ca.Unity.Unary");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleUnaryExpressionNotPlusMinus"
    // InternalUnity.g:2699:1: entryRuleUnaryExpressionNotPlusMinus returns [EObject current=null] : iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF ;
    public final EObject entryRuleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpressionNotPlusMinus = null;


        try {
            // InternalUnity.g:2699:68: (iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF )
            // InternalUnity.g:2700:2: iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpressionNotPlusMinus=ruleUnaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpressionNotPlusMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpressionNotPlusMinus"


    // $ANTLR start "ruleUnaryExpressionNotPlusMinus"
    // InternalUnity.g:2706:1: ruleUnaryExpressionNotPlusMinus returns [EObject current=null] : (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject this_NotBooleanExpression_0 = null;

        EObject this_PrimaryExpression_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:2712:2: ( (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression ) )
            // InternalUnity.g:2713:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            {
            // InternalUnity.g:2713:2: (this_NotBooleanExpression_0= ruleNotBooleanExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==66) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||LA38_0==21) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalUnity.g:2714:3: this_NotBooleanExpression_0= ruleNotBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getNotBooleanExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotBooleanExpression_0=ruleNotBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotBooleanExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2723:3: this_PrimaryExpression_1= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_1=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_1;
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
    // $ANTLR end "ruleUnaryExpressionNotPlusMinus"


    // $ANTLR start "entryRuleNotBooleanExpression"
    // InternalUnity.g:2735:1: entryRuleNotBooleanExpression returns [EObject current=null] : iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF ;
    public final EObject entryRuleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotBooleanExpression = null;


        try {
            // InternalUnity.g:2735:61: (iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF )
            // InternalUnity.g:2736:2: iv_ruleNotBooleanExpression= ruleNotBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotBooleanExpression=ruleNotBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotBooleanExpression"


    // $ANTLR start "ruleNotBooleanExpression"
    // InternalUnity.g:2742:1: ruleNotBooleanExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) ;
    public final EObject ruleNotBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:2748:2: ( (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) ) )
            // InternalUnity.g:2749:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            {
            // InternalUnity.g:2749:2: (otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) ) )
            // InternalUnity.g:2750:3: otherlv_0= '!' ( (lv_exp_1_0= ruleUnary ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotBooleanExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalUnity.g:2754:3: ( (lv_exp_1_0= ruleUnary ) )
            // InternalUnity.g:2755:4: (lv_exp_1_0= ruleUnary )
            {
            // InternalUnity.g:2755:4: (lv_exp_1_0= ruleUnary )
            // InternalUnity.g:2756:5: lv_exp_1_0= ruleUnary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotBooleanExpressionAccess().getExpUnaryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotBooleanExpressionRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_1_0,
              						"cs.queensu.ca.Unity.Unary");
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
    // $ANTLR end "ruleNotBooleanExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalUnity.g:2777:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalUnity.g:2777:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalUnity.g:2778:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalUnity.g:2784:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralOrIdentifier_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalUnity.g:2790:2: ( (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalUnity.g:2791:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalUnity.g:2791:2: (this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)) ) {
                alt39=1;
            }
            else if ( (LA39_0==21) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalUnity.g:2792:3: this_LiteralOrIdentifier_0= ruleLiteralOrIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralOrIdentifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralOrIdentifier_0=ruleLiteralOrIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralOrIdentifier_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2801:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalUnity.g:2801:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalUnity.g:2802:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteralOrIdentifier"
    // InternalUnity.g:2823:1: entryRuleLiteralOrIdentifier returns [EObject current=null] : iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF ;
    public final EObject entryRuleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrIdentifier = null;


        try {
            // InternalUnity.g:2823:60: (iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF )
            // InternalUnity.g:2824:2: iv_ruleLiteralOrIdentifier= ruleLiteralOrIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOrIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralOrIdentifier=ruleLiteralOrIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOrIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralOrIdentifier"


    // $ANTLR start "ruleLiteralOrIdentifier"
    // InternalUnity.g:2830:1: ruleLiteralOrIdentifier returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleLiteralOrIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalUnity.g:2836:2: ( (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier ) )
            // InternalUnity.g:2837:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            {
            // InternalUnity.g:2837:2: (this_Literal_0= ruleLiteral | this_Identifier_1= ruleIdentifier )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
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
                    // InternalUnity.g:2838:3: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralOrIdentifierAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2847:3: this_Identifier_1= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralOrIdentifierAccess().getIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Identifier_1;
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
    // $ANTLR end "ruleLiteralOrIdentifier"


    // $ANTLR start "entryRuleLiteral"
    // InternalUnity.g:2859:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalUnity.g:2859:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalUnity.g:2860:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalUnity.g:2866:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_StLiteral_2 = null;

        EObject this_RealLiteral_3 = null;



        	enterRule();

        try {
            // InternalUnity.g:2872:2: ( (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral ) )
            // InternalUnity.g:2873:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            {
            // InternalUnity.g:2873:2: (this_IntLiteral_0= ruleIntLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_StLiteral_2= ruleStLiteral | this_RealLiteral_3= ruleRealLiteral )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||(LA41_1>=RULE_ID && LA41_1<=RULE_STRING)||LA41_1==19||(LA41_1>=21 && LA41_1<=22)||LA41_1==32||LA41_1==36||(LA41_1>=54 && LA41_1<=66)) ) {
                    alt41=1;
                }
                else if ( (LA41_1==25) ) {
                    alt41=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                alt41=2;
                }
                break;
            case RULE_STRING:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalUnity.g:2874:3: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUnity.g:2883:3: this_BoolLiteral_1= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUnity.g:2892:3: this_StLiteral_2= ruleStLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StLiteral_2=ruleStLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUnity.g:2901:3: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_3=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealLiteral_3;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalUnity.g:2913:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalUnity.g:2913:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalUnity.g:2914:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalUnity.g:2920:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2926:2: ( ( () ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalUnity.g:2927:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalUnity.g:2927:2: ( () ( (lv_int_1_0= RULE_INT ) ) )
            // InternalUnity.g:2928:3: () ( (lv_int_1_0= RULE_INT ) )
            {
            // InternalUnity.g:2928:3: ()
            // InternalUnity.g:2929:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:2935:3: ( (lv_int_1_0= RULE_INT ) )
            // InternalUnity.g:2936:4: (lv_int_1_0= RULE_INT )
            {
            // InternalUnity.g:2936:4: (lv_int_1_0= RULE_INT )
            // InternalUnity.g:2937:5: lv_int_1_0= RULE_INT
            {
            lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_int_1_0, grammarAccess.getIntLiteralAccess().getIntINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"int",
              						lv_int_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalUnity.g:2957:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalUnity.g:2957:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalUnity.g:2958:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalUnity.g:2964:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:2970:2: ( ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) ) )
            // InternalUnity.g:2971:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalUnity.g:2971:2: ( () ( (lv_bool_1_0= RULE_BOOLEAN ) ) )
            // InternalUnity.g:2972:3: () ( (lv_bool_1_0= RULE_BOOLEAN ) )
            {
            // InternalUnity.g:2972:3: ()
            // InternalUnity.g:2973:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:2979:3: ( (lv_bool_1_0= RULE_BOOLEAN ) )
            // InternalUnity.g:2980:4: (lv_bool_1_0= RULE_BOOLEAN )
            {
            // InternalUnity.g:2980:4: (lv_bool_1_0= RULE_BOOLEAN )
            // InternalUnity.g:2981:5: lv_bool_1_0= RULE_BOOLEAN
            {
            lv_bool_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_bool_1_0, grammarAccess.getBoolLiteralAccess().getBoolBOOLEANTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBoolLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"bool",
              						lv_bool_1_0,
              						"cs.queensu.ca.Unity.BOOLEAN");
              				
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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStLiteral"
    // InternalUnity.g:3001:1: entryRuleStLiteral returns [EObject current=null] : iv_ruleStLiteral= ruleStLiteral EOF ;
    public final EObject entryRuleStLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStLiteral = null;


        try {
            // InternalUnity.g:3001:50: (iv_ruleStLiteral= ruleStLiteral EOF )
            // InternalUnity.g:3002:2: iv_ruleStLiteral= ruleStLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStLiteral=ruleStLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStLiteral"


    // $ANTLR start "ruleStLiteral"
    // InternalUnity.g:3008:1: ruleStLiteral returns [EObject current=null] : ( () ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalUnity.g:3014:2: ( ( () ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalUnity.g:3015:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalUnity.g:3015:2: ( () ( (lv_string_1_0= RULE_STRING ) ) )
            // InternalUnity.g:3016:3: () ( (lv_string_1_0= RULE_STRING ) )
            {
            // InternalUnity.g:3016:3: ()
            // InternalUnity.g:3017:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStLiteralAccess().getStLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalUnity.g:3023:3: ( (lv_string_1_0= RULE_STRING ) )
            // InternalUnity.g:3024:4: (lv_string_1_0= RULE_STRING )
            {
            // InternalUnity.g:3024:4: (lv_string_1_0= RULE_STRING )
            // InternalUnity.g:3025:5: lv_string_1_0= RULE_STRING
            {
            lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_string_1_0, grammarAccess.getStLiteralAccess().getStringSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"string",
              						lv_string_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
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
    // $ANTLR end "ruleStLiteral"


    // $ANTLR start "entryRuleIdentifier"
    // InternalUnity.g:3045:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalUnity.g:3045:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalUnity.g:3046:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalUnity.g:3052:1: ruleIdentifier returns [EObject current=null] : ( (lv_Refrence_0_0= ruleDotExpression ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject lv_Refrence_0_0 = null;



        	enterRule();

        try {
            // InternalUnity.g:3058:2: ( ( (lv_Refrence_0_0= ruleDotExpression ) ) )
            // InternalUnity.g:3059:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            {
            // InternalUnity.g:3059:2: ( (lv_Refrence_0_0= ruleDotExpression ) )
            // InternalUnity.g:3060:3: (lv_Refrence_0_0= ruleDotExpression )
            {
            // InternalUnity.g:3060:3: (lv_Refrence_0_0= ruleDotExpression )
            // InternalUnity.g:3061:4: lv_Refrence_0_0= ruleDotExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIdentifierAccess().getRefrenceDotExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_Refrence_0_0=ruleDotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIdentifierRule());
              				}
              				set(
              					current,
              					"Refrence",
              					lv_Refrence_0_0,
              					"cs.queensu.ca.Unity.DotExpression");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleIdentifier"

    // $ANTLR start synpred1_InternalUnity
    public final void synpred1_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2285:5: ( ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) ) )
        // InternalUnity.g:2285:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        {
        // InternalUnity.g:2285:6: ( ( () '>' ) | ( () '<' ) | ( () '>=' ) | ( () '<=' ) | ( () '==' ) | ( () '!=' ) )
        int alt42=6;
        switch ( input.LA(1) ) {
        case 56:
            {
            alt42=1;
            }
            break;
        case 57:
            {
            alt42=2;
            }
            break;
        case 58:
            {
            alt42=3;
            }
            break;
        case 59:
            {
            alt42=4;
            }
            break;
        case 60:
            {
            alt42=5;
            }
            break;
        case 61:
            {
            alt42=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 42, 0, input);

            throw nvae;
        }

        switch (alt42) {
            case 1 :
                // InternalUnity.g:2286:6: ( () '>' )
                {
                // InternalUnity.g:2286:6: ( () '>' )
                // InternalUnity.g:2287:7: () '>'
                {
                // InternalUnity.g:2287:7: ()
                // InternalUnity.g:2288:7: 
                {
                }

                match(input,56,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2292:6: ( () '<' )
                {
                // InternalUnity.g:2292:6: ( () '<' )
                // InternalUnity.g:2293:7: () '<'
                {
                // InternalUnity.g:2293:7: ()
                // InternalUnity.g:2294:7: 
                {
                }

                match(input,57,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2298:6: ( () '>=' )
                {
                // InternalUnity.g:2298:6: ( () '>=' )
                // InternalUnity.g:2299:7: () '>='
                {
                // InternalUnity.g:2299:7: ()
                // InternalUnity.g:2300:7: 
                {
                }

                match(input,58,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalUnity.g:2304:6: ( () '<=' )
                {
                // InternalUnity.g:2304:6: ( () '<=' )
                // InternalUnity.g:2305:7: () '<='
                {
                // InternalUnity.g:2305:7: ()
                // InternalUnity.g:2306:7: 
                {
                }

                match(input,59,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalUnity.g:2310:6: ( () '==' )
                {
                // InternalUnity.g:2310:6: ( () '==' )
                // InternalUnity.g:2311:7: () '=='
                {
                // InternalUnity.g:2311:7: ()
                // InternalUnity.g:2312:7: 
                {
                }

                match(input,60,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 6 :
                // InternalUnity.g:2316:6: ( () '!=' )
                {
                // InternalUnity.g:2316:6: ( () '!=' )
                // InternalUnity.g:2317:7: () '!='
                {
                // InternalUnity.g:2317:7: ()
                // InternalUnity.g:2318:7: 
                {
                }

                match(input,61,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalUnity

    // $ANTLR start synpred2_InternalUnity
    public final void synpred2_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2458:5: ( ( ( () '+' ) | ( () '-' ) ) )
        // InternalUnity.g:2458:6: ( ( () '+' ) | ( () '-' ) )
        {
        // InternalUnity.g:2458:6: ( ( () '+' ) | ( () '-' ) )
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==62) ) {
            alt43=1;
        }
        else if ( (LA43_0==32) ) {
            alt43=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 43, 0, input);

            throw nvae;
        }
        switch (alt43) {
            case 1 :
                // InternalUnity.g:2459:6: ( () '+' )
                {
                // InternalUnity.g:2459:6: ( () '+' )
                // InternalUnity.g:2460:7: () '+'
                {
                // InternalUnity.g:2460:7: ()
                // InternalUnity.g:2461:7: 
                {
                }

                match(input,62,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2465:6: ( () '-' )
                {
                // InternalUnity.g:2465:6: ( () '-' )
                // InternalUnity.g:2466:7: () '-'
                {
                // InternalUnity.g:2466:7: ()
                // InternalUnity.g:2467:7: 
                {
                }

                match(input,32,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred2_InternalUnity

    // $ANTLR start synpred3_InternalUnity
    public final void synpred3_InternalUnity_fragment() throws RecognitionException {   
        // InternalUnity.g:2551:5: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) )
        // InternalUnity.g:2551:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        {
        // InternalUnity.g:2551:6: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
        int alt44=3;
        switch ( input.LA(1) ) {
        case 63:
            {
            alt44=1;
            }
            break;
        case 64:
            {
            alt44=2;
            }
            break;
        case 65:
            {
            alt44=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 44, 0, input);

            throw nvae;
        }

        switch (alt44) {
            case 1 :
                // InternalUnity.g:2552:6: ( () '*' )
                {
                // InternalUnity.g:2552:6: ( () '*' )
                // InternalUnity.g:2553:7: () '*'
                {
                // InternalUnity.g:2553:7: ()
                // InternalUnity.g:2554:7: 
                {
                }

                match(input,63,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalUnity.g:2558:6: ( () '/' )
                {
                // InternalUnity.g:2558:6: ( () '/' )
                // InternalUnity.g:2559:7: () '/'
                {
                // InternalUnity.g:2559:7: ()
                // InternalUnity.g:2560:7: 
                {
                }

                match(input,64,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalUnity.g:2564:6: ( () '%' )
                {
                // InternalUnity.g:2564:6: ( () '%' )
                // InternalUnity.g:2565:7: () '%'
                {
                // InternalUnity.g:2565:7: ()
                // InternalUnity.g:2566:7: 
                {
                }

                match(input,65,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_InternalUnity

    // Delegated rules

    public final boolean synpred2_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalUnity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalUnity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\4\20\uffff\1\0\3\uffff";
    static final String dfa_4s = "\1\102\20\uffff\1\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_6s = "\1\0\20\uffff\1\1\3\uffff}>";
    static final String[] dfa_7s = {
            "\4\1\13\uffff\1\1\1\uffff\2\1\11\uffff\1\21\3\uffff\1\1\21\uffff\10\1\1\24\3\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2456:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) )=> ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==EOF||(LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==19||(LA34_0>=21 && LA34_0<=22)||LA34_0==36||(LA34_0>=54 && LA34_0<=61)||LA34_0==66) ) {s = 1;}

                        else if ( (LA34_0==32) ) {s = 17;}

                        else if ( (LA34_0==62) && (synpred2_InternalUnity())) {s = 20;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalUnity()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002200001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001002800F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001000000E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C04180000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001002000F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000040C804080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x3F00000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000100000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});

}