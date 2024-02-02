package Basics;

import java.util.ArrayList;
public class Q10 {
	
	 static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	  
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
	        return true; 
	    }
	 static int sumArrayList(ArrayList<Integer> arr) {
		 int sum = 0;
		 for(Integer a:arr) {
			 sum+=a;
		 }
		 return sum;
	 }
	 static  int sumFirstNPrimes(int firstN) {
		 ArrayList<Integer> primes = new ArrayList<Integer>();
		 Integer count = 2;
		 while(primes.size()<firstN) {
			 if(isPrime(count)) {
				 primes.add(count);
						 
			 }
			 count++;
		 }
		return sumArrayList(primes);
	 }
 
	public static void main(String[] args) {
		System.out.println(sumFirstNPrimes(100));
		 
	}
 

}

/*
 ******* Instructions*********** 
 66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:
 */