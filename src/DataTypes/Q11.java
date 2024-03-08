package Intermediate;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {
	public static boolean isPythagorean(int num1, int num2, int num3) {
		return Math.pow(num3, 2) == Math.pow(num2, 2) + Math.pow(num1, 2);

	}

	public static ArrayList startCount(int num) {
		ArrayList<int[]> arr = new ArrayList<>();
		for (int i = 3; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					if (isPythagorean(k, j, i)) {

						arr.add(new int[] { k, j, i });

					}
				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int c = 0;
		ArrayList a = startCount(1000);
		while (true) {
			if (Arrays.stream((int[]) a.get(c)).sum() == 1000) {
				System.out.println(Arrays.toString((int[]) a.get(c)));
				break;
			}
			c++;
		}
		System.out.println(200 * 375 * 425);

	}
}

//PE:9
