package Bootcamp_Zadaca13;

import java.util.Scanner;

public class SumaParnihNeparnihBrojeva {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] nizCijelihBrojeva = new int[10];
		int sumaParnih = 0, sumaNeparnih = 0;

		System.out.print("Unesite 10 cijelih brojeva: ");

		for (int i = 0; i < nizCijelihBrojeva.length; i++) {

			nizCijelihBrojeva[i] = unos.nextInt();

			if (nizCijelihBrojeva[i] % 2 == 0)
				sumaParnih += nizCijelihBrojeva[i];
			else
				sumaNeparnih += nizCijelihBrojeva[i];
		}
		unos.close();

		System.out.println("Suma neparnih elemenata je: " + sumaNeparnih + "\nSuma parnih elemenata je: " + sumaParnih);
	}
}
