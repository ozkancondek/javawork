package com.example.github.DataStructure.Arraylist.ex16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<String> cloneToList(ArrayList<String> original,
                                                ArrayList<String> clone) {
        clone.addAll(original);
        return clone;
    }

    ;

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        List<String> list_Strings2 = new ArrayList<String>();
        List<String> list_Strings3 = new ArrayList<String>();
        List<String> list_Strings4 = new ArrayList<String>();

        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("original " + list_Strings);
        System.out.println("clone " + list_Strings2);
        System.out.println("clone started");
        cloneToList((ArrayList<String>) list_Strings, (ArrayList<String>) list_Strings2);
        System.out.println("clone " + list_Strings2);
        System.out.println("Another methods");
        list_Strings3 = (List<String>) ((ArrayList<String>) list_Strings).clone();
        System.out.println(list_Strings3);
    }
}

