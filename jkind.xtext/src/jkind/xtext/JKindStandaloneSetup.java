/*
* generated by Xtext
*/
package jkind.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JKindStandaloneSetup extends JKindStandaloneSetupGenerated{

	public static void doSetup() {
		new JKindStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

