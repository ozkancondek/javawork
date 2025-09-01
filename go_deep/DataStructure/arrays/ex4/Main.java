package com.example.github.DataStructure.arrays.ex4;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //Method classic
        // Initialize a variable 'sum' to store the sum of array elements.
        int sum = 0;

        // Use a for loop to iterate over the elements of the 'numbers' array.
        for (int i = 0; i < numbers.length; i++) {
            // Add the current element to the sum.
            sum = sum + numbers[i];
        }

        // Calculate the average value by dividing the sum by the number of elements.
        double average = (double) sum / numbers.length;

        // Print the calculated average value to the console.
        System.out.println("Average value of the array elements is : " + average);

        //Method 2
        OptionalDouble avg = IntStream.of(numbers).average();
        System.out.println("Sum2 value: " + avg);

        //method 3
        int sum2 = IntStream.of(numbers).sum();
        System.out.println("Sum2 value: " + sum2/numbers.length);
    }
}