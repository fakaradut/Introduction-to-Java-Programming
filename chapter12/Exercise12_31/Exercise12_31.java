package chapter12.Exercise12_31;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_31 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the gender: ");
		char gender = input.next().toUpperCase().charAt(0);
		System.out.println("Enter the name: ");
		String name = input.next();

		URL url = new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");

		try (Scanner scanner = new Scanner(url.openStream());) {
			while (scanner.hasNext()) {
				String[] datas = new String[5];
				datas[0] = scanner.next(); // rank
				datas[1] = scanner.next(); // Male name
				datas[2] = scanner.next(); // number
				datas[3] = scanner.next(); // Female name
				datas[4] = scanner.next(); // number

				if (gender == 'M') {
					if (datas[1].equals(name)) {
						System.out.println(name + " is ranked #" + datas[0] + " in year " + year);
						System.exit(0);
					}
				} else if (gender == 'F') {
					if (datas[3].equals(name)) {
						System.out.println(name + " is ranked #" + datas[0] + " in year " + year);
						System.exit(0);
					}
				}
			}
			System.out.println("The name " + name + " is not ranked in year " + year);
		}
		input.close();
	}
}
