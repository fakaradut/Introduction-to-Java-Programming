package chapter12.Exercise12_28;

import java.io.File;

public class Exercise12_28 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Exercise12_28 * ");
			System.exit(1);
		}

		for (int i = 0; i < args.length; i++) {
			if (args[i].matches("Exercise[\\d]_.*")) {
				File file = new File(args[i]);
				String name = "Exercise0" + file.getName().substring(8);
				file.renameTo(new File(name));
			}
		}
	}
}