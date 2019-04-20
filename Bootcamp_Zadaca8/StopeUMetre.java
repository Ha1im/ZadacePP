package Bootcamp_Zadaca8;

import java.util.Scanner;

public class StopeUMetre {

	public static double stopeUMetre(double stope) {
		double metar = stope * 0.305;
		return metar;
	}

	public static void main(String[] args) {

		int stopa;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite stope: ");
		stopa = unos.nextInt();

		unos.close();

		System.out.println(stopa + " stopa/e = " + stopeUMetre(stopa) + " m");

	}

}
