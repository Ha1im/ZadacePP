package Bootcamp_Zadaca8;

import java.util.Scanner;

public class RastuciBrojevi {

	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3) {
		System.out.println("Uneseni brojevi u rastucem redosijedu: ");
		if (broj1 < broj2 && broj2 < broj3) {
			System.out.println(broj1 + "\n" + broj2 + "\n" + broj3);
		} else if (broj1 < broj3 && broj3 < broj2) {
			System.out.println(broj1 + "\n" + broj3 + "\n" + broj2);
		} else if (broj2 < broj1 && broj1 < broj3) {
			System.out.println(broj2 + "\n" + broj1 + "\n" + broj3);
		} else if (broj2 < broj3 && broj3 < broj1) {
			System.out.println(broj2 + "\n" + broj3 + "\n" + broj1);
		} else if (broj3 < broj1 && broj1 < broj2) {
			System.out.println(broj3 + "\n" + broj1 + "\n" + broj2);
		} else if (broj3 < broj2 && broj2 < broj1) {
			System.out.println(broj3 + "\n" + broj2 + "\n" + broj1);
		}
	}

	public static void main(String[] args) {

		double broj1, broj2, broj3;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite tri broja: ");
		broj1 = unos.nextDouble();
		broj2 = unos.nextDouble();
		broj3 = unos.nextDouble();

		ispisiSortiraneBrojeve(broj1, broj2, broj3);
		unos.close();
	}
}
