/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods 
differently based on their specific behavior.

*/


// Animal.java
// Abstract class Animal

// Define abstract class Animal
abstract class Animal {
    // Declare abstract method eat
    public abstract void eat();
    // Declare abstract method sleep
    public abstract void sleep();
}



// Lion.java
// Subclass Lion

// Define class Lion that extends Animal
class Lion extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the lion eats
        System.out.println("Lion eats meat.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the lion sleeps
        System.out.println("Lion sleeps on grassland.");
    }
}


// Main.java
// Subclass Main

// Define public class Main
public class Main {
    // Define the main method
    public static void main(String[] args) {
        // Create a new Lion object
        Lion lion = new Lion();
        // Call the eat method on the Lion object
        lion.eat();
        // Call the sleep method on the Lion object
        lion.sleep();
        
    }
}
