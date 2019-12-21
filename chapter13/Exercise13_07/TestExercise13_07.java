package chapter13.Exercise13_07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExercise13_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int LENGTH = 5;

		System.out.println("Enter square's side, color, filled(true or false) and colorable(true of false)");
		ArrayList<Square> list = new ArrayList<>();
		int squareIndex = 1;
		for (int i = 0; i < LENGTH; i++) {
			Square square = new Square(input.nextDouble(), input.next(), input.nextBoolean());
			if (input.nextBoolean()) {

				System.out.print("Square " + squareIndex + "\n");
				square.howToColor();
			}
			list.add(square);
			squareIndex++;
		}
		System.out.println();
		squareIndex = 1;
		for (Square square : list) {
			System.out.println("Square " + (squareIndex++) + "\n" + square + "\n");
		}

		input.close();
	}
}
