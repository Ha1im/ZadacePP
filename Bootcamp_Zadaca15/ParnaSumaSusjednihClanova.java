package Bootcamp_Zadaca15;

import java.util.Scanner;

public class ParnaSumaSusjednihClanova {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] brojevi = new int[10];

		System.out.println("Unesite 10 brojeva: ");
		for (int x = 0; x < brojevi.length; x++) {
			System.out.print(x + ". element: ");
			brojevi[x] = unos.nextInt();
		}

		unos.close();

		System.out.print("Uneseni niz: ");
		for (int a : brojevi) {
			System.out.print(a + " ");
		}

		System.out.println("\nSusjedni clanovi niza sa parnom sumom su: ");
		for (int i = 0, j = 1; j < brojevi.length; i++, j++) {
			if ((brojevi[i] + brojevi[j]) % 2 == 0) {
				System.out.println(brojevi[i] + "," + brojevi[j] + "\t zbir:  " + (brojevi[i] + brojevi[j]));
			}
		}
	}

}
