package Zadaca4;

import java.util.Scanner;

public class ProsjekOcjena {
	public static void main(String[] args) {

		int ocjena1;
		int ocjena2;
		int ocjena3;
		double prosjekOcjena;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite tri ocjene: ");
		ocjena1 = unos.nextInt();
		ocjena2 = unos.nextInt();
		ocjena3 = unos.nextInt();

		prosjekOcjena = (ocjena1 + ocjena2 + ocjena3) / 3.0;

		if (ocjena1 > 1 && ocjena2 > 1 && ocjena3 > 1) {
			System.out.println("Prosjek ocjena iznosi: " + prosjekOcjena);

		}

		else {
			System.out.println("Pali ste razred.");

		}
		unos.close();

	}

}
