package Bootcamp_Zadaca7;

import java.util.Scanner;

public class VelikaMalaSlova {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite string: ");
		String unijetiString = unos.nextLine();

		double brojacVelikihSlova = 0;
		double brojacMalihSlova = 0;
		double procenatMalihSlova;
		double procenatVelikihSlova;

		for (int i = 0; i < unijetiString.length(); i++) {

			if (Character.isUpperCase(unijetiString.charAt(i))) {
				brojacVelikihSlova++;
			} else if (Character.isLowerCase(unijetiString.charAt(i))) {
				brojacMalihSlova++;
			}

		}

		procenatVelikihSlova = brojacVelikihSlova / unijetiString.length() * 100;
		System.out.println("Procenat velikih slova u stringu je: " + procenatVelikihSlova + " %");
		procenatMalihSlova = brojacMalihSlova / unijetiString.length() * 100;
		System.out.println("Procenat malih slova u stringu je: " + procenatMalihSlova + " %");
		unos.close();
	}

}