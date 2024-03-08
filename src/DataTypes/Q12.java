package Intermediate;

public class Q12 {
	public static long sumOfPrimes(int limit) {
		boolean[] isPrime = new boolean[limit];
		long sum = 0;

		// Initialize all numbers as prime
		for (int i = 2; i < limit; i++) {
			isPrime[i] = true;
		}

		// Mark multiples of primes as non-prime
		for (int p = 2; p * p < limit; p++) {
			if (isPrime[p]) { // true
				for (int i = p * p; i < limit; i += p) {

					isPrime[i] = false; // mark multiplies as false
				}
			}
		}

		// Sum up all prime numbers
		for (int i = 2; i < limit; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int limit = 2000000;
		long sum = sumOfPrimes(limit);
		System.out.println("Sum of all prime numbers below " + limit + " is: " + sum);

	}
}

//PE:10 Summation of primes
