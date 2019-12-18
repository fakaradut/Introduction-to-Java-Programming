package chapter12.Exercise12_17;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_07 {
	public static void main(String[] args) throws Exception {
		hangmanGame();

	}

	public static void hangmanGame() throws Exception {
		Scanner input = new Scanner(System.in);
		File file = new File("chapter12/Exercise12_17/hangman.txt");
		ArrayList<String> words = new ArrayList<>();

		try (Scanner scanner = new Scanner(file);) {
			while (scanner.hasNext()) {
				words.add(scanner.next());
			}
		}
		String str = words.get((int) (Math.random() * words.size()));

		String[] display = new String[str.length()];
		String displayStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				display[i] = "*";
				System.out.print("*");
			} else {
				display[i] = " ";
				System.out.print(" ");
			}
		}

		System.out.println("\nEnter char");
		char ch = input.next().charAt(0);
		boolean[] trueGuess = new boolean[str.length()];
		char[] trueCharGuess = new char[str.length()];
		// int trueCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				trueGuess[i] = true;
				trueCharGuess[i] = ' ';
				// trueCount++;
			}
		}

		boolean isFinish = false;
		int count = 0;
		int mistakeCount = 0;
		boolean isMatch = false;

		for (int i = 0; i < str.length(); i++, isMatch = false) {
			if (ch == str.charAt(i)) {
				isMatch = true;
				if ((trueCharGuess[i] == ch && trueGuess[i] == true) && count < 1) {
					count++;

					System.out.println(ch + " is already in the word");
				}

				trueGuess[i] = true;
				trueCharGuess[i] = ch;

			}
			// isFinish = trueCount == str.length() ? true : false;
			for (int j = 0; j < trueGuess.length; j++) {
				if (!trueGuess[j]) {
					isFinish = false;
					break;
				}
				if (j == trueCharGuess.length - 1 && trueGuess[j] == true) {
					isFinish = true;
				}
			}

			if (i == str.length() - 1) {
				if (!isMatch) {
					mistakeCount++;
				}
				displayStr = str(trueGuess, display, trueCharGuess);
				for (int j = 0; j < str.length(); j++) {
					display[j] = "" + displayStr.charAt(j);
				}
				if (isFinish == true) {
					System.out.println("The word is " + str);
					System.out.println("You missed " + mistakeCount + " times");
					System.out.println("Do you want to guess another word? Enter <y or n>");
					ch = input.next().charAt(0);
					if (ch == 'y') {
						hangmanGame();
					} else if (ch == 'n') {
						System.exit(0);
					}
				}
				for (String c : display) {
					System.out.print(c);
				}

				i = -1;
				System.out.println("\nEnter char");
				ch = input.next().charAt(0);
				count = 0;

			}
		}
		input.close();
	}

	public static String str(boolean[] listOfTrueGuess, String[] display, char[] trueGuess) {

		for (int i = 0; i < display.length; i++) {
			if (listOfTrueGuess[i] == true) {
				display[i] = "" + trueGuess[i];
			} else {
				display[i] = "*";
			}
		}
		String s = "";
		for (int i = 0; i < display.length; i++) {
			s += display[i];
		}
		return s;
	}
}
