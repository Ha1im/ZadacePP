package Zadaca4;

import java.util.Scanner;

public class DvaPaketa {
	public static void main(String[] args) {

		double tezina1, cijena1;
		double tezina2, cijena2;
		double cijenag1;
		double cijenag2;
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite tezinu i cijenu prvog paketa: ");
		tezina1 = unos.nextDouble();
		cijena1 = unos.nextDouble();

		System.out.print("Unesite cijenu i tezinu drugog paketa: ");
		tezina2 = unos.nextDouble();
		cijena2 = unos.nextDouble();

		// cijena 1g u KM
		cijenag1 = cijena1 / tezina1;
		cijenag2 = cijena2 / tezina2;

		if (cijenag1 < cijenag2) {
			System.out.println("Bolju cijenu ima prvi paket.");
		}

		if (cijenag2 < cijenag1) {
			System.out.println("Bolju cijenu ima drugi paket.");

		}

		unos.close();
	}

}

