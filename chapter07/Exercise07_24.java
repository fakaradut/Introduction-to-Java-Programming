package chapter07;

public class Exercise07_24 {
	public static void main(String[] args) {
		boolean[] array = new boolean[4];
		int count = 0;
		int random = getRandom();
		int countOfPicks = 0;
		int[] cardArray = new int[4];

		while (count < 4 && !array[count]) {
			countOfPicks++;
			if (cardArray[random / 13] == 0) {
				cardArray[random / 13]++;
				count++;
				System.out.println(card(random));
			}
			random = getRandom();
		}
		System.out.println("\nNumber of picks: " + countOfPicks);

	}

	public static int getRandom() {
		return (int) (Math.random() * 52);
	}

	public static String card(int random) {
		String[] sembols = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] numbers = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Quenn", "King" };
		return sembols[random / 13] + " " + numbers[random % 13];
	}
}
