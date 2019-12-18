package chapter12.Exercise12_32;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_32 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> datas = new ArrayList<>();
		for (int year = 2010; year >= 2000; year--) {
			URL url = new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");
			try (Scanner input = new Scanner(url.openStream());) {
				for (int i = 0; i < 5; i++) {
					while (input.hasNext()) {
						input.next(); // rank
						datas.add(input.next()); // Male name
						input.next(); // number
						datas.add(input.next()); // Female name
						input.next(); // number
					}
				}
			}
		}
		printTable();
		printDatas(datas);
	}

	public static void printTable() {
		String[] word = { "Year", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5", "Rank 1", "Rank 2", "Rank 3",
				"Rank 4", "Rank 5" };
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				for (int j = 0; j < word.length; j++) {
					System.out.printf("%-7s", word[j]);
				}
			} else {
				for (int j = 0; j < word.length; j++) {
					for (int j2 = 0; j2 < 7; j2++) {
						System.out.print("-");
					}
				}
			}
			System.out.println();
		}

	}

	public static void printDatas(ArrayList<String> datas) {
		int maleNameIndex = 0;
		int femaleNameIndex = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(2010 - i + "   ");
			for (int j = 0; j < 5; j++) {
				System.out.printf("%-7s", datas.get(femaleNameIndex));
				femaleNameIndex += 2;
			}
			for (int j = 0; j < 5; j++) {
				System.out.printf("%-7s", datas.get(maleNameIndex));
				maleNameIndex += 2;
			}
			System.out.println();
		}
	}
}
