package co.grandcircus;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		int sides;
		char again = 'y';
		int roll = 1;
		while (check) {
			System.out.println("How many sides should your 2 die have?");
			sides = scan.nextInt();
			System.out.println("Roll: " + roll);
			for (int i = 1; i <= 2; i++) {
				System.out.println(generateRandomDieRoll(sides));
			}
			System.out.println("Roll again? (y/n)");
			again = scan.next().charAt(0);
			boolean check2 = true;
			while (check2) {
			if (again == 'y' || again == 'Y') {
					check = true;
					check2 = false;
					roll++;

			} else if ((again == 'n' || again == 'N')) {
					check = false;
					check2 = false;
				} else {
					System.out.println("Invalid: Enter Again (y/n)");
					again = scan.next().charAt(0);
					check2 = true;
			}

			}
		}
		System.out.println("Goodbye");
		scan.close();

	}

	public static int generateRandomDieRoll(int x) {
		Random rand = new Random();
		int a = rand.nextInt(x) + 1;
		return a;
	}
}
