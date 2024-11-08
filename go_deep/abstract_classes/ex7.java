/*
Write a Java program to create an abstract
class Vehicle with abstract methods startEngine() and stopEngine().
Create subclasses Car and Motorcycle that extend 
the Vehicle class and implement the respective methods
to start and stop the engines for each vehicle type.
*/


// Vehicle.java
// Abstract class Vehicle
abstract class Vehicle {
  // Abstract method to start the engine
  public abstract void startEngine();

  // Abstract method to stop the engine
  public abstract void stopEngine();
} 



// Car.java
// Class Car extending Vehicle
class Car extends Vehicle {
  // Overriding the startEngine method
  @Override
  public void startEngine() {
    // Printing message to indicate engine start
    System.out.println("Car: Starting the engine...");
  }

  // Overriding the stopEngine method
  @Override
  public void stopEngine() {
    // Printing message to indicate engine stop
    System.out.println("Car: Stopping the engine...");
  }
} 

// Motorcycle.java
// Class Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
  // Overriding the startEngine method
  @Override
  public void startEngine() {
    // Printing message to indicate engine start
    System.out.println("Motorcycle: Starting the engine...");
  }

  // Overriding the stopEngine method
  @Override
  public void stopEngine() {
    // Printing message to indicate engine stop
    System.out.println("Motorcycle: Stopping the engine...");
  }
} 

//Main.java
public class Main {
  // The main method, the entry point of the program
  public static void main(String[] args) {
    // Create an instance of Car as a Vehicle
    Vehicle car = new Car();
    // Create an instance of Motorcycle as a Vehicle
    Vehicle motorcycle = new Motorcycle();

    // Call the startEngine method on the car object
    car.startEngine();
    // Call the stopEngine method on the car object
    car.stopEngine();

    // Call the startEngine method on the motorcycle object
    motorcycle.startEngine();
    // Call the stopEngine method on the motorcycle object
    motorcycle.stopEngine();
  }
} 
