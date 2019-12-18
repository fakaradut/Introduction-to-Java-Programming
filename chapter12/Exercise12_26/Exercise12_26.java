package chapter12.Exercise12_26;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a directory name");
		String pathname = input.nextLine();

		File file = new File(pathname);
		if (file.isDirectory()) {
			System.out.println("Directory already exists");
			System.exit(1);
		}

		System.out.println(file.mkdirs() ? "Directory created succesfully" : "Directory could not created");
	}
}
