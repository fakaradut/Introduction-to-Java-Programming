package chapter06;

import java.util.Scanner;

public class Exercise06_06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int n=input.nextInt();
		
	
		
		displayPattern(n);
	}

	public static void displayPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n -i; 0 < j; j--) {
				System.out.print("   ");
			}
			for (int k = i; 0 < k; k--) {
				System.out.printf("%-3d", k);
			}
			System.out.println();
		}

	}
}
