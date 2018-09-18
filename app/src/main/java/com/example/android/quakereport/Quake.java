package com.example.android.quakereport;

public class Quake {

    //@param placeName for Place of Earthquake
    private String placeName;

    //@param date for Date of Earthquake
    private String date;

    //@param magnitude for Magnitude of Earthquake
    private String magnitude;


    Quake(String mag, String place, String dt) {
        magnitude = mag;
        placeName = place;
        date = dt;
    }


    public String getPlaceName() {
        return placeName;
    }

    public String getDate() {
        return date;
    }

    public String getMagnitude() {
        return magnitude;
    }

}
