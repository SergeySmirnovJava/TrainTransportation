package com.train.transportation.tables;

import java.text.DateFormat;

public class Booking {
    private char[] book_id = new char[6];
    private DateFormat date;
    private double total_sum;

    public char[] getBook_id() {
        return book_id;
    }

    public void setBook_id(char[] book_id) {
        this.book_id = book_id;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public double getTotal_sum() {
        return total_sum;
    }

    public void setTotal_sum(double total_sum) {
        this.total_sum = total_sum;
    }
}
