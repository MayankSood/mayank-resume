package com.mayanksood.resume.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.mayanksood.resume.client.ClientFactory;

/**
 * Created by mayank on 17/08/17.
 */
public class DefaultLayout extends Composite implements Layout {

    private final ClientFactory clientFactory;

    @UiField SimplePanel contentPanel;

    public DefaultLayout(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
        initWidget(ourUiBinder.createAndBindUi(this));
        Window.addResizeHandler(event -> adjustContentPanelHeight());
    }

    public SimplePanel getContentPanel() {
        return contentPanel;
    }

    interface LayoutUiBinder extends UiBinder<HTMLPanel, DefaultLayout> {
    }

    private static LayoutUiBinder ourUiBinder = GWT.create(LayoutUiBinder.class);

    @Override
    protected void onAttach() {
        super.onAttach();
        adjustContentPanelHeight();
    }

    private void adjustContentPanelHeight() {
        int windowHeight = Window.getClientHeight();
        contentPanel.setHeight((windowHeight - 100) + "px");
    }
}