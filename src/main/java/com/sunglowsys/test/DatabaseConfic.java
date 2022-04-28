package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfic {
    private static Connection connection = null;

    public static Connection getConnection() {

        if (connection == null) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/sunglowsys";
                connection = DriverManager.getConnection(url, "root", "root");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
