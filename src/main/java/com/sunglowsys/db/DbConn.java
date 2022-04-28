package com.sunglowsys.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.driver");
            String url = "jdbc:mysql://localhost:3306/sunglowsys";

            String UserName = "root";
            String Password = "root";
            Connection con = DriverManager.getConnection(url,UserName,Password);
            if (con.isClosed()){
                System.out.println("connection is close");

            }
            else {
                System.out.println("connection is starting");

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
