package com.syntax.ReviewClass7;

public class ObjectAndClassPractice {

    String empName;  // = "Tarik";
    int empID;
    String group; //=12345; // instance variable which we just declare them.

    void employeeDetails() { // void doesnt return anything.
        // String empName= "Tarik";
        // int empID =12345; // these are local variables which we define inside the class. if its above the void method then its called instance variable

        System.out.println("This method shows the details of the employee");
    }

    void employeeGroup() {
        System.out.println("This method shows the group of the employee");
    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj= new ObjectAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();

    }

}
