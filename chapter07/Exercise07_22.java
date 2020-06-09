package chapter07;

public class Exercise07_22 {
	public static void main(String[] args) {

		int[] firstRow = new int[8];
		int[] secondRow = new int[8];
		int[] thirdRow = new int[8];
		int[] forthRow = new int[8];
		int[] fifthRow = new int[8];
		int[] sixthRow = new int[8];
		int[] seventhRow = new int[8];
		int[] eightRow = new int[8];
		positionQuenns(firstRow, secondRow, thirdRow, forthRow, fifthRow, sixthRow, seventhRow, eightRow);

	}

	public static void print(int[] a1, int[] a2, int[] a3, int[] a4, int[] a5, int[] a6, int[] a7, int[] a8) {
		printRow(a1);
		printRow(a2);
		printRow(a3);
		printRow(a4);
		printRow(a5);
		printRow(a6);
		printRow(a7);
		printRow(a8);
		System.exit(0);
	}

	public static void printRow(int[] array) {
		System.out.print("|");
		for (int i : array) {
			if (i == 2) {
				System.out.print("Q|");
			} else {
				System.out.print(" |");
			}
		}
		System.out.println();
	}

	public static int getRandom() {
		return (int) (Math.random() * 8);
	}

	public static void positionQuenns(int[] a1, int[] a2, int[] a3, int[] a4, int[] a5, int[] a6, int[] a7, int[] a8) {
		int random = getRandom();
		int colomns[] = new int[8];

		int loopCount = 0;
		colomns[random] = 1;
		a1[random] = 2;
		position(a2, a3, a4, a5, a6, a7, a8, 1, random);

		boolean temp = true;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a2, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 2, random);
				temp = false;
			}
		}
		temp = true;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a3, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 3, random);
				temp = false;
			}
		}
		temp = true;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a4, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 4, random);
				temp = false;
			}
			loopCount++;
			if (loopCount == 20) {
				temp = false;
				for (int i = 0; i < colomns.length; i++) {
					colomns[i] = 0;
					a2[i] = 0;
					a1[i] = 0;
					a3[i] = 0;
					a4[i] = 0;
					a5[i] = 0;
					a6[i] = 0;
					a7[i] = 0;
					a8[i] = 0;
				}

				positionQuenns(a1, a2, a3, a4, a5, a6, a7, a8);
			}
		}
		loopCount = 0;
		temp = true;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a5, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 5, random);
				temp = false;
			}
			loopCount++;
			if (loopCount == 20) {
				temp = false;
				for (int i = 0; i < colomns.length; i++) {
					colomns[i] = 0;
					a2[i] = 0;
					a1[i] = 0;
					a3[i] = 0;
					a4[i] = 0;
					a5[i] = 0;
					a6[i] = 0;
					a7[i] = 0;
					a8[i] = 0;
				}

				positionQuenns(a1, a2, a3, a4, a5, a6, a7, a8);
			}
		}
		temp = true;
		loopCount = 0;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a6, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 6, random);
				temp = false;
			}
			loopCount++;
			if (loopCount == 20) {
				temp = false;
				for (int i = 0; i < colomns.length; i++) {
					colomns[i] = 0;
					a2[i] = 0;
					a1[i] = 0;
					a3[i] = 0;
					a4[i] = 0;
					a5[i] = 0;
					a6[i] = 0;
					a7[i] = 0;
					a8[i] = 0;
				}

				positionQuenns(a1, a2, a3, a4, a5, a6, a7, a8);
			}
		}
		loopCount = 0;
		temp = true;

		while (temp) {
			random = getRandom();
			if (isPositionValid(a7, random, colomns)) {
				colomns[random] = 1;
				position(a2, a3, a4, a5, a6, a7, a8, 7, random);
				temp = false;
			}
			loopCount++;
			if (loopCount == 20) {
				temp = false;
				for (int i = 0; i < colomns.length; i++) {
					colomns[i] = 0;
					a2[i] = 0;
					a1[i] = 0;
					a3[i] = 0;
					a4[i] = 0;
					a5[i] = 0;
					a6[i] = 0;
					a7[i] = 0;
					a8[i] = 0;
				}

				positionQuenns(a1, a2, a3, a4, a5, a6, a7, a8);
			}
		}
		temp = true;

		loopCount = 0;

		while (temp) {
			random = getRandom();
			loopCount++;
			if (loopCount == 20) {
				temp = false;
				for (int i = 0; i < colomns.length; i++) {
					colomns[i] = 0;
					a2[i] = 0;
					a1[i] = 0;
					a3[i] = 0;
					a4[i] = 0;
					a5[i] = 0;
					a6[i] = 0;
					a7[i] = 0;
					a8[i] = 0;
				}

				positionQuenns(a1, a2, a3, a4, a5, a6, a7, a8);
			}
			if (isPositionValid(a8, random, colomns)) {
				temp = false;
			}
		}

		print(a1, a2, a3, a4, a5, a6, a7, a8);
	}

	public static boolean isPositionValid(int[] array, int positionOfQuenn, int[] colomns) {
		if (array[positionOfQuenn] == 0 && colomns[positionOfQuenn] == 0) {
			array[positionOfQuenn] = 2;
			return true;
		} else {
			return false;
		}
	}

	public static void position(int[] a2, int[] a3, int[] a4, int[] a5, int[] a6, int[] a7, int[] a8, int row,
			int positionOfQuenn) {

		for (int i = row + 1; i < row + 2; i++) {
			int countRowNegative = 0;
			int countRowPositive = 0;
			switch (i) {
			case (2):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a2[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a2[positionOfQuenn + countRowPositive] = -1;
				}
			case (3):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a3[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a3[positionOfQuenn + countRowPositive] = -1;
				}
			case (4):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a4[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a4[positionOfQuenn + countRowPositive] = -1;
				}
			case (5):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a5[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a5[positionOfQuenn + countRowPositive] = -1;
				}
			case (6):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a6[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a6[positionOfQuenn + countRowPositive] = -1;
				}
			case (7):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a7[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a7[positionOfQuenn + countRowPositive] = -1;
				}
			case (8):
				countRowNegative--;
				countRowPositive++;
				if (0 <= positionOfQuenn + countRowNegative) {
					a8[positionOfQuenn + countRowNegative] = -1;
				}
				if (positionOfQuenn + countRowPositive <= 7) {
					a8[positionOfQuenn + countRowPositive] = -1;
				}

			}
		}

	}
}