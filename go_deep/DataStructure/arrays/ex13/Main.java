package com.example.github.DataStructure.arrays.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Declare and initialize a String array 'my_array1'.
        String[] my_array1 = {"ab","ac","ab","ad","d","t","d"};
        List<String> duplicated = new ArrayList<>();
        for (int i = 0; i<=my_array1.length-1;i++){
            String el = my_array1[i];
            for (int j = i+1; j<=my_array1.length-1;j++){
                if (my_array1[j].equals(el)){
                    duplicated.add(el);
                }
            }
        }


        System.out.println(Arrays.toString(duplicated.toArray()));
    }
}
