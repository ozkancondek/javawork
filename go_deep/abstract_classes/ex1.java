/*
Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class and implement the sound()
method to make a specific sound for each animal.
*/

// Animal.java

// Define an abstract class named Animal
abstract class Animal {
    // Declare an abstract method named sound
    public abstract void sound();
}


// Lion.java

// Define a subclass named Lion that extends Animal
class Lion extends Animal {
    // Override the abstract method sound from the Animal class
    @Override
    public void sound() {
        // Print "Lion roars!" to the console
        System.out.println("Lion roars!");
    }
}


// Tiger.java

// Define a subclass named Tiger that extends Animal
class Tiger extends Animal {
    // Override the abstract method sound from the Animal class
    @Override
    public void sound() {
        // Print "Tiger growls!" to the console
        System.out.println("Tiger growls!");
    }
} 


// Main.java

// Define the Main class
public class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Lion and assign it to an Animal reference
        Animal lion = new Lion();
        // Call the sound method on the Lion instance
        lion.sound(); // Output: Lion roars!

        // Create an instance of Tiger and assign it to an Animal reference
        Animal tiger = new Tiger();
        // Call the sound method on the Tiger instance
        tiger.sound(); // Output: Tiger growls!
    }
}
