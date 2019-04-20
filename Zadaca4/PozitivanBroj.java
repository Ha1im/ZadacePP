package Zadaca4;

import java.util.Scanner;

public class PozitivanBroj {

	public static void main(String[] args) {

		int broj1;
		int broj2;

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja: ");
		broj1 = unos.nextInt();
		broj2 = unos.nextInt();

		if (broj1 > 0 && broj2 > 0) {
			System.out.println("Oba broja su pozitivna");
		}
		else if (broj1 > 0 && broj2 < 0) {
			System.out.println("Prvi broj je pozitivan a drugi broj je negativan.");
		}
		else if (broj1 < 0 && broj2 > 0) {
			System.out.println("Prvi broj je negativan a drugi broj je pozitivan.");
		}
		else if (broj1 < 0 && broj2 < 0) {
			System.out.println("Oba broja su negativna.");
		}
		else if (broj1 < 0 && broj2 == 0) {
			System.out.println("Prvi broj je negativan a drugi broj je neutralan.");
		}
		else if (broj1 > 0 && broj2 == 0) {
			System.out.println("Prvi broj je pozitivan a drugi broj je neutralan.");
		}
		else if (broj1 == 0 && broj2 < 0) {
			System.out.println("Prvi broj je neutralan a drugi broj je negativan.");
		}
		else if (broj1 == 0 && broj2 > 0) {
			System.out.println("Prvi broj je neutralan a drugi broj je pozitivan.");
		}
		else if (broj1 == 0 && broj2 == 0) {
			System.out.println("Oba broja su neutralna.");
		}
		unos.close();
	}
}