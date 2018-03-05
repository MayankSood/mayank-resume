package com.mayanksood.resume.client.portfolio;

import com.mayanksood.resume.client.AbstractResumeActivity;
import com.mayanksood.resume.client.ClientFactory;

/**
 * Created by mayank on 05/03/18 4:02 PM.
 */
public class PortfolioActivity extends AbstractResumeActivity {

    public PortfolioActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    protected void doStart() {
        contentPanel.setWidget(new PortfolioView());
    }
}
