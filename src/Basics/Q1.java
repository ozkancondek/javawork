package Basics;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give first number");
		int num1 = scn.nextInt();
 
		System.out.println("Give second number");
		int num2 = scn.nextInt();
 
		int result = num1*num2;
		System.out.println("Your result for "+num1+"x"+num2+"="+result);
		
	}

}


/*
 *******Instructions***********
Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */