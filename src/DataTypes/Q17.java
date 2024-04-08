package Intermediate;

import java.math.BigInteger;

public class Q17 {
	public static BigInteger multNum(int limit) {
		BigInteger res = BigInteger.ONE;
		for (int i = 1; i <= limit; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println(Q16.digitSummer(multNum(100)));

	}

}

//PE:20
