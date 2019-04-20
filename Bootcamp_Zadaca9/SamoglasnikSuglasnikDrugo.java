package Bootcamp_Zadaca9;

import java.util.Scanner;

public class SamoglasnikSuglasnikDrugo {

	public static void karakterTest(char ch) {

		char karakter = Character.toUpperCase(ch);

		if (Character.isAlphabetic(ch)) {

			if (karakter == 'A' || karakter == 'E' || karakter == 'I' || karakter == 'O' || karakter == 'U') {
				System.out.println(ch + " je samoglasnik.");
			} else {
				System.out.println(ch + " je suglasnik.");
			}
		}

		else {
			System.out.println(ch + " predstavlja pogresan unos!");
		}

	}

	public static void main(String[] args) {

		char karakter;

		System.out.print("Unesite karakter: ");

		Scanner unos = new Scanner(System.in);

		karakter = unos.next(".").charAt(0);

		karakterTest(karakter);

		unos.close();

	}

}
