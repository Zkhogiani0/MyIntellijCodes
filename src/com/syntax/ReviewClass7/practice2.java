package com.syntax.ReviewClass7;

public class practice2 {

    String getrecord(){
        //writing method in the class to return record
        String department="QA";
        String empName= "Violet";
        String details= " Worker " + empName + " belongs to " + department;
        System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
        // creating an object of class
        practice2 p= new practice2(); // object creation here
        p.getrecord();
    }
}
