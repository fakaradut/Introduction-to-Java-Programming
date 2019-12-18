package chapter12.Exercise12_24;

import java.io.File;
import java.io.PrintWriter;

public class Exercise12_24 {
	public static void main(String[] args) throws Exception {
		final int LINES = 1_000;
		File file = new File("Salary.txt");
		PrintWriter output = new PrintWriter(file);

		for (int i = 1; i <= LINES; i++) {
			String randomRank = getRandomRank();
			String s = String.format("%-9s%-6d%-8s%-6d%-15s%-15.2f", "FirstName", i, " LastName", i, randomRank,
					getRandomSalary(randomRank));
			output.println(s);
		}
		output.close();
	}

	public static String getRandomRank() {
		String[] rank = { "assistant", "associate", "full" };
		int random = (int) (Math.random() * 3);
		return rank[random];
	}

	public static double getRandomSalary(String rank) {
		double salary = 0;
		switch (rank) {
		case "assistant":
			salary = (int) (Math.random() * 3_000_001) + 5_000_000;
			break;
		case "associate":
			salary = (int) (Math.random() * 5_000_001) + 6_000_000;
			break;
		default:
			salary = (int) (Math.random() * 5_500_001) + 7_500_000;
			break;
		}

		return salary / 100.;
	}
}
