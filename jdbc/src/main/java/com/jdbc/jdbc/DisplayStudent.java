package com.jdbc.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DisplayStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("1. Display Particular Student");
            System.out.println("2. Display All Students");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            PreparedStatement ps;
            ResultSet rs;

            if (choice == 1) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, roll);

                rs = ps.executeQuery();

                if (rs.next()) {

                    System.out.println("\nStudent Details");
                    System.out.println("-------------------------------");
                    System.out.println("Roll No : " + rs.getInt("ROLLNO"));
                    System.out.println("Name    : " + rs.getString("NAME"));
                    System.out.println("Class   : " + rs.getString("CLASS"));
                    System.out.println("DOB     : " + rs.getDate("DOB"));
                    System.out.println("Fee     : " + rs.getDouble("FEE"));

                } else {

                    System.out.println("Student Record Not Found.");
                }

            } else if (choice == 2) {

                String sql = "SELECT * FROM STUDENT";
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                System.out.println("\n--------------------------------------------------------");
                System.out.println("ROLLNO\tNAME\tCLASS\tDOB\t\tFEE");
                System.out.println("--------------------------------------------------------");

                while (rs.next()) {

                    System.out.println(
                            rs.getInt("ROLLNO") + "\t"
                            + rs.getString("NAME") + "\t"
                            + rs.getString("CLASS") + "\t"
                            + rs.getDate("DOB") + "\t"
                            + rs.getDouble("FEE"));
                }

            } else {

                System.out.println("Invalid Choice.");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        sc.close();
    }
}