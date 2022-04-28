package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.Statement;

public class StudentDelete {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConfic.getConnection();
            Statement statement = connection.createStatement();
            boolean isDelete = statement.execute("delete from student where StudentId =  2" );
            if (isDelete){
                System.out.println("not done");
            }else {
                System.out.println("done");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
