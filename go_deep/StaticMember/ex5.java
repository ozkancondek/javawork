/*
Static Block for Initialization
Write a Java program to create a class called Configuration 
with a static block that initializes a static variable
'configValue' from a configuration file (simulated with a default value). 
Print the value of 'configValue' in the main method.
*/

// Define the Configuration class
public class Configuration {
    // Declare a static variable configValue
    public static String configValue;

    // Static block to initialize configValue
    static {
        // Simulating reading from a configuration file by assigning a default value
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }

    // Main method to print the value of configValue
    public static void main(String[] args) {
        // Print the value of configValue
        System.out.println("Config Value: " + configValue);
    }
}
