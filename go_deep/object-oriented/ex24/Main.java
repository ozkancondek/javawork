package com.example.github.oo.ex24;

// Main class to test the ElectronicsProduct and WashingMachine classes
public class Main {
    public static void main(String[] args) {
        // Create an ElectronicsProduct object
        ElectronicsProduct product = new ElectronicsProduct("WM123", "Washing Machine", 1.00);
        // Apply a discount and display the final price
        product.applyDiscount(10);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price after discount: $" + product.getFinalPrice());
        System.out.println();

        // Create a WashingMachine object
        WashingMachine washingMachine = new WashingMachine("W456", "Front Load Washing Machine", 800.00, 24);
        // Apply a discount and display the final price
        washingMachine.applyDiscount(15);
        System.out.println("Product ID: " + washingMachine.getProductId());
        System.out.println("Name: " + washingMachine.getName());
        System.out.println("Price after discount: $" + washingMachine.getFinalPrice());
        // Display the warranty period
        System.out.println("Warranty period: " + washingMachine.getWarrantyPeriod() + " months");

        // Extend the warranty period and display the new warranty period
        washingMachine.extendWarranty(12);
        System.out.println("Warranty period after extension: " + washingMachine.getWarrantyPeriod() + " months");
    }
}
