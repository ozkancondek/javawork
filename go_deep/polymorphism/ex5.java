/*
Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.

*/

// Sports.java
// Base class Sports

// Define the Sports class
class Sports {

    // Public method play that prints a message to the console
    public void play() {
        // Print "Playing a sport..." followed by a new line
        System.out.println("Playing a sport...\n");
    }
} 

// Football.java
// Subclass Football

// Define the Football class as a subclass of Sports
class Football extends Sports {

    // Override the play method from the Sports class
    @Override
    public void play() {
        // Print "Playing football..." to the console
        System.out.println("Playing football...");
    }
} 

// Basketball.java
// Subclass Basketball
class Basketball extends Sports {  // Declare a subclass Basketball that extends the Sports class
    @Override  // Override the play method from the Sports class
    public void play() {  // Define the play method
        System.out.println("Playing basketball...");  // Print "Playing basketball..." to the console
    }
} 

// Main.java
// Main class
public class Main {  // Declare the Main class
    public static void main(String[] args) {  // Define the main method
        Sports sports = new Sports();  // Create an instance of the Sports class
        Football football = new Football();  // Create an instance of the Football class
        Basketball basketball = new Basketball();  // Create an instance of the Basketball class
      
        sports.play();  // Call the play method on the Sports instance
        football.play();  // Call the play method on the Football instance
        basketball.play();  // Call the play method on the Basketball instance

    }
} 
