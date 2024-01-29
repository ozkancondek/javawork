package Basics;

import java.util.Scanner;

public class Q5 {

	public static void StringCounter(String text) {
		char[] ch = text.toCharArray();
		// Initialize counters for letters, spaces, numbers, and other characters
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;

		// Iterate through the character array to categorize characters
		for (int i = 0; i < text.length(); i++) {
			// Check if the character is a letter
			if (Character.isLetter(ch[i])) {
				letter++;
			}
			// Check if the character is a digit (number)
			else if (Character.isDigit(ch[i])) {
				num++;
			}
			// Check if the character is a space
			else if (Character.isSpaceChar(ch[i])) {
				space++;
			}
			// Character falls into the "other" category if none of the above conditions are
			// met
			else {
				other++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Now give me some input");
		String userInput = scan.nextLine();

		StringCounter("my age is 26 ``");

	}
}

/*
 ******* Instructions*********** 38. Write a Java program to count letters, spaces,
 * numbers and other characters in an input string. Expected Output
 * 
 * The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 letter: 23
 * space: 9 number: 10 other: 6
 */