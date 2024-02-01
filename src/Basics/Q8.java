package Basics;

import java.util.Scanner;

public class Q8 {
	
	public static void  factorFinder (int num) {
		int factCount  = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i ==0) {
				factCount++;
				System.out.println(i);
			}
		}
		System.out.println(num+" has "+factCount+" factors");;
	}
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Please give a number");
	int userAnswer = scn.nextInt();
	factorFinder(userAnswer);
	
	
}

}

/*
 ******* Instructions*********** 
 Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3
 */