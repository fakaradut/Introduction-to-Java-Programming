package chapter12.Exercise12_23;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_23 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");

		ArrayList<Double> scores = new ArrayList<>();
		try (Scanner input = new Scanner(url.openStream());) {
			while (input.hasNext()) {
				try {
					scores.add(Double.valueOf(input.next()));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		double sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("Total score is: " + sum + "\nAverage is: " + sum / scores.size());
	}
}
