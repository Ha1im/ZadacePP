package Zadaca5;

// importovati Scanner
import java.util.Scanner;

public class Racun {
	public static void main(String[] args) {

		// deklarisati varijable
		double osnovniRacun;
		double procenat;
		double napojnica;
		double ukupanRacun;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika za unos osnovnog racuna
		System.out.print("Unesite osnovni raèun: ");
		osnovniRacun = unos.nextDouble();

		// pitati korisnika za unos naponice u procentima
		System.out.print("Unesite napojnicu u procentima: ");
		procenat = unos.nextDouble();

		// izracunati napojnicu u KM
		napojnica = (osnovniRacun * procenat) / 100;

		// izracunati ukupan racun u KM
		ukupanRacun = osnovniRacun + napojnica;

		// ispisati poruke korisniku
		System.out.println("Napojnica iznosi: " + napojnica);
		System.out.println("Ukupan racun je: " + ukupanRacun);

		// zatvoriti Scanner
		unos.close();

	}

}
