package Bootcamp_Zadaca10;

public class Kombinacije_od1do7 {

	public static void kombinacije() {
		int brojac = 0;
		for (int i = 1; i < 7; i++) {

			System.out.println();

			for (int n = i + 1; n <= 7; n++) {

				if (i == n) {
					continue;
				}

				System.out.print(" " + i + "|" + n + "\t");

				brojac++;
			}
		}
		System.out.print("\nIma ukupno " + brojac + " kombinacija.");
	}

	public static void main(String[] args) {
		kombinacije();
	}

}
