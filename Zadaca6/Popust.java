package Zadaca6;

import java.util.Scanner;

public class Popust {
	public static void main(String[] args) {

		double vrijednostRobe;
		double procenat;
		double popust;
		double ukupanIznos;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite vrijednost robe u KM: ");
		vrijednostRobe = unos.nextDouble();

		System.out.print("Unesite popust na gotovinsko placanje u procentima: ");
		procenat = unos.nextDouble();

		popust = (vrijednostRobe * procenat) / 100;
		ukupanIznos = vrijednostRobe - popust;

		System.out.println("Vrijednost popusta je: " + popust + " KM");
		System.out.println("Vrijednost robe sa popustom je: " + ukupanIznos + " KM");

		unos.close();
	}

}
