package com.syntax.ReviewClass7;

public class practice3 {
    // creating some attribute
    String studentName;
    String course;
    int studentId;
    int grades;

    void displaysStudentsRecord(){
        System.out.println("The student name is: "+ studentName+ " and the course student enrolled for is "+ course);
        System.out.println(" The student id is: " + studentId + " and the grades student achieved are " + grades);
    }

    public static void main(String[] args) {
        // creating the objects for the methods to assign set of values
        practice3 p1 = new practice3();
        p1.studentName="Rogo";
        p1.course="SDET";
        p1.studentId= 123;
        p1.grades=65;
        p1.displaysStudentsRecord();

        System.out.println("--------------------------------------------");
        // creating the second object of class to assign second set of values
        practice3 p2 = new practice3();
        p2.studentName="Yazina";
        p2.course="science";
        p2.studentId= 456;
        p2.grades=91;
        p2.displaysStudentsRecord();


    }
}
