package chapter12.Exercise12_14;

import java.io.File;
import java.util.Scanner;

public class Exercise12_14 {

	public static void main(String[] args) throws Exception {
		Scanner filePath = new Scanner(System.in);
		System.out.println("Enter the file adress");
		String adress = filePath.nextLine();

		File file = new File(adress);
		if (!file.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}

		double sum = 0;
		double length = 0;

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				sum += input.nextDouble();
				length++;
			}
		}

		System.out.println("File " + file.getName() + "\nThe total is " + sum + "\nThe average is " + sum / length);
	}

}
