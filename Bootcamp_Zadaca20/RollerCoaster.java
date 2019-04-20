package Bootcamp_Zadaca20;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		String recenica = new String();
		int mjesto = 1;

		System.out.print("Unesite recenicu: ");
		recenica = unos.nextLine();
		unos.close();

		for (int i = 0; i < recenica.length(); i++) {
			if (!Character.isLetter(recenica.charAt(i))) {
				System.out.print(recenica.charAt(i));
				mjesto *= -1;
				continue;
			}

			if (mjesto == 1) {
				if (i % 2 == 0)
					System.out.print(Character.toUpperCase(recenica.charAt(i)));
				else
					System.out.print(Character.toLowerCase(recenica.charAt(i)));
			} else {
				if (i % 2 != 0)
					System.out.print(Character.toUpperCase(recenica.charAt(i)));
				else
					System.out.print(Character.toLowerCase(recenica.charAt(i)));
			}
		}
	}
}
