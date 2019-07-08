package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

 /*
        withoutStream();
        stream();
        streamNames();

  */

        //Sorting map
        printMapByKey();
        printMapByValue();






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

    public static void printMapByKey(){

        Map<String, Integer> result = Maps.getDetails().entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(result);

     //Map<String, Integer> result2 = Maps.getDetails().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
         /*
         Map<String, Integer> result = new HashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
       */
    }


    public static void printMapByValue(){

         Map<String, Integer> result = Maps.getDetails().entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) //to sort in descending order [.comparingByValue(Comparator.reverseOrder())]
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(result);

        //Map<String, Integer> result2 = Maps.getDetails().entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        /*
        Map<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
       */
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
