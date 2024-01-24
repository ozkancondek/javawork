package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Intro {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        boolean isAdded = myQueue.offer(5);
        int myFirst = myQueue.peek();
        // take first and delete it
        int takeFirst = myQueue.poll();

    }
}
