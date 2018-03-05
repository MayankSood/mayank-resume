package com.mayanksood.resume.client.portfolio;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.mayanksood.resume.client.css.GlobalCssBundle;

/**
 * Created by mayank on 05/03/18 4:06 PM.
 */
public class PortfolioView extends Composite {
    interface PortfolioViewUiBinder extends UiBinder<HTMLPanel, PortfolioView> {
    }

    private static PortfolioViewUiBinder ourUiBinder = GWT.create(PortfolioViewUiBinder.class);

    public PortfolioView() {
        GlobalCssBundle.INSTANCE.portfolio().ensureInjected();
        initWidget(ourUiBinder.createAndBindUi(this));
        this.getElement().getStyle().setBackgroundColor("#fff");
        this.getElement().getStyle().setColor("#000");
    }
}