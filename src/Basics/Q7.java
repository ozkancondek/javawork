package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q7 {
    public static ArrayList<Integer> dividerFinder(ArrayList<Integer> dividers, int range) {
        ArrayList<Integer> returnList = new ArrayList<>();
        for (int k = 1; k <= range; k++) {
            returnList.add(k);
        }
        
        Iterator<Integer> iterator = returnList.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            for (int j : dividers) {
                if (i % j != 0) {
                    iterator.remove(); // Remove element using iterator
                    break;
                }
            }
        }
        
        return returnList;
    }
	
	public static ArrayList<Integer> userDividers(int n){
		ArrayList<Integer> userDividersList = new ArrayList<>(n);
		Scanner scn = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Please give "+i+"th divider.......");
			int userDividerValue = scn.nextInt();
			userDividersList.add(userDividerValue);
			
		}
		return userDividersList;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many divider you wanna have?");
		int userDividerCount = scn.nextInt();
	
		System.out.println("What is the range?");
		int userRange = scn.nextInt();
		ArrayList<Integer> dividers = userDividers(userDividerCount);
		System.out.println(dividerFinder(dividers,userRange));
		
		
	}

}

/*
 ******* Instructions*********** Write a Java program to print numbers between 1 and
 * 100 divisible by 3, 5 and both.
 */