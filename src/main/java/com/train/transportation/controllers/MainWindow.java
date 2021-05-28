package com.train.transportation.controllers;

import com.train.transportation.TransportationsStage;
import com.train.transportation.data_base.DataBaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.xml.transform.Source;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MainWindow implements Initializable {
    private Connection connection;
    public Button statisticsManagement;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            DataBaseConnection dataBaseConnection = new DataBaseConnection();
            connection = dataBaseConnection.getConnection();
        } catch (SQLException e) {
            System.out.println("Exception");
        }
    }

    public void openTransportationStatistics(ActionEvent actionEvent) throws IOException {
        Stage scene = new Stage();
        TransportationsStage transportationsStage = new TransportationsStage(scene);
        FXMLLoader transportationFxml = new FXMLLoader(getClass().getClassLoader()
                                                                .getResource("TransportationsStatistics.fxml"));
        Parent root = transportationFxml.load();
        TransportationsStatistics transportationsStatistics = transportationFxml.getController();
        transportationsStatistics.setConnection(connection);
    }
}
