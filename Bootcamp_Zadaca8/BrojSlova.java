package Bootcamp_Zadaca8;

import java.util.Scanner;

public class BrojSlova {

	public static int prebrojiSlova(String s) {
		int brojac = 0;

		for (int i = 0; i < s.length(); i++) {
			char karakter = s.charAt(i);
			if (Character.isAlphabetic(karakter)) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {

		String rijec;

		System.out.print("Unesite neki string: ");

		Scanner unos = new Scanner(System.in);
		rijec = unos.nextLine();

		unos.close();

		System.out.println("Broj slova u stringu: " + prebrojiSlova(rijec));

	}

}