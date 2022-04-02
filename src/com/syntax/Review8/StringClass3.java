package com.syntax.Review8;

public class StringClass3 {
    public static void main(String[] args) {
        String batch= "Batch 12";
        String course= "sdet";

        if ("Batch".equals(batch) && "SDET". equals(course)){
        System.out.println("you will get the link to MS's lecture");

    }else {
        System.out.println("watch my youtube channel");
    }

        if ("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){
            System.out.println("Now all types of inputs are accepted");
        }
}
}
