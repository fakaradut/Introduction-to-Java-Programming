package chapter08;

import java.util.Scanner;

public class Exercise08_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of banks");
		int numberOfBanks = input.nextInt();
		System.out.println("Enter limit");
		int limit = input.nextInt();
		double infos[][] = new double[numberOfBanks][];
		// 5 201 25 2 1 100,5 4 320,5 125 2 2 40 3 85 175 2 0 125 3 75 75 1 0 125 181 1
		// 2 125

		for (int i = 0; i < numberOfBanks; i++) {
			System.out.println("Enter bank’s balance");
			double balance = input.nextDouble();
			System.out.println("Enter number of banks that borrowed money from the bank");
			int borrowedBankNumber = input.nextInt();
			infos[i] = new double[borrowedBankNumber * 2 + 1];
			infos[i][0] = balance;
			System.out.println("Enter the borrower’s ID and amount borrowed");
			for (int j = 1; j < infos[i].length; j++) {
				infos[i][j] = input.nextDouble();
			}
		}

		boolean[] safeBanks = isSafe(limit, infos);

		String str = "";
		for (int i = 0; i < infos.length; i++) {
			if (totalAsset(limit, infos, i, safeBanks) < limit) {
				str += i + " ";
			}
		}
		System.out.println("Unsafe banks are " + str);

	}

	public static boolean[] isSafe(int limit, double[][] infos) {
		boolean[] safeBanks = new boolean[infos.length];
		for (int i = 0; i < infos.length; i++) {
			double sum = infos[i][0];
			for (int j = 2; j < infos[i].length; j += 2) {
				sum += infos[i][j];
			}
			if (sum < limit) {
				safeBanks[i] = false;
			} else {
				safeBanks[i] = true;
			}
		}
		return safeBanks;
	}

	public static double totalAsset(int limit, double[][] list, int bank, boolean[] safe) {
		double sum = list[bank][0];

		for (int i = 1; i < list[bank].length; i += 2) {
			if (safe[(int) (list[bank][i])]) {
				sum += list[bank][i + 1];
			}
		}
		return sum;
	}
}
