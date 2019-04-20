package Bootcamp_Zadaca16;

import java.util.Scanner;

public class Matrica4x4 {

	public static double sumirajSilaznuDijagonalu(double[][] niz) {

		double suma = 0;

		for (int i = 0; i < niz.length; i++)
			suma += niz[i][i];

		return suma;
	}

	public static double sumirajUzlazniDijagonalu(double[][] niz) {

		double suma = 0;
		int kolona = 0;
		for (int i = (niz.length - 1); i >= 0; i--) {
			suma += niz[i][kolona];
			kolona++;
		}

		return suma;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double[][] niz = new double[4][4];

		System.out.println("Unesite 4x4 matricu, red po red:");
		for (int i = 0; i < niz.length; i++)
			for (int j = 0; j < niz[i].length; j++)
				niz[i][j] = unos.nextDouble();

		unos.close();

		System.out.println("Suma svih elemenata duz silazne dijagonale je: " + sumirajSilaznuDijagonalu(niz));
		System.out.println("Suma svih elemenata duz uzlazne dijagonale je: " + sumirajUzlazniDijagonalu(niz));
	}
}
