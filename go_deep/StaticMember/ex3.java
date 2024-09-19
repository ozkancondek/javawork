
/*
Static Block
Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000.
Print the value of 'initialValue' before and after creating an instance of "Initializer".*/

// Define the Initializer class
public class Initializer {
    // Declare a static variable initialValue
    static int initialValue;

    // Static block to initialize initialValue
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }

    // Main method to demonstrate the static block
    public static void main(String[] args) {
        // Print initialValue before creating an instance
        System.out.println("Before creating an instance: initialValue = " + Initializer.initialValue);

        // Create an instance of Initializer
        Initializer initializer = new Initializer();

        // Print initialValue after creating an instance
        System.out.println("After creating an instance: initialValue = " + Initializer.initialValue);
    }
}
