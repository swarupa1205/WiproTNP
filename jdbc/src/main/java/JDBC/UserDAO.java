package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.*;

public class UserDAO {

	public static String getUserType(String userID) {

        String type = "User Not Found";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT USERTYPE FROM USER_DETAILS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                type = rs.getString("USERTYPE");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return type;
    }


    public static String getIncorrectAttempts(String userID) {

        String result = "User Not Found";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT INCORRECTATTEMPTS FROM USER_DETAILS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)
                    result = "No Incorrect Attempt";
                else if (attempts == 1)
                    result = "One Time";
                else
                    result = "Incorrect Attempt Exceeded";
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    public boolean changeUserType(String userID) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "UPDATE USER_DETAILS SET USERTYPE='Admin' WHERE USERID=?");

            ps.setString(1, userID);

            if(ps.executeUpdate()>0)
                flag = true;

            ps.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return flag;
    }
    public void getLockStatus() {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "SELECT USERID,NAME FROM USER_DETAILS WHERE LOCKSTATUS=1");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                System.out.println(
                rs.getString("USERID")+"  "+
                rs.getString("NAME"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean changeName(String id,String name){

        boolean flag=false;

        try{

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=
            con.prepareStatement(
            "UPDATE USER_DETAILS SET NAME=? WHERE USERID=?");

            ps.setString(1,name);
            ps.setString(2,id);

            if(ps.executeUpdate()>0)
                flag=true;

            ps.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    public boolean changePassword(String password){

        boolean flag=false;

        try{

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=
            con.prepareStatement(
            "UPDATE USER_DETAILS SET PASSWORD=? WHERE USERID='AB1001'");

            ps.setString(1,password);

            if(ps.executeUpdate()>0)
                flag=true;

            ps.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    public boolean addUser1(UserBean b) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO USER_DETAILS VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, b.getUserId());
            ps.setString(2, b.getPassword());
            ps.setString(3, b.getName());
            ps.setInt(4, b.getIncorrectAttempts());
            ps.setInt(5, b.getLockStatus());
            ps.setString(6, b.getUserType());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                flag = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    // Display Users By Type
    public void getUsers(String type) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM USER_DETAILS WHERE USERTYPE=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, type);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getString("USERID") + "\t" +
                        rs.getString("NAME") + "\t" +
                        rs.getString("USERTYPE"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}