package chapter11;

import java.util.ArrayList;

public class Exercise11_07 {
	public static void main(String[] args) {
		final int SIZE_OF_LIST = 100;
		ArrayList<Integer> list = new ArrayList<>(SIZE_OF_LIST);
		for (int i = 0; i < SIZE_OF_LIST; i++) {
			list.add(i);
		}
		shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			int random = (int) (Math.random() * list.size());
			list.set(i, list.get(random));
			list.set(random, temp);
		}
	}
}
