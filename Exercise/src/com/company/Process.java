package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Process {

    public static void main(String[] args) {


        List<Student> students=Student.getAllStudents()
                .stream().map(s->new Student(s.getName(),s.getMarks())).collect(Collectors.toList());

        long count=Student.getAllStudents().stream().map(s->new Student(s.getName(),s.getMarks())).count();

        for (Student student:students)
            System.out.println(student.getName());

        System.out.println(count);

        Student.getAllStudents().stream()
                .forEach(System.out::println);

        Student.getAllStudents().stream().forEach(s-> s.getName().toUpperCase());


    }



}
