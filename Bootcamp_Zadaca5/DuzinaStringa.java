package Bootcamp_Zadaca5;

import java.util.Scanner;

public class DuzinaStringa {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		String unijetiString = unos.nextLine();

		System.out.println("Duzina stringa je: " + unijetiString.length());
		System.out.println("Prvo slovo stringa je: " + unijetiString.charAt(0));

		unos.close();
	}

}
