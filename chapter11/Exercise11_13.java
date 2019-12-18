package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten number: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j--);
				}
			}
		}
	}
}