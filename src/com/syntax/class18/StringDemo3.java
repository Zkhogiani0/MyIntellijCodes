package com.syntax.class18;

public class StringDemo3 {
    public class StringDemo2 {
        public static void main(String[] args){

            String str= "12" + "34567!#$@&asdnkakafkljfk";
            System.out.println(str.replaceAll("[0-9]", " "));
            System.out.println(str.replaceAll("[a-z]", " "));
            System.out.println(str.replaceAll("[A-Z]", " "));
            System.out.println(str.replaceAll("[!-/]", " "));
        }
    }

}
