package Bootcamp_Zadaca13;

import java.util.Scanner;

public class ClanoviDjeljiviSa3 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] nizCijelihBrojeva = new int[10];
		int suma = 0;

		System.out.print("Unesite 10 cijelih brojeva: ");

		for (int i = 0; i < nizCijelihBrojeva.length; i++) {

			nizCijelihBrojeva[i] = unos.nextInt();

			if (nizCijelihBrojeva[i] % 3 == 0 && nizCijelihBrojeva[i] > 0)
				suma += nizCijelihBrojeva[i];
		}
		unos.close();

		System.out.print("Suma pozitivnih brojeva djeljivih sa 3 je: " + suma);
	}
}
