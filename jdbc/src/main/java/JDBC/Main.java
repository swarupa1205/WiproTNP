package JDBC;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        int choice;

        do {

            System.out.println("\n===== USER MENU =====");
            System.out.println("1. Get User Type");
            System.out.println("2. Get Incorrect Attempts");
            System.out.println("3. Change User Type");
            System.out.println("4. Get Lock Status");
            System.out.println("5. Change Name");
            System.out.println("6. Change Password");
            System.out.println("7. Add User");
            System.out.println("8. Add User (Scanner)");
            System.out.println("9. Get Users By Type");
            System.out.println("10. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.print("Enter User ID : ");
                String id = sc.next();

                System.out.println(dao.getUserType(id));

                break;

            case 2:

                System.out.print("Enter User ID : ");
                id = sc.next();

                System.out.println(dao.getIncorrectAttempts(id));

                break;

            case 3:

                System.out.print("Enter User ID : ");
                id = sc.next();

                if(dao.changeUserType(id))
                    System.out.println("Updated");
                else
                    System.out.println("User Not Found");

                break;

            case 4:

                dao.getLockStatus();

                break;

            case 5:

                System.out.print("Enter User ID : ");
                id = sc.next();

                System.out.print("Enter New Name : ");
                String name = sc.next();

                if(dao.changeName(id,name))
                    System.out.println("Updated");
                else
                    System.out.println("User Not Found");

                break;

            case 6:

                System.out.print("Enter New Password : ");

                String pass = sc.next();

                if(dao.changePassword(pass))
                    System.out.println("Password Updated");

                break;

            case 7:

                UserBean b = new UserBean();

                b.setUserId("AA1005");
                b.setPassword("AA1005");
                b.setName("Ravi");
                b.setIncorrectAttempts(0);
                b.setLockStatus(0);
                b.setUserType("Employee");

                dao.addUser1(b);

                System.out.println("User Added");

                break;

            case 8:

                UserBean u = new UserBean();

                System.out.print("User ID : ");
                u.setUserId(sc.next());

                System.out.print("Password : ");
                u.setPassword(sc.next());

                System.out.print("Name : ");
                u.setName(sc.next());

                System.out.print("Incorrect Attempts : ");
                u.setIncorrectAttempts(sc.nextInt());

                System.out.print("Lock Status : ");
                u.setLockStatus(sc.nextInt());

                System.out.print("User Type : ");
                u.setUserType(sc.next());

                dao.addUser1(u);

                System.out.println("User Added");

                break;

            case 9:

                System.out.print("Enter User Type : ");

                String type = sc.next();

                dao.getUsers(type);

                break;

            case 10:

                System.out.println("Thank You");

                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while(choice != 10);

        sc.close();
    }
}