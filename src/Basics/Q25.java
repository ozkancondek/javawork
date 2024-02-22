package Basics;

import java.util.Timer;
import java.util.TimerTask;

public class Q25 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		int delay = 0; // delay for 0 ms
		int period = 2000; // repeat every 2000 ms (2 seconds)

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				// Your code to be executed repeatedly
				System.out.println("Hello, world!");
			}
		}, delay, period);
	}
}

/*
 *setInterval function  
 */
