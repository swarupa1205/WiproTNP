package com.jdbc.jdbc;

import java.sql.*;
import java.util.Scanner;

public class ModifyStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            // Check if student exists
            String checkQuery = "SELECT * FROM STUDENT WHERE ROLLNO = ?";
            PreparedStatement checkPs = con.prepareStatement(checkQuery);
            checkPs.setInt(1, roll);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {

                System.out.println("Current Fee : " + rs.getDouble("FEE"));

                System.out.print("Enter New Fee: ");
                double newFee = sc.nextDouble();

                String updateQuery = "UPDATE STUDENT SET FEE=? WHERE ROLLNO=?";
                PreparedStatement updatePs = con.prepareStatement(updateQuery);

                updatePs.setDouble(1, newFee);
                updatePs.setInt(2, roll);

                int rows = updatePs.executeUpdate();

                if (rows > 0) {
                    System.out.println("Student Fee Updated Successfully.");
                } else {
                    System.out.println("Update Failed.");
                }

                updatePs.close();

            } else {
                System.out.println("Student Record Not Found.");
            }

            rs.close();
            checkPs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}