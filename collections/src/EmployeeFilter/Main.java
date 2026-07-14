package EmployeeFilter;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Devi", 22, "Pune"));
        employees.add(new Employee(102, "Venu", 23, "Hyderabad"));
        employees.add(new Employee(103, "Sai", 24, "Pune"));
        employees.add(new Employee(104, "Kiran", 25, "Chennai"));
        employees.add(new Employee(105, "Priya", 22, "Pune"));

        ArrayList<Employee> puneEmployees = employees.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}