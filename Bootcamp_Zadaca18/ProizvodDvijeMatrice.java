package Bootcamp_Zadaca18;

import java.util.Scanner;

public class ProizvodDvijeMatrice {

	public static double[][] mnozenjeMatrica(double[][] a, double[][] b) {

		int brojRedova = a.length;
		int brojKolona = a[0].length;
		double[][] novaMatrica = new double[brojRedova][brojKolona];
		double sum = 0;

		for (int red = 0; red < brojRedova; red++) {
			for (int kolona = 0; kolona < brojKolona; kolona++) {
				for (int k = 0; k < brojKolona; k++) {
					sum += a[red][k] * b[k][kolona];
				}

				novaMatrica[red][kolona] = sum;
				sum = 0;
			}
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

		double[][] pomnozenaMatrica = mnozenjeMatrica(a, b);

		System.out.println("\nRezultirajuæa matrica: ");
		for (int i = 0; i < pomnozenaMatrica.length; i++) {
			for (int j = 0; j < pomnozenaMatrica[i].length; j++) {
				System.out.printf("%.2f ", pomnozenaMatrica[i][j]);
			}
			System.out.println();
		}

	}
}
