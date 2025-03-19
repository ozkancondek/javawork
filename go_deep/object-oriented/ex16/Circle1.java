package com.example.github.oo.ex16;

public class Circle1 extends Shape1 {
    // Private field to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle1(double radius) {
        this.radius = radius; // Set the radius field to the provided radius
    }


    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius; // Calculate the area using the formula π * radius^2
    }

    // Method to calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Calculate the perimeter using the formula 2 * π * radius
    }
}
