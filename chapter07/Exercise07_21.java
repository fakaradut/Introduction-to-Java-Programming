package chapter07;

import java.util.Scanner;

public class Exercise07_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of  balls: ");
		int numOfBalls = input.nextInt();
		System.out.println("Enter the number of slots in the beach machine: ");
		int numOfSlots = input.nextInt();
		String[] pathShow = new String[numOfBalls];
		int[] slot = new int[numOfBalls];

		for (int i = 0; i < numOfBalls; i++) {
			int[] currentPath = randomPath(numOfSlots);
			pathShow[i] = pathDisplay(currentPath);
			slot[i] = whichSlot(currentPath);
		}
		show(slot, pathShow, numOfSlots);
	}

	public static void show(int[] slot, String[] displayPath, int numberOfSlots) {
		for (String string : displayPath) {
			System.out.println(string);
		}
		int[] showSlotOfBalls = new int[numberOfSlots];
		for (int i = 0; i < slot.length; i++) {
			showSlotOfBalls[slot[i]]++;
		}
		int max = 0;
		for (int i = 0; i < showSlotOfBalls.length; i++) {
			max = max > showSlotOfBalls[i] ? max : showSlotOfBalls[i];
		}
		System.out.println();
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < numberOfSlots; j++) {
				if (max - i == showSlotOfBalls[j]) {
					System.out.print("O");
					showSlotOfBalls[j]--;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static int whichSlot(int[] path) {
		int slot = 0;
		for (int i = 0; i < path.length; i++) {
			if (path[i] == 1) {
				slot++;
			}
		}
		return slot;
	}

	public static int[] randomPath(int slotsNumber) {
		int path[] = new int[slotsNumber - 1];
		int[] temp = { -1, 1 };

		for (int i = 0; i < path.length; i++) {
			path[i] = temp[((int) (Math.random() * 2))];
		}
		return path;
	}

	public static String pathDisplay(int[] path) {
		String pathDisplay = "";

		for (int i = 0; i < path.length; i++) {
			if (path[i] == -1) {
				pathDisplay += "L";
			} else {
				pathDisplay += "R";
			}
		}
		return pathDisplay;
	}
}
