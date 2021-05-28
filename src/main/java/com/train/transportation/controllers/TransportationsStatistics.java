package com.train.transportation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class TransportationsStatistics implements Initializable {
    public Button stationsInfo;
    public Button deprecatedFlight;
    public Button shortestWay;
    public Button canceledNumber;
    private Connection connection;

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){

    }
    public void getStationsInfo(ActionEvent actionEvent) {
    }

    public void getCancelledFlights(ActionEvent actionEvent) {
    }

    public void getShortestWays(ActionEvent actionEvent) {
    }

    public void getNumberOfFlights(ActionEvent actionEvent) {
    }
}
