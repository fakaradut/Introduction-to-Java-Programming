package chapter12.Exercise12_29;

import java.io.File;

public class Exercise12_29 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Exercise12_29 *");
			System.exit(1);
		}

		for (int i = 0; i < args.length; i++) {
			if (args[i].matches("Exercise[\\d][\\d]_[\\d].*") || args[i].matches("Exercise[\\d]_[\\d].*")) {
				String[] split = args[i].substring(8).split("[_.]");
				if (split[1].length() == 1) {
					String name = "Exercise" + split[0] + "_0" + split[1] + (split.length > 2 ? "." + split[2] : "");
					File file = new File(args[i]);
					file.renameTo(new File(name));
				}
			}
		}
	}
}
