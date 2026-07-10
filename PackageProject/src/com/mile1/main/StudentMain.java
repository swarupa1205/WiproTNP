package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85,75,95});
        data[1] = new Student(null, new int[] {11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        new StudentMain();

        StudentReport report = new StudentReport();

        for (Student s : data) {
            try {

                if (report.validate(s).equals("VALID")) {
                    System.out.println(s.getName() +
                            " Grade : " +
                            report.findGrades(s));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();

        System.out.println("Null Marks Array Count : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Name Count : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Object Count : "
                + service.findNumberOfNullObjects(data));
    }
}