package Bootcamp_Zadaca17;

public class Matrica7x7 {

	public static void main(String[] args) {

		int[][] uposleniciSati = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 } };
		int[][] sumaSati = new int[7][2];

		for (int i = 0; i < uposleniciSati.length; i++) {

			int suma = 0;

			for (int j = 0; j < uposleniciSati[i].length; j++) {

				suma += uposleniciSati[i][j];
			}
			sumaSati[i][0] = i;
			sumaSati[i][1] = suma;
			suma = 0;
		}

		for (int i = 0; i < sumaSati.length; i++) {

			int max = sumaSati[i][1];
			int index = i;
			int[] uposlenik = sumaSati[i];

			for (int j = i; j < sumaSati.length; j++) {

				if (sumaSati[j][1] > max) {
					max = sumaSati[j][1];
					uposlenik = sumaSati[j];
					index = j;
				}
			}
			sumaSati[index] = sumaSati[i];
			sumaSati[i] = uposlenik;
		}

		for (int i = 0; i < sumaSati.length; i++) {

			System.out.println("Zaposlenik " + sumaSati[i][0] + " - ukupan broj odradjenih sati: " + sumaSati[i][1]);
		}
	}
}
