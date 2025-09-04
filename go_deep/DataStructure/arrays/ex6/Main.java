package com.example.github.DataStructure.arrays.ex6;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int whereIsElement(int[] array,int el) {
        List<Integer> list = Arrays.stream(array).boxed().toList();
        return list.indexOf(el);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 4, 2} ;

        System.out.println(whereIsElement(arr,5) );

    }
}