package com.test.training.java.Arrays;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {


    public static void main(String[] args) {

        //ArrayList
       List<String> list = new ArrayList<>();


        System.out.println("initial size "+  list.size());

        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");

        System.out.println("after adding size "+  list.size());

        list.remove(1);

        System.out.println("after remove size  "+  list.size());

        for (String string : list){
            System.out.println(string);
        }

        /*
       //LinkedList
        List<String> linkedList=new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        System.out.println(linkedList.size());
        linkedList.remove(2);
        System.out.println(linkedList.size());

        for (String string:linkedList)
            System.out.println(string);

        */

    }

}
