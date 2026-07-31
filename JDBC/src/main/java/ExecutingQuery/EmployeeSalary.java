package ExecutingQuery;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSalary {

    public static void main(String[] args) {

        // Database Connection Details
        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        try {

            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Query
            String query = "SELECT ENAME, JOB, SAL, COMM FROM EMP_WIPRO "
                         + "WHERE SAL > 1000 AND SAL < 2000";

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            // Display Heading
            System.out.println("-----------------------------------------------");
            System.out.println("ENAME\t\tJOB\t\tSAL\tCOMM");
            System.out.println("-----------------------------------------------");

            // Display Records
            while (rs.next()) {

                String ename = rs.getString("ENAME");
                String job = rs.getString("JOB");
                double sal = rs.getDouble("SAL");

                // COMM may be NULL
                String comm = rs.getString("COMM");

                if (comm == null) {
                    comm = "NULL";
                }

                System.out.println(ename + "\t\t" + job + "\t\t" + sal + "\t" + comm);
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

            System.out.println("-----------------------------------------------");
            System.out.println("Query Executed Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}