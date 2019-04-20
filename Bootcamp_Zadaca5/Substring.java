package Bootcamp_Zadaca5;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {

		String prviString;
		String drugiString;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite prvi string: ");
		prviString = unos.nextLine();

		System.out.print("Unesite drugi string: ");
		drugiString = unos.nextLine();

		if (prviString.toLowerCase().contains(drugiString.toLowerCase())) {

			System.out.println(drugiString + " je substring stringa " + prviString);
		} else {

			System.out.println(drugiString + " nije substring stringa " + prviString);

			unos.close();
		}
	}

}
