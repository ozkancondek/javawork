package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {
	public static ArrayList findTheLongestInArray(String[] dict) {
 
		ArrayList<String> longest = new ArrayList<String>();
		int longer = 0;
		for(String el:dict) {
			int length = el.length();
	 
			if(length > longer) {
				longer = length;
				longest.clear();
			}
			if(length == longer) {
				longest.add(el);
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		String[] dict = {"cat", "dog", "ressssd", "is", "am"};
		
		System.out.println(findTheLongestInArray(dict));
		
	}

}


/*
 ******* Instructions***********  
 *138- Write a Java program to find the longest words in a dictionary.
 */