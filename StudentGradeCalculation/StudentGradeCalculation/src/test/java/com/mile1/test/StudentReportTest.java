package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentReportTest {

    StudentReport report = new StudentReport();
    StudentService service = new StudentService();

    @Test
    public void testA() throws Exception {

        Student s = new Student("Ram",
                new int[]{90,85,88});

        assertEquals("A", report.validate(s));
    }

    @Test
    public void testD() throws Exception {

        Student s = new Student("Ravi",
                new int[]{20,25,30});

        assertEquals("D", report.validate(s));
    }

    @Test
    public void testF() throws Exception {

        Student s = new Student("Hari",
                new int[]{5,10,15});

        assertEquals("F", report.validate(s));
    }

    @Test(expected = com.mile1.exception.NullStudentException.class)
    public void testNullStudent() throws Exception {

        report.validate(null);
    }

    @Test(expected = com.mile1.exception.NullNameException.class)
    public void testNullName() throws Exception {

        Student s = new Student(null,
                new int[]{50,60,70});

        report.validate(s);
    }

    @Test(expected = com.mile1.exception.NullMarksArrayException.class)
    public void testNullMarks() throws Exception {

        Student s = new Student("Ram", null);

        report.validate(s);
    }

    @Test
    public void testFindNullName() {

        Student[] students = {
                new Student(null,new int[]{1}),
                new Student("A",new int[]{2}),
                new Student(null,new int[]{3})
        };

        assertEquals(2, service.findNumberOfNullName(students));
    }

    @Test
    public void testFindNullObjects() {

        Student[] students = {
                null,
                new Student("A",new int[]{1}),
                null
        };

        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNullMarks() {

        Student[] students = {
                new Student("A",null),
                new Student("B",new int[]{1}),
                new Student("C",null)
        };

        assertEquals(2, service.findNumberOfNullMarks(students));
    }
}