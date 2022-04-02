package com.syntax.ReviewClass7;

public class practice5 {

    String weedDay(String day) {
        day=day.toLowerCase();
        switch (day) {
            case "monday":
                return "Is is lazy day";
            case "Tuesday":
                return "Is is productive day";
            case "wednesday":
                return "Is is gloomy day";
            case "thursday":
                return "Is is exciting day";
            case "friday":
                return "No work day";
            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {

        practice5 p= new practice5();
       String output= p.weedDay("Friday");
        System.out.println(output);

    }



}
