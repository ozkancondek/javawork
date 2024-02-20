package Basics;

import java.util.ArrayList;

public class Q22 {
	
	public static int extractInts(String sentence) {
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		int count = 0;
		for(String el: sentence.split(" ")) {
			try {
				int a = Integer.parseInt(el);
				count += a;
				
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(extractInts("5 apple and 10 orange are rotten in the basket"));
	}

}
/*
 ******* Instructions*********** 
236. Write a Java program to sum all numerical values (positive integers) embedded in a sentence.

Input:
Sentences with positive integers are given over multiple lines. Each line is a character string containing one-byte alphanumeric characters, symbols, spaces, or an empty line. However the input is 80 characters or less per line and the sum is 10,000 or less.

Sample Output:

Input some text and numeric values:
5 apple and 10 orange are rotten in the basket

Sum of the numeric values:
15
 */