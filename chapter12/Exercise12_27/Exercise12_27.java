package chapter12.Exercise12_27;

import java.io.File;

public class Exercise12_27 {
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Usage: java Exercise12_27 * ");
			System.exit(1);
		}

		for (int i = 0; i < args.length; i++) {
			if (args[i].matches("Exercise[\\d]_[\\d].*") || args[i].matches("Exercise[\\d]_[\\d][\\d].*")
					|| args[i].matches("Exercise[\\d][\\d]_[\\d].*")) {
				rename(new File(args[i]));
			}
		}
	}

	public static void rename(File file) {
		String[] name = file.getName().substring(8).split("[_.]");
		if (name[0].length() == 1) {
			name[0] = "0" + name[0];
		}
		if (name[1].length() == 1) {
			name[1] = "0" + name[1];
		}
		String fileName = "Exercise" + name[0] + "_" + name[1];
		if (name.length > 2) {
			fileName += "." + name[2];
		}
		file.renameTo(new File(fileName));
	}
}
