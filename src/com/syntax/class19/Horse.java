package com.syntax.class19;

public class Horse {

        // it is very good practice to make the fields private
        private String name;
        private int age;
        private double weight;

        // No argument/ zero argument constructor
        Horse() {
           // write some important line of code that you want to execute when the object of a class is created
           // for example you might want to fetch some info from internet or from your hard disk
           // to give initial values to the fields.
        }

        // purpose of constructor is to give initial values to the fields of a class
        Horse (String horseName,int horseAge, double horseWeight){
            name=horseName;
            age=horseAge;
            weight=horseWeight;
        }
        // Rule no 1 constructor dont have return types like int string not even void
        // Horse (String horseName,int horseAge, double horseWeight){
        //      name=horseName;
        //        age=horseAge;
        //        weight=horseWeight;

        /*
        Rule no 2 name of the constructor should be same as class.
        Horse (String horseName,int horseAge, double horseWeight){
            name=horseName;
            age=horseAge;
            weight=horseWeight;
         */

        void printHorseName() {
            System.out.print("Name" + name);
        }

        void setName(String horseName) {
            name = horseName;
        }
    }

