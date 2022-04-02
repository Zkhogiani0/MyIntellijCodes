package com.syntax.class21;

import class20.Parent;

public class SuperKeyWordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class Grandparent{
    String color="Black";
}
class Child extends Parent{
    String color="Red";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

