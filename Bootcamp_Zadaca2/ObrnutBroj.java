package Bootcamp_Zadaca2;

import java.util.Scanner;

public class ObrnutBroj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();

		System.out.print("Obrnut broj je: ");

		while (broj != 0) {
			int ostatak = broj % 10;
			broj = broj / 10;

			System.out.print(ostatak);
		}

		unos.close();

	}

}
