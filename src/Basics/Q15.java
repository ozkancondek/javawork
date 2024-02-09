package Basics;

import java.awt.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Q15 {
		//Built ins
	   public static LinkedList<Integer> dublicateRemover(LinkedList<Integer> arr) {
	        Collections.sort(arr);
	        Set<Integer> uniqueSet = new HashSet<>(arr);
	        return new LinkedList<>(uniqueSet);
	    }

	   public static boolean checkIfInList(int element, LinkedList<Integer> list) {
		   return list.contains(element) ? true : false;
	   }
	   
	   //manual method
	   public static LinkedList<Integer> dublicateRemoverManual(LinkedList<Integer> arr) {
		   		
		   LinkedList<Integer> res = new LinkedList<Integer>();
		   Collections.sort(arr);
		   for (int el:arr) {
			   if(!checkIfInList(el,res)) {
				   res.add(el);
			   }
		   }
		   return res;
	   }
	   
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(5);
		linkedList.add(3);
		linkedList.add(7);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(1);
		linkedList.add(1);
		System.out.println(linkedList);
		System.out.println(dublicateRemoverManual(linkedList));
	}

}

/*
 ******* Instructions*********** 135. Write a Java program to remove duplicates from a
 * sorted linked list. Original List with duplicate elements:
 * 12->12->13->14->15->15->16->17->17 After removing duplicates from the said
 * list: 12->13->14->15->16->17
 */