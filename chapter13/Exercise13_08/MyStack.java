package chapter13.Exercise13_08;

import java.util.ArrayList;

public class MyStack extends ArrayList implements Cloneable {

	private ArrayList<Object> list;

	public MyStack() {
		list = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		return list.size() == 0 ? true : false;
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(list.size() - 1);
	}

	public Object pop() {
		Object o = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public MyStack clone() {
		MyStack cloneMyStack = (MyStack) super.clone();
		cloneMyStack.list = (ArrayList<Object>) this.list.clone();

		return cloneMyStack;
	}

	@Override
	public String toString() {
		String s = "stack: [";
		for (int i = list.size() - 1; 0 <= i; i--) {
			s += list.get(i) + (i != 0 ? ", " : "]");
		}
		return s;
	}
}
