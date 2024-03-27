package Intermediate;

public class Q13 {
	// Method to calculate triangle numbers
	public static long calculateTriangleNumber(int n) {
		return n * (n + 1) / 2;
	}

	// Method to calculate the number of divisors for a given number
	public static int numberOfDivisors(long number) {
		int count = 0;
		for (long i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				count++;
				if (i != number / i) {
					count++;
				}
			}
		}
		return count;
	}

	// Method to find the first triangle number with over 500 divisors
	public static long findTriangleNumberWithOverDivisors(int numberOfDivisors) {
		int n = 1;
		while (true) {
			long triangleNumber = calculateTriangleNumber(n);
			int divisors = numberOfDivisors(triangleNumber);
			if (divisors > numberOfDivisors) {
				return triangleNumber;
			}
			n++;
		}
	}

	public static void main(String[] args) {
		int numberOfDivisors = 500;
		long triangleNumber = findTriangleNumberWithOverDivisors(numberOfDivisors);
		System.out
				.println("The first triangle number with over " + numberOfDivisors + " divisors is: " + triangleNumber);
	}

}
