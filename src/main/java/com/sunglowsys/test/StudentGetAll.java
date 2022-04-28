package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentGetAll {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConfic.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println("ID:" + " " + resultSet.getInt(1));
                System.out.println("FirstName:" + " " + resultSet.getString(2));
                System.out.println("LastName:" + " " + resultSet.getString(3));
                System.out.println("Email:" + " " + resultSet.getString(4));
                System.out.println("Mobile:" + " " + resultSet.getString(5));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
