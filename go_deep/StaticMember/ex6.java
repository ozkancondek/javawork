/*
Static Method with Static Variable
Write a Java program to create a class called "IDGenerator" 
with a static variable 'nextID' and a static method "generateID()" 
that returns the next ID and increments 'nextID'. 
Demonstrate the usage of generateID in the main method.
*/

// Define the IDGenerator class
public class IDGenerator {
    // Declare a static variable nextID
    private static int nextID = 1;

    // Define a static method generateID to return the next ID and increment nextID
    public static int generateID() {
        return nextID++;
    }

    // Main method to demonstrate the usage of generateID
    public static void main(String[] args) {
        // Generate and print IDs
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
    }
}
