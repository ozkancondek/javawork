package com.example.github.DataStructure.Arraylist.ex8;

import java.util.ArrayList;
import java.util.Collections;
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
        //original
        System.out.println(list_Strings);
        //sorted
         Collections.sort(list_Strings);
        System.out.println(list_Strings);

}
}

