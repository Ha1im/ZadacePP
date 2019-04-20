package Zadaca4;

import java.util.Scanner;

public class MakazePapirBunar {

	public static void main(String[] args) {

		int comp = (int) (Math.random() * 3);
		int unosKorisnika;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite 0(makaze), 1(papir), 2(bunar): ");
		unosKorisnika = unos.nextInt();

		if (unosKorisnika == 0 && comp == 0) {
			System.out.println("Izabrali ste makaze. Racunar je izabrao makaze. Nerijeseno je.");
		}

		else if (unosKorisnika == 0 && comp == 1) {
			System.out.println("Izabrali ste makaze. Racunar je izabrao papir. Vi ste pobijedili.");
		}

		else if (unosKorisnika == 0 && comp == 2) {
			System.out.println("Izabrali ste makaze. Racunar je izabrao bunar. Racunar je pobijedio.");
		}

		else if (unosKorisnika == 1 && comp == 0) {
			System.out.println("Izabrali ste papir. Racunar je izabrao makaze. Racunar je pobijedio.");
		}

		else if (unosKorisnika == 1 && comp == 1) {
			System.out.println("Izabrali ste papir. Racunar je izabrao papir. Nerijeseno je.");
		}

		else if (unosKorisnika == 1 && comp == 2) {
			System.out.println("Izabrali ste papir. Racunar je izabrao bunar. Vi ste pobijedili.");
		}

		else if (unosKorisnika == 2 && comp == 0) {
			System.out.println("Izabrali ste bunar. Racunar je izabrao makaze. Vi ste pobijedili.");
		}

		else if (unosKorisnika == 2 && comp == 1) {
			System.out.println("Izabrali ste bunar. Racunar je izabrao papir. Racunar je pobijedio.");
		}

		else if (unosKorisnika == 2 && comp == 2) {
			System.out.println("Izabrali ste bunar. Racunar je izabrao bunar. Nerijeseno je.");
		}
		unos.close();

	}
}
