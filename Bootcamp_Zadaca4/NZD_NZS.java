package Bootcamp_Zadaca4;

import java.util.Scanner;

public class NZD_NZS {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite dva cijela broja: ");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();

		int najveciBroj = Math.max(broj1, broj2);

		for (int i = najveciBroj;; i++) {
			if (i % broj1 == 0 && i % broj2 == 0) {
				System.out.println("Najmanji zajednicki sadrzilac za " + broj1 + " i " + broj2 + " je " + i);
				break;
			}

		}

		System.out.print("Najveci zajednicki djelilac za " + broj1 + " i " + broj2 + " je ");
		do {
			int ostatak = broj2 % broj1;
			broj2 = broj1;
			broj1 = ostatak;

		} while (broj1 > 0);
		System.out.println(broj2);

		unos.close();
	}

}
