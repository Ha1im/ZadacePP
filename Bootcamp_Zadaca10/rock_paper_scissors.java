package Bootcamp_Zadaca10;

import java.util.Scanner;

public class rock_paper_scissors {

	public static String rockPaperScissorGame(int number) {
		String odgovor = "";

		int nasumicniBroj = (int) (Math.random() * 3);

		if (nasumicniBroj == number) {
			odgovor = "nerijesen" + nasumicniBroj;
		} else if (nasumicniBroj == 0 && number == 1) {
			odgovor = "Vi" + nasumicniBroj;
		} else if (nasumicniBroj == 0 && number == 2) {
			odgovor = "racunar" + nasumicniBroj;
		} else if (nasumicniBroj == 1 && number == 0) {
			odgovor = "racunar" + nasumicniBroj;
		} else if (nasumicniBroj == 1 && number == 2) {
			odgovor = "Vi" + nasumicniBroj;
		} else if (nasumicniBroj == 2 && number == 0) {
			odgovor = "Vi" + nasumicniBroj;
		} else if (nasumicniBroj == 2 && number == 1) {
			odgovor = "racunar" + nasumicniBroj;
		}

		return odgovor;
	}

	public static void main(String[] args) {
		int broj, brojacPobjedaKorisnika = 0, brojacPobjedaRacunara = 0;

		String rezultat = "";

		Scanner unos = new Scanner(System.in);
		do {

			System.out.print("Izaberite (0-kamen, 1-papir, 2-makaze): ");
			broj = unos.nextInt();

			while (broj < 0 || broj > 2) {
				System.out.print("Pogresan unos! Pokusajte ponovo (0-kamen, 1-papir, 2-makaze): ");
				broj = unos.nextInt();
			}

			rezultat = rockPaperScissorGame(broj);

			char racunarBirao = rezultat.charAt(rezultat.length() - 1);

			if (broj == 0) {
				System.out.print("Vi ste izabrali kamen. ");
			} else if (broj == 1) {
				System.out.print("Vi ste izabrali papir. ");
			} else if (broj == 2) {
				System.out.print("Vi ste izabrali makaze. ");
			}

			if (racunarBirao == '0') {
				System.out.print("Racunar je izabrao kamen. ");
			} else if (racunarBirao == '1') {
				System.out.print("Racunar je izabrao papir. ");
			} else if (racunarBirao == '2') {
				System.out.print("Racunar je izabrao makaze. ");
			}

			rezultat = rezultat.replace(rezultat.charAt(rezultat.length() - 1), ' ');

			if (rezultat.equals("Vi ")) {
				System.out.print("Pobjedili ste Vi.\n\n");
				brojacPobjedaKorisnika++;
				brojacPobjedaRacunara = 0;
			} else if (rezultat.equals("nerijesen ")) {
				System.out.print("Nerijeseno je.\n\n");
				brojacPobjedaKorisnika = 0;
				brojacPobjedaRacunara = 0;
			} else if (rezultat.equals("racunar ")) {
				System.out.print("Pobijedio je racunar.\n\n");
				brojacPobjedaKorisnika = 0;
				brojacPobjedaRacunara++;
			}

		} while (brojacPobjedaKorisnika != 2 && brojacPobjedaRacunara != 2);

		unos.close();
	}

}
