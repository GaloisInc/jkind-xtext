/*
* generated by Xtext
*/
package jkind.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import jkind.xtext.services.JKindGrammarAccess;

public class JKindParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JKindGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
	}
	
	@Override
	protected jkind.xtext.parser.antlr.internal.InternalJKindParser createParser(XtextTokenStream stream) {
		return new jkind.xtext.parser.antlr.internal.InternalJKindParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "File";
	}
	
	public JKindGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JKindGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
