package chapter10.Exercise10_07;

import java.util.Scanner;

public class ATM_Machine {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double balance = 100;
		final int LIST_SIZE = 10;
		Account[] list = new Account[LIST_SIZE];

		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = new Account(i, balance);
		}
		ATMGame(list);
	}

	public static void ATMGame(Account[] list) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an id: ");
		int id = input.nextInt();
		getId(id);
		int choice = 0;
		while (choice != 4) {
			System.out.println();
			showMain();
			System.out.println("Enter a choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("The balance is: " + list[id].getBalance() + "\n");
				break;
			case 2:
				System.out.println("Enter an amount to withdraw: ");
				double amountToWithdraw = input.nextDouble();
				list[id].withdraw(amountToWithdraw);
				break;
			case 3:
				System.out.println("Enter an amount to deposit:");
				double amountToDeposit = input.nextDouble();
				list[id].deposit(amountToDeposit);
				break;
			case 4:
				break;
			}
		}
	}

	public static void getId(int id) {
		if (isCorrectId(id)) {
		} else {
			System.out.println("Invalid id. Enter an id: ");
			Scanner input = new Scanner(System.in);
			int newId = input.nextInt();
			getId(newId);
		}
	}

	public static boolean isCorrectId(int id) {
		if (id < 0 || 9 < id) {
			return false;
		} else {
			return true;
		}
	}

	public static void showMain() {
		System.out.println("Main menu\r\n" + "1: check balance\r\n" + "2: withdraw\r\n" + "3: deposit\r\n" + "4: exit");
	}
}
