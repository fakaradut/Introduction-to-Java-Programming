package chapter05;

public class Exercise05_43 {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 6; i++) {
			for (int j = i + 1; j <= 7; j++) {
				count++;
				System.out.println(i + " " + j);
			}

		}
		System.out.println("Total comnbination: " + count);

	}

}
