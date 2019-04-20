package Bootcamp_Zadaca1;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite zeljeni cijeli broj: ");
		int broj = unos.nextInt();
		
		int i = 1;
		int faktorijel = 1;

		for (i = 1; i <= broj; i++) {
			faktorijel = faktorijel * i;
		}

		System.out.println("Faktorijel broja " + broj + " iznosi: " + faktorijel);

		unos.close();

	}

}
