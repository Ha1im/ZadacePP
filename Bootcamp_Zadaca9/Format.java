package Bootcamp_Zadaca9;

import java.util.Scanner;

public class Format {

	public static String format(int number, int width) {

		int numberTemp = number;
		int brojac = 0;
		String nula = "";

		while (number != 0) {
			number /= 10;
			brojac++;
		}

		int krajnjaGranica = width - brojac;
		for (int i = 0; i < krajnjaGranica; i++) {
			nula += "0";
		}

		String rezultat;

		String numberString = String.valueOf(numberTemp);

		rezultat = nula + numberString;

		return rezultat;

	}

	public static void main(String[] args) {

	

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int broj = unos.nextInt();

		System.out.print("Unesite duzinu: ");
		int duzina = unos.nextInt();

		System.out.println(format(broj, duzina));

		unos.close();

	}

}