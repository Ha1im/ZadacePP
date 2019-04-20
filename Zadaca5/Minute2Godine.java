package Zadaca5;

// importovati Scanner
import java.util.Scanner;

public class Minute2Godine {
	public static void main(String[] args) {

		// deklarisati varijable
		int minuta;
		int sat;
		int dan;
		int godina;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj minuta
		System.out.println("Unesite broj minuta: ");
		minuta = unos.nextInt();

		// izracunati sate
		sat = minuta / 60;

		// izracunati dane
		dan = sat / 24;

		// izracunati godine
		godina = dan / 365;

		// ispisati poruku korisniku
		System.out.println(minuta + " minuta je " + godina + " godina ili " + dan + " dana. ");
		unos.close();

		// provjeriti da li je dobivena godina prestupna
		if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
			System.out.println("Godina je prijestupna.");

		}

		else {
			System.out.println("Godina nije prestupna.");
		}

		// zatvoriti Scanner
		unos.close();

	}

}
