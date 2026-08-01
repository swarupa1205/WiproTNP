package com.jdbc.jdbc;


import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.print("Enter Roll Number to Delete: ");
            int roll = sc.nextInt();

            String logQuery =
            "INSERT INTO STUDENTLOG " +
            "SELECT ROLLNO, NAME, CLASS, SYSDATE FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps1 = con.prepareStatement(logQuery);

            ps1.setInt(1, roll);

            int x = ps1.executeUpdate();

            if(x>0){

                PreparedStatement ps2 =
                con.prepareStatement(
                "DELETE FROM STUDENT WHERE ROLLNO=?");

                ps2.setInt(1, roll);

                ps2.executeUpdate();

                System.out.println("Student Deleted Successfully");

                ps2.close();

            }else{

                System.out.println("Student Record Not Found");
            }

            ps1.close();
            con.close();

        }catch(Exception e){

            e.printStackTrace();
        }

        sc.close();
    }
}