package Zadaca4;

import java.util.Scanner;

public class RastuciBroj {

	public static void main(String[] args) {

		int broj1;
		int broj2;
		int broj3;
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite tri cijela broja:");
		broj1 = unos.nextInt();
		broj2 = unos.nextInt();
		broj3 = unos.nextInt();

		if (broj1 < broj2 && broj1 < broj3 && broj2 < broj3) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj1 + " " + broj2 + " " + broj3);

		}

		if (broj1 < broj2 && broj1 < broj3 && broj3 < broj2) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj1 + " " + broj3 + " " + broj2);
		}

		if (broj2 < broj1 && broj2 < broj3 && broj1 < broj3) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj2 + " " + broj1 + " " + broj3);
		}

		if (broj2 < broj1 && broj2 < broj3 && broj3 < broj1) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj2 + " " + broj3 + " " + broj1);
		}

		if (broj3 < broj1 && broj3 < broj2 && broj2 < broj1) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj3 + " " + broj2 + " " + broj1);
		}

		if (broj3 < broj1 && broj3 < broj2 && broj1 < broj2) {
			System.out.println("Brojevi u rastucem redoslijedu: " + broj3 + " " + broj1 + " " + broj2);
		}

		unos.close();
	}

}
