package chapter11.Exercise11_06;

import java.util.ArrayList;
import java.util.Date;

public class TestExercise11_05 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		Loan loan = new Loan();
		Date date = new Date();
		Circle circle = new Circle();
		list.add(loan);
		list.add(date);
		list.add(circle);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString()+"\n");
		}
	}
}
