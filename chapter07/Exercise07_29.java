package chapter07;

public class Exercise07_29 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		while (sum < 24) {
			int random = getRandom();
			sum += (random % 13) + 1;
			count++;
			System.out.println(card(random));
		}

		System.out.println(count + " times picks needed");

	}

	public static String card(int number) {
		String[] card = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Quenn", "King" };
		return card[number % 13];

	}

	public static int getRandom() {
		return (int) (Math.random() * 52);
	}
}
