package com.company;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {

    public static void main(String[] args) {

        Optional<Student> student=Student.getAllStudents().stream()
                .min(Comparator.comparing(Student::getMarks));

        Optional<Student> student2=Student.getAllStudents().stream()
                .max(Comparator.comparing(Student::getMarks));

        System.out.println(student);
        System.out.println(student2);

    }
}
