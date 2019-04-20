package Bootcamp_Zadaca18;

import java.util.Scanner;

public class ZbirDvijeMatrice {

	public static double[][] saberiMatrice(double[][] a, double[][] b) {

		int redovi = a.length;
		int kolone = a[0].length;
		double[][] novaMatrica = new double[redovi][kolone];

		for (int red = 0; red < redovi; red++) {
			for (int kolona = 0; kolona < kolone; kolona++)
				novaMatrica[red][kolona] = a[red][kolona] + b[red][kolona];
		}
		return novaMatrica;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		System.out.print("Unesite prvu 3x3 matricu: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = unos.nextDouble();
			}
		}

		System.out.print("Unesite drugu 3x3 matricu: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = unos.nextDouble();
			}
		}
		unos.close();

		double[][] sumiranaMatrica = saberiMatrice(a, b);

		System.out.println("\nRezultirajuæa matrica:");
		for (int i = 0; i < sumiranaMatrica.length; i++) {
			for (int j = 0; j < sumiranaMatrica[i].length; j++) {
				System.out.print(sumiranaMatrica[i][j] + " ");
			}
			System.out.println();
		}

	}
}
