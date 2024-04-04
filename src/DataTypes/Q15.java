package Intermediate;

public class Q15 {
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int chainLength(int num) {
		int count = 1;
		while (num != 1) {
			if (isEven(num)) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			count++;

		}
		return count;
	}

	public static int longestChain(int limit) {
		int size = 0, max = 1, j = 0;
		for (int i = 500000; i < limit; i++) {
			size = chainLength(i);
			if (size > max) {
				max = size;
				j = i;
			}
		}
		return j;
	}

////
	public static int get14() {
		int max = 1;
		int ans = 1;
		int[] t_cache = new int[1000000];

		for (int i = 2; i < 1000000; i++) {
			long n = i;
			int t = 0;
			do {
				++t;
				if ((n & 1) == 0) {
					n >>= 1;
					if (n < i) {
						t += t_cache[(int) n];
						break;
					}
				} else {
					n = 3 * n + 1;
				}
			} while (true);
			t_cache[i] = t;
			if (t > max) {
				max = t;
				ans = i;
			}
		}
		return ans;
	}

	////
	public static void main(String[] args) {
		System.out.println(get14());

	}

}

//PE:14
