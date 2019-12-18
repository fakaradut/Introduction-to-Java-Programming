package chapter12.Exercise12_15;

import java.io.File;
import java.io.PrintWriter;

public class Exercise12_15 {
	public static void main(String[] args) throws Exception {

		File file = new File("Exercise12_15.txt");

		if (!file.exists()) {
			try (PrintWriter output = new PrintWriter(file);) {
				for (int i = 0; i < 100; i++) {
					if ((i + 1) % 10 != 0) {
						String format = String.format("%-5d", (int) (Math.random() * 100));
						output.printf(format);
					} else {
						String format = String.format("%-5d", (int) (Math.random() * 100));
						output.println(format);
					}
				}
			}
		} else {
			System.out.println("File is already exist");
			System.exit(1);
		}

	}
}
