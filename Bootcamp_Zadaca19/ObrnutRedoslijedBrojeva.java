package Bootcamp_Zadaca19;

import java.util.Scanner;

public class ObrnutRedoslijedBrojeva {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] brojevi = new int[10];

		System.out.print("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = unos.nextInt();
		}
		unos.close();

		System.out.print("Brojevi u obrnutom redoslijedu: ");
		for (int i = (brojevi.length - 1); i >= 0; i--) {
			System.out.print(brojevi[i] + " ");
		}
	}
}
