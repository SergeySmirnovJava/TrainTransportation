package com.train.transportation.tables;

public class ServiceTickets {
    private char[] ticket_id = new char[13];
    private int service_id;
    private char[] conditions = new char[10];
    private double sum;

    public char[] getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(char[] ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public char[] getConditions() {
        return conditions;
    }

    public void setConditions(char[] conditions) {
        this.conditions = conditions;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
