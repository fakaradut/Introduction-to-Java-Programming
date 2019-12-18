package chapter12.Exercise12_18;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
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
				File[] filesInChapterI = files[i].listFiles();
				for (int j = 0; j < filesInChapterI.length; j++) {
					if (filesInChapterI[j].isFile() && filesInChapterI[j].getName().endsWith(".java")) {
						insertStatement(filesInChapterI[j], files[i].getName());
					}
				}
			}
		}

	}

	public static void insertStatement(File file, String name) throws Exception {
		if (file.isFile() && file.getName().endsWith("java")) {
			Scanner input = new Scanner(file);
			ArrayList<String> lines = new ArrayList<>();
			while (input.hasNext()) {
				lines.add(input.nextLine());
			}
			input.close();

			if (!lines.get(0).contains("chapter")) {
				lines.add(0, "package " + name + ";");
			}
			PrintWriter output = new PrintWriter(file);
			for (int i = 0; i < lines.size(); i++) {
				output.println(lines.get(i));
			}
			output.close();
		}

	}
}
