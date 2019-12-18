package chapter11.Exercise11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {
	private ArrayList<Object> list;

	public MyStack() {
		list = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	public int getSize() {
		return size();
	}

	public Object peek() {
		return get(size() - 1);
	}

	public Object pop() {
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public void push(Object o) {
		add(o);
	}

	@Override
	public String toString() {
		String s = "stack: [";
		for (int i = size() - 1; 0 <= i; i--) {
			s += get(i) + (i != 0 ? ", " : "]");
		}
		return s;
	}
}
