package chapter12.Exercise12_30;

import java.io.File;
import java.util.Scanner;

public class Exercise12_30 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name");
		String fileName = input.nextLine();
		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		StringBuilder lines = new StringBuilder();
		try (Scanner scanner = new Scanner(file);) {
			while (scanner.hasNext()) {
				lines.append(scanner.nextLine().toUpperCase());
			}
		}
		int[] chars = new int['Z' - 'A'+1];
		for (int i = 0; i < lines.length(); i++) {
			if ('A' <= lines.charAt(i) && lines.charAt(i) <= 'Z') {
				chars[lines.charAt(i) - 'A']++;
			}
		}

		for (int i = 0; i < chars.length; i++) {
			System.out.println("Number of " + ((char) ('A' + i)) + "'s: " + chars[i]);
		}
	}
}
