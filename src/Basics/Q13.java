package Basics;

public class Q13 {
	public static boolean isPolindrome(int num) {
		
		String numToStr = Integer.toString(num);
		new Q4();
		String reversed = Q4.reverseString(numToStr);
		
	   return reversed.equals(numToStr);
	}

	public static void main(String[] args) {
		 System.out.println(isPolindrome(251));
	}
}

/*
 ******* Instructions*********** 115. Write a Java program to check if a positive
 * number is a palindrome or not. Input a positive integer: 151 Is 151 is a
 * palindrome number? true
 */