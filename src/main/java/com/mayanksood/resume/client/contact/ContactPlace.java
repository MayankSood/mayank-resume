package com.mayanksood.resume.client.contact;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.mayanksood.resume.client.AbstractResumePlace;
import com.mayanksood.resume.client.PlaceIdentifier;

import java.util.Map;

/**
 * Created by mayank on 17/08/17.
 */
public class ContactPlace extends AbstractResumePlace {

    public ContactPlace() {
        this("");
    }

    public ContactPlace(String mainTokenString) {
        super(mainTokenString);
    }

    public ContactPlace(Map<String, String> keyVal) {
        super(keyVal);
    }

    @Override
    public PlaceIdentifier getPlaceIdentifier() {
        return PlaceIdentifier.CONTACT;
    }

    public static class ContactPlaceTokenizer implements PlaceTokenizer<ContactPlace> {

        @Override
        public ContactPlace getPlace(String token) {
            return new ContactPlace(token);
        }

        @Override
        public String getToken(ContactPlace place) {
            return place.getMainTokenString();
        }
    }
}
