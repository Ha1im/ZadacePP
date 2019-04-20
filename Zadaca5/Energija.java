package Zadaca5;

// importovati Scanner
import java.util.Scanner;

public class Energija {
	public static void main(String[] args) {

		// deklarisati varijable
		double pocetnaTemperatura;
		double zeljenaTemperatura;
		double vodaKg;
		double energija;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika za unos tezine vode u kg
		System.out.println("Unesite tezinu vode u kilogramima: ");
		vodaKg = unos.nextDouble();

		// pitati korisnika da unese pocetnu temperaturu
		System.out.println("Unesite pocetnu temperaturu: ");
		pocetnaTemperatura = unos.nextDouble();

		// pitati korisnika da unese zeljenu temperaturu
		System.out.println("Unesite zeljenu temperaturu:");
		zeljenaTemperatura = unos.nextDouble();

		// izracunati energiju koja je potrebna za zagrijavanje vode
		energija = vodaKg * (zeljenaTemperatura - pocetnaTemperatura) * 4184;

		// ispisati rezultat korisniku
		System.out.println("energije potrebno za zagrijavanje vode: " + energija + " joula.");

		// zatvoriti Scanner
		unos.close();
	}

}
