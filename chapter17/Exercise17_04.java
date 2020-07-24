package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise17_04 {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("Usage: java Exercise17_04 Welcome.java Welcome.utf");
			System.exit(1);
		} else if (!new File(args[0]).exists()) {
			System.out.println("The file" + args[0] + "does not exist");
			System.exit(2);
		}

		try (Scanner input = new Scanner(new BufferedInputStream(new FileInputStream(args[0])));
				DataOutputStream output = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(args[1])))) {
			while (input.hasNext())
				output.writeUTF(input.nextLine());
		}
	}

}
