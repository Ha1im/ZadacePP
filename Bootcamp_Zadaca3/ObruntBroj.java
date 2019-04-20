package Bootcamp_Zadaca3;

import java.util.Scanner;

public class ObruntBroj {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();

		while (broj <= 0) {
			System.out.println("Unijeli ste negativan broj. Molimo vas unesite pozitivan cijeli broj.");
			broj = unos.nextInt();
		}
		System.out.print("Obrnut broj: ");

		while (broj != 0) {
			int ostatak = broj % 10;
			broj = broj / 10;
			System.out.print(ostatak + " ");

			unos.close();
		}
	}
}
