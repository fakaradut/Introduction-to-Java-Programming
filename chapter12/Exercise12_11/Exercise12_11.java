package chapter12.Exercise12_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;;

public class Exercise12_11 {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java Exercise12_11 removeText fileName");
			System.exit(1);
		}

		File removeText = new File(args[1]);
		if (!removeText.exists()) {
			System.out.println("File \'" + args[1] + "\' does not exist");
			System.exit(2);
		}

		Scanner input = new Scanner(removeText);
		String text = "";
		
		while (input.hasNext()) {
			text += input.nextLine() + "\n";
		}
		text = text.replaceAll(args[0], "");
		input.close();

		PrintWriter output = new PrintWriter(removeText);
		output.print(text);
		output.close();
	}
}
