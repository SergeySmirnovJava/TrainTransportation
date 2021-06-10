package com.train.transportation.tables;

public class Seats {
    private char[] seats_num = new char[6];
    private char[] train_id = new char[4];
    private char[] conditions = new char[10];

    public char[] getSeats_num() {
        return seats_num;
    }

    public void setSeats_num(char[] seats_num) {
        this.seats_num = seats_num;
    }

    public char[] getTrain_id() {
        return train_id;
    }

    public void setTrain_id(char[] train_id) {
        this.train_id = train_id;
    }

    public char[] getConditions() {
        return conditions;
    }

    public void setConditions(char[] conditions) {
        this.conditions = conditions;
    }
}
