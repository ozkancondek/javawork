package Intermediate;

import java.util.ArrayList;

public class Q5 {
	 public static long largestPrimeFactor(long number) {
	        long largestFactor = 1;
	        
	        // Check divisibility by 2
	        while (number % 2 == 0) {
	            largestFactor = 2;
	            number /= 2;
	        }
	        
	        // Check divisibility by odd numbers starting from 3
	        for (long i = 3; i <= Math.sqrt(number); i += 2) {
	            while (number % i == 0) {
	                largestFactor = i;
	                number /= i;
	            }
	        }
	        
	        // If the remaining number is greater than 2, it's also prime
	        if (number > 2) {
	            largestFactor = number;
	        }
	        
	        return largestFactor;
	    }

	    public static void main(String[] args) {
	        long number = 600851475143L;
	        System.out.println("Largest prime factor of " + number + " is: " + largestPrimeFactor(number));
	    }
}


/*INSTRUCTIONS
 * The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
 * */
