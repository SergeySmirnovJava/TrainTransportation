package com.train.transportation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class TransportationsStage {

    public TransportationsStage(Stage stage) throws IOException {
        Parent child = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader()
                                                                .getResource("TransportationsStatistics.fxml")));
        Scene scene = new Scene(child);
        stage.setScene(scene);
        stage.setWidth(1500);
        stage.setHeight(1000);
        stage.show();
    }
}
