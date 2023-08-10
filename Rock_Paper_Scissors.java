package tasks;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String[] rps = { "r", "p", "s" };
			String computreMove = rps[new Random().nextInt(rps.length)];

			String playerMove;

			while (true) {

				System.out.println("Please Enter Your Move(r, p or s)");
				playerMove = sc.nextLine();

				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " Is Not A Valid Move.");
			}

			System.out.println("Computer Played : " + computreMove);
			if (playerMove.equals(computreMove)) {
				System.out.println("The Game Was A Tie!");
			} else if (playerMove.equals("r")) {
				if (computreMove.equals("p")) {
					System.out.println("You Lose!");
				} else if (computreMove.equals("s")) {
					System.out.println("You Win!");
				}
			} else if (playerMove.equals("p")) {
				if (computreMove.equals("r")) {
					System.out.println("You Win!");
				} else if (computreMove.equals("s")) {
					System.out.println("You Lose!");
				}
			} else if (playerMove.equals("s")) {
				if (computreMove.equals("p")) {
					System.out.println("You Win!");
				} else if (computreMove.equals("r")) {
					System.out.println("You Lose!");
				}
			}

			System.out.println("Play Again (y/n)");
			String playAgain = sc.nextLine();

			if (!playAgain.equals("y")) {
				break;
			}
		}
		sc.close();
	}
}
