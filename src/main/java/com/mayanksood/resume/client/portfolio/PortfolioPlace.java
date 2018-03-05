package com.mayanksood.resume.client.portfolio;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.mayanksood.resume.client.AbstractResumePlace;
import com.mayanksood.resume.client.PlaceIdentifier;

import java.util.Map;

/**
 * Created by mayank on 05/03/18 4:02 PM.
 */
public class PortfolioPlace extends AbstractResumePlace {

    public PortfolioPlace(String mainTokenString) {
        super(mainTokenString);
    }

    public PortfolioPlace() {
        super("");
    }

    @Override
    public PlaceIdentifier getPlaceIdentifier() {
        return PlaceIdentifier.PORTFOLIO;
    }

    public static class PortfolioPlaceTokenizer implements PlaceTokenizer<PortfolioPlace> {

        @Override
        public PortfolioPlace getPlace(String token) {
            return new PortfolioPlace(token);
        }

        @Override
        public String getToken(PortfolioPlace place) {
            return place.getMainTokenString();
        }
    }
}
