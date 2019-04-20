package Zadaca7;

import java.util.Scanner;

public class MjesecGodina {
	public static void main(String[] args) {

		int mjesec;
		int godina;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite mjesec i godinu: ");
		mjesec = unos.nextInt();
		godina = unos.nextInt();

		switch (mjesec) {
		case 1:
			System.out.println("Januar " + godina + " je imao 31 dan.");
			break;
		}

		if (mjesec == 2 && (godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
			System.out.println("Februar " + godina + " je imao 29 dana.");

		} else {

			switch (mjesec) {
			case 2:
				System.out.println("Februar " + godina + " je imao 28 dana.");
				break;
			}

		}

		switch (mjesec) {
		case 3:
			System.out.println("Mart " + godina + " je imao 31 dan.");
			break;
		}

		switch (mjesec) {
		case 4:
			System.out.println("April " + godina + " je imao 30 dana.");
			break;
		}

		switch (mjesec) {
		case 5:
			System.out.println("Maj " + godina + " je imao 31 dan.");
			break;
		}

		switch (mjesec) {
		case 6:
			System.out.println("Juni " + godina + " je imao 30 dana.");
			break;
		}

		switch (mjesec) {
		case 7:
			System.out.println("Juli " + godina + " je imao 31 dan.");
			break;
		}

		switch (mjesec) {
		case 8:
			System.out.println("August " + godina + " je imao 31 dan.");
			break;
		}

		switch (mjesec) {
		case 9:
			System.out.println("Septembar " + godina + " je imao 30 dana.");
			break;
		}

		switch (mjesec) {
		case 10:
			System.out.println("Oktobar " + godina + " je imao 31 dan.");
			break;
		}

		switch (mjesec) {
		case 11:
			System.out.println("Novembar " + godina + " je imao 30 dana.");
			break;
		}

		switch (mjesec) {
		case 12:
			System.out.println("Decembar " + godina + " je imao 31 dan.");
			break;
		}

		unos.close();

	}
}
