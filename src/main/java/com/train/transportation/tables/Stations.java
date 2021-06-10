package com.train.transportation.tables;

public class Stations {
    private char[] station_id = new char[3];
    private String station_name;
    private String city;
    private int coordinates;
    private String timeZone;

    public char[] getStation_id() {
        return station_id;
    }

    public void setStation_id(char[] station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
