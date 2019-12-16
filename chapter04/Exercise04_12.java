package chapter04;

import java.util.Scanner;

public class Exercise04_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		char hexDigit = input.next().charAt(0);

		if ('0' <= hexDigit && hexDigit <= '9' || 'A' <= hexDigit && hexDigit <= 'F') {
			System.out.print("The binary value is ");
			switch (hexDigit) {
			case '0':
				System.out.println("0");
				break;
			case '1':
				System.out.println("1");
				break;
			case '2':
				System.out.println("10");
				break;
			case '3':
				System.out.println("11");
				break;
			case '4':
				System.out.println("100");
				break;
			case '5':
				System.out.println("101");
				break;
			case '6':
				System.out.println("110");
				break;
			case '7':
				System.out.println("111");
				break;
			case '8':
				System.out.println("1000");
				break;
			case '9':
				System.out.println("1001");
				break;
			case 'A':
				System.out.println("1010");
				break;
			case 'B':
				System.out.println("1011");
				break;
			case 'C':
				System.out.println("1100");
				break;
			case 'D':
				System.out.println("1101");
				break;
			case 'E':
				System.out.println("1110");
				break;
			case 'F':
				System.out.println("1111");
				break;
			}
		} else {
			System.out.println(hexDigit + " is an invalid input");
		}
	}

}
