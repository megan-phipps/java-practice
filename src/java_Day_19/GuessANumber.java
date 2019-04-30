package java_Day_19;

import java.util.*;

public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int secretNumber = 59;
		int guessNumber = 0;
		int tries = 0;
		secretNumber = random.nextInt(101);
		
		System.out.println("Welcome to guess a number game");
		do {
			System.out.println("guess a number between 1 - 100");
			guessNumber = scan.nextInt();
			tries++;
			if (guessNumber < secretNumber) {
				System.out.println("too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("too big");
			}
		} while (secretNumber != guessNumber);

		System.out.println("you guessed the number in " + tries + " tries!");

	}
}
