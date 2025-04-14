package com.example.github.oo.ex21;

public class Car extends Vehicle{
    // Attribute for trunk size of the car
    private double trunkSize;
    public Car(String make,
               String model,
               int year,
               double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }
    // Override the displayDetails method to include trunk size
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
    // Getter method for trunk size
    public double getTrunkSize() {
        return trunkSize;
    }

    // Setter method for trunk size
    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }
}
