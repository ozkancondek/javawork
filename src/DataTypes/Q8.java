package Intermediate;

public class Q8 {
	public static int firstNSum(int n) {

		return (int) Math.pow(n * (n + 1) / 2, 2);
	}

	public static int squatreSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(firstNSum(100) - squatreSum(100));
	}
}

//PE:6 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.