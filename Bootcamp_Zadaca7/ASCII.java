package Bootcamp_Zadaca7;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {

		int code;
		char asciiChar;
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite ASCII code: ");
		code = unos.nextInt();

		asciiChar = (char) code;

		System.out.println("Karakter za ASCII code " + code + " je: " + asciiChar);

		unos.close();
	}

}
