package Bootcamp_Zadaca19;

import java.util.Scanner;
import java.util.Arrays;

public class JedinstveniBrojevi {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int[] nizBrojeva = new int[10];
		int[] jedinstveniBrojevi = new int[10];
		boolean isJedinstven;
		int brojacJedinstvenihBrojeva = 0;

		System.out.print("Unesite 10 brojeva: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = unos.nextInt();
		}
		unos.close();

		Arrays.fill(jedinstveniBrojevi, -100);

		for (int i = 0; i < nizBrojeva.length; i++) {
			isJedinstven = true;

			for (int j = 0; j < nizBrojeva.length; j++) {
				if (nizBrojeva[i] == jedinstveniBrojevi[j]) {
					isJedinstven = false;
					break;
				}
			}
			if (isJedinstven) {
				jedinstveniBrojevi[i] = nizBrojeva[i];
				brojacJedinstvenihBrojeva++;
			}
		}

		Arrays.sort(jedinstveniBrojevi);

		System.out.print("Broj jedinstvenih brojeva je " + brojacJedinstvenihBrojeva + "\nJedinstveni brojevi su: ");
		for (int i = 0; i < jedinstveniBrojevi.length; i++) {
			if (jedinstveniBrojevi[i] == -100)
				continue;
			else
				System.out.print(jedinstveniBrojevi[i] + " ");
		}
	}
}
