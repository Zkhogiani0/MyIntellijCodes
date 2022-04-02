package com.syntax.Class17;

import java.awt.*;

public class HealthyDog {
    // when the information is expected to be different from object to object we store that information
    // in an instance variable.
    String name; // instance variable
    String color; // instance variable
    // if we know that a value will stay same for all the objects of a class we create a static variable for that
    // why because
    static int numberOfLegs; // static variable
    void eat(){
        int noOfTimes=3; // local variable
        System.out.println(name+" eats "+ noOfTimes);
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();// local

        dog.name="Scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2= new HealthyDog();
        dog2.name="Tommy";
        dog2.color="Navi Blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();
    }
}
