package Bootcamp_Zadaca4;

import java.util.Scanner;

public class Kombinacije_od1do7 {
	public static void main(String[] args) {

		int broj1, broj2, brojacKombinacija = 0;

		System.out.print("Unesite prvi broj: ");
		Scanner unos = new Scanner(System.in);
		broj1 = unos.nextInt();

		System.out.print("Unesite drugi broj: ");
		broj2 = unos.nextInt();

		System.out.println("Moguce kombinacije unesenih brojeva: ");

		for (int i = broj1; i < broj2; i++) {

			System.out.println();

			for (int j = i + 1; j <= broj2; j++) {

				if (i == j) {
					continue;
				}

				System.out.print(" " + i + "|" + j + "\t");

				brojacKombinacija++;
			}
		}

		System.out.println("\n\nBroj kombinacija je : " + brojacKombinacija);

		unos.close();
	}

}
