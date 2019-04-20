package Bootcamp_Zadaca3;

import java.util.Scanner;

public class FaktoriBroja {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		int brojM = unos.nextInt();
		System.out.print("Faktori broja " + brojM + " su: ");
		for (int brojN = 1; brojN <= brojM; brojN++) {

			if (brojM % brojN == 0) {
				System.out.print(brojN + " ");
			}

		}
		unos.close();

	}

}
