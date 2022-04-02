package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //List<String> groceries=Arrays.asList("Apple", "Orange", "Banana");
        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Apple");
        list2.add("Onion");
        //list2.add("Pillow"); this will give false in the console if its enable. because it is not listed above.
        System.out.println(groceries.containsAll(list2));

    }
}
