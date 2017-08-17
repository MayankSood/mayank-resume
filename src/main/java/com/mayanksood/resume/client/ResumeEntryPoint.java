package com.mayanksood.resume.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.mayanksood.resume.client.home.HomePlace;

/**
 * Created by mayank on 17/08/17.
 */
public class ResumeEntryPoint implements EntryPoint {

    public void onModuleLoad() {

        ClientFactory clientFactory = ClientFactory.INSTANCE;
        EventBus eventBus = clientFactory.getEventBus();
        PlaceController placeController = clientFactory.getPlaceController();

        SimplePanel appWidget = clientFactory.getLayout().getContentPanel();
        HomePlace defaultPlace = new HomePlace();

        // Start ActivityManager for the main widget with our ActivityMapper
        ActivityMapper activityMapper = new ResumeActivityMapper(clientFactory);
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay(appWidget);

        // Start PlaceHistoryHandler with our PlaceHistoryMapper
        AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, defaultPlace);

        RootPanel.get().add(clientFactory.getLayout());
        // Goes to the place represented on URL else default place
        historyHandler.handleCurrentHistory();
    }

}
