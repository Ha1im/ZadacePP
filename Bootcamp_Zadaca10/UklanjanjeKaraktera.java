package Bootcamp_Zadaca10;

import java.util.Scanner;

public class UklanjanjeKaraktera {

	public static String ukloniKarakter(String str, char ch) {

		String rezultat = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {

				continue;
			}

			rezultat += str.charAt(i);
		}

		return rezultat;
	}

	public static void main(String[] args) {

		String unijetiString;
		char karakterZaUkloniti;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string:");
		unijetiString = unos.nextLine();

		System.out.print("Unesite karakter koji zelite ukloniti u unesenom stringu: ");
		karakterZaUkloniti = unos.next(".").charAt(0);

		System.out.print("Rezultat:");
		System.out.println(ukloniKarakter(unijetiString, karakterZaUkloniti));

		unos.close();

	}

}