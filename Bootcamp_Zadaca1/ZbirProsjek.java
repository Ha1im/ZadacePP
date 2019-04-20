package Bootcamp_Zadaca1;

import java.util.Scanner;

public class ZbirProsjek {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();

		double prosjek = 0.0;
		int brojac = 0;
		int suma = 0;
		int i = 1;

		while (i < broj) {
			if (i % 2 == 0) {
				suma = suma + i;
				brojac++;
				prosjek = suma / brojac;
			}
			i++;
		}

		System.out.println("Zbir svih parnih brojeva je: " + suma);
		System.out.println("Prosjek zbira parnih brojeva je. " + prosjek);

		unos.close();
	}

}
