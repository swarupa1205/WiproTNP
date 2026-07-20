package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        return findGrade(student);
    }

    public String findGrade(Student student) {

        int total = 0;

        for (int mark : student.getMarks()) {
            total += mark;
        }

        double avg = total / (double) student.getMarks().length;

        if (avg >= 80)
            return "A";

        else if (avg >= 60)
            return "B";

        else if (avg >= 40)
            return "C";

        else if (avg >= 20)
            return "D";

        else
            return "F";
    }
}