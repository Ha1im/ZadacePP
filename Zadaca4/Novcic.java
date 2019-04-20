package Zadaca4;

import java.util.Scanner;

public class Novcic {

	public static void main(String[] args) {
		int broj = (int) (Math.random() * 2);
		int unosKorisnika;

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite ishod bacanja novcica(0 - pismo, 1-glava): ");
		unosKorisnika = unos.nextInt();

		if (unosKorisnika == broj) {
			System.out.println("Svaka cast pogodili ste.");
		}

		if (unosKorisnika != broj && broj == 0) {
			System.out.println("Pogrijesili ste ishod bacanja je pismo.");

		}

		if (unosKorisnika != broj && broj == 1) {
			System.out.println("Pogrijesili ste ishod bacanja je glava.");

		}

		unos.close();

	}

}
			 
			 
		 
	
	
	 
		 


