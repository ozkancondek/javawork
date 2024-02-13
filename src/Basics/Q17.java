package Basics;

 
import java.util.HashSet;
 

public class Q17 {

	public static boolean distinctChecker(String str) {
	    HashSet<Character> lettersHere = new HashSet<>();
	    for (char c : str.toCharArray()) {
	        lettersHere.add(c);
	    }
	    return str.length() == lettersHere.size();
	}
	public static void main(String[] args) {
		System.out.println(distinctChecker("xyyz"));
	}
}

/*
 ******* Instructions***********
 * 
 * 141. Write a Java program to check if a given string has all distinct
 * characters. Sample Output: Original String : xyyz String has all unique
 * characters: false
 */