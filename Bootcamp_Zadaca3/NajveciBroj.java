package Bootcamp_Zadaca3;

import java.util.Scanner;

public class NajveciBroj {
	public static void main(String[] args) {

		int brojevi = 1;
		int brojac = -1;
		int najveci = 0;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijele brojeve (unos prekida 0): ");

		do {

			brojevi = unos.nextInt();

			if (brojevi > najveci) {
				najveci = brojevi;
				brojac = 1;
			} else if (brojevi == najveci) {
				brojac++;

			}

		} while (brojevi != 0);

		System.out.print("Najveci broj od unesenih brojeva je " + najveci + ". Unesen je " + brojac + " puta.");

		unos.close();
	}
}
		

	
	
		
			
	
		
