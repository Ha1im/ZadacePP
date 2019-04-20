package Bootcamp_Zadaca10;

import java.util.Scanner;

public class ZajednickiPrefiks {

	public static void zajednickiPrefiksStringova(String unijetiString1, String unijetiString2) {
		String prefiks = "";

		for (int i = 0; i < unijetiString1.length(); i++) {
			for (int n = 0; n < unijetiString2.length(); n++) {
				if (unijetiString1.charAt(i) == unijetiString2.charAt(n) && i == n) {
					prefiks += unijetiString2.charAt(n);
				}

				if (unijetiString1.charAt(i) != unijetiString2.charAt(n) && i == n) {
					break;
				}
			}
		}

		if (prefiks.length() == 0) {
			System.out.print(
					"\nStringovi \"" + unijetiString1 + "\" i \"" + unijetiString2 + "\" nemaju zajednicki prefiks!");
		} else {
			System.out.print("\nZajednicki prefiks za dva stringa je:\n" + prefiks);
		}

	}

	public static void main(String[] args) {
		String str1, str2;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite prvi string: ");
		str1 = unos.nextLine();
		System.out.print("Unesite drugi string: ");
		str2 = unos.nextLine();

		zajednickiPrefiksStringova(str1, str2);

		unos.close();

	}

}
