package com.example.github.DataStructure.arrays.ex5;

import java.util.Arrays;

public class Main {
    public static boolean hasArrayNumber(int[] array,
                                         int num) {
        for (int item : array) {
            if (item == num) {
                return true;
            }
        }

        return false;
    }
    public static boolean hasArrayNumber2(int[] array,
                                         int num) {
        return Arrays.stream(array).anyMatch(item -> item == num);
    }


    public static void main(String[] args) {
        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 ,3507};
        int num = 3507;

        System.out.println(hasArrayNumber2(numbers, num));

    }
}