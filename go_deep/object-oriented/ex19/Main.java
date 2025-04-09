package com.example.github.oo.ex19;

import com.example.github.oo.ex19.utils.Utils;
import jdk.jshell.execution.Util;

import java.util.Objects;
import java.util.Scanner;

// Main.java
// Define the Main class
public class Main {
    // Main method, the entry point of the application
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("how should I call you?");
//        String name = scanner.nextLine();
//
//        System.out.println("Welcome to travel App " + name);
//        Utils.giveBreak(3);
//        System.out.println("You can book a reservation, search for current reservations or cancel it");
//        Utils.giveBreak(3);
        System.out.println("We can start if you want.");
        System.out.println("If you want to start please approve with 1");

        String  approveToStart = scanner.nextLine();

        if(Objects.equals(approveToStart, "1")){
            System.out.println("okay then, lets start!");
            Utils.giveBreak(1);
            System.out.println("Please choose what do you want to do exactly");
            System.out.println("1 - Book a Flight");
            System.out.println("2 - Book a Hotel");
            System.out.println("3 - Check your reservation");
            System.out.println("4 - Cancel your reservation");

            while(true){
                String transaction = scanner.nextLine();

                if (Objects.equals(transaction, "1")
                    || Objects.equals(transaction, "2")
                    || Objects.equals(transaction, "3")
                    || Objects.equals(transaction, "4")){

                    System.out.println("perfect. lets continue!");
                    break ;

                }else if (Objects.equals(transaction, "0")) {

                    System.out.println("Himm okay. Anytime you want. byeeeee!");
                    break;

                }else {

                    System.out.println("Himm. Looks like you choosed something not relevant. try again. Or you can cancel the process anytime you want with 0");
                    Utils.giveBreak(1);
                    System.out.println("Please choose what do you want to do exactly");
                    System.out.println("1 - Book a Flight");
                    System.out.println("2 - Book a Hotel");
                    System.out.println("3 - Check your reservation");
                    System.out.println("4 - Cancel your reservation");
                }
            }






        }else{
            System.out.println("Himm okay. Anytime you want. byeeeee!");
        }




//        TravelApp app = new TravelApp();
//
//        app.searchFlights("New York", "London", "2022-09-01", 1);
//
//        app.searchHotels("London", "2022-08-01", "2022-09-05", 2);
//
//        app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
//
//        app.bookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00);
//
//        app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);
//
//        app.cancelReservation(12345670);
    }
}
