package com.syntax.class18;

public class Task12 {
    public class Task2 {
        public static void main(String[] args){

            String s=" 1345!@#$hajkdfhjhsfj123";
            System.out.println((s.length()));
            System.out.println((s.replaceAll("[^A-Za-z0-9@#]","").length()));// method chaining calling multiple methods on same line
        }
    }
}
