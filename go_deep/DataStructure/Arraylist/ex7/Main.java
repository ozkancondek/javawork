package com.example.github.DataStructure.Arraylist.ex7;

import java.util.ArrayList;
import java.util.List;

public class Main {




    public static boolean hasListElement(List<String> list, String el){
        return list.contains(el);
    };

    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Search the value Red
        boolean answer = hasListElement(list_Strings,"Red");
        if (answer) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        System.out.println(list_Strings);

}
}

