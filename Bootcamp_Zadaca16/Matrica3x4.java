package Bootcamp_Zadaca16;

import java.util.Scanner;

public class Matrica3x4 {

	public static double sumirajKolonu(double[][] niz, int kolona) {

		double sumaKolone = 0;

		for (int i = 0; i < niz.length; i++)
			sumaKolone += niz[i][kolona];

		return sumaKolone;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double[][] niz = new double[3][4];

		System.out.println("Unesite 3x4 matricu, red po red: ");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++)
				niz[i][j] = unos.nextDouble();
		}
		unos.close();

		for (int i = 0; i < niz[0].length; i++)
			System.out.println("Zbir svih elemenata u koloni " + i + " je: " + sumirajKolonu(niz, i));
	}
}
