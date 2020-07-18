package chapter17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise17_01 {
	public static void main(String[] args) throws IOException {
		final int NUMBER_OF_INTEGERS = 100;
		File file = new File("Exercise17_01.txt");
		try (PrintWriter output = new PrintWriter(new FileOutputStream(file, true));) {
			for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
				output.write((int) (Math.random() * 100)+" ");
			}
			output.flush();
		}
	}
}
