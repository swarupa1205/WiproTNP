package com.jdbc.jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Input
            System.out.print("Enter Roll No (4 digits): ");
            int rollno = sc.nextInt();
            sc.nextLine();

            if (rollno < 1000 || rollno > 9999) {
                System.out.println("Invalid Roll Number");
                return;
            }

            System.out.print("Enter Student Name (UPPERCASE): ");
            String name = sc.nextLine();

            if (!name.matches("[A-Z ]{1,20}")) {
                System.out.println("Invalid Name");
                return;
            }

            System.out.print("Enter Standard (I to X): ");
            String standard = sc.nextLine();

            if (!(standard.equals("I") || standard.equals("II") || standard.equals("III")
                    || standard.equals("IV") || standard.equals("V")
                    || standard.equals("VI") || standard.equals("VII")
                    || standard.equals("VIII") || standard.equals("IX")
                    || standard.equals("X"))) {

                System.out.println("Invalid Standard");
                return;
            }

            System.out.print("Enter Date of Birth (dd-MMM-yyyy): ");
            String dob = sc.nextLine();

            System.out.print("Enter Fees: ");
            double fees = sc.nextDouble();

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);

            java.util.Date date = new SimpleDateFormat("dd-MMM-yyyy").parse(dob);

            ps.setDate(4, new java.sql.Date(date.getTime()));
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}