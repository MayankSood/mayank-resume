package com.mayanksood.resume.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.mayanksood.resume.client.layout.Layout;

/**
 * Created by mayank on 17/08/17.
 */
public interface ClientFactory {
    ClientFactory INSTANCE = GWT.create(ClientFactory.class);

    EventBus getEventBus();

    PlaceController getPlaceController();

    Layout getLayout();
}
