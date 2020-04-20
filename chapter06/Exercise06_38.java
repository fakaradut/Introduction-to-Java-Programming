package chapter06;

public class Exercise06_38 {
	public static void main(String[] args) {
		int count = 0;

		for(int i=0;i<100;i++) {
			count++;
			if(count%10==0)
		System.out.println(getRandomDigit());	
			else System.out.print(getRandomDigit()+" ");
		}
		
		System.out.println("-------------------");
		
		for(int i=0;i<100;i++) {
			count++;
			if(count%10==0)
		System.out.println(getRandomUpperLetter());	
			else System.out.print(getRandomUpperLetter()+" ");
		}
		
	}

	public static char getRandomDigit() {
		return (char) (Math.random() * 10 + 48);
	}

	public static char getRandomUpperLetter() {
		return (char) (Math.random() * 26 + 65);
	}
}
