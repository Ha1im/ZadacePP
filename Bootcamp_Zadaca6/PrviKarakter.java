package Bootcamp_Zadaca6;

import java.util.Scanner;

public class PrviKarakter {

	public static void main(String[] args) {

		String unijetiString;
		int brojac = 0;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		unijetiString = unos.nextLine();

		for (int i = 0; i < unijetiString.length(); i++) {

			char karakter = unijetiString.charAt(i);

			for (int n = 0; n < unijetiString.length(); n++) {

				if (karakter == unijetiString.charAt(n)) {
					brojac++;
				}

			}

			if (brojac == 1) {

				System.out.println("Prvi karakter u stringu koji se ne ponavlja je: " + karakter);

				break;
			}

			else if (brojac > 1) {

				brojac = 0;
				continue;

			}

			unos.close();

		}
	}
}