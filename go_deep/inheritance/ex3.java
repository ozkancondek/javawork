/*
Local Class:
Write a Java program to create a class called Car with a method startEngine().
Inside this method, define a local class Engine that has a method run(). 
The run() method should print "Engine is running". Instantiate and call the run() method
from within the startEngine() method.

Sample Solution:
*/

// Class Car
public class Car {
    
    // Method startEngine
    public void startEngine() {
        // Local class Engine inside startEngine method
        class Engine {
            // Method run in local class Engine
            public void run() {
                // Print statement indicating the engine is running
                System.out.println("Engine is running");
            }
        }
        
        // Creating an instance of the local class Engine
        Engine engine = new Engine();
        // Calling the run method of the local class Engine
        engine.run();
    }
    
    // Main method to demonstrate the local class
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car();
        // Calling the startEngine method
        myCar.startEngine();
    }
}
