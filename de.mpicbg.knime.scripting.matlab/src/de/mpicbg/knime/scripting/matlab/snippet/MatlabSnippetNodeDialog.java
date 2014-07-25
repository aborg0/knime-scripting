package de.mpicbg.knime.scripting.matlab.snippet;

import de.mpicbg.knime.scripting.core.ScriptingNodeDialog;
import de.mpicbg.knime.scripting.matlab.MatlabColReformatter;
import de.mpicbg.knime.scripting.matlab.MatlabScriptingBundleActivator;
import de.mpicbg.knime.scripting.matlab.prefs.MatlabPreferenceInitializer;

/**
 * Created by IntelliJ IDEA.
 * User: Antje Niederlein
 * Date: 10/27/11
 * Time: 2:03 PM
 */
public class MatlabSnippetNodeDialog extends ScriptingNodeDialog {
    public MatlabSnippetNodeDialog(String defaultScript, boolean hasOutput, boolean useTemplateRepository) {
        super(defaultScript, new MatlabColReformatter(), hasOutput, useTemplateRepository);
    }

    @Override
    public String getTemplatesFromPreferences() {
        return MatlabScriptingBundleActivator.getDefault().getPreferenceStore().getString(MatlabPreferenceInitializer.MATLAB_TEMPLATE_RESOURCES);
    }
}
