package Bootcamp_Zadaca5;

import java.util.Scanner;

public class SocialSecurityNumber {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		String SSN;

		do {

			System.out.print("Unesite vas \"Social Security Number\" u formatu (DDD-DD-DDDD): ");
			SSN = unos.nextLine();
		}

		while (!socialSecurityNumber(SSN));

		unos.close();
	}

	public static boolean socialSecurityNumber(String SSN) {

		if (SSN.length() != 11) {

			return false;
		}

		for (int i = 0; i < SSN.length(); i++) {

			if (i == 3 || i == 6) {

				if (SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {

					return false;

				}

			}

			else {

				if (!Character.isDigit(SSN.charAt(i))) {

					return false;

				}

			}

		}

		return true;

	}

}
