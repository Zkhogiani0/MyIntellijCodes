package com.syntax.class21;

public class ClassA {
    void method (){
        System.out.println("A");
    }
}
class ClassB extends ClassA {
    void method() {
        System.out.println("B");
    }

    void test() {
        method();// call the same class method
        this.method();// call the same class method
        super.method();// call the parent class method

    }
}


    class Tester {
        public static void main(String[] args) {
            ClassB classB = new ClassB();
            classB.test();
            //classB.method();
        }
    }

