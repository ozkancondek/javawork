package com.example.github.DataStructure.Arraylist.ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
    //sub list
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println(sub_List);

//        13. Compare Two ArrayLists
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

//        14. Swap ArrayList Elements
        System.out.println("before swap: " + c1);
        Collections.swap(c1, 0, 2);
        System.out.println("after swap: " + c1);

//        15. Join Two ArrayLists

        ArrayList<String> joinList = new ArrayList<String>();
        joinList.addAll(c1);
        joinList.addAll(c2);
        System.out.println("New array: " + joinList);



    }
}

