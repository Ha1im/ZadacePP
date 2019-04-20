package Zadaca4;

import java.util.Scanner;

public class Sabiranje {
	public static void main(String[] args) {

		int broj1 = (int) (Math.random() * 11);
		int broj2 = (int) (Math.random() * 11);
		int broj3 = (int) (Math.random() * 11);
		int unosKorisnika;
		int rezultat = broj1 + broj2 + broj3;

		Scanner unos = new Scanner(System.in);

		System.out.println("Koliko iznosi " + broj1 + " + " + broj2 + " + " + broj3 + "?");
		unosKorisnika = unos.nextInt();

		if (unosKorisnika == rezultat) {
			System.out.println("Odgovor je tacan.");
		} else {
			System.out.println("Odgovor nije tacan. Tacan odgovor je " + rezultat);
		}

		unos.close();
	}

}
