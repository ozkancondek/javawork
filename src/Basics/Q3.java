package Basics;

import java.util.Iterator;
import java.util.Scanner;

public class Q3 {
	public static void repeatChar (String myChar,int size) {
		System.out.print(new String(new char[size]).replace("\0", myChar));  
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give size");
		//int size = scn.nextInt();
		System.out.println("Your flag is here...........");
		int starSize = 5;
		for(int i = 1; i<=starSize;i++) {
			repeatChar(" *", starSize);
			System.out.print(" ");
			repeatChar("=", starSize*5);
			System.out.println();
		}
		for (int i = 1; i <= starSize; i++) {
			repeatChar("=", starSize*6);
			System.out.print("=");
			System.out.println();
			
		}

}
}

/*
 *******Instructions***********
Write a Java program to print an American flag on the screen.
Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
 */