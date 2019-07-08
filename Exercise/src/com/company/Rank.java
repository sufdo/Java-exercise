package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rank {

    public static void main(String[] args) {

        sortWithoutLambda();
        System.out.println("===============");
        //sortWithLambda();

    }


    public static void sortWithoutLambda(){
        List<Student> student= Student.getAllStudents();
        System.out.println(student);
        Collections.sort(student,new StudentRanker());
        System.out.println(student);

    }

    public static void sortWithLambda(){

       Comparator<Student> studentComparator=(s1,s2)->
               (s1.getMarks()<s2.getMarks()?-1:(s1.getMarks()>s2.getMarks())?1:0);
       //Collections.sort(student,new StudentRanker());
       System.out.println(studentComparator);

        List<Student> student= Student.getAllStudents();
        System.out.println(student);
        Collections.sort(student,new StudentRanker());
        System.out.println(student);

    }
}
