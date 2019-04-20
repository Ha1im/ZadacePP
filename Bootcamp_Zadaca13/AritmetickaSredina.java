package Bootcamp_Zadaca13;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int brojElemenata;
		double aritmetickaSredina, suma = 0.0;

		System.out.print("Unesite duzinu niza: ");
		brojElemenata = unos.nextInt();

		int[] nizCijelihBrojeva = new int[brojElemenata];

		System.out.print("Unesite " + brojElemenata + " cijelih brojeva: ");

		for (int i = 0; i < brojElemenata; i++) {

			nizCijelihBrojeva[i] = unos.nextInt();
			suma += nizCijelihBrojeva[i];
		}
		unos.close();

		aritmetickaSredina = suma / brojElemenata;

		System.out.println("Aritmeticka sredina clanova niza je: " + aritmetickaSredina);
	}
}
