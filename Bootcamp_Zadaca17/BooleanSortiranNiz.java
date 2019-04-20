package Bootcamp_Zadaca17;

import java.util.Scanner;

public class BooleanSortiranNiz {

	public static boolean isSortiran(int[] niz) {

		for (int i = 0; i < niz.length; i++) {

			for (int j = i; j < niz.length; j++) {
				if (niz[i] > niz[j])
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int duzinaNiza;

		System.out.print("Unesite duzinu niza: ");
		duzinaNiza = unos.nextInt();

		int[] niz = new int[duzinaNiza];

		System.out.print("Unesite " + duzinaNiza + " brojeva: ");
		for (int i = 0; i < niz.length; i++)
			niz[i] = unos.nextInt();

		unos.close();

		if (isSortiran(niz))
			System.out.println("Niz je sortiran");
		else
			System.out.println("Niz nije sortiran");

	}

}
