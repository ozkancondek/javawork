package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q19 {
	public static ArrayList<Integer> findKlargest(ArrayList<Integer> arr, int k) {
		Collections.sort(arr);
		ArrayList<Integer> newArrayList = new ArrayList<>();
		for (int i = k - 1; i >= 0; i--) {
			if (arr.size() == 0) {
				System.out.println("Iam out");
				break;
			}
			newArrayList.add(arr.get(arr.size() - 1));
			arr.remove(arr.size() - 1);
		}
		Collections.sort(newArrayList);
		return newArrayList;

	}

	public static void main(String[] args) {
		ArrayList<Integer> exArrayList = new ArrayList<>(Arrays.asList(1024, 210, 30, 40));
		System.out.println(findKlargest(exArrayList, 2));
	}
}

/*
 ******* Instructions*********** 159. Write a Java program to find the k largest
 * elements in a given array. Elements in the array can be in any order.
 * Expected Output: Original Array: [1, 4, 17, 7, 25, 3, 100] 3 largest elements
 * of the said array are: 100 25 17
 */