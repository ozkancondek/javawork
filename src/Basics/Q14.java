package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14 {
	
	public static int findFrequencyInArr (int num, int[] arr) {
		return (int) Arrays.stream(arr).filter(i -> i == num).count();
		}
	public static void onlyOneElements(int[] arr) {
		for(int j:arr) {
			if(findFrequencyInArr(j, arr)==1) {
				System.out.print(j+" ");
			}
		}
		System.out.println("are single in array");
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,4,7,8,9,1,5,3,1,5,4,2};
	 onlyOneElements(arr);
	}

}


/*
 ******* Instructions*********** 115. Write a Java program to check if a positive
129. Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
 */