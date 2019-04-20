package Bootcamp_Zadaca15;

import java.util.Scanner;

public class NajveciElement {

	public static int max(int[] array) {

		int maxNum = array[0];

		for (int i = 0; i < array.length; i++) {

			if (Math.abs(array[i]) > Math.abs(maxNum))
				maxNum = array[i];
		}

		return maxNum;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int velicinaNiza;

		System.out.print("Unesite duzinu niza: ");
		velicinaNiza = unos.nextInt();

		int[] array = new int[velicinaNiza];
		System.out.print("Unesite " + velicinaNiza + " brojeva: ");

		for (int i = 0; i < array.length; i++)
			array[i] = unos.nextInt();

		unos.close();

		System.out.println("Najveci broj po apsolutnoj vrijednosti u nizu je " + max(array));
	}

}
