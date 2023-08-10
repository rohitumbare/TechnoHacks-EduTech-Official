package tasks;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {

		Random ra = new Random();
		Scanner sc = new Scanner(System.in);

		int randomnumber = ra.nextInt(100) + 1;

		int tryCount = 0;
		int guessesRemaining = 10;

		while (true) {

			tryCount++;
			System.out.println("Guess A Number Between 1-100 : ");

			int playerguess = sc.nextInt();

			guessesRemaining--;

			if (guessesRemaining > 0) {
				if (playerguess == randomnumber) {
					System.out.println("Congratulations!!! You Win...");
					System.out.println("It Took You " + tryCount + " Tries");
					break;
				} else if (randomnumber > playerguess) {
					System.out.println("Try Again, Number Is Higher Than Your Guess.");
					System.out.println("Only " + guessesRemaining + " Guesses Remaining");
				} else {
					System.out.println("Try Again, Number Is Lower Than Your Guess.");
					System.out.println("Only " + guessesRemaining + " Guesses Remaining");
				}
			} else {
				System.out.println("Oops...You Lose!!!");
				break;
			}
		}
		sc.close();
	}
}
