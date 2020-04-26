package chapter08;


public class Exercise08_03 {
	public static void main(String[] args) {
		char[][] answers = {
				      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			   	      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			       	  {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		printGradesByPoints(answers, keys);
	}

	public static void printGradesByPoints(char[][] answers, char[] rightKeys) {
		int[] sortOfGrades = new int[answers.length];
		String[] sortOfStudents = new String[answers.length];
		
		for (int i = 0; i < answers.length; i++) {
			int grade=0;
			for (int j = 0; j < answers[i].length; j++) {
				grade=(answers[i][j]==rightKeys[j])?(grade+=1):(grade+=0);
			}
			sortOfGrades[i]=grade;
			sortOfStudents[i]=i+"";
		}
		
		for (int i = 0; i < sortOfStudents.length-1; i++) {
			int min=sortOfGrades[i];
			int minIndex=i;
			
			for (int j = i+1; j < sortOfStudents.length; j++) {
				if(sortOfGrades[j]<min) {
					sortOfGrades[minIndex]=sortOfGrades[j];
					String temp=sortOfStudents[minIndex];
					sortOfStudents[minIndex]=sortOfStudents[j];
					
					sortOfGrades[j]=min;
					sortOfStudents[j]=temp;
					min=sortOfGrades[minIndex];
					
				}
			}
			}
			for (int i=0;i<sortOfStudents.length;i++) {
				System.out.println(sortOfStudents[i]+". student's grade is: "+sortOfGrades[i]);
			
			
			
			}

	}
}
