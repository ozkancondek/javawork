package Intermediate;

public class Q6 {

	public static boolean isPolindrome(int num) {
		String snum = Integer.toString(num);
		String a = new StringBuilder(snum).reverse().toString();
		if (snum.equals(a)) {
			return true;
		}
		return false;
	}

	public static void pProduct(int digit) {
		int largestPalindrome = 0;
		int factor1 = 0;
		int factor2 = 0;

		for (int i = digit; i > 1; i--) {
			for (int j = digit; j > digit / 2; j--) {
				int product = i * j;
				if (isPolindrome(product) && product > largestPalindrome) {
					largestPalindrome = product;
					factor1 = i;
					factor2 = j;
					break; // Found the largest palindrome for this value of i, exit the loop
				}
			}
		}

		System.out.println("Largest palindrome product: " + largestPalindrome);
		System.out.println("Factors: " + factor1 + " * " + factor2);
	}

	public static void main(String[] args) {
		pProduct(999);

	}

}

/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2 -digit numbers is 9009 = 91X99 .
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
