package com.syntax.class19;

public class Cow {

        // the constructor that is provided automatically when we dont create any constructor in a class is called default constructor
       // we do not assign values to the instance fields java assigns default values to these fields
       //
        static int normalNumberOfLegs=4;
        private String name;
        int age;
        double weight;
        String breed;
        char gender;
     /*
     below is zero argument or no argument constructor
      */
        Cow(){
         /*
         you might want to execute some code to set up the resources for your class
         like opening the connections to database checking it internet is available or not etc
          */
        }
        void printName(){
            //int name; // with local variable we get error but with instance we do not get error
            System.out.println(gender);
        }
    }

