package Bootcamp_Zadaca1;

import java.util.Scanner;

public class SumaCifara {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		int i;
		int suma = 0;
		int broj;

		System.out.print("Unesite zeljeni cijeli broj: ");
		broj = unos.nextInt();

		while (broj < 0) {
			System.out.print("Unijeli ste negativan broj. Unesite pozitivan cijeli broj: ");
			broj = unos.nextInt();

		}

		while (broj > 0) {

			i = broj % 10;
			broj = broj / 10;
			suma = suma + i;

		}

		System.out.println("Suma cifara unesenog broja je: " + suma);

		unos.close();

	}
}