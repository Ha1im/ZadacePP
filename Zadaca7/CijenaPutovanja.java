package Zadaca7;

import java.util.Scanner;

public class CijenaPutovanja {
	public static void main(String[] args) {

		int duzinaPuta;
		int potrosnjaAuta;
		double cijenaGoriva;
		double cijenaPutovanja;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite duzinu puta u kilometrima: ");
		duzinaPuta = unos.nextInt();

		System.out.print("Unesite potrosnju auta (koliko kilometara moze preci sa litrom goriva): ");
		potrosnjaAuta = unos.nextInt();

		System.out.print("Unesite cijenu litre goriva u KM: ");
		cijenaGoriva = unos.nextDouble();

		cijenaPutovanja = (duzinaPuta / potrosnjaAuta) * cijenaGoriva;
		System.out.println("Ukupna cijena putovanja iznosi: " + cijenaPutovanja + " KM");

		unos.close();

	}

}
