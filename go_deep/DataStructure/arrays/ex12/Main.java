package com.example.github.DataStructure.arrays.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array1'.
        int[] my_array1 = {1, 2, 5, 5, 6, 6, 7, 2};
        List<Integer> duplicated = new ArrayList<>();
        for (int i = 0; i<=my_array1.length-1;i++){
            int el = my_array1[i];
            for (int j = i+1; j<=my_array1.length-1;j++){
                if (my_array1[j] == el){
                    duplicated.add(Integer.parseInt(String.valueOf(el)));
                }
            }
        }



        System.out.println(Arrays.toString(duplicated.toArray()));
    }
}
