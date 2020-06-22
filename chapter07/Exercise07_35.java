package chapter07;

import java.util.Scanner;

public class Exercise07_35 {
	public static void main(String[] args) {
		hangmanGame();
	}

	public static void hangmanGame() {
		Scanner input = new Scanner(System.in);
		String str = randomWord();
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
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				trueGuess[i] = true;
				trueCharGuess[i] = ' ';
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
	}

	public static String randomWord() {
		String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra",
				"cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
				"goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter",
				"owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon",
				"seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad",
				"trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra" };
		int random1 = (int) (Math.random() * words.length);

		return words[random1];
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
