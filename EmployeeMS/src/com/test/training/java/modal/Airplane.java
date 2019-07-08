package com.test.training.java.modal;

public class Airplane implements Vehicle {

    @Override
    public void move(){
        System.out.println("Airplane is taking Off");
    }

    @Override
    public void stop(){
        System.out.println("Airplane is landing");
    }
}
