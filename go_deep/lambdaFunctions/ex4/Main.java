package com.example.github.lambdaFunctions.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printlist(List<Integer> listToPrint){
        for(Integer num : listToPrint){
            System.out.println(num);
        }
    }
     public static boolean isEven(int num){
         return num % 2 == 0 ;
     }



     public static void listSeperator(List<Integer> mixList){
         List<Integer> oddList = new ArrayList<Integer>();
         List<Integer> evenList = new ArrayList<Integer>();

         for (Integer num : mixList) {
             if (isEven(num)) {
                 oddList.add(num);
             } else {
                 evenList.add(num);
             }
         }
         printlist(oddList);
         printlist(evenList);
     }

    public static void main(String[] args){
        // Create a list of strings
        List<Integer> mixList = Arrays.asList(54,1,6,9,8,2,1,4,7,5,8,12,45,98,3,57);

        listSeperator(mixList);



    }
}



//// Main.java
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create a list of integers
//        List nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
//
//        // Print the original numbers
//        System.out.println("Original numbers:");
//        for (int n : nums) {
//            System.out.print(n+ " ");
//        }
//
//        // Filter out even numbers using lambda expression
//        List evenNumbers = nums.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        // Print the even numbers
//        System.out.print("\nEven numbers:");
//        for (int num : evenNumbers) {
//            System.out.print(num + " ");
//        }
//
//        // Filter out odd numbers using lambda expression
//        List oddNumbers = nums.stream()
//                .filter(num -> num % 2 != 0)
//                .collect(Collectors.toList());
//
//        // Print the odd numbers
//        System.out.print("\nOdd numbers:");
//        for (int num : oddNumbers) {
//            System.out.print(num + " ");
//        }
//    }
//}

