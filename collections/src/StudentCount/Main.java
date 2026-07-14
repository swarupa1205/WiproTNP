package StudentCount;

import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Devi", 75));
        students.add(new Student(2, "Venu", 45));
        students.add(new Student(3, "Sai", 60));
        students.add(new Student(4, "Kiran", 35));
        students.add(new Student(5, "Priya", 80));

        long count = students.stream()
                .filter(s -> s.marks >= 50)
                .count();

        System.out.println("Number of students passed: " + count);
    }
}