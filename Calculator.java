package tasks;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int operator, n1, n2;
		System.out.println("Choose Any Operator : \n 1.Addition \n 2.Subtraction\n 3.Multiplication \n 4.Division");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();

		if (operator <= 4 && operator >= 1) {

			switch (operator) {
			case 1:
				System.out.println("You Choose Addition");
				break;

			case 2:
				System.out.println("You Choose Subtraction");
				break;

			case 3:
				System.out.println("You Choose Multiplication");
				break;

			case 4:
				System.out.println("You Choose Division");
				break;

			default:
				break;
			}

			System.out.println("Enter First Number :");
			n1 = sc.nextInt();
			System.out.println("Enter Second Number :");
			n2 = sc.nextInt();

			int result = 0;
			switch (operator) {
			case 1:
				result = n1 + n2;
				System.out.println("Addition Of Two Numbers Is : " + result);
				break;

			case 2:
				result = n1 - n2;
				System.out.println("Subtraction Of Two Numbers Is : " + result);
				break;

			case 3:
				result = n1 * n2;
				System.out.println("Multiplication Of Two Numbers Is : " + result);
				break;

			case 4:
				result = n1 / n2;
				System.out.println("Division Of Two Numbers Is : " + result);
				break;

			default:
				break;
			}

		} else {
			System.out.println("Invalid Operator Choose");

		}
		sc.close();
	}
}
