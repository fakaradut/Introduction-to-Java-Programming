package chapter04;

public class Exercise04_25 {

	public static void main(String[] args) {
		String plateNumber = "";
		plateNumber += (char)(Math.random()*26+65);
		plateNumber += (char)(Math.random()*26+65);
		plateNumber += (char)(Math.random()*26+65);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		System.out.println(plateNumber);
	}

}
