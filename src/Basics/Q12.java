package Basics;

import java.util.Arrays;
import java.util.function.Predicate;
public class Q12 {
	public static Predicate<Integer> isEven = num -> num % 2 == 0;
	public static int[] rearrangeArray(int[] arr) {
		int[] tempArray = new int[arr.length];
		int oddIndex = 0;
		int evenIndex = arr.length - 1;
		for (int num : arr) {
			if (num % 2 == 0) {
				tempArray[evenIndex--] = num; // Place even number at the end
			} else {
				tempArray[oddIndex++] = num; // Place odd number at the front
			}
		}
		return tempArray;
	}

	public static void main(String[] args) {
		int[] exArr = { 10, 25, 56, 55, 1, 2, 3, 30 };
		System.out.println(Arrays.toString(rearrangeArray(exArr)));
	}
}

/*
 ******* Instructions*********** 
 94. Write a Java program to rearrange all the elements of a given array of 
 integers so that all the odd numbers come before all the even numbers.
 */