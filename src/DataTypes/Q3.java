package Intermediate;

public class Q3 {
	public static int multiFinderunderLimit(int limit ) {
		int sum  = 0;
		
	for(int i = 1 ; i < limit ; i++) {
		if (i%3 == 0 || i %5 == 0) {
			sum+=i;
		 
		}
	}
	return sum;
		
	}
	
	public static void main(String[] args) {
 
		System.out.println(multiFinderunderLimit(1000));
	}

}

/*
 * ******* Instructions***********
 * Projecct  EULER q1
 */