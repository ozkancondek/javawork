package Intermediate;

import java.util.ArrayList;

public class Q9 {
	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int nthPrime(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int c = 2;
		while (true) {
			if (isPrime(c)) {
				arr.add(c);
			}
			if (arr.size() == n) {
				break;
			}
			c++;
		}
		return arr.get(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}
}

//nth prime