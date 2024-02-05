package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
	
	public static int[] returnArray (int[] arr) {
		int[] result = new int[arr.length];
		   for (int i = arr.length - 1; i >= 0; i--) {
	            result[arr.length - 1 - i] = arr[i]; // Store elements in reverse order
	        }
		return result;
	}
	public static void main(String[] args) {
		int[] exampleArr = {1,2,3,4,5};
		 System.out.println(Arrays.toString(returnArray(exampleArr)));
	}
 

}

/*
 ******* Instructions*********** 
  Write a Java program to rotate an array (length 3) of integers in the left direction.
  Sample Output:

Original Array: [20, 30, 40]                                           
Rotated Array: [30, 40, 20]
 */