package chapter13.Exercise13_08;

public class TestExercise13_08 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("S1");
		stack.push("S2");
		stack.push("S");

		MyStack stack2 = (MyStack) (stack.clone());
		stack2.push("a");
		stack2.push("b");
		stack2.push("c");

		System.out.println(stack);
		System.out.println(stack2);
	}
}
