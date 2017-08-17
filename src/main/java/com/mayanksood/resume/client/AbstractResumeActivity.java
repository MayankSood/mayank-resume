package com.mayanksood.resume.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * Created by mayank on 17/08/17.
 */
public abstract class AbstractResumeActivity extends AbstractActivity {

    private final ClientFactory clientFactory;
    protected AcceptsOneWidget contentPanel;
    protected EventBus eventBus;

    public AbstractResumeActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public final void start(AcceptsOneWidget panel, EventBus eventBus) {
        this.eventBus = eventBus;
        this.contentPanel = panel;
        doStart();
    }

    protected abstract void doStart();

}
