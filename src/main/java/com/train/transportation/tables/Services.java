package com.train.transportation.tables;

import java.text.DateFormat;

public class Services {
    private int service_id;
    private char[] service_num = new char[6];
    private DateFormat time_departing;
    private DateFormat time_arrival;
    private char[] departing_station = new char[3];
    private char[] arrival_station = new char[3];
    private char[] status = new char[20];
    private char[] train_id = new char[3];
    private DateFormat actual_departing;
    private DateFormat actual_arrival;

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public char[] getService_num() {
        return service_num;
    }

    public void setService_num(char[] service_num) {
        this.service_num = service_num;
    }

    public DateFormat getTime_departing() {
        return time_departing;
    }

    public void setTime_departing(DateFormat time_departing) {
        this.time_departing = time_departing;
    }

    public DateFormat getTime_arrival() {
        return time_arrival;
    }

    public void setTime_arrival(DateFormat time_arrival) {
        this.time_arrival = time_arrival;
    }

    public char[] getDeparting_station() {
        return departing_station;
    }

    public void setDeparting_station(char[] departing_station) {
        this.departing_station = departing_station;
    }

    public char[] getArrival_station() {
        return arrival_station;
    }

    public void setArrival_station(char[] arrival_station) {
        this.arrival_station = arrival_station;
    }

    public char[] getStatus() {
        return status;
    }

    public void setStatus(char[] status) {
        this.status = status;
    }

    public char[] getTrain_id() {
        return train_id;
    }

    public void setTrain_id(char[] train_id) {
        this.train_id = train_id;
    }

    public DateFormat getActual_departing() {
        return actual_departing;
    }

    public void setActual_departing(DateFormat actual_departing) {
        this.actual_departing = actual_departing;
    }

    public DateFormat getActual_arrival() {
        return actual_arrival;
    }

    public void setActual_arrival(DateFormat actual_arrival) {
        this.actual_arrival = actual_arrival;
    }
}
