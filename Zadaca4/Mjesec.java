package Zadaca4;

import java.util.Scanner;

public class Mjesec {

	public static void main(String[] args) {

		int broj;

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite cijeli broj izmedju 1 i 12: ");
		broj = unos.nextInt();

		switch (broj) {

		case 1:
			System.out.println("Odabrani mjesec je januar.");
			break;
		case 2:
			System.out.println("Odabrani mjesec je februar.");
			break;

		case 3:
			System.out.println("Odabrani mjesec je mart.");
			break;
		case 4:
			System.out.println("Odabrani mjesec je april.");
			break;
		case 5:
			System.out.println("Odabrani mjesec je maj.");
			break;
		case 6:
			System.out.println("Odabrani mjesec je juni.");
			break;
		case 7:
			System.out.println("Odabrani mjesec je juli.");
			break;
		case 8:
			System.out.println("Odabrani mjesecje august.");
			break;
		case 9:
			System.out.println("Odabrani mjesec je septembar.");
			break;
		case 10:
			System.out.println("Odabrani mjesec je oktobar.");
			break;
		case 11:
			System.out.println("Odabrani mjesec je novembar.");
			break;
		case 12:
			System.out.println("Odabrani mjesec je decembar.");
			break;
		}
		unos.close();

	}
}
