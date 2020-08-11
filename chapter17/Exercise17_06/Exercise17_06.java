package chapter17.Exercise17_06;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise17_06 {

	public static void main(String[] args) {
		try (ObjectOutputStream dos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("Exercise17_06.dat")))) {
			for (int i = 0; i < 5; i++) {
				dos.writeObject(new Loan(Math.random() * 8 + 2, (int) (Math.random() * 10) + 2,
						Math.random() * 100_000 + 10_000));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
