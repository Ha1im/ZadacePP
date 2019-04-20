package Bootcamp_Zadaca5;

import java.util.Scanner;

public class Gradovi_po_abecedi {

	public static void main(String[] args) {

		String[] gradovi = new String[3];

		Scanner unos = new Scanner(System.in);

		for (int i = 0; i < gradovi.length; i++) {

			System.out.print("Unesite naziv grada: ");

			gradovi[i] = unos.nextLine();
		}

		unos.close();

		String temp = "";

		for (int i = 0; i < gradovi.length - 1; i++) {

			for (int n = i + 1; n < gradovi.length; n++) {

				if (gradovi[i].charAt(0) > gradovi[n].charAt(0)) {

					temp = gradovi[i];

					gradovi[i] = gradovi[n];

					gradovi[n] = temp;

				}

				else if (gradovi[i].charAt(0) == gradovi[n].charAt(0)) {

					if (gradovi[i].charAt(1) > gradovi[n].charAt(1)) {

						temp = gradovi[i];

						gradovi[i] = gradovi[n];

						gradovi[n] = temp;

					}

				}

			}

		}

		for (int i = 0; i < gradovi.length; i++) {

			System.out.println(gradovi[i]);

		}

	}

}
