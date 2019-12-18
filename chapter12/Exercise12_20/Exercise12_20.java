package chapter12.Exercise12_20;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_18 srcRootDirectory");
			System.exit(1);
		}

		File directory = new File(args[0]);

		if (!directory.exists()) {
			System.out.println("Current directory \'" + args[0] + "\' does not exist");
			System.exit(2);
		} else if (!directory.isDirectory()) {
			System.out.println("\'" + args[0] + "\' is not a directory");
			System.exit(3);
		}

		File[] files = directory.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) {
				File[] filesChapterI = files[i].listFiles();
				for (int j = 0; j < filesChapterI.length; j++) {
					if (filesChapterI[j].isFile() && filesChapterI[j].getName().contains("java")) {
						removePackage(filesChapterI[j]);
					}
				}
			}
		}
	}

	public static void removePackage(File file) throws Exception {
		ArrayList<String> lines = new ArrayList<>();
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				lines.add(input.nextLine());
			}
		}
		String statement = "chapter";

		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			if (line.contains(statement)) {
				lines.remove(i--);
			}
		}

		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 0; i < lines.size(); i++) {
				output.println(lines.get(i));
			}
		}
	}
}
