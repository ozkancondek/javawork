package com.example.github.DataStructure.arrays.ex2;

import java.util.stream.IntStream;

// Define a class named Exercise2.
public class Main {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array.
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declare and initialize a variable to store the sum.
        int sum = 0;

        // Iterate over each element of the array using an enhanced for loop.
        for (int i : my_array)
            // Add each element to the sum.
            sum += i;

        // Print the sum of the array elements.
        System.out.println("The sum is " + sum);


        //second method

        int sum2 = IntStream.of(my_array).sum();
        System.out.println("Sum2 value: " + sum2);
    }
}
