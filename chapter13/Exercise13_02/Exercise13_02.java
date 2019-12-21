package chapter13.Exercise13_02;

import java.util.ArrayList;

public class Exercise13_02 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		shuffle(list);
		for (Number number : list) {
			System.out.println(number);
		}
	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			int random = (int) (Math.random() * list.size());
			Number temp = list.get(random);
			list.set(random, list.get(i));
			list.set(i, temp);
		}
	}
}
