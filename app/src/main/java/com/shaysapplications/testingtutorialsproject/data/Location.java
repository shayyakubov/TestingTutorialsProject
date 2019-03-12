package com.shaysapplications.testingtutorialsproject.data;

public class Location {
    private String cityName;
    private double latitude;
    private double longitude;

    public Location(String cityName, double latitude, double longitude) {
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Location(){

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
