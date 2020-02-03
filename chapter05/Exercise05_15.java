package chapter05;

public class Exercise05_15 {
	public static void main(String[] args) {
		/*
		 * (ASCII karakter tablosunu gösterme) ASCII karakter tablosunda ! ’den ~ ‘ye
		 * kadar olan karakterleri gösteren bir program yazýnýz. Her satýrda on karakter
		 * gösteriniz. Ek B’de ASCII tablosu verilmiþtir. Karakterler arasýnda tam
		 * olarak bir boþluk bulunmalýdýr.
		 */
		int counter = 1;
		for (int a = 33; a <= 126; a++, counter++) {
			System.out.print(" " + (char) a);

			if (counter % 11 == 0)
				System.out.println("\n");
		}
	}
}
