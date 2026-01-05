package com.example.github.algorithms.ex2;

import java.util.Scanner;

public class Main {

    public static void currencyConverter (){
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Input the amount to convert
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Input the source currency (currency to convert from)
        System.out.print("Enter the currency to convert from (USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        // Input the target currency (currency to convert to)
        System.out.print("Enter the currency to convert to (USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        // Variable to store the conversion rate
        double conversionRate = 0;

        // Perform currency conversion using if-else statements
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            conversionRate = 0.92; // Example conversion rate from USD to EUR
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            conversionRate = 82.75; // Example conversion rate from USD to INR
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            conversionRate = 1.08; // Example conversion rate from EUR to USD
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            conversionRate = 89.65; // Example conversion rate from EUR to INR
        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            conversionRate = 0.012; // Example conversion rate from INR to USD
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            conversionRate = 0.011; // Example conversion rate from INR to EUR
        } else {
            // Handle invalid currency combinations
            System.out.println("Invalid currency combination.");
            return;
        }

        // Calculate the converted amount
        double convertedAmount = amount * conversionRate;

        // Output the converted amount
        System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
    }
    public static void main(String[] args) {
        currencyConverter();
    }
}
