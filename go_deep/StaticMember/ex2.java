/*
Static Methods:
Write a Java program to create a class called "MathUtility" with a static 
method add that takes two integers and returns their sum.
Demonstrate the usage of this
static method in the main method without creating an instance of "MathUtility".*/

 
public class MathUtility {
    // Static method add that takes two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }


    // Main method to demonstrate the usage of the static method
    public static void main(String[] args) {
    
   //option 1
    MathUtility sum = new MathUtility.add(10,9);
    
    //option 2
 
    int sum =  MathUtility.add(10,9);

        // Print the value of count
        System.out.println(sum);
    }
}
