package jkind.xtext.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

import jkind.xtext.ui.internal.JKindActivator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */
public class JKindPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public JKindPreferencePage() {
		super(GRID);
		setPreferenceStore(JKindActivator.getInstance().getPreferenceStore());
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(PreferenceConstants.PREF_INDUCT_CEX,
				"Generate inductive counterexamples", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.PREF_SMOOTH_CEX,
				"Generate smooth counterexamples (minimal number of input value changes)",
				getFieldEditorParent()));
		addField(new NonNegativeIntegerFieldEditor(PreferenceConstants.PREF_DEPTH,
				"Maximum depth for k-induction", getFieldEditorParent()));
		addField(new NonNegativeIntegerFieldEditor(PreferenceConstants.PREF_TIMEOUT,
				"Timeout in seconds", getFieldEditorParent()));
	}

	private class NonNegativeIntegerFieldEditor extends IntegerFieldEditor {
		public NonNegativeIntegerFieldEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
			setValidRange(0, Integer.MAX_VALUE);
			setErrorMessage("Field must be a non-negative integer");
		}
	}

	@Override
	public void init(IWorkbench workbench) {
	}
}