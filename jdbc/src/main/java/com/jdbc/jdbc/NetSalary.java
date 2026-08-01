package com.jdbc.jdbc;

import java.sql.*;

public class NetSalary {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
        String username = "system";
        String password = "Devi@1205";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT EMPNO, ENAME FROM EMPLOYEE");

            System.out.println("---------------------------------------");
            System.out.println("EMPNO\tENAME\tNET SALARY");
            System.out.println("---------------------------------------");

            while (rs.next()) {

                int empno = rs.getInt("EMPNO");
                String ename = rs.getString("ENAME");

                CallableStatement cs =
                        con.prepareCall("{call NETSALARY_EMP(?,?)}");

                cs.setInt(1, empno);
                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.println(empno + "\t" + ename + "\t" + netSalary);

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}