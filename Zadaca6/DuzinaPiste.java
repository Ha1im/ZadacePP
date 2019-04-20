package Zadaca6;

import java.util.Scanner;

public class DuzinaPiste {
	public static void main(String[] args) {

		double brzina;
		double ubrzanje;
		double duzina;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite brzinu(v) i ubrzanje(a): ");
		brzina = unos.nextDouble();
		ubrzanje = unos.nextDouble();

		duzina = Math.pow(brzina, 2) / (2 * ubrzanje);
		System.out.println("Minimalna duzina piste za ovaj avion iznosi: " + duzina + " m");

		unos.close();

	}

}
