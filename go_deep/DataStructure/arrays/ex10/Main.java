package com.example.github.DataStructure.arrays.ex10;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println(Arrays.stream(my_array).max().getAsInt());
//        System.out.println(Arrays.stream(my_array).min().getAsInt());
        Arrays.sort(my_array);
        System.out.println(my_array[my_array.length-1]);


    }
}
