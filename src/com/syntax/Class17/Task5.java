package com.syntax.Class17;

public class Task5 {
    public static void main(String[] args) {


    // how would you check if String is palindrome or not?
    // Example1: aba----> true aba
    // Example: Abbc---> false cbbA

        Task5 task= new Task5();
        System.out.println(task.isPalindrome("abc"));
        System.out.println(task.isPalindrome("Abbc"));

}

boolean isPalindrome(String inputStr){
    String reverseStr=reverseString(inputStr);
    return reverseStr.equals(inputStr);

}
String reverseString(String inputString){
    // converting S String to StringBuilder so that we can use the reverse method
    StringBuilder stringBuilder=new StringBuilder(inputString);
    stringBuilder.reverse();
    return stringBuilder.toString();

}
}
