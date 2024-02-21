package Basics;

import java.util.Scanner;

public class Q23 {

	public static String err1 = "A password must have at least eight characters.";
	public static String err2 = "A password consists of only letters and digits. ";
	public static String err3 = "A password must contain at least two digits ";
	public static String successOutput = "Your passwort is valid";

	public static String passCheck(String pass) {
		if (pass.length() < 8) {
			return err1;
		} else if (!letterDigitChecker(pass)) {
			return err2;
		} else if (countDigit(pass) < 2) {
			return err3;
		}

		return successOutput;
	}

	// Check if string consist of only letter and numbers
	public static boolean letterDigitChecker(String st) {
		return st.matches("[a-zA-Z0-9]*");
	}

	// count digits in str
	public static int countDigit(String st) {
		int count = 0;
		for (int i = 0; i <= st.length() - 1; i++) {
			if (Character.isDigit(st.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	//Function test
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give your passwort...");
		String userInput = scn.nextLine();
		System.out.println(passCheck(userInput));
		
	}

}

/*
 ******* Instructions*********** 11. Write a Java method to check whether a string is
 * a valid password. Password rules: A password must have at least ten
 * characters. A password consists of only letters and digits. A password must
 * contain at least two digits.
 */