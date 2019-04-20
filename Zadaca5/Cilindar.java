package Zadaca5;

// importovati Scanner
import java.util.Scanner;

public class Cilindar {
	public static void main(String[] args) {

		// deklarisati varijable
		double radius;
		double visina;
		double povrsina;
		double zapremina;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika za unos radiusa i visine cilindra
		System.out.print("Unesite radius(r) i visinu(h) cilindra: ");
		radius = unos.nextDouble();
		visina = unos.nextDouble();

		// izracunati povrsinu
		povrsina = (2 * Math.pow(radius, 2) * Math.PI) + (visina * 2 * radius * Math.PI);

		// izracunati zapreminu
		zapremina = (Math.pow(radius, 2) * Math.PI * visina);

		// ispisati rezultat korisniku
		System.out.println("Povrsina cilindra iznosi: " + povrsina);
		System.out.println("Zapremina cilindra iznosi: " + zapremina);

		// zatvoriti Scanner
		unos.close();

	}

}
