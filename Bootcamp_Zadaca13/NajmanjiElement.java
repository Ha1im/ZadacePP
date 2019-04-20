package Bootcamp_Zadaca13;

import java.util.Scanner;

public class NajmanjiElement {

	public static int najmanjiNeparniIndex(int[] niz) {

		int najmanjiBroj = niz[1];

		for (int i = 3; i < niz.length; i += 2) {

			if (niz[i] < najmanjiBroj)
				najmanjiBroj = niz[i];
		}

		return najmanjiBroj;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] niz = new int[10];

		System.out.print("Unesite 10 cijelih brojeva: ");

		for (int i = 0; i < niz.length; i++) {

			niz[i] = unos.nextInt();
		}
		unos.close();

		System.out.println("Najmanji element koji se nalazi na neparnom indeksu  je " + najmanjiNeparniIndex(niz));
	}
}
