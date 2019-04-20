package Bootcamp_Zadaca6;

import java.util.Scanner;

public class CijeliBroj_u_Binarni {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite neki broj: ");
		int broj = unos.nextInt();

		String binarniBroj = new String();

		binarniBroj = Integer.toBinaryString(broj);

		System.out.println("Binarna reprezentacija broja " + broj + " je: " + binarniBroj);

		unos.close();
	}

}
