package Bootcamp_Zadaca14;

import java.util.Scanner;

public class MapiranjeBrojeva {

	public static int getNumFromPad(char c) {

		char[][] numPad = { { 'a', 'b', 'c' }, { 'd', 'f', 'e' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
				{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
		int numPadOffset = 2;

		c = Character.toLowerCase(c);

		for (int i = 0; i < numPad.length; i++) {
			for (int j = 0; j < numPad[i].length; j++) {
				if (numPad[i][j] == c)
					return (i + numPadOffset);
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		char c;

		System.out.print("Unesite slovo: ");
		c = unos.next().charAt(0);
		unos.close();

		if (getNumFromPad(c) != -1)
			System.out.println("Odgovarajuci broj je: " + getNumFromPad(c));
		else
			System.out.println(c + " predstavlja pogresan unos");
	}
}
