package Zadaca5;

// importovati Scanner
import java.util.Scanner;

public class Dan {
	public static void main(String[] args) {

		// deklarisati varijable
		int korisnikovUnos1;
		int korisnikovUnos2;
		int buduciDan;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese danasnji dan
		System.out.print("Unesite danasnji dan: ");
		korisnikovUnos1 = unos.nextInt();

		// pitati korisnika da unese dan u buducnosti
		System.out.print("Unesite dan u buducnosti: ");
		korisnikovUnos2 = unos.nextInt();

		switch (korisnikovUnos1) {
		case 0:
			System.out.println("Danas je ponedjeljak.");
			break;
		case 1:
			System.out.println("Danas je utorak.");
			break;
		case 2:
			System.out.println("Danas je srijeda.");
			break;
		case 3:
			System.out.println("Danas je cetvrtak.");
			break;
		case 4:
			System.out.println("Danas je petak.");
			break;
		case 5:
			System.out.println("Danas je subota.");
			break;
		case 6:
			System.out.println("Danas je nedjelja.");
			break;
		}

		buduciDan = (korisnikovUnos1 + korisnikovUnos2) % 7;
		switch (buduciDan) {
		case 0:
			System.out.println("Dan u buducnosti je ponedjeljak.");
			break;
		case 1:
			System.out.println("Dan u buducnosti je utorak.");
			break;
		case 2:
			System.out.println("Dan u buducnosti je srijeda.");
			break;
		case 3:
			System.out.println("Dan u buducnosti je cetvrtak.");
			break;
		case 4:
			System.out.println("Dan u buducnosti je petak.");
			break;
		case 5:
			System.out.println("Dan u buducnosti je subota.");
			break;
		case 6:
			System.out.println("Dan u buducnosti je nedjelja.");
			break;
		}
		// zatvoriti Scanner
		unos.close();

	}

}
