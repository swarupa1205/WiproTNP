package com.jdbc.jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;

public class JDBCCALLS {

    String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb.mshome.net";
    String username = "system";
    String password = "Devi@1205";

    Connection con;

    public JDBCCALLS() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection(url, username, password);
    }

    // Insert Record
    public void insert(int rollno, String name, String studentClass,
                       String dob, double fee) throws Exception {

        String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, rollno);
        ps.setString(2, name);
        ps.setString(3, studentClass);

        java.util.Date d =
                new SimpleDateFormat("dd-MMM-yyyy").parse(dob);

        ps.setDate(4, new java.sql.Date(d.getTime()));

        ps.setDouble(5, fee);

        int rows = ps.executeUpdate();

        if(rows>0)
            System.out.println("Record Inserted Successfully");

        ps.close();
    }

    // Delete Record
    public void delete(int rollno) throws Exception {

        String sql="DELETE FROM STUDENT WHERE ROLLNO=?";

        PreparedStatement ps=con.prepareStatement(sql);

        ps.setInt(1, rollno);

        int rows=ps.executeUpdate();

        if(rows>0)
            System.out.println("Record Deleted Successfully");
        else
            System.out.println("Record Not Found");

        ps.close();
    }

    // Modify Fee
    public void modify(int rollno,double fee)throws Exception{

        String sql="UPDATE STUDENT SET FEE=? WHERE ROLLNO=?";

        PreparedStatement ps=con.prepareStatement(sql);

        ps.setDouble(1, fee);
        ps.setInt(2, rollno);

        int rows=ps.executeUpdate();

        if(rows>0)
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Record Not Found");

        ps.close();
    }

    // Display
    public void display(Integer rollno)throws Exception{

        PreparedStatement ps;

        if(rollno==null){

            ps=con.prepareStatement("SELECT * FROM STUDENT");

        }else{

            ps=con.prepareStatement(
                    "SELECT * FROM STUDENT WHERE ROLLNO=?");

            ps.setInt(1, rollno);
        }

        ResultSet rs=ps.executeQuery();

        System.out.println("-----------------------------------------------");
        System.out.println("ROLLNO\tNAME\tCLASS\tDOB\t\tFEE");
        System.out.println("-----------------------------------------------");

        while(rs.next()){

            System.out.println(
                    rs.getInt("ROLLNO")+"\t"+
                    rs.getString("NAME")+"\t"+
                    rs.getString("CLASS")+"\t"+
                    rs.getDate("DOB")+"\t"+
                    rs.getDouble("FEE"));
        }

        rs.close();
        ps.close();
    }

    public void close()throws Exception{
        con.close();
    }

    public static void main(String[] args) {

        try {

            JDBCCALLS obj = new JDBCCALLS();

            java.util.Scanner sc = new java.util.Scanner(System.in);

            while (true) {

                System.out.println("\n===== STUDENT MANAGEMENT =====");
                System.out.println("1. Insert Student");
                System.out.println("2. Delete Student");
                System.out.println("3. Update Student Fee");
                System.out.println("4. Display One Student");
                System.out.println("5. Display All Students");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                case 1:

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Class: ");
                    String studentClass = sc.nextLine();

                    System.out.print("Enter DOB (dd-MMM-yyyy): ");
                    String dob = sc.nextLine();

                    System.out.print("Enter Fee: ");
                    double fee = sc.nextDouble();

                    obj.insert(roll, name, studentClass, dob, fee);
                    break;

                case 2:

                    System.out.print("Enter Roll No to Delete: ");
                    roll = sc.nextInt();

                    obj.delete(roll);
                    break;

                case 3:

                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();

                    System.out.print("Enter New Fee: ");
                    fee = sc.nextDouble();

                    obj.modify(roll, fee);
                    break;

                case 4:

                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();

                    obj.display(roll);
                    break;

                case 5:

                    obj.display(null);
                    break;

                case 6:

                    obj.close();
                    sc.close();
                    System.out.println("Program Closed.");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}