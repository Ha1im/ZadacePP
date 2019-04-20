package Bootcamp_Zadaca4;

import java.util.Scanner;

public class RazbijanjeStringa {
	public static void main(String[] args) {

		String recenica;

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite string: ");
		recenica = unos.nextLine();

		for (int i = 0; i < recenica.length(); i++) {

			char r = recenica.charAt(i);

			if (Character.isLetter(r)) {
				System.out.print(recenica.charAt(i));
			}

			if (r == ' ') {
				System.out.println();
			}
		}

		unos.close();

	}

}
