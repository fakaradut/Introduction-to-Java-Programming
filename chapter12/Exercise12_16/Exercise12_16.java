package chapter12.Exercise12_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_16 {
	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
			System.exit(1);
		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file \'" + args[0] + "\' does not exist");
			System.exit(2);
		}

		ArrayList<String> list = new ArrayList<>();
		Scanner input = new Scanner(sourceFile);
		while (input.hasNext()) {
			list.add(input.nextLine());
		}
		input.close();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(args[1])) {
				String str = list.get(i);
				str = str.replaceAll(args[1], args[2]);
				list.set(i, str);
			}
		}

		PrintWriter output = new PrintWriter(sourceFile);
		for (int i = 0; i < list.size(); i++) {
			output.println(list.get(i));
		}
		output.close();
	}
}
