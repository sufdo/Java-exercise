package com.test.training.java.modal;

public class Car implements Vehicle {

    @Override
    public void move(){
        System.out.println("Car is moving");

    }

    @Override
    public void stop(){
        System.out.println("Car stops");
    }


}
