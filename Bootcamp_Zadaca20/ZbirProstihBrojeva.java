package Bootcamp_Zadaca20;

public class ZbirProstihBrojeva {

	public static boolean isProstBroj(int broj) {

		for (int i = 2; i <= (Math.sqrt(broj)); i++) {
			if (broj % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		final int brojProstihBrojeva = 1000;
		int suma = 0;
		int counter = 0;

		for (int i = 1;; i++) {
			if (isProstBroj(i)) {
				suma += i;
				counter++;
			}

			if (counter >= brojProstihBrojeva)
				break;
		}

		System.out.println("Suma prvih " + brojProstihBrojeva + " prostih brojeva je " + suma);
	}
}
