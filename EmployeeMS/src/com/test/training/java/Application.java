package com.test.training.java;

import com.test.training.java.modal.Airplane;
import com.test.training.java.modal.Car;
import com.test.training.java.modal.Outlander;
import com.test.training.java.modal.Vehicle;

public class Application {

    public static void main(String[] args) {

        //System.out.println("Hello Java");

        Vehicle car = new Car();
        car.move();
        car.stop();

        Airplane airplane = new Airplane();
        airplane.move();
        airplane.stop();

        Car outlander = new Outlander();
        outlander.stop();


    }

}
