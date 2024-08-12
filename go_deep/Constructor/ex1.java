//Write a Java program to create a class called "Cat" with instance variables name and age. 
//Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.


// Define the Cat class
public class Cat {
    // Private instance variables
    private String name;
    private int age;

    // Default constructor
    public Cat() {
        // Initialize name to "Unknown"
        this.name = "Unknown";
        // Initialize age to 0
        this.age = 0;
    }

    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();
        // Print the values of the instance variables
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's Age: " + myCat.age);
    }
}
