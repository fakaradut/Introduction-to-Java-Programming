package chapter12.Exercise12_33;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_33 {
	public static void main(String[] args) throws Exception {
		crawler("http://cs.armstrong.edu/liang/");
	}

	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();

		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraversedURLs.contains(urlString)) {
				listOfTraversedURLs.add(urlString);

				for (String s : getSubURLs(urlString)) {
					if (!listOfTraversedURLs.contains(s))
						listOfPendingURLs.add(s);
				}
			}
		}
	}

	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();

		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				if (line.matches(".*[Cc]omputer [Pp]rogramming.*")) {
					System.out.println("The word \"Computer Programming\" is found at " + urlString);
					System.exit(0);
				}
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					} else
						current = -1;
				}
			}
			input.close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		return list;
	}

}