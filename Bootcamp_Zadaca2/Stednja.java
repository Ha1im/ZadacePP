package Bootcamp_Zadaca2;

import java.util.Scanner;

public class Stednja {

	public static void stednja(double mjesecniIznos, int brojMjeseci) {
		
		double iznos = 0;

		for (int i = 1; i <= brojMjeseci; i++) {
			iznos = (iznos + mjesecniIznos) * 1.00417;
		}

		System.out.println("Iznos stednje za " + brojMjeseci+" je "+ iznos);
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite mjesecni iznos stednje: ");
		double mjesecniIznos = unos.nextDouble();
		System.out.print("Unesite broj mjeseci: ");
		int brojMjeseci = unos.nextInt();

		stednja(mjesecniIznos, brojMjeseci);

		unos.close();

	}

}
