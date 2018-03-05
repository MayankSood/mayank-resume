package com.mayanksood.resume.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.mayanksood.resume.client.AbstractResumePlace;
import com.mayanksood.resume.client.ClientFactory;
import com.mayanksood.resume.client.PlaceIdentifier;
import com.mayanksood.resume.client.contact.ContactPlace;
import com.mayanksood.resume.client.css.GlobalCssBundle;
import com.mayanksood.resume.client.home.HomePlace;
import com.mayanksood.resume.client.portfolio.PortfolioPlace;

/**
 * Created by mayank on 17/08/17.
 */
public class DefaultLayout extends Composite implements Layout {

    @UiField SimplePanel contentPanel;
    @UiField HTMLPanel about;
    @UiField HTMLPanel contact;
    @UiField HTMLPanel portfolio;

    public DefaultLayout(ClientFactory clientFactory) {
        GlobalCssBundle.INSTANCE.layout().ensureInjected();
        initWidget(ourUiBinder.createAndBindUi(this));
        Window.addResizeHandler(event -> adjustContentPanelHeight());

        contact.addDomHandler(event -> {
            if (((AbstractResumePlace)clientFactory.getPlaceController().getWhere()).getPlaceIdentifier() != PlaceIdentifier.CONTACT) {
                clientFactory.getPlaceController().goTo(new ContactPlace());
            }
        }, ClickEvent.getType());

        about.addDomHandler(event -> {
            if (((AbstractResumePlace)clientFactory.getPlaceController().getWhere()).getPlaceIdentifier() != PlaceIdentifier.HOME) {
                clientFactory.getPlaceController().goTo(new HomePlace());
            }

        }, ClickEvent.getType());

        portfolio.addDomHandler(event -> {
            if (((AbstractResumePlace)clientFactory.getPlaceController().getWhere()).getPlaceIdentifier() != PlaceIdentifier.PORTFOLIO) {
                clientFactory.getPlaceController().goTo(new PortfolioPlace());
            }
        }, ClickEvent.getType());

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
        int statusBarHeight = Window.getClientWidth() <= 650 ? 141 : 100;
        contentPanel.setHeight((windowHeight - statusBarHeight) + "px");
    }
}