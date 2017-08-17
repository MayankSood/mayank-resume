package com.mayanksood.resume.client.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.mayanksood.resume.client.image.GlobalImageBundle;

/**
 * Created by mayank on 17/08/17.
 */
public class HomeView extends Composite {
    interface HomeViewUiBinder extends UiBinder<HTMLPanel, HomeView> {
    }

    private static HomeViewUiBinder ourUiBinder = GWT.create(HomeViewUiBinder.class);
    @UiField HTMLPanel mainPanel;
    @UiField Image image;

    public HomeView() {
        initWidget(ourUiBinder.createAndBindUi(this));
        image.setUrl(GlobalImageBundle.INSTANCE.minkuProfilePic().getSafeUri());
    }
}