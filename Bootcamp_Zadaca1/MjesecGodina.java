package Bootcamp_Zadaca1;

import java.util.Scanner;

public class MjesecGodina {
	public static void main(String[] args) {

		int mjesec;
		int godina;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite mjesec: ");
		mjesec = unos.nextInt();
		System.out.print("Unesite godinu: ");
		godina = unos.nextInt();

		while (mjesec < 0 || mjesec > 12 || godina < 0) {
			System.out.println("Unos nije validan. Pokusajte ponovo. ");
			System.out.print("Unesite mjesec: ");
			mjesec = unos.nextInt();
			System.out.print("Unesite godinu: ");
			godina = unos.nextInt();

		}

		switch (mjesec) {
		case 1:
			System.out.println("Januar " + godina + " ima 31 dan.");
			break;
		}

		if (mjesec == 2 && (godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
			System.out.println("Februar " + godina + " ima 29 dana.");

		} else {

			switch (mjesec) {
			case 2:
				System.out.println("Februar " + godina + " ima 28 dana.");
				break;
			}

		}

		switch (mjesec) {
		case 3:
			System.out.println("Mart " + godina + " ima 31 dan.");
			break;
		}

		switch (mjesec) {
		case 4:
			System.out.println("April " + godina + " ima 30 dana.");
			break;
		}

		switch (mjesec) {
		case 5:
			System.out.println("Maj " + godina + " ima 31 dan.");
			break;
		}

		switch (mjesec) {
		case 6:
			System.out.println("Juni " + godina + " ima 30 dana.");
			break;
		}

		switch (mjesec) {
		case 7:
			System.out.println("Juli " + godina + " ima 31 dan.");
			break;
		}

		switch (mjesec) {
		case 8:
			System.out.println("August " + godina + " ima 31 dan.");
			break;
		}

		switch (mjesec) {
		case 9:
			System.out.println("Septembar " + godina + " ima 30 dana.");
			break;
		}

		switch (mjesec) {
		case 10:
			System.out.println("Oktobar " + godina + " ima 31 dan.");
			break;
		}

		switch (mjesec) {
		case 11:
			System.out.println("Novembar " + godina + " ima 30 dana.");
			break;
		}

		switch (mjesec) {
		case 12:
			System.out.println("Decembar " + godina + " ima 31 dan.");
			break;
		}

		unos.close();

	}
}
