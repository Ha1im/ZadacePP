package Bootcamp_Zadaca15;

import java.util.Scanner;

public class CetiriUzastopnaBroja {

	public static void main(String[] args) {

		int duzina;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		duzina = unos.nextInt();

		int[] brojevi = new int[duzina];

		System.out.println("Unesite niz od " + duzina + " elemenata: ");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print("Unesite " + i + ". element: ");
			brojevi[i] = unos.nextInt();
		}

		unos.close();

		for (int x : brojevi) {
			System.out.print(x + ", ");
		}

		int uzastopnihCounter = 1;

		for (int a = 0, b = 1; b < brojevi.length; a++, b++) {
			if (brojevi[a] == brojevi[b]) {
				uzastopnihCounter++;
			} else if (brojevi[a] != brojevi[b] && uzastopnihCounter < 4) {
				uzastopnihCounter = 0;
			}
			;
		}

		if (uzastopnihCounter >= 4) {
			System.out.println("Ovaj niz sadrzi 4 ista broja uzastopno");
		} else
			System.out.println("Ovaj niz ne sadrzi 4 ista broja uzastopno");

	}

}