package Intermediate;

public class Q18 {

	public static int sumOfDivisors(int n) {
		int sum = 1; // Start with 1 as 1 is always a divisor

		// Iterate up to the square root of n
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				// If i divides n evenly, add i to the sum
				sum += i;

				// If i is not the square root of n, also add n/i to the sum
				if (i != n / i) {
					sum += n / i;
				}
			}
		}

		return sum;
	}

	public static int sumOfAmicableNumbers(int limit) {
		int sum = 0;

		for (int i = 2; i < limit; i++) {
			int sumDivisors = sumOfDivisors(i);
			if (i != sumDivisors && sumOfDivisors(sumDivisors) == i) {
				sum += i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int limit = 10000;
		int result = sumOfAmicableNumbers(limit);
		System.out.println("Sum of amicable numbers under " + limit + " is: " + result);
	}
}

//PE:21
