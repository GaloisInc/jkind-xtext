package jkind.xtext.ui.preferences;

import jkind.SolverOption;
import jkind.api.JKindApi;
import jkind.api.Kind2Api;
import jkind.api.Kind2WebApi;
import jkind.api.KindApi;
import jkind.xtext.ui.internal.JKindActivator;

import org.eclipse.jface.preference.IPreferenceStore;

public class PreferencesUtil {
	public static KindApi getKindApi() {
		IPreferenceStore prefs = getPreferenceStore();
		String modelChecker = prefs.getString(PreferenceConstants.PREF_MODEL_CHECKER);
		String remoteUrl = prefs.getString(PreferenceConstants.PREF_REMOTE_URL);
		return getKindApi(modelChecker, remoteUrl);
	}

	private static IPreferenceStore getPreferenceStore() {
		return JKindActivator.getInstance().getPreferenceStore();
	}

	public static KindApi getKindApi(String modelChecker, String remoteUrl) {
		switch (modelChecker) {
		case PreferenceConstants.MODEL_CHECKER_JKIND:
			return getJKindApi();
		case PreferenceConstants.MODEL_CHECKER_KIND2:
			return getKind2Api();
		case PreferenceConstants.MODEL_CHECKER_KIND2WEB:
			return getKind2WebApi(remoteUrl);
		default:
			throw new IllegalArgumentException("Unknown model checker setting: " + modelChecker);
		}
	}

	private static JKindApi getJKindApi() {
		IPreferenceStore prefs = getPreferenceStore();
		JKindApi api = new JKindApi();

		String solverString = prefs.getString(PreferenceConstants.PREF_SOLVER).toUpperCase()
				.replaceAll(" ", "");
		SolverOption solver = SolverOption.valueOf(solverString);
		api.setSolver(solver);

		if (!prefs.getBoolean(PreferenceConstants.PREF_BOUNDED_MODEL_CHECKING)) {
			api.disableBoundedModelChecking();
		}
		if (!prefs.getBoolean(PreferenceConstants.PREF_K_INDUCTION)) {
			api.disableKInduction();
		}
		if (!prefs.getBoolean(PreferenceConstants.PREF_INVARIANT_GENERATION)) {
			api.disableInvariantGeneration();
		}
		api.setPdrMax(prefs.getInt(PreferenceConstants.PREF_PDR_MAX));
		if (prefs.getBoolean(PreferenceConstants.PREF_INDUCTIVE_COUNTEREXAMPLES)) {
			api.setInductiveCounterexamples();
		}
		if (prefs.getBoolean(PreferenceConstants.PREF_REDUCE_SUPPORT)) {
			api.setReduceSupport();
		}
		if (prefs.getBoolean(PreferenceConstants.PREF_SMOOTH_COUNTEREXAMPLES)
				&& solver == SolverOption.YICES) {
			api.setSmoothCounterexamples();
		}
		if (prefs.getBoolean(PreferenceConstants.PREF_INTERVAL_GENERALIZATION)) {
			api.setIntervalGeneralization();
		}
		if (prefs.getBoolean(PreferenceConstants.PREF_DEBUG)) {
			api.setApiDebug();
		}

		api.setN(prefs.getInt(PreferenceConstants.PREF_DEPTH));
		api.setTimeout(prefs.getInt(PreferenceConstants.PREF_TIMEOUT));
		return api;
	}

	private static Kind2Api getKind2Api() {
		IPreferenceStore prefs = getPreferenceStore();
		Kind2Api api = new Kind2Api();
		api.setTimeout(prefs.getInt(PreferenceConstants.PREF_TIMEOUT));
		return api;
	}

	private static Kind2WebApi getKind2WebApi(String uri) {
		IPreferenceStore prefs = getPreferenceStore();
		Kind2WebApi api = new Kind2WebApi(uri);
		api.setTimeout(prefs.getInt(PreferenceConstants.PREF_TIMEOUT));
		return api;
	}
}
