package Bootcamp_Zadaca17;

import java.util.Scanner;

public class LokacijaNajvecegElementa {

	public static int[] najveciElement(double[][] niz) {

		int[] najveciElement = { 0, 0 };

		for (int i = 0; i < niz.length; i++) {

			int index1 = najveciElement[0];
			int index2 = najveciElement[1];

			for (int j = 0; j < niz[i].length; j++) {

				if (niz[index1][index2] < niz[i][j]) {
					index1 = i;
					index2 = j;
				}
			}
			najveciElement[0] = index1;
			najveciElement[1] = index2;
		}

		return najveciElement;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int red, kolona;
		int[] najveciElementIndexi;

		System.out.print("Unesite broj redova i kolona niza: ");
		red = unos.nextInt();
		kolona = unos.nextInt();

		double[][] niz = new double[red][kolona];

		System.out.printf("Unesite %dx%d matricu:\n", red, kolona);
		for (int i = 0; i < niz.length; i++) {

			for (int j = 0; j < niz[i].length; j++) {

				niz[i][j] = unos.nextDouble();
			}
		}
		unos.close();

		najveciElementIndexi = najveciElement(niz);

		System.out.printf("Lokacija najveceg elementa: (%d, %d)", najveciElementIndexi[0], najveciElementIndexi[1]);
	}
}
