package Bootcamp_Zadaca12;

import java.util.Scanner;

public class ObimPovrsinaKvadrata {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite stranicu kvadrata: ");
		int stranica = unos.nextInt();

		System.out.println("Obim kvadrata je: " + obim(stranica) + " cm");
		System.out.println("Povrsina kvadrata je: " + povrsina(stranica) + " cm^2");

		unos.close();
	}

	public static double obim(double stranica) {
		return 4 * stranica;
	}

	public static double povrsina(double stranica) {
		return stranica * stranica;
	}
}
