package Arrays;

import java.util.ArrayList;

public class Q4 {
	public static  int  fSerie(int limit) {
		ArrayList<Integer> starter = new ArrayList<Integer>();
		int evenC = 2;
		starter.add(1);
		starter.add(2);
		 
		while(starter.get(starter.size()-1) < limit) {
			 int last = starter.get(starter.size()-1) +starter.get(starter.size()-2);
			if(last %2 == 0) {
				evenC+=last;
			}
		
		 starter.add(last);
 
			
		}
		if (starter.get(starter.size()-1) > limit) {
			starter.remove(starter.size()-1);
		 
		}
		return evenC;
	 
	}
 public static void main(String[] args) {
 
	 System.out.println(fSerie(4000000));
}
}
/*Instructons
 * 
 */
