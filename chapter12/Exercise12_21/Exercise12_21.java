package chapter12.Exercise12_21;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_21 {
	public static void main(String[] args) throws Exception {
		File file = new File("chapter12/Exercise12_21/SortedStrings.txt");
		Scanner input = new Scanner(file);
		ArrayList<String> strings = new ArrayList<>();
		while (input.hasNext()) {
			strings.add(input.next());
		}
		input.close();

		int index = 0;
		while (true) {
			if (index+1  == strings.size()) {
				break;
			}
			if (strings.get(index).compareTo(strings.get(index + 1)) > 0) {
				System.out.println("The first two strings that are out of the order is " + strings.get(index) + " and "
						+ strings.get(index + 1));
				break;
			}
			
			index++;
		}
	}
}
