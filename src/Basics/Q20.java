package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Q20 {
	public static String sentenceRverser(String sent) {
		ArrayList<String> sentenceArray = new ArrayList<String>();
		//split returns an array
		for (String word:sent.split(" ")) {
			sentenceArray.add(0,word);
		}
	     // Convert the ArrayList to a sentence
	     StringJoiner joiner = new StringJoiner(" ");
	     for (String word : sentenceArray) {
	         joiner.add(word);
	     }
	     String sentence = joiner.toString();
		return sentence;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("give your sentence");
		String userStn = scn.nextLine();
		System.out.println(sentenceRverser(userStn));
	}

}


/*
 ******* Instructions*********** 
 169. Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

Input a string: The quick brown fox jumps over the lazy dog
Result: dog lazy the over jumps fox brown quick The
 */