package Bootcamp_Zadaca6;

import java.util.Scanner;

public class NeparniKarakteri {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		String unijetiString = new String();

		System.out.print("Unesite neki string: ");

		unijetiString = unos.nextLine();

		for (int i = 0; i < unijetiString.length(); i++)

			if (i % 2 != 0)

				System.out.print(unijetiString.charAt(i));

		unos.close();

	}

}
