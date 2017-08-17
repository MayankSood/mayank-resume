package com.mayanksood.resume.client.home;

import com.mayanksood.resume.client.AbstractResumeActivity;
import com.mayanksood.resume.client.ClientFactory;

/**
 * Created by mayank on 17/08/17.
 */
public class HomeActivity extends AbstractResumeActivity {

    public HomeActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    protected void doStart() {
        contentPanel.setWidget(new HomeView());
    }
}
