package com.mayanksood.resume.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.mayanksood.resume.client.layout.DefaultLayout;
import com.mayanksood.resume.client.layout.Layout;

/**
 * Created by mayank on 17/08/17.
 */
public class DefaultClientFactory implements ClientFactory {

    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);
    private final Layout layout = new DefaultLayout(this);


    public EventBus getEventBus() {
        return eventBus;
    }

    public PlaceController getPlaceController() {
        return placeController;
    }

    public Layout getLayout() {
        return layout;
    }
}
