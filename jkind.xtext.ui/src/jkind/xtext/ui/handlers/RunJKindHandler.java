package jkind.xtext.ui.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import jkind.JKindException;
import jkind.api.JKindApi;
import jkind.api.results.JKindResult;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Property;
import jkind.xtext.ui.internal.JKindActivator;
import jkind.xtext.ui.views.JKindResultsView;
import jkind.xtext.util.Util;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

public class RunJKindHandler extends AbstractHandler {
	private IWorkbenchWindow window;

	@Inject
	protected IResourceValidator resourceValidator;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}

		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor == null) {
			return null;
		}

		window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}

		FileEditorInput input = (FileEditorInput) xtextEditor.getEditorInput();
		final java.io.File raw = input.getFile().getLocation().toFile();

		WorkspaceJob job = new WorkspaceJob("JKind Analysis") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				return xtextEditor.getDocument().readOnly(
						new IUnitOfWork<IStatus, XtextResource>() {
							@Override
							public IStatus exec(XtextResource resource) throws Exception {
								return runJob((File) resource.getContents().get(0), raw, monitor);
							}
						});
			}
		};

		job.schedule();
		return null;
	}

	private IStatus runJob(File file, java.io.File raw, IProgressMonitor monitor) {
		if (hasErrors(file.eResource())) {
			return errorStatus("Lustre file contains errors");
		}

		JKindApi api = new JKindApi();
		JKindResult result = new JKindResult("", getProperties(file));
		showView(result);

		try {
			api.execute(raw, result, monitor);
			return Status.OK_STATUS;
		} catch (JKindException e) {
			return errorStatus(getErrorMessage(e, result.getText()));
		}
	}

	private boolean hasErrors(Resource res) {
		for (Issue issue : resourceValidator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl)) {
			if (issue.getSeverity() == Severity.ERROR) {
				return true;
			}
		}
		return false;
	}

	private void showView(final JKindResult result) {
		window.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					JKindResultsView page = (JKindResultsView) window.getActivePage().showView(
							JKindResultsView.ID);
					page.setInput(result);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	private List<String> getProperties(File file) {
		List<String> properties = new ArrayList<>();
		Node main = Util.getMainNode(file);
		if (main != null) {
			for (Property property : main.getProperties()) {
				properties.add(property.getRef().getName());
			}
		}
		return properties;
	}

	private String getErrorMessage(Throwable e, String details) {
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			while (e != null) {
				if (!e.getMessage().isEmpty()) {
					pw.println(e.getMessage());
				}
				e = e.getCause();
			}
			pw.println(details);
		}
		return sw.toString();
	}

	private IStatus errorStatus(String message) {
		return new Status(IStatus.ERROR, JKindActivator.JKIND_XTEXT_JKIND, message);
	}
}
