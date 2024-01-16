package algorithms;

import java.util.Scanner;

public class facFinder {
    public static void main(String[] args) {
        facFinder(6);
    }

    public static int facFinder(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a number");
        int userInput = scan.nextInt();

        userInput = userInput > 0 ? userInput : -1 * userInput;

        int starter = 1;
        while (userInput != 1) {
            starter *= userInput;
            userInput--;
        }
        return starter;
    }
}
