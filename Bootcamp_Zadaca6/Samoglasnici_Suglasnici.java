package Bootcamp_Zadaca6;

import java.util.Scanner;

public class Samoglasnici_Suglasnici {

	private static void brojSuglasnikaSamoglasnika(String unijetiString) {

		int samoglasnik = 0;

		int suglasnik = 0;

		int duzinaStringa = unijetiString.length();

		unijetiString = unijetiString.toLowerCase();

		for (int i = 0; i < duzinaStringa; i++) {

			if (Character.isAlphabetic(unijetiString.charAt(i)))

				switch (unijetiString.charAt(i)) {

				case 'a':

				case 'e':

				case 'i':

				case 'o':

				case 'u':

					samoglasnik++;

					break;

				default:

					suglasnik++;

					break;

				}

		}
		System.out.println("U stringu: " + "\"" + unijetiString + "\"" + " ima " + samoglasnik + " samoglasnika i "

				+ suglasnik + " suglasnika.");

	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");

		brojSuglasnikaSamoglasnika(unos.nextLine());

		unos.close();

	}

}