package com.mayanksood.resume.client;

import com.google.gwt.place.shared.Place;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayank on 17/08/17.
 */
public abstract class AbstractResumePlace extends Place {

    private String mainTokenString;
    private Map<String, String> keyVal;

    public AbstractResumePlace(String mainTokenString) {
        this.mainTokenString = mainTokenString;
        this.keyVal = parseToken(mainTokenString);
    }

    public AbstractResumePlace(Map<String, String> keyVal) {
        this.keyVal = keyVal;
        mainTokenString = getQueryParamString(keyVal);
    }

    public abstract PlaceIdentifier getPlaceIdentifier();

    public Map<String, String> getKeyVal() {
        if (keyVal == null) {
            keyVal = new HashMap<String, String>();
        }
        return keyVal;
    }

    public String getMainTokenString() {
        return mainTokenString;
    }

    private String getQueryParamString(Map<String, String> data) {
        if (data != null && !data.isEmpty()) {
            String queryString = "";
            for (Map.Entry<String, String> entrySet : data.entrySet()) {
                if (entrySet.getKey() != null && !entrySet.getKey().isEmpty() && entrySet.getValue() != null && !entrySet.getValue().isEmpty()) {
                    queryString = queryString + entrySet.getKey() + "=" + entrySet.getValue() + "&";
                }
            }
            return queryString.substring(0, queryString.length() - 1);
        }
        return null;
    }

    private Map<String, String> parseToken(String token) {
        Map<String, String> keyValMap = new HashMap<>();

        if (token != null && !token.isEmpty()) {
            String[] queryParams = token.split("&");
            for (String queryParam : queryParams) {
                String[] keyVal = queryParam.split("=");
                if (keyVal.length == 2) {
                    keyValMap.put(keyVal[0], keyVal[1]);
                }
            }
        }

        return keyValMap;
    }
}
