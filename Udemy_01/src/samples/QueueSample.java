package samples;

import java.util.PriorityQueue;

public class QueueSample {
		public static void main(String[] args) {
			PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
			
			myQueue.add(50);
			myQueue.add(5);
			myQueue.add(1);
			myQueue.add(16);
			myQueue.add(24);
			myQueue.add(0);
			
			System.out.println("First array = "+myQueue);
			myQueue.remove();
			System.out.println("after remove first = "+myQueue);
			
			System.out.println("head of the quesue is = "+myQueue.peek());
			myQueue.poll();
			System.out.println("After poll = "+myQueue);
			
		}
}

/**
 * ??????  why the order of the queue is always different ???????
 **/
