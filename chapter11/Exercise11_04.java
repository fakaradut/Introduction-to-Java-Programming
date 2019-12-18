package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		while (true) {
			int i = input.nextInt();
			if (i == 0) {
				break;
			}
			list.add(count++, i);
		}
		System.out.println(max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			max = max < list.get(i) ? list.get(i) : max;
		}
		return max;
	}
}
