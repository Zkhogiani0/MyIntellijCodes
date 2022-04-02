package com.syntax.class21;

import java.sql.SQLOutput;

public class parent1 {
    String name="parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends parent1{
    //String name="Child";
    void printName(){
     //String name="Child"; then instance variable will print
        // first priority is given to local variables.
        System.out.println(name);
        /*
        when we use the "this" keyword even though we have a local
        and instance variable java will only bring the values from instance variables
         */
        System.out.println(this.name);
        /*
        when we use the super key word even though we have a local
        and instance variables inside the same class
        java will only bring the values from parent class instance variables
         */
        System.out.println(super.name);
    }
}
class parentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}
