package Bootcamp_Zadaca2;

import java.util.Scanner;

public class SumaParnihBrojeva {

	public static void main(String[] args) {
		int suma = 0;
		int broj;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		broj = unos.nextInt();

		for (int i = 1; i <= broj; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}

		System.out.print("Suma parnih brojeva od 1 do " + broj + " iznosi: " + suma);

		unos.close();

	}

}
