package Basics;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give radius");
		double radius = scn.nextDouble();
		double pi = Math.PI;
		double perimeter = 2*pi*radius;
		double area = 2*pi*radius*radius;
		String output = String.format("perimeter = %s. \narea= %s", perimeter, area);
		System.out.println(output);
	}

}


/*
 *******Instructions***********
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */