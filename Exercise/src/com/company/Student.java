package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    String studentName;
    int studentMarks;
    
    Student(String studentName,int studentMarks){
        this.studentName=studentName;
        this.studentMarks=studentMarks;
    }

    public static List<Student> getAllStudents(){

        List<Student> list = new ArrayList<>();

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

        return list;

    }


    public int getMarks() {
        return this.studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }



    public String getName() {
        return this.studentName;
    }

    public void studentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }
}
