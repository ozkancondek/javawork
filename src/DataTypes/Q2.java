package Intermediate;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Q2 {
	// create random number between min and max
	public static int randomCreator(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);

	}

	// take number from user
	public static int numTakerFromUser(String msg) {
		System.out.println(msg);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	// write message with time delay
	public static void messageWriter(String msg, int time) {
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {

				System.out.println(msg);

			}
		}, time * 1000);
	}

	public static void guessFinder() {

		int userMin = numTakerFromUser("Give min value for guess first");
		int userMax = numTakerFromUser("Give max value for guess now");
		int userGuessCount = numTakerFromUser("And how many guess you wants");
		int answer = randomCreator(userMin, userMax);
		int userCounter = 1;
		int userguess = numTakerFromUser("Please make a guess between " + userMin + " and " + userMax);
		while (userguess != answer) {
			userguess = numTakerFromUser("You are wrong!!! Please make a new guess");
			userCounter++;

			if (userCounter == userGuessCount) {
				System.out.println("You are out");
				break;
			}

		}
		if (userguess == answer) {
			System.out.println("Congrats!!! The answer is " + answer);
		}

	}

	public static void main(String[] args) {
			messageWriter("Welcome to number guessing game!!", 1);
			messageWriter("You will make some guesses now and try to know number in memory", 2);
			messageWriter("Please give spesific min and max limit which is the number in memory will be choose from", 3);
			messageWriter("Then give how many guess you wanna make. After this step follow the instructions", 4);
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	guessFinder();
			            }
			        }, 
			        5000 
			);
		
	}

}

/*
 * ******* Instructions***********
 * 
 */