package com.syntax.class18;

public class StringVsStringBuilder1 {
    public class StringVsStringBuilder {
        public static void main(String[] args){

            String s="Asghar is great"; //original string
            s.concat("hahaha");
            System.out.println((s));

            StringBuilder stringBuilder=new StringBuilder("Asghar is great.");
            stringBuilder.append("hahaha");

            System.out.println("******************************************************");

            System.out.println((s.replace("", ""))); //add new string hahah to the string
            System.out.println((s)); // printing out the original string

            StringBuilder stringBuilder1=new StringBuilder("Asghar is great.");// original string

            System.out.println((stringBuilder.reverse()));// add new string to the string
            System.out.println(stringBuilder); // printing out the original string



        }
    }

}
