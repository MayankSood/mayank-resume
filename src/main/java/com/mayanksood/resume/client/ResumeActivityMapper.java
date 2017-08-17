package com.mayanksood.resume.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.mayanksood.resume.client.contact.ContactActivity;
import com.mayanksood.resume.client.home.HomeActivity;

/**
 * Created by mayank on 17/08/17.
 */
public class ResumeActivityMapper implements ActivityMapper {

    private final ClientFactory clientFactory;

    public ResumeActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AbstractResumePlace) {
            AbstractResumePlace resumePlace = (AbstractResumePlace) place;

            switch (resumePlace.getPlaceIdentifier()) {
                case HOME:
                    return new HomeActivity(clientFactory);
                case CONTACT:
                    return new ContactActivity(clientFactory);
                default:
                    return null;
            }
        }
        return null;
    }
}
