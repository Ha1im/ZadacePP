package Bootcamp_Zadaca7;

import java.util.Scanner;

public class BrojNovcica {
	public static void main(String[] args) {

		int brojac1, brojac3, brojac5;
		int ostatakOd3, ostatakOd5;
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite iznos: ");
		int iznos = unos.nextInt();

		brojac5 = iznos / 5; 
		ostatakOd5 = iznos % 5; 

		brojac3 = ostatakOd5 / 3; 
		ostatakOd3 = ostatakOd5 % 3; 

		brojac1 = ostatakOd3;

		System.out.println("Broj potrebnih novcica: " + (brojac1 + brojac3 + brojac5));

		unos.close();
	}

}