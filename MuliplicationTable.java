package com.test.training.java.Exercise;

public class MuliplicationTable {

    public static void main(String[] args) {

        for (int i=1;i<10;i++)
            System.out.print("\t" + i);

        System.out.println();
        System.out.println("------------------------------------------");

        for (int i=1;i<10;i++) {
            System.out.print(i + "| ");

            for (int x=1;x<10;x++)
                System.out.print(x*i + "\t");

            System.out.println();

        }

    }



}
