package com.syntax.class18;

public class Recap1 {
    public class Recap {
        public static void main(String[] args){

            String str="This is my #0345685696 my # #546312315434 Ahmad";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(3));
            System.out.println(str.length());
            System.out.println(str.charAt(str.length()-1));
            System.out.println("*******************************");
            System.out.println(str.indexOf('A'));
            System.out.println(str.indexOf('a'));
            System.out.println(str.lastIndexOf('A'));
            System.out.println("***********************************");
            System.out.println((str.indexOf("#")));
            System.out.println(str.substring(str.indexOf("#")+1)); // This is subtring method
            System.out.println(str.substring(12,23));
            System.out.println(str.substring(str.indexOf("#")+1,str.indexOf("#")+1+11));



        }
    }
}
