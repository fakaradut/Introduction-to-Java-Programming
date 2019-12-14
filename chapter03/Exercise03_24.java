package chapter03;

public class Exercise03_24 {
	public static void main(String[] args) {
		int randomRank = (int) (Math.random() * 12) + 1;
		int randomSuit = (int) (Math.random() * 4) + 1;

		System.out.print("The card you picked is ");
		switch (randomRank) {
		case 1:
			System.out.print("Ace");
			break;
		case 2:
			System.out.print(randomRank);
			break;
		case 3:
			System.out.print(randomRank);
			break;
		case 4:
			System.out.print(randomRank);
			break;
		case 5:
			System.out.print(randomRank);
			break;
		case 6:
			System.out.print(randomRank);
			break;
		case 7:
			System.out.print(randomRank);
			break;
		case 8:
			System.out.print(randomRank);
			break;
		case 9:
			System.out.print(randomRank);
			break;
		case 10:
			System.out.print(randomRank);
			break;
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Quenn");
			break;
		case 13:
			System.out.print("King");
			break;
		}

		System.out.print(" of ");
		switch (randomSuit) {
		case 1:
			System.out.println("Clubs");
			break;
		case 2:
			System.out.println("Diamonds");
			break;
		case 3:
			System.out.println("Hearts");
			break;
		case 4:
			System.out.println("Spades");
			break;
		}
	}
}
