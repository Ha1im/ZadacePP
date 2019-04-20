package Bootcamp_Zadaca2;

import java.util.Scanner;

public class TablicaMnozenja {

	public static void main(String[] args) {
		int broj;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		broj = unos.nextInt();

		System.out.println("Tablica mnozenja za broj " + broj + ": \n");
		for (int i = 1; i <= 10; i++) {

			System.out.println(broj + " * " + i + " = " + (broj * i));
		}

		unos.close();

	}

}
