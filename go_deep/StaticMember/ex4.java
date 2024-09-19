/*
Static Final Variables
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. 
Create a method to calculate the area of a circle given its radius, 
using the 'PI' constant. Demonstrate the method in the main method.
*/


// Define the Constants class
public class Constants {
    // Declare a static final variable PI
    public static final double PI = 3.14159;

    // Method to calculate the area of a circle given its radius
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Main method to demonstrate the calculateArea method
    public static void main(String[] args) {
        // Define a radius
        double radius = 5.0;

        // Calculate the area of the circle
        double area = calculateArea(radius);

        // Print the radius and area
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}
