package collections;

import java.util.ArrayList;

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Delete Employee
    boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    // Show Payslip
    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip\n" +
                        "Employee ID : " + e.empId + "\n" +
                        "Employee Name : " + e.empName + "\n" +
                        "Salary : " + e.salary;
            }
        }
        return "Employee not found";
    }

    // Display all employees
    void displayEmployees() {
        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("-------------------");
        }
    }
}