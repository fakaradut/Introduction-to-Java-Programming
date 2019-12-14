package chapter01;

public class Exercise01_11 {
	public static void main(String[] args) {
		// 365 days * 24 hours * 60 minutes * 60 seconds = 31536000 seconds
		System.out.println("Year 1:");
		System.out.println(312032486 + (1 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		System.out.println("Year 2:");
		System.out.println(312032486 + (2 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		System.out.println("Year 3:");
		System.out.println(312032486 + (3 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		System.out.println("Year 4:");
		System.out.println(312032486 + (4 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
		System.out.println("Year 5:");
		System.out.println(312032486 + (5 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));
	}
}