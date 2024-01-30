package Basics;

import java.util.Scanner;

public class Q6 {
	public static boolean numChecker(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static String evenChecker(String num) {

		return Integer.parseInt(num) % 2 == 0 ? "Number is even" : "Number is odd";

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give a number........");
		String userNum = scn.nextLine();
		while(true) {
			if(numChecker(userNum)){
				System.out.println(evenChecker(userNum));
				break;
			}
			System.out.println("Thats not a number.Please give a number........");
			userNum = scn.nextLine();
		}

 

	}
}

/*
 ******* Instructions*********** 49-Write a Java program to accept a number and check
 * whether the number is even or not. Prints 1 if the number is even or 0 if
 * odd. Sample Output:
 * 
 * Input a number: 20 1
 */