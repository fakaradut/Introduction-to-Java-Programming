package chapter05;

import java.util.Scanner;

public class Exercise05_08 {
	public static void main(String[] args) {

		/*
		 * (En yüksek puaný bulma.) Kullanýcýdan toplam öðrenci sayýsýný ve her
		 * öðrencinin adý ve puanýný alan ve ardýndan en yüksek puana sahip öðrencinin
		 * adýný gösteren bir program yazýnýz.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("toplam ogrenci sayisini girin");
		final int ogrenciSayisi = input.nextInt();

		System.out.println("Her ogrencinin adi ve puanini girin. ");
		int enYuksekDeger = 0;
		String enYuksekPuanliOgrenci = "";

		for (int x = 0; x < ogrenciSayisi; x++) {
			String ad = input.next();
			String ogrenciPuan = input.next();
			int puan = Integer.parseInt(ogrenciPuan);
			if (puan > enYuksekDeger) {
				enYuksekDeger = puan;
				enYuksekPuanliOgrenci = ad;
			}

		}
		System.out.println("en yuksek puani alan: " + enYuksekPuanliOgrenci + " " + enYuksekDeger + " puan ile.");
	}
}
