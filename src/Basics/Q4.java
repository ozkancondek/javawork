package Basics;

public class Q4 {
	public static String reverseString(String text) {
		String reversed = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reversed += text.charAt(i);
		}
		return reversed;
	}

	public static void main(String[] args) {

		Object myString = reverseString("string will be reversed");
		System.out.println(myString);
	}
}

/*
 ******* Instructions*********** Write a Java program to reverse a string. Input Data:
 * Input a string: The quick brown fox Expected Output
 * 
 * Reverse string: xof nworb kciuq ehT
 */