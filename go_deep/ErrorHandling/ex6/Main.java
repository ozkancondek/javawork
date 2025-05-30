package com.example.github.errorHandling.ex6;

import java.util.*;

public class Main {
        public static void main(String[] args) {
                try {
                        List < Integer > numbers = readNumbersFromUser();
                        checkDuplicates(numbers);
                        System.out.println("No duplicate numbers!");
                } catch (Duplicate_Number_Exception e) {
                        System.out.println("Error: " + e.getMessage());
                }
        }

        //read numbers from the user
        public static List < Integer > readNumbersFromUser() {
                List < Integer > numbers = new ArrayList < > ();
                Scanner scanner = new Scanner(System.in);

                System.out.print("How many numbers do you want to input? ");
                int count = scanner.nextInt();

                System.out.println("Input the integers:");
                for (int i = 0; i < count; i++) {
                        int num = scanner.nextInt();
                        numbers.add(num);
                }

                scanner.close();
                return numbers;
        }

        //check numbers if they dublicated
        public static void checkDuplicates(List < Integer > numbers) throws Duplicate_Number_Exception {
                Set < Integer > uniqueNumbers = new HashSet < > ();

                for (int num: numbers) {
                        if (uniqueNumbers.contains(num)) {
                                throw new Duplicate_Number_Exception("Duplicate number found: " + num);
                        }
                        uniqueNumbers.add(num);
                }
        }
}

//define own error class
class Duplicate_Number_Exception extends Exception {
        public Duplicate_Number_Exception(String message) {
                super(message);
        }
}

