package Intermediate;

import java.math.BigInteger;

public class Q16 {

	public static int digitSummer(BigInteger num) {
		String numString = num.toString();
		int sum = 0;
		for (int i = 0; i < numString.length(); i++) {
			sum += Character.getNumericValue(numString.charAt(i));
		}
		;
		return sum;
	}

	public static void main(String[] args) {
		BigInteger powerOf2 = BigInteger.valueOf(2).pow(1000);
		System.out.println(digitSummer(powerOf2));
	}

}

//PE:16