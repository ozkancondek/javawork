package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class Q18 {

	public static boolean perChecker(String mStr, String cStr) {
		ArrayList<Character> mStrArr = new ArrayList<Character>();
		ArrayList<Character> cStrArr = new ArrayList<Character>();

		if (mStr.length() != cStr.length()) {
			return false;
		}

		for (int i = 0; i <= mStr.length() - 1; i++) {
			mStrArr.add(mStr.toCharArray()[i]);
			cStrArr.add(mStr.toCharArray()[i]);
		}

		return cStrArr.equals(mStrArr);

	}

	public static void main(String[] args) {
		System.out.println(perChecker("ozkan", "nakz"));
	}

}

/*
 ******* Instructions*********** 149. Write a Java program to check if a given string
 * is a permutation of another given string. Sample Output: Original strings:
 * xxyz yxzx true
 */