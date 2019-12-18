package chapter12.Exercise12_19;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		Scanner input = new Scanner(url.openStream());
		int wordCount = 0;

		while (input.hasNext()) {
			input.next();
			wordCount++;
		}
		input.close();
		System.out.println("The number of words are " + wordCount);
	}
}
