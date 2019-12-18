package chapter12.Exercise12_13;

import java.io.File;
import java.util.Scanner;

public class Exercise12_13 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_13 fileName");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Source file \'" + args[0] + "\' not exist");
			System.exit(2);
		}

		int lineCount = 0;
		int wordCount = 0;
		int characterCount = 0;
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = input.nextLine();
				lineCount++;
				if (line.length() != 0) {
					characterCount += line.length();
				}
			}
		}
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			wordCount++;
		}
		input.close();

		System.out.println("File " + file.getName() + " has ");
		System.out.println(characterCount + " characters\n" + wordCount + " words\n" + lineCount + " lines");
	}
}
