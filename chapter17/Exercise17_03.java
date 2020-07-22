package chapter17;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise17_03 {

	public static void main(String[] args) throws IOException {

		int sum = 0;
		try (DataInputStream input = new DataInputStream(
				new BufferedInputStream(new FileInputStream("Exercise17_03.dat")))) {
			while (true) {
				sum += input.readInt();
			}
		} catch (EOFException ex) {
			System.out.println("Sum: " + sum);
		}
	}

}