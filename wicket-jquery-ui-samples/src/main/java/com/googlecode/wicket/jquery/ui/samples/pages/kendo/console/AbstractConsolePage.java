package com.googlecode.wicket.jquery.ui.samples.pages.kendo.console;

import java.util.Arrays;
import java.util.List;

import com.googlecode.wicket.jquery.ui.samples.pages.kendo.AbstractKendoPage;



abstract class AbstractConsolePage extends AbstractKendoPage
{
	private static final long serialVersionUID = 1L;

	public AbstractConsolePage()
	{
	}

	@Override
	protected List<DemoLink> getDemoLinks()
	{
		return Arrays.asList(
				new DemoLink(DefaultConsolePage.class, "Console"),
				new DemoLink(FeedbackConsolePage.class, "FeedbackConsole")
			);
	}
}
