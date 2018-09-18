package com.example.android.quakereport;

public class Quake {

    //@param placeName for Place of Earthquake
    private String placeName;

    //@param nearby for Nearby Place name of earthquake
    private String nearby;

    //@param date for Date of Earthquake
    private String date;

    //@param magnitude for Magnitude of Earthquake
    private String magnitude;

    //@param time for time of Earthquake
    private String time;


    Quake(String mag, String nearby, String place, String dt, String time) {
        magnitude = mag;
        placeName = place;
        this.nearby = nearby;
        date = dt;
        this.time = time;
    }


    public String getPlaceName() {
        return placeName;
    }

    public String getNearby() {
        return nearby;
    }

    public String getDate() {
        return date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getTime() {
        return time;
    }
}
