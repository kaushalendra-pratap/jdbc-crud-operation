package com.sunglowsys.test;

import java.sql.*;

public class StudentUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/sunglowsys");
            Connection connection = DriverManager.getConnection(url,"root","root");
            Statement statement = connection.createStatement();
            boolean isUpdate = statement.execute("update student set firstName = 'Aarayan' where studentId = 2");
            if (isUpdate){
                System.out.println("not update");
            }else {
                System.out.println("update");

            }


        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
