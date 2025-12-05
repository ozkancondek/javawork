package com.example.github.DataStructure.Arraylist.ex17;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();


        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
//17. Clear ArrayList
        System.out.println(list_Strings);
        System.out.println("clean");
        list_Strings.clear();
        System.out.println(list_Strings);
        //18. Check if ArrayList is Empty
        System.out.println(list_Strings.isEmpty());
        //19. Trim ArrayList Capacity
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
        //20. Increase ArrayList Capacity
        //Increase capacity to 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);

    }
}

