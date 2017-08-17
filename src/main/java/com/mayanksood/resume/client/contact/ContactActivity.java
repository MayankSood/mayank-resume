package com.mayanksood.resume.client.contact;

import com.mayanksood.resume.client.AbstractResumeActivity;
import com.mayanksood.resume.client.ClientFactory;

/**
 * Created by mayank on 17/08/17.
 */
public class ContactActivity extends AbstractResumeActivity {

    public ContactActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    protected void doStart() {
        contentPanel.setWidget(new ContactView());
    }
}
