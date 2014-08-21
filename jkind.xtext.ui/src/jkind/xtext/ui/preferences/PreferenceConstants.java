package jkind.xtext.ui.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {
	public static final String PREF_INDUCT_CEX = "inductiveCounterexamples";

	public static final String PREF_SMOOTH_CEX = "smoothCounterexamples";

	public static final String PREF_DEPTH = "inductionDepth";

	public static final String PREF_TIMEOUT = "timeout";

	public static final String PREF_SOLVER = "solver";

	public static final String SOLVER_YICES = "Yices";
	public static final String SOLVER_Z3 = "Z3";
	public static final String SOLVER_CVC4 = "CVC4";
	public static final String SOLVER_YICES2 = "Yices 2";

	public static final String PREF_MODEL_CHECKER = "modelChecker";
	
	public static final String MODEL_CHECKER_JKIND = "JKind";
	public static final String MODEL_CHECKER_KIND2 = "Kind 2";
	public static final String MODEL_CHECKER_KIND2WEB = "Kind 2 Remote";

	public static final String PREF_REMOTE_URL = "remoteUrl";
}