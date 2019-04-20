package Bootcamp_Zadaca19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PonavljanjeBrojeva {

	public static void count(int[] brojevi) {

		int index = 0;
		int count = 0;
		String puta = new String();
		int i = 0;

		Arrays.sort(brojevi);

		while (i < brojevi.length) {
			for (int j = index; j < brojevi.length; j++) {
				if (brojevi[i] == brojevi[j]) {
					count++;
					index = j;
				}
			}
			if (count > 1)
				puta = "puta";
			else
				puta = "put";

			System.out.println(brojevi[i] + " se pojavljuje " + count + " " + puta);
			count = 0;
			i = index + 1;
		}
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int inputNums = -1;
		ArrayList<Integer> placeHolder = new ArrayList<Integer>();

		System.out.print("Unesite brojeve: ");
		while (inputNums != 0) {
			inputNums = unos.nextInt();

			if (inputNums < 0 || inputNums > 100) {
				System.out.print("Pogresan unos!\n" + "Pokusajte ponovo: ");
				continue;
			}

			if (inputNums == 0)
				break;

			placeHolder.add(inputNums);
		}

		unos.close();

		int[] numbers = new int[placeHolder.size()];

		for (int i = 0; i < placeHolder.size(); i++) {
			numbers[i] = placeHolder.get(i);
		}

		placeHolder.clear();

		count(numbers);
	}

}
