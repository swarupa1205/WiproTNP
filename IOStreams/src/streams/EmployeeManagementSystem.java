package streams;

import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "src/streams/employee.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void addEmployee(Scanner sc) {

        try {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);

            ArrayList<Employee> list = new ArrayList<>();

            File file = new File(FILE_NAME);

            if (file.exists()) {
                try (ObjectInputStream ois =
                             new ObjectInputStream(
                                     new FileInputStream(file))) {

                    list = (ArrayList<Employee>) ois.readObject();
                } catch (Exception e) {
                }
            }

            list.add(emp);

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME));

            oos.writeObject(list);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void displayEmployees() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME));

            ArrayList<Employee> list =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("-----Report-----");

            for (Employee e : list) {
                System.out.println(e);
            }

            System.out.println("-----End of Report-----");

            ois.close();

        } catch (Exception e) {
            System.out.println("No Employee Records Found");
        }
    }
}