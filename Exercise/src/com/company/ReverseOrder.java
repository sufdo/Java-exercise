package com.company;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        System.out.println("Reserve Number : " + reverseMethod());

    }

    public static int reverseMethod(){

        //Keyboard input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        int reverseNumber=0;

        for (; number!=0; number/=10){
            reverseNumber=reverseNumber*10 +number%10;
        }

        return reverseNumber;

    }
}
