package ExecutingQuery;

import java.sql.*;

public class EmployeeDetails {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String user = "system";
        String password = "Devi@1205";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

            System.out.println("ID\tFIRST_NAME");

            while (rs.next()) {

                int id = rs.getInt(1);                     // Column Index
                String fname = rs.getString("FIRST_NAME"); // Column Name

                System.out.println(id + "\t" + fname);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}