package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {


        //Sorting method 1
        List<Student> student=Student.getAllStudents()
                .stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(student);

        //Sorting method 2
        List<Student> newStudent=Student.getAllStudents()
                .stream().sorted((s1,s2)->new  Integer(s1.getName().length())
                .compareTo(s2.getName().length())).collect(Collectors.toList());
        System.out.println(newStudent);



    }

}
