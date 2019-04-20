package Zadaca4;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		int broj;
		int broj2;
		int cifra1;
		int cifra2;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite trocifreni cijeli broj: ");
		broj = unos.nextInt();

		cifra1 = broj % 10;
		broj = broj / 10;

		cifra2 = broj % 10;
		broj = broj / 10;

		broj2 = broj * 100 + cifra2 * 10 + cifra1 * 1;

		if (cifra1 == broj) {
			System.out.println("Broj " + broj2 + " je palindron.");
		} else {
			System.out.println("Broj " + broj2 + " nije palindron.");
		}
		unos.close();
	}

}
