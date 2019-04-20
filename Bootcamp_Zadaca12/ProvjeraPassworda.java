package Bootcamp_Zadaca12;

import java.util.Scanner;

public class ProvjeraPassworda {

	public static boolean isPassword(String password) {

		int digitCounter = 0;

		if (password.length() < 8)
			return false;

		for (int i = 0; i < password.length(); i++) {

			if (Character.isDigit(password.charAt(i)))
				digitCounter += 1;
			else if (!Character.isLetter(password.charAt(i)))
				return false;
		}
		if (digitCounter >= 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		String password = new String();

		System.out.print(
				"Unesite password (password mora biti najmanje 8 karaktera dug i mora biti sacinjen od slova i barem dva broja): ");
		password = unos.next();

		if (isPassword(password))
			System.out.println("Validan password");

		else
			System.out.println("Nije validan password.");
		password = unos.next();

		unos.close();
	}
}

