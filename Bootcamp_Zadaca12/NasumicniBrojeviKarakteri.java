package Bootcamp_Zadaca12;

public class NasumicniBrojeviKarakteri {

	public static void nasumice() {

		final int LINE_BREAK = 10;

		System.out.println("Karakter | Broj\n");

		for (int i = 1; i <= 100; i++) {
			char karakter = (char) ((int) (Math.random() * 26) + 65);
			int broj = (int) (Math.random() * 1000);

			System.out.printf(" %s | %3d | ", karakter, broj);

			if (i % LINE_BREAK == 0)
				System.out.println();
		}
	}

	public static void main(String[] args) {

		nasumice();
	}
}
