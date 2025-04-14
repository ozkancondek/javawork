package com.example.github.oo.ex21;

public class Main {

    public static void giveMeCar(String make,
                                 String model,
                                 int year,
                                 double trunkSize){
        Car car = new Car( make,  model,  year, trunkSize);
        car.displayDetails(); // Display car details

    }

    public static void main(String[]args){
        // Create a Car object
        giveMeCar("Suzuki", "Swift", 2015, 15.1);


        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2016, 3.5);
        truck.displayDetails(); // Display truck details
    }
}
