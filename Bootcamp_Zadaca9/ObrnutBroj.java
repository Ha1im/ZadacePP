package Bootcamp_Zadaca9;

import java.util.Scanner;

public class ObrnutBroj {

	public static void obrnutiInt(int x) {
		int poslednjaCifra;

		while (x != 0) {
			poslednjaCifra = x % 10;
			System.out.print(poslednjaCifra);
			x = x / 10;
		}

	}

	public static void main(String[] args) {

		int broj;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		broj = unos.nextInt();

		System.out.print("Obrnut broj je: ");
		obrnutiInt(broj);

		unos.close();
	}

}
