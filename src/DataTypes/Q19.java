package Intermediate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Q19 {
	public static int digitFinder(int num) {
		return String.valueOf(num).length();
	}

	public static int nthFibonacci(int digit) {
		List<Integer> fSeries = new ArrayList<Integer>();
		fSeries.add(1);
		fSeries.add(1);
		fSeries.add(2);
		while (true) {

			fSeries.add(fSeries.get(fSeries.size() - 1) + fSeries.get(fSeries.size() - 2));
			if (digitFinder(fSeries.get(fSeries.size() - 1)) == 100) {
				return fSeries.get(fSeries.size() - 1);
			}
		}

	}

	public static void main(String[] args) {
		int i = 0;
		int cnt = 2;
		BigInteger limit = (new BigInteger("10")).pow(999);
		BigInteger[] fib = new BigInteger[3];

		fib[0] = BigInteger.ONE;
		fib[2] = BigInteger.ONE;

		while ((fib[i]).compareTo(limit) < 0) {
			i = (i + 1) % 3;
			cnt++;
			fib[i] = fib[(i + 1) % 3].add(fib[(i + 2) % 3]);
		}
		System.out.printf("Fibonacci %d has 1000 digits\n", cnt);
	}
}

//PE25
