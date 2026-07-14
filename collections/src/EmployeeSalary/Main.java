package EmployeeSalary;

import java.util.*;
import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101,"Devi",9000));
        employees.add(new Employee(102,"Venu",12000));
        employees.add(new Employee(103,"Sai",8000));
        employees.add(new Employee(104,"Kiran",15000));
        employees.add(new Employee(105,"Priya",7000));

        Predicate<Employee> p =
                e -> e.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        employees.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));
    }
}
