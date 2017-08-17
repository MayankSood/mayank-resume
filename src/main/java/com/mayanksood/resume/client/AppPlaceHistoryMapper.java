package com.mayanksood.resume.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.mayanksood.resume.client.home.HomePlace;

/**
 * Created by mayank on 17/08/17.
 */
@WithTokenizers({HomePlace.HomePlaceTokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper
{
}