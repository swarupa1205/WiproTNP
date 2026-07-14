package collections1;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Devi", 50000));
        employees.add(new Employee(102, "Ravi", 60000));
        employees.add(new Employee(103, "Kiran", 55000));

        System.out.println("Using Iterator:");
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}