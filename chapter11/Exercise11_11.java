package chapter11;

import java.util.ArrayList;

public class Exercise11_11 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(-5);
		list.add(-55);
		list.add(95);
		list.add(15);
		sort(list);
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int min = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if (min > list.get(j)) {
					list.set(i, list.get(j));
					list.set(j, min);
					min = list.get(i);
				}
			}
		}
	}
}
