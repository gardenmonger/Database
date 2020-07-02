package com.database.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class ConnectToDb {

    String url = "jdbc:mysql://localhost:3306/cars";
    String user = "root";
    String password = "cat";

    Connection myConn = DriverManager.getConnection(url, user, password);


    public ConnectToDb() throws SQLException {
    }
}
