package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentInsertRecord {
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sunglowsys";
            Connection connection = DriverManager.getConnection(url, "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student(studentid, firstname, lastname, email, Mobile) values (?, ?, ?, ?, ?)");

            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"Aryan");
            preparedStatement.setString(3,"pundhir");
            preparedStatement.setString(4,"govind4you531@gmail.com");
            preparedStatement.setString(5,"6398382165");

            int i = preparedStatement.executeUpdate();

            System.out.println("insert");

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
