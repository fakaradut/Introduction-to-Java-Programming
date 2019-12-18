package chapter12.Exercise12_22;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			System.out.println("Usage: java Exercise12_22 dir oldString newString");
			System.exit(1);
		}
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Directory \'" + args[0] + "\' does not exist");
			System.exit(2);
		}

		if (file.isFile()) {
			scanAndWrite(args, file);
		} else {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				if(!files[i].isDirectory())
				scanAndWrite(args, files[i]);
			}
		}
	}

	public static void scanAndWrite(String[] args, File file) throws Exception {
		ArrayList<String> lines = new ArrayList<>();
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				lines.add(input.nextLine());
			}
		}
		for (int j = 0; j < lines.size(); j++) {
			String line = lines.get(j);
			if (line.contains(args[1])) {
				line = line.replaceAll(args[1], args[2]);
				lines.set(j, line);
			}
		}
		try (PrintWriter output = new PrintWriter(file);) {
			for (int j = 0; j < lines.size(); j++) {
				output.println(lines.get(j));
			}
		}
	}
}
