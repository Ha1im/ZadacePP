package Zadaca7;

import java.util.Scanner;

public class ObimPovrsinaKocke {
	public static void main(String[] args) {

		double duzinaIvice;
		double obim;
		double povrsina;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite duzinu ivice kocke u cm: ");
		duzinaIvice = unos.nextDouble();

		obim = 12 * duzinaIvice;
		System.out.println("Obim kocke cija je ivica " + duzinaIvice + " cm iznosi: " + obim + " cm");

		povrsina = 6 * Math.pow(duzinaIvice, 2);
		System.out.println("Povrsina kocke cija je ivica " + duzinaIvice + " cm iznosi: " + povrsina + " cm^2");

		unos.close();
	}

}
