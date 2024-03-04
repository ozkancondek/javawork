package Intermediate;

import java.util.ArrayList;

public class Q7 {
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

	public static ArrayList<Integer> assignNums(int limit) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= limit; i++) {

			arr.add(i);

		}
		return arr;
	}

	public static int primesInFactor(int num) {
		int starter = 1;
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				starter *= i;
			}

		}
		return starter;
	}

	public static boolean isNumDivisibleWithArr(int num, ArrayList<Integer> arr) {
		for (int i : arr) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

	public static int answer(int limit) {
		int lets = primesInFactor(limit);
		ArrayList<Integer> numArr = assignNums(limit);
		int c = 20;
		while (true) {
			if (isNumDivisibleWithArr(c, numArr)) {
				return c;
			}
			c++;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(answer(20));
	}

}

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
