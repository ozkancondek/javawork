package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.err.println("pöease give us a number");
        Scanner scn = new Scanner(System.in);
        String userNum = scn.nextLine();
        while (true) {
            try {
                int userNumToInt = Integer.parseInt(userNum);
                System.err.println("Square is " + userNumToInt * userNumToInt);
                break;
            } catch (Exception e) {
                System.err.println("u didnt give a number");
                System.err.println(e.getMessage());
                userNum = scn.nextLine();
            } finally {
                System.err.println("This message in any case");
            }

        }
    }
}
