package getInput;

import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please give a number");

        int userNum = scan.nextInt();

        System.out.println("your number is " + evenChecker(userNum));
    }

    public static String evenChecker(int num) {
        return num % 2 == 0 ? "even" : "odd";
    }
}
