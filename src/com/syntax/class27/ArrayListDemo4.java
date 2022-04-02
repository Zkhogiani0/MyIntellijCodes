package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> Fruits=new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Orange");
        Fruits.add("Banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(Fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);
    }
}
