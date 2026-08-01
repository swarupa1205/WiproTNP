package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
    static String username = "system";
    static String password = "Devi@1205";

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}