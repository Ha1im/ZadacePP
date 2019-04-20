package Bootcamp_Zadaca19;

import java.util.Scanner;

public class IznadIspodProsjeka {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double[] brojcaniRezultati = new double[100];
		double prosjek;
		double suma = 0;
		int uneseniBrojevi = 0;
		int iznadProsjeka = 0, ispodProsjeka = 0;

		System.out.print("Unesite brojeve (max 100). Negativnim brojem prekidate unos: ");
		while (uneseniBrojevi < brojcaniRezultati.length) {
			brojcaniRezultati[uneseniBrojevi] = unos.nextDouble();

			if (brojcaniRezultati[uneseniBrojevi] < 0)
				break;

			suma += brojcaniRezultati[uneseniBrojevi];
			uneseniBrojevi++;
		}
		unos.close();

		prosjek = suma / uneseniBrojevi;

		for (int i = 0; i < uneseniBrojevi; i++) {
			if (brojcaniRezultati[i] >= prosjek)
				iznadProsjeka++;
			else if (brojcaniRezultati[i] < prosjek)
				ispodProsjeka++;
		}

		System.out.println(iznadProsjeka + " broj/a je/su ili iznad prosjeka ili " + "su jednaki prosjeku");
		System.out.println(ispodProsjeka + " broj/a je/su ispod prosjeka");
	}
}
