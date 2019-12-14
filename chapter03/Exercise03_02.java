package chapter03;

import java.util.Scanner;

public class Exercise03_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int random1 = (int) (Math.random() * 10);
		int random2 = (int) (Math.random() * 10);
		int random3 = (int) (Math.random() * 10);

		System.out.println("What is " + random1 + " + " + random2 + " + " + random3 + " ?");
		int answer = input.nextInt();

		System.out.println(random1 + " + " + random2 + " + " + random3 + " = " + answer + " is "
				+ (random1 + random2 + random3 == answer));
	}
}
