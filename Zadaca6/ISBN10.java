package Zadaca6;

import java.util.Scanner;

public class ISBN10 {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite prvih devet brojeva: ");
		int d1 = unos.nextInt();
		int d2 = unos.nextInt();
		int d3 = unos.nextInt();
		int d4 = unos.nextInt();
		int d5 = unos.nextInt();
		int d6 = unos.nextInt();
		int d7 = unos.nextInt();
		int d8 = unos.nextInt();
		int d9 = unos.nextInt();

		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (checksum == 10) {
			System.out
					.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");
		} else {
			System.out.println(
					d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + checksum);
		}
		unos.close();

	}
}
