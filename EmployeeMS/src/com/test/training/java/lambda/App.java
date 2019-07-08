package com.test.training.java.lambda;

public class App {

    public static void main(String[] args) {

        Printer printer= t -> System.out.printf(t.toLowerCase());

        printer.print("Hi");

    }
}
