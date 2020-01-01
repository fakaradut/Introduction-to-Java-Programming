package chapter07;

import java.util.Scanner;

public class Exercise07_04 {
	public static void main(String[] args) {
		int [] scoresArray=enterScore();
		double average=findTheScoresAverage(scoresArray);
		
		int aboveAndEqual=findNumOfAbove(scoresArray,average);
		int below=findNumOfBelowAndEqual(scoresArray,average);
		
		System.out.println("Average: "+average);
		System.out.println("Number of equals and aboves: "+aboveAndEqual);
		System.out.println("Number of belows: "+below);
		
	}

	public static int findNumOfBelowAndEqual(int[] scoresArray, double average) {
		int countNumOfBelow=0;
		for (int i = 0; i < scoresArray.length; i++) {
			if(scoresArray[i]<average&&scoresArray[i]!=0) {
				countNumOfBelow++;
			}
		}
		return countNumOfBelow;		
		
	}

	public static int findNumOfAbove(int[] scoresArray, double average) {
		int countNumOfAbove=0;
		for (int i = 0; i < scoresArray.length; i++) {
			if(scoresArray[i]>=average) {
				countNumOfAbove++;
			}
		}
		return countNumOfAbove;		
	}

	public static double findTheScoresAverage(int[] scores) {
		double sum=0;
		double count=0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]!=0) {
				count++;
				sum+=scores[i];
			}
		}
		
		return sum/count;
	}

	public static int[] enterScore() {
		Scanner input = new Scanner(System.in);
		int[] scoreArray = new int[100];

		for (int i = 0; i < 100; i++) {
			System.out.println("Enter the score: ");
			int score = input.nextInt();
			if (score <= 100 && score > 0) {
				scoreArray[i] = score;
			} else {
				break;
			}
		}
		return scoreArray;

	}
}
