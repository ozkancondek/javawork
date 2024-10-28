/*
Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
*/


// Animal.java
// Parent class Animal

// Define the Animal class
public class Animal {
    // Method to print a message indicating the animal moves
    public void move() {
        System.out.println("Animal moves");
    }
} 


// Cheetah.java
// Child class Cheetah

// Define the Cheetah class, inheriting from Animal
public class Cheetah extends Animal {
    // Override the move method to print a cheetah-specific message
    @Override
    public void move() {
        System.out.println("This cheetah is running!");
    }
}


// Main.java
// Main class

// Define the Main class
public class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        // Call the move method on the Animal instance
        animal.move();
        
        // Create an instance of Cheetah
        Cheetah cheetah = new Cheetah();
        // Call the move method on the Cheetah instance
        cheetah.move();
    }
}
