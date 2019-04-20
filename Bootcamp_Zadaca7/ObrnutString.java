package Bootcamp_Zadaca7;

import java.util.Scanner;

public class ObrnutString {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite string: ");
		String unijetiString = unos.nextLine();

		System.out.print("Obrnut string: ");
		for (int i = unijetiString.length() - 1; i > -1; i--) {
			System.out.print(unijetiString.charAt(i));
		}
		unos.close();
	}

}