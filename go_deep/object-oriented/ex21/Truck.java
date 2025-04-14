package com.example.github.oo.ex21;

public class Truck extends Vehicle{
    // Attribute for payload capacity of the truck
    private double payloadCapacity;
    public Truck(String make,
                 String model,
                 int year,
                 double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    // Override the displayDetails method to include payload capacity
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    // Getter method for payload capacity
    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    // Setter method for payload capacity
    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }

}
