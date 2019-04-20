package Bootcamp_Zadaca3;

import java.util.Scanner;

public class NZS {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int broj1 = unos.nextInt();
		System.out.print("Unesite drugi broj: ");
		int broj2 = unos.nextInt();

		int veciBroj = Math.max(broj1, broj2);
		for (int i = veciBroj; i > 0; i++) {
			if (i % broj1 == 0 && i % broj2 == 0) {
				System.out.println("Najmanji zajednicki sadrzalac: " + i);
				break;
			}

		}
		unos.close();

	}

}
