package chapter13.Exercise13_03;

import java.util.ArrayList;

public class Exercise13_03 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(156);
		list.add(1);
		list.add(1506);
		list.add(-156);
		list.add(15646);
		list.add(15);

		sort(list);
		for (Number number : list) {
			System.out.print(number + " ");
		}
	}

	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			Number minNumber = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (minNumber.doubleValue() > list.get(j).doubleValue()) {
					minNumber = list.get(j);
					minIndex = j;
				}
			}
			if (!minNumber.equals(list.get(i))) {
				list.set(minIndex, list.get(i));
				list.set(i, minNumber);
			}
		}
	}
}
