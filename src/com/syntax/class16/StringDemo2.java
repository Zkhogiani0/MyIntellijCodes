package com.syntax.class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="123456!###$$kaahakASGFH";
        System.out.println(str.replaceAll("[0-9]", ""));
    }
}