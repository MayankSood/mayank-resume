package com.mayanksood.resume.client.home;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.mayanksood.resume.client.AbstractResumePlace;
import com.mayanksood.resume.client.PlaceIdentifier;

import java.util.Map;

/**
 * Created by mayank on 17/08/17.
 */
public class HomePlace extends AbstractResumePlace {

    public HomePlace() {
        this("");
    }

    public HomePlace(String mainTokenString) {
        super(mainTokenString);
    }

    public HomePlace(Map<String, String> keyVal) {
        super(keyVal);
    }

    public PlaceIdentifier getPlaceIdentifier() {
        return PlaceIdentifier.HOME;
    }

    public static class HomePlaceTokenizer implements PlaceTokenizer<HomePlace> {

        public HomePlace getPlace(String token) {
            return new HomePlace(token);
        }

        public String getToken(HomePlace place) {
            return place.getMainTokenString();
        }
    }
}
