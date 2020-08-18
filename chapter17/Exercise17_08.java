package chapter17;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise17_08 {

	public static void main(String[] args) throws IOException {
		try (RandomAccessFile raf = new RandomAccessFile("Exercise17_08.dat", "rw");) {
			if (raf.length() != 0) {
				int count = raf.readInt();
				raf.seek(0);
				raf.writeInt(count + 1);
			} else {
				raf.writeInt(1);
			}
		}
	}
}
