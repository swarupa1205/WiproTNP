package ExtractEmployeeLocation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Devi","Hyderabad",50000));
        list.add(new Employee(102,"Venu","Pune",40000));
        list.add(new Employee(103,"Sai","Chennai",45000));
        list.add(new Employee(104,"Kiran","Delhi",55000));
        list.add(new Employee(105,"Priya","Bangalore",60000));

        Function<Employee,String> f = e -> e.location;

        ArrayList<String> locations = list.stream()
                .map(f)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(locations);
    }
}