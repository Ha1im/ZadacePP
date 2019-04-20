package Bootcamp_Zadaca12;

public class TestProgram {

	public static void izracunajSeriju(int broj) {

		double rezultat = 0;

		System.out.println("i\tm(i)\n------------");

		for (int i = 1; i <= broj; i++) {

			for (int j = 1; j <= i; j++) {

				double djeljitelj = (j + 1);

				rezultat += j / djeljitelj;

			}

			System.out.printf("%d\t%.4f\n", i, rezultat);

			rezultat = 0;

		}

	}

	public static void main(String[] args) {

		izracunajSeriju(20);

	}

}
