package Bootcamp_Zadaca9;

import java.util.Scanner;

public class KvizOduzimanja {

	public static void kviz(int brojPitanja) {

		Scanner unos = new Scanner(System.in);

		int tacanOdgovor, korisnikovOdgovor, temp;
		int brojacTacnih = 0;
		int brojacNetacnih = 0;

		for (int i = 1; i <= brojPitanja; i++) {
			int broj1 = (int) (Math.random() * 10);
			int broj2 = (int) (Math.random() * 10);

			if (broj1 < broj2) {

				temp = broj1;
				broj2 = broj1;
				broj2 = temp;
			}

			System.out.println("Koliko je: ");
			System.out.print(broj1 + "-" + broj2 + "= ");
			tacanOdgovor = broj1 - broj2;

			korisnikovOdgovor = unos.nextInt();

			if (korisnikovOdgovor == tacanOdgovor) {
				brojacTacnih++;

			} else {
				brojacNetacnih++;
			}

		}

		System.out.println("Rezultati!");
		System.out.println("Broj tacnih odgovora: " + brojacTacnih);
		System.out.println("Broj netacnih odgovora: " + brojacNetacnih);

		unos.close();
	}

	public static void main(String[] args) {
		int brojPitanja;

		Scanner unos = new Scanner(System.in);

		System.out.print("Koliko zelite pitanja? ");
		brojPitanja = unos.nextInt();

		kviz(brojPitanja);

		unos.close();

	}

}
