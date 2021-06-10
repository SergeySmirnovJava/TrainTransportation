package com.train.transportation.tables;

public class Trains {
    private char[] train_id = new char[3];
    private String model;
    private int distance;

    public char[] getTrain_id() {
        return train_id;
    }

    public void setTrain_id(char[] train_id) {
        this.train_id = train_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
