package chapter03;

import java.util.Scanner;

public class Exercise03_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		int max;
		int mid;
		int min;

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
				if (num2 > num3) {
					mid = num2;
					min = num3;
				} else {
					mid = num3;
					min = num2;
				}
			} else {
				mid = num1;
				if (num2 > num3) {
					max = num2;
					min = num3;
				} else {
					max = num3;
					min = num2;
				}
			}
		} else if (num2 > num3) {
			max = num2;
			if (num3 > num1) {
				mid = num3;
				min = num1;
			} else {
				mid = num1;
				min = num3;
			}
		} else {
			if (num1 > num3) {
				min = num3;
				max = num1;
				mid = num2;
			} else {
				max = num3;
				min = num1;
				mid = num2;
			}
		}

		System.out.println(min + " " + mid + " " + max);
	}
}
