package com.train.transportation.tables;

public class Tickets {
    private char[] ticket_id = new char[13];
    private char[] book_id = new char[6];
    private char[] passenger_id = new char[20];
    private String passenger_name;
    private String passenger_data;

    public char[] getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(char[] ticket_id) {
        this.ticket_id = ticket_id;
    }

    public char[] getBook_id() {
        return book_id;
    }

    public void setBook_id(char[] book_id) {
        this.book_id = book_id;
    }

    public char[] getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(char[] passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public String getPassenger_data() {
        return passenger_data;
    }

    public void setPassenger_data(String passenger_data) {
        this.passenger_data = passenger_data;
    }
}
