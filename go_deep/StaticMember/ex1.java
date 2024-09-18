/*
Static Variables:
Write a Java program to create a class called "Counter" with a static variable count.
Implement a constructor that increments count every time an object is created. 
Print the value of count after creating several objects.
*/

// Define the Counter class
public class Counter {
    // Static variable to keep track of the count of instances
    private static int count = 0;

    // Constructor increments the static variable count
    public Counter() {
        count++;
    //see count in each call
    System.out.println("Count: " + count);
    }

    // Static method to get the value of count
    public static int getCount() {
        return count;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Create several Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the value of count
        System.out.println("Final Count: " + Counter.getCount());
    }
}
