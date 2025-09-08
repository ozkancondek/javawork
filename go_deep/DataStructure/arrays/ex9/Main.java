package com.example.github.DataStructure.arrays.ex9;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;

public class Main {

    public static void addElementToArray(int[] arr, Object el,int index){

        if(!el.getClass().getName().contains("Integer") ){
            System.out.println("Element has to be integer");
            return;
        }
        arr[index] = (Integer) el;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        addElementToArray(my_array,"3507",0);


    }
}
