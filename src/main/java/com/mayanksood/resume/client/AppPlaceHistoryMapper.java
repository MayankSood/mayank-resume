package com.mayanksood.resume.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.mayanksood.resume.client.contact.ContactPlace;
import com.mayanksood.resume.client.home.HomePlace;
import com.mayanksood.resume.client.portfolio.PortfolioPlace;

/**
 * Created by mayank on 17/08/17.
 */
@WithTokenizers({HomePlace.HomePlaceTokenizer.class, ContactPlace.ContactPlaceTokenizer.class, PortfolioPlace.PortfolioPlaceTokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper
{
}