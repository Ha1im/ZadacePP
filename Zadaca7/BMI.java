package Zadaca7;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		double tezina;
		double visina;
		double BMI;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite svoju tezinu u kg: ");
		tezina = unos.nextDouble();

		System.out.print("Unesite svoju visinu u metrima: ");
		visina = unos.nextDouble();

		unos.close();

		BMI = tezina / Math.pow(visina, 2);
		System.out.println("Vas BMI iznosi: " + BMI);

	}

}