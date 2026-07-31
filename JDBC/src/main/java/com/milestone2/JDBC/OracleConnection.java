package com.milestone2.JDBC;

import java.sql.*;

public class OracleConnection {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");

                 Connection con = DriverManager.getConnection(url, username, password);

                  if (con != null) {
                       System.out.println("Connection Established successfully");
                  }

                  con.close();

        } catch (Exception e) {
               System.out.println("Connection could not be established");
               System.out.println(e.getMessage());
        }
   }
}