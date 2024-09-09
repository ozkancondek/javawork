/*
Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

    accountNumber should be non-null and non-empty.
    balance should be non-negative.
    Print an error message if the validation fails.

*/


// Define the Account class
public class Account {
    // Private instance variables
    private String accountNumber;
    private double balance;

    // Parameterized constructor with validation
    public Account(String accountNumber, double balance) {
        // Validate accountNumber
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }
        // Validate balance
        if (balance < 0) {
            // Print error message if balance is negative
            System.err.println("Error: Balance cannot be negative.");
            return;
        }
        // Initialize accountNumber with the provided parameter
        this.accountNumber = accountNumber;
        // Initialize balance with the provided parameter
        this.balance = balance;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Test with valid data
        Account account1 = new Account("12340009", 1000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", 400.00);

        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);
    }
