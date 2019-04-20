package Zadaca4;

import java.util.Scanner;

public class DjeljivBroj {
	public static void main(String[] args) {

		int broj;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		broj = unos.nextInt();

		System.out.println("Da li je broj djeljiv i sa 5 i sa 6? " + (broj % 5 == 0 && broj % 6 == 0));
		System.out.println("Da li je broj djeljiv sa 5 ili sa 6? " + (broj % 5 == 0 || broj % 6 == 0));
		System.out.println("Da li je broj djeljiv sa 5 ili sa 6, ali ne sa oba? " + (broj % 5 == 0 ^ broj % 6 == 0));

		unos.close();

	}

}
