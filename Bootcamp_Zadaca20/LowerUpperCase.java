package Bootcamp_Zadaca20;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		String recenica = new String();
		double brojacVelikihSlova = 0.0, brojacMalihSlova = 0.0;
		double procenatMalihSlova, procenatVelikihSlova;

		System.out.print("Unesite recenicu: ");
		recenica = unos.next();
		unos.close();

		for (int i = 0; i < recenica.length(); i++) {
			if (Character.isLowerCase(recenica.charAt(i)))
				brojacMalihSlova++;
			else if (Character.isUpperCase(recenica.charAt(i)))
				brojacVelikihSlova++;
		}
		procenatMalihSlova = (brojacMalihSlova / recenica.length()) * 100;
		procenatVelikihSlova = (brojacVelikihSlova / recenica.length()) * 100;

		System.out.printf("lowercase: %.2f%s \nuppercase: %.2f%s", procenatMalihSlova, " %", procenatVelikihSlova, " %");

	}
}
