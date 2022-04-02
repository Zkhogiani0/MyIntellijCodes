package com.syntax.Class17;

public class SyntaxEmployee {
    String empId;
    double salary;
  static String CEO= "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselClassObject=new SyntaxEmployee();
        aselClassObject.empId="123";
        aselClassObject.salary=200000;
        System.out.println(aselClassObject.empId);
        System.out.println(aselClassObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee ZakObject=new SyntaxEmployee();
        ZakObject.empId="456";
        ZakObject.salary=300000;
        System.out.println(ZakObject.empId);
        System.out.println(ZakObject.salary);
        System.out.println(ZakObject.empId);

    }

}
