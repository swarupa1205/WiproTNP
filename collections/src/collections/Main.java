package collections;

public class Main {
    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(
                101,
                "Devi",
                "devi@gmail.com",
                "Female",
                50000);

        Employee e2 = new Employee(
                102,
                "Ravi",
                "ravi@gmail.com",
                "Male",
                60000);

        // Add employees
        db.addEmployee(e1);
        db.addEmployee(e2);

        // Display employees
        System.out.println("Employee Details:");
        db.displayEmployees();

        // Show payslip
        System.out.println(db.showPaySlip(101));

        // Delete employee
        if (db.deleteEmployee(102)) {
            System.out.println("Employee deleted successfully");
        } else {
            System.out.println("Employee not found");
        }

        // Remaining employees
        System.out.println("\nRemaining Employees:");
        db.displayEmployees();
    }
}