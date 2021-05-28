package com.train.transportation.data_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private final Connection connection;

     public DataBaseConnection() throws SQLException{
         String PASS = "pass";                   // todo: realize connection settings to database
         String USER = "user";
         String URL_DTB = "url";
         connection = DriverManager.getConnection(URL_DTB, USER, PASS);
     }

     public  Connection getConnection(){
        return connection;
     }
}
