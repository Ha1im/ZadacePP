package Bootcamp_Zadaca18;

public class NajviseJedinica {

	public static void main(String[] args) {

		int[][] matrica = new int[4][4];
		int indexKolone = 0;
		int indexReda = 0;
		int brojJedinicaRed = 0;
		int brojJedinicaKolona = 0;

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (int) (Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matrica.length; i++) {
			int placeHolderRed = 0;
			int placeHolderKolona = 0;

			for (int j = 0; j < matrica[i].length; j++) {

				if (matrica[i][j] == 1)
					placeHolderRed++;

				if (matrica[j][i] == 1)
					placeHolderKolona++;
			}

			if (placeHolderKolona > brojJedinicaKolona) {
				brojJedinicaKolona = placeHolderKolona;
				indexKolone = i;
			}

			if (placeHolderRed > brojJedinicaRed) {
				brojJedinicaRed = placeHolderRed;
				indexReda = i;
			}
		}

		System.out.println("\nRed sa najvise jedinica: " + indexReda);
		System.out.println("Kolona sa najvise jedinica: " + indexKolone);
	}
}
