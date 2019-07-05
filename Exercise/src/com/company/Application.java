package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        /*
        withoutStream();
        stream();
        */
        streamNames();
    }

    public static void withoutStream(){

        //without stream API

        List<Student> students=Student.getAllStudents();
        List<Student> newstudents=new ArrayList<>();

        for (Student student: students){
            if (student.studentMarks>50){
                newstudents.add(student);
            }
        }


        System.out.println(students.size());
        System.out.println(newstudents.size());

    }

    public static void stream(){

        List<Student> students = Student.getAllStudents().stream().
                filter(s->s.getMarks()>50).collect(Collectors.toList());

        System.out.println(students.size());

    }

    public static void streamNames(){

        //No.of students
        List<Student> students = Student.getAllStudents().stream().
                filter(s->s.getName().contains("i")).collect(Collectors.toList());

        System.out.println(students.size());

        for (Student student:students)
            System.out.println(student.studentName);


    }


}

















/*//List
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("Saman", 58));
        list.add(new Student("Nimal", 51));
        list.add(new Student("Mala", 47));
        list.add(new Student("Kamal", 80));
        list.add(new Student("Nayani", 37));
        list.add(new Student("Sunil", 44));
        list.add(new Student("Priya", 71));
        list.add(new Student("Pooja", 94));
        list.add(new Student("Seneha", 66));
        list.add(new Student("Shehan", 64));



        System.out.println("No. of students:  "+  list.size());
        System.out.println();

        //Use an iterator
        Iterator itr=list.iterator();

        while(itr.hasNext()){
            Student student=(Student)itr.next();
            System.out.println(student.studentName +" - "+ student.studentMarks);
        }*/

        /*
        //Use a for loop
        for (Student student:list){
            System.out.println(student.studentName +" - "+ student.studentMarks);

        }*/
