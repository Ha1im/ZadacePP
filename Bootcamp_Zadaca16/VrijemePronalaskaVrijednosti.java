package Bootcamp_Zadaca16;

import java.util.Scanner;
import java.util.Arrays;

public class VrijemePronalaskaVrijednosti {

	public static boolean linearSearch(int nizBrojeva[], int brojZaPretraziti) {

		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] == brojZaPretraziti) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int brojZaPretraziti;
		int[] nizBrojeva = new int[100000];
		long pocetakMjerenja, krajMjerenja;
		long potrebnoVrijemeLinearno = 0;
		long potrebnoVrijemeBinarno = 0;

		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = (int) (Math.random() * 100000);
		}
		System.out.print("Unesite broj koji zelite provjeriti da li se nalazi u nizu: ");
		brojZaPretraziti = unos.nextInt();
		unos.close();

		pocetakMjerenja = System.currentTimeMillis();
		if (linearSearch(nizBrojeva, brojZaPretraziti)) {
			krajMjerenja = System.currentTimeMillis();
			potrebnoVrijemeLinearno = krajMjerenja - pocetakMjerenja;
		} else {
			System.out.println("Broj nije moguce pronaci.");
			System.exit(1);
		}

		Arrays.sort(nizBrojeva);

		pocetakMjerenja = System.currentTimeMillis();
		Arrays.binarySearch(nizBrojeva, brojZaPretraziti);
		krajMjerenja = System.currentTimeMillis();

		potrebnoVrijemeBinarno = krajMjerenja - pocetakMjerenja;

		System.out.println("Vrijeme potrebno za linearno pretrazivanje je " + potrebnoVrijemeLinearno + " ms"
				+ "\nVrijeme potrebno za binarno " + "pretrazivanje je " + potrebnoVrijemeBinarno + " ms");

	}

}
