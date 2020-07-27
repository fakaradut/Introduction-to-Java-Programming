package chapter17;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Exercise17_05 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Date date = new Date();
		double number = 5.5;

		try (ObjectOutputStream dos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("Exercise17_05.txt")))) {
			dos.writeObject(array);
			dos.writeDouble(number);
			dos.writeObject(date);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
