package Bootcamp_Zadaca4;

import java.util.Scanner;

public class VelikaSlova {
	public static void main(String[] args) {

		int brojacVelikihSlova = 0;
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		String unijetiString = unos.nextLine();

		for (int i = 0; i < unijetiString.length(); i++) {
			if (Character.isUpperCase(unijetiString.charAt(i))) {
				brojacVelikihSlova++;

			}

		}

		System.out.println("Velikih slova u datom stringu ima: " + brojacVelikihSlova);

		unos.close();
	}
}