package com.example.github.DataStructure.arrays.ex7;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static int[] removeElement(int[] array, int el) {
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        int index = list.indexOf(el);
        if (index == -1) {
            System.out.println("Element not in array");
            return array;
        }

        list.remove(index);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 4, 2} ;

        System.out.println(Arrays.toString(removeElement(arr, 3)));

    }
}