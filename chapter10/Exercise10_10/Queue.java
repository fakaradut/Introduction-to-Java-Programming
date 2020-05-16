package chapter10.Exercise10_10;

public class Queue {
	private int[] elements;
	private int size;

	public Queue() {
		elements = new int[8];
		size = 0;
	}

	public void enqueue(int v) {
		if (size + 1 >= elements.length) {
			int[] temp = new int[size * 2];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int v = elements[0];
		for (int i = 0; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return v;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public int getSize() {
		return size;
	}
}
