package chapter17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise17_02 {

	public static void main(String[] args) {

		try (
				// Create an output stream to the file
				// Append new data if file already exists
				FileOutputStream output = 
					new FileOutputStream("Exercise17_02.dat", true);
			) {
				// Output 100 integers created randomly into the file
				for (int i = 0; i < 100; i++)
					output.write((int)(1 + Math.random() * 100));
			}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
