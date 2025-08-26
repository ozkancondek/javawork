package com.example.github.DataStructure.arrays.ex1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] crateNumArray(int size){
        int[] res =new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            res[i] = rnd.nextInt(100); // 0–99 arası sayı
        }
        return res;
    }
    public static void main(String[]args){
        int[] sorted = crateNumArray(5);
        System.out.println(Arrays.toString(sorted));
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}
