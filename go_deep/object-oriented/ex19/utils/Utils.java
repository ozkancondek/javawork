package com.example.github.oo.ex19.utils;

import java.util.Random;

public class Utils {
    public static int generateConfirmationNumber() {
        // Create a Random object
        Random rand = new Random();
        // Generate and return a random 6-digit number
        return rand.nextInt(900000) + 100000;
    }

    public static void giveBreak(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
