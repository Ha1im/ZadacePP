package Bootcamp_Zadaca8;

import java.util.Scanner;

public class PonavljanjeKaraktera {

	public static int brojacKaraktera(String str, char ch) {
		int brojac = 0;

		for (int i = 0; i < str.length(); i++) {
			char karakter = str.charAt(i);

			if (karakter == ch) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {

		String unijetiString;
		char character;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		unijetiString = unos.nextLine();

		System.out.print("Unesite karakter: ");
		character = unos.next(".").charAt(0);

		System.out.println("Karakter \"" + character + "\" u stringu \"" + unijetiString + "\" se pojavljuje: "
				+ brojacKaraktera(unijetiString, character) + " puta");

		unos.close();

	}

}
