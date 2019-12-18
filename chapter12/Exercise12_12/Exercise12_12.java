package chapter12.Exercise12_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_12 fileName");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Source file \'" + args[0] + "\' not exist");
			System.exit(2);
		}
		StringBuilder string = new StringBuilder();

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String lines = input.nextLine();
				int index = lines.indexOf("{");

				if (lines.length() > 1 && index >= 0) {
					lines = lines.substring(0, index - 1) + "\n" + lines.substring(index);
				}
				string.append(lines + "\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.println(string);
		output.close();
	}
}
