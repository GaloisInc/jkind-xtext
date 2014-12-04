package jkind.xtext.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import jkind.xtext.ui.internal.JKindActivator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = JKindActivator.getInstance().getPreferenceStore();
		store.setDefault(PreferenceConstants.PREF_MODEL_CHECKER,
				PreferenceConstants.MODEL_CHECKER_JKIND);
		store.setDefault(PreferenceConstants.PREF_SOLVER, PreferenceConstants.SOLVER_YICES);
		
		store.setDefault(PreferenceConstants.PREF_BOUNDED_MODEL_CHECKING, true);
		store.setDefault(PreferenceConstants.PREF_K_INDUCTION, true);
		store.setDefault(PreferenceConstants.PREF_INVARIANT_GENERATION, true);
		store.setDefault(PreferenceConstants.PREF_PDR_MAX, 2);
		store.setDefault(PreferenceConstants.PREF_INDUCTIVE_COUNTEREXAMPLES, true);
		store.setDefault(PreferenceConstants.PREF_REDUCE_INVARIANTS, false);
		store.setDefault(PreferenceConstants.PREF_SMOOTH_COUNTEREXAMPLES, false);
		store.setDefault(PreferenceConstants.PREF_INTERVAL_GENERALIZATION, false);

		store.setDefault(PreferenceConstants.PREF_DEPTH, 200);
		store.setDefault(PreferenceConstants.PREF_TIMEOUT, 100);
	}
}
