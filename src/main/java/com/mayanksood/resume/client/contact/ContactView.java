package com.mayanksood.resume.client.contact;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.mayanksood.resume.client.css.GlobalCssBundle;
import com.mayanksood.resume.client.image.GlobalImageBundle;

/**
 * Created by mayank on 17/08/17.
 */
public class ContactView extends Composite {
    @UiField Image contactImage;

    public ContactView() {
        GlobalCssBundle.INSTANCE.contact().ensureInjected();
        initWidget(ourUiBinder.createAndBindUi(this));
        contactImage.setUrl(GlobalImageBundle.INSTANCE.cardImage().getSafeUri());
    }

    interface ContactViewUiBinder extends UiBinder<HTMLPanel, ContactView> {
    }

    private static ContactViewUiBinder ourUiBinder = GWT.create(ContactViewUiBinder.class);
}